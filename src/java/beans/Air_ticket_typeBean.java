/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Air_ticket_type;
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
public class Air_ticket_typeBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Air_ticket_type air_tcket_type;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setAir_ticket_typeList(List<Air_ticket_type> air_ticket_typeList) {
        this.air_ticket_typeList = air_ticket_typeList;
    }

    private List<Air_ticket_type> air_ticket_typeList;

    public List<Air_ticket_type> getAir_ticket_typeList() {
        try {
            air_ticket_typeList = null;
            air_ticket_typeList = Air_ticket_type.queryAir_ticket_type(null, "air_ticket_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        return air_ticket_typeList;
    }

    public Air_ticket_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Air_ticket_type getAir_ticket_type() {
        return air_tcket_type;
    }

    public void setAir_ticket_type(Air_ticket_type air_tcket_type) {
        this.air_tcket_type = air_tcket_type;
    }

    public void cancel() {
        if (air_tcket_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(air_tcket_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.air_tcket_type = null;
        formstate = "view";
    }

    public void view(Air_ticket_type object) {
        this.air_tcket_type = object;
        formstate = "view";
    }

    public void delete(Air_ticket_type object) {
        this.air_tcket_type = object;
    }

    public void add() {
        air_tcket_type = new Air_ticket_type();
        formstate = "add";
    }

    public void edit(Air_ticket_type object) {
        this.air_tcket_type = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (air_tcket_type.getAir_ticket_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(air_tcket_type);
            } else {
                air_tcket_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(air_tcket_type);
            air_tcket_type = null;
            //listBean.refreshlists("Air_ticket_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(air_tcket_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(air_tcket_type);
            this.air_tcket_type = null;
            //listBean.refreshlists("Air_ticket_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
