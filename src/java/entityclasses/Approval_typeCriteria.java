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

public class Approval_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression approval_type_id;
	public final StringExpression approval_type_name;
	public final CollectionExpression task;
	
	public Approval_typeCriteria(Criteria criteria) {
		super(criteria);
		approval_type_id = new IntegerExpression("approval_type_id", this);
		approval_type_name = new StringExpression("approval_type_name", this);
		task = new CollectionExpression("task", this);
	}
	
	public Approval_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Approval_type.class));
	}
	
	public Approval_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Approval_type uniqueApproval_type() {
		return (Approval_type) super.uniqueResult();
	}
	
	public Approval_type[] listApproval_type() {
		java.util.List list = super.list();
		return (Approval_type[]) list.toArray(new Approval_type[list.size()]);
	}
}

