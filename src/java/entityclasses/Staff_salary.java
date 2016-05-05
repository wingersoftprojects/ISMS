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
@Table(name="staff_salary")
public class Staff_salary implements Serializable {
	public Staff_salary() {
	}
	
	public static Staff_salary loadStaff_salaryByORMID(int staff_salary_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_salaryByORMID(session, staff_salary_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary getStaff_salaryByORMID(int staff_salary_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaff_salaryByORMID(session, staff_salary_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByORMID(int staff_salary_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_salaryByORMID(session, staff_salary_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary getStaff_salaryByORMID(int staff_salary_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaff_salaryByORMID(session, staff_salary_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByORMID(PersistentSession session, int staff_salary_id) throws PersistentException {
		try {
			return (Staff_salary) session.load(entityclasses.Staff_salary.class, new Integer(staff_salary_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary getStaff_salaryByORMID(PersistentSession session, int staff_salary_id) throws PersistentException {
		try {
			return (Staff_salary) session.get(entityclasses.Staff_salary.class, new Integer(staff_salary_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByORMID(PersistentSession session, int staff_salary_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_salary) session.load(entityclasses.Staff_salary.class, new Integer(staff_salary_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary getStaff_salaryByORMID(PersistentSession session, int staff_salary_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_salary) session.get(entityclasses.Staff_salary.class, new Integer(staff_salary_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_salary(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff_salary(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_salary(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff_salary(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary[] listStaff_salaryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaff_salaryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary[] listStaff_salaryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaff_salaryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_salary(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_salary as Staff_salary");
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
	
	public static List queryStaff_salary(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_salary as Staff_salary");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff_salary", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary[] listStaff_salaryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStaff_salary(session, condition, orderBy);
			return (Staff_salary[]) list.toArray(new Staff_salary[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary[] listStaff_salaryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStaff_salary(session, condition, orderBy, lockMode);
			return (Staff_salary[]) list.toArray(new Staff_salary[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_salaryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_salaryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Staff_salary[] staff_salarys = listStaff_salaryByQuery(session, condition, orderBy);
		if (staff_salarys != null && staff_salarys.length > 0)
			return staff_salarys[0];
		else
			return null;
	}
	
	public static Staff_salary loadStaff_salaryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Staff_salary[] staff_salarys = listStaff_salaryByQuery(session, condition, orderBy, lockMode);
		if (staff_salarys != null && staff_salarys.length > 0)
			return staff_salarys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStaff_salaryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaff_salaryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_salaryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaff_salaryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_salaryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_salary as Staff_salary");
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
	
	public static java.util.Iterator iterateStaff_salaryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_salary as Staff_salary");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff_salary", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_salary loadStaff_salaryByCriteria(Staff_salaryCriteria staff_salaryCriteria) {
		Staff_salary[] staff_salarys = listStaff_salaryByCriteria(staff_salaryCriteria);
		if(staff_salarys == null || staff_salarys.length == 0) {
			return null;
		}
		return staff_salarys[0];
	}
	
	public static Staff_salary[] listStaff_salaryByCriteria(Staff_salaryCriteria staff_salaryCriteria) {
		return staff_salaryCriteria.listStaff_salary();
	}
	
	public static Staff_salary createStaff_salary() {
		return new entityclasses.Staff_salary();
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
				getStaff().getStaff_salary().remove(this);
			}
			
			if(getCurrency_type() != null) {
				getCurrency_type().getStaff_salary().remove(this);
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
				getStaff().getStaff_salary().remove(this);
			}
			
			if(getCurrency_type() != null) {
				getCurrency_type().getStaff_salary().remove(this);
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
	
	@Column(name="staff_salary_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_STAFF_SALARY_STAFF_SALARY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_STAFF_SALARY_STAFF_SALARY_ID_GENERATOR", strategy="native")	
	private int staff_salary_id;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_id", referencedColumnName="staff_id", nullable=false) })	
	private entityclasses.Staff staff;
	
	@ManyToOne(targetEntity=entityclasses.Currency_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="currency_type_id", referencedColumnName="currency_type_id", nullable=false) })	
	private entityclasses.Currency_type currency_type;
	
	@Column(name="salary", nullable=false)	
	private Float salary;
	
	@Column(name="startdate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date startdate;
	
	@Column(name="enddate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date enddate;
	
	@Column(name="Is_active", nullable=true, length=255)	
	private String is_active;
	
	@Column(name="editting_id", nullable=true, length=11)	
	private Integer editting_id;
	
	@Column(name="is_net_or_gross", nullable=true, length=20)	
	private String is_net_or_gross;
	
	private void setStaff_salary_id(int value) {
		this.staff_salary_id = value;
	}
	
	public int getStaff_salary_id() {
		return staff_salary_id;
	}
	
	public int getORMID() {
		return getStaff_salary_id();
	}
	
	public void setSalary(float value) {
		setSalary(new Float(value));
	}
	
	public void setSalary(Float value) {
		this.salary = value;
	}
	
	public Float getSalary() {
		return salary;
	}
	
	public void setStartdate(java.util.Date value) {
		this.startdate = value;
	}
	
	public java.util.Date getStartdate() {
		return startdate;
	}
	
	public void setEnddate(java.util.Date value) {
		this.enddate = value;
	}
	
	public java.util.Date getEnddate() {
		return enddate;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setEditting_id(int value) {
		setEditting_id(new Integer(value));
	}
	
	public void setEditting_id(Integer value) {
		this.editting_id = value;
	}
	
	public Integer getEditting_id() {
		return editting_id;
	}
	
	public void setIs_net_or_gross(String value) {
		this.is_net_or_gross = value;
	}
	
	public String getIs_net_or_gross() {
		return is_net_or_gross;
	}
	
	public void setCurrency_type(entityclasses.Currency_type value) {
		this.currency_type = value;
	}
	
	public entityclasses.Currency_type getCurrency_type() {
		return currency_type;
	}
	
	public void setStaff(entityclasses.Staff value) {
		this.staff = value;
	}
	
	public entityclasses.Staff getStaff() {
		return staff;
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
		return String.valueOf(getStaff_salary_id());
	}
	
}
