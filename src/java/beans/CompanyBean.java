/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Activity;
import entityclasses.Company;
import entityclasses.ISMSPersistentManager;
import entityclasses.Company_contact;
import entityclasses.Document_type;
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
public class CompanyBean implements Serializable {

    private Company company;
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
    private List<Company> companyList;

    public List<Company> getCompanyList() {
        if (companyList == null) {
            init();
        }
        return companyList;
    }

    @PostConstruct
    public void init() {
        try {
            companyList = null;
            companyList = Company.queryCompany(null, "company_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

    }
    
    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public CompanyBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void cancel() {
        if (company != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(company);
            } catch (PersistentException ex) {
                Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.company = null;
        formstate = "view";
    }

    public void view(Company s) {
        this.company = s;
        populatecontacts();
        formstate = "view";
    }

    public void delete(Company s) {
        this.company = s;
    }

    public void add() {
        company = new Company();
        populatecontacts();
        formstate = "add";
    }

    public void edit(Company d) {
        this.company = d;
        populatecontacts();
        formstate = "edit";
    }

    private Company_contact company_contact;
    private List<Company_contact> company_contacts;

    public Company_contact getCompany_contact() {
        return company_contact;
    }

    public void setCompany_contact(Company_contact company_contact) {
        this.company_contact = company_contact;
    }

    public List<Company_contact> getCompany_contacts() {
        return company_contacts;
    }

    public void setCompany_contacts(List<Company_contact> company_contacts) {
        this.company_contacts = company_contacts;
    }

    public void populatecontacts() {
        if (company != null) {
            try {
                List<Company_contact> cs = Company_contact.queryCompany_contact("company_id=" + company.getCompany_id(), null);
                company_contacts = new ArrayList<>();
                for (Company_contact c : cs) {
                    Company_contact c1 = new Company_contact();
                    c1.setCompany(c.getCompany());
                    c1.setContact_email(c.getContact_email());
                    c1.setContact_name(c.getContact_name());
                    c1.setContact_phone(c.getContact_phone());
                    c1.setContact_title(c.getContact_title());
                    company_contacts.add(c1);
                }
            } catch (PersistentException ex) {
                Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String company_contact_formstate = "view";

    public String getCompany_contact_formstate() {
        return company_contact_formstate;
    }

    public void setCompany_contact_formstate(String company_contact_formstate) {
        this.company_contact_formstate = company_contact_formstate;
    }

    public void cancel_company_contact() {
        populatecontacts();
        company_contact_formstate = "view";
    }

    public void add_company_contact() {
        company_contact = new Company_contact();
        company_contact_formstate = "add";
    }

    public void edit_company_contact(Company_contact cc) {
        company_contact = cc;
        populatecontacts();
        company_contact_formstate = "edit";
    }

    public void remove_company_contact(Company_contact ss) {
        company_contacts.remove(ss);
        company_contact_formstate = "view";
    }

    public void save_company_contact() {
        if (company_contact.getContact_name() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Contact Name!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (company_contact.getContact_title() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Contact Title!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (company_contact.getContact_email() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Contact Email!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (company_contact.getContact_phone() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please enter the Contact Phone!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        company_contact.setCompany(company);
        for (Company_contact c : company_contacts) {
            if (c.getContact_email().toUpperCase().equals(company_contact.getContact_email().toUpperCase())) {
                company_contacts.remove(c);
                break;
            }
        }
        company_contacts.add(company_contact);
        company_contact_formstate = "view";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (company.getCompany_id() > 0) {
                company.setEdit_user(loginBean.getUser_detail());
                company.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(company);
            } else {
                company.setAdd_date(new Timestamp(new Date().getTime()));
                company.setAdd_user(loginBean.getUser_detail());
                company.save();
            }
            t.commit();

            /**
             * Process Company Contacts
             */
            if (company.getCompany_id() > 0) {
                t = ISMSPersistentManager.instance().getSession().beginTransaction();
                Query query = ISMSPersistentManager.instance().getSession().createQuery("delete Company_contact where company_id= :company_id");
                query.setParameter("company_id", company.getCompany_id());
                int result = query.executeUpdate();
                t.commit();
            }
            t = ISMSPersistentManager.instance().getSession().beginTransaction();
            for (Company_contact c : company_contacts) {
                c.save();
            }
            t.commit();

            /**
             * End Process Company Contacts
             */
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(company);
            company = null;
            //listBean.refreshlists("Company");
        } catch (PersistentException ex) {
            Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(company);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(company);
            this.company = null;
            //listBean.refreshlists("Company");
        } catch (PersistentException ex) {
            Logger.getLogger(CompanyBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
