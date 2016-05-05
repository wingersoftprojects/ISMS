/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity_group;
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
public class Activity_groupBean implements Serializable {

    private Activity_group activity_group;
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

    private List<Activity_group> activity_groupList;

    public List<Activity_group> getActivity_groupList() {
        try {
            activity_groupList = null;
            activity_groupList = Activity_group.queryActivity_group(null, "activity_group_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activity_groupList;
    }

    public void setActivity_groupList(List<Activity_group> activity_groupList) {
        this.activity_groupList = activity_groupList;
    }

    public Activity_groupBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Activity_group getActivity_group() {
        return activity_group;
    }

    public void setActivity_group(Activity_group activity_group) {
        this.activity_group = activity_group;
    }

    public void cancel() {
        if (activity_group != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity_group);
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity_group = null;
        formstate = "view";
    }

    public void view(Activity_group object) {
        this.activity_group = object;
        formstate = "view";
    }

    public void delete(Activity_group object) {
        this.activity_group = object;
    }

    public void add() {
        activity_group = new Activity_group();
        formstate = "add";
    }

    public void edit(Activity_group object) {
        this.activity_group = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity_group.getActivity_group_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(activity_group);
            } else {
                activity_group.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_group);
            activity_group = null;
            //listBean.refreshlists("Activity_group");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity_group);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_group);
            this.activity_group = null;
            //listBean.refreshlists("Activity_group");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
