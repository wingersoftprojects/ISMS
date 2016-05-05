/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Accommodation_type;
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
public class Accommodation_typeBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private List<Accommodation_type> accommodation_typeList;

    public List<Accommodation_type> getAccommodation_typeList() {
        try {
            accommodation_typeList = null;
            accommodation_typeList = Accommodation_type.queryAccommodation_type(null, "accommodation_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return accommodation_typeList;
    }

    public void setAccommodation_typeList(List<Accommodation_type> accommodation_typeList) {
        this.accommodation_typeList = accommodation_typeList;
    }

    private Accommodation_type accommodation_type;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Accommodation_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Accommodation_type getAccommodation_type() {
        return accommodation_type;
    }

    public void setAccommodation_type(Accommodation_type accommodation_type) {
        this.accommodation_type = accommodation_type;
    }

    public void cancel() {
        if (accommodation_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(accommodation_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.accommodation_type = null;
        formstate = "view";
    }

    public void view(Accommodation_type object) {
        this.accommodation_type = object;
        formstate = "view";
    }

    public void delete(Accommodation_type object) {
        this.accommodation_type = object;
    }

    public void add() {
        accommodation_type = new Accommodation_type();
        formstate = "add";
    }

    public void edit(Accommodation_type object) {
        this.accommodation_type = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (accommodation_type.getAccommodation_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(accommodation_type);
            } else {
                accommodation_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(accommodation_type);
            accommodation_type = null;
            //listBean.refreshlists("Accommodation_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(accommodation_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(accommodation_type);
            this.accommodation_type = null;
            //listBean.refreshlists("Accommodation_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
