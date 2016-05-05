/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import beans.DBConnection;
import entityclasses.ISMSPersistentManager;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class GeneralUtilities implements Serializable {

    public static void clearsession() {
        try {
            ISMSPersistentManager.instance().disposePersistentManager();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void clearCache() {
        try {
            ISMSPersistentManager.instance().getSession().clear();
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictEntityRegions();
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictCollectionRegions();
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictDefaultQueryRegion();
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictQueryRegions();

        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Calendar addBusinessDate(Calendar cal, int numBusinessDays) {
        while (numBusinessDays > 0) {
            cal.add(Calendar.DATE, 1);
            numBusinessDays -= 1;
            if (cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7) {
                numBusinessDays += 1;
            }
        }
        return cal;
    }

    public String colorExpiredDate(Date aDate) {
        try {
            System.out.println(this.getCurrentDate().toString() + ":" + aDate.toString());
            Date aCurrentDate = this.getCurrentDate();
            if (aDate.compareTo(aCurrentDate) == 0 || aDate.compareTo(aCurrentDate) > 0) {
                return "red";
            } else {
                return "#F2F5F7";
            }
        } catch (NullPointerException npe) {
            return "white";
        }
    }

    public static SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("ddMMyyyyHmmss");
    }

    public long getDaysBetweenTwoDates(Date aUpperDate, Date aLowerDate, String aMode) {//inc0,inc1.inc2
        Date d1 = null;
        Date d2 = null;
        long diffDays = 0;
        try {
            d1 = aUpperDate;
            d2 = aLowerDate;
            //in milliseconds
            long diff = d1.getTime() - d2.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000);
            if (aMode.equals("inc0")) {
                diffDays = diffDays + 0;
            } else if (aMode.equals("inc1")) {
                diffDays = diffDays + 1;
            } else if (aMode.equals("inc2")) {
                diffDays = diffDays + 2;
            } else {
                diffDays = 0;
            }
        } catch (Exception e) {
            diffDays = 0;
            System.err.println(e.getMessage());
        }
        return diffDays;
    }

    public long getDateDifference(Date lowerDate, Date upperDate, String returnType) {
        DateTime dateTimeFrom = new DateTime(lowerDate);
        DateTime dateTimeTo = new DateTime(upperDate);
        long returnValue = 0;
        Period period = new Period(dateTimeFrom, dateTimeTo);
        if (returnType.equals("years")) {
            returnValue = period.getYears();
        } else if (returnType.equals("months")) {
            returnValue = period.getMonths();
        } else if (returnType.equals("weeks")) {
            returnValue = period.getWeeks();
        } else if (returnType.equals("days")) {
            returnValue = period.getDays();
        }
        return returnValue;
    }

    private Date CurrentDate;

    /**
     * @return the CurrentDate
     */
    public Date getCurrentDate() {
        CurrentDate = new Date();
        return CurrentDate;
    }

    /**
     * @param CurrentDate the CurrentDate to set
     */
    public void setCurrentDate(Date CurrentDate) {
        this.CurrentDate = CurrentDate;
    }

    public String checkdoctype(String docurl) {
        if (docurl.toLowerCase().contains(".jpg") || docurl.toLowerCase().contains(".png") || docurl.toLowerCase().contains(".jpeg") || docurl.toLowerCase().contains(".gif")) {
            return "image";
        } else if (docurl.toLowerCase().contains(".pdf") || docurl.toLowerCase().contains(".PDF")) {
            return "pdf";
        } else if (docurl.toLowerCase().contains(".doc") || docurl.toLowerCase().contains(".docx")) {
            return "word";
        } else if (docurl.toLowerCase().contains(".xls") || docurl.toLowerCase().contains(".xlsx")) {
            return "excel";
        } else {
            return "";
        }
    }

    public void refresh() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        ViewHandler viewHandler = application.getViewHandler();
        UIViewRoot viewRoot = viewHandler.createView(context, context
                .getViewRoot().getViewId());
        context.setViewRoot(viewRoot);
        context.renderResponse(); //Optional
    }

    public void cleanCurrentStaffDocuments() {
        String sql = "{call sp_clean_current_staff_documents()}";
        try (
                Connection conn = DBConnection.getMySQLConnection();
                CallableStatement cs = conn.prepareCall(sql);) {
            cs.executeUpdate();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
