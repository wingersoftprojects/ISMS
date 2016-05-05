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

public class Leave_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression leave_type_id;
	public final StringExpression leave_type_name;
	public final CollectionExpression leave_transaction;
	
	public Leave_typeCriteria(Criteria criteria) {
		super(criteria);
		leave_type_id = new IntegerExpression("leave_type_id", this);
		leave_type_name = new StringExpression("leave_type_name", this);
		leave_transaction = new CollectionExpression("leave_transaction", this);
	}
	
	public Leave_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Leave_type.class));
	}
	
	public Leave_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Leave_transactionCriteria createLeave_transactionCriteria() {
		return new Leave_transactionCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_type uniqueLeave_type() {
		return (Leave_type) super.uniqueResult();
	}
	
	public Leave_type[] listLeave_type() {
		java.util.List list = super.list();
		return (Leave_type[]) list.toArray(new Leave_type[list.size()]);
	}
}

