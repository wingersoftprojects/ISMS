/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Nationality;
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
public class NationalityBean implements Serializable {

    private Nationality nationality;
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

    private List<Nationality> nationalityList;

    public List<Nationality> getNationalityList() {
        try {
            nationalityList = null;
            nationalityList = Nationality.queryNationality(null, "nationality_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return nationalityList;
    }

    public void setNationalityList(List<Nationality> nationalityList) {
        this.nationalityList = nationalityList;
    }
    
    public NationalityBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public void cancel() {
        if (nationality != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(nationality);
            } catch (PersistentException ex) {
                Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.nationality = null;
        formstate = "view";
    }

    public void view(Nationality object) {
        this.nationality = object;
        formstate = "view";
    }

    public void delete(Nationality object) {
        this.nationality = object;
    }

    public void add() {
        nationality = new Nationality();
        formstate = "add";
    }

    public void edit(Nationality object) {
        this.nationality = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (nationality.getNationality_id() > 0) {
                //ISMSPersistentManager.instance().getSession().merge(nationality);
                nationality.save();
            } else {
                nationality.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(nationality);
            nationality = null;
            //listBean.refreshlists("Nationality");
        } catch (PersistentException ex) {
            Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(nationality);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(nationality);
            this.nationality = null;
            //listBean.refreshlists("Nationality");
        } catch (PersistentException ex) {
            Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
