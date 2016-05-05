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

public class Task_paymentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_payment_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final FloatExpression paid_amount;
	public final StringExpression paid_for;
	
	public Task_paymentDetachedCriteria() {
		super(entityclasses.Task_payment.class, entityclasses.Task_paymentCriteria.class);
		task_payment_id = new IntegerExpression("task_payment_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		paid_amount = new FloatExpression("paid_amount", this.getDetachedCriteria());
		paid_for = new StringExpression("paid_for", this.getDetachedCriteria());
	}
	
	public Task_paymentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Task_paymentCriteria.class);
		task_payment_id = new IntegerExpression("task_payment_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		paid_amount = new FloatExpression("paid_amount", this.getDetachedCriteria());
		paid_for = new StringExpression("paid_for", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Task_payment uniqueTask_payment(PersistentSession session) {
		return (Task_payment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_payment[] listTask_payment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_payment[]) list.toArray(new Task_payment[list.size()]);
	}
}

