/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Staff;
import entityclasses.User_detail;
import entityclasses.ISMSPersistentManager;
import java.io.Serializable;
import java.sql.Timestamp;
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
import utilities.AESencrp;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class User_detailBean implements Serializable {

    private User_detail user_detail;
    private String formstate;
    private List<Staff> staffList;
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

    public List<Staff> getStaffList() {
        try {
            staffList = null;
            staffList = Staff.queryStaff(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
    private List<User_detail> user_detailList;

    @PostConstruct
    public void init() {
        try {
            user_detailList = null;
            user_detailList = User_detail.queryUser_detail(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

    }

    public List<User_detail> getUser_detailList() {
        if (user_detailList == null) {
            init();
        }
        return user_detailList;
    }

    public void setUser_detailList(List<User_detail> user_detailList) {
        this.user_detailList = user_detailList;
    }

    public User_detailBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public User_detail getUser_detail() {
        return user_detail;
    }

    public void setUser_detail(User_detail user_detail) {
        this.user_detail = user_detail;
    }

    public void cancel() {
        if (user_detail != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(user_detail);
            } catch (PersistentException ex) {
                Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.user_detail = null;
        changepw = false;
        formstate = "view";
    }

    public void view(User_detail a) {
        this.user_detail = a;
        formstate = "view";
    }

    public void delete(User_detail a) {
        this.user_detail = a;
    }

    public void add() {
        user_detail = new User_detail();
        formstate = "add";
        changepw = true;
    }

    public void edit(User_detail a) {
        this.user_detail = a;
        formstate = "edit";
    }
    private boolean changepw = false;

    public boolean isChangepw() {
        return changepw;
    }

    public void setChangepw(boolean changepw) {
        this.changepw = changepw;
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (user_detail.getUser_detail_id() > 0) {
                user_detail.setEdit_user(loginBean.getUser_detail());
                user_detail.setEdit_date(new Timestamp(new Date().getTime()));
                if (changepw) {
                    user_detail.setPassword(AESencrp.encrypt(user_detail.getPassword()));
                }
                ISMSPersistentManager.instance().getSession().merge(user_detail);
            } else {
                user_detail.setAdd_date(new Timestamp(new Date().getTime()));
                user_detail.setAdd_user(loginBean.getUser_detail());
                user_detail.setPassword(AESencrp.encrypt(user_detail.getPassword()));
                user_detail.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(user_detail);
            user_detail = null;
            //listBean.refreshlists("User_detail");
            changepw = false;
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        } catch (Exception ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(user_detail);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(user_detail);
            this.user_detail = null;
            //listBean.refreshlists("User_detail");
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
