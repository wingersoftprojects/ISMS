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

public class TaskCriteria extends AbstractORMCriteria {
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
	
	public TaskCriteria(Criteria criteria) {
		super(criteria);
		task_id = new IntegerExpression("task_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		task_status = new StringExpression("task_status", this);
		complete_date = new TimestampExpression("complete_date", this);
		completed_byId = new IntegerExpression("completed_by.user_detail_id", this);
		completed_by = new AssociationExpression("completed_by", this);
		approval_byId = new IntegerExpression("approval_by.user_detail_id", this);
		approval_by = new AssociationExpression("approval_by", this);
		approval_typeId = new IntegerExpression("approval_type.approval_type_id", this);
		approval_type = new AssociationExpression("approval_type", this);
		approval_date = new TimestampExpression("approval_date", this);
		staffId = new IntegerExpression("staff.staff_id", this);
		staff = new AssociationExpression("staff", this);
		agentId = new IntegerExpression("agent.agent_id", this);
		agent = new AssociationExpression("agent", this);
		assigned_userId = new IntegerExpression("assigned_user.user_detail_id", this);
		assigned_user = new AssociationExpression("assigned_user", this);
		comment = new StringExpression("comment", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		due_date = new TimestampExpression("due_date", this);
		flag_date = new TimestampExpression("flag_date", this);
		activity_outcomeId = new IntegerExpression("activity_outcome.activity_outcome_id", this);
		activity_outcome = new AssociationExpression("activity_outcome", this);
		task_document = new CollectionExpression("task_document", this);
		task_payment = new CollectionExpression("task_payment", this);
	}
	
	public TaskCriteria(PersistentSession session) {
		this(session.createCriteria(Task.class));
	}
	
	public TaskCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public User_detailCriteria createCompleted_byCriteria() {
		return new User_detailCriteria(createCriteria("completed_by"));
	}
	
	public User_detailCriteria createApproval_byCriteria() {
		return new User_detailCriteria(createCriteria("approval_by"));
	}
	
	public Approval_typeCriteria createApproval_typeCriteria() {
		return new Approval_typeCriteria(createCriteria("approval_type"));
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public AgentCriteria createAgentCriteria() {
		return new AgentCriteria(createCriteria("agent"));
	}
	
	public User_detailCriteria createAssigned_userCriteria() {
		return new User_detailCriteria(createCriteria("assigned_user"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Activity_outcomeCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeCriteria(createCriteria("activity_outcome"));
	}
	
	public Task_documentCriteria createTask_documentCriteria() {
		return new Task_documentCriteria(createCriteria("task_document"));
	}
	
	public Task_paymentCriteria createTask_paymentCriteria() {
		return new Task_paymentCriteria(createCriteria("task_payment"));
	}
	
	public Task uniqueTask() {
		return (Task) super.uniqueResult();
	}
	
	public Task[] listTask() {
		java.util.List list = super.list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

