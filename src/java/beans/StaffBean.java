/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Accommodation_type;
import entityclasses.Activity;
import entityclasses.Activity_document;
import entityclasses.Air_ticket_type;
import entityclasses.Company;
import entityclasses.Current_staff_documents;
import entityclasses.Staff;
import entityclasses.ISMSPersistentManager;
import entityclasses.Staff_salary;
import entityclasses.Staff_type;
import entityclasses.Task;
import entityclasses.Task_document;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class StaffBean implements Serializable {

    private int tabindex = 0;
    private Company company;
    private Staff_type staff_type;
    private Air_ticket_type air_ticket_type;
    private List<Staff> activeStaffByCompany;
    private LineChartModel activeStaffByCompanyModel;
    private List<Staff> activeStaffAll;
    private BarChartModel activeStaffAllModel;
    private List<Staff> activeStaffByType;
    private BarChartModel activeStaffByTypeModel;
    private List<Staff> activeStaffBySex;
    private BarChartModel activeStaffBySexModel;
    private Accommodation_type accommodation_type;
    private List<Staff> activeStaffByAccomType;
    private LineChartModel activeStaffByAccomTypeModel;
    private long CompanyId = 0;
    private long StaffTypeId = 0;
    private long AccommodationTypeId = 0;
    private long AirTicketTypeId = 0;
    private long StaffId = 0;
    private String SexName = "";
    private Current_staff_documents TempCurrent_staff_document;
    
    public int getTabindex() {
        return tabindex;
    }

    public void setTabindex(int tabindex) {
        this.tabindex = tabindex;
    }

    private Staff staff;
    private String formstate;
    private String UploadDocType;

    private String searchby = "";

    public String getSearchby() {
        return searchby;
    }

    public void setSearchby(String searchby) {
        this.searchby = searchby;
    }
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

    private List<Staff> filteredStaffs;

    public List<Staff> getFilteredStaffs() {
        return filteredStaffs;
    }

    public void setFilteredStaffs(List<Staff> filteredStaffs) {
        this.filteredStaffs = filteredStaffs;
    }

    public void ViewStaffDialog(Staff aStaff) {
//        try {
//            this.staff = aStaff;
//            //open the view in a dialog
//            Map<String, Object> options = new HashMap<String, Object>();
//            options.put("modal", true);
//            options.put("draggable", true);
//            options.put("resizable", true);
//            options.put("contentWidth", 800);
//            options.put("contentHeight",500);
//            options.put("scrollable", true);
//            org.primefaces.context.RequestContext.getCurrentInstance().openDialog("staff_view_dialog.xhtml", options, null);
//        } catch (NullPointerException npe) {
//
//        }
    }

    public List<Staff> completeStaff(String query) {
        List<Staff> filteredStaffList = new ArrayList<>();
        try {
            if (query.length() != 0) {
                filteredStaffList = Staff.queryStaff("pp_surname like '%" + query + "%' OR pp_given_names  like '%" + query + "%'", null);
            } else {
                filteredStaffList.clear();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filteredStaffList;
    }

    private int company_id;

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    private Date searchDate;

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }
    private String searchString = "";

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public void resetsearchvalues() {
        company_id = 0;
        searchDate = null;
        searchString = "";
    }

    public List<Staff> getStaffListFiltered() {
        try {
            staffList = null;
            if ((searchString == null || searchString.length() == 0) && company_id == 0 && searchDate == null) {
                staffList = Staff.queryStaff(null, "staff_id desc");
            } else if (searchby.equals("Dob") && searchDate != null) {
                String tempDate = new SimpleDateFormat("yyyy-MM-dd").format(searchDate);
                //staffList = Staff.queryStaff("pp_date_of_birth='" + tempDate + "'", "staff_id desc");
                //staffList = (List<Staff>) ISMSPersistentManager.instance().getSession().createQuery("select s from Staff s where s.pp_date_of_birth='" + tempDate + "'").list();
                //Staff.listStaffByCriteria(null)
                Criteria criteria = ISMSPersistentManager.instance().getSession().createCriteria(Staff.class);
                criteria.add(Restrictions.eq("pp_date_of_birth", searchDate));
                staffList = criteria.list();
            } else if (searchby.equals("Name")) {
                staffList = Staff.queryStaff("pp_surname='" + searchString + "' or pp_given_names like '%" + searchString + "%'", "staff_id desc");
            } else if (searchby.equals("Company")) {
                staffList = Staff.queryStaff("company_id=" + company_id, "pp_surname");
            } else if (searchby.equals("Passport")) {
                staffList = Staff.queryStaff("pp_passport_no='" + searchString + "'", "staff_id desc");
            } else {
                staffList = Staff.queryStaff(null, "staff_id desc");
            }
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return staffList;
    }

    private List<Staff> staffList;

    public List<Staff> getStaffList() {
        if (staffList == null) {
            init();
        }
        return staffList;
    }

    @PostConstruct
    public void init() {
//        try {
//            staffList = null;
//            staffList = Staff.queryStaff(null, "staff_id desc");
            staffList=this.getStaffListFiltered();
//        } catch (PersistentException ex) {
//            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
//            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
//            GeneralUtilities.clearsession();
//        }

    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public StaffBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void cancel() {
        if (staff != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(staff);
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        formstate = "view";
        this.staff_salary = null;
        staff_salary_formstate = "view";
        this.staff = null;
//        RequestContext context = RequestContext.getCurrentInstance();
//        context.execute("wiz.next();");
    }

    public void view(Staff object) {
        this.staff = object;
        formstate = "view";
        setCurrentStaffDocs();
        populatesalary();
    }

    public String viewexpireddocument(Staff object) {
        this.staff = object;
        formstate = "view";
        setCurrentStaffDocs();
        populatesalary();
        return "staff?faces-redirect=true";
    }

    public void delete(Staff object) {
        this.staff = object;
        setCurrentStaffDocs();
    }
    Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void add() {
        staff = new Staff();
        formstate = "add";
        setCurrentStaffDocs();
        getInitialActivity();
        staff_salarys = new ArrayList<>();
    }

    private void getInitialActivity() {
        try {
            activity = Activity.loadActivityByQuery("is_start='Yes'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void edit(Staff object) {
        this.staff = object;
        formstate = "edit";
        setCurrentStaffDocs();
        getInitialActivity();
        populatesalary();
    }

    private void populatesalary() {
        if (staff != null) {
            try {
                String sql = "select ss.* from staff_salary ss where ss.staff_id=" + staff.getStaff_id();
                List<Staff_salary> ses = ISMSPersistentManager.instance().getSession().createSQLQuery(sql).addEntity(Staff_salary.class).list();
                //List<Staff_salary> ses = Staff_salary.queryStaff_salary("staff_id=" + staff.getStaff_id(), null);
                staff_salarys = new ArrayList<>();
                for (Staff_salary s : ses) {
                    Staff_salary s1 = new Staff_salary();
                    s1.setCurrency_type(s.getCurrency_type());
                    s1.setSalary(s.getSalary());
                    s1.setStaff(s.getStaff());
                    s1.setStartdate(s.getStartdate());
                    s1.setEnddate(s.getEnddate());
                    s1.setIs_active(s.getIs_active());
                    s1.setEditting_id(s.getStaff_salary_id());
                    s1.setIs_net_or_gross(s.getIs_net_or_gross());
                    staff_salarys.add(s1);
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setFile(StreamedContent file) {
        this.file = file;
    }

    private StreamedContent file;

    public StreamedContent getFile(String filename) {
        InputStream stream;
        try {
            stream = new FileInputStream(new File("/docs" + filename));
            file = new DefaultStreamedContent(stream, null, filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return file;
    }

    public void task_documentdialog() {
        RequestContext.getCurrentInstance().openDialog("task_documentdialog", null, null);
    }

    private void setCurrentStaffDocs() {
        try {
            current_staff_documentsList = new ArrayList<>();
            Activity createstaffActivity = Activity.loadActivityByQuery("is_create_staff_activity='Yes'", null);
            if (staff != null) {
                switch (formstate) {
                    case "edit":
                    case "view":
                        try {
                            String sql = "select cs.* from current_staff_documents cs where (cs.is_deleted='no' or cs.is_deleted is null) and cs.staff_id=" + staff.getStaff_id();
                            List<Current_staff_documents> cs = ISMSPersistentManager.instance().getSession().createSQLQuery(sql).addEntity(Current_staff_documents.class).list();
                            //List<Current_staff_documents> cs = Current_staff_documents.queryCurrent_staff_documents("staff_id=" + staff.getStaff_id(), null);
                            //for (Current_staff_documents c : cs) {
                            current_staff_documentsList = cs;
                            //.add(c);
                            //}
                        } catch (PersistentException ex) {
                            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case "add":
                        if (createstaffActivity != null) {
                            List<Activity_document> activity_documentList = Activity_document.queryActivity_document("activity_id=" + createstaffActivity.getActivity_id(), null);
                            for (Activity_document activity_document : activity_documentList) {
                                if (activity_document.getIs_mandatory().equals("Yes")) {
                                    Current_staff_documents current_staff_document = new Current_staff_documents();
                                    current_staff_document.setDocument_type(activity_document.getDocument_type());
                                    current_staff_document.setStaff(staff);
                                    current_staff_document.setTask_document(null);
                                    current_staff_documentsList.add(current_staff_document);
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private List<Current_staff_documents> current_staff_documentsList;

    public void refreshCurrentStaffDocs(Staff aStaff) {
        try {
            current_staff_documentsList = new ArrayList<>();
            if (aStaff != null) {
                try {
                    String whereStr = "(is_deleted='no' or is_deleted is null) and staff_id=" + aStaff.getStaff_id();
                    current_staff_documentsList = Current_staff_documents.queryCurrent_staff_documents(whereStr, null);
                } catch (PersistentException ex) {
                    Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (NullPointerException npe) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, npe);
        }
    }

    public List<Current_staff_documents> getCurrent_staff_documentsList() {
        if (current_staff_documentsList != null) {
            if (current_staff_documentsList.isEmpty() && formstate.equals("view")) {
                setCurrentStaffDocs();
            }
        }
        return current_staff_documentsList;
    }

    public void setCurrent_staff_documentsList(List<Current_staff_documents> current_staff_documentsList) {
        this.current_staff_documentsList = current_staff_documentsList;
    }

    public void ontaskDocumentChosen(SelectEvent event) {
        Task_document t = (Task_document) event.getObject();
        Current_staff_documents current_staff_documents = new Current_staff_documents();
        current_staff_documents.setTask_document(t);
        current_staff_documents.setDocument_type(t.getDocument_type());
        boolean exists = false;
        int counter = 0;
        for (Current_staff_documents c : current_staff_documentsList) {
            if (c.getDocument_type().getDocument_type_id() == t.getDocument_type().getDocument_type_id()) {
                //current_staff_documentsList.remove(c);
                current_staff_documentsList.set(counter, current_staff_documents);
                //getCurrent_staff_documentsList().add(current_staff_documents);
                exists = true;
                break;
            }
            counter++;
        }
        if (!exists) {
            getCurrent_staff_documentsList().add(current_staff_documents);
        }
    }

    public void remove_current_staff_documents(Current_staff_documents c) {
        c.setIs_deleted("yes");
        c.setDelete_date(new Timestamp(new Date().getTime()));
        //current_staff_documentsList.remove(c);
    }

    @ManagedProperty("#{taskBean}")
    private TaskBean taskBean;

    public TaskBean getTaskBean() {
        return taskBean;
    }

    public void setTaskBean(TaskBean taskBean) {
        this.taskBean = taskBean;
    }

    private String staff_salary_formstate = "view";

    public String getStaff_salary_formstate() {
        return staff_salary_formstate;
    }

    public void setStaff_salary_formstate(String staff_salary_formstate) {
        this.staff_salary_formstate = staff_salary_formstate;
    }

    private Staff_salary staff_salary;

    public Staff_salary getStaff_salary() {
        return staff_salary;
    }

    public void cancel_staff_salary() {
        staff_salary_formstate = "view";
    }

    public void setStaff_salary(Staff_salary staff_salary) {
        this.staff_salary = staff_salary;
    }

    public void add_staff_salary() {
        staff_salary = new Staff_salary();
        staff_salary_formstate = "add";
    }

    public void edit_staff_salary(Staff_salary ss) {
        staff_salary = ss;
        staff_salary_formstate = "edit";
    }

    public void remove_staff_salary(Staff_salary ss) {
        int counter = 0;
        for (Staff_salary s : staff_salarys) {
            if (s.getCurrency_type().getCurrency_type_id() == ss.getCurrency_type().getCurrency_type_id()) {
                if (s.getEditting_id() == null) {
                    staff_salarys.remove(s);
                } else {
                    s.setIs_active("No");
                    staff_salarys.set(counter, s);
                }

            }
            counter++;
        }
        staff_salary_formstate = "view";
    }

    public void increment_staff_salary(Staff_salary ss) {
        int counter = 0;
        for (Staff_salary s : staff_salarys) {
            if (s.getCurrency_type().getCurrency_type_id() == ss.getCurrency_type().getCurrency_type_id()) {
                if (s.getEditting_id() == null) {
                    staff_salarys.remove(s);
                } else {
                    s.setIs_active("No");
                    s.setEnddate(new Date());
                    staff_salarys.set(counter, s);
                }

            }
            counter++;
        }
        add_staff_salary();
    }

    public void save_staff_salary() {
        if (staff_salary.getCurrency_type() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Currency Type!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (staff_salary.getSalary() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Salary!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (staff_salary.getStartdate() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Start Date!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        staff_salary.setStaff(staff);
        staff_salary.setIs_active("Yes");
        for (Staff_salary s : staff_salarys) {
            int counter = 0;
            if (s.getCurrency_type().getCurrency_type_id() == staff_salary.getCurrency_type().getCurrency_type_id() && (s.getEnddate() == null) || (s.getEnddate() != null && s.getEnddate().after(new Date()))) {
                //staff_salarys.remove(s);
                staff_salarys.set(counter, staff_salary);
                staff_salary_formstate = "view";
                return;
            }
            counter++;
        }
        staff_salarys.add(staff_salary);
        staff_salary_formstate = "view";
    }

    private List<Staff_salary> staff_salarys=new ArrayList<>();

    public List<Staff_salary> getStaff_salarys() {
        return staff_salarys;
    }

    public List<Staff_salary> filtered_salaryscurrent() {
        List<Staff_salary> tempList = new ArrayList<>();
        try {
            for (Staff_salary s : staff_salarys) {
                if (s.getIs_active().equals("Yes") && (s.getEnddate() == null || (s.getEnddate() != null && s.getEnddate().after(new Date())))) {
                    tempList.add(s);
                }
            }
        } catch (NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempList;
    }

    public List<Staff_salary> filtered_salaryshistory() {
        List<Staff_salary> tempList = new ArrayList<>();
        try {
            for (Staff_salary s : staff_salarys) {
                if (s.getEnddate() != null && s.getEnddate().before(new Date())) {
                    tempList.add(s);
                }
            }
        } catch (NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempList;
    }

    public void setStaff_salarys(List<Staff_salary> staff_salarys) {
        this.staff_salarys = staff_salarys;
    }

//    public void calldialogDocStatus(Current_staff_documents csd) {
//        try {
//            if (null != csd) {
//                this.setTempCurrent_staff_document(csd);
//                Map<String, Object> options = new HashMap<>();
//                options.put("modal", true);
//                org.primefaces.context.RequestContext.getCurrentInstance().openDialog("status_documentdialog", options, null);
//            }
//        } catch (NullPointerException npe) {
//        }
//    }
//    public void closeDialogDocStatus(Current_staff_documents csd) {
//        csd = null;
//        RequestContext.getCurrentInstance().closeDialog(csd);
//    }
    public void updateCurrentDocumentStatus(int csd_id, String csd_new_direction, String csd_new_direction_reason) {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Current_staff_documents csd = null;
            csd = Current_staff_documents.getCurrent_staff_documentsByORMID(csd_id);
            if (null != csd) {
                csd.setCurrent_direction(csd_new_direction);
                csd.setCurrent_direction_reason(csd_new_direction_reason);
                //System.out.println(csd_id + "," + csd.getCurrent_staff_documents_id() + "," + csd.getCurrent_direction() + "," + csd.getCurrent_direction_reason());
                ISMSPersistentManager.instance().getSession().merge(csd);
                t.commit();
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save", "Document status updated successfully!");
                FacesContext.getCurrentInstance().addMessage("Save", message);
                ISMSPersistentManager.instance().getSession().evict(csd);
                csd = null;
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void save() {
        boolean staffdocumentvalidation = false;
        String documentType = "";
        if (staff_salarys.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter Salary Details!");
            FacesContext.getCurrentInstance().addMessage("Validation", message);
            return;
        }

        for (Current_staff_documents current_staff_document : current_staff_documentsList) {
            if (current_staff_document.getTask_document() == null) {
                staffdocumentvalidation = true;
                documentType = current_staff_document.getDocument_type().getDoc_type_name();
                break;
            }
        }

        if (staffdocumentvalidation) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please upload the '" + documentType + "'!");
            //RequestContext.getCurrentInstance().showMessageInDialog(message);
            //FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please Upload the document '" + missingDocument + "'!", "Validation");
            //RequestContext.getCurrentInstance().showMessageInDialog(message);
            FacesContext.getCurrentInstance().addMessage("Validation", message);
            return;
        }

        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (staff.getStaff_id() > 0) {
                staff.setEdit_user(loginBean.getUser_detail());
                staff.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(staff);
            } else {
                staff.setAdd_date(new Timestamp(new Date().getTime()));
                staff.setAdd_user(loginBean.getUser_detail());
                staff.save();

            }
            t.commit();
            if ("add".equals(formstate)) {
                //RequestContext.getCurrentInstance().execute("PF('confirmation').show();");
            }
            for (Current_staff_documents c : current_staff_documentsList) {
                List<Current_staff_documents> old_docs = Current_staff_documents.queryCurrent_staff_documents("staff_id=" + staff.getStaff_id(), null);
                for (Current_staff_documents c1 : old_docs) {
                    if (c.getDocument_type().getDocument_type_id() == c1.getDocument_type().getDocument_type_id() && c1.getTask_document().getTask_document_id() != c.getTask_document().getTask_document_id()) {
                        t = ISMSPersistentManager.instance().getSession().beginTransaction();
                        Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Current_staff_documents where current_staff_documents_id= :current_staff_documents_id");
                        query.setParameter("current_staff_documents_id", c1.getCurrent_staff_documents_id());
                        int result = query.executeUpdate();
                        t.commit();
                    }
                }
            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();

            for (Current_staff_documents c : current_staff_documentsList) {
                c.setCurrent_direction(c.getTask_document().getDirection());
                Activity aCurrentActivity = null;
                try {
                    aCurrentActivity = c.getTask_document().getTask().getActivity();
                } catch (NullPointerException npe) {

                }
                if (aCurrentActivity != null) {
                    c.setCurrent_direction_reason(aCurrentActivity.getActivity_name());
                } else {
                    c.setCurrent_direction_reason("Folder Update");
                }

                if (c.getORMID() > 0) {
                    ISMSPersistentManager.instance().getSession().merge(c);
                } else {
                    c.setStaff(staff);
                    c.save();
                }
            }
//            if (result > 0) {
//                System.out.println("Expensive products was removed");
//            }
            t.commit();

            /**
             * Process Staff Salary
             */
            if (staff.getStaff_id() > 0) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Staff_salary where staff_id= :staff_id");
                query.setParameter("staff_id", staff.getStaff_id());
                int result = query.executeUpdate();
                t.commit();
            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();
            for (Staff_salary s : staff_salarys) {
                s.save();
            }
            t.commit();

            /**
             * End Process Staff Salary
             */
            //ISMSPersistentManager.instance().deleteObject("select cf from Current_staff_documents where staff=" + staff.getStaff_id());
            //for()
            //ISMSPersistentManager.instance().getSession().evict(staff);
            //if (formstate.equals("edit")) {
            staff = null;
            //}
            formstate = "view";
            //listBean.refreshlists("Staff");
            
            //clean current staff docuemnts
            //new GeneralUtilities().cleanCurrentStaffDocuments();

        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class
                    .getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance()
                    .addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void hideconfirm() {
        RequestContext.getCurrentInstance().execute("PF('confirmation').hide();");
        staff = null;
    }

    public void createTaskAfterNewStaff() {
        Task task = new Task();
        task.setActivity(activity);
        task.setTask_status("Pending");
        task.setStaff(staff);
        /**
         * Add flag date
         */
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        task.setFlag_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, activity.getFlag_after()).getTime().getTime()));
        /**
         * Add flag date
         */
        /**
         * Add Due date
         */
        currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        task.setDue_date(new Timestamp(new GeneralUtilities().addBusinessDate(currentDate, activity.getDuration()).getTime().getTime()));
        /**
         * Add Due date
         */
        task.setAssigned_user(loginBean.getUser_detail());
        taskBean.createTask(task);
        staff = null;
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(staff);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            this.staff = null;
            ISMSPersistentManager.instance().getSession().evict(staff);

        } catch (PersistentException ex) {
            Logger.getLogger(StaffBean.class
                    .getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance()
                    .addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    /**
     * @return the UploadDocType
     */
    public String getUploadDocType() {
        return UploadDocType;
    }

    /**
     * @param UploadDocType the UploadDocType to set
     */
    public void setUploadDocType(String UploadDocType) {
        this.UploadDocType = UploadDocType;
    }
    private boolean skip;

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public void checkduplicatepassport() {
        if (formstate.equals("add")) {
            try {
                Staff duplicatestaff = Staff.loadStaffByQuery("pp_passport_no='" + staff.getPp_passport_no() + "'", null);
                if (duplicatestaff != null) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "This passport has already been captured!");
                    FacesContext.getCurrentInstance().addMessage("Validation", message);
                    RequestContext.getCurrentInstance().update("staffform:staffformmessages");
                    RequestContext.getCurrentInstance().update("staffform:staffformgrowl");
                    FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("staffform:staffformmessages");
                    FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("staffform:staffformgrowl");
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String onFlowProcess(FlowEvent event) {
        boolean staffdocumentvalidation = false;
        String documentType = "";
        if (event.getOldStep().equals("staffdetails") && formstate.equals("add")) {
            try {
                Staff duplicatestaff = Staff.loadStaffByQuery("pp_passport_no='" + staff.getPp_passport_no() + "'", null);
                if (duplicatestaff != null) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "This passport has already been captured!");
                    FacesContext.getCurrentInstance().addMessage("Validation", message);
                    RequestContext.getCurrentInstance().update("staffform:staffformmessages");
                    RequestContext.getCurrentInstance().update("staffform:staffformgrowl");
//                    FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, "This passport has already been captured!", "This passport has already been captured!"));
                    return event.getOldStep();
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (event.getOldStep().equals("salarydetails")) {
            if (staff_salarys.isEmpty()) {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter Salary Details!");
                FacesContext.getCurrentInstance().addMessage("Validation", message);
                RequestContext.getCurrentInstance().update("staffform:staffformmessages");
                RequestContext.getCurrentInstance().update("staffform:staffformgrowl");
                return "salarydetails";
            }
        }
        if (event.getOldStep().equals("documentdetails")) {
            for (Current_staff_documents current_staff_document : current_staff_documentsList) {
                if (current_staff_document.getTask_document() == null) {
                    staffdocumentvalidation = true;
                    documentType = current_staff_document.getDocument_type().getDoc_type_name();
                    break;
                }
            }
            if (staffdocumentvalidation) {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please upload the '" + documentType + "'!");
                FacesContext.getCurrentInstance().addMessage("Validation", message);
                RequestContext.getCurrentInstance().update("staffform:staffformmessages");
                RequestContext.getCurrentInstance().update("staffform:staffformgrowl");
                return "documentdetails";
            }
        }

        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {
            //System.out.println(event.getNewStep());
            return event.getNewStep();
        }
    }

    private List<Current_staff_documents> selectedDocuments;

    public List<Current_staff_documents> getSelectedDocuments() {
        return selectedDocuments;
    }

    public void setSelectedDocuments(List<Current_staff_documents> selectedDocuments) {
        this.selectedDocuments = selectedDocuments;
    }

    /**
     * @return the activeStaffByCompany
     */
    public List<Staff> getActiveStaffByCompany() {
        String WhereStr = "is_active='Yes'";
        try {
            CompanyId = company.getCompany_id();
        } catch (NullPointerException npe) {
            CompanyId = 0;
        }
        try {
            StaffTypeId = staff_type.getStaff_type_id();
        } catch (NullPointerException npe) {
            StaffTypeId = 0;
        }
        try {
            AccommodationTypeId = accommodation_type.getAccommodation_type_id();
        } catch (NullPointerException npe) {
            AccommodationTypeId = 0;
        }
        try {
            AirTicketTypeId = air_ticket_type.getAir_ticket_type_id();
        } catch (NullPointerException npe) {
            AirTicketTypeId = 0;
        }
        try {
            SexName = this.SexName.trim();
        } catch (NullPointerException npe) {
            SexName = "";
        }

        if (CompanyId > 0) {
            WhereStr = WhereStr + " and company_id=" + CompanyId;
        }
        if (StaffTypeId > 0) {
            WhereStr = WhereStr + " and staff_type_id=" + StaffTypeId;
        }
        if (AccommodationTypeId > 0) {
            WhereStr = WhereStr + " and accom_type_id=" + AccommodationTypeId;
        }
        if (AirTicketTypeId > 0) {
            WhereStr = WhereStr + " and air_ticket_type_id=" + AirTicketTypeId;
        }
        if (SexName.length() > 0) {
            WhereStr = WhereStr + " and pp_sex='" + SexName + "'";
        }

        try {
            activeStaffByCompany = Staff.queryStaff(WhereStr, "pp_surname ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeStaffByCompany;
    }

    /**
     * @param activeStaffByCompany the activeStaffByCompany to set
     */
    public void setActiveStaffByCompany(List<Staff> activeStaffByCompany) {
        this.activeStaffByCompany = activeStaffByCompany;
    }

    /**
     * @return the staff_type
     */
    public Staff_type getStaff_type() {
        return staff_type;
    }

    /**
     * @param staff_type the staff_type to set
     */
    public void setStaff_type(Staff_type staff_type) {
        this.staff_type = staff_type;
    }

    /**
     * @return the activeStaffByCompanyModel
     */
    public LineChartModel getActiveStaffByCompanyModel() {
        try {
            this.activeStaffByCompanyModel.clear();
        } catch (NullPointerException npe) {
        }
        LineChartModel model = new LineChartModel();

        ChartSeries join = new ChartSeries();
        join.setLabel("Joined");

        String WhereStr = "is_active='Yes'";
        try {
            CompanyId = company.getCompany_id();
        } catch (NullPointerException npe) {
            CompanyId = 0;
        }
        try {
            StaffTypeId = staff_type.getStaff_type_id();
        } catch (NullPointerException npe) {
            StaffTypeId = 0;
        }
        try {
            AccommodationTypeId = accommodation_type.getAccommodation_type_id();
        } catch (NullPointerException npe) {
            AccommodationTypeId = 0;
        }
        try {
            AirTicketTypeId = air_ticket_type.getAir_ticket_type_id();
        } catch (NullPointerException npe) {
            AirTicketTypeId = 0;
        }
        try {
            SexName = this.SexName.trim();
        } catch (NullPointerException npe) {
            SexName = "";
        }

        if (CompanyId > 0) {
            WhereStr = WhereStr + " and company_id=" + CompanyId;
        }
        if (StaffTypeId > 0) {
            WhereStr = WhereStr + " and staff_type_id=" + StaffTypeId;
        }
        if (AccommodationTypeId > 0) {
            WhereStr = WhereStr + " and accom_type_id=" + AccommodationTypeId;
        }
        if (AirTicketTypeId > 0) {
            WhereStr = WhereStr + " and air_ticket_type_id=" + AirTicketTypeId;
        }
        if (SexName.length() > 0) {
            WhereStr = WhereStr + " and pp_sex='" + SexName + "'";
        }

        try {
            String qString = "SELECT extract(YEAR from join_date) AS Y,count(*) FROM Staff "
                    + "WHERE " + WhereStr + " "
                    + "GROUP BY extract(YEAR from join_date) "
                    + "ORDER BY Y ASC";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                int year;
                try {
                    year = (int) resultElement[0];
                } catch (NullPointerException npe) {
                    year = 0;
                }
                long number = (long) resultElement[1];
                join.set(year, number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(join);

        activeStaffByCompanyModel = model;
        activeStaffByCompanyModel.setLegendPosition("e");
        activeStaffByCompanyModel.setShowPointLabels(true);
        activeStaffByCompanyModel.getAxes().put(AxisType.X, new CategoryAxis("Join Year"));
        Axis yAxis = activeStaffByCompanyModel.getAxis(AxisType.Y);
        yAxis = activeStaffByCompanyModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number");
        yAxis.setMin(0);
        yAxis.setMax(100);
        return activeStaffByCompanyModel;
    }

    /**
     * @param activeStaffByCompanyModel the activeStaffByCompanyModel to set
     */
    public void setActiveStaffByCompanyModel(LineChartModel activeStaffByCompanyModel) {
        this.activeStaffByCompanyModel = activeStaffByCompanyModel;
    }

    /**
     * @return the activeStaffAll
     */
    public List<Staff> getActiveStaffAll() {
        try {
            activeStaffAll = Staff.queryStaff("is_active='Yes'", "pp_surname,pp_given_names ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeStaffAll;
    }

    /**
     * @param activeStaffAll the activeStaffAll to set
     */
    public void setActiveStaffAll(List<Staff> activeStaffAll) {
        this.activeStaffAll = activeStaffAll;
    }

    /**
     * @return the activeStaffAllModel
     */
    public BarChartModel getActiveStaffAllModel() {

        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Company");

        try {
            String qString = "SELECT s.company,count(s.company) FROM Staff s "
                    + "WHERE s.is_active='Yes' "
                    + "GROUP BY s.company";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                Company aCompany = (Company) resultElement[0];
                long number = (long) resultElement[1];
                ser1.set(aCompany.getAbbreviated_name(), number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(ser1);

        activeStaffAllModel = model;
        activeStaffAllModel.setLegendPosition("e");
        activeStaffAllModel.setShowPointLabels(true);
        activeStaffAllModel.getAxes().put(AxisType.X, new CategoryAxis("Company"));
        Axis yAxis = activeStaffAllModel.getAxis(AxisType.Y);
        yAxis = activeStaffAllModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number of Staff");
        yAxis.setMin(0);
        yAxis.setMax(200);

        return activeStaffAllModel;
    }

    /**
     * @param activeStaffAllModel the activeStaffAllModel to set
     */
    public void setActiveStaffAllModel(BarChartModel activeStaffAllModel) {
        this.activeStaffAllModel = activeStaffAllModel;
    }

    /**
     * @return the activeStaffByType
     */
    public List<Staff> getActiveStaffByType() {
        try {
            activeStaffByType = Staff.queryStaff("is_active='Yes' and staff_type_id=" + staff_type.getStaff_type_id(), "pp_surname ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeStaffByType;
    }

    /**
     * @param activeStaffByType the activeStaffByType to set
     */
    public void setActiveStaffByType(List<Staff> activeStaffByType) {
        this.activeStaffByType = activeStaffByType;
    }

    /**
     * @return the activeStaffByTypeModel
     */
    public BarChartModel getActiveStaffByTypeModel() {
        try {
            this.activeStaffByTypeModel.clear();
        } catch (NullPointerException npe) {
        }
        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Staff Type");

        try {
            String qString = "SELECT s.staff_type,count(s.staff_type) FROM Staff s "
                    + "WHERE s.is_active='Yes' AND s.staff_type=" + staff_type + " "
                    + "GROUP BY s.staff_type";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                Staff_type aStaff_type;
                String aTypename;
                long number;
                try {
                    aStaff_type = (Staff_type) resultElement[0];
                    aTypename = aStaff_type.getStaff_type_name();
                } catch (NullPointerException npe) {
                    aTypename = "X";
                }
                number = (long) resultElement[1];
                ser1.set(aTypename, number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(ser1);

        activeStaffByTypeModel = model;
        activeStaffByTypeModel.setLegendPosition("e");
        activeStaffByTypeModel.setShowPointLabels(true);
        activeStaffByTypeModel.getAxes().put(AxisType.X, new CategoryAxis("Staff Type"));
        Axis yAxis = activeStaffByTypeModel.getAxis(AxisType.Y);
        yAxis = activeStaffByTypeModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number of Staff");
        yAxis.setMin(0);
        yAxis.setMax(500);

        return activeStaffByTypeModel;
    }

    /**
     * @param activeStaffByTypeModel the activeStaffByTypeModel to set
     */
    public void setActiveStaffByTypeModel(BarChartModel activeStaffByTypeModel) {
        this.activeStaffByTypeModel = activeStaffByTypeModel;
    }

    /**
     * @return the activeStaffBySex
     */
    public List<Staff> getActiveStaffBySex() {
        try {
            activeStaffBySex = Staff.queryStaff("is_active='Yes'", "pp_sex,pp_surname ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeStaffBySex;
    }

    /**
     * @param activeStaffBySex the activeStaffBySex to set
     */
    public void setActiveStaffBySex(List<Staff> activeStaffBySex) {
        this.activeStaffBySex = activeStaffBySex;
    }

    /**
     * @return the activeStaffBySexModel
     */
    public BarChartModel getActiveStaffBySexModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Sex");

        try {
            String qString = "SELECT s.pp_sex,count(s.pp_sex) FROM Staff s "
                    + "WHERE s.is_active='Yes' "
                    + "GROUP BY s.pp_sex";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                String aSex = (String) resultElement[0];
                long number = (long) resultElement[1];
                ser1.set(aSex, number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(ser1);

        activeStaffBySexModel = model;
        activeStaffBySexModel.setLegendPosition("e");
        activeStaffBySexModel.setShowPointLabels(true);
        activeStaffBySexModel.getAxes().put(AxisType.X, new CategoryAxis("Sex"));
        Axis yAxis = activeStaffBySexModel.getAxis(AxisType.Y);
        yAxis = activeStaffBySexModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number of Staff");
        yAxis.setMin(0);
        yAxis.setMax(500);
        return activeStaffBySexModel;
    }

    /**
     * @param activeStaffBySexModel the activeStaffBySexModel to set
     */
    public void setActiveStaffBySexModel(BarChartModel activeStaffBySexModel) {
        this.activeStaffBySexModel = activeStaffBySexModel;
    }

    /**
     * @return the activeStaffByAccomType
     */
    public List<Staff> getActiveStaffByAccomType() {
        try {
            activeStaffByAccomType = Staff.queryStaff("is_active='Yes' and accom_type_id=" + accommodation_type.getAccommodation_type_id(), "pp_surname ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeStaffByAccomType;
    }

    /**
     * @param activeStaffByAccomType the activeStaffByAccomType to set
     */
    public void setActiveStaffByAccomType(List<Staff> activeStaffByAccomType) {
        this.activeStaffByAccomType = activeStaffByAccomType;
    }

    /**
     * @return the activeStaffByAccomTypeModel
     */
    public LineChartModel getActiveStaffByAccomTypeModel() {
        try {
            this.activeStaffByAccomTypeModel.clear();
        } catch (NullPointerException npe) {
        }
        LineChartModel model = new LineChartModel();

        ChartSeries join = new ChartSeries();
        join.setLabel("Joined");

        try {
            String qString = "SELECT accom_type_id,count(accom_type_id) FROM Staff "
                    + "WHERE is_active='Yes' and accomm_type_id=" + accommodation_type.getAccommodation_type_id() + " "
                    + "GROUP BY accom_type_id ";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                Accommodation_type aAccommodation_type;
                String aAccomTypeName;
                long number;
                try {
                    aAccommodation_type = (Accommodation_type) resultElement[0];
                    aAccomTypeName = aAccommodation_type.getAccommodation_type_name();
                } catch (NullPointerException npe) {
                    aAccomTypeName = "X";
                }
                number = (long) resultElement[1];
                join.set(aAccomTypeName, number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(join);

        activeStaffByAccomTypeModel = model;
        activeStaffByAccomTypeModel.setLegendPosition("e");
        activeStaffByAccomTypeModel.setShowPointLabels(true);
        activeStaffByAccomTypeModel.getAxes().put(AxisType.X, new CategoryAxis("Accommodation Type"));
        Axis yAxis = activeStaffByAccomTypeModel.getAxis(AxisType.Y);
        yAxis = activeStaffByAccomTypeModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number");
        yAxis.setMin(0);
        yAxis.setMax(500);
        return activeStaffByAccomTypeModel;
    }

    /**
     * @param activeStaffByAccomTypeModel the activeStaffByAccomTypeModel to set
     */
    public void setActiveStaffByAccomTypeModel(LineChartModel activeStaffByAccomTypeModel) {
        this.activeStaffByAccomTypeModel = activeStaffByAccomTypeModel;
    }

    /**
     * @return the accommodation_type
     */
    public Accommodation_type getAccommodation_type() {
        return accommodation_type;
    }

    /**
     * @param accommodation_type the accommodation_type to set
     */
    public void setAccommodation_type(Accommodation_type accommodation_type) {
        this.accommodation_type = accommodation_type;
    }

    /**
     * @return the air_ticket_type
     */
    public Air_ticket_type getAir_ticket_type() {
        return air_ticket_type;
    }

    /**
     * @param air_ticket_type the air_ticket_type to set
     */
    public void setAir_ticket_type(Air_ticket_type air_ticket_type) {
        this.air_ticket_type = air_ticket_type;
    }

    /**
     * @return the CompanyId
     */
    public long getCompanyId() {
        return CompanyId;
    }

    /**
     * @param CompanyId the CompanyId to set
     */
    public void setCompanyId(long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * @return the StaffTypeId
     */
    public long getStaffTypeId() {
        return StaffTypeId;
    }

    /**
     * @param StaffTypeId the StaffTypeId to set
     */
    public void setStaffTypeId(long StaffTypeId) {
        this.StaffTypeId = StaffTypeId;
    }

    /**
     * @return the AccommodationTypeId
     */
    public long getAccommodationTypeId() {
        return AccommodationTypeId;
    }

    /**
     * @param AccommodationTypeId the AccommodationTypeId to set
     */
    public void setAccommodationTypeId(long AccommodationTypeId) {
        this.AccommodationTypeId = AccommodationTypeId;
    }

    /**
     * @return the AirTicketTypeId
     */
    public long getAirTicketTypeId() {
        return AirTicketTypeId;
    }

    /**
     * @param AirTicketTypeId the AirTicketTypeId to set
     */
    public void setAirTicketTypeId(long AirTicketTypeId) {
        this.AirTicketTypeId = AirTicketTypeId;
    }

    /**
     * @return the StaffId
     */
    public long getStaffId() {
        return StaffId;
    }

    /**
     * @param StaffId the StaffId to set
     */
    public void setStaffId(long StaffId) {
        this.StaffId = StaffId;
    }

    /**
     * @return the SexName
     */
    public String getSexName() {
        return SexName;
    }

    /**
     * @param SexName the SexName to set
     */
    public void setSexName(String SexName) {
        this.SexName = SexName;
    }

    /**
     * @return the TempCurrent_staff_document
     */
    public Current_staff_documents getTempCurrent_staff_document() {
        return TempCurrent_staff_document;
    }

    /**
     * @param TempCurrent_staff_document the TempCurrent_staff_document to set
     */
    public void setTempCurrent_staff_document(Current_staff_documents TempCurrent_staff_document) {
        this.TempCurrent_staff_document = TempCurrent_staff_document;
    }
}
