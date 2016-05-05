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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class User_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression user_detail_id;
	public final IntegerExpression staffId;
	public final AssociationExpression staff;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression is_general_admin;
	public final StringExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final CollectionExpression group_user;
	public final CollectionExpression task;
	public final CollectionExpression activity;
	public final CollectionExpression activity1;
	public final CollectionExpression group_right;
	public final CollectionExpression group_right1;
	public final CollectionExpression user_detail;
	public final CollectionExpression user_detail1;
	public final CollectionExpression company;
	public final CollectionExpression company1;
	public final CollectionExpression staff1;
	public final CollectionExpression staff2;
	public final CollectionExpression task_document;
	public final CollectionExpression task_document1;
	public final CollectionExpression agent;
	public final CollectionExpression agent1;
	public final CollectionExpression task1;
	public final CollectionExpression task2;
	public final CollectionExpression task3;
	public final CollectionExpression leave_transaction;
	public final CollectionExpression leave_transaction1;
	public final CollectionExpression task4;
	
	public User_detailCriteria(Criteria criteria) {
		super(criteria);
		user_detail_id = new IntegerExpression("user_detail_id", this);
		staffId = new IntegerExpression("staff.staff_id", this);
		staff = new AssociationExpression("staff", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		is_general_admin = new StringExpression("is_general_admin", this);
		is_active = new StringExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		group_user = new CollectionExpression("group_user", this);
		task = new CollectionExpression("task", this);
		activity = new CollectionExpression("activity", this);
		activity1 = new CollectionExpression("activity1", this);
		group_right = new CollectionExpression("group_right", this);
		group_right1 = new CollectionExpression("group_right1", this);
		user_detail = new CollectionExpression("user_detail", this);
		user_detail1 = new CollectionExpression("user_detail1", this);
		company = new CollectionExpression("company", this);
		company1 = new CollectionExpression("company1", this);
		staff1 = new CollectionExpression("staff1", this);
		staff2 = new CollectionExpression("staff2", this);
		task_document = new CollectionExpression("task_document", this);
		task_document1 = new CollectionExpression("task_document1", this);
		agent = new CollectionExpression("agent", this);
		agent1 = new CollectionExpression("agent1", this);
		task1 = new CollectionExpression("task1", this);
		task2 = new CollectionExpression("task2", this);
		task3 = new CollectionExpression("task3", this);
		leave_transaction = new CollectionExpression("leave_transaction", this);
		leave_transaction1 = new CollectionExpression("leave_transaction1", this);
		task4 = new CollectionExpression("task4", this);
	}
	
	public User_detailCriteria(PersistentSession session) {
		this(session.createCriteria(User_detail.class));
	}
	
	public User_detailCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Group_userCriteria createGroup_userCriteria() {
		return new Group_userCriteria(createCriteria("group_user"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public ActivityCriteria createActivity1Criteria() {
		return new ActivityCriteria(createCriteria("activity1"));
	}
	
	public Group_rightCriteria createGroup_rightCriteria() {
		return new Group_rightCriteria(createCriteria("group_right"));
	}
	
	public Group_rightCriteria createGroup_right1Criteria() {
		return new Group_rightCriteria(createCriteria("group_right1"));
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public User_detailCriteria createUser_detail1Criteria() {
		return new User_detailCriteria(createCriteria("user_detail1"));
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public CompanyCriteria createCompany1Criteria() {
		return new CompanyCriteria(createCriteria("company1"));
	}
	
	public StaffCriteria createStaff1Criteria() {
		return new StaffCriteria(createCriteria("staff1"));
	}
	
	public StaffCriteria createStaff2Criteria() {
		return new StaffCriteria(createCriteria("staff2"));
	}
	
	public Task_documentCriteria createTask_documentCriteria() {
		return new Task_documentCriteria(createCriteria("task_document"));
	}
	
	public Task_documentCriteria createTask_document1Criteria() {
		return new Task_documentCriteria(createCriteria("task_document1"));
	}
	
	public AgentCriteria createAgentCriteria() {
		return new AgentCriteria(createCriteria("agent"));
	}
	
	public AgentCriteria createAgent1Criteria() {
		return new AgentCriteria(createCriteria("agent1"));
	}
	
	public TaskCriteria createTask1Criteria() {
		return new TaskCriteria(createCriteria("task1"));
	}
	
	public TaskCriteria createTask2Criteria() {
		return new TaskCriteria(createCriteria("task2"));
	}
	
	public TaskCriteria createTask3Criteria() {
		return new TaskCriteria(createCriteria("task3"));
	}
	
	public Leave_transactionCriteria createLeave_transactionCriteria() {
		return new Leave_transactionCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_transactionCriteria createLeave_transaction1Criteria() {
		return new Leave_transactionCriteria(createCriteria("leave_transaction1"));
	}
	
	public TaskCriteria createTask4Criteria() {
		return new TaskCriteria(createCriteria("task4"));
	}
	
	public User_detail uniqueUser_detail() {
		return (User_detail) super.uniqueResult();
	}
	
	public User_detail[] listUser_detail() {
		java.util.List list = super.list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

