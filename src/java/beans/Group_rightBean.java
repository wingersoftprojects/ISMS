/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Group_right;
import entityclasses.ISMSPersistentManager;
import entityclasses.User_detail;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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
public class Group_rightBean implements Serializable {

    private Group_right group_right;
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

    private List<Group_right> group_rightList;

    public List<Group_right> getGroup_rightList() {
        try {
            group_rightList = null;
            group_rightList = Group_right.queryGroup_right(null, "group_right_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return group_rightList;
    }

    public void setGroup_rightList(List<Group_right> group_rightList) {
        this.group_rightList = group_rightList;
    }

    public Group_rightBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Group_right getGroup_right() {
        return group_right;
    }

    public void setGroup_right(Group_right group_right) {
        this.group_right = group_right;
    }

    public void cancel() {
        if (group_right != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(group_right);
            } catch (PersistentException ex) {
                Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.group_right = null;
        formstate = "view";
    }

    public void view(Group_right object) {
        this.group_right = object;
        formstate = "view";
    }

    public void delete(Group_right object) {
        this.group_right = object;
    }

    public void add() {
        group_right = new Group_right();
        formstate = "add";
    }

    public void edit(Group_right object) {
        this.group_right = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (group_right.getGroup_right_id() > 0) {
                group_right.setEdit_user(loginBean.getUser_detail());
                group_right.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(group_right);
            } else {
                group_right.setAdd_user(loginBean.getUser_detail());
                group_right.setAdd_date(new Timestamp(new Date().getTime()));
                group_right.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(group_right);
            ISMSPersistentManager.instance().getSession().getSessionFactory().getCache().evictDefaultQueryRegion();
            group_right = null;
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(group_right);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            this.group_right = null;
            ISMSPersistentManager.instance().getSession().evict(group_right);
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public List<Group_right> getActiveGroup_rightListByUser(User_detail user_detail) {
        List<Group_right> grl = new ArrayList<Group_right>();
        try {
            grl = null;
            if (user_detail == null || user_detail.getIs_active().equals("No") || user_detail.getIs_general_admin().equals("Yes")) {
                //do nothing; user is either general admin OR inactive
            } else {
                grl = (List<Group_right>) ISMSPersistentManager.instance().getSession().createQuery(""
                        + "SELECT gr FROM Group_right gr WHERE gr.group_detail IN("
                        + "SELECT gu.group_detail FROM Group_user gu "
                        + "INNER JOIN gu.group_detail gd "
                        + "WHERE gd.is_active='Yes' "
                        + "AND gu.user_detail=" + user_detail + ")"
                        + "").list();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Group_rightBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return grl;
    }

    public int IsUserGroupsFunctionAccessAllowed(User_detail user_detail, List<Group_right> group_rights, String function_name, String allow) {
        //first check if user is general admin
        if (user_detail == null) {
            return 0;
        }
        //for gen admins
        if ("Yes".equals(user_detail.getIs_general_admin()) && "Yes".equals(user_detail.getIs_active())) {
            return 1;
        }
        //for non-gen-admins      
        int ListItemIndex = 0;
        int ListItemNo = 0;
        try {
            ListItemNo = group_rights.size();
        } catch (NullPointerException npe) {
        }
        int IsNegativeRightSeen = 0;
        int IsPositiveRightSeen = 0;

        while (ListItemIndex < ListItemNo) {
            if (function_name.equals(group_rights.get(ListItemIndex).getFunction_name())) {
                if (allow.equals("View")) {
                    if ("Yes".equals(group_rights.get(ListItemIndex).getAllow_view()) && IsPositiveRightSeen == 0) {
                        IsPositiveRightSeen = 1;
                    } else if ("No".equals(group_rights.get(ListItemIndex).getAllow_view()) && IsNegativeRightSeen == 0) {
                        IsNegativeRightSeen = 1;
                    }
                } else if (allow.equals("Add")) {
                    if ("Yes".equals(group_rights.get(ListItemIndex).getAllow_add()) && IsPositiveRightSeen == 0) {
                        IsPositiveRightSeen = 1;
                    } else if ("No".equals(group_rights.get(ListItemIndex).getAllow_add()) && IsNegativeRightSeen == 0) {
                        IsNegativeRightSeen = 1;
                    }
                } else if (allow.equals("Edit")) {
                    if ("Yes".equals(group_rights.get(ListItemIndex).getAllow_edit()) && IsPositiveRightSeen == 0) {
                        IsPositiveRightSeen = 1;
                    } else if ("No".equals(group_rights.get(ListItemIndex).getAllow_edit()) && IsNegativeRightSeen == 0) {
                        IsNegativeRightSeen = 1;
                    }
                } else if (allow.equals("Delete")) {
                    if ("Yes".equals(group_rights.get(ListItemIndex).getAllow_delete()) && IsPositiveRightSeen == 0) {
                        IsPositiveRightSeen = 1;
                    } else if ("No".equals(group_rights.get(ListItemIndex).getAllow_delete()) && IsNegativeRightSeen == 0) {
                        IsNegativeRightSeen = 1;
                    }
                }
            }
            ListItemIndex = ListItemIndex + 1;
        }
        if (IsPositiveRightSeen == 1 && IsNegativeRightSeen == 0) {
            return 1;//Allow Function Access
        } else {
            return 0;//Dissallow Function Access
        }
    }
}
