/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Exit_mode;
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
public class Exit_modeBean implements Serializable {

    private Exit_mode exit_mode;
    private String formstate;

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }

    private List<Exit_mode> exit_modeList;

    public List<Exit_mode> getExit_modeList() {
        GeneralUtilities.clearCache();
        try {
            exit_modeList = null;
            exit_modeList = Exit_mode.queryExit_mode(null, "exit_mode_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exit_modeList;
    }

    public void setExit_modeList(List<Exit_mode> exit_modeList) {
        this.exit_modeList = exit_modeList;
    }

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Exit_modeBean() {
        formstate = "view";

    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Exit_mode getExit_mode() {
        return exit_mode;
    }

    public void setExit_mode(Exit_mode exit_mode) {
        this.exit_mode = exit_mode;
    }

    public void cancel() {
        if (exit_mode != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(exit_mode);
            } catch (PersistentException ex) {
                Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.exit_mode = null;
        formstate = "view";
    }

    public void view(Exit_mode object) {
        this.exit_mode = object;
        formstate = "view";
    }

    public void delete(Exit_mode object) {
        this.exit_mode = object;
    }

    public void add() {
        exit_mode = new Exit_mode();
        formstate = "add";
    }

    public void edit(Exit_mode object) {
        this.exit_mode = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (exit_mode.getExit_mode_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(exit_mode);
            } else {
                exit_mode.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().refresh(exit_mode);
            //ISMSPersistentManager.instance().getSession().evict(exit_mode);
            exit_mode = null;
            //listBean.refreshlists("Exit_mode");
            GeneralUtilities.clearCache();
        } catch (PersistentException ex) {
            Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(exit_mode);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(exit_mode);
            this.exit_mode = null;
            GeneralUtilities.clearCache();
            //listBean.refreshlists("Exit_mode");
        } catch (PersistentException ex) {
            Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
