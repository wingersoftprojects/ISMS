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
@Table(name="outcome")
public class Outcome implements Serializable {
	public Outcome() {
	}
	
	public static Outcome loadOutcomeByORMID(int outcome_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadOutcomeByORMID(session, outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(int outcome_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getOutcomeByORMID(session, outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadOutcomeByORMID(session, outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getOutcomeByORMID(session, outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(PersistentSession session, int outcome_id) throws PersistentException {
		try {
			return (Outcome) session.load(entityclasses.Outcome.class, new Integer(outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(PersistentSession session, int outcome_id) throws PersistentException {
		try {
			return (Outcome) session.get(entityclasses.Outcome.class, new Integer(outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(PersistentSession session, int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Outcome) session.load(entityclasses.Outcome.class, new Integer(outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(PersistentSession session, int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Outcome) session.get(entityclasses.Outcome.class, new Integer(outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryOutcome(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryOutcome(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Outcome as Outcome");
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
	
	public static List queryOutcome(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Outcome as Outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Outcome", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOutcome(session, condition, orderBy);
			return (Outcome[]) list.toArray(new Outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOutcome(session, condition, orderBy, lockMode);
			return (Outcome[]) list.toArray(new Outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Outcome[] outcomes = listOutcomeByQuery(session, condition, orderBy);
		if (outcomes != null && outcomes.length > 0)
			return outcomes[0];
		else
			return null;
	}
	
	public static Outcome loadOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Outcome[] outcomes = listOutcomeByQuery(session, condition, orderBy, lockMode);
		if (outcomes != null && outcomes.length > 0)
			return outcomes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Outcome as Outcome");
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
	
	public static java.util.Iterator iterateOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Outcome as Outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Outcome", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByCriteria(OutcomeCriteria outcomeCriteria) {
		Outcome[] outcomes = listOutcomeByCriteria(outcomeCriteria);
		if(outcomes == null || outcomes.length == 0) {
			return null;
		}
		return outcomes[0];
	}
	
	public static Outcome[] listOutcomeByCriteria(OutcomeCriteria outcomeCriteria) {
		return outcomeCriteria.listOutcome();
	}
	
	public static Outcome createOutcome() {
		return new entityclasses.Outcome();
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
			entityclasses.Activity_outcome[] lActivity_outcomes = (entityclasses.Activity_outcome[])getActivity_outcome().toArray(new entityclasses.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setOutcome(null);
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
			entityclasses.Activity_outcome[] lActivity_outcomes = (entityclasses.Activity_outcome[])getActivity_outcome().toArray(new entityclasses.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setOutcome(null);
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
	
	@Column(name="outcome_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_OUTCOME_OUTCOME_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_OUTCOME_OUTCOME_ID_GENERATOR", strategy="native")	
	private int outcome_id;
	
	@Column(name="outcome_name", nullable=false, unique=true, length=20)	
	private String outcome_name;
	
	@OneToMany(mappedBy="outcome", targetEntity=entityclasses.Activity_outcome.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_outcome = new java.util.HashSet();
	
	private void setOutcome_id(int value) {
		this.outcome_id = value;
	}
	
	public int getOutcome_id() {
		return outcome_id;
	}
	
	public int getORMID() {
		return getOutcome_id();
	}
	
	public void setOutcome_name(String value) {
		this.outcome_name = value;
	}
	
	public String getOutcome_name() {
		return outcome_name;
	}
	
	public void setActivity_outcome(java.util.Set value) {
		this.activity_outcome = value;
	}
	
	public java.util.Set getActivity_outcome() {
		return activity_outcome;
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
		return String.valueOf(getOutcome_id());
	}
	
}
