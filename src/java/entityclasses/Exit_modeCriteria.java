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

public class Exit_modeCriteria extends AbstractORMCriteria {
	public final IntegerExpression exit_mode_id;
	public final StringExpression exit_mode_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Exit_modeCriteria(Criteria criteria) {
		super(criteria);
		exit_mode_id = new IntegerExpression("exit_mode_id", this);
		exit_mode_name = new StringExpression("exit_mode_name", this);
		is_active = new StringExpression("is_active", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public Exit_modeCriteria(PersistentSession session) {
		this(session.createCriteria(Exit_mode.class));
	}
	
	public Exit_modeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Exit_mode uniqueExit_mode() {
		return (Exit_mode) super.uniqueResult();
	}
	
	public Exit_mode[] listExit_mode() {
		java.util.List list = super.list();
		return (Exit_mode[]) list.toArray(new Exit_mode[list.size()]);
	}
}

