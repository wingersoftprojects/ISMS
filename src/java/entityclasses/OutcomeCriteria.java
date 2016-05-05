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

public class OutcomeCriteria extends AbstractORMCriteria {
	public final IntegerExpression outcome_id;
	public final StringExpression outcome_name;
	public final CollectionExpression activity_outcome;
	
	public OutcomeCriteria(Criteria criteria) {
		super(criteria);
		outcome_id = new IntegerExpression("outcome_id", this);
		outcome_name = new StringExpression("outcome_name", this);
		activity_outcome = new CollectionExpression("activity_outcome", this);
	}
	
	public OutcomeCriteria(PersistentSession session) {
		this(session.createCriteria(Outcome.class));
	}
	
	public OutcomeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Activity_outcomeCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeCriteria(createCriteria("activity_outcome"));
	}
	
	public Outcome uniqueOutcome() {
		return (Outcome) super.uniqueResult();
	}
	
	public Outcome[] listOutcome() {
		java.util.List list = super.list();
		return (Outcome[]) list.toArray(new Outcome[list.size()]);
	}
}

