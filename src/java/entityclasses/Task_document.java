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
@Table(name="task_document")
public class Task_document implements Serializable {
	public Task_document() {
	}
	
	public static Task_document loadTask_documentByORMID(int task_document_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTask_documentByORMID(session, task_document_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(int task_document_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getTask_documentByORMID(session, task_document_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTask_documentByORMID(session, task_document_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getTask_documentByORMID(session, task_document_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(PersistentSession session, int task_document_id) throws PersistentException {
		try {
			return (Task_document) session.load(entityclasses.Task_document.class, new Integer(task_document_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(PersistentSession session, int task_document_id) throws PersistentException {
		try {
			return (Task_document) session.get(entityclasses.Task_document.class, new Integer(task_document_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(PersistentSession session, int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_document) session.load(entityclasses.Task_document.class, new Integer(task_document_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(PersistentSession session, int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_document) session.get(entityclasses.Task_document.class, new Integer(task_document_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryTask_document(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryTask_document(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task_document as Task_document");
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
	
	public static List queryTask_document(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task_document as Task_document");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_document", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_document(session, condition, orderBy);
			return (Task_document[]) list.toArray(new Task_document[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_document(session, condition, orderBy, lockMode);
			return (Task_document[]) list.toArray(new Task_document[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_document[] task_documents = listTask_documentByQuery(session, condition, orderBy);
		if (task_documents != null && task_documents.length > 0)
			return task_documents[0];
		else
			return null;
	}
	
	public static Task_document loadTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_document[] task_documents = listTask_documentByQuery(session, condition, orderBy, lockMode);
		if (task_documents != null && task_documents.length > 0)
			return task_documents[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task_document as Task_document");
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
	
	public static java.util.Iterator iterateTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Task_document as Task_document");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_document", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByCriteria(Task_documentCriteria task_documentCriteria) {
		Task_document[] task_documents = listTask_documentByCriteria(task_documentCriteria);
		if(task_documents == null || task_documents.length == 0) {
			return null;
		}
		return task_documents[0];
	}
	
	public static Task_document[] listTask_documentByCriteria(Task_documentCriteria task_documentCriteria) {
		return task_documentCriteria.listTask_document();
	}
	
	public static Task_document createTask_document() {
		return new entityclasses.Task_document();
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
			if(getTask() != null) {
				getTask().getTask_document().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_document().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getTask_document().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getTask_document1().remove(this);
			}
			
			if(getCurrent_staff_documents() != null) {
				getCurrent_staff_documents().setTask_document(null);
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
			if(getTask() != null) {
				getTask().getTask_document().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_document().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getTask_document().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getTask_document1().remove(this);
			}
			
			if(getCurrent_staff_documents() != null) {
				getCurrent_staff_documents().setTask_document(null);
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
	
	@Column(name="task_document_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_TASK_DOCUMENT_TASK_DOCUMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_TASK_DOCUMENT_TASK_DOCUMENT_ID_GENERATOR", strategy="native")	
	private int task_document_id;
	
	@ManyToOne(targetEntity=entityclasses.Task.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_id", referencedColumnName="task_id") })	
	private entityclasses.Task task;
	
	@ManyToOne(targetEntity=entityclasses.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private entityclasses.Document_type document_type;
	
	@Column(name="document_url", nullable=true, length=255)	
	private String document_url;
	
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
	
	@Column(name="expiry_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date expiry_date;
	
	@Column(name="document_ref_no", nullable=true, length=50)	
	private String document_ref_no;
	
	@Column(name="document_typeonexpiry_document", nullable=true, length=11)	
	private Integer document_typeonexpiry_document;
	
	@Column(name="expiry_flag_date", nullable=true)	
	private java.sql.Timestamp expiry_flag_date;
	
	@Column(name="direction", nullable=true, length=3)	
	private String direction;
	
	@OneToOne(mappedBy="task_document", targetEntity=entityclasses.Current_staff_documents.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private entityclasses.Current_staff_documents current_staff_documents;
	
	private void setTask_document_id(int value) {
		this.task_document_id = value;
	}
	
	public int getTask_document_id() {
		return task_document_id;
	}
	
	public int getORMID() {
		return getTask_document_id();
	}
	
	public void setDocument_url(String value) {
		this.document_url = value;
	}
	
	public String getDocument_url() {
		return document_url;
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
	
	public void setExpiry_date(java.util.Date value) {
		this.expiry_date = value;
	}
	
	public java.util.Date getExpiry_date() {
		return expiry_date;
	}
	
	public void setDocument_ref_no(String value) {
		this.document_ref_no = value;
	}
	
	public String getDocument_ref_no() {
		return document_ref_no;
	}
	
	public void setDocument_typeonexpiry_document(int value) {
		setDocument_typeonexpiry_document(new Integer(value));
	}
	
	public void setDocument_typeonexpiry_document(Integer value) {
		this.document_typeonexpiry_document = value;
	}
	
	public Integer getDocument_typeonexpiry_document() {
		return document_typeonexpiry_document;
	}
	
	public void setExpiry_flag_date(java.sql.Timestamp value) {
		this.expiry_flag_date = value;
	}
	
	public java.sql.Timestamp getExpiry_flag_date() {
		return expiry_flag_date;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setTask(entityclasses.Task value) {
		this.task = value;
	}
	
	public entityclasses.Task getTask() {
		return task;
	}
	
	public void setDocument_type(entityclasses.Document_type value) {
		this.document_type = value;
	}
	
	public entityclasses.Document_type getDocument_type() {
		return document_type;
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
	
	public void setCurrent_staff_documents(entityclasses.Current_staff_documents value) {
		this.current_staff_documents = value;
	}
	
	public entityclasses.Current_staff_documents getCurrent_staff_documents() {
		return current_staff_documents;
	}
	
	public String toString() {
		return String.valueOf(getTask_document_id());
	}
	
}
