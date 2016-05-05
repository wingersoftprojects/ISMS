/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Currency_type;
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
public class Currency_typeBean implements Serializable {

    private Currency_type currency_type;
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
    
     private List<Currency_type> currency_typeList;

    public List<Currency_type> getCurrency_typeList() {
        try {
            currency_typeList = null;
            currency_typeList = Currency_type.queryCurrency_type(null, "currency_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return currency_typeList;
    }

    public void setCurrency_typeList(List<Currency_type> currency_typeList) {
        this.currency_typeList = currency_typeList;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Currency_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Currency_type getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(Currency_type currency_type) {
        this.currency_type = currency_type;
    }

    public void cancel() {
        if (currency_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(currency_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.currency_type = null;
        formstate = "view";
    }

    public void view(Currency_type object) {
        this.currency_type = object;
        formstate = "view";
    }

    public void delete(Currency_type object) {
        this.currency_type = object;
    }

    public void add() {
        currency_type = new Currency_type();
        formstate = "add";
    }

    public void edit(Currency_type object) {
        this.currency_type = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (currency_type.getCurrency_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(currency_type);
            } else {
                currency_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(currency_type);
            currency_type = null;
            //listBean.refreshlists("Currency_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(currency_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(currency_type);
            this.currency_type = null;
            //listBean.refreshlists("Currency_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
