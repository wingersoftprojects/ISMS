/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Accommodation_type;
import entityclasses.Activity;
import entityclasses.Activity_cost;
import entityclasses.Activity_document;
import entityclasses.Activity_group;
import entityclasses.Activity_outcome;
import entityclasses.Agency;
import entityclasses.Agent;
import entityclasses.Agent_type;
import entityclasses.Air_ticket_type;
import entityclasses.Approval_type;
import entityclasses.Company;
import entityclasses.Currency_type;
import entityclasses.Document_type;
import entityclasses.Exit_mode;
import entityclasses.Group_detail;
import entityclasses.Group_right;
import entityclasses.Group_user;
import entityclasses.Leave_type;
import entityclasses.Nationality;
import entityclasses.Outcome;
import entityclasses.Staff;
import entityclasses.Staff_type;
import entityclasses.Task;
import entityclasses.Task_document;
import entityclasses.User_detail;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@ApplicationScoped
public class ListBean implements Serializable {

    private List<Exit_mode> exit_modeList;

    public List<Exit_mode> getExit_modeList() {
        return exit_modeList;
    }

    public void setExit_modeList(List<Exit_mode> exit_modeList) {
        this.exit_modeList = exit_modeList;
    }
    private List<Accommodation_type> accommodation_typeList;

    public List<Accommodation_type> getAccommodation_typeList() {
        return accommodation_typeList;
    }

    public void setAccommodation_typeList(List<Accommodation_type> accommodation_typeList) {
        this.accommodation_typeList = accommodation_typeList;
    }
    private List<Activity> activityList;

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }
    private List<Activity_cost> activity_costList;

    public List<Activity_cost> getActivity_costList() {
        return activity_costList;
    }

    public void setActivity_costList(List<Activity_cost> activity_costList) {
        this.activity_costList = activity_costList;
    }
    private List<Document_type> document_typeList;

    public List<Document_type> getDocument_typeList() {
        return document_typeList;
    }

    public void setDocument_typeList(List<Document_type> document_typeList) {
        this.document_typeList = document_typeList;
    }

    private List<Activity_document> activity_documentList;

    public List<Activity_document> getActivity_documentList() {
        return activity_documentList;
    }

    public void setActivity_documentList(List<Activity_document> activity_documentList) {
        this.activity_documentList = activity_documentList;
    }
    private List<Activity_group> activity_groupList;

    public List<Activity_group> getActivity_groupList() {
        return activity_groupList;
    }

    public void setActivity_groupList(List<Activity_group> activity_groupList) {
        this.activity_groupList = activity_groupList;
    }
    private List<Group_detail> group_detailList;

    public List<Group_detail> getGroup_detailList() {
        return group_detailList;
    }

    public void setGroup_detailList(List<Group_detail> group_detailList) {
        this.group_detailList = group_detailList;
    }

    private List<Activity_outcome> activity_outcomeList;

    public List<Activity_outcome> getActivity_outcomeList() {
        return activity_outcomeList;
    }

    public void setActivity_outcomeList(List<Activity_outcome> activity_outcomeList) {
        this.activity_outcomeList = activity_outcomeList;
    }
    private List<Agency> agencyList;

    public List<Agency> getAgencyList() {
        return agencyList;
    }

    public void setAgencyList(List<Agency> agencyList) {
        this.agencyList = agencyList;
    }

    private List<Outcome> outcomeList;

    public List<Outcome> getOutcomeList() {
        return outcomeList;
    }

    public void setOutcomeList(List<Outcome> outcomeList) {
        this.outcomeList = outcomeList;
    }

    private List<Agent> agentList;

    public List<Agent> getAgentList() {
        return agentList;
    }

    public void setAgentList(List<Agent> agentList) {
        this.agentList = agentList;
    }
    private List<Agent_type> agent_typeList;

    public List<Agent_type> getAgent_typeList() {
        return agent_typeList;
    }

    public void setAgent_typeList(List<Agent_type> agent_typeList) {
        this.agent_typeList = agent_typeList;
    }
    private List<Air_ticket_type> air_ticket_type;

    public List<Air_ticket_type> getAir_ticket_typeList() {
        return air_ticket_type;
    }

    public void setAir_ticket_typeList(List<Air_ticket_type> air_ticket_type) {
        this.air_ticket_type = air_ticket_type;
    }
    private List<Approval_type> approval_typeList;

    public List<Approval_type> getApproval_typeList() {
        return approval_typeList;
    }

    public void setApproval_typeList(List<Approval_type> approval_typeList) {
        this.approval_typeList = approval_typeList;
    }
    private List<Company> companyList;

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }
    private List<Currency_type> currency_typeList;

    public List<Currency_type> getCurrency_typeList() {
        return currency_typeList;
    }

    public void setCurrency_typeList(List<Currency_type> currency_typeList) {
        this.currency_typeList = currency_typeList;
    }
    private List<Group_right> group_rightList;

    public List<Group_right> getGroup_rightList() {
        return group_rightList;
    }

    public void setGroup_rightList(List<Group_right> group_rightList) {
        this.group_rightList = group_rightList;
    }
    private List<Group_user> group_userList;

    public List<Group_user> getGroup_userList() {
        return group_userList;
    }

    public void setGroup_userList(List<Group_user> group_userList) {
        this.group_userList = group_userList;
    }
    private List<Leave_type> leave_typeList;

    public List<Leave_type> getLeave_typeList() {
        return leave_typeList;
    }

    public void setLeave_typeList(List<Leave_type> leave_typeList) {
        this.leave_typeList = leave_typeList;
    }
    private List<Nationality> nationalityList;

    public List<Nationality> getNationalityList() {
        return nationalityList;
    }

    public void setNationalityList(List<Nationality> nationalityList) {
        this.nationalityList = nationalityList;
    }

    private List<Staff> staffList;

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    private List<Staff_type> staff_typeList;

    public List<Staff_type> getStaff_typeList() {
        return staff_typeList;
    }

    public void setStaff_typeList(List<Staff_type> staff_typeList) {
        this.staff_typeList = staff_typeList;
    }
    private List<Task_document> task_documentList;

    public List<Task_document> getTask_documentList() {
        return task_documentList;
    }

    public void setTask_documentList(List<Task_document> task_documentList) {
        this.task_documentList = task_documentList;
    }
