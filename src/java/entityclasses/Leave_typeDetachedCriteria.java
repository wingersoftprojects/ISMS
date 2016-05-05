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

public class Leave_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression leave_type_id;
	public final StringExpression leave_type_name;
	public final CollectionExpression leave_transaction;
	
	public Leave_typeDetachedCriteria() {
		super(entityclasses.Leave_type.class, entityclasses.Leave_typeCriteria.class);
		leave_type_id = new IntegerExpression("leave_type_id", this.getDetachedCriteria());
		leave_type_name = new StringExpression("leave_type_name", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
	}
	
	public Leave_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Leave_typeCriteria.class);
		leave_type_id = new IntegerExpression("leave_type_id", this.getDetachedCriteria());
		leave_type_name = new StringExpression("leave_type_name", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
	}
	
	public Leave_transactionDetachedCriteria createLeave_transactionCriteria() {
		return new Leave_transactionDetachedCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_type uniqueLeave_type(PersistentSession session) {
		return (Leave_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Leave_type[] listLeave_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Leave_type[]) list.toArray(new Leave_type[list.size()]);
	}
}

