/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.ISMSPersistentManager;
import entityclasses.Group_detail;
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
public class Group_detailBean implements Serializable {

    private Group_detail group_detail;
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
    
    private List<Group_detail> group_detailList;

    public List<Group_detail> getGroup_detailList() {
        try {
            group_detailList = null;
            group_detailList = Group_detail.queryGroup_detail(null, "group_detail_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return group_detailList;
    }
    
    public List<Group_detail> getGroup_detailListActive() {
        try {
            group_detailList = null;
            group_detailList = Group_detail.queryGroup_detail("is_active='Yes'",null);
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return group_detailList;
    }

    public void setGroup_detailList(List<Group_detail> group_detailList) {
        this.group_detailList = group_detailList;
    }

    public Group_detailBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Group_detail getGroup_detail() {
        return group_detail;
    }

    public void setGroup_detail(Group_detail group_detail) {
        this.group_detail = group_detail;
    }

    public void cancel() {
        if (group_detail != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(group_detail);
            } catch (PersistentException ex) {
                Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.group_detail = null;
        formstate = "view";
    }

    public void view(Group_detail object) {
        this.group_detail = object;
        formstate = "view";
    }

    public void delete(Group_detail object) {
        this.group_detail = object;
    }

    public void add() {
        group_detail = new Group_detail();
        formstate = "add";
    }

    public void edit(Group_detail object) {
        this.group_detail = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (group_detail.getGroup_detail_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(group_detail);
            } else {
                group_detail.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(group_detail);
            group_detail = null;
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictDefaultQueryRegion();
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(group_detail);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            this.group_detail = null;
            ISMSPersistentManager.instance().getSession().evict(group_detail);
        } catch (PersistentException ex) {
            Logger.getLogger(Group_detailBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }
}
