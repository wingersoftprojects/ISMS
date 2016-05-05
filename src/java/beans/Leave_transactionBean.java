/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Company;
import entityclasses.Leave_transaction;
import entityclasses.ISMSPersistentManager;
import entityclasses.Leave_type;
import entityclasses.Staff;
import entityclasses.Staff_type;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import utilities.GeneralUtilities;
import utilities.GlobalSettingsBean;
import utilities.Notify;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Leave_transactionBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    private String SummaryBy;
    private BarChartModel leaveTransactionModel;
    private Leave_type leave_type;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Leave_transaction leave_transaction;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    private List<Leave_transaction> leave_transactionList;

    @PostConstruct
    public void init() {
        try {
            leave_transactionList = null;
            leave_transactionList = Leave_transaction.queryLeave_transaction(null, "leave_transaction_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_transactionBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

    }

    public List<Leave_transaction> getLeave_transactionList() {
        if (leave_transactionList == null) {
            init();
        }
        return leave_transactionList;
    }

    public void setLeave_transactionList(List<Leave_transaction> leave_transactionList) {
        this.leave_transactionList = leave_transactionList;
    }

    public Leave_transactionBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Leave_transaction getLeave_transaction() {
        return leave_transaction;
    }

    public void setLeave_transaction(Leave_transaction leave_transaction) {
        this.leave_transaction = leave_transaction;
    }

    public void cancel() {
        if (leave_transaction != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(leave_transaction);
            } catch (PersistentException ex) {
                Logger.getLogger(Leave_transactionBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.leave_transaction = null;
        formstate = "view";
    }

    public void view(Leave_transaction object) {
        this.leave_transaction = object;
        formstate = "view";
    }

    public void delete(Leave_transaction object) {
        this.leave_transaction = object;
    }

    public void add() {
        leave_transaction = new Leave_transaction();
        formstate = "add";
    }

    public void edit(Leave_transaction object) {
        this.leave_transaction = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (leave_transaction.getLeave_transaction_id() > 0) {
                leave_transaction.setEdit_user(loginBean.getUser_detail());
                leave_transaction.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(leave_transaction);
            } else {
                leave_transaction.setAdd_date(new Timestamp(new Date().getTime()));
                leave_transaction.setAdd_user(loginBean.getUser_detail());
                leave_transaction.save();
            }
            t.commit();

            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(leave_transaction);
            leave_transaction = null;
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_transactionBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(leave_transaction);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(leave_transaction);
            this.leave_transaction = null;
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_transactionBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public int getLeaveDaysAccumSinceJoin(Staff aStaff) {
        //get start date
        //get current date
        //get days/months btn start date and current date
        long YearsBtnJoinDateAndNow = 0;
        long MonthsBtnJoinDateAndNow = 0;
        int DaysAccum = 0;
        if (null == aStaff) {
            DaysAccum = 0;
        } else {
            try {
                YearsBtnJoinDateAndNow = new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "years");
            } catch (NullPointerException npe) {
                YearsBtnJoinDateAndNow = 0;
            }
            try {
                MonthsBtnJoinDateAndNow = new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "months");
            } catch (NullPointerException npe) {
                MonthsBtnJoinDateAndNow = 0;
            }
            //get days accumulated
            DaysAccum = (int) Math.floor(((YearsBtnJoinDateAndNow * 12) + MonthsBtnJoinDateAndNow) * GlobalSettingsBean.getLEAVE_DAYS_ACCUM_EACH_MONTH());
        }
        return DaysAccum;
    }

    public int getLeaveDaysTakenSinceJoin(Staff aStaff) {
        int TotalDaysTaken = 0;
        if (null == aStaff) {
            TotalDaysTaken = 0;
        } else {
            if (null == aStaff) {
                TotalDaysTaken = 0;
            } else {
                List<Leave_transaction> staffLeave_transactionList = null;
                try {
                    staffLeave_transactionList = Leave_transaction.queryLeave_transaction("staff_id=" + aStaff.getStaff_id(), null);
                } catch (PersistentException | NullPointerException ex) {
                    Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
                }
                int ListItemIndex = 0;
                int ListItemNo = staffLeave_transactionList.size();
                while (ListItemIndex < ListItemNo) {
                    TotalDaysTaken = TotalDaysTaken + staffLeave_transactionList.get(ListItemIndex).getDays_taken();
                    ListItemIndex = ListItemIndex + 1;
                }
            }
        }
        return TotalDaysTaken;
    }

    public int getLeaveDaysAvailableNow(Staff aStaff) {
        //available=totalAccum-totalTaken
        int LeaveDaysAvailable = 0;
        if (null == aStaff) {
            LeaveDaysAvailable = 0;
        } else {
            try {
                LeaveDaysAvailable = this.getLeaveDaysAccumSinceJoin(aStaff) - this.getLeaveDaysTakenSinceJoin(aStaff);
            } catch (NullPointerException npe) {
                LeaveDaysAvailable = 0;
            }
        }
        return LeaveDaysAvailable;
    }

    public int getLeaveDaysTakableNow(Staff aStaff) {
        //get the leave phase for this person i.e Y1Q1,Y1Q2,Y1Q3,Y2,Y2_ABOVE
        int YearsDiff = 0;
        int MonthsDiff = 0;
        int WeeksDiff = 0;
        int DaysDiff = 0;
        int LeaveDaysAvailableNow = 0;
        int DaysTakable = 0;
        if (aStaff == null) {

        } else {
            //get the date diffs
            try {
                YearsDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "years");
            } catch (NullPointerException npe) {
                YearsDiff = 0;
            }
            try {
                MonthsDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "months");
            } catch (NullPointerException npe) {
                MonthsDiff = 0;
            }
            try {
                WeeksDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "weeks");
            } catch (NullPointerException npe) {
                WeeksDiff = 0;
            }
            try {
                DaysDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "days");
            } catch (NullPointerException npe) {
                DaysDiff = 0;
            }

            LeaveDaysAvailableNow = this.getLeaveDaysAvailableNow(aStaff);
            if (YearsDiff >= 2 && LeaveDaysAvailableNow >= GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y2_ABOVE()) {//spent more than 2 years and above
                DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y2_ABOVE();
            } else {//less than 2 years
                if (YearsDiff >= 1 && LeaveDaysAvailableNow >= GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q3()) {//Q3 for equal or more than a year
                    DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q3();
                } else if (MonthsDiff >= 8 && LeaveDaysAvailableNow >= GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q2()) {//Q2 for equal or more than 8 months
                    DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q2();
                } else if (MonthsDiff >= 4 && LeaveDaysAvailableNow >= GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q1()) {//Q1 for equal or more than 4 months
                    DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q1();
                } else {//not made 4 months
                    DaysTakable = 0;
                }
            }
        }
        return DaysTakable;
    }

    public int getLeaveDaysTakableNowV2(Staff aStaff) {
        //get the leave phase for this person i.e Y1Q1,Y1Q2,Y1Q3,Y2,Y2_ABOVE
        int YearsDiff = 0;
        int MonthsDiff = 0;
        int WeeksDiff = 0;
        int DaysDiff = 0;
        int DaysTakable = 0;
        int MonthsToFirstLeaveY1 = 1;
        int MonthsToFirstLeaveY2 = 6;
        int LeaveYearsWithinOrAbove = 1;//1 Within, 2 ABove

        if (aStaff == null) {

        } else {
            //get the date diffs
            try {
                YearsDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "years");
            } catch (NullPointerException npe) {
                YearsDiff = 0;
            }
            try {
                MonthsDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "months");
            } catch (NullPointerException npe) {
                MonthsDiff = 0;
            }
            try {
                WeeksDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "weeks");
            } catch (NullPointerException npe) {
                WeeksDiff = 0;
            }
            try {
                DaysDiff = (int) new GeneralUtilities().getDateDifference(aStaff.getJoin_date(), new Date(), "days");
            } catch (NullPointerException npe) {
                DaysDiff = 0;
            }

            if (LeaveYearsWithinOrAbove == 1) {//Within
                if (YearsDiff >= 1 && (YearsDiff+1)%2==0) {
                    if (MonthsDiff >= MonthsToFirstLeaveY2) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y2_ABOVE();
                    } else {
                        DaysTakable = 0;
                    }
                } else if (YearsDiff == 0 || (YearsDiff+1)%2!=0) {
                    if (MonthsDiff >= 8) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q3();
                    } else if (MonthsDiff >= 4) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q2();
                    } else if (MonthsDiff >= 0 && MonthsDiff >= MonthsToFirstLeaveY1) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q1();
                    } else {
                        DaysTakable = 0;
                    }
                } else {
                    DaysTakable = 0;
                }
            }

            if (LeaveYearsWithinOrAbove == 2) {//Above
                if (YearsDiff >= 2 && YearsDiff%2==0) {
                    if (MonthsDiff >= MonthsToFirstLeaveY2) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y2_ABOVE();
                    } else {
                        DaysTakable = 0;
                    }
                } else if (YearsDiff >= 1 && YearsDiff%2!=0) {
                    if (MonthsDiff >= 8) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q3();
                    } else if (MonthsDiff >= 4) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q2();
                    } else if (MonthsDiff >= 0 && MonthsDiff >= MonthsToFirstLeaveY1) {
                        DaysTakable = GlobalSettingsBean.getLEAVE_DAYS_TAKABLE_Y1Q1();
                    } else {
                        DaysTakable = 0;
                    }
                } else {
                    DaysTakable = 0;
                }
            }
        }
        return DaysTakable;
    }

    private List<Leave_transaction> staff_leave_transactionList;

    public List<Leave_transaction> getStaff_leave_transactionList() {
        try {
            staff_leave_transactionList = null;
            staff_leave_transactionList = Leave_transaction.queryLeave_transaction("staff_id=" + staff.getStaff_id(), "leave_transaction_id desc");

        } catch (PersistentException ex) {
            Logger.getLogger(Leave_transactionBean.class
                    .getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance()
                    .addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staff_leave_transactionList;
    }

    public void setStaff_leave_transactionList(List<Leave_transaction> staff_leave_transactionList) {
        this.staff_leave_transactionList = staff_leave_transactionList;
    }

    public List<Leave_transaction> getLeave_transactionListByStaff(Staff aStaff) {

        try {
            staff_leave_transactionList = null;
            staff_leave_transactionList = Leave_transaction.queryLeave_transaction("staff_id=" + aStaff.getStaff_id(), "leave_year desc,leave_quarter desc");
        } catch (PersistentException | NullPointerException ex) {
            //Logger.getLogger(Leave_transactionBean.class.getName()).log(Level.SEVERE, null, ex);
            //FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staff_leave_transactionList;
    }

    private Staff staff;

    /**
     * @return the staff
     */
    public Staff getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    /**
     * @return the SummaryBy
     */
    public String getSummaryBy() {
        return SummaryBy;
    }

    /**
     * @param SummaryBy the SummaryBy to set
     */
    public void setSummaryBy(String SummaryBy) {
        this.SummaryBy = SummaryBy;
    }

    /**
     * @return the leaveTransactionModel
     */
    public BarChartModel getLeaveTransactionModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel(this.SummaryBy);
        if (this.SummaryBy.equals("Leave Type")) {
            try {
                String qString = "SELECT l.leave_type,count(l.leave_type) FROM Leave_transaction l "
                        + "GROUP BY l.leave_type";
                List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
                for (Object[] resultElement : result) {
                    Leave_type aLeave_type = (Leave_type) resultElement[0];
                    long number = (long) resultElement[1];
                    ser1.set(aLeave_type.getLeave_type_name(), number);

                }
            } catch (PersistentException | NullPointerException ex) {
                Logger.getLogger(StaffBean.class
                        .getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance()
                        .addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        } else if (this.SummaryBy.equals("Leave Year")) {
            try {
                String qString = "SELECT l.leave_year,count(l.leave_year) FROM Leave_transaction l "
                        + "GROUP BY l.leave_year";
                List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
                for (Object[] resultElement : result) {
                    int lyear = (int) resultElement[0];
                    long number = (long) resultElement[1];
                    ser1.set(lyear, number);

                }
            } catch (PersistentException | NullPointerException ex) {
                Logger.getLogger(StaffBean.class
                        .getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance()
                        .addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }

        model.addSeries(ser1);

        leaveTransactionModel = model;
        leaveTransactionModel.setLegendPosition("e");
        leaveTransactionModel.setShowPointLabels(true);
        leaveTransactionModel.getAxes().put(AxisType.X, new CategoryAxis(this.SummaryBy));
        Axis yAxis = leaveTransactionModel.getAxis(AxisType.Y);
        yAxis = leaveTransactionModel.getAxis(AxisType.Y);
        yAxis.setLabel("Count");
        yAxis.setMin(0);
        yAxis.setMax(500);
        return leaveTransactionModel;
    }

    /**
     * @param leaveTransactionModel the leaveTransactionModel to set
     */
    public void setLeaveTransactionModel(BarChartModel leaveTransactionModel) {
        this.leaveTransactionModel = leaveTransactionModel;
    }

    /**
     * @return the leave_type
     */
    public Leave_type getLeave_type() {
        return leave_type;
    }

    /**
     * @param leave_type the leave_type to set
     */
    public void setLeave_type(Leave_type leave_type) {
        this.leave_type = leave_type;
    }

}
