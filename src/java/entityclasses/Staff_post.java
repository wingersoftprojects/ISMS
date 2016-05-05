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
@Table(name="staff_post")
public class Staff_post implements Serializable {
	public Staff_post() {
	}
	
	public static Staff_post loadStaff_postByORMID(int staff_post_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_postByORMID(session, staff_post_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post getStaff_postByORMID(int staff_post_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaff_postByORMID(session, staff_post_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByORMID(int staff_post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_postByORMID(session, staff_post_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post getStaff_postByORMID(int staff_post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaff_postByORMID(session, staff_post_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByORMID(PersistentSession session, int staff_post_id) throws PersistentException {
		try {
			return (Staff_post) session.load(entityclasses.Staff_post.class, new Integer(staff_post_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post getStaff_postByORMID(PersistentSession session, int staff_post_id) throws PersistentException {
		try {
			return (Staff_post) session.get(entityclasses.Staff_post.class, new Integer(staff_post_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByORMID(PersistentSession session, int staff_post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_post) session.load(entityclasses.Staff_post.class, new Integer(staff_post_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post getStaff_postByORMID(PersistentSession session, int staff_post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_post) session.get(entityclasses.Staff_post.class, new Integer(staff_post_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_post(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff_post(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_post(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff_post(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post[] listStaff_postByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaff_postByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post[] listStaff_postByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaff_postByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_post(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_post as Staff_post");
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
	
	public static List queryStaff_post(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_post as Staff_post");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff_post", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post[] listStaff_postByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStaff_post(session, condition, orderBy);
			return (Staff_post[]) list.toArray(new Staff_post[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post[] listStaff_postByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStaff_post(session, condition, orderBy, lockMode);
			return (Staff_post[]) list.toArray(new Staff_post[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_postByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaff_postByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Staff_post[] staff_posts = listStaff_postByQuery(session, condition, orderBy);
		if (staff_posts != null && staff_posts.length > 0)
			return staff_posts[0];
		else
			return null;
	}
	
	public static Staff_post loadStaff_postByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Staff_post[] staff_posts = listStaff_postByQuery(session, condition, orderBy, lockMode);
		if (staff_posts != null && staff_posts.length > 0)
			return staff_posts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStaff_postByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaff_postByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_postByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaff_postByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_postByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_post as Staff_post");
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
	
	public static java.util.Iterator iterateStaff_postByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff_post as Staff_post");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff_post", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_post loadStaff_postByCriteria(Staff_postCriteria staff_postCriteria) {
		Staff_post[] staff_posts = listStaff_postByCriteria(staff_postCriteria);
		if(staff_posts == null || staff_posts.length == 0) {
			return null;
		}
		return staff_posts[0];
	}
	
	public static Staff_post[] listStaff_postByCriteria(Staff_postCriteria staff_postCriteria) {
		return staff_postCriteria.listStaff_post();
	}
	
	public static Staff_post createStaff_post() {
		return new entityclasses.Staff_post();
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
				lStaffs[i].setStaff_post(null);
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
				lStaffs[i].setStaff_post(null);
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
	
	@Column(name="staff_post_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_STAFF_POST_STAFF_POST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_STAFF_POST_STAFF_POST_ID_GENERATOR", strategy="native")	
	private int staff_post_id;
	
	@Column(name="staff_post_name", nullable=false, length=50)	
	private String staff_post_name;
	
	@Column(name="Is_active", nullable=false, length=3)	
	private String is_active;
	
	@OneToMany(mappedBy="staff_post", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff = new java.util.HashSet();
	
	private void setStaff_post_id(int value) {
		this.staff_post_id = value;
	}
	
	public int getStaff_post_id() {
		return staff_post_id;
	}
	
	public int getORMID() {
		return getStaff_post_id();
	}
	
	public void setStaff_post_name(String value) {
		this.staff_post_name = value;
	}
	
	public String getStaff_post_name() {
		return staff_post_name;
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
		Staff_post object = (Staff_post) obj;
		        return (this.getStaff_post_id() == object.getStaff_post_id());
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getStaff_post_id());
	}
	
}
