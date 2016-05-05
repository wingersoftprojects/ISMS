/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Document_type;
import entityclasses.ISMSPersistentManager;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
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
public class Document_typeBean implements Serializable {

    private Document_type document_type;
    private String formstate;
    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    private List<Document_type> document_typeListActive;

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

    private List<Document_type> document_typeList;

    public List<Document_type> getDocument_typeList() {
        return document_typeList;
    }

    @PostConstruct
    public void init() {
        try {
            document_typeList = null;
            document_typeList = Document_type.queryDocument_type(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public List<Document_type> documenttypelist() {
        try {
            document_typeList = null;
            document_typeList = Document_type.queryDocument_type("document_type_id=" + dt.getDocument_type_id(), null);
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return document_typeList;
    }

    private Document_type dt;

    public Document_type getDt() {
        return dt;
    }

    public void setDt(Document_type dt) {
        this.dt = dt;
    }

    public void setDocument_typeList(List<Document_type> document_typeList) {
        this.document_typeList = document_typeList;
    }

    public Document_typeBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Document_type getDocument_type() {
        return document_type;
    }

    public void setDocument_type(Document_type document_type) {
        this.document_type = document_type;
    }

    public void cancel() {
        if (document_type != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(document_type);
            } catch (PersistentException ex) {
                Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.document_type = null;
        formstate = "view";
    }

    public void view(Document_type a) {
        this.document_type = a;
        formstate = "view";
    }

    public void delete(Document_type a) {
        this.document_type = a;
    }

    public void add() {
        document_type = new Document_type();
        formstate = "add";
    }

    public void edit(Document_type a) {
        this.document_type = a;
        formstate = "edit";
    }

    public void save() {
        try {
            if (document_type.getIs_renewable().equals("No")) {
                document_type.setFlag_duration_beforeexpiry(null);
                document_type.setOnexpire_activity(null);
            }
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (document_type.getDocument_type_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(document_type);
            } else {
                document_type.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(document_type);
            document_type = null;
            dt = null;
            //listBean.refreshlists("Document_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(document_type);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(document_type);
            this.document_type = null;
            //listBean.refreshlists("Document_type");
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    /**
     * @return the document_typeListActive
     */
    public List<Document_type> getDocument_typeListActive() {
        try {
            document_typeListActive = null;
            document_typeListActive = Document_type.queryDocument_type("is_active='Yes'", "doc_type_name ASC");
        } catch (PersistentException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return document_typeListActive;
    }

    /**
     * @param document_typeListActive the document_typeListActive to set
     */
    public void setDocument_typeListActive(List<Document_type> document_typeListActive) {
        this.document_typeListActive = document_typeListActive;
    }

    public String retrieveDocumentTypeLevelGivenId(int DocTypeLevelId) {
        if (DocTypeLevelId == 1) {
            return "IDs e.g (Passport, National ID, Employee ID, Driving Permit, etc)";
        } else if (DocTypeLevelId == 2) {
            return "Long-Term Immigration DOCs e.g (WorkPermit(WP), etc)";
        } else if (DocTypeLevelId == 3) {
            return "Short-Term Immigration DOCs e.g (SP,VP,BC, etc)";
        } else if (DocTypeLevelId == 9) {
            return "Other DOCs e.g (CV,Contract,Academic Certificates,Receipts, etc)";
        } else {
            return "";
        }
    }

    public Document_type retrieveDocument_typeById(int DocTypeId) {
        Document_type newDT = null;
        try {
            newDT = Document_type.getDocument_typeByORMID(DocTypeId);
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Document_typeBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return newDT;
    }
}
