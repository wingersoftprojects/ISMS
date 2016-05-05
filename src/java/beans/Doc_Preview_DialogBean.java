/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Doc_Preview_DialogBean implements Serializable {

    private String url;
    private String UploadDocType;
    @ManagedProperty("#{staffBean}")
    private StaffBean staffBean;

    public StaffBean getStaffBean() {
        return staffBean;
    }

    public void setStaffBean(StaffBean staffBean) {
        this.staffBean = staffBean;
    }

    public String getUploadDocType() {
        return UploadDocType;
    }

    public void setUploadDocType(String UploadDocType) {
        this.UploadDocType = UploadDocType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void doc_preview_dialog() {
//        switch (UploadDocType) {
//            case "contract":
//                //url = staffBean.getStaff().getContract_doc().getDocument_url();
//                break;
//            case "passport":
//                //url = staffBean.getStaff().getPassport_doc().getDocument_url();
//                break;
//            case "immigration":
//                //url = staffBean.getStaff().getImmig_doc().getDocument_url();
//                break;
//        }
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("doc_preview_dialog", options, null);
    }
}
