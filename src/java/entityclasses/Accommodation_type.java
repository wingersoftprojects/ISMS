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
@Table(name="accommodation_type")
public class Accommodation_type implements Serializable {
	public Accommodation_type() {
	}
	
	public static Accommodation_type loadAccommodation_typeByORMID(int accommodation_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAccommodation_typeByORMID(session, accommodation_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type getAccommodation_typeByORMID(int accommodation_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getAccommodation_typeByORMID(session, accommodation_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByORMID(int accommodation_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAccommodation_typeByORMID(session, accommodation_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type getAccommodation_typeByORMID(int accommodation_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getAccommodation_typeByORMID(session, accommodation_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByORMID(PersistentSession session, int accommodation_type_id) throws PersistentException {
		try {
			return (Accommodation_type) session.load(entityclasses.Accommodation_type.class, new Integer(accommodation_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type getAccommodation_typeByORMID(PersistentSession session, int accommodation_type_id) throws PersistentException {
		try {
			return (Accommodation_type) session.get(entityclasses.Accommodation_type.class, new Integer(accommodation_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByORMID(PersistentSession session, int accommodation_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Accommodation_type) session.load(entityclasses.Accommodation_type.class, new Integer(accommodation_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type getAccommodation_typeByORMID(PersistentSession session, int accommodation_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Accommodation_type) session.get(entityclasses.Accommodation_type.class, new Integer(accommodation_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAccommodation_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryAccommodation_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAccommodation_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryAccommodation_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type[] listAccommodation_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listAccommodation_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type[] listAccommodation_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listAccommodation_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAccommodation_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Accommodation_type as Accommodation_type");
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
	
	public static List queryAccommodation_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Accommodation_type as Accommodation_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Accommodation_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type[] listAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAccommodation_type(session, condition, orderBy);
			return (Accommodation_type[]) list.toArray(new Accommodation_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type[] listAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAccommodation_type(session, condition, orderBy, lockMode);
			return (Accommodation_type[]) list.toArray(new Accommodation_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAccommodation_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAccommodation_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Accommodation_type[] accommodation_types = listAccommodation_typeByQuery(session, condition, orderBy);
		if (accommodation_types != null && accommodation_types.length > 0)
			return accommodation_types[0];
		else
			return null;
	}
	
	public static Accommodation_type loadAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Accommodation_type[] accommodation_types = listAccommodation_typeByQuery(session, condition, orderBy, lockMode);
		if (accommodation_types != null && accommodation_types.length > 0)
			return accommodation_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAccommodation_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateAccommodation_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAccommodation_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateAccommodation_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Accommodation_type as Accommodation_type");
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
	
	public static java.util.Iterator iterateAccommodation_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Accommodation_type as Accommodation_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Accommodation_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Accommodation_type loadAccommodation_typeByCriteria(Accommodation_typeCriteria accommodation_typeCriteria) {
		Accommodation_type[] accommodation_types = listAccommodation_typeByCriteria(accommodation_typeCriteria);
		if(accommodation_types == null || accommodation_types.length == 0) {
			return null;
		}
		return accommodation_types[0];
	}
	
	public static Accommodation_type[] listAccommodation_typeByCriteria(Accommodation_typeCriteria accommodation_typeCriteria) {
		return accommodation_typeCriteria.listAccommodation_type();
	}
	
	public static Accommodation_type createAccommodation_type() {
		return new entityclasses.Accommodation_type();
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
			entityclasses.Staff[] lStaffs = (entityclasses.Staff[])getStaff().toArray(new entityclasses.Staff[getStaff().size()]);
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setAccom_type(null);
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
			entityclasses.Staff[] lStaffs = (entityclasses.Staff[])getStaff().toArray(new entityclasses.Staff[getStaff().size()]);
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setAccom_type(null);
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
	
	@Column(name="accommodation_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_ACCOMMODATION_TYPE_ACCOMMODATION_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_ACCOMMODATION_TYPE_ACCOMMODATION_TYPE_ID_GENERATOR", strategy="native")	
	private int accommodation_type_id;
	
	@Column(name="accommodation_type_name", nullable=false, length=50)	
	private String accommodation_type_name;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@OneToMany(mappedBy="accom_type", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff = new java.util.HashSet();
	
	private void setAccommodation_type_id(int value) {
		this.accommodation_type_id = value;
	}
	
	public int getAccommodation_type_id() {
		return accommodation_type_id;
	}
	
	public int getORMID() {
		return getAccommodation_type_id();
	}
	
	public void setAccommodation_type_name(String value) {
		this.accommodation_type_name = value;
	}
	
	public String getAccommodation_type_name() {
		return accommodation_type_name;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setStaff(java.util.Set value) {
		this.staff = value;
	}
	
	public java.util.Set getStaff() {
		return staff;
	}
	
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		        Accommodation_type object = (Accommodation_type) obj;
		        return (this.getAccommodation_type_id() == object.getAccommodation_type_id());
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getAccommodation_type_id());
	}
	
}
