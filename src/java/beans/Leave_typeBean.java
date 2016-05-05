/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Leave_type;
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
public class Leave_typeBean implements Serializable {

    private Leave_type leave_type;
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

    private List<Leave_type> leave_typeList;

    public List<Leave_type> getLeave_typeList() {
        try {
            leave_typeList = null;
            leave_typeList = Leave_type.queryLeave_type(null, "leave_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return leave_typeList;
    }

    public void setLeave_typeList(List<Leave_type> leave_typeList) {
        this.leave_typeList = leave_typeList;
    }
    
    public Leave_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Leave_type getLeave_type() {
        return leave_type;
    }

    public void setLeave_type(Leave_type leave_type) {
        this.leave_type = leave_type;
    }

    public void cancel() {
        if (leave_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(leave_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.leave_type = null;
        formstate = "view";
    }

    public void view(Leave_type s) {
        this.leave_type = s;
        formstate = "view";
    }

    public void delete(Leave_type s) {
        this.leave_type = s;
    }

    public void add() {
        leave_type = new Leave_type();
        formstate = "add";
    }

    public void edit(Leave_type d) {
        this.leave_type = d;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (leave_type.getLeave_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(leave_type);
            } else {
                leave_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(leave_type);
            leave_type = null;
            //listBean.refreshlists("Leave_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(leave_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(leave_type);
            this.leave_type = null;
            //listBean.refreshlists("Leave_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