//    private List<Task_status> task_statusList;
//
//    public List<Task_status> getTask_statusList() {
//        return task_statusList;
//    }
//
//    public void setTask_statusList(List<Task_status> task_statusList) {
//        this.task_statusList = task_statusList;
//    }

    private List<User_detail> user_detailList;

    public List<User_detail> getUser_detailList() {
        return user_detailList;
    }

    public void setUser_detailList(List<User_detail> user_detailList) {
        this.user_detailList = user_detailList;
    }

    private List<Task> taskList;

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    

    public ListBean() {
        try {
            exit_modeList = null;
            exit_modeList = Exit_mode.queryExit_mode(null, "exit_mode_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            accommodation_typeList = null;
            accommodation_typeList = Accommodation_type.queryAccommodation_type(null, "accommodation_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activityList = null;
            activityList = Activity.queryActivity(null, "activity_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_costList = null;
            activity_costList = Activity_cost.queryActivity_cost(null, "activity_cost_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            document_typeList = null;
            document_typeList = Document_type.queryDocument_type(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_documentList = null;
            activity_documentList = Activity_document.queryActivity_document(null, "activity_document_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_groupList = null;
            activity_groupList = Activity_group.queryActivity_group(null, "activity_group_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_detailList = null;
            group_detailList = Group_detail.queryGroup_detail(null, "group_detail_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_outcomeList = null;
            activity_outcomeList = Activity_outcome.queryActivity_outcome(null, "activity_outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agencyList = null;
            agencyList = Agency.queryAgency(null, "agency_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(AgencyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            outcomeList = null;
            outcomeList = Outcome.queryOutcome(null, "outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agentList = null;
            agentList = Agent.queryAgent(null, "agent_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agent_typeList = null;
            agent_typeList = Agent_type.queryAgent_type(null, "agent_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            air_ticket_type = null;
            air_ticket_type = Air_ticket_type.queryAir_ticket_type(null, "air_ticket_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            approval_typeList = null;
            approval_typeList = Approval_type.queryApproval_type(null, "approval_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            companyList = null;
            companyList = Company.queryCompany(null, "company_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            currency_typeList = null;
            currency_typeList = Currency_type.queryCurrency_type(null, "currency_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_rightList = null;
            group_rightList = Group_right.queryGroup_right(null, "group_right_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_userList = null;
            group_userList = Group_user.queryGroup_user(null, "group_user_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            leave_typeList = null;
            leave_typeList = Leave_type.queryLeave_type(null, "leave_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            nationalityList = null;
            nationalityList = Nationality.queryNationality(null, "nationality_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            staffList = null;
            staffList = Staff.queryStaff(null, "staff_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            staff_typeList = null;
            staff_typeList = Staff_type.queryStaff_type(null, "staff_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            task_documentList = null;
            task_documentList = Task_document.queryTask_document(null, "task_document_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
//        try {
//            task_statusList = null;
//            task_statusList = Task_status.queryTask_status(null, "task_status_id desc");
//        } catch (PersistentException ex) {
//            Logger.getLogger(Task_statusBean.class.getName()).log(Level.SEVERE, null, ex);
//            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
//            GeneralUtilities.clearsession();
//        }
        try {
            user_detailList = null;
            user_detailList = User_detail.queryUser_detail(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            taskList = Task.queryTask("task_status='Pending'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

    }

    public void refreshlists(String list) {
        if (list.equals("Exit_mode")) {
            try {
                exit_modeList = Exit_mode.queryExit_mode(null, "exit_mode_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Accommodation_type")) {
            try {
                accommodation_typeList = null;
                accommodation_typeList = Accommodation_type.queryAccommodation_type(null, "accommodation_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Activity")) {
            try {
                activityList = null;
                activityList = Activity.queryActivity(null, "activity_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Activity_cost")) {
            try {
                activity_costList = null;
                activity_costList = Activity_cost.queryActivity_cost(null, "activity_cost_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Document_type")) {
            try {
                document_typeList = null;
                document_typeList = Document_type.queryDocument_type(null, null);
            } catch (PersistentException ex) {
                Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Activity_document")) {
            try {
                activity_documentList = null;
                activity_documentList = Activity_document.queryActivity_document(null, "activity_document_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Activity_group")) {
            try {
                activity_groupList = null;
                activity_groupList = Activity_group.queryActivity_group(null, "activity_group_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Group_detail")) {
            try {
                group_detailList = null;
                group_detailList = Group_detail.queryGroup_detail(null, "group_detail_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Activity_outcome")) {
            try {
                activity_outcomeList = null;
                activity_outcomeList = Activity_outcome.queryActivity_outcome(null, "activity_outcome_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Agency")) {
            try {
                agencyList = null;
                agencyList = Agency.queryAgency(null, "agency_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(AgencyBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Outcome")) {
            try {
                outcomeList = null;
                outcomeList = Outcome.queryOutcome(null, "outcome_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Agent")) {
            try {
                agentList = null;
                agentList = Agent.queryAgent(null, "agent_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Agent_type")) {
            try {
                agent_typeList = null;
                agent_typeList = Agent_type.queryAgent_type(null, "agent_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Air_ticket_type")) {
            try {
                air_ticket_type = null;
                air_ticket_type = Air_ticket_type.queryAir_ticket_type(null, "air_ticket_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Approval_type")) {
            try {
                approval_typeList = null;
                approval_typeList = Approval_type.queryApproval_type(null, "approval_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Company")) {
            try {
                companyList = null;
                companyList = Company.queryCompany(null, "company_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Currency_type")) {
            try {
                currency_typeList = null;
                currency_typeList = Currency_type.queryCurrency_type(null, "currency_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Group_right")) {
            try {
                group_rightList = null;
                group_rightList = Group_right.queryGroup_right(null, "group_right_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Group_user")) {
            try {
                group_userList = null;
                group_userList = Group_user.queryGroup_user(null, "group_user_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Leave_type")) {
            try {
                leave_typeList = null;
                leave_typeList = Leave_type.queryLeave_type(null, "leave_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Nationality")) {
            try {
                nationalityList = null;
                nationalityList = Nationality.queryNationality(null, "nationality_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Staff")) {
            try {
                staffList = null;
                staffList = Staff.queryStaff(null, "staff_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Staff_type")) {
            try {
                staff_typeList = null;
                staff_typeList = Staff_type.queryStaff_type(null, "staff_type_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Task_document")) {
            try {
                task_documentList = null;
                task_documentList = Task_document.queryTask_document(null, "task_document_id desc");
            } catch (PersistentException ex) {
                Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
//        if (list.equals("Task_status")) {
//            try {
//                task_statusList = null;
//                task_statusList = Task_status.queryTask_status(null, "task_status_id desc");
//            } catch (PersistentException ex) {
//                Logger.getLogger(Task_statusBean.class.getName()).log(Level.SEVERE, null, ex);
//                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
//                GeneralUtilities.clearsession();
//            }
//        }
        if (list.equals("User_detail")) {
            try {
                user_detailList = null;
                user_detailList = User_detail.queryUser_detail(null, null);
            } catch (PersistentException ex) {
                Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        if (list.equals("Task")) {
            try {
                taskList = Task.queryTask("task_status='Pending'", null);
            } catch (PersistentException ex) {
                Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }

    }

    public void refreshalllists() {
        try {
            exit_modeList = null;
            exit_modeList = Exit_mode.queryExit_mode(null, "exit_mode_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Exit_modeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            accommodation_typeList = null;
            accommodation_typeList = Accommodation_type.queryAccommodation_type(null, "accommodation_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Accommodation_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activityList = null;
            activityList = Activity.queryActivity(null, "activity_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_costList = null;
            activity_costList = Activity_cost.queryActivity_cost(null, "activity_cost_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_costBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            document_typeList = null;
            document_typeList = Document_type.queryDocument_type(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_documentList = null;
            activity_documentList = Activity_document.queryActivity_document(null, "activity_document_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_groupList = null;
            activity_groupList = Activity_group.queryActivity_group(null, "activity_group_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_groupBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_detailList = null;
            group_detailList = Group_detail.queryGroup_detail(null, "group_detail_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            activity_outcomeList = null;
            activity_outcomeList = Activity_outcome.queryActivity_outcome(null, "activity_outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agencyList = null;
            agencyList = Agency.queryAgency(null, "agency_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(AgencyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            outcomeList = null;
            outcomeList = Outcome.queryOutcome(null, "outcome_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(OutcomeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agentList = null;
            agentList = Agent.queryAgent(null, "agent_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            agent_typeList = null;
            agent_typeList = Agent_type.queryAgent_type(null, "agent_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Agent_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            air_ticket_type = null;
            air_ticket_type = Air_ticket_type.queryAir_ticket_type(null, "air_ticket_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Air_ticket_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            approval_typeList = null;
            approval_typeList = Approval_type.queryApproval_type(null, "approval_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Approval_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            companyList = null;
            companyList = Company.queryCompany(null, "company_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            currency_typeList = null;
            currency_typeList = Currency_type.queryCurrency_type(null, "currency_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Currency_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_rightList = null;
            group_rightList = Group_right.queryGroup_right(null, "group_right_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            group_userList = null;
            group_userList = Group_user.queryGroup_user(null, "group_user_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_userBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            leave_typeList = null;
            leave_typeList = Leave_type.queryLeave_type(null, "leave_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Leave_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            nationalityList = null;
            nationalityList = Nationality.queryNationality(null, "nationality_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(NationalityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            staffList = null;
            staffList = Staff.queryStaff(null, "staff_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            staff_typeList = null;
            staff_typeList = Staff_type.queryStaff_type(null, "staff_type_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Staff_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            task_documentList = null;
            task_documentList = Task_document.queryTask_document(null, "task_document_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
//        try {
//            task_statusList = null;
//            task_statusList = Task_status.queryTask_status(null, "task_status_id desc");
//        } catch (PersistentException ex) {
//            Logger.getLogger(Task_statusBean.class.getName()).log(Level.SEVERE, null, ex);
//            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
//            GeneralUtilities.clearsession();
//        }
        try {
            user_detailList = null;
            user_detailList = User_detail.queryUser_detail(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(User_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        try {
            taskList = Task.queryTask("task_status='Pending'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
