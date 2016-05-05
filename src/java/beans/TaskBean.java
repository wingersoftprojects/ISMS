/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity;
import entityclasses.Activity_document;
import entityclasses.Agent;
import entityclasses.Company_contact;
import entityclasses.Current_staff_documents;
import entityclasses.Document_type;
import entityclasses.ISMSPersistentManager;
import entityclasses.Staff;
import entityclasses.Task;
import entityclasses.Task_document;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.PieChartModel;
import utilities.FingerDB;
import utilities.GeneralUtilities;
import utilities.SendMail;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class TaskBean implements Serializable {
    
    private String emailto;
    private String emailcopyto;
    private String emailmessage;
    private String emailsubject;
    private List<Task_document> emailtask_documentList;
    private int TempDocumentTypeLevel;
    private Document_type TempDocumentType;
    private String[] SelectedDocumentTypeLevels;
    private String[] SelectedDocumentTypes;
    private List<Task> pendingTasks;
    private List<Task> overDueTasks;
    private List<Task> flaggedTasks;
    private List<Task> allTasks;
    private List<Current_staff_documents> expiredDocuments;
    private List<Current_staff_documents> flaggedDocuments;
    private List<Current_staff_documents> inDocuments;
    private List<Current_staff_documents> outDocuments;
    private List<Staff> staffWithoutDocumentType;
    private List<Staff> staffWithDocumentType;
    private List<Current_staff_documents> tempCurrentStaffDocuments;
    
    public List<Task_document> getEmailtask_documentList() {
        return emailtask_documentList;
    }
    
    public void setEmailtask_documentList(List<Task_document> emailtask_documentList) {
        this.emailtask_documentList = emailtask_documentList;
    }
    
    public String getEmailto() {
        return emailto;
    }
    
    public void setEmailto(String emailto) {
        this.emailto = emailto;
    }
    
    public String getEmailcopyto() {
        return emailcopyto;
    }
    
    public void setEmailcopyto(String emailcopyto) {
        this.emailcopyto = emailcopyto;
    }
    
    public String getEmailmessage() {
        return emailmessage;
    }
    
    public void setEmailmessage(String emailmessage) {
        this.emailmessage = emailmessage;
    }
    
    public String getEmailsubject() {
        return emailsubject;
    }
    
    public void setEmailsubject(String emailsubject) {
        this.emailsubject = emailsubject;
    }
    
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;
    
    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    
    public LoginBean getLoginBean() {
        return loginBean;
    }
    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    
    public ListBean getListBean() {
        return listBean;
    }
    
    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Date approval_date;
    
    public Date getApproval_date() {
        return approval_date;
    }
    
    public void setApproval_date(Date approval_date) {
        this.approval_date = approval_date;
    }
    
    public List<Current_staff_documents> getExpiredDocuments() {
        try {
            expiredDocuments = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery("select csd from Current_staff_documents csd INNER JOIN csd.task_document td where (csd.is_deleted='no' or csd.is_deleted is null) and csd.staff.is_active='Yes' and td.expiry_date< :date1 ORDER BY csd.staff.pp_surname ASC,csd.staff.pp_given_names ASC").setDate("date1", new Date()).list();
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return expiredDocuments;
    }
    
    private Date startdate;
    private Date enddate;
    
    public Date getStartdate() {
        return startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    
    public Date getEnddate() {
        return enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    
    private List<Current_staff_documents> filter_expring_docs_by_month;
    
    public List<Current_staff_documents> getFilter_expring_docs_by_month() {
        filter_expring_docs_by_month = new ArrayList<>();
        if (enddate != null && startdate != null) {
            try {
                filter_expring_docs_by_month = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery("select csd from Current_staff_documents csd INNER JOIN csd.task_document td where (csd.is_deleted='no' or csd.is_deleted is null) and csd.staff.is_active='Yes' and td.expiry_date>= :date1 and td.expiry_date<=:date2 ORDER BY csd.staff.pp_surname ASC,csd.staff.pp_given_names ASC").setDate("date1", startdate).setDate("date2", enddate).list();
            } catch (PersistentException ex) {
                Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return filter_expring_docs_by_month;
    }
    
    public void setFilter_expring_docs_by_month(List<Current_staff_documents> filter_expring_docs_by_month) {
        this.filter_expring_docs_by_month = filter_expring_docs_by_month;
    }
    
    public void setExpiredDocuments(List<Current_staff_documents> expiredDocuments) {
        this.expiredDocuments = expiredDocuments;
    }
    
    public List<Current_staff_documents> getFlaggedDocuments() {
        try {
            List<Current_staff_documents> tempList = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery("select csd from Current_staff_documents csd INNER JOIN csd.task_document td where (csd.is_deleted='no' or csd.is_deleted is null) and csd.staff.is_active='Yes' and csd.task_document.document_type.flag_duration_beforeexpiry IS NOT NULL AND td.expiry_date IS NOT NULL AND td.expiry_date> :date2 ORDER BY csd.staff.pp_surname ASC,csd.staff.pp_given_names ASC").setDate("date2", new Date()).list();
            flaggedDocuments = new ArrayList<>();
            for (Current_staff_documents c : tempList) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(c.getTask_document().getExpiry_date());
                //cal.add(Calendar.DATE, -1 * c.getDocument_type().getFlag_duration_beforeexpiry());
                int flag_duration = 0;
                Document_type dt = c.getDocument_type();
                try {
                    flag_duration = dt.getFlag_duration_beforeexpiry();
                } catch (NullPointerException npe) {
                    flag_duration = 0;
                }
                int cal_dat = Calendar.DATE;
                cal.add(cal_dat, -1 * flag_duration);
                Date flagDate = cal.getTime();
                if (flagDate.before(new Date())) {
                    flaggedDocuments.add(c);
                }
            }
            
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flaggedDocuments;
    }
    
    public void setFlaggedDocuments(List<Current_staff_documents> flaggedDocuments) {
        this.flaggedDocuments = flaggedDocuments;
    }
    
    public List<Task> getAllTasks() {
        allTasks = this.getTaskList();
        return allTasks;
    }
    
    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }
    
    public void popup() {
        if (getOverDueTasks().size() > 0) {
            Map<String, Object> options = new HashMap<>();
//            options.put("modal", true);
            RequestContext.getCurrentInstance().openDialog("doc_preview_dialog", options, null);
        }
    }
    
    public List<Task> getFlaggedTasks() {
//        try {
        flaggedTasks = new ArrayList<>();
        for (Task t : this.getTaskList()) {
            if (t.getTask_status().equals("Pending") && new Date(t.getFlag_date().getTime()).before(new Date()) && new Date(t.getDue_date().getTime()).after(new Date())) {
                flaggedTasks.add(t);
            }
        }
        return flaggedTasks;
    }
    
    public void setFlaggedTasks(List<Task> flaggedTasks) {
        this.flaggedTasks = flaggedTasks;
    }
    
    public List<Task> getPendingTasks() {
        pendingTasks = new ArrayList<>();
        for (Task t : this.getTaskList()) {
            if (t.getTask_status().equals("Pending") && new Date(t.getFlag_date().getTime()).after(new Date()) && new Date(t.getDue_date().getTime()).after(new Date())) {
                pendingTasks.add(t);
            }
        }
        return pendingTasks;
    }
    
    public void setPendingTasks(List<Task> pendingTasks) {
        this.pendingTasks = pendingTasks;
    }
    
    private List<Task> taskList = new ArrayList();
    
    public List<Task> getTaskList() {
        try {
            taskList = Task.queryTask("task_status='Pending'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return taskList;
    }
    
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
    
    public void createmanualtask() {
        task.setTask_status("Pending");
        /**
         * Add flag date
         */
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        task.setFlag_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, task.getActivity().getFlag_after()).getTime().getTime()));
        /**
         * Add flag date
         */
        /**
         * Add Due date
         */
        currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        task.setDue_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, task.getActivity().getDuration()).getTime().getTime()));
        /**
         * Add Due date
         */
        task.setAssigned_user(loginBean.getUser_detail());
        createTask(task);
        task = null;
    }
    
    public void cancel() {
        try {
            if (task != null) {
                ISMSPersistentManager.instance().getSession().evict(task);
            }
            task = null;
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Task> getOverDueTasks() {
//        try {
//            overDueTasks = Task.queryTask("task_status='Pending' and due_date<'" + new SimpleDateFormat("YYYY-MM-DD").format(new Date()) + "'", null);
//        } catch (PersistentException ex) {
//            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
        overDueTasks = new ArrayList<>();
        for (Task t : this.getTaskList()) {
            if (t.getTask_status().equals("Pending") && new Date(t.getDue_date().getTime()).before(new Date())) {
                overDueTasks.add(t);
            }
        }
        return overDueTasks;
    }
    
    public void setOverDueTasks(List<Task> overDueTasks) {
        this.overDueTasks = overDueTasks;
    }
    
    public void createTask(Task task) {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            task.setAdd_date(new Timestamp(new Date().getTime()));
            task.setAdd_user(loginBean.getUser_detail());
            task.save();
            t.commit();
            //listBean.refreshlists("Task");
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void add() {
        task = new Task();
    }
    
    public void editTask(Task task) {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            task.setEdit_date(new Timestamp(new Date().getTime()));
            task.setEdit_user(loginBean.getUser_detail());
            ISMSPersistentManager.instance().getSession().merge(task);
            t.commit();
            //listBean.refreshlists("Task");
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void killTask(Task task) {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            task.setEdit_date(new Timestamp(new Date().getTime()));
            task.setEdit_user(loginBean.getUser_detail());
            task.setTask_status("Killed");
            task.setComplete_date(new Timestamp(new Date().getTime()));
            ISMSPersistentManager.instance().getSession().merge(task);
            t.commit();
            //listBean.refreshlists("Task");
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Task_document> task_documentList;
    
    public List<Task_document> getTask_documentList() {
        return task_documentList;
    }
    
    public void setTask_documentList(List<Task_document> task_documentList) {
        this.task_documentList = task_documentList;
    }
    
    List<Activity_document> required_documentList;
    
    public List<Activity_document> getRequired_documentList() {
        try {
            required_documentList = Activity_document.queryActivity_document("activity_id=" + task.getActivity().getActivity_id(), null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return required_documentList;
    }
    
    public void setRequired_documentList(List<Activity_document> required_documentList) {
        this.required_documentList = required_documentList;
    }
    
    public void completeTask() {
        try {
            /**
             * Check for missing uploaded documents
             */
            List<Activity_document> activity_documentList = Activity_document.queryActivity_document("activity_id=" + task.getActivity().getActivity_id() + " AND is_mandatory='Yes' AND direction='IN'", null);
            boolean document_exists = true;
            String missingDocument = "";
            for (Activity_document activity_document : activity_documentList) {
                missingDocument = activity_document.getDocument_type().getDoc_type_name();
                boolean ismissing = true;
                for (Task_document t : task_documentList) {
                    if (t.getDocument_type().getDocument_type_id() == activity_document.getDocument_type().getDocument_type_id()) {
                        ismissing = false;
                    }
                }
                if (ismissing) {
                    document_exists = false;
                    break;
                }
            }
            if (!document_exists) {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please Upload the document '" + missingDocument + "'!", "Validation");
                //RequestContext.getCurrentInstance().showMessageInDialog(message);
                FacesContext.getCurrentInstance().addMessage("Validation", message);
                return;
            }
            /**
             * Get next activity
             */
            Activity activity = null;
            if (null != task.getActivity_outcome().getOutcome().getOutcome_name()) {
                switch (task.getActivity_outcome().getOutcome().getOutcome_name()) {
                    case "Failure":
                        try {
                            activity = Activity.getActivityByORMID(task.getActivity().getTo_activity_if_failure());
                        } catch (NullPointerException npe) {
                        }
                        break;
                    case "Success":
                        try {
                            activity = Activity.getActivityByORMID(task.getActivity().getTo_activity_if_success());
                        } catch (NullPointerException npe) {
                        }
                        break;
                }
            }
            if (task.getActivity().getIs_final().equals("No")) {
                Task nextTask = new Task();
                nextTask.setActivity(activity);
                nextTask.setTask_status("Pending");
                nextTask.setStaff(task.getStaff());
                /**
                 * Add flag date
                 */
                Calendar currentDate = Calendar.getInstance();
                currentDate.setTime(new Date());
                nextTask.setFlag_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, activity.getFlag_after()).getTime().getTime()));
                /**
                 * Add flag date
                 */
                /**
                 * Add Due date
                 */
                currentDate.setTime(new Date());
                nextTask.setDue_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, activity.getDuration()).getTime().getTime()));
                /**
                 * Add Due date
                 */
                nextTask.setAssigned_user(loginBean.getUser_detail());
                /**
                 * Create next task if any
                 */
                createTask(nextTask);
            }
            task.setComplete_date(new Timestamp(new Date().getTime()));
            task.setCompleted_by(loginBean.getUser_detail());
            task.setTask_status("Completed");
            if (approval_date != null) {
                task.setApproval_date(new Timestamp(approval_date.getTime()));
            }
            /**
             * Edit and complete current task
             */
            editTask(task);

            /**
             * Add Task Documents
             */
            PersistentTransaction t;
            for (Task_document t1 : task_documentList) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                if (t1.getTask_document_id() > 0) {
                    t1.setTask(task);
                    ISMSPersistentManager.instance().getSession().merge(t1);
                } else {
                    t1.setTask(task);
                    t1.save();
                }
                t.commit();
            }

            /**
             * Add Current Staff Documents
             */
            for (Task_document t1 : task_documentList) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                Current_staff_documents current_staff_document = Current_staff_documents.loadCurrent_staff_documentsByQuery("document_type_id=" + t1.getDocument_type().getDocument_type_id() + " AND staff_id=" + task.getStaff().getStaff_id(), null);
                
                String aDirectionReason = "";
                String aDirection = "";
                aDirection = t1.getDirection();
                try {
                    aDirectionReason = t1.getTask().getActivity().getActivity_name();
                } catch (NullPointerException npe) {
                }
                
                if (current_staff_document != null) {
                    current_staff_document.setCurrent_direction(aDirection);
                    current_staff_document.setCurrent_direction_reason(aDirectionReason);
                    current_staff_document.setTask_document(t1);
                    ISMSPersistentManager.instance().getSession().merge(current_staff_document);
                } else {
                    current_staff_document = new Current_staff_documents();
                    current_staff_document.setCurrent_direction(aDirection);
                    current_staff_document.setCurrent_direction_reason(aDirectionReason);
                    current_staff_document.setDocument_type(t1.getDocument_type());
                    current_staff_document.setStaff(task.getStaff());
                    current_staff_document.setTask_document(t1);
                    ISMSPersistentManager.instance().getSession().merge(current_staff_document);
                }
                t.commit();
            }
            approval_date = null;
            setemailto();
            ISMSPersistentManager.instance().getSession().evict(task);
            task = null;
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showEmailDialog() {
//        RequestContext.getCurrentInstance().update(":sendemailform");
//        RequestContext.getCurrentInstance().execute("PF('sendemail').show();");
    }
    
    public void showEmailStaffDocumentDialog(List<Current_staff_documents> current_staff_documentsList) {
        if (current_staff_documentsList.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please select atleast one document!");
            FacesContext.getCurrentInstance().addMessage("Validation", message);
            return;
        }
        RequestContext.getCurrentInstance().update(":sendemailform");
        RequestContext.getCurrentInstance().execute("PF('EmailDlg').show();");
    }
    
    public void setemailto() {
        if (task != null) {
            try {
                List<Company_contact> company_contactList = Company_contact.queryCompany_contact("company_id=" + task.getStaff().getCompany().getCompany_id(), null);
                int counter = 0;
                for (Company_contact c : company_contactList) {
                    if (counter == 0) {
                        emailto = c.getContact_email();
                    } else {
                        emailto = emailto + "," + c.getContact_email();
                    }
                }
                emailcopyto = "info@wingersoft.co.ug";
                emailsubject = task.getActivity().getActivity_name() + " Complete for " + task.getStaff().getPp_surname() + " " + task.getStaff().getPp_given_names();
                emailtask_documentList = task_documentList;
            } catch (PersistentException ex) {
                Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void setemailto(List<Current_staff_documents> current_staff_documentsList, Staff staff) {
        if (current_staff_documentsList.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please select atleast one document!");
            FacesContext.getCurrentInstance().addMessage("Validation", message);
            return;
        }
        try {
            List<Company_contact> company_contactList = Company_contact.queryCompany_contact("company_id=" + staff.getCompany().getCompany_id(), null);
            int counter = 0;
            for (Company_contact c : company_contactList) {
                if (counter == 0) {
                    emailto = c.getContact_email();
                } else {
                    emailto = emailto + "," + c.getContact_email();
                }
            }
            emailcopyto = "info@wingersoft.co.ug";
            //emailsubject = task.getActivity().getActivity_name() + " Complete for " + task.getStaff().getPp_surname() + " " + task.getStaff().getPp_given_names();
            emailtask_documentList = new ArrayList<>();
            for (Current_staff_documents c : current_staff_documentsList) {
                emailtask_documentList.add(c.getTask_document());
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sendEmail() {
        try {
            String from = "newtonajuna@wingersoft.co.ug";
            String to = emailto;
            String subject = emailsubject;
            String message = emailmessage;
            SendMail sendMail = new SendMail(from, to, subject, message, emailtask_documentList);
            sendMail.send();
            RequestContext.getCurrentInstance().execute("PF('sendemail').hide();");
            clearmailparameters();
        } catch (Exception e) {
            
        }
    }
    
    public void closeEmailDialog() {
        RequestContext.getCurrentInstance().execute("PF('EmailDlg').hide()");
    }
    
    public void clearmailparameters() {
        emailcopyto = "";
        emailmessage = "";
        emailsubject = "";
        emailto = "";
    }
    
    public void closeDialog() {
        RequestContext.getCurrentInstance().execute("PF('sendemail').hide();");
    }
    
    public void populatedocumentlist() {
        task_documentList = new ArrayList<>();
        try {
            List<Task_document> task_documents = Task_document.queryTask_document("task_id=" + task.getTask_id(), null);
            task_documentList.addAll(task_documents);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calldialog() {
        populatedocumentlist();
        Map<String, Object> options = new HashMap<>();
        options.put("height", 500);
        options.put("width", 700);
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("taskdialog", options, null);
    }
    
    public void ontaskDocumentChosen(SelectEvent event) {
        Task_document t = (Task_document) event.getObject();
        boolean exists = false;
        for (Task_document t1 : task_documentList) {
            if (t1.getDocument_type().getDocument_type_id() == t.getDocument_type().getDocument_type_id()) {
                task_documentList.remove(t1);
                task_documentList.add(t);
                exists = true;
                break;
            }
        }
        if (!exists) {
            task_documentList.add(t);
        }
    }
    
    public void closeDialog(Task task) {
        RequestContext.getCurrentInstance().closeDialog(task);
    }
    
    private Task task;
    
    public Task getTask() {
        return task;
    }
    
    public void setTask(Task task) {
        this.task = task;
    }
    
    private PieChartModel documentsModel;
    
    public PieChartModel getDocumentsModel() {
        documentsModel = new PieChartModel();
        documentsModel.set("Flagged Documents", flaggedDocuments.size());
        documentsModel.set("Expired Documents", expiredDocuments.size());
        documentsModel.setTitle("Documents");
        documentsModel.setLegendPosition("w");
        documentsModel.setShowDataLabels(true);
        return documentsModel;
    }
    
    public void setDocumentsModel(PieChartModel documentsModel) {
        this.documentsModel = documentsModel;
    }
    
    private PieChartModel tasksModel;
    
    public PieChartModel getTasksModel() {
        tasksModel = new PieChartModel();
        tasksModel.set("Pending Tasks", pendingTasks.size());
        tasksModel.set("Flagged Tasks", flaggedTasks.size());
        tasksModel.set("Overdue Tasks", overDueTasks.size());
        tasksModel.setTitle("Tasks");
        tasksModel.setLegendPosition("w");
        tasksModel.setShowDataLabels(true);
        return tasksModel;
    }
    
    public void setTasksModel(PieChartModel tasksModel) {
        this.tasksModel = tasksModel;
    }
    
    public void cancelcloseDialog() {
        RequestContext.getCurrentInstance().execute("PF('VerifyDlg').hide()");
        task.setAgent(null);
        //agent = null;
        //formstate = "view";
    }
    private Agent agent;
    
    public Agent getAgent() {
        return agent;
    }
    
    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    
    public void setagent() {
        this.agent = task.getAgent();
        this.agent.setCurrentaction("verify");
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            ISMSPersistentManager.instance().getSession().merge(agent);
            t.commit();
//        Map<String, Object> options = new HashMap<>();
//        options.put("height", 400);
//        options.put("width", 700);
//        options.put("modal", true);
//        org.primefaces.context.RequestContext.getCurrentInstance().openDialog("fingerprintenrolldialog", options, null);
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkAgentStatus() {
        try {
            if (task.getAgent() != null) {
                try {
                    //DBConnection.readConnectionConfigurations();
                    FingerDB db = new FingerDB(DBConnection.getMySQL_DB_HOST_IP_OR_NAME(), DBConnection.getMySQL_DB_NAME(), DBConnection.getMySQL_USER(), DBConnection.getMySQL_PASSWORD());
                    db.Open();
                    if (db.CurrentAction(task.getAgent().getAgent_id()) == false) {
                        RequestContext.getCurrentInstance().execute("PF('VerifyDlg').hide()");
                        agent = null;
                    }
                    db.Close();
                } catch (SQLException ex) {
                    Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (NullPointerException npe) {
            
        }
    }

    /**
     * @return the inDocuments
     */
    public List<Current_staff_documents> getInDocuments() {
        try {
            inDocuments = new ArrayList<>();
            inDocuments = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery("select csd from Current_staff_documents csd where (csd.is_deleted='no' or csd.is_deleted is null) and csd.current_direction='IN'").list();
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inDocuments;
    }

    /**
     * @param inDocuments the inDocuments to set
     */
    public void setInDocuments(List<Current_staff_documents> inDocuments) {
        this.inDocuments = inDocuments;
    }

    /**
     * @return the outDocuments
     */
    public List<Current_staff_documents> getOutDocuments() {
        try {
            outDocuments = new ArrayList<>();
            outDocuments = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery("select csd from Current_staff_documents csd where (csd.is_deleted='no' or csd.is_deleted is null) and csd.current_direction='OUT'").list();
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outDocuments;
    }

    /**
     * @param outDocuments the outDocuments to set
     */
    public void setOutDocuments(List<Current_staff_documents> outDocuments) {
        this.outDocuments = outDocuments;
    }

    /**
     * @return the staffWithoutDocumentType
     */
    public List<Staff> getStaffWithoutDocumentType() {
        String DocTypeLevelIdList = "";
        int DocTypeLevelIdCount = 0;
        String DocTypeIdList = "";
        int DocTypeIdCount = 0;
        
        try {
            DocTypeLevelIdCount = this.SelectedDocumentTypeLevels.length;
            if (DocTypeLevelIdCount > 0) {
                int i = 0;
                int n = DocTypeLevelIdCount;
                DocTypeLevelIdList = "";
                while (i < n) {
                    if (i == 0) {
                        DocTypeLevelIdList = DocTypeLevelIdList + "" + this.SelectedDocumentTypeLevels[i];
                    } else {
                        DocTypeLevelIdList = DocTypeLevelIdList + "," + this.SelectedDocumentTypeLevels[i];
                    }
                    i = i + 1;
                }
            }
        } catch (NullPointerException npe) {
            
        }
        
        try {
            DocTypeIdCount = this.SelectedDocumentTypes.length;
            if (DocTypeIdCount > 0) {
                int i = 0;
                int n = DocTypeIdCount;
                DocTypeIdList = "";
                while (i < n) {
                    if (i == 0) {
                        DocTypeIdList = DocTypeIdList + "" + this.SelectedDocumentTypes[i];
                    } else {
                        DocTypeIdList = DocTypeIdList + "," + this.SelectedDocumentTypes[i];
                    }
                    i = i + 1;
                }
            }
        } catch (NullPointerException npe) {
            DocTypeIdCount = 0;
        }
        
        try {
            staffWithoutDocumentType = new ArrayList<>();
            String sql = "";
            String aWhere = "";
            if (DocTypeLevelIdList.length() > 0 && DocTypeIdList.length() == 0) {
                aWhere = "dt.document_type_level IN (" + DocTypeLevelIdList + ")";
            } else if (DocTypeLevelIdList.length() == 0 && DocTypeIdList.length() > 0) {
                aWhere = "dt.document_type_id IN (" + DocTypeIdList + ")";
            } else {
                aWhere = "";
            }
            
            if (aWhere.length() > 0) {
                sql = "select s from Staff s where s.is_active='Yes' and s.staff_id NOT IN"
                        + "("
                        + " select c.staff from Current_staff_documents c "
                        + " inner join c.staff s2 "
                        + " inner join c.document_type dt "
                        + " where (c.is_deleted='No' or c.is_deleted is null) and " + aWhere
                        + ")";
                staffWithoutDocumentType = (List<Staff>) ISMSPersistentManager.instance().getSession().createQuery(sql).list();
            } else {
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return staffWithoutDocumentType;
    }

    /**
     * @param staffWithoutDocumentType the staffWithoutDocumentType to set
     */
    public void setStaffWithoutDocumentType(List<Staff> staffWithoutDocumentType) {
        this.staffWithoutDocumentType = staffWithoutDocumentType;
    }

    /**
     * @return the TempDocumentTypeLevel
     */
    public int getTempDocumentTypeLevel() {
        return TempDocumentTypeLevel;
    }

    /**
     * @param TempDocumentTypeLevel the TempDocumentTypeLevel to set
     */
    public void setTempDocumentTypeLevel(int TempDocumentTypeLevel) {
        this.TempDocumentTypeLevel = TempDocumentTypeLevel;
    }

    /**
     * @return the TempDocumentType
     */
    public Document_type getTempDocumentType() {
        return TempDocumentType;
    }

    /**
     * @param TempDocumentType the TempDocumentType to set
     */
    public void setTempDocumentType(Document_type TempDocumentType) {
        this.TempDocumentType = TempDocumentType;
    }

    /**
     * @return the SelectedDocumentTypeLevels
     */
    public String[] getSelectedDocumentTypeLevels() {
        return SelectedDocumentTypeLevels;
    }

    /**
     * @param SelectedDocumentTypeLevels the SelectedDocumentTypeLevels to set
     */
    public void setSelectedDocumentTypeLevels(String[] SelectedDocumentTypeLevels) {
        this.SelectedDocumentTypeLevels = SelectedDocumentTypeLevels;
    }

    /**
     * @return the SelectedDocumentTypes
     */
    public String[] getSelectedDocumentTypes() {
        return SelectedDocumentTypes;
    }

    /**
     * @param SelectedDocumentTypes the SelectedDocumentTypes to set
     */
    public void setSelectedDocumentTypes(String[] SelectedDocumentTypes) {
        this.SelectedDocumentTypes = SelectedDocumentTypes;
    }

    /**
     * @return the staffWithDocumentType
     */
    public List<Staff> getStaffWithDocumentType() {
        String DocTypeLevelIdList = "";
        int DocTypeLevelIdCount = 0;
        String DocTypeIdList = "";
        int DocTypeIdCount = 0;
        
        try {
            DocTypeLevelIdCount = this.SelectedDocumentTypeLevels.length;
            if (DocTypeLevelIdCount > 0) {
                int i = 0;
                int n = DocTypeLevelIdCount;
                DocTypeLevelIdList = "";
                while (i < n) {
                    if (i == 0) {
                        DocTypeLevelIdList = DocTypeLevelIdList + "" + this.SelectedDocumentTypeLevels[i];
                    } else {
                        DocTypeLevelIdList = DocTypeLevelIdList + "," + this.SelectedDocumentTypeLevels[i];
                    }
                    i = i + 1;
                }
            }
        } catch (NullPointerException npe) {
            
        }
        
        try {
            DocTypeIdCount = this.SelectedDocumentTypes.length;
            if (DocTypeIdCount > 0) {
                int i = 0;
                int n = DocTypeIdCount;
                DocTypeIdList = "";
                while (i < n) {
                    if (i == 0) {
                        DocTypeIdList = DocTypeIdList + "" + this.SelectedDocumentTypes[i];
                    } else {
                        DocTypeIdList = DocTypeIdList + "," + this.SelectedDocumentTypes[i];
                    }
                    i = i + 1;
                }
            }
        } catch (NullPointerException npe) {
            DocTypeIdCount = 0;
        }
        
        try {
            staffWithDocumentType = new ArrayList<>();
            String sql = "";
            String aWhere = "";
            if (DocTypeLevelIdList.length() > 0 && DocTypeIdList.length() == 0) {
                aWhere = "dt.document_type_level IN (" + DocTypeLevelIdList + ")";
            } else if (DocTypeLevelIdList.length() == 0 && DocTypeIdList.length() > 0) {
                aWhere = "dt.document_type_id IN (" + DocTypeIdList + ")";
            } else {
                aWhere = "";
            }
            
            if (aWhere.length() > 0) {
                sql = "select s from Staff s where s.is_active='Yes' and s.staff_id IN"
                        + "("
                        + " select c.staff from Current_staff_documents c "
                        + " inner join c.staff s2 "
                        + " inner join c.document_type dt "
                        + " where (c.is_deleted='No' or c.is_deleted is null) and " + aWhere
                        + ")";
                staffWithDocumentType = (List<Staff>) ISMSPersistentManager.instance().getSession().createQuery(sql).list();
            } else {
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffWithDocumentType;
    }

    /**
     * @param staffWithDocumentType the staffWithDocumentType to set
     */
    public void setStaffWithDocumentType(List<Staff> staffWithDocumentType) {
        this.staffWithDocumentType = staffWithDocumentType;
    }
    
    public String retrieveCSDbyStaffDocType(int aStaffId, int aDocumentTypeId) {
        String sql = "";
        String IsFound = "";
        sql = "select csd from Current_staff_documents csd where (csd.is_deleted='no' or csd.is_deleted is null) and csd.staff=" + aStaffId + " and csd.document_type=" + aDocumentTypeId;
        try {
            tempCurrentStaffDocuments = new ArrayList<>();
            tempCurrentStaffDocuments = (List<Current_staff_documents>) ISMSPersistentManager.instance().getSession().createQuery(sql).list();
            if (tempCurrentStaffDocuments.size() > 0) {
                IsFound = "Yv";
                try {
                    if (new Date().after(tempCurrentStaffDocuments.get(0).getTask_document().getExpiry_date())) {
                        IsFound = "Ye";
                    }
                } catch (NullPointerException npe) {
                }
            } else {
                IsFound = "N";
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return IsFound;
    }

    /**
     * @return the tempCurrentStaffDocuments
     */
    public List<Current_staff_documents> getTempCurrentStaffDocuments() {
        return tempCurrentStaffDocuments;
    }

    /**
     * @param tempCurrentStaffDocuments the tempCurrentStaffDocuments to set
     */
    public void setTempCurrentStaffDocuments(List<Current_staff_documents> tempCurrentStaffDocuments) {
        this.tempCurrentStaffDocuments = tempCurrentStaffDocuments;
    }
}
