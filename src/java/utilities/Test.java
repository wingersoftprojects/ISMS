/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entityclasses.Staff;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bajuna
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d2=new Date(2015, 2, 16);
        Date d1=new Date(2010, 1, 1);
        
        System.out.println(new GeneralUtilities().getDateDifference(d1, d2, "years"));
        System.out.println(new GeneralUtilities().getDateDifference(d1, d2, "months"));
        System.out.println(new GeneralUtilities().getDateDifference(d1, d2, "weeks"));
        System.out.println(new GeneralUtilities().getDateDifference(d1, d2, "days"));

    }
//<property name="hibernate.connection.isolation">2</property>
}
