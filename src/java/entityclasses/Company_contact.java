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
@Table(name="company_contact")
public class Company_contact implements Serializable {
	public Company_contact() {
	}
	
	public static Company_contact loadCompany_contactByORMID(int company_contact_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCompany_contactByORMID(session, company_contact_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact getCompany_contactByORMID(int company_contact_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCompany_contactByORMID(session, company_contact_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByORMID(int company_contact_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCompany_contactByORMID(session, company_contact_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact getCompany_contactByORMID(int company_contact_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getCompany_contactByORMID(session, company_contact_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByORMID(PersistentSession session, int company_contact_id) throws PersistentException {
		try {
			return (Company_contact) session.load(entityclasses.Company_contact.class, new Integer(company_contact_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact getCompany_contactByORMID(PersistentSession session, int company_contact_id) throws PersistentException {
		try {
			return (Company_contact) session.get(entityclasses.Company_contact.class, new Integer(company_contact_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByORMID(PersistentSession session, int company_contact_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_contact) session.load(entityclasses.Company_contact.class, new Integer(company_contact_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact getCompany_contactByORMID(PersistentSession session, int company_contact_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_contact) session.get(entityclasses.Company_contact.class, new Integer(company_contact_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_contact(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCompany_contact(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_contact(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryCompany_contact(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact[] listCompany_contactByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCompany_contactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact[] listCompany_contactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listCompany_contactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_contact(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Company_contact as Company_contact");
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
	
	public static List queryCompany_contact(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Company_contact as Company_contact");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_contact", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact[] listCompany_contactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompany_contact(session, condition, orderBy);
			return (Company_contact[]) list.toArray(new Company_contact[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact[] listCompany_contactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompany_contact(session, condition, orderBy, lockMode);
			return (Company_contact[]) list.toArray(new Company_contact[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCompany_contactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadCompany_contactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Company_contact[] company_contacts = listCompany_contactByQuery(session, condition, orderBy);
		if (company_contacts != null && company_contacts.length > 0)
			return company_contacts[0];
		else
			return null;
	}
	
	public static Company_contact loadCompany_contactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Company_contact[] company_contacts = listCompany_contactByQuery(session, condition, orderBy, lockMode);
		if (company_contacts != null && company_contacts.length > 0)
			return company_contacts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompany_contactByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCompany_contactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_contactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateCompany_contactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_contactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Company_contact as Company_contact");
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
	
	public static java.util.Iterator iterateCompany_contactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Company_contact as Company_contact");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_contact", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_contact loadCompany_contactByCriteria(Company_contactCriteria company_contactCriteria) {
		Company_contact[] company_contacts = listCompany_contactByCriteria(company_contactCriteria);
		if(company_contacts == null || company_contacts.length == 0) {
			return null;
		}
		return company_contacts[0];
	}
	
	public static Company_contact[] listCompany_contactByCriteria(Company_contactCriteria company_contactCriteria) {
		return company_contactCriteria.listCompany_contact();
	}
	
	public static Company_contact createCompany_contact() {
		return new entityclasses.Company_contact();
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
			if(getCompany() != null) {
				getCompany().getCompany_contact().remove(this);
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
			if(getCompany() != null) {
				getCompany().getCompany_contact().remove(this);
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
	
	@Column(name="company_contact_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_COMPANY_CONTACT_COMPANY_CONTACT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_COMPANY_CONTACT_COMPANY_CONTACT_ID_GENERATOR", strategy="native")	
	private int company_contact_id;
	
	@Column(name="contact_name", nullable=false, length=100)	
	private String contact_name;
	
	@Column(name="contact_email", nullable=false, length=100)	
	private String contact_email;
	
	@Column(name="contact_phone", nullable=true, length=100)	
	private String contact_phone;
	
	@Column(name="contact_title", nullable=false, length=100)	
	private String contact_title;
	
	@ManyToOne(targetEntity=entityclasses.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private entityclasses.Company company;
	
	private void setCompany_contact_id(int value) {
		this.company_contact_id = value;
	}
	
	public int getCompany_contact_id() {
		return company_contact_id;
	}
	
	public int getORMID() {
		return getCompany_contact_id();
	}
	
	public void setContact_name(String value) {
		this.contact_name = value;
	}
	
	public String getContact_name() {
		return contact_name;
	}
	
	public void setContact_email(String value) {
		this.contact_email = value;
	}
	
	public String getContact_email() {
		return contact_email;
	}
	
	public void setContact_phone(String value) {
		this.contact_phone = value;
	}
	
	public String getContact_phone() {
		return contact_phone;
	}
	
	public void setContact_title(String value) {
		this.contact_title = value;
	}
	
	public String getContact_title() {
		return contact_title;
	}
	
	public void setCompany(entityclasses.Company value) {
		this.company = value;
	}
	
	public entityclasses.Company getCompany() {
		return company;
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
		return String.valueOf(getCompany_contact_id());
	}
	
}
