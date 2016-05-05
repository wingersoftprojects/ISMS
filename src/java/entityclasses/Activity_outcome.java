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
@Table(name="activity_outcome", uniqueConstraints={ @UniqueConstraint(columnNames={ "activity_id", "outcome_id" }) })
public class Activity_outcome implements Serializable {
	public Activity_outcome() {
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(int activity_outcome_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_outcomeByORMID(session, activity_outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(int activity_outcome_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivity_outcomeByORMID(session, activity_outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_outcomeByORMID(session, activity_outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getActivity_outcomeByORMID(session, activity_outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id) throws PersistentException {
		try {
			return (Activity_outcome) session.load(entityclasses.Activity_outcome.class, new Integer(activity_outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id) throws PersistentException {
		try {
			return (Activity_outcome) session.get(entityclasses.Activity_outcome.class, new Integer(activity_outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_outcome) session.load(entityclasses.Activity_outcome.class, new Integer(activity_outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_outcome) session.get(entityclasses.Activity_outcome.class, new Integer(activity_outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity_outcome(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryActivity_outcome(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_outcome as Activity_outcome");
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
	
	public static List queryActivity_outcome(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_outcome as Activity_outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_outcome", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_outcome(session, condition, orderBy);
			return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_outcome(session, condition, orderBy, lockMode);
			return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByQuery(session, condition, orderBy);
		if (activity_outcomes != null && activity_outcomes.length > 0)
			return activity_outcomes[0];
		else
			return null;
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		if (activity_outcomes != null && activity_outcomes.length > 0)
			return activity_outcomes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_outcome as Activity_outcome");
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
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Activity_outcome as Activity_outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_outcome", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByCriteria(Activity_outcomeCriteria activity_outcomeCriteria) {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByCriteria(activity_outcomeCriteria);
		if(activity_outcomes == null || activity_outcomes.length == 0) {
			return null;
		}
		return activity_outcomes[0];
	}
	
	public static Activity_outcome[] listActivity_outcomeByCriteria(Activity_outcomeCriteria activity_outcomeCriteria) {
		return activity_outcomeCriteria.listActivity_outcome();
	}
	
	public static Activity_outcome createActivity_outcome() {
		return new entityclasses.Activity_outcome();
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
				getActivity().getActivity_outcome().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getActivity_outcome().remove(this);
			}
			
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setActivity_outcome(null);
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
				getActivity().getActivity_outcome().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getActivity_outcome().remove(this);
			}
			
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setActivity_outcome(null);
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
	
	@Column(name="activity_outcome_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_ACTIVITY_OUTCOME_ACTIVITY_OUTCOME_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_ACTIVITY_OUTCOME_ACTIVITY_OUTCOME_ID_GENERATOR", strategy="native")	
	private int activity_outcome_id;
	
	@ManyToOne(targetEntity=entityclasses.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private entityclasses.Activity activity;
	
	@ManyToOne(targetEntity=entityclasses.Outcome.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="outcome_id", referencedColumnName="outcome_id", nullable=false) })	
	private entityclasses.Outcome outcome;
	
	@Column(name="activity_outcome_name", nullable=false, length=50)	
	private String activity_outcome_name;
	
	@OneToMany(mappedBy="activity_outcome", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task = new java.util.HashSet();
	
	private void setActivity_outcome_id(int value) {
		this.activity_outcome_id = value;
	}
	
	public int getActivity_outcome_id() {
		return activity_outcome_id;
	}
	
	public int getORMID() {
		return getActivity_outcome_id();
	}
	
	public void setActivity_outcome_name(String value) {
		this.activity_outcome_name = value;
	}
	
	public String getActivity_outcome_name() {
		return activity_outcome_name;
	}
	
	public void setOutcome(entityclasses.Outcome value) {
		this.outcome = value;
	}
	
	public entityclasses.Outcome getOutcome() {
		return outcome;
	}
	
	public void setActivity(entityclasses.Activity value) {
		this.activity = value;
	}
	
	public entityclasses.Activity getActivity() {
		return activity;
	}
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
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
		return String.valueOf(getActivity_outcome_id());
	}
	
}
