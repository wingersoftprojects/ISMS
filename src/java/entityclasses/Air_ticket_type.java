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
@Table(name="air_ticket_type")
public class Air_ticket_type implements Serializable {
	public Air_ticket_type() {
	}
	
	public static Air_ticket_type loadAir_ticket_typeByORMID(int air_ticket_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAir_ticket_typeByORMID(session, air_ticket_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type getAir_ticket_typeByORMID(int air_ticket_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getAir_ticket_typeByORMID(session, air_ticket_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByORMID(int air_ticket_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAir_ticket_typeByORMID(session, air_ticket_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type getAir_ticket_typeByORMID(int air_ticket_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getAir_ticket_typeByORMID(session, air_ticket_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByORMID(PersistentSession session, int air_ticket_type_id) throws PersistentException {
		try {
			return (Air_ticket_type) session.load(entityclasses.Air_ticket_type.class, new Integer(air_ticket_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type getAir_ticket_typeByORMID(PersistentSession session, int air_ticket_type_id) throws PersistentException {
		try {
			return (Air_ticket_type) session.get(entityclasses.Air_ticket_type.class, new Integer(air_ticket_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByORMID(PersistentSession session, int air_ticket_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Air_ticket_type) session.load(entityclasses.Air_ticket_type.class, new Integer(air_ticket_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type getAir_ticket_typeByORMID(PersistentSession session, int air_ticket_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Air_ticket_type) session.get(entityclasses.Air_ticket_type.class, new Integer(air_ticket_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAir_ticket_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryAir_ticket_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAir_ticket_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryAir_ticket_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type[] listAir_ticket_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listAir_ticket_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type[] listAir_ticket_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listAir_ticket_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAir_ticket_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Air_ticket_type as Air_ticket_type");
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
	
	public static List queryAir_ticket_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Air_ticket_type as Air_ticket_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Air_ticket_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type[] listAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAir_ticket_type(session, condition, orderBy);
			return (Air_ticket_type[]) list.toArray(new Air_ticket_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type[] listAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAir_ticket_type(session, condition, orderBy, lockMode);
			return (Air_ticket_type[]) list.toArray(new Air_ticket_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAir_ticket_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadAir_ticket_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Air_ticket_type[] air_ticket_types = listAir_ticket_typeByQuery(session, condition, orderBy);
		if (air_ticket_types != null && air_ticket_types.length > 0)
			return air_ticket_types[0];
		else
			return null;
	}
	
	public static Air_ticket_type loadAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Air_ticket_type[] air_ticket_types = listAir_ticket_typeByQuery(session, condition, orderBy, lockMode);
		if (air_ticket_types != null && air_ticket_types.length > 0)
			return air_ticket_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAir_ticket_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateAir_ticket_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAir_ticket_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateAir_ticket_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Air_ticket_type as Air_ticket_type");
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
	
	public static java.util.Iterator iterateAir_ticket_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Air_ticket_type as Air_ticket_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Air_ticket_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Air_ticket_type loadAir_ticket_typeByCriteria(Air_ticket_typeCriteria air_ticket_typeCriteria) {
		Air_ticket_type[] air_ticket_types = listAir_ticket_typeByCriteria(air_ticket_typeCriteria);
		if(air_ticket_types == null || air_ticket_types.length == 0) {
			return null;
		}
		return air_ticket_types[0];
	}
	
	public static Air_ticket_type[] listAir_ticket_typeByCriteria(Air_ticket_typeCriteria air_ticket_typeCriteria) {
		return air_ticket_typeCriteria.listAir_ticket_type();
	}
	
	public static Air_ticket_type createAir_ticket_type() {
		return new entityclasses.Air_ticket_type();
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
				lStaffs[i].setAir_ticket_type(null);
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
				lStaffs[i].setAir_ticket_type(null);
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
	
	@Column(name="air_ticket_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_AIR_TICKET_TYPE_AIR_TICKET_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_AIR_TICKET_TYPE_AIR_TICKET_TYPE_ID_GENERATOR", strategy="native")	
	private int air_ticket_type_id;
	
	@Column(name="air_ticket_type_name", nullable=false, length=50)	
	private String air_ticket_type_name;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@OneToMany(mappedBy="air_ticket_type", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff = new java.util.HashSet();
	
	private void setAir_ticket_type_id(int value) {
		this.air_ticket_type_id = value;
	}
	
	public int getAir_ticket_type_id() {
		return air_ticket_type_id;
	}
	
	public int getORMID() {
		return getAir_ticket_type_id();
	}
	
	public void setAir_ticket_type_name(String value) {
		this.air_ticket_type_name = value;
	}
	
	public String getAir_ticket_type_name() {
		return air_ticket_type_name;
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
		     Air_ticket_type object = (Air_ticket_type) obj;
		        return (this.getAir_ticket_type_id() == object.getAir_ticket_type_id());
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getAir_ticket_type_id());
	}
	
}
