/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Approval_type;
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
public class Approval_typeBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Approval_type approval_type;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }
    private List<Approval_type> approval_typeList;

    public List<Approval_type> getApproval_typeList() {
        try {
            approval_typeList = null;
            approval_typeList = Approval_type.queryApproval_type(null, "approval_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return approval_typeList;
    }

    public void setApproval_typeList(List<Approval_type> approval_typeList) {
        this.approval_typeList = approval_typeList;
    }

    public Approval_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Approval_type getApproval_type() {
        return approval_type;
    }

    public void setApproval_type(Approval_type approval_type) {
        this.approval_type = approval_type;
    }

    public void cancel() {
        if (approval_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(approval_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.approval_type = null;
        formstate = "view";
    }

    public void view(Approval_type a) {
        this.approval_type = a;
        formstate = "view";
    }

    public void delete(Approval_type a) {
        this.approval_type = a;
    }

    public void add() {
        approval_type = new Approval_type();
        formstate = "add";
    }

    public void edit(Approval_type a) {
        this.approval_type = a;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (approval_type.getApproval_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(approval_type);
            } else {
                approval_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(approval_type);
            approval_type = null;
            //listBean.refreshlists("Approval_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(approval_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(approval_type);
            this.approval_type = null;
            //listBean.refreshlists("Approval_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
