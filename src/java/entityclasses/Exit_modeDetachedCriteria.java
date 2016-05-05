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

public class Exit_modeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression exit_mode_id;
	public final StringExpression exit_mode_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Exit_modeDetachedCriteria() {
		super(entityclasses.Exit_mode.class, entityclasses.Exit_modeCriteria.class);
		exit_mode_id = new IntegerExpression("exit_mode_id", this.getDetachedCriteria());
		exit_mode_name = new StringExpression("exit_mode_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public Exit_modeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Exit_modeCriteria.class);
		exit_mode_id = new IntegerExpression("exit_mode_id", this.getDetachedCriteria());
		exit_mode_name = new StringExpression("exit_mode_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Exit_mode uniqueExit_mode(PersistentSession session) {
		return (Exit_mode) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Exit_mode[] listExit_mode(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Exit_mode[]) list.toArray(new Exit_mode[list.size()]);
	}
}

