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

public class Approval_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression approval_type_id;
	public final StringExpression approval_type_name;
	public final CollectionExpression task;
	
	public Approval_typeDetachedCriteria() {
		super(entityclasses.Approval_type.class, entityclasses.Approval_typeCriteria.class);
		approval_type_id = new IntegerExpression("approval_type_id", this.getDetachedCriteria());
		approval_type_name = new StringExpression("approval_type_name", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public Approval_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Approval_typeCriteria.class);
		approval_type_id = new IntegerExpression("approval_type_id", this.getDetachedCriteria());
		approval_type_name = new StringExpression("approval_type_name", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Approval_type uniqueApproval_type(PersistentSession session) {
		return (Approval_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Approval_type[] listApproval_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Approval_type[]) list.toArray(new Approval_type[list.size()]);
	}
}

