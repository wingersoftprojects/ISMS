/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import beans.DBConnection;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author btwesigye
 */
@ManagedBean
@SessionScoped
public class GlobalSettingsBean implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private static double LEAVE_DAYS_ACCUM_EACH_MONTH;// = 2.5;
    private static int LEAVE_DAYS_TAKABLE_Y1Q1;// = 7;
    private static int LEAVE_DAYS_TAKABLE_Y1Q2;// = 14;
    private static int LEAVE_DAYS_TAKABLE_Y1Q3;// = 7;
    private static int LEAVE_DAYS_TAKABLE_Y2_ABOVE;// = 30;
    private static int LEAVE_DAYS_INCLUDE_WEEKEND;// = 1;//1-Yes and 0-No 
    private static String HOST;
    private static String DATABASE;
    private static String USER;
    private static String PASSWORD;
    private static String DOCROOT;
    private static String DOCROOT_CONVERT;

    /**
     * Creates a new instance of GlobalSettingsBean
     */
    public GlobalSettingsBean() {
    }
    
     public static void readConnectionConfigurations() throws FileNotFoundException {
        ResourceBundle properties = ResourceBundle.getBundle("configs.ConfigFile");
        GlobalSettingsBean.setHOST(properties.getString("HOST"));
        GlobalSettingsBean.setDATABASE(properties.getString("DATABASE"));
        GlobalSettingsBean.setUSER(properties.getString("USER"));
        GlobalSettingsBean.setPASSWORD(properties.getString("PASSWORD"));
        GlobalSettingsBean.setDOCROOT(properties.getString("DOCROOT"));
        GlobalSettingsBean.setDOCROOT_CONVERT(properties.getString("DOCROOT_CONVERT"));
        GlobalSettingsBean.setLEAVE_DAYS_ACCUM_EACH_MONTH(Double.parseDouble(properties.getString("LEAVE_DAYS_ACCUM_EACH_MONTH")));
        GlobalSettingsBean.setLEAVE_DAYS_TAKABLE_Y1Q1(Integer.parseInt(properties.getString("LEAVE_DAYS_TAKABLE_Y1Q1")));
        GlobalSettingsBean.setLEAVE_DAYS_TAKABLE_Y1Q2(Integer.parseInt(properties.getString("LEAVE_DAYS_TAKABLE_Y1Q2")));
        GlobalSettingsBean.setLEAVE_DAYS_TAKABLE_Y1Q3(Integer.parseInt(properties.getString("LEAVE_DAYS_TAKABLE_Y1Q3")));
        GlobalSettingsBean.setLEAVE_DAYS_TAKABLE_Y2_ABOVE(Integer.parseInt(properties.getString("LEAVE_DAYS_TAKABLE_Y2_ABOVE")));
        GlobalSettingsBean.setLEAVE_DAYS_INCLUDE_WEEKEND(Integer.parseInt(properties.getString("LEAVE_DAYS_INCLUDE_WEEKEND")));
        DBConnection.setMySQL_DB_HOST_IP_OR_NAME(GlobalSettingsBean.getHOST());
        DBConnection.setMySQL_DB_NAME(GlobalSettingsBean.getDATABASE());
        DBConnection.setMySQL_USER(GlobalSettingsBean.getUSER());
        DBConnection.setMySQL_PASSWORD(GlobalSettingsBean.getPASSWORD());
    }
     
     /**
     * @return the DOCROOT_CONVERT
     */
    public static String getDOCROOT_CONVERT() {
        return DOCROOT_CONVERT;
    }

    /**
     * @param aDOCROOT_CONVERT the DOCROOT_CONVERT to set
     */
    public static void setDOCROOT_CONVERT(String aDOCROOT_CONVERT) {
        DOCROOT_CONVERT = aDOCROOT_CONVERT;
    }

    /**
     * @return the HOST
     */
    public static String getHOST() {
        return HOST;
    }

    /**
     * @param aHOST the HOST to set
     */
    public static void setHOST(String aHOST) {
        HOST = aHOST;
    }

    /**
     * @return the DATABASE
     */
    public static String getDATABASE() {
        return DATABASE;
    }

    /**
     * @param aDATABASE the DATABASE to set
     */
    public static void setDATABASE(String aDATABASE) {
        DATABASE = aDATABASE;
    }

    /**
     * @return the USER
     */
    public static String getUSER() {
        return USER;
    }

    /**
     * @param aUSER the USER to set
     */
    public static void setUSER(String aUSER) {
        USER = aUSER;
    }

    /**
     * @return the PASSWORD
     */
    public static String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * @param aPASSWORD the PASSWORD to set
     */
    public static void setPASSWORD(String aPASSWORD) {
        PASSWORD = aPASSWORD;
    }

    /**
     * @return the DOCROOT
     */
    public static String getDOCROOT() {
        return DOCROOT;
    }

    /**
     * @param aDOCROOT the DOCROOT to set
     */
    public static void setDOCROOT(String aDOCROOT) {
        DOCROOT = aDOCROOT;
    }

    /**
     * @return the LEAVE_DAYS_ACCUM_EACH_MONTH
     */
    public static double getLEAVE_DAYS_ACCUM_EACH_MONTH() {
        return LEAVE_DAYS_ACCUM_EACH_MONTH;
    }

    /**
     * @param aLEAVE_DAYS_ACCUM_EACH_MONTH the LEAVE_DAYS_ACCUM_EACH_MONTH to
     * set
     */
    public static void setLEAVE_DAYS_ACCUM_EACH_MONTH(double aLEAVE_DAYS_ACCUM_EACH_MONTH) {
        LEAVE_DAYS_ACCUM_EACH_MONTH = aLEAVE_DAYS_ACCUM_EACH_MONTH;
    }

    /**
     * @return the LEAVE_DAYS_TAKABLE_Y1Q1
     */
    public static int getLEAVE_DAYS_TAKABLE_Y1Q1() {
        return LEAVE_DAYS_TAKABLE_Y1Q1;
    }

    /**
     * @param aLEAVE_DAYS_TAKABLE_Y1Q1 the LEAVE_DAYS_TAKABLE_Y1Q1 to set
     */
    public static void setLEAVE_DAYS_TAKABLE_Y1Q1(int aLEAVE_DAYS_TAKABLE_Y1Q1) {
        LEAVE_DAYS_TAKABLE_Y1Q1 = aLEAVE_DAYS_TAKABLE_Y1Q1;
    }

    /**
     * @return the LEAVE_DAYS_TAKABLE_Y1Q2
     */
    public static int getLEAVE_DAYS_TAKABLE_Y1Q2() {
        return LEAVE_DAYS_TAKABLE_Y1Q2;
    }

    /**
     * @param aLEAVE_DAYS_TAKABLE_Y1Q2 the LEAVE_DAYS_TAKABLE_Y1Q2 to set
     */
    public static void setLEAVE_DAYS_TAKABLE_Y1Q2(int aLEAVE_DAYS_TAKABLE_Y1Q2) {
        LEAVE_DAYS_TAKABLE_Y1Q2 = aLEAVE_DAYS_TAKABLE_Y1Q2;
    }

    /**
     * @return the LEAVE_DAYS_TAKABLE_Y1Q3
     */
    public static int getLEAVE_DAYS_TAKABLE_Y1Q3() {
        return LEAVE_DAYS_TAKABLE_Y1Q3;
    }

    /**
     * @param aLEAVE_DAYS_TAKABLE_Y1Q3 the LEAVE_DAYS_TAKABLE_Y1Q3 to set
     */
    public static void setLEAVE_DAYS_TAKABLE_Y1Q3(int aLEAVE_DAYS_TAKABLE_Y1Q3) {
        LEAVE_DAYS_TAKABLE_Y1Q3 = aLEAVE_DAYS_TAKABLE_Y1Q3;
    }

    /**
     * @return the LEAVE_DAYS_TAKABLE_Y2_ABOVE
     */
    public static int getLEAVE_DAYS_TAKABLE_Y2_ABOVE() {
        return LEAVE_DAYS_TAKABLE_Y2_ABOVE;
    }

    /**
     * @param aLEAVE_DAYS_TAKABLE_Y2_ABOVE the LEAVE_DAYS_TAKABLE_Y2_ABOVE to
     * set
     */
    public static void setLEAVE_DAYS_TAKABLE_Y2_ABOVE(int aLEAVE_DAYS_TAKABLE_Y2_ABOVE) {
        LEAVE_DAYS_TAKABLE_Y2_ABOVE = aLEAVE_DAYS_TAKABLE_Y2_ABOVE;
    }

    /**
     * @return the LEAVE_DAYS_INCLUDE_WEEKEND
     */
    public static int getLEAVE_DAYS_INCLUDE_WEEKEND() {
        return LEAVE_DAYS_INCLUDE_WEEKEND;
    }

    /**
     * @param aLEAVE_DAYS_INCLUDE_WEEKEND the LEAVE_DAYS_INCLUDE_WEEKEND to set
     */
    public static void setLEAVE_DAYS_INCLUDE_WEEKEND(int aLEAVE_DAYS_INCLUDE_WEEKEND) {
        LEAVE_DAYS_INCLUDE_WEEKEND = aLEAVE_DAYS_INCLUDE_WEEKEND;
    }

}
