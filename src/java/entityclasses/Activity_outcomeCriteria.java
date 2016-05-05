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

public class Activity_outcomeCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_outcome_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression outcomeId;
	public final AssociationExpression outcome;
	public final StringExpression activity_outcome_name;
	public final CollectionExpression task;
	
	public Activity_outcomeCriteria(Criteria criteria) {
		super(criteria);
		activity_outcome_id = new IntegerExpression("activity_outcome_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		outcomeId = new IntegerExpression("outcome.outcome_id", this);
		outcome = new AssociationExpression("outcome", this);
		activity_outcome_name = new StringExpression("activity_outcome_name", this);
		task = new CollectionExpression("task", this);
	}
	
	public Activity_outcomeCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_outcome.class));
	}
	
	public Activity_outcomeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public OutcomeCriteria createOutcomeCriteria() {
		return new OutcomeCriteria(createCriteria("outcome"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Activity_outcome uniqueActivity_outcome() {
		return (Activity_outcome) super.uniqueResult();
	}
	
	public Activity_outcome[] listActivity_outcome() {
		java.util.List list = super.list();
		return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
	}
}

