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
@Table(name="current_staff_documents")
public class Current_staff_documents implements Serializable {
	public Current_staff_documents() {
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByORMID(int current_staff_documents_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrent_staff_documentsByORMID(session, current_staff_documents_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents getCurrent_staff_documentsByORMID(int current_staff_documents_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCurrent_staff_documentsByORMID(session, current_staff_documents_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByORMID(int current_staff_documents_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrent_staff_documentsByORMID(session, current_staff_documents_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents getCurrent_staff_documentsByORMID(int current_staff_documents_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCurrent_staff_documentsByORMID(session, current_staff_documents_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByORMID(PersistentSession session, int current_staff_documents_id) throws PersistentException {
		try {
			return (Current_staff_documents) session.load(entityclasses.Current_staff_documents.class, new Integer(current_staff_documents_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents getCurrent_staff_documentsByORMID(PersistentSession session, int current_staff_documents_id) throws PersistentException {
		try {
			return (Current_staff_documents) session.get(entityclasses.Current_staff_documents.class, new Integer(current_staff_documents_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByORMID(PersistentSession session, int current_staff_documents_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Current_staff_documents) session.load(entityclasses.Current_staff_documents.class, new Integer(current_staff_documents_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents getCurrent_staff_documentsByORMID(PersistentSession session, int current_staff_documents_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Current_staff_documents) session.get(entityclasses.Current_staff_documents.class, new Integer(current_staff_documents_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrent_staff_documents(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCurrent_staff_documents(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrent_staff_documents(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCurrent_staff_documents(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents[] listCurrent_staff_documentsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCurrent_staff_documentsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents[] listCurrent_staff_documentsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCurrent_staff_documentsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrent_staff_documents(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Current_staff_documents as Current_staff_documents");
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
	
	public static List queryCurrent_staff_documents(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Current_staff_documents as Current_staff_documents");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Current_staff_documents", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents[] listCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurrent_staff_documents(session, condition, orderBy);
			return (Current_staff_documents[]) list.toArray(new Current_staff_documents[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents[] listCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurrent_staff_documents(session, condition, orderBy, lockMode);
			return (Current_staff_documents[]) list.toArray(new Current_staff_documents[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrent_staff_documentsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrent_staff_documentsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Current_staff_documents[] current_staff_documentses = listCurrent_staff_documentsByQuery(session, condition, orderBy);
		if (current_staff_documentses != null && current_staff_documentses.length > 0)
			return current_staff_documentses[0];
		else
			return null;
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Current_staff_documents[] current_staff_documentses = listCurrent_staff_documentsByQuery(session, condition, orderBy, lockMode);
		if (current_staff_documentses != null && current_staff_documentses.length > 0)
			return current_staff_documentses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCurrent_staff_documentsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCurrent_staff_documentsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurrent_staff_documentsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCurrent_staff_documentsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Current_staff_documents as Current_staff_documents");
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
	
	public static java.util.Iterator iterateCurrent_staff_documentsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Current_staff_documents as Current_staff_documents");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Current_staff_documents", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Current_staff_documents loadCurrent_staff_documentsByCriteria(Current_staff_documentsCriteria current_staff_documentsCriteria) {
		Current_staff_documents[] current_staff_documentses = listCurrent_staff_documentsByCriteria(current_staff_documentsCriteria);
		if(current_staff_documentses == null || current_staff_documentses.length == 0) {
			return null;
		}
		return current_staff_documentses[0];
	}
	
	public static Current_staff_documents[] listCurrent_staff_documentsByCriteria(Current_staff_documentsCriteria current_staff_documentsCriteria) {
		return current_staff_documentsCriteria.listCurrent_staff_documents();
	}
	
	public static Current_staff_documents createCurrent_staff_documents() {
		return new entityclasses.Current_staff_documents();
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
			if(getStaff() != null) {
				getStaff().getCurrent_staff_documents().remove(this);
			}
			
			if(getTask_document() != null) {
				getTask_document().setCurrent_staff_documents(null);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getCurrent_staff_documents().remove(this);
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
			if(getStaff() != null) {
				getStaff().getCurrent_staff_documents().remove(this);
			}
			
			if(getTask_document() != null) {
				getTask_document().setCurrent_staff_documents(null);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getCurrent_staff_documents().remove(this);
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
	
	@Column(name="current_staff_documents_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_CURRENT_STAFF_DOCUMENTS_CURRENT_STAFF_DOCUMENTS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_CURRENT_STAFF_DOCUMENTS_CURRENT_STAFF_DOCUMENTS_ID_GENERATOR", strategy="native")	
	private int current_staff_documents_id;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_id", referencedColumnName="staff_id", nullable=false) })	
	private entityclasses.Staff staff;
	
	@OneToOne(targetEntity=entityclasses.Task_document.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.MERGE})	
	@JoinColumns({ @JoinColumn(name="task_document_id", referencedColumnName="task_document_id", nullable=false) })	
	private entityclasses.Task_document task_document;
	
	@ManyToOne(targetEntity=entityclasses.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private entityclasses.Document_type document_type;
	
	@Column(name="is_deleted", nullable=true, length=3)	
	private String is_deleted;
	
	@Column(name="delete_date", nullable=true)	
	private java.sql.Timestamp delete_date;
	
	@Column(name="current_direction", nullable=true, length=3)	
	private String current_direction;
	
	@Column(name="current_direction_reason", nullable=true, length=100)	
	private String current_direction_reason;
	
	@Column(name="current_direction_reason_other", nullable=true, length=100)	
	private String current_direction_reason_other;
	
	private void setCurrent_staff_documents_id(int value) {
		this.current_staff_documents_id = value;
	}
	
	public int getCurrent_staff_documents_id() {
		return current_staff_documents_id;
	}
	
	public int getORMID() {
		return getCurrent_staff_documents_id();
	}
	
	public void setIs_deleted(String value) {
		this.is_deleted = value;
	}
	
	public String getIs_deleted() {
		return is_deleted;
	}
	
	public void setDelete_date(java.sql.Timestamp value) {
		this.delete_date = value;
	}
	
	public java.sql.Timestamp getDelete_date() {
		return delete_date;
	}
	
	/**
	 * IN or OUT values
	 */
	public void setCurrent_direction(String value) {
		this.current_direction = value;
	}
	
	/**
	 * IN or OUT values
	 */
	public String getCurrent_direction() {
		return current_direction;
	}
	
	/**
	 * Reason for DOC in/out such as:
	 * -Immigration
	 * -Leave
	 * -Driving Permit
	 * -etc
	 */
	public void setCurrent_direction_reason(String value) {
		this.current_direction_reason = value;
	}
	
	/**
	 * Reason for DOC in/out such as:
	 * -Immigration
	 * -Leave
	 * -Driving Permit
	 * -etc
	 */
	public String getCurrent_direction_reason() {
		return current_direction_reason;
	}
	
	public void setCurrent_direction_reason_other(String value) {
		this.current_direction_reason_other = value;
	}
	
	public String getCurrent_direction_reason_other() {
		return current_direction_reason_other;
	}
	
	public void setStaff(entityclasses.Staff value) {
		this.staff = value;
	}
	
	public entityclasses.Staff getStaff() {
		return staff;
	}
	
	public void setTask_document(entityclasses.Task_document value) {
		this.task_document = value;
	}
	
	public entityclasses.Task_document getTask_document() {
		return task_document;
	}
	
	public void setDocument_type(entityclasses.Document_type value) {
		this.document_type = value;
	}
	
	public entityclasses.Document_type getDocument_type() {
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
		return String.valueOf(getCurrent_staff_documents_id());
	}
	
}
