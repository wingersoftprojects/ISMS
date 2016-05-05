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
@Table(name="user_detail")
public class User_detail implements Serializable {
	public User_detail() {
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.load(entityclasses.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.get(entityclasses.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.load(entityclasses.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.get(entityclasses.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.User_detail as User_detail");
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
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy, lockMode);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy, lockMode);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.User_detail as User_detail");
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
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		User_detail[] user_details = listUser_detailByCriteria(user_detailCriteria);
		if(user_details == null || user_details.length == 0) {
			return null;
		}
		return user_details[0];
	}
	
	public static User_detail[] listUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		return user_detailCriteria.listUser_detail();
	}
	
	public static User_detail createUser_detail() {
		return new entityclasses.User_detail();
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
				getStaff().getUser_details().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getUser_detail().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getUser_detail1().remove(this);
			}
			
			entityclasses.Group_user[] lGroup_users = (entityclasses.Group_user[])getGroup_user().toArray(new entityclasses.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setAssigned_user(null);
			}
			entityclasses.Activity[] lActivitys = (entityclasses.Activity[])getActivity().toArray(new entityclasses.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setAdd_user(null);
			}
			entityclasses.Activity[] lActivity1s = (entityclasses.Activity[])getActivity1().toArray(new entityclasses.Activity[getActivity1().size()]);
			for(int i = 0; i < lActivity1s.length; i++) {
				lActivity1s[i].setEdit_user(null);
			}
			entityclasses.Group_right[] lGroup_rights = (entityclasses.Group_right[])getGroup_right().toArray(new entityclasses.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setAdd_user(null);
			}
			entityclasses.Group_right[] lGroup_right1s = (entityclasses.Group_right[])getGroup_right1().toArray(new entityclasses.Group_right[getGroup_right1().size()]);
			for(int i = 0; i < lGroup_right1s.length; i++) {
				lGroup_right1s[i].setEdit_user(null);
			}
			entityclasses.User_detail[] lUser_details = (entityclasses.User_detail[])getUser_detail().toArray(new entityclasses.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setAdd_user(null);
			}
			entityclasses.User_detail[] lUser_detail1s = (entityclasses.User_detail[])getUser_detail1().toArray(new entityclasses.User_detail[getUser_detail1().size()]);
			for(int i = 0; i < lUser_detail1s.length; i++) {
				lUser_detail1s[i].setEdit_user(null);
			}
			entityclasses.Company[] lCompanys = (entityclasses.Company[])getCompany().toArray(new entityclasses.Company[getCompany().size()]);
			for(int i = 0; i < lCompanys.length; i++) {
				lCompanys[i].setEdit_user(null);
			}
			entityclasses.Company[] lCompany1s = (entityclasses.Company[])getCompany1().toArray(new entityclasses.Company[getCompany1().size()]);
			for(int i = 0; i < lCompany1s.length; i++) {
				lCompany1s[i].setAdd_user(null);
			}
			entityclasses.Staff[] lStaff1s = (entityclasses.Staff[])getStaff1().toArray(new entityclasses.Staff[getStaff1().size()]);
			for(int i = 0; i < lStaff1s.length; i++) {
				lStaff1s[i].setAdd_user(null);
			}
			entityclasses.Staff[] lStaff2s = (entityclasses.Staff[])getStaff2().toArray(new entityclasses.Staff[getStaff2().size()]);
			for(int i = 0; i < lStaff2s.length; i++) {
				lStaff2s[i].setEdit_user(null);
			}
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setAdd_user(null);
			}
			entityclasses.Task_document[] lTask_document1s = (entityclasses.Task_document[])getTask_document1().toArray(new entityclasses.Task_document[getTask_document1().size()]);
			for(int i = 0; i < lTask_document1s.length; i++) {
				lTask_document1s[i].setEdit_user(null);
			}
			entityclasses.Agent[] lAgents = (entityclasses.Agent[])getAgent().toArray(new entityclasses.Agent[getAgent().size()]);
			for(int i = 0; i < lAgents.length; i++) {
				lAgents[i].setAdd_user(null);
			}
			entityclasses.Agent[] lAgent1s = (entityclasses.Agent[])getAgent1().toArray(new entityclasses.Agent[getAgent1().size()]);
			for(int i = 0; i < lAgent1s.length; i++) {
				lAgent1s[i].setEdit_user(null);
			}
			entityclasses.Task[] lTask1s = (entityclasses.Task[])getTask1().toArray(new entityclasses.Task[getTask1().size()]);
			for(int i = 0; i < lTask1s.length; i++) {
				lTask1s[i].setAdd_user(null);
			}
			entityclasses.Task[] lTask2s = (entityclasses.Task[])getTask2().toArray(new entityclasses.Task[getTask2().size()]);
			for(int i = 0; i < lTask2s.length; i++) {
				lTask2s[i].setEdit_user(null);
			}
			entityclasses.Task[] lTask3s = (entityclasses.Task[])getTask3().toArray(new entityclasses.Task[getTask3().size()]);
			for(int i = 0; i < lTask3s.length; i++) {
				lTask3s[i].setApproval_by(null);
			}
			entityclasses.Leave_transaction[] lLeave_transactions = (entityclasses.Leave_transaction[])getLeave_transaction().toArray(new entityclasses.Leave_transaction[getLeave_transaction().size()]);
			for(int i = 0; i < lLeave_transactions.length; i++) {
				lLeave_transactions[i].setEdit_user(null);
			}
			entityclasses.Leave_transaction[] lLeave_transaction1s = (entityclasses.Leave_transaction[])getLeave_transaction1().toArray(new entityclasses.Leave_transaction[getLeave_transaction1().size()]);
			for(int i = 0; i < lLeave_transaction1s.length; i++) {
				lLeave_transaction1s[i].setAdd_user(null);
			}
			entityclasses.Task[] lTask4s = (entityclasses.Task[])getTask4().toArray(new entityclasses.Task[getTask4().size()]);
			for(int i = 0; i < lTask4s.length; i++) {
				lTask4s[i].setCompleted_by(null);
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
				getStaff().getUser_details().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getUser_detail().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getUser_detail1().remove(this);
			}
			
