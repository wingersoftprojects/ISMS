/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity_cost;
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
public class Activity_costBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }

    @ManagedProperty("#{activityBean}")
    private ActivityBean activityBean;

    public ActivityBean getActivityBean() {
        return activityBean;
    }

    public void setActivityBean(ActivityBean activityBean) {
        this.activityBean = activityBean;
    }

    private Activity_cost activity_cost;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Activity_costBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Activity_cost getActivity_cost() {
        return activity_cost;
    }

    public void setActivity_cost(Activity_cost activity_cost) {
        this.activity_cost = activity_cost;
    }

    private List<Activity_cost> activity_costList;

    public List<Activity_cost> getActivity_costList() {
        if (activityBean.getActivity() != null) {
//            activity_costList = new ArrayList<>();
//            for (Activity_cost a : listBean.getActivity_costList()) {
//                if (a.getActivity().getActivity_id() == activityBean.getActivity().getActivity_id()) {
//                    activity_costList.add(a);
//                }
//            }
            try {
                activity_costList = null;
                activity_costList = Activity_cost.queryActivity_cost("activity_id=" + activityBean.getActivity().getActivity_id(), "activity_cost_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        } else {
//            activity_costList = listBean.getActivity_costList();
            try {
                activity_costList = null;
                activity_costList = Activity_cost.queryActivity_cost(null, "activity_cost_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        return activity_costList;
    }

    public void setActivity_costList(List<Activity_cost> activity_costList) {
        this.activity_costList = activity_costList;
    }

    public void cancel() {
        if (activity_cost != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity_cost);
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity_cost = null;
        formstate = "view";
    }

    public void view(Activity_cost a) {
        this.activity_cost = a;
        formstate = "view";
    }

    public void delete(Activity_cost a) {
        this.activity_cost = a;
        formstate = "delete";
    }

    public void add() {
        activity_cost = new Activity_cost();
        formstate = "add";
    }

    public void edit(Activity_cost a) {
        this.activity_cost = a;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity_cost.getActivity_cost_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(activity_cost);
            } else {
                if (activity_cost.getActivity() == null) {
                    activity_cost.setActivity(activityBean.getActivity());
                }
                activity_cost.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_cost);
            activity_cost = null;
            //listBean.refreshlists("Activity_cost");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity_cost);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_cost);
            this.activity_cost = null;
            //listBean.refreshlists("Activity_cost");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
