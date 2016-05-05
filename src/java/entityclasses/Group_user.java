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
@Table(name="group_user", uniqueConstraints={ @UniqueConstraint(columnNames={ "group_detail_id", "user_detail_id" }) })
public class Group_user implements Serializable {
	public Group_user() {
	}
	
	public static Group_user loadGroup_userByORMID(int group_user_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_userByORMID(session, group_user_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user getGroup_userByORMID(int group_user_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getGroup_userByORMID(session, group_user_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByORMID(int group_user_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_userByORMID(session, group_user_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user getGroup_userByORMID(int group_user_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getGroup_userByORMID(session, group_user_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByORMID(PersistentSession session, int group_user_id) throws PersistentException {
		try {
			return (Group_user) session.load(entityclasses.Group_user.class, new Integer(group_user_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user getGroup_userByORMID(PersistentSession session, int group_user_id) throws PersistentException {
		try {
			return (Group_user) session.get(entityclasses.Group_user.class, new Integer(group_user_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByORMID(PersistentSession session, int group_user_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_user) session.load(entityclasses.Group_user.class, new Integer(group_user_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user getGroup_userByORMID(PersistentSession session, int group_user_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_user) session.get(entityclasses.Group_user.class, new Integer(group_user_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_user(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryGroup_user(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_user(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryGroup_user(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user[] listGroup_userByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listGroup_userByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user[] listGroup_userByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listGroup_userByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_user(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_user as Group_user");
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
	
	public static List queryGroup_user(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_user as Group_user");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_user", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user[] listGroup_userByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGroup_user(session, condition, orderBy);
			return (Group_user[]) list.toArray(new Group_user[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user[] listGroup_userByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGroup_user(session, condition, orderBy, lockMode);
			return (Group_user[]) list.toArray(new Group_user[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_userByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_userByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Group_user[] group_users = listGroup_userByQuery(session, condition, orderBy);
		if (group_users != null && group_users.length > 0)
			return group_users[0];
		else
			return null;
	}
	
	public static Group_user loadGroup_userByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Group_user[] group_users = listGroup_userByQuery(session, condition, orderBy, lockMode);
		if (group_users != null && group_users.length > 0)
			return group_users[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGroup_userByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateGroup_userByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_userByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateGroup_userByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_userByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_user as Group_user");
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
	
	public static java.util.Iterator iterateGroup_userByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_user as Group_user");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_user", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_user loadGroup_userByCriteria(Group_userCriteria group_userCriteria) {
		Group_user[] group_users = listGroup_userByCriteria(group_userCriteria);
		if(group_users == null || group_users.length == 0) {
			return null;
		}
		return group_users[0];
	}
	
	public static Group_user[] listGroup_userByCriteria(Group_userCriteria group_userCriteria) {
		return group_userCriteria.listGroup_user();
	}
	
	public static Group_user createGroup_user() {
		return new entityclasses.Group_user();
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_user().remove(this);
			}
			
			if(getUser_detail() != null) {
				getUser_detail().getGroup_user().remove(this);
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_user().remove(this);
			}
			
			if(getUser_detail() != null) {
				getUser_detail().getGroup_user().remove(this);
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
	
	@Column(name="group_user_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_GROUP_USER_GROUP_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_GROUP_USER_GROUP_USER_ID_GENERATOR", strategy="native")	
	private int group_user_id;
	
	@ManyToOne(targetEntity=entityclasses.Group_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="group_detail_id", referencedColumnName="group_detail_id", nullable=false) })	
	private entityclasses.Group_detail group_detail;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="user_detail_id", referencedColumnName="user_detail_id", nullable=false) })	
	private entityclasses.User_detail user_detail;
	
	private void setGroup_user_id(int value) {
		this.group_user_id = value;
	}
	
	public int getGroup_user_id() {
		return group_user_id;
	}
	
	public int getORMID() {
		return getGroup_user_id();
	}
	
	public void setUser_detail(entityclasses.User_detail value) {
		this.user_detail = value;
	}
	
	public entityclasses.User_detail getUser_detail() {
		return user_detail;
	}
	
	public void setGroup_detail(entityclasses.Group_detail value) {
		this.group_detail = value;
	}
	
	public entityclasses.Group_detail getGroup_detail() {
		return group_detail;
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
		return String.valueOf(getGroup_user_id());
	}
	
}
