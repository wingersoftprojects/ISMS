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

public class Activity_costDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_cost_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final StringExpression cost_name;
	public final FloatExpression cost_value;
	public final StringExpression is_active;
	
	public Activity_costDetachedCriteria() {
		super(entityclasses.Activity_cost.class, entityclasses.Activity_costCriteria.class);
		activity_cost_id = new IntegerExpression("activity_cost_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		cost_name = new StringExpression("cost_name", this.getDetachedCriteria());
		cost_value = new FloatExpression("cost_value", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public Activity_costDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Activity_costCriteria.class);
		activity_cost_id = new IntegerExpression("activity_cost_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		cost_name = new StringExpression("cost_name", this.getDetachedCriteria());
		cost_value = new FloatExpression("cost_value", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Activity_cost uniqueActivity_cost(PersistentSession session) {
		return (Activity_cost) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_cost[] listActivity_cost(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_cost[]) list.toArray(new Activity_cost[list.size()]);
	}
}

