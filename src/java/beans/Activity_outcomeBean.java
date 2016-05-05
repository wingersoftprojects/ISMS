/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity;
import entityclasses.Activity_outcome;
import entityclasses.ISMSPersistentManager;
import java.io.Serializable;
import java.util.ArrayList;
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
public class Activity_outcomeBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Activity_outcome activity_outcome;
    private String formstate;

    @ManagedProperty("#{activityBean}")
    private ActivityBean activityBean;

    public ActivityBean getActivityBean() {
        return activityBean;
    }

    public void setActivityBean(ActivityBean activityBean) {
        this.activityBean = activityBean;
    }

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Activity_outcomeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    private List<Activity_outcome> activity_outcomeList;

    public List<Activity_outcome> getActivity_outcomeList() {
        if (activityBean.getActivity() != null) {
//            activity_outcomeList = new ArrayList<>();
//            for (Activity_outcome a : listBean.getActivity_outcomeList()) {
//                if (a.getActivity().getActivity_id() == activityBean.getActivity().getActivity_id()) {
//                    activity_outcomeList.add(a);
//                }
//            }
            try {
                activity_outcomeList = null;
                activity_outcomeList = Activity_outcome.queryActivity_outcome("activity_id=" + activityBean.getActivity().getActivity_id(), "activity_outcome_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        } else {
            try {
                activity_outcomeList = null;
                activity_outcomeList = Activity_outcome.queryActivity_outcome(null, "activity_outcome_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
//            activity_outcomeList = listBean.getActivity_outcomeList();
        }
        return activity_outcomeList;
    }

    public List<Activity_outcome> getActivity_outcomeList(Activity activity) {
        try {
            activity_outcomeList = null;
            activity_outcomeList = Activity_outcome.queryActivity_outcome("activity_id=" + activity.getActivity_id(), "activity_outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activity_outcomeList;
    }

    public void setActivity_outcomeList(List<Activity_outcome> activity_outcomeList) {
        this.activity_outcomeList = activity_outcomeList;
    }

    public Activity_outcome getActivity_outcome() {
        return activity_outcome;
    }

    public void setActivity_outcome(Activity_outcome activity_outcome) {
        this.activity_outcome = activity_outcome;
    }

    public void cancel() {
        if (activity_outcome != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity_outcome);
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity_outcome = null;
        formstate = "view";
    }

    public void view(Activity_outcome object) {
        this.activity_outcome = object;
        formstate = "view";
    }

    public void delete(Activity_outcome object) {
        this.activity_outcome = object;
        formstate = "delete";
    }

    public void add() {
        activity_outcome = new Activity_outcome();
        formstate = "add";
    }

    public void edit(Activity_outcome object) {
        this.activity_outcome = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity_outcome.getActivity_outcome_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(activity_outcome);
            } else {
                if (activity_outcome.getActivity() == null) {
                    activity_outcome.setActivity(activityBean.getActivity());
                }
                activity_outcome.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_outcome);
            activity_outcome = null;
            //listBean.refreshlists("Activity_outcome");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity_outcome);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_outcome);
            this.activity_outcome = null;
            //listBean.refreshlists("Activity_outcome");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance()
                    .addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
