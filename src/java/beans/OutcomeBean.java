/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Outcome;
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
public class OutcomeBean implements Serializable {

    private Outcome outcome;
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
    
    private List<Outcome> outcomeList;

    public List<Outcome> getOutcomeList() {
        try {
            outcomeList = null;
            outcomeList = Outcome.queryOutcome(null, "outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return outcomeList;
    }

    public void setOutcomeList(List<Outcome> outcomeList) {
        this.outcomeList = outcomeList;
    }

    public OutcomeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public void cancel() {
        if (outcome != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(outcome);
            } catch (PersistentException ex) {
                Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.outcome = null;
        formstate = "view";
    }

    public void view(Outcome s) {
        this.outcome = s;
        formstate = "view";
    }

    public void delete(Outcome s) {
        this.outcome = s;
    }

    public void add() {
        outcome = new Outcome();
        formstate = "add";
    }

    public void edit(Outcome d) {
        this.outcome = d;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (outcome.getOutcome_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(outcome);
            } else {
                outcome.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(outcome);
            outcome = null;
            //listBean.refreshlists("Outcome");
        } catch (PersistentException ex) {
            Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(outcome);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(outcome);
            this.outcome = null;
            //listBean.refreshlists("Outcome");
        } catch (PersistentException ex) {
            Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
