/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entityclasses.Group_user;
import entityclasses.ISMSPersistentManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
public class InnerJoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            List<Group_user> group_userList = (List<Group_user>) ISMSPersistentManager.instance().getSession().createQuery("select gu from Group_user gu INNER JOIN gu.user_detail INNER JOIN gu.group_detail where gu.group_detail.group_name=''").list();
        } catch (PersistentException ex) {
            Logger.getLogger(InnerJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
