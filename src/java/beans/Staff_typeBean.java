/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Staff_type;
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
public class Staff_typeBean implements Serializable {

    private Staff_type staff_type;
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

    private List<Staff_type> staff_typeList;

    public List<Staff_type> getStaff_typeList() {
        try {
            staff_typeList = null;
            staff_typeList = Staff_type.queryStaff_type(null, "staff_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staff_typeList;
    }

    public void setStaff_typeList(List<Staff_type> staff_typeList) {
        this.staff_typeList = staff_typeList;
    }

    public Staff_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Staff_type getStaff_type() {
        return staff_type;
    }

    public void setStaff_type(Staff_type staff_type) {
        this.staff_type = staff_type;
    }

    public void cancel() {
        if (staff_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(staff_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.staff_type = null;
        formstate = "view";
    }

    public void view(Staff_type object) {
        this.staff_type = object;
        formstate = "view";
    }

    public void delete(Staff_type object) {
        this.staff_type = object;
    }

    public void add() {
        staff_type = new Staff_type();
        formstate = "add";
    }

    public void edit(Staff_type object) {
        this.staff_type = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (staff_type.getStaff_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(staff_type);
            } else {
                staff_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(staff_type);
            staff_type = null;
            //listBean.refreshlists("Staff_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(staff_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(staff_type);
            this.staff_type = null;
            //listBean.refreshlists("Staff_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
