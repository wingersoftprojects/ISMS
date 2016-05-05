/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Group_user;
import entityclasses.ISMSPersistentManager;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Group_userBean implements Serializable {

    private Group_user group_user;
    private String formstate;
    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }
private List<Group_user> group_userList;

    public List<Group_user> getGroup_userList() {
        try {
            group_userList = null;
            group_userList = Group_user.queryGroup_user(null, "group_user_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return group_userList;
    }

    public void setGroup_userList(List<Group_user> group_userList) {
        this.group_userList = group_userList;
    }
    public Group_userBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Group_user getGroup_user() {
        return group_user;
    }

    public void setGroup_user(Group_user group_user) {
        this.group_user = group_user;
    }

    public void cancel() {
        if (group_user != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(group_user);
            } catch (PersistentException ex) {
                Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.group_user = null;
        formstate = "view";
    }

    public void view(Group_user object) {
        this.group_user = object;
        formstate = "view";
    }

    public void delete(Group_user object) {
        this.group_user = object;
    }

    public void add() {
        group_user = new Group_user();
        formstate = "add";
    }

    public void edit(Group_user object) {
        this.group_user = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (group_user.getGroup_user_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(group_user);
            } else {
                group_user.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(group_user);
            group_user = null;
            //listBean.refreshlists("Group_user");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(group_user);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(group_user);
            this.group_user = null;
            //listBean.refreshlists("Group_user");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
