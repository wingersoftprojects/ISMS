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

public class TaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final StringExpression task_status;
	public final TimestampExpression complete_date;
	public final IntegerExpression completed_byId;
	public final AssociationExpression completed_by;
	public final IntegerExpression approval_byId;
	public final AssociationExpression approval_by;
	public final IntegerExpression approval_typeId;
	public final AssociationExpression approval_type;
	public final TimestampExpression approval_date;
	public final IntegerExpression staffId;
	public final AssociationExpression staff;
	public final IntegerExpression agentId;
	public final AssociationExpression agent;
	public final IntegerExpression assigned_userId;
	public final AssociationExpression assigned_user;
	public final StringExpression comment;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final TimestampExpression due_date;
	public final TimestampExpression flag_date;
	public final IntegerExpression activity_outcomeId;
	public final AssociationExpression activity_outcome;
	public final CollectionExpression task_document;
	public final CollectionExpression task_payment;
	
	public TaskDetachedCriteria() {
		super(entityclasses.Task.class, entityclasses.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		task_status = new StringExpression("task_status", this.getDetachedCriteria());
		complete_date = new TimestampExpression("complete_date", this.getDetachedCriteria());
		completed_byId = new IntegerExpression("completed_by.user_detail_id", this.getDetachedCriteria());
		completed_by = new AssociationExpression("completed_by", this.getDetachedCriteria());
		approval_byId = new IntegerExpression("approval_by.user_detail_id", this.getDetachedCriteria());
		approval_by = new AssociationExpression("approval_by", this.getDetachedCriteria());
		approval_typeId = new IntegerExpression("approval_type.approval_type_id", this.getDetachedCriteria());
		approval_type = new AssociationExpression("approval_type", this.getDetachedCriteria());
		approval_date = new TimestampExpression("approval_date", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		agentId = new IntegerExpression("agent.agent_id", this.getDetachedCriteria());
		agent = new AssociationExpression("agent", this.getDetachedCriteria());
		assigned_userId = new IntegerExpression("assigned_user.user_detail_id", this.getDetachedCriteria());
		assigned_user = new AssociationExpression("assigned_user", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		due_date = new TimestampExpression("due_date", this.getDetachedCriteria());
		flag_date = new TimestampExpression("flag_date", this.getDetachedCriteria());
		activity_outcomeId = new IntegerExpression("activity_outcome.activity_outcome_id", this.getDetachedCriteria());
		activity_outcome = new AssociationExpression("activity_outcome", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		task_payment = new CollectionExpression("task_payment", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		task_status = new StringExpression("task_status", this.getDetachedCriteria());
		complete_date = new TimestampExpression("complete_date", this.getDetachedCriteria());
		completed_byId = new IntegerExpression("completed_by.user_detail_id", this.getDetachedCriteria());
		completed_by = new AssociationExpression("completed_by", this.getDetachedCriteria());
		approval_byId = new IntegerExpression("approval_by.user_detail_id", this.getDetachedCriteria());
		approval_by = new AssociationExpression("approval_by", this.getDetachedCriteria());
		approval_typeId = new IntegerExpression("approval_type.approval_type_id", this.getDetachedCriteria());
		approval_type = new AssociationExpression("approval_type", this.getDetachedCriteria());
		approval_date = new TimestampExpression("approval_date", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		agentId = new IntegerExpression("agent.agent_id", this.getDetachedCriteria());
		agent = new AssociationExpression("agent", this.getDetachedCriteria());
		assigned_userId = new IntegerExpression("assigned_user.user_detail_id", this.getDetachedCriteria());
		assigned_user = new AssociationExpression("assigned_user", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		due_date = new TimestampExpression("due_date", this.getDetachedCriteria());
		flag_date = new TimestampExpression("flag_date", this.getDetachedCriteria());
		activity_outcomeId = new IntegerExpression("activity_outcome.activity_outcome_id", this.getDetachedCriteria());
		activity_outcome = new AssociationExpression("activity_outcome", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		task_payment = new CollectionExpression("task_payment", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public User_detailDetachedCriteria createCompleted_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("completed_by"));
	}
	
	public User_detailDetachedCriteria createApproval_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("approval_by"));
	}
	
	public Approval_typeDetachedCriteria createApproval_typeCriteria() {
		return new Approval_typeDetachedCriteria(createCriteria("approval_type"));
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public AgentDetachedCriteria createAgentCriteria() {
		return new AgentDetachedCriteria(createCriteria("agent"));
	}
	
	public User_detailDetachedCriteria createAssigned_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("assigned_user"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Activity_outcomeDetachedCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeDetachedCriteria(createCriteria("activity_outcome"));
	}
	
	public Task_documentDetachedCriteria createTask_documentCriteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document"));
	}
	
	public Task_paymentDetachedCriteria createTask_paymentCriteria() {
		return new Task_paymentDetachedCriteria(createCriteria("task_payment"));
	}
	
	public Task uniqueTask(PersistentSession session) {
		return (Task) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task[] listTask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

