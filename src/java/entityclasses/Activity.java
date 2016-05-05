/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package entityclasses;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="activity")
public class Activity implements Serializable {
	public Activity() {
	}
	
	public static Activity loadActivityByORMID(int activity_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivityByORMID(session, activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(int activity_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivityByORMID(session, activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivityByORMID(session, activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivityByORMID(session, activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(PersistentSession session, int activity_id) throws PersistentException {
		try {
			return (Activity) session.load(entityclasses.Activity.class, new Integer(activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(PersistentSession session, int activity_id) throws PersistentException {
		try {
			return (Activity) session.get(entityclasses.Activity.class, new Integer(activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(PersistentSession session, int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity) session.load(entityclasses.Activity.class, new Integer(activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(PersistentSession session, int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity) session.get(entityclasses.Activity.class, new Integer(activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity(session, condition, orderBy);
			return (Activity[]) list.toArray(new Activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity(session, condition, orderBy, lockMode);
			return (Activity[]) list.toArray(new Activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity[] activitys = listActivityByQuery(session, condition, orderBy);
		if (activitys != null && activitys.length > 0)
			return activitys[0];
		else
			return null;
	}
	
	public static Activity loadActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity[] activitys = listActivityByQuery(session, condition, orderBy, lockMode);
		if (activitys != null && activitys.length > 0)
			return activitys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByCriteria(ActivityCriteria activityCriteria) {
		Activity[] activitys = listActivityByCriteria(activityCriteria);
		if(activitys == null || activitys.length == 0) {
			return null;
		}
		return activitys[0];
	}
	
	public static Activity[] listActivityByCriteria(ActivityCriteria activityCriteria) {
		return activityCriteria.listActivity();
	}
	
	public static Activity createActivity() {
		return new entityclasses.Activity();
	}
	
	public boolean save() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getFrom_activity() != null) {
				getFrom_activity().getFromactivity().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getActivity().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getActivity1().remove(this);
			}
			
			entityclasses.Activity_document[] lActivity_documents = (entityclasses.Activity_document[])getActivity_document().toArray(new entityclasses.Activity_document[getActivity_document().size()]);
			for(int i = 0; i < lActivity_documents.length; i++) {
				lActivity_documents[i].setActivity(null);
			}
			entityclasses.Activity_cost[] lActivity_costs = (entityclasses.Activity_cost[])getActivity_cost().toArray(new entityclasses.Activity_cost[getActivity_cost().size()]);
			for(int i = 0; i < lActivity_costs.length; i++) {
				lActivity_costs[i].setActivity(null);
			}
			entityclasses.Activity_outcome[] lActivity_outcomes = (entityclasses.Activity_outcome[])getActivity_outcome().toArray(new entityclasses.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setActivity(null);
			}
			entityclasses.Activity_group[] lActivity_groups = (entityclasses.Activity_group[])getActivity_group().toArray(new entityclasses.Activity_group[getActivity_group().size()]);
			for(int i = 0; i < lActivity_groups.length; i++) {
				lActivity_groups[i].setActivity(null);
			}
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setActivity(null);
			}
			entityclasses.Activity[] lFromactivitys = (entityclasses.Activity[])getFromactivity().toArray(new entityclasses.Activity[getFromactivity().size()]);
			for(int i = 0; i < lFromactivitys.length; i++) {
				lFromactivitys[i].setFrom_activity(null);
			}
			entityclasses.Activity_document_checklist[] lActivity_document_checklists = (entityclasses.Activity_document_checklist[])getActivity_document_checklist().toArray(new entityclasses.Activity_document_checklist[getActivity_document_checklist().size()]);
			for(int i = 0; i < lActivity_document_checklists.length; i++) {
				lActivity_document_checklists[i].setActivity(null);
			}
			entityclasses.Document_type[] lDocument_types = (entityclasses.Document_type[])getDocument_type().toArray(new entityclasses.Document_type[getDocument_type().size()]);
			for(int i = 0; i < lDocument_types.length; i++) {
				lDocument_types[i].setOnexpire_activity(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getFrom_activity() != null) {
				getFrom_activity().getFromactivity().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getActivity().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getActivity1().remove(this);
			}
			
			entityclasses.Activity_document[] lActivity_documents = (entityclasses.Activity_document[])getActivity_document().toArray(new entityclasses.Activity_document[getActivity_document().size()]);
			for(int i = 0; i < lActivity_documents.length; i++) {
				lActivity_documents[i].setActivity(null);
			}
			entityclasses.Activity_cost[] lActivity_costs = (entityclasses.Activity_cost[])getActivity_cost().toArray(new entityclasses.Activity_cost[getActivity_cost().size()]);
			for(int i = 0; i < lActivity_costs.length; i++) {
				lActivity_costs[i].setActivity(null);
			}
			entityclasses.Activity_outcome[] lActivity_outcomes = (entityclasses.Activity_outcome[])getActivity_outcome().toArray(new entityclasses.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setActivity(null);
			}
			entityclasses.Activity_group[] lActivity_groups = (entityclasses.Activity_group[])getActivity_group().toArray(new entityclasses.Activity_group[getActivity_group().size()]);
			for(int i = 0; i < lActivity_groups.length; i++) {
				lActivity_groups[i].setActivity(null);
			}
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setActivity(null);
			}
			entityclasses.Activity[] lFromactivitys = (entityclasses.Activity[])getFromactivity().toArray(new entityclasses.Activity[getFromactivity().size()]);
			for(int i = 0; i < lFromactivitys.length; i++) {
				lFromactivitys[i].setFrom_activity(null);
			}
			entityclasses.Activity_document_checklist[] lActivity_document_checklists = (entityclasses.Activity_document_checklist[])getActivity_document_checklist().toArray(new entityclasses.Activity_document_checklist[getActivity_document_checklist().size()]);
			for(int i = 0; i < lActivity_document_checklists.length; i++) {
				lActivity_document_checklists[i].setActivity(null);
			}
			entityclasses.Document_type[] lDocument_types = (entityclasses.Document_type[])getDocument_type().toArray(new entityclasses.Document_type[getDocument_type().size()]);
			for(int i = 0; i < lDocument_types.length; i++) {
				lDocument_types[i].setOnexpire_activity(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="activity_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_ACTIVITY_ACTIVITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_ACTIVITY_ACTIVITY_ID_GENERATOR", strategy="native")	
	private int activity_id;
	
	@Column(name="activity_name", nullable=false, unique=true, length=100)	
	private String activity_name;
	
	@Column(name="is_start", nullable=false, length=3)	
	private String is_start;
	
	@Column(name="is_final", nullable=false, length=3)	
	private String is_final;
	
	@ManyToOne(targetEntity=entityclasses.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="from_activity_id", referencedColumnName="activity_id") })	
	private entityclasses.Activity from_activity;
	
	@Column(name="to_activity_if_success", nullable=true, length=11)	
	private Integer to_activity_if_success;
	
	@Column(name="to_activity_if_failure", nullable=true, length=11)	
	private Integer to_activity_if_failure;
	
	@Column(name="duration", nullable=false, length=4)	
	private int duration;
	
	@Column(name="flag_after", nullable=false, length=4)	
	private int flag_after;
	
	@Column(name="is_approval_required", nullable=false, length=3)	
	private String is_approval_required;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_user", referencedColumnName="user_detail_id", nullable=false) })	
	private entityclasses.User_detail add_user;
	
	@Column(name="edit_date", nullable=true)	
	private java.sql.Timestamp edit_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="edit_user", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail edit_user;
	
	@Column(name="is_agent_required", nullable=true, length=3)	
	private String is_agent_required;
	
	@Column(name="is_create_staff_activity", nullable=true, length=3)	
	private String is_create_staff_activity;
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Activity_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_document = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Activity_cost.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_cost = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Activity_outcome.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_outcome = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Activity_group.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_group = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task = new java.util.HashSet();
	
	@OneToMany(mappedBy="from_activity", targetEntity=entityclasses.Activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set fromactivity = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=entityclasses.Activity_document_checklist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_document_checklist = new java.util.HashSet();
	
	@OneToMany(mappedBy="onexpire_activity", targetEntity=entityclasses.Document_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set document_type = new java.util.HashSet();
	
	private void setActivity_id(int value) {
		this.activity_id = value;
	}
	
	public int getActivity_id() {
		return activity_id;
	}
	
	public int getORMID() {
		return getActivity_id();
	}
	
	public void setActivity_name(String value) {
		this.activity_name = value;
	}
	
	public String getActivity_name() {
		return activity_name;
	}
	
	public void setIs_start(String value) {
		this.is_start = value;
	}
	
	public String getIs_start() {
		return is_start;
	}
	
	public void setIs_final(String value) {
		this.is_final = value;
	}
	
	public String getIs_final() {
		return is_final;
	}
	
	public void setDuration(int value) {
		this.duration = value;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setFlag_after(int value) {
		this.flag_after = value;
	}
	
	public int getFlag_after() {
		return flag_after;
	}
	
	public void setIs_approval_required(String value) {
		this.is_approval_required = value;
	}
	
	public String getIs_approval_required() {
		return is_approval_required;
	}
	
	public void setAdd_date(java.sql.Timestamp value) {
		this.add_date = value;
	}
	
	public java.sql.Timestamp getAdd_date() {
		return add_date;
	}
	
	public void setEdit_date(java.sql.Timestamp value) {
		this.edit_date = value;
	}
	
	public java.sql.Timestamp getEdit_date() {
		return edit_date;
	}
	
	public void setIs_agent_required(String value) {
		this.is_agent_required = value;
	}
	
	public String getIs_agent_required() {
		return is_agent_required;
	}
	
	public void setTo_activity_if_success(int value) {
		setTo_activity_if_success(new Integer(value));
	}
	
	public void setTo_activity_if_success(Integer value) {
		this.to_activity_if_success = value;
	}
	
	public Integer getTo_activity_if_success() {
		return to_activity_if_success;
	}
	
	public void setTo_activity_if_failure(int value) {
		setTo_activity_if_failure(new Integer(value));
	}
	
	public void setTo_activity_if_failure(Integer value) {
		this.to_activity_if_failure = value;
	}
	
	public Integer getTo_activity_if_failure() {
		return to_activity_if_failure;
	}
	
	public void setIs_create_staff_activity(String value) {
		this.is_create_staff_activity = value;
	}
	
	public String getIs_create_staff_activity() {
		return is_create_staff_activity;
	}
	
	public void setAdd_user(entityclasses.User_detail value) {
		this.add_user = value;
	}
	
	public entityclasses.User_detail getAdd_user() {
		return add_user;
	}
	
	public void setEdit_user(entityclasses.User_detail value) {
		this.edit_user = value;
	}
	
	public entityclasses.User_detail getEdit_user() {
		return edit_user;
	}
	
	public void setFrom_activity(entityclasses.Activity value) {
		this.from_activity = value;
	}
	
	public entityclasses.Activity getFrom_activity() {
		return from_activity;
	}
	
	public void setActivity_document(java.util.Set value) {
		this.activity_document = value;
	}
	
	public java.util.Set getActivity_document() {
		return activity_document;
	}
	
	
	public void setActivity_cost(java.util.Set value) {
		this.activity_cost = value;
	}
	
	public java.util.Set getActivity_cost() {
		return activity_cost;
	}
	
	
	public void setActivity_outcome(java.util.Set value) {
		this.activity_outcome = value;
	}
	
	public java.util.Set getActivity_outcome() {
		return activity_outcome;
	}
	
	
	public void setActivity_group(java.util.Set value) {
		this.activity_group = value;
	}
	
	public java.util.Set getActivity_group() {
		return activity_group;
	}
	
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
	}
	
	
	public void setFromactivity(java.util.Set value) {
		this.fromactivity = value;
	}
	
	public java.util.Set getFromactivity() {
		return fromactivity;
	}
	
	
	public void setActivity_document_checklist(java.util.Set value) {
		this.activity_document_checklist = value;
	}
	
	public java.util.Set getActivity_document_checklist() {
		return activity_document_checklist;
	}
	
	
	public void setDocument_type(java.util.Set value) {
		this.document_type = value;
	}
	
	public java.util.Set getDocument_type() {
		return document_type;
	}
	
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		        return getClass() == obj.getClass();
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getActivity_id());
	}
	
}
