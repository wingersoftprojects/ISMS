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
@Table(name="currency_type")
public class Currency_type implements Serializable {
	public Currency_type() {
	}
	
	public static Currency_type loadCurrency_typeByORMID(int currency_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrency_typeByORMID(session, currency_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type getCurrency_typeByORMID(int currency_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCurrency_typeByORMID(session, currency_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByORMID(int currency_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrency_typeByORMID(session, currency_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type getCurrency_typeByORMID(int currency_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCurrency_typeByORMID(session, currency_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByORMID(PersistentSession session, int currency_type_id) throws PersistentException {
		try {
			return (Currency_type) session.load(entityclasses.Currency_type.class, new Integer(currency_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type getCurrency_typeByORMID(PersistentSession session, int currency_type_id) throws PersistentException {
		try {
			return (Currency_type) session.get(entityclasses.Currency_type.class, new Integer(currency_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByORMID(PersistentSession session, int currency_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Currency_type) session.load(entityclasses.Currency_type.class, new Integer(currency_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type getCurrency_typeByORMID(PersistentSession session, int currency_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Currency_type) session.get(entityclasses.Currency_type.class, new Integer(currency_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrency_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCurrency_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrency_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCurrency_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type[] listCurrency_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCurrency_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type[] listCurrency_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCurrency_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurrency_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Currency_type as Currency_type");
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
	
	public static List queryCurrency_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Currency_type as Currency_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Currency_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type[] listCurrency_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurrency_type(session, condition, orderBy);
			return (Currency_type[]) list.toArray(new Currency_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type[] listCurrency_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurrency_type(session, condition, orderBy, lockMode);
			return (Currency_type[]) list.toArray(new Currency_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrency_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCurrency_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Currency_type[] currency_types = listCurrency_typeByQuery(session, condition, orderBy);
		if (currency_types != null && currency_types.length > 0)
			return currency_types[0];
		else
			return null;
	}
	
	public static Currency_type loadCurrency_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Currency_type[] currency_types = listCurrency_typeByQuery(session, condition, orderBy, lockMode);
		if (currency_types != null && currency_types.length > 0)
			return currency_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCurrency_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCurrency_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurrency_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCurrency_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurrency_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Currency_type as Currency_type");
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
	
	public static java.util.Iterator iterateCurrency_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Currency_type as Currency_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Currency_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Currency_type loadCurrency_typeByCriteria(Currency_typeCriteria currency_typeCriteria) {
		Currency_type[] currency_types = listCurrency_typeByCriteria(currency_typeCriteria);
		if(currency_types == null || currency_types.length == 0) {
			return null;
		}
		return currency_types[0];
	}
	
	public static Currency_type[] listCurrency_typeByCriteria(Currency_typeCriteria currency_typeCriteria) {
		return currency_typeCriteria.listCurrency_type();
	}
	
	public static Currency_type createCurrency_type() {
		return new entityclasses.Currency_type();
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
			entityclasses.Staff_salary[] lStaff_salarys = (entityclasses.Staff_salary[])getStaff_salary().toArray(new entityclasses.Staff_salary[getStaff_salary().size()]);
			for(int i = 0; i < lStaff_salarys.length; i++) {
				lStaff_salarys[i].setCurrency_type(null);
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
			entityclasses.Staff_salary[] lStaff_salarys = (entityclasses.Staff_salary[])getStaff_salary().toArray(new entityclasses.Staff_salary[getStaff_salary().size()]);
			for(int i = 0; i < lStaff_salarys.length; i++) {
				lStaff_salarys[i].setCurrency_type(null);
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
	
	@Column(name="currency_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_CURRENCY_TYPE_CURRENCY_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_CURRENCY_TYPE_CURRENCY_TYPE_ID_GENERATOR", strategy="native")	
	private int currency_type_id;
	
	@Column(name="currency_type_name", nullable=false, length=50)	
	private String currency_type_name;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@OneToMany(mappedBy="currency_type", targetEntity=entityclasses.Staff_salary.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff_salary = new java.util.HashSet();
	
	private void setCurrency_type_id(int value) {
		this.currency_type_id = value;
	}
	
	public int getCurrency_type_id() {
		return currency_type_id;
	}
	
	public int getORMID() {
		return getCurrency_type_id();
	}
	
	public void setCurrency_type_name(String value) {
		this.currency_type_name = value;
	}
	
	public String getCurrency_type_name() {
		return currency_type_name;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setStaff_salary(java.util.Set value) {
		this.staff_salary = value;
	}
	
	public java.util.Set getStaff_salary() {
		return staff_salary;
	}
	
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		       Currency_type object = (Currency_type) obj;
		        return (this.getCurrency_type_id() == object.getCurrency_type_id());
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getCurrency_type_id());
	}
	
}
