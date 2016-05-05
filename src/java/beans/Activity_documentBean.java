/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity_document;
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
public class Activity_documentBean implements Serializable {

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
    private Activity_document activity_document;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public Activity_documentBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    private List<Activity_document> activity_documentList;

    public List<Activity_document> getActivity_documentList() {
        if (activityBean.getActivity() != null) {
//            activity_documentList = new ArrayList<>();
//            for (Activity_document a : listBean.getActivity_documentList()) {
//                if (a.getActivity().getActivity_id() == activityBean.getActivity().getActivity_id()) {
//                    activity_documentList.add(a);
//                }
//            }
            try {
                activity_documentList = null;
                activity_documentList = Activity_document.queryActivity_document("activity_id=" + activityBean.getActivity().getActivity_id(), "activity_document_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        } else {
            //activity_documentList = listBean.getActivity_documentList();
            try {
                activity_documentList = null;
                activity_documentList = Activity_document.queryActivity_document(null, "activity_document_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        return activity_documentList;
    }

    public void setActivity_documentList(List<Activity_document> activity_documentList) {
        this.activity_documentList = activity_documentList;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Activity_document getActivity_document() {
        return activity_document;
    }

    public void setActivity_document(Activity_document activity_document) {
        this.activity_document = activity_document;
    }

    public void cancel() {
        if (activity_document != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity_document);
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity_document = null;
        formstate = "view";
    }

    public void view(Activity_document a) {
        this.activity_document = a;
        formstate = "view";
    }

    public void delete(Activity_document a) {
        this.activity_document = a;
        formstate = "delete";
    }

    public void add() {
        activity_document = new Activity_document();
        formstate = "add";
    }

    public void edit(Activity_document a) {
        this.activity_document = a;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity_document.getActivity_document_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(activity_document);
            } else {
                if (activity_document.getActivity() == null) {
                    activity_document.setActivity(activityBean.getActivity());
                }
                activity_document.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_document);
            activity_document = null;
            //listBean.refreshlists("Activity_document");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity_document);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity_document);
            this.activity_document = null;
            //listBean.refreshlists("Activity_document");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
