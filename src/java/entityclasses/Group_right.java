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
@Table(name="group_right", uniqueConstraints={ @UniqueConstraint(columnNames={ "group_detail_id", "function_name" }) })
public class Group_right implements Serializable {
	public Group_right() {
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.load(entityclasses.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.get(entityclasses.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.load(entityclasses.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.get(entityclasses.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_right as Group_right");
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
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy, lockMode);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy, lockMode);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_right as Group_right");
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
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		Group_right[] group_rights = listGroup_rightByCriteria(group_rightCriteria);
		if(group_rights == null || group_rights.length == 0) {
			return null;
		}
		return group_rights[0];
	}
	
	public static Group_right[] listGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		return group_rightCriteria.listGroup_right();
	}
	
	public static Group_right createGroup_right() {
		return new entityclasses.Group_right();
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
				getGroup_detail().getGroup_right().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getGroup_right().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getGroup_right1().remove(this);
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
				getGroup_detail().getGroup_right().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getGroup_right().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getGroup_right1().remove(this);
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
	
	@Column(name="group_right_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR", strategy="native")	
	private int group_right_id;
	
	@ManyToOne(targetEntity=entityclasses.Group_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="group_detail_id", referencedColumnName="group_detail_id", nullable=false) })	
	private entityclasses.Group_detail group_detail;
	
	@Column(name="function_name", nullable=false, length=20)	
	private String function_name;
	
	@Column(name="allow_view", nullable=false, length=3)	
	private String allow_view;
	
	@Column(name="allow_add", nullable=false, length=3)	
	private String allow_add;
	
	@Column(name="allow_edit", nullable=false, length=3)	
	private String allow_edit;
	
	@Column(name="allow_delete", nullable=false, length=3)	
	private String allow_delete;
	
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
	
	private void setGroup_right_id(int value) {
		this.group_right_id = value;
	}
	
	public int getGroup_right_id() {
		return group_right_id;
	}
	
	public int getORMID() {
		return getGroup_right_id();
	}
	
	public void setFunction_name(String value) {
		this.function_name = value;
	}
	
	public String getFunction_name() {
		return function_name;
	}
	
	public void setAllow_view(String value) {
		this.allow_view = value;
	}
	
	public String getAllow_view() {
		return allow_view;
	}
	
	public void setAllow_add(String value) {
		this.allow_add = value;
	}
	
	public String getAllow_add() {
		return allow_add;
	}
	
	public void setAllow_edit(String value) {
		this.allow_edit = value;
	}
	
	public String getAllow_edit() {
		return allow_edit;
	}
	
	public void setAllow_delete(String value) {
		this.allow_delete = value;
	}
	
	public String getAllow_delete() {
		return allow_delete;
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
	
	public void setGroup_detail(entityclasses.Group_detail value) {
		this.group_detail = value;
	}
	
	public entityclasses.Group_detail getGroup_detail() {
		return group_detail;
	}
	
	public void setAdd_user(entityclasses.User_detail value) {
		this.add_user = value;
	}
	
	public entityclasses.User_detail getAdd_user() {
		return add_user;
	}
	
	public void setEdit_user(entityclasses.User_detail value) {
		this.edit_user = value;
	}
	
	public entityclasses.User_detail getEdit_user() {
		return edit_user;
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
		return String.valueOf(getGroup_right_id());
	}
	
}
