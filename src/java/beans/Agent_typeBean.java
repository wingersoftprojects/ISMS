/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Agent_type;
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
public class Agent_typeBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }
    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Agent_type agent_type;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    private List<Agent_type> agent_typeList;

    public List<Agent_type> getAgent_typeList() {
        try {
            agent_typeList = null;
            agent_typeList = Agent_type.queryAgent_type(null, "agent_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return agent_typeList;
    }

    public void setAgent_typeList(List<Agent_type> agent_typeList) {
        this.agent_typeList = agent_typeList;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Agent_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Agent_type getAgent_type() {
        return agent_type;
    }

    public void setAgent_type(Agent_type agent_type) {
        this.agent_type = agent_type;
    }

    public void cancel() {
        if (agent_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(agent_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.agent_type = null;
        formstate = "view";
    }

    public void view(Agent_type s) {
        this.agent_type = s;
        formstate = "view";
    }

    public void delete(Agent_type s) {
        this.agent_type = s;
    }

    public void add() {
        agent_type = new Agent_type();
        formstate = "add";
    }

    public void edit(Agent_type d) {
        this.agent_type = d;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (agent_type.getAgent_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(agent_type);
            } else {
                agent_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(agent_type);
            agent_type = null;
            //listBean.refreshlists("Agent_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(agent_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(agent_type);
            this.agent_type = null;
            //listBean.refreshlists("Agent_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
