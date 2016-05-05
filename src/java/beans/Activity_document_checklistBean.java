/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity_document_checklist;
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
public class Activity_document_checklistBean implements Serializable{
    
    @ManagedProperty("#{activityBean}")
    private ActivityBean activityBean;

    public ActivityBean getActivityBean() {
        return activityBean;
    }

    public void setActivityBean(ActivityBean activityBean) {
        this.activityBean = activityBean;
    }

    @ManagedProperty("#{listBean}")
    private ListBean listBean;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Activity_document_checklist activity_document_checklist;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Activity_document_checklistBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    private List<Activity_document_checklist> activity_document_checklistList;

    public List<Activity_document_checklist> getActivity_document_checklistList() {
        if (activityBean.getActivity() != null) {
//            activity_document_checklistList = new ArrayList<>();
//            for (Activity_document_checklist a : listBean.getActivity_document_checklistList()) {
//                if (a.getActivity().getActivity_id() == activityBean.getActivity().getActivity_id()) {
//                    activity_document_checklistList.add(a);
//                }
//            }
            try {
                activity_document_checklistList = null;
                activity_document_checklistList = Activity_document_checklist.queryActivity_document_checklist("activity_id=" + activityBean.getActivity().getActivity_id(), "activity_document_checklist_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_document_checklistBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        } else {
            //activity_document_checklistList = listBean.getActivity_document_checklistList();
            try {
                activity_document_checklistList = null;
                activity_document_checklistList = Activity_document_checklist.queryActivity_document_checklist(null, "activity_document_checklist_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_document_checklistBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        return activity_document_checklistList;
    }

    public void setActivity_document_checklistList(List<Activity_document_checklist> activity_document_checklistList) {
        this.activity_document_checklistList = activity_document_checklistList;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Activity_document_checklist getActivity_document_checklist() {
        return activity_document_checklist;
    }

    public void setActivity_document_checklist(Activity_document_checklist activity_document_checklist) {
        this.activity_document_checklist = activity_document_checklist;
    }

    public void cancel() {
        if (activity_document_checklist != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity_document_checklist);
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_document_checklistBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity_document_checklist = null;
        formstate = "view";
    }

    public void view(Activity_document_checklist a) {
        this.activity_document_checklist = a;
        formstate = "view";
    }

    public void delete(Activity_document_checklist a) {
        this.activity_document_checklist = a;
        formstate = "delete";
    }

    public void add() {
        activity_document_checklist = new Activity_document_checklist();
        formstate = "add";
    }

    public void edit(Activity_document_checklist a) {
        this.activity_document_checklist = a;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity_document_checklist.getActivity_document_checklist_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(activity_document_checklist);
            } else {
                if (activity_document_checklist.getActivity() == null) {
                    activity_document_checklist.setActivity(activityBean.getActivity());
                }
                activity_document_checklist.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_document_checklist);
            activity_document_checklist = null;
            //listBean.refreshlists("Activity_document_checklist");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_document_checklistBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity_document_checklist);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_document_checklist);
            this.activity_document_checklist = null;
            //listBean.refreshlists("Activity_document_checklist");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_document_checklistBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
