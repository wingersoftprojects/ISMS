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
@Table(name="activity_document_checklist")
public class Activity_document_checklist implements Serializable {
	public Activity_document_checklist() {
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByORMID(int activity_document_checklist_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_document_checklistByORMID(session, activity_document_checklist_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist getActivity_document_checklistByORMID(int activity_document_checklist_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivity_document_checklistByORMID(session, activity_document_checklist_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByORMID(int activity_document_checklist_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_document_checklistByORMID(session, activity_document_checklist_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist getActivity_document_checklistByORMID(int activity_document_checklist_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivity_document_checklistByORMID(session, activity_document_checklist_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByORMID(PersistentSession session, int activity_document_checklist_id) throws PersistentException {
		try {
			return (Activity_document_checklist) session.load(entityclasses.Activity_document_checklist.class, new Integer(activity_document_checklist_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist getActivity_document_checklistByORMID(PersistentSession session, int activity_document_checklist_id) throws PersistentException {
		try {
			return (Activity_document_checklist) session.get(entityclasses.Activity_document_checklist.class, new Integer(activity_document_checklist_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByORMID(PersistentSession session, int activity_document_checklist_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_document_checklist) session.load(entityclasses.Activity_document_checklist.class, new Integer(activity_document_checklist_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist getActivity_document_checklistByORMID(PersistentSession session, int activity_document_checklist_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_document_checklist) session.get(entityclasses.Activity_document_checklist.class, new Integer(activity_document_checklist_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_checklist(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity_document_checklist(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_checklist(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity_document_checklist(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist[] listActivity_document_checklistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivity_document_checklistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist[] listActivity_document_checklistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivity_document_checklistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_checklist(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_document_checklist as Activity_document_checklist");
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
	
	public static List queryActivity_document_checklist(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_document_checklist as Activity_document_checklist");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_document_checklist", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist[] listActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_document_checklist(session, condition, orderBy);
			return (Activity_document_checklist[]) list.toArray(new Activity_document_checklist[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist[] listActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_document_checklist(session, condition, orderBy, lockMode);
			return (Activity_document_checklist[]) list.toArray(new Activity_document_checklist[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_document_checklistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_document_checklistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_document_checklist[] activity_document_checklists = listActivity_document_checklistByQuery(session, condition, orderBy);
		if (activity_document_checklists != null && activity_document_checklists.length > 0)
			return activity_document_checklists[0];
		else
			return null;
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_document_checklist[] activity_document_checklists = listActivity_document_checklistByQuery(session, condition, orderBy, lockMode);
		if (activity_document_checklists != null && activity_document_checklists.length > 0)
			return activity_document_checklists[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_document_checklistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivity_document_checklistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_document_checklistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivity_document_checklistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_document_checklist as Activity_document_checklist");
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
	
	public static java.util.Iterator iterateActivity_document_checklistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_document_checklist as Activity_document_checklist");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_document_checklist", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_checklist loadActivity_document_checklistByCriteria(Activity_document_checklistCriteria activity_document_checklistCriteria) {
		Activity_document_checklist[] activity_document_checklists = listActivity_document_checklistByCriteria(activity_document_checklistCriteria);
		if(activity_document_checklists == null || activity_document_checklists.length == 0) {
			return null;
		}
		return activity_document_checklists[0];
	}
	
	public static Activity_document_checklist[] listActivity_document_checklistByCriteria(Activity_document_checklistCriteria activity_document_checklistCriteria) {
		return activity_document_checklistCriteria.listActivity_document_checklist();
	}
	
	public static Activity_document_checklist createActivity_document_checklist() {
		return new entityclasses.Activity_document_checklist();
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
				getActivity().getActivity_document_checklist().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getActivity_document_checklist().remove(this);
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
				getActivity().getActivity_document_checklist().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getActivity_document_checklist().remove(this);
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
	
	@Column(name="activity_document_checklist_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_ACTIVITY_DOCUMENT_CHECKLIST_ACTIVITY_DOCUMENT_CHECKLIST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_ACTIVITY_DOCUMENT_CHECKLIST_ACTIVITY_DOCUMENT_CHECKLIST_ID_GENERATOR", strategy="native")	
	private int activity_document_checklist_id;
	
	@ManyToOne(targetEntity=entityclasses.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private entityclasses.Activity activity;
	
	@ManyToOne(targetEntity=entityclasses.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private entityclasses.Document_type document_type;
	
	private void setActivity_document_checklist_id(int value) {
		this.activity_document_checklist_id = value;
	}
	
	public int getActivity_document_checklist_id() {
		return activity_document_checklist_id;
	}
	
	public int getORMID() {
		return getActivity_document_checklist_id();
	}
	
	public void setActivity(entityclasses.Activity value) {
		this.activity = value;
	}
	
	public entityclasses.Activity getActivity() {
		return activity;
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
		return String.valueOf(getActivity_document_checklist_id());
	}
	
}
