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

public class Activity_groupDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_group_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	
	public Activity_groupDetachedCriteria() {
		super(entityclasses.Activity_group.class, entityclasses.Activity_groupCriteria.class);
		activity_group_id = new IntegerExpression("activity_group_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
	}
	
	public Activity_groupDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Activity_groupCriteria.class);
		activity_group_id = new IntegerExpression("activity_group_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Group_detailDetachedCriteria createGroup_detailCriteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail"));
	}
	
	public Activity_group uniqueActivity_group(PersistentSession session) {
		return (Activity_group) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_group[] listActivity_group(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_group[]) list.toArray(new Activity_group[list.size()]);
	}
}

