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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class User_detailDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public User_detailDetachedCriteria() {
		super(entityclasses.User_detail.class, entityclasses.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		is_general_admin = new StringExpression("is_general_admin", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		activity = new CollectionExpression("activity", this.getDetachedCriteria());
		activity1 = new CollectionExpression("activity1", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_right1 = new CollectionExpression("group_right1", this.getDetachedCriteria());
		user_detail = new CollectionExpression("user_detail", this.getDetachedCriteria());
		user_detail1 = new CollectionExpression("user_detail1", this.getDetachedCriteria());
		company = new CollectionExpression("company", this.getDetachedCriteria());
		company1 = new CollectionExpression("company1", this.getDetachedCriteria());
		staff1 = new CollectionExpression("staff1", this.getDetachedCriteria());
		staff2 = new CollectionExpression("staff2", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		task_document1 = new CollectionExpression("task_document1", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
		agent1 = new CollectionExpression("agent1", this.getDetachedCriteria());
		task1 = new CollectionExpression("task1", this.getDetachedCriteria());
		task2 = new CollectionExpression("task2", this.getDetachedCriteria());
		task3 = new CollectionExpression("task3", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
		leave_transaction1 = new CollectionExpression("leave_transaction1", this.getDetachedCriteria());
		task4 = new CollectionExpression("task4", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		is_general_admin = new StringExpression("is_general_admin", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		activity = new CollectionExpression("activity", this.getDetachedCriteria());
		activity1 = new CollectionExpression("activity1", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_right1 = new CollectionExpression("group_right1", this.getDetachedCriteria());
		user_detail = new CollectionExpression("user_detail", this.getDetachedCriteria());
		user_detail1 = new CollectionExpression("user_detail1", this.getDetachedCriteria());
		company = new CollectionExpression("company", this.getDetachedCriteria());
		company1 = new CollectionExpression("company1", this.getDetachedCriteria());
		staff1 = new CollectionExpression("staff1", this.getDetachedCriteria());
		staff2 = new CollectionExpression("staff2", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		task_document1 = new CollectionExpression("task_document1", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
		agent1 = new CollectionExpression("agent1", this.getDetachedCriteria());
		task1 = new CollectionExpression("task1", this.getDetachedCriteria());
		task2 = new CollectionExpression("task2", this.getDetachedCriteria());
		task3 = new CollectionExpression("task3", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
		leave_transaction1 = new CollectionExpression("leave_transaction1", this.getDetachedCriteria());
		task4 = new CollectionExpression("task4", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public ActivityDetachedCriteria createActivity1Criteria() {
		return new ActivityDetachedCriteria(createCriteria("activity1"));
	}
	
	public Group_rightDetachedCriteria createGroup_rightCriteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right"));
	}
	
	public Group_rightDetachedCriteria createGroup_right1Criteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right1"));
	}
	
	public User_detailDetachedCriteria createUser_detailCriteria() {
		return new User_detailDetachedCriteria(createCriteria("user_detail"));
	}
	
	public User_detailDetachedCriteria createUser_detail1Criteria() {
		return new User_detailDetachedCriteria(createCriteria("user_detail1"));
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public CompanyDetachedCriteria createCompany1Criteria() {
		return new CompanyDetachedCriteria(createCriteria("company1"));
	}
	
	public StaffDetachedCriteria createStaff1Criteria() {
		return new StaffDetachedCriteria(createCriteria("staff1"));
	}
	
	public StaffDetachedCriteria createStaff2Criteria() {
		return new StaffDetachedCriteria(createCriteria("staff2"));
	}
	
	public Task_documentDetachedCriteria createTask_documentCriteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document"));
	}
	
	public Task_documentDetachedCriteria createTask_document1Criteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document1"));
	}
	
	public AgentDetachedCriteria createAgentCriteria() {
		return new AgentDetachedCriteria(createCriteria("agent"));
	}
	
	public AgentDetachedCriteria createAgent1Criteria() {
		return new AgentDetachedCriteria(createCriteria("agent1"));
	}
	
	public TaskDetachedCriteria createTask1Criteria() {
		return new TaskDetachedCriteria(createCriteria("task1"));
	}
	
	public TaskDetachedCriteria createTask2Criteria() {
		return new TaskDetachedCriteria(createCriteria("task2"));
	}
	
	public TaskDetachedCriteria createTask3Criteria() {
		return new TaskDetachedCriteria(createCriteria("task3"));
	}
	
	public Leave_transactionDetachedCriteria createLeave_transactionCriteria() {
		return new Leave_transactionDetachedCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_transactionDetachedCriteria createLeave_transaction1Criteria() {
		return new Leave_transactionDetachedCriteria(createCriteria("leave_transaction1"));
	}
	
	public TaskDetachedCriteria createTask4Criteria() {
		return new TaskDetachedCriteria(createCriteria("task4"));
	}
	
	public User_detail uniqueUser_detail(PersistentSession session) {
		return (User_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User_detail[] listUser_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

