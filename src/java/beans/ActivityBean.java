/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity;
import entityclasses.Activity_outcome;
import entityclasses.Activity_cost;
import entityclasses.Activity_document;
import entityclasses.ISMSPersistentManager;
import entityclasses.User_detail;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class ActivityBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    
    public List<Activity> completeActivity(String query) {
        List<Activity> filteredActivityList = new ArrayList<>();
        try {
            if (query.length() != 0) {
                filteredActivityList = Activity.queryActivity("activity_name like '%" + query + "%'", "activity_name ASC");
            } else {
                filteredActivityList.clear();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredActivityList;
    }

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }

    @PostConstruct
    public void init() {
        try {
            activityList = null;
            activityList = Activity.queryActivity(null, "activity_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

    }
    private List<Activity> activityList;

    public List<Activity> getActivityList() {
        if (activityList == null) {
            init();
        }
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }
    private Activity activity;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public ActivityBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivityById(int id) {
        Activity activity2 = null;
        try {
            activity2 = Activity.getActivityByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return activity2;
    }

    public void cancel() {
        if (activity != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(activity);
            } catch (PersistentException ex) {
                Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.activity = null;
        formstate = "view";
    }

    public void view(Activity s) {
        this.activity = s;
        populateactivity_outcome();
        populateactivity_cost();
        populateactivity_document();
        formstate = "view";
    }

    public void delete(Activity s) {
        this.activity = s;
        formstate = "delete";
    }

    public void add() {
        activity = new Activity();
        populateactivity_outcome();
        populateactivity_cost();
        populateactivity_document();
        formstate = "add";
    }

    public void edit(Activity d) {
        this.activity = d;
        populateactivity_outcome();
        populateactivity_cost();
        populateactivity_document();
        formstate = "edit";
    }

    /**
     * Activity outcome
     */
    private Activity_outcome activity_outcome;
    private List<Activity_outcome> activity_outcomes;

    public Activity_outcome getActivity_outcome() {
        return activity_outcome;
    }

    public void setActivity_outcome(Activity_outcome activity_outcome) {
        this.activity_outcome = activity_outcome;
    }

    public List<Activity_outcome> getActivity_outcomes() {
        return activity_outcomes;
    }

    public void setActivity_outcomes(List<Activity_outcome> activity_outcomes) {
        this.activity_outcomes = activity_outcomes;
    }

    public void populateactivity_outcome() {
        if (activity != null) {
            try {
                List<Activity_outcome> as = Activity_outcome.queryActivity_outcome("activity_id=" + activity.getActivity_id(), null);
                activity_outcomes = new ArrayList<>();
                for (Activity_outcome a : as) {
                    Activity_outcome a1 = new Activity_outcome();
                    a1.setActivity(a.getActivity());
                    a1.setActivity_outcome_name(a.getActivity_outcome_name());
                    a1.setOutcome(a.getOutcome());
                    a1.setTask(a.getTask());
                    activity_outcomes.add(a1);
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String activity_outcome_formstate = "view";

    public String getActivity_outcome_formstate() {
        return activity_outcome_formstate;
    }

    public void setActivity_outcome_formstate(String activity_outcome_formstate) {
        this.activity_outcome_formstate = activity_outcome_formstate;
    }

    public void cancel_activity_outcome() {
        populateactivity_outcome();
        activity_outcome_formstate = "view";
    }

    public void add_activity_outcome() {
        activity_outcome = new Activity_outcome();
        activity_outcome_formstate = "add";
    }

    public void edit_activity_outcome(Activity_outcome cc) {
        activity_outcome = cc;
        populateactivity_outcome();
        activity_outcome_formstate = "edit";
    }

    public void remove_activity_outcome(Activity_outcome ss) {
        activity_outcomes.remove(ss);
        activity_outcome_formstate = "view";
    }

    public void save_activity_outcome() {
        activity_outcome.setActivity(activity);
        for (Activity_outcome a : activity_outcomes) {
            if (a.getOutcome().getOutcome_id() == activity_outcome.getOutcome().getOutcome_id()) {
                activity_outcomes.remove(a);
            }
        }
        activity_outcomes.add(activity_outcome);
        activity_outcome_formstate = "view";
    }

    /**
     * End Activity outcome
     */
    /**
     * Activity Cost
     */
    private Activity_cost activity_cost;
    private List<Activity_cost> activity_costs;

    public Activity_cost getActivity_cost() {
        return activity_cost;
    }

    public void setActivity_cost(Activity_cost activity_cost) {
        this.activity_cost = activity_cost;
    }

    public List<Activity_cost> getActivity_costs() {
        return activity_costs;
    }

    public void setActivity_costs(List<Activity_cost> activity_costs) {
        this.activity_costs = activity_costs;
    }

    public void populateactivity_cost() {
        if (activity != null) {
            try {
                List<Activity_cost> cs = Activity_cost.queryActivity_cost("activity_id=" + activity.getActivity_id(), null);
                activity_costs = new ArrayList<>();
                for (Activity_cost a : cs) {
                    Activity_cost a1 = new Activity_cost();
                    a1.setActivity(a.getActivity());
                    a1.setCost_name(a.getCost_name());
                    a1.setCost_value(a.getCost_value());
                    a1.setIs_active(a.getIs_active());
                    activity_costs.add(a1);
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String activity_cost_formstate = "view";

    public String getActivity_cost_formstate() {
        return activity_cost_formstate;
    }

    public void setActivity_cost_formstate(String activity_cost_formstate) {
        this.activity_cost_formstate = activity_cost_formstate;
    }

    public void cancel_activity_cost() {
        populateactivity_cost();
        activity_cost_formstate = "view";
    }

    public void add_activity_cost() {
        activity_cost = new Activity_cost();
        activity_cost_formstate = "add";
    }

    public void edit_activity_cost(Activity_cost cc) {
        activity_cost = cc;
        populateactivity_cost();
        activity_cost_formstate = "edit";
    }

    public void remove_activity_cost(Activity_cost ss) {
        activity_costs.remove(ss);
        activity_cost_formstate = "view";
    }

    public void save_activity_cost() {
        activity_cost.setActivity(activity);
        activity_costs.add(activity_cost);
        activity_cost_formstate = "view";
    }

    /**
     * End Activity Cost
     */
    /**
     * Activity Document
     */
    private Activity_document activity_document;
    private List<Activity_document> activity_documents;

    public Activity_document getActivity_document() {
        return activity_document;
    }

    public void setActivity_document(Activity_document activity_document) {
        this.activity_document = activity_document;
    }

    public List<Activity_document> getActivity_documents() {
        return activity_documents;
    }

    public void setActivity_documents(List<Activity_document> activity_documents) {
        this.activity_documents = activity_documents;
    }

    public void populateactivity_document() {
        if (activity != null) {
            try {
                List<Activity_document> cs = Activity_document.queryActivity_document("activity_id=" + activity.getActivity_id(), null);
                activity_documents = new ArrayList<>();
                for (Activity_document a : cs) {
                    Activity_document a1 = new Activity_document();
                    a1.setActivity(a.getActivity());
                    a1.setDirection(a.getDirection());
                    a1.setDocument_type(a.getDocument_type());
                    a1.setIs_active(a.getIs_active());
                    a1.setIs_mandatory(a.getIs_mandatory());
                    activity_documents.add(a1);
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String activity_document_formstate = "view";

    public String getActivity_document_formstate() {
        return activity_document_formstate;
    }

    public void setActivity_document_formstate(String activity_document_formstate) {
        this.activity_document_formstate = activity_document_formstate;
    }

    public void cancel_activity_document() {
        populateactivity_document();
        activity_document_formstate = "view";
    }

    public void add_activity_document() {
        activity_document = new Activity_document();
        activity_document_formstate = "add";
    }

    public void edit_activity_document(Activity_document cc) {
        activity_document = cc;
        populateactivity_document();
        activity_document_formstate = "edit";
    }

    public void remove_activity_document(Activity_document ss) {
        activity_documents.remove(ss);
        activity_document_formstate = "view";
    }

    public void save_activity_document() {
        activity_document.setActivity(activity);
        for (Activity_document a : activity_documents) {
            if (a.getDocument_type().getDocument_type_id() == activity_document.getDocument_type().getDocument_type_id()) {
                activity_documents.remove(a);
                break;
            }
        }
        activity_documents.add(activity_document);
        activity_document_formstate = "view";
    }

    /**
     * End Activity Document
     */
    public void save() {
        if (activity_outcomes.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please atleast one Activity Outcome!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (activity.getActivity_id() > 0) {
                activity.setEdit_user(loginBean.getUser_detail());
                activity.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(activity);
            } else {
                activity.setAdd_date(new Timestamp(new Date().getTime()));
                activity.setAdd_user(loginBean.getUser_detail());
                activity.save();
            }
            t.commit();

            /**
             * Process Activity Outcome
             */
//            if (activity.getActivity_id() > 0) {
//                t = ISMSPersistentManager.instance().getSession().beginTransaction();
//                Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Activity_outcome where activity_id= :activity_id");
//                query.setParameter("activity_id", activity.getActivity_id());
//                int result = query.executeUpdate();
//                t.commit();
//            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();
            for (Activity_outcome a : activity_outcomes) {
                Activity_outcome a1 = Activity_outcome.loadActivity_outcomeByQuery("outcome_id=" + a.getOutcome().getOutcome_id() + " and activity_id=" + activity.getActivity_id(), null);
                if (a1 != null) {
                    ISMSPersistentManager.instance().getSession().merge(a1);
                } else {
                    a.save();
                }
            }
            t.commit();

            /**
             * End Process Activity Outcome
             */
            /**
             * Process Activity cost
             */
            if (activity.getActivity_id() > 0) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Activity_cost where activity_id= :activity_id");
                query.setParameter("activity_id", activity.getActivity_id());
                int result = query.executeUpdate();
                t.commit();
            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();
            for (Activity_cost a : activity_costs) {
                a.save();
            }
            t.commit();

            /**
             * End Process Activity cost
             */
            /**
             * Process Activity documents
             */
            if (activity.getActivity_id() > 0) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Activity_document where activity_id= :activity_id");
                query.setParameter("activity_id", activity.getActivity_id());
                int result = query.executeUpdate();
                t.commit();
            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();
            for (Activity_document a : activity_documents) {
                a.save();
            }
            t.commit();

            /**
             * End Process Activity documents
             */
            formstate = "view";
            //ISMSPersistentManager.instance().getSession().evict(activity);
            activity = null;
            //listBean.refreshlists("Activity");
            //ISMSPersistentManager.instance().getSession().flush();
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(activity);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(activity);
            this.activity = null;
            //listBean.refreshlists("Activity");
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
