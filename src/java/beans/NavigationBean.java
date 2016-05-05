/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author bajuna
 */
@ManagedBean
@ViewScoped
public class NavigationBean implements Serializable {

    @ManagedProperty("#{taskBean}")
    private TaskBean taskBean;

    public TaskBean getTaskBean() {
        return taskBean;
    }

    public void setTaskBean(TaskBean taskBean) {
        this.taskBean = taskBean;
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public String accommodation_type() {
        return "accommodation_type?faces-redirect=true";
    }

    public String activity() {
        return "activity?faces-redirect=true";
    }

    public String task() {
        return "task?faces-redirect=true";
    }

    public String createtask() {
        taskBean.add();
        return "createtask?faces-redirect=true";
    }

    public String activity_cost() {
        return "activity_cost?faces-redirect=true";
    }

    public String activity_document() {
        return "activity_document?faces-redirect=true";
    }

    public String activity_group() {
        return "activity_group?faces-redirect=true";
    }

    public String activity_outcome() {
        return "activity_outcome?faces-redirect=true";
    }

    public String agency() {
        return "agency?faces-redirect=true";
    }

    public String agent() {
        return "agent?faces-redirect=true";
    }

    public String agent_type() {
        return "agent_type?faces-redirect=true";
    }

    public String air_ticket_type() {
        return "air_ticket_type?faces-redirect=true";
    }

    public String approval_type() {
        return "approval_type?faces-redirect=true";
    }

    public String company() {
        return "company?faces-redirect=true";
    }

    public String currency_type() {
        return "currency_type?faces-redirect=true";
    }

    public String doc_preview_dialog() {
        return "doc_preview_dialog?faces-redirect=true";
    }

    public String document_type() {
        return "document_type?faces-redirect=true";
    }

    public String duration_type() {
        return "duration_type?faces-redirect=true";
    }

    public String exit_mode() {
        return "exit_mode?faces-redirect=true";
    }

    public String group_detail() {
        return "group_detail?faces-redirect=true";
    }

    public String group_right() {
        return "group_right?faces-redirect=true";
    }

    public String group_user() {
        return "group_user?faces-redirect=true";
    }

    public String index() {
        return "index?faces-redirect=true";
    }

    public String layout() {
        return "layout?faces-redirect=true";
    }

    public String leave_type() {
        return "leave_type?faces-redirect=true";
    }

    public String nationality() {
        return "nationality?faces-redirect=true";
    }

    public String outcome() {
        return "outcome?faces-redirect=true";
    }

    public String staff() {
        return "staff?faces-redirect=true";
    }
    public String doc_in_out() {
        return "doc_in_out?faces-redirect=true";
    }
    public String leave_transaction() {
        return "leave_transaction?faces-redirect=true";
    }

    public String staff_type() {
        return "staff_type?faces-redirect=true";
    }
    public String staff_post() {
        return "staff_post?faces-redirect=true";
    }

    public String task_document() {
        return "task_document?faces-redirect=true";
    }

    public String task_documentdialog() {
        return "task_documentdialog?faces-redirect=true";
    }

    public String task_status() {
        return "task_status?faces-redirect=true";
    }

    public String user_detail() {
        return "user_detail?faces-redirect=true";
    }
    
        public String report_staff_act_all() {
        return "report_staff_act_all?faces-redirect=true";
    }
        
            public String report_staff_act_dynamic() {
        return "report_staff_act_dynamic?faces-redirect=true";
    }
    
            public String report_activity_dynamic() {
        return "report_activity_dynamic?faces-redirect=true";
    }
    
    public String report_staff_act_co() {
        return "report_staff_act_co?faces-redirect=true";
    }
    
    public String report_staff_act_sex() {
        return "report_staff_act_sex?faces-redirect=true";
    }
    
    public String report_staff_act_type() {
        return "report_staff_act_type?faces-redirect=true";
    }
    
    public String report_staff_act_accom() {
        return "report_staff_act_accom?faces-redirect=true";
    }
    
    public String report_task_overdue_all() {
        return "report_task_overdue_all?faces-redirect=true";
    }
    
    public String report_task_pending_all() {
        return "report_task_pending_all?faces-redirect=true";
    }
    
    public String report_task_flagged_all() {
        return "report_task_flagged_all?faces-redirect=true";
    }
    
    public String report_leave_all() {
        return "report_leave_all?faces-redirect=true";
    }
    
    public String report_agent_act_all() {
        return "report_agent_act_all?faces-redirect=true";
    }
    
    public String report_agent_act_type() {
        return "report_agent_act_type?faces-redirect=true";
    }
    
    public String report_doc_expired_all() {
        return "report_doc_expired_all?faces-redirect=true";
    }
    public String report_doc_future_expiry_all() {
        return "report_doc_future_expiry_all?faces-redirect=true";
    }
    
    public String report_doc_flagged_all() {
        return "report_doc_flagged_all?faces-redirect=true";
    }
    
    public String report_doc_in_all() {
        return "report_doc_in_all?faces-redirect=true";
    }
    
    public String report_doc_out_all() {
        return "report_doc_out_all?faces-redirect=true";
    }
    
     public String report_staff_without_docs() {
        return "report_staff_without_doc_type?faces-redirect=true";
    }
     
     public String report_staff_with_docs() {
        return "report_staff_with_doc_type?faces-redirect=true";
    }

//    public void notLoggedInAccessDenied(ComponentSystemEvent event) {
//        NavMsg = "";
//        if (loginBean.isIsloggedin() == false) {
//            NavMsg = "Unauthorized access, contact system admin...";
//            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(NavMsg));
//            FacesContext fc = FacesContext.getCurrentInstance();
//            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
//            nav.performNavigation("login?faces-redirect=true");
//        }
//        if (loginBean.isIsloggedin() == false) {
//            NavMsg = "Unauthorized access, contact system admin...";
//            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(NavMsg));
//            FacesContext fc = FacesContext.getCurrentInstance();
//            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
//            nav.performNavigation("login?faces-redirect=true");
//        }
//    }
}
