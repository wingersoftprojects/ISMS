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

public class Activity_outcomeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_outcome_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression outcomeId;
	public final AssociationExpression outcome;
	public final StringExpression activity_outcome_name;
	public final CollectionExpression task;
	
	public Activity_outcomeDetachedCriteria() {
		super(entityclasses.Activity_outcome.class, entityclasses.Activity_outcomeCriteria.class);
		activity_outcome_id = new IntegerExpression("activity_outcome_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		activity_outcome_name = new StringExpression("activity_outcome_name", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public Activity_outcomeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Activity_outcomeCriteria.class);
		activity_outcome_id = new IntegerExpression("activity_outcome_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		activity_outcome_name = new StringExpression("activity_outcome_name", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public OutcomeDetachedCriteria createOutcomeCriteria() {
		return new OutcomeDetachedCriteria(createCriteria("outcome"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Activity_outcome uniqueActivity_outcome(PersistentSession session) {
		return (Activity_outcome) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_outcome[] listActivity_outcome(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
	}
}

