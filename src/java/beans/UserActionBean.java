/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserActionBean implements Serializable {

    private List<UserAction> userActions;

    /**
     * @param aUserName
     * @param aYear
     * @return the actions
     */
    public List<UserAction> getUserActions(String aUserName, int aYear, int aMonth, int aDay) throws FileNotFoundException {
        String WhereStr = "1=1";
        userActions = new ArrayList();

        if (aUserName.length() > 0) {
            WhereStr = WhereStr + " and username='" + aUserName + "'";
        }
        if (aYear > 0) {
            WhereStr = WhereStr + " and year=" + aYear;
        }
        if (aMonth > 0) {
            WhereStr = WhereStr + " and month=" + aMonth;
        }
        if (aDay > 0) {
            WhereStr = WhereStr + " and day=" + aDay;
        }

        String sql = "select username,category,object,action,year,month,day,count(*) as records FROM view_user_action "
                + "WHERE " + WhereStr + " "
                + "GROUP BY username,category,object,action,year,month,day "
                + "ORDER BY username,category,object,action,year DESC,month DESC,day DESC";
        ResultSet rs = null;
        userActions = new ArrayList<UserAction>();
        try (
                Connection conn = DBConnection.getMySQLConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            rs = ps.executeQuery();
            while (rs.next()) {
                UserAction userAction=new UserAction();
                userAction.setUsername1(rs.getString("username"));
                userAction.setCategory1(rs.getString("category"));
                userAction.setObject1(rs.getString("object"));
                userAction.setAction1(rs.getString("action"));
                userAction.setYear1(rs.getInt("year"));
                userAction.setMonth1(rs.getInt("month"));
                userAction.setDay1(rs.getInt("day"));
                userAction.setRecords1(rs.getLong("records"));
                userActions.add(userAction);
            }
        } catch (SQLException | NullPointerException se) {
            System.err.println(se.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        return userActions;
    }

    /**
     * @return the userActions
     */
    public List<UserAction> getUserActions() {
        return userActions;
    }

    /**
     * @param userActions the userActions to set
     */
    public void setUserActions(List<UserAction> userActions) {
        this.userActions = userActions;
    }

}
