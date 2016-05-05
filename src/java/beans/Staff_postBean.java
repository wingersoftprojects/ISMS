/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.ISMSPersistentManager;
import entityclasses.Staff_post;
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
public class Staff_postBean implements Serializable {

    private Staff_post staff_post;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    private List<Staff_post> staff_postList;

    public List<Staff_post> getStaff_postList() {
        try {
            staff_postList = null;
            staff_postList = Staff_post.queryStaff_post(null, "staff_post_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_postBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staff_postList;
    }

    public void setStaff_postList(List<Staff_post> staff_postList) {
        this.staff_postList = staff_postList;
    }

    public Staff_postBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Staff_post getStaff_post() {
        return staff_post;
    }

    public void setStaff_post(Staff_post staff_post) {
        this.staff_post = staff_post;
    }

    public void cancel() {
        if (staff_post != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(staff_post);
            } catch (PersistentException ex) {
                Logger.getLogger(Staff_postBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.staff_post = null;
        formstate = "view";
    }

    public void view(Staff_post object) {
        this.staff_post = object;
        formstate = "view";
    }

    public void delete(Staff_post object) {
        this.staff_post = object;
    }

    public void add() {
        staff_post = new Staff_post();
        formstate = "add";
    }

    public void edit(Staff_post object) {
        this.staff_post = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (staff_post.getStaff_post_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(staff_post);
            } else {
                staff_post.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(staff_post);
            staff_post = null;
            //listBean.refreshlists("Staff_post");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_postBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(staff_post);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(staff_post);
            this.staff_post = null;
            //listBean.refreshlists("Staff_post");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_postBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
