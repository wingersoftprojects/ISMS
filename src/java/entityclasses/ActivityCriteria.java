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

public class ActivityCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_id;
	public final StringExpression activity_name;
	public final StringExpression is_start;
	public final StringExpression is_final;
	public final IntegerExpression from_activityId;
	public final AssociationExpression from_activity;
	public final IntegerExpression to_activity_if_success;
	public final IntegerExpression to_activity_if_failure;
	public final IntegerExpression duration;
	public final IntegerExpression flag_after;
	public final StringExpression is_approval_required;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final StringExpression is_agent_required;
	public final StringExpression is_create_staff_activity;
	public final CollectionExpression activity_document;
	public final CollectionExpression activity_cost;
	public final CollectionExpression activity_outcome;
	public final CollectionExpression activity_group;
	public final CollectionExpression task;
	public final CollectionExpression fromactivity;
	public final CollectionExpression activity_document_checklist;
	public final CollectionExpression document_type;
	
	public ActivityCriteria(Criteria criteria) {
		super(criteria);
		activity_id = new IntegerExpression("activity_id", this);
		activity_name = new StringExpression("activity_name", this);
		is_start = new StringExpression("is_start", this);
		is_final = new StringExpression("is_final", this);
		from_activityId = new IntegerExpression("from_activity.activity_id", this);
		from_activity = new AssociationExpression("from_activity", this);
		to_activity_if_success = new IntegerExpression("to_activity_if_success", this);
		to_activity_if_failure = new IntegerExpression("to_activity_if_failure", this);
		duration = new IntegerExpression("duration", this);
		flag_after = new IntegerExpression("flag_after", this);
		is_approval_required = new StringExpression("is_approval_required", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		is_agent_required = new StringExpression("is_agent_required", this);
		is_create_staff_activity = new StringExpression("is_create_staff_activity", this);
		activity_document = new CollectionExpression("activity_document", this);
		activity_cost = new CollectionExpression("activity_cost", this);
		activity_outcome = new CollectionExpression("activity_outcome", this);
		activity_group = new CollectionExpression("activity_group", this);
		task = new CollectionExpression("task", this);
		fromactivity = new CollectionExpression("fromactivity", this);
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this);
		document_type = new CollectionExpression("document_type", this);
	}
	
	public ActivityCriteria(PersistentSession session) {
		this(session.createCriteria(Activity.class));
	}
	
	public ActivityCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createFrom_activityCriteria() {
		return new ActivityCriteria(createCriteria("from_activity"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Activity_documentCriteria createActivity_documentCriteria() {
		return new Activity_documentCriteria(createCriteria("activity_document"));
	}
	
	public Activity_costCriteria createActivity_costCriteria() {
		return new Activity_costCriteria(createCriteria("activity_cost"));
	}
	
	public Activity_outcomeCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeCriteria(createCriteria("activity_outcome"));
	}
	
	public Activity_groupCriteria createActivity_groupCriteria() {
		return new Activity_groupCriteria(createCriteria("activity_group"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public ActivityCriteria createFromactivityCriteria() {
		return new ActivityCriteria(createCriteria("fromactivity"));
	}
	
	public Activity_document_checklistCriteria createActivity_document_checklistCriteria() {
		return new Activity_document_checklistCriteria(createCriteria("activity_document_checklist"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Activity uniqueActivity() {
		return (Activity) super.uniqueResult();
	}
	
	public Activity[] listActivity() {
		java.util.List list = super.list();
		return (Activity[]) list.toArray(new Activity[list.size()]);
	}
}

