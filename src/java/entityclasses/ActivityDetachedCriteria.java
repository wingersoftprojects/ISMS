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

public class ActivityDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ActivityDetachedCriteria() {
		super(entityclasses.Activity.class, entityclasses.ActivityCriteria.class);
		activity_id = new IntegerExpression("activity_id", this.getDetachedCriteria());
		activity_name = new StringExpression("activity_name", this.getDetachedCriteria());
		is_start = new StringExpression("is_start", this.getDetachedCriteria());
		is_final = new StringExpression("is_final", this.getDetachedCriteria());
		from_activityId = new IntegerExpression("from_activity.activity_id", this.getDetachedCriteria());
		from_activity = new AssociationExpression("from_activity", this.getDetachedCriteria());
		to_activity_if_success = new IntegerExpression("to_activity_if_success", this.getDetachedCriteria());
		to_activity_if_failure = new IntegerExpression("to_activity_if_failure", this.getDetachedCriteria());
		duration = new IntegerExpression("duration", this.getDetachedCriteria());
		flag_after = new IntegerExpression("flag_after", this.getDetachedCriteria());
		is_approval_required = new StringExpression("is_approval_required", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		is_agent_required = new StringExpression("is_agent_required", this.getDetachedCriteria());
		is_create_staff_activity = new StringExpression("is_create_staff_activity", this.getDetachedCriteria());
		activity_document = new CollectionExpression("activity_document", this.getDetachedCriteria());
		activity_cost = new CollectionExpression("activity_cost", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		activity_group = new CollectionExpression("activity_group", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		fromactivity = new CollectionExpression("fromactivity", this.getDetachedCriteria());
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this.getDetachedCriteria());
		document_type = new CollectionExpression("document_type", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.ActivityCriteria.class);
		activity_id = new IntegerExpression("activity_id", this.getDetachedCriteria());
		activity_name = new StringExpression("activity_name", this.getDetachedCriteria());
		is_start = new StringExpression("is_start", this.getDetachedCriteria());
		is_final = new StringExpression("is_final", this.getDetachedCriteria());
		from_activityId = new IntegerExpression("from_activity.activity_id", this.getDetachedCriteria());
		from_activity = new AssociationExpression("from_activity", this.getDetachedCriteria());
		to_activity_if_success = new IntegerExpression("to_activity_if_success", this.getDetachedCriteria());
		to_activity_if_failure = new IntegerExpression("to_activity_if_failure", this.getDetachedCriteria());
		duration = new IntegerExpression("duration", this.getDetachedCriteria());
		flag_after = new IntegerExpression("flag_after", this.getDetachedCriteria());
		is_approval_required = new StringExpression("is_approval_required", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		is_agent_required = new StringExpression("is_agent_required", this.getDetachedCriteria());
		is_create_staff_activity = new StringExpression("is_create_staff_activity", this.getDetachedCriteria());
		activity_document = new CollectionExpression("activity_document", this.getDetachedCriteria());
		activity_cost = new CollectionExpression("activity_cost", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		activity_group = new CollectionExpression("activity_group", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		fromactivity = new CollectionExpression("fromactivity", this.getDetachedCriteria());
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this.getDetachedCriteria());
		document_type = new CollectionExpression("document_type", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createFrom_activityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("from_activity"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Activity_documentDetachedCriteria createActivity_documentCriteria() {
		return new Activity_documentDetachedCriteria(createCriteria("activity_document"));
	}
	
	public Activity_costDetachedCriteria createActivity_costCriteria() {
		return new Activity_costDetachedCriteria(createCriteria("activity_cost"));
	}
	
	public Activity_outcomeDetachedCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeDetachedCriteria(createCriteria("activity_outcome"));
	}
	
	public Activity_groupDetachedCriteria createActivity_groupCriteria() {
		return new Activity_groupDetachedCriteria(createCriteria("activity_group"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public ActivityDetachedCriteria createFromactivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("fromactivity"));
	}
	
	public Activity_document_checklistDetachedCriteria createActivity_document_checklistCriteria() {
		return new Activity_document_checklistDetachedCriteria(createCriteria("activity_document_checklist"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Activity uniqueActivity(PersistentSession session) {
		return (Activity) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity[] listActivity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity[]) list.toArray(new Activity[list.size()]);
	}
}

