/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Group_right;
import entityclasses.ISMSPersistentManager;
import entityclasses.User_detail;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import utilities.AESencrp;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;
    private boolean isloggedin = false;
    private List<Group_right> group_rights;

    private String action = "login";

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isIsloggedin() {
        return isloggedin;
    }

    public void setIsloggedin(boolean isloggedin) {
        this.isloggedin = isloggedin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private User_detail user_detail;

    public LoginBean() {
//        try {
//            user_detail = User_detail.getUser_detailByORMID(2);
//        } catch (PersistentException ex) {
//            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public User_detail getUser_detail() {
        return user_detail;
    }

    public void setUser_detail(User_detail user_detail) {
        this.user_detail = user_detail;
    }

    public String login() {
        user_detail = null;
        setIsloggedin(false);
        try {
            user_detail = User_detail.loadUser_detailByQuery("username='" + username + "' and password='" + AESencrp.encrypt(password) + "'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(NavigationBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (user_detail != null) {
            setIsloggedin(true);
        } else {
            setIsloggedin(false);
        }

        //get group_rights for this User
        try {
            this.setGroup_rights(new Group_rightBean().getActiveGroup_rightListByUser(user_detail));
        } catch (NullPointerException npe) {
            this.setGroup_rights(null);
        }

        if (isloggedin) {
            setIsloggedin(true);
            messageString = "";
            //clean current staff docuemnts
            new GeneralUtilities().cleanCurrentStaffDocuments();
            return "welcome?faces-redirect=true";
        } else {
            messageString = "Invalid Login Details Submitted!";
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid Login Details", "Invalid Login Details"));
            return "login?faces-redirect=true";
        }
    }

    private String newpassword;
    private String retypenewpassword;

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getRetypenewpassword() {
        return retypenewpassword;
    }

    public void setRetypenewpassword(String retypenewpassword) {
        this.retypenewpassword = retypenewpassword;
    }

    public String changepassword() {
        user_detail = null;
        setIsloggedin(false);
        try {
            user_detail = User_detail.loadUser_detailByQuery("username='" + username + "' and password='" + AESencrp.encrypt(password) + "'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(NavigationBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (user_detail != null) {
            if (!newpassword.equals(retypenewpassword)) {
//                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "New Password does not match with Re-entered Password!");
//                RequestContext.getCurrentInstance().showMessageInDialog(message);
                messageString = "New Password does not match with Re-entered Password!";
                action = "changepw";
                return "login?faces-redirect=true";
            }
            if (newpassword.length() < 6) {
//                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Contact Name!");
//                RequestContext.getCurrentInstance().showMessageInDialog(message);
                messageString = "New Password should be atleast 6 characters";
                action = "changepw";
                return "login?faces-redirect=true";
            }
            try {
                PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
                user_detail.setPassword(AESencrp.encrypt(newpassword));
                user_detail.setEdit_date(null);
                user_detail.setEdit_user(user_detail);
                user_detail.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(user_detail);
                t.commit();
            } catch (PersistentException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            logout();
            messageString = "";
            action = "login";
            return "login?faces-redirect=true";
        } else {
            messageString = "Invalid Username or Password!";
            action = "changepw";
            return "login?faces-redirect=true";
        }

    }

    private String messageString = "";

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }

    public String logout() {
        setUsername("");
        setPassword("");
        setIsloggedin(false);
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }

    /**
     * @return the group_rights
     */
    public List<Group_right> getGroup_rights() {
        return group_rights;
    }

    /**
     * @param group_rights the group_rights to set
     */
    public void setGroup_rights(List<Group_right> group_rights) {
        this.group_rights = group_rights;
    }

    public boolean IsAllowed(String function_name, String role) {
        try {
            return new Group_rightBean().IsUserGroupsFunctionAccessAllowed(this.getUser_detail(), this.getGroup_rights(), function_name, role) != 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
