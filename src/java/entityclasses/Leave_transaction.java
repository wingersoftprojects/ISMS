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
@Table(name="leave_transaction")
public class Leave_transaction implements Serializable {
	public Leave_transaction() {
	}
	
	public static Leave_transaction loadLeave_transactionByORMID(int leave_transaction_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadLeave_transactionByORMID(session, leave_transaction_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction getLeave_transactionByORMID(int leave_transaction_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getLeave_transactionByORMID(session, leave_transaction_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByORMID(int leave_transaction_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadLeave_transactionByORMID(session, leave_transaction_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction getLeave_transactionByORMID(int leave_transaction_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getLeave_transactionByORMID(session, leave_transaction_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByORMID(PersistentSession session, int leave_transaction_id) throws PersistentException {
		try {
			return (Leave_transaction) session.load(entityclasses.Leave_transaction.class, new Integer(leave_transaction_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction getLeave_transactionByORMID(PersistentSession session, int leave_transaction_id) throws PersistentException {
		try {
			return (Leave_transaction) session.get(entityclasses.Leave_transaction.class, new Integer(leave_transaction_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByORMID(PersistentSession session, int leave_transaction_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Leave_transaction) session.load(entityclasses.Leave_transaction.class, new Integer(leave_transaction_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction getLeave_transactionByORMID(PersistentSession session, int leave_transaction_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Leave_transaction) session.get(entityclasses.Leave_transaction.class, new Integer(leave_transaction_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLeave_transaction(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryLeave_transaction(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLeave_transaction(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryLeave_transaction(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction[] listLeave_transactionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listLeave_transactionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction[] listLeave_transactionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listLeave_transactionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLeave_transaction(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Leave_transaction as Leave_transaction");
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
	
	public static List queryLeave_transaction(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Leave_transaction as Leave_transaction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Leave_transaction", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction[] listLeave_transactionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLeave_transaction(session, condition, orderBy);
			return (Leave_transaction[]) list.toArray(new Leave_transaction[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction[] listLeave_transactionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLeave_transaction(session, condition, orderBy, lockMode);
			return (Leave_transaction[]) list.toArray(new Leave_transaction[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadLeave_transactionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadLeave_transactionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Leave_transaction[] leave_transactions = listLeave_transactionByQuery(session, condition, orderBy);
		if (leave_transactions != null && leave_transactions.length > 0)
			return leave_transactions[0];
		else
			return null;
	}
	
	public static Leave_transaction loadLeave_transactionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Leave_transaction[] leave_transactions = listLeave_transactionByQuery(session, condition, orderBy, lockMode);
		if (leave_transactions != null && leave_transactions.length > 0)
			return leave_transactions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLeave_transactionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateLeave_transactionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLeave_transactionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateLeave_transactionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLeave_transactionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Leave_transaction as Leave_transaction");
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
	
	public static java.util.Iterator iterateLeave_transactionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Leave_transaction as Leave_transaction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Leave_transaction", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Leave_transaction loadLeave_transactionByCriteria(Leave_transactionCriteria leave_transactionCriteria) {
		Leave_transaction[] leave_transactions = listLeave_transactionByCriteria(leave_transactionCriteria);
		if(leave_transactions == null || leave_transactions.length == 0) {
			return null;
		}
		return leave_transactions[0];
	}
	
	public static Leave_transaction[] listLeave_transactionByCriteria(Leave_transactionCriteria leave_transactionCriteria) {
		return leave_transactionCriteria.listLeave_transaction();
	}
	
	public static Leave_transaction createLeave_transaction() {
		return new entityclasses.Leave_transaction();
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
				getStaff().getLeave_transaction().remove(this);
			}
			
			if(getApproved_by() != null) {
				getApproved_by().getLeave_transaction1().remove(this);
			}
			
			if(getLeave_type() != null) {
				getLeave_type().getLeave_transaction().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getLeave_transaction1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getLeave_transaction().remove(this);
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
				getStaff().getLeave_transaction().remove(this);
			}
			
			if(getApproved_by() != null) {
				getApproved_by().getLeave_transaction1().remove(this);
			}
			
			if(getLeave_type() != null) {
				getLeave_type().getLeave_transaction().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getLeave_transaction1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getLeave_transaction().remove(this);
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
	
	@Column(name="leave_transaction_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_LEAVE_TRANSACTION_LEAVE_TRANSACTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_LEAVE_TRANSACTION_LEAVE_TRANSACTION_ID_GENERATOR", strategy="native")	
	private int leave_transaction_id;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_id", referencedColumnName="staff_id", nullable=false) })	
	private entityclasses.Staff staff;
	
	@Column(name="days_taken", nullable=false, length=11)	
	private int days_taken;
	
	@Column(name="start_date", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date start_date;
	
	@Column(name="end_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date end_date;
	
	@Column(name="leave_year", nullable=true, length=11)	
	private Integer leave_year;
	
	@Column(name="leave_quarter", nullable=true, length=3)	
	private String leave_quarter;
	
	@Column(name="ticket_issue_by", nullable=true, length=10)	
	private String ticket_issue_by;
	
	@Column(name="paid_leave", nullable=true, length=3)	
	private String paid_leave;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="approved_by", referencedColumnName="staff_id", nullable=false) })	
	private entityclasses.Staff approved_by;
	
	@Column(name="comment", nullable=true, length=255)	
	private String comment;
	
	@ManyToOne(targetEntity=entityclasses.Leave_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="leave_type_id", referencedColumnName="leave_type_id", nullable=false) })	
	private entityclasses.Leave_type leave_type;
	
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
	
	private void setLeave_transaction_id(int value) {
		this.leave_transaction_id = value;
	}
	
	public int getLeave_transaction_id() {
		return leave_transaction_id;
	}
	
	public int getORMID() {
		return getLeave_transaction_id();
	}
	
	public void setDays_taken(int value) {
		this.days_taken = value;
	}
	
	public int getDays_taken() {
		return days_taken;
	}
	
	public void setStart_date(java.util.Date value) {
		this.start_date = value;
	}
	
	public java.util.Date getStart_date() {
		return start_date;
	}
	
	public void setEnd_date(java.util.Date value) {
		this.end_date = value;
	}
	
	public java.util.Date getEnd_date() {
		return end_date;
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
	
	public void setLeave_year(int value) {
		setLeave_year(new Integer(value));
	}
	
	public void setLeave_year(Integer value) {
		this.leave_year = value;
	}
	
	public Integer getLeave_year() {
		return leave_year;
	}
	
	public void setLeave_quarter(String value) {
		this.leave_quarter = value;
	}
	
	public String getLeave_quarter() {
		return leave_quarter;
	}
	
	public void setTicket_issue_by(String value) {
		this.ticket_issue_by = value;
	}
	
	public String getTicket_issue_by() {
		return ticket_issue_by;
	}
	
	public void setPaid_leave(String value) {
		this.paid_leave = value;
	}
	
	public String getPaid_leave() {
		return paid_leave;
	}
	
	public void setLeave_type(entityclasses.Leave_type value) {
		this.leave_type = value;
	}
	
	public entityclasses.Leave_type getLeave_type() {
		return leave_type;
	}
	
	public void setStaff(entityclasses.Staff value) {
		this.staff = value;
	}
	
	public entityclasses.Staff getStaff() {
		return staff;
	}
	
	public void setEdit_user(entityclasses.User_detail value) {
		this.edit_user = value;
	}
	
	public entityclasses.User_detail getEdit_user() {
		return edit_user;
	}
	
	public void setAdd_user(entityclasses.User_detail value) {
		this.add_user = value;
	}
	
	public entityclasses.User_detail getAdd_user() {
		return add_user;
	}
	
	public void setApproved_by(entityclasses.Staff value) {
		this.approved_by = value;
	}
	
	public entityclasses.Staff getApproved_by() {
		return approved_by;
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
		return String.valueOf(getLeave_transaction_id());
	}
	
}
