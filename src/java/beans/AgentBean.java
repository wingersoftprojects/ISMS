/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Agency;
import entityclasses.Agent;
import entityclasses.Agent_type;
import entityclasses.ISMSPersistentManager;
import entityclasses.Leave_type;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Timestamp;
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
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import utilities.FingerDB;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class AgentBean implements Serializable {

    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    private Agency agency;
    private Agent_type agent_type;
    private List<Agent> activeAgentsAll;
    private List<Agent> activeAgentsByAgency;
    private BarChartModel activeAgentsByAgencyModel;
    private List<Agent> activeAgentsByType;
    private BarChartModel activeAgentsByTypeModel;

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }
    private Agent agent;
    private String formstate;

    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    private List<Agent> agentList;

    public List<Agent> getAgentList() {
        try {
            agentList = null;
            agentList = Agent.queryAgent(null, "agent_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return agentList;
    }

    public void setAgentList(List<Agent> agentList) {
        this.agentList = agentList;
    }

    public AgentBean() {
        formstate = "view";
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public void cancel() {
        if (agent != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(agent);
            } catch (PersistentException ex) {
                Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.agent = null;
        formstate = "view";
    }

    public void view(Agent object) {
        this.agent = object;
        formstate = "view";
    }

    public void enrollfingerprint(Agent object) {
        this.agent = object;
        this.agent.setCurrentaction("enroll");
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

    public void cancelcloseDialog() {
        RequestContext.getCurrentInstance().execute("PF('EnrollmentDlg').hide()");
        agent = null;
        formstate = "view";
    }

    public void delete(Agent object) {
        this.agent = object;
    }

    public void add() {
        agent = new Agent();
        formstate = "add";
    }

    public void edit(Agent object) {
        this.agent = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (agent.getAgent_id() > 0) {
                agent.setEdit_user(loginBean.getUser_detail());
                agent.setEdit_date(new Timestamp(new Date().getTime()));
                ISMSPersistentManager.instance().getSession().merge(agent);
            } else {
                agent.setAdd_date(new Timestamp(new Date().getTime()));
                agent.setAdd_user(loginBean.getUser_detail());
                agent.setStatus("Not Enrolled");
                agent.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(agent);
            agent = null;
            //listBean.refreshlists("Agent");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(agent);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(agent);
            this.agent = null;
            //listBean.refreshlists("Agent");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void checkAgentStatus() {
        if (agent != null) {
            try {
//                try {
//                    DBConnection.readConnectionConfigurations();
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
//                }
                FingerDB db = new FingerDB(DBConnection.getMySQL_DB_HOST_IP_OR_NAME(), DBConnection.getMySQL_DB_NAME(), DBConnection.getMySQL_USER(), DBConnection.getMySQL_PASSWORD());
                db.Open();
                if (db.CurrentAction(agent.getAgent_id()) == false) {
                    RequestContext.getCurrentInstance().execute("PF('EnrollmentDlg').hide()");
                    agent = null;
                    formstate = "view";
                }
                db.Close();
            } catch (SQLException ex) {
                Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @return the agency
     */
    public Agency getAgency() {
        return agency;
    }

    /**
     * @param agency the agency to set
     */
    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    /**
     * @return the agent_type
     */
    public Agent_type getAgent_type() {
        return agent_type;
    }

    /**
     * @param agent_type the agent_type to set
     */
    public void setAgent_type(Agent_type agent_type) {
        this.agent_type = agent_type;
    }

    /**
     * @return the activeAgentsAll
     */
    public List<Agent> getActiveAgentsAll() {
        try {
            activeAgentsAll = null;
            activeAgentsAll = Agent.queryAgent("is_active='Yes'", "agency_id,agent_id");
        } catch (PersistentException ex) {
            Logger.getLogger(AgentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeAgentsAll;
    }

    /**
     * @param activeAgentsAll the activeAgentsAll to set
     */
    public void setActiveAgentsAll(List<Agent> activeAgentsAll) {
        this.activeAgentsAll = activeAgentsAll;
    }

    /**
     * @return the activeAgentsByAgency
     */
    public List<Agent> getActiveAgentsByAgency() {
        try {
            activeAgentsByAgency = Agent.queryAgent("is_active='Yes' and agency_id=" + agency.getAgency_id(), "agent_surname ASC,agent_other_names ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeAgentsByAgency;
    }

    /**
     * @param activeAgentsByAgency the activeAgentsByAgency to set
     */
    public void setActiveAgentsByAgency(List<Agent> activeAgentsByAgency) {
        this.activeAgentsByAgency = activeAgentsByAgency;
    }

    /**
     * @return the activeAgentsByAgencyModel
     */
    public BarChartModel getActiveAgentsByAgencyModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Agency");
        try {
            String qString = "SELECT a.agency,count(a.agency) FROM Agent a "
                    + "WHERE a.is_active='Yes' "
                    + "GROUP BY a.agency";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                Agency aAgency = (Agency) resultElement[0];
                long number = (long) resultElement[1];
                ser1.set(aAgency.getAgency_name(), number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(ser1);

        activeAgentsByAgencyModel = model;
        activeAgentsByAgencyModel.setLegendPosition("e");
        activeAgentsByAgencyModel.setShowPointLabels(true);
        activeAgentsByAgencyModel.getAxes().put(AxisType.X, new CategoryAxis("Agency"));
        Axis yAxis = activeAgentsByAgencyModel.getAxis(AxisType.Y);
        yAxis = activeAgentsByAgencyModel.getAxis(AxisType.Y);
        yAxis.setLabel("Count");
        yAxis.setMin(0);
        yAxis.setMax(500);

        return activeAgentsByAgencyModel;
    }

    /**
     * @param activeAgentsByAgencyModel the activeAgentsByAgencyModel to set
     */
    public void setActiveAgentsByAgencyModel(BarChartModel activeAgentsByAgencyModel) {
        this.activeAgentsByAgencyModel = activeAgentsByAgencyModel;
    }

    /**
     * @return the activeAgentsByType
     */
    public List<Agent> getActiveAgentsByType() {
        try {
            activeAgentsByType = Agent.queryAgent("is_active='Yes' and agent_type_id=" + agent_type.getAgent_type_id(), "agent_surname ASC,agent_other_names ASC");
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return activeAgentsByType;
    }

    /**
     * @param activeAgentsByType the activeAgentsByType to set
     */
    public void setActiveAgentsByType(List<Agent> activeAgentsByType) {
        this.activeAgentsByType = activeAgentsByType;
    }

    /**
     * @return the activeAgentsByTypeModel
     */
    public BarChartModel getActiveAgentsByTypeModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Agent Type");
        try {
            String qString = "SELECT a.agent_type,count(a.agent_type) FROM Agent a "
                    + "WHERE a.is_active='Yes' "
                    + "GROUP BY a.agent_type";
            List<Object[]> result = ISMSPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                Agent_type aAgent_type = (Agent_type) resultElement[0];
                long number = (long) resultElement[1];
                ser1.set(aAgent_type.getAgent_type_name(), number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(StaffBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }

        model.addSeries(ser1);

        activeAgentsByTypeModel = model;
        activeAgentsByTypeModel.setLegendPosition("e");
        activeAgentsByTypeModel.setShowPointLabels(true);
        activeAgentsByTypeModel.getAxes().put(AxisType.X, new CategoryAxis("Agent Type"));
        Axis yAxis = activeAgentsByTypeModel.getAxis(AxisType.Y);
        yAxis = activeAgentsByTypeModel.getAxis(AxisType.Y);
        yAxis.setLabel("Count");
        yAxis.setMin(0);
        yAxis.setMax(500);
        return activeAgentsByTypeModel;
    }

    /**
     * @param activeAgentsByTypeModel the activeAgentsByTypeModel to set
     */
    public void setActiveAgentsByTypeModel(BarChartModel activeAgentsByTypeModel) {
        this.activeAgentsByTypeModel = activeAgentsByTypeModel;
    }

}
