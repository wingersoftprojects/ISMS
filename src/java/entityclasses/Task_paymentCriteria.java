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

public class Task_paymentCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_payment_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final FloatExpression paid_amount;
	public final StringExpression paid_for;
	
	public Task_paymentCriteria(Criteria criteria) {
		super(criteria);
		task_payment_id = new IntegerExpression("task_payment_id", this);
		taskId = new IntegerExpression("task.task_id", this);
		task = new AssociationExpression("task", this);
		paid_amount = new FloatExpression("paid_amount", this);
		paid_for = new StringExpression("paid_for", this);
	}
	
	public Task_paymentCriteria(PersistentSession session) {
		this(session.createCriteria(Task_payment.class));
	}
	
	public Task_paymentCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Task_payment uniqueTask_payment() {
		return (Task_payment) super.uniqueResult();
	}
	
	public Task_payment[] listTask_payment() {
		java.util.List list = super.list();
		return (Task_payment[]) list.toArray(new Task_payment[list.size()]);
	}
}

