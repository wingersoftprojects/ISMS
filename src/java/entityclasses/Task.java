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
@Table(name="task")
public class Task implements Serializable {
	public Task() {
	}
	
	public static Task loadTaskByORMID(int task_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTaskByORMID(session, task_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(int task_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getTaskByORMID(session, task_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTaskByORMID(session, task_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getTaskByORMID(session, task_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(PersistentSession session, int task_id) throws PersistentException {
		try {
			return (Task) session.load(entityclasses.Task.class, new Integer(task_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(PersistentSession session, int task_id) throws PersistentException {
		try {
			return (Task) session.get(entityclasses.Task.class, new Integer(task_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(PersistentSession session, int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task) session.load(entityclasses.Task.class, new Integer(task_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(PersistentSession session, int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task) session.get(entityclasses.Task.class, new Integer(task_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryTask(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryTask(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task as Task");
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
	
	public static List queryTask(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask(session, condition, orderBy);
			return (Task[]) list.toArray(new Task[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask(session, condition, orderBy, lockMode);
			return (Task[]) list.toArray(new Task[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task[] tasks = listTaskByQuery(session, condition, orderBy);
		if (tasks != null && tasks.length > 0)
			return tasks[0];
		else
			return null;
	}
	
	public static Task loadTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task[] tasks = listTaskByQuery(session, condition, orderBy, lockMode);
		if (tasks != null && tasks.length > 0)
			return tasks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task as Task");
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
	
	public static java.util.Iterator iterateTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByCriteria(TaskCriteria taskCriteria) {
		Task[] tasks = listTaskByCriteria(taskCriteria);
		if(tasks == null || tasks.length == 0) {
			return null;
		}
		return tasks[0];
	}
	
	public static Task[] listTaskByCriteria(TaskCriteria taskCriteria) {
		return taskCriteria.listTask();
	}
	
	public static Task createTask() {
		return new entityclasses.Task();
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
			if(getActivity() != null) {
				getActivity().getTask().remove(this);
			}
			
			if(getCompleted_by() != null) {
				getCompleted_by().getTask4().remove(this);
			}
			
			if(getApproval_by() != null) {
				getApproval_by().getTask3().remove(this);
			}
			
			if(getApproval_type() != null) {
				getApproval_type().getTask().remove(this);
			}
			
			if(getStaff() != null) {
				getStaff().getTask().remove(this);
			}
			
			if(getAgent() != null) {
				getAgent().getTask().remove(this);
			}
			
			if(getAssigned_user() != null) {
				getAssigned_user().getTask().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getTask1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getTask2().remove(this);
			}
			
			if(getActivity_outcome() != null) {
				getActivity_outcome().getTask().remove(this);
			}
			
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setTask(null);
			}
			entityclasses.Task_payment[] lTask_payments = (entityclasses.Task_payment[])getTask_payment().toArray(new entityclasses.Task_payment[getTask_payment().size()]);
			for(int i = 0; i < lTask_payments.length; i++) {
				lTask_payments[i].setTask(null);
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
			if(getActivity() != null) {
				getActivity().getTask().remove(this);
			}
			
			if(getCompleted_by() != null) {
				getCompleted_by().getTask4().remove(this);
			}
			
			if(getApproval_by() != null) {
				getApproval_by().getTask3().remove(this);
			}
			
			if(getApproval_type() != null) {
				getApproval_type().getTask().remove(this);
			}
			
			if(getStaff() != null) {
				getStaff().getTask().remove(this);
			}
			
			if(getAgent() != null) {
				getAgent().getTask().remove(this);
			}
			
			if(getAssigned_user() != null) {
				getAssigned_user().getTask().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getTask1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getTask2().remove(this);
			}
			
			if(getActivity_outcome() != null) {
				getActivity_outcome().getTask().remove(this);
			}
			
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setTask(null);
			}
			entityclasses.Task_payment[] lTask_payments = (entityclasses.Task_payment[])getTask_payment().toArray(new entityclasses.Task_payment[getTask_payment().size()]);
			for(int i = 0; i < lTask_payments.length; i++) {
				lTask_payments[i].setTask(null);
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
	
	@Column(name="task_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_TASK_TASK_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_TASK_TASK_ID_GENERATOR", strategy="native")	
	private int task_id;
	
	@ManyToOne(targetEntity=entityclasses.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private entityclasses.Activity activity;
	
	@Column(name="task_status", nullable=false, length=20)	
	private String task_status;
	
	@Column(name="complete_date", nullable=true)	
	private java.sql.Timestamp complete_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="completed_by", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail completed_by;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="approval_by", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail approval_by;
	
	@ManyToOne(targetEntity=entityclasses.Approval_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="approval_type", referencedColumnName="approval_type_id") })	
	private entityclasses.Approval_type approval_type;
	
	@Column(name="approval_date", nullable=true)	
	private java.sql.Timestamp approval_date;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_id", referencedColumnName="staff_id", nullable=false) })	
	private entityclasses.Staff staff;
	
	@ManyToOne(targetEntity=entityclasses.Agent.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="agent_id", referencedColumnName="agent_id") })	
	private entityclasses.Agent agent;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="assigned_user", referencedColumnName="user_detail_id", nullable=false) })	
	private entityclasses.User_detail assigned_user;
	
	@Column(name="comment", nullable=true, length=100)	
	private String comment;
	
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
	
	@Column(name="due_date", nullable=true)	
	private java.sql.Timestamp due_date;
	
	@Column(name="flag_date", nullable=true)	
	private java.sql.Timestamp flag_date;
	
	@ManyToOne(targetEntity=entityclasses.Activity_outcome.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_outcome_id", referencedColumnName="activity_outcome_id") })	
	private entityclasses.Activity_outcome activity_outcome;
	
	@OneToMany(mappedBy="task", targetEntity=entityclasses.Task_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task_document = new java.util.HashSet();
	
	@OneToMany(mappedBy="task", targetEntity=entityclasses.Task_payment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task_payment = new java.util.HashSet();
	
	private void setTask_id(int value) {
		this.task_id = value;
	}
	
	public int getTask_id() {
		return task_id;
	}
	
	public int getORMID() {
		return getTask_id();
	}
	
	public void setComplete_date(java.sql.Timestamp value) {
		this.complete_date = value;
	}
	
	public java.sql.Timestamp getComplete_date() {
		return complete_date;
	}
	
	public void setApproval_date(java.sql.Timestamp value) {
		this.approval_date = value;
	}
	
	public java.sql.Timestamp getApproval_date() {
		return approval_date;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
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
	
	public void setTask_status(String value) {
		this.task_status = value;
	}
	
	public String getTask_status() {
		return task_status;
	}
	
	public void setDue_date(java.sql.Timestamp value) {
		this.due_date = value;
	}
	
	public java.sql.Timestamp getDue_date() {
		return due_date;
	}
	
	public void setFlag_date(java.sql.Timestamp value) {
		this.flag_date = value;
	}
	
	public java.sql.Timestamp getFlag_date() {
		return flag_date;
	}
	
	public void setActivity(entityclasses.Activity value) {
		this.activity = value;
	}
	
	public entityclasses.Activity getActivity() {
		return activity;
	}
	
	public void setStaff(entityclasses.Staff value) {
		this.staff = value;
	}
	
	public entityclasses.Staff getStaff() {
		return staff;
	}
	
	public void setAgent(entityclasses.Agent value) {
		this.agent = value;
	}
	
	public entityclasses.Agent getAgent() {
		return agent;
	}
	
	public void setAssigned_user(entityclasses.User_detail value) {
		this.assigned_user = value;
	}
	
	public entityclasses.User_detail getAssigned_user() {
		return assigned_user;
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
	
	public void setApproval_by(entityclasses.User_detail value) {
		this.approval_by = value;
	}
	
	public entityclasses.User_detail getApproval_by() {
		return approval_by;
	}
	
	public void setApproval_type(entityclasses.Approval_type value) {
		this.approval_type = value;
	}
	
	public entityclasses.Approval_type getApproval_type() {
		return approval_type;
	}
	
	public void setActivity_outcome(entityclasses.Activity_outcome value) {
		this.activity_outcome = value;
	}
	
	public entityclasses.Activity_outcome getActivity_outcome() {
		return activity_outcome;
	}
	
	public void setCompleted_by(entityclasses.User_detail value) {
		this.completed_by = value;
	}
	
	public entityclasses.User_detail getCompleted_by() {
		return completed_by;
	}
	
	public void setTask_document(java.util.Set value) {
		this.task_document = value;
	}
	
	public java.util.Set getTask_document() {
		return task_document;
	}
	
	
	public void setTask_payment(java.util.Set value) {
		this.task_payment = value;
	}
	
	public java.util.Set getTask_payment() {
		return task_payment;
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
		return String.valueOf(getTask_id());
	}
	
}