			entityclasses.Group_user[] lGroup_users = (entityclasses.Group_user[])getGroup_user().toArray(new entityclasses.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setAssigned_user(null);
			}
			entityclasses.Activity[] lActivitys = (entityclasses.Activity[])getActivity().toArray(new entityclasses.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setAdd_user(null);
			}
			entityclasses.Activity[] lActivity1s = (entityclasses.Activity[])getActivity1().toArray(new entityclasses.Activity[getActivity1().size()]);
			for(int i = 0; i < lActivity1s.length; i++) {
				lActivity1s[i].setEdit_user(null);
			}
			entityclasses.Group_right[] lGroup_rights = (entityclasses.Group_right[])getGroup_right().toArray(new entityclasses.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setAdd_user(null);
			}
			entityclasses.Group_right[] lGroup_right1s = (entityclasses.Group_right[])getGroup_right1().toArray(new entityclasses.Group_right[getGroup_right1().size()]);
			for(int i = 0; i < lGroup_right1s.length; i++) {
				lGroup_right1s[i].setEdit_user(null);
			}
			entityclasses.User_detail[] lUser_details = (entityclasses.User_detail[])getUser_detail().toArray(new entityclasses.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setAdd_user(null);
			}
			entityclasses.User_detail[] lUser_detail1s = (entityclasses.User_detail[])getUser_detail1().toArray(new entityclasses.User_detail[getUser_detail1().size()]);
			for(int i = 0; i < lUser_detail1s.length; i++) {
				lUser_detail1s[i].setEdit_user(null);
			}
			entityclasses.Company[] lCompanys = (entityclasses.Company[])getCompany().toArray(new entityclasses.Company[getCompany().size()]);
			for(int i = 0; i < lCompanys.length; i++) {
				lCompanys[i].setEdit_user(null);
			}
			entityclasses.Company[] lCompany1s = (entityclasses.Company[])getCompany1().toArray(new entityclasses.Company[getCompany1().size()]);
			for(int i = 0; i < lCompany1s.length; i++) {
				lCompany1s[i].setAdd_user(null);
			}
			entityclasses.Staff[] lStaff1s = (entityclasses.Staff[])getStaff1().toArray(new entityclasses.Staff[getStaff1().size()]);
			for(int i = 0; i < lStaff1s.length; i++) {
				lStaff1s[i].setAdd_user(null);
			}
			entityclasses.Staff[] lStaff2s = (entityclasses.Staff[])getStaff2().toArray(new entityclasses.Staff[getStaff2().size()]);
			for(int i = 0; i < lStaff2s.length; i++) {
				lStaff2s[i].setEdit_user(null);
			}
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setAdd_user(null);
			}
			entityclasses.Task_document[] lTask_document1s = (entityclasses.Task_document[])getTask_document1().toArray(new entityclasses.Task_document[getTask_document1().size()]);
			for(int i = 0; i < lTask_document1s.length; i++) {
				lTask_document1s[i].setEdit_user(null);
			}
			entityclasses.Agent[] lAgents = (entityclasses.Agent[])getAgent().toArray(new entityclasses.Agent[getAgent().size()]);
			for(int i = 0; i < lAgents.length; i++) {
				lAgents[i].setAdd_user(null);
			}
			entityclasses.Agent[] lAgent1s = (entityclasses.Agent[])getAgent1().toArray(new entityclasses.Agent[getAgent1().size()]);
			for(int i = 0; i < lAgent1s.length; i++) {
				lAgent1s[i].setEdit_user(null);
			}
			entityclasses.Task[] lTask1s = (entityclasses.Task[])getTask1().toArray(new entityclasses.Task[getTask1().size()]);
			for(int i = 0; i < lTask1s.length; i++) {
				lTask1s[i].setAdd_user(null);
			}
			entityclasses.Task[] lTask2s = (entityclasses.Task[])getTask2().toArray(new entityclasses.Task[getTask2().size()]);
			for(int i = 0; i < lTask2s.length; i++) {
				lTask2s[i].setEdit_user(null);
			}
			entityclasses.Task[] lTask3s = (entityclasses.Task[])getTask3().toArray(new entityclasses.Task[getTask3().size()]);
			for(int i = 0; i < lTask3s.length; i++) {
				lTask3s[i].setApproval_by(null);
			}
			entityclasses.Leave_transaction[] lLeave_transactions = (entityclasses.Leave_transaction[])getLeave_transaction().toArray(new entityclasses.Leave_transaction[getLeave_transaction().size()]);
			for(int i = 0; i < lLeave_transactions.length; i++) {
				lLeave_transactions[i].setEdit_user(null);
			}
			entityclasses.Leave_transaction[] lLeave_transaction1s = (entityclasses.Leave_transaction[])getLeave_transaction1().toArray(new entityclasses.Leave_transaction[getLeave_transaction1().size()]);
			for(int i = 0; i < lLeave_transaction1s.length; i++) {
				lLeave_transaction1s[i].setAdd_user(null);
			}
			entityclasses.Task[] lTask4s = (entityclasses.Task[])getTask4().toArray(new entityclasses.Task[getTask4().size()]);
			for(int i = 0; i < lTask4s.length; i++) {
				lTask4s[i].setCompleted_by(null);
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
	
	@Column(name="user_detail_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_USER_DETAIL_USER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_USER_DETAIL_USER_DETAIL_ID_GENERATOR", strategy="native")	
	private int user_detail_id;
	
	@ManyToOne(targetEntity=entityclasses.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_id", referencedColumnName="staff_id") })	
	private entityclasses.Staff staff;
	
	@Column(name="username", nullable=false, unique=true, length=20)	
	private String username;
	
	@Column(name="password", nullable=false, length=255)	
	private String password;
	
	@Column(name="is_general_admin", nullable=false, length=3)	
	private String is_general_admin;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_user", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail add_user;
	
	@Column(name="edit_date", nullable=true)	
	private java.sql.Timestamp edit_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="edit_user", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail edit_user;
	
	@OneToMany(mappedBy="user_detail", targetEntity=entityclasses.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set group_user = new java.util.HashSet();
	
	@OneToMany(mappedBy="assigned_user", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set group_right = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set group_right1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set user_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set user_detail1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Company.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set company = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Company.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set company1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Task_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task_document = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Task_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task_document1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Agent.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set agent = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Agent.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set agent1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="approval_by", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task3 = new java.util.HashSet();
	
	@OneToMany(mappedBy="edit_user", targetEntity=entityclasses.Leave_transaction.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set leave_transaction = new java.util.HashSet();
	
	@OneToMany(mappedBy="add_user", targetEntity=entityclasses.Leave_transaction.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set leave_transaction1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="completed_by", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task4 = new java.util.HashSet();
	
	private void setUser_detail_id(int value) {
		this.user_detail_id = value;
	}
	
	public int getUser_detail_id() {
		return user_detail_id;
	}
	
	public int getORMID() {
		return getUser_detail_id();
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setIs_general_admin(String value) {
		this.is_general_admin = value;
	}
	
	public String getIs_general_admin() {
		return is_general_admin;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
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
	
	public void setStaff(entityclasses.Staff value) {
		this.staff = value;
	}
	
	public entityclasses.Staff getStaff() {
		return staff;
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
	
	public void setGroup_user(java.util.Set value) {
		this.group_user = value;
	}
	
	public java.util.Set getGroup_user() {
		return group_user;
	}
	
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
	}
	
	
	public void setActivity(java.util.Set value) {
		this.activity = value;
	}
	
	public java.util.Set getActivity() {
		return activity;
	}
	
	
	public void setActivity1(java.util.Set value) {
		this.activity1 = value;
	}
	
	public java.util.Set getActivity1() {
		return activity1;
	}
	
	
	public void setGroup_right(java.util.Set value) {
		this.group_right = value;
	}
	
	public java.util.Set getGroup_right() {
		return group_right;
	}
	
	
	public void setGroup_right1(java.util.Set value) {
		this.group_right1 = value;
	}
	
	public java.util.Set getGroup_right1() {
		return group_right1;
	}
	
	
	public void setUser_detail(java.util.Set value) {
		this.user_detail = value;
	}
	
	public java.util.Set getUser_detail() {
		return user_detail;
	}
	
	
	public void setUser_detail1(java.util.Set value) {
		this.user_detail1 = value;
	}
	
	public java.util.Set getUser_detail1() {
		return user_detail1;
	}
	
	
	public void setCompany(java.util.Set value) {
		this.company = value;
	}
	
	public java.util.Set getCompany() {
		return company;
	}
	
	
	public void setCompany1(java.util.Set value) {
		this.company1 = value;
	}
	
	public java.util.Set getCompany1() {
		return company1;
	}
	
	
	public void setStaff1(java.util.Set value) {
		this.staff1 = value;
	}
	
	public java.util.Set getStaff1() {
		return staff1;
	}
	
	
	public void setStaff2(java.util.Set value) {
		this.staff2 = value;
	}
	
	public java.util.Set getStaff2() {
		return staff2;
	}
	
	
	public void setTask_document(java.util.Set value) {
		this.task_document = value;
	}
	
	public java.util.Set getTask_document() {
		return task_document;
	}
	
	
	public void setTask_document1(java.util.Set value) {
		this.task_document1 = value;
	}
	
	public java.util.Set getTask_document1() {
		return task_document1;
	}
	
	
	public void setAgent(java.util.Set value) {
		this.agent = value;
	}
	
	public java.util.Set getAgent() {
		return agent;
	}
	
	
	public void setAgent1(java.util.Set value) {
		this.agent1 = value;
	}
	
	public java.util.Set getAgent1() {
		return agent1;
	}
	
	
	public void setTask1(java.util.Set value) {
		this.task1 = value;
	}
	
	public java.util.Set getTask1() {
		return task1;
	}
	
	
	public void setTask2(java.util.Set value) {
		this.task2 = value;
	}
	
	public java.util.Set getTask2() {
		return task2;
	}
	
	
	public void setTask3(java.util.Set value) {
		this.task3 = value;
	}
	
	public java.util.Set getTask3() {
		return task3;
	}
	
	
	public void setLeave_transaction(java.util.Set value) {
		this.leave_transaction = value;
	}
	
	public java.util.Set getLeave_transaction() {
		return leave_transaction;
	}
	
	
	public void setLeave_transaction1(java.util.Set value) {
		this.leave_transaction1 = value;
	}
	
	public java.util.Set getLeave_transaction1() {
		return leave_transaction1;
	}
	
	
	public void setTask4(java.util.Set value) {
		this.task4 = value;
	}
	
	public java.util.Set getTask4() {
		return task4;
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
		return String.valueOf(getUser_detail_id());
	}
	
}
