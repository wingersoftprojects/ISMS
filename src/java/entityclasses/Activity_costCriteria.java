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

public class Activity_costCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_cost_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final StringExpression cost_name;
	public final FloatExpression cost_value;
	public final StringExpression is_active;
	
	public Activity_costCriteria(Criteria criteria) {
		super(criteria);
		activity_cost_id = new IntegerExpression("activity_cost_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		cost_name = new StringExpression("cost_name", this);
		cost_value = new FloatExpression("cost_value", this);
		is_active = new StringExpression("is_active", this);
	}
	
	public Activity_costCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_cost.class));
	}
	
	public Activity_costCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Activity_cost uniqueActivity_cost() {
		return (Activity_cost) super.uniqueResult();
	}
	
	public Activity_cost[] listActivity_cost() {
		java.util.List list = super.list();
		return (Activity_cost[]) list.toArray(new Activity_cost[list.size()]);
	}
}

