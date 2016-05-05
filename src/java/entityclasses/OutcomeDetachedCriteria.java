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

public class OutcomeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression outcome_id;
	public final StringExpression outcome_name;
	public final CollectionExpression activity_outcome;
	
	public OutcomeDetachedCriteria() {
		super(entityclasses.Outcome.class, entityclasses.OutcomeCriteria.class);
		outcome_id = new IntegerExpression("outcome_id", this.getDetachedCriteria());
		outcome_name = new StringExpression("outcome_name", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
	}
	
	public OutcomeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.OutcomeCriteria.class);
		outcome_id = new IntegerExpression("outcome_id", this.getDetachedCriteria());
		outcome_name = new StringExpression("outcome_name", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
	}
	
	public Activity_outcomeDetachedCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeDetachedCriteria(createCriteria("activity_outcome"));
	}
	
	public Outcome uniqueOutcome(PersistentSession session) {
		return (Outcome) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Outcome[] listOutcome(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Outcome[]) list.toArray(new Outcome[list.size()]);
	}
}

