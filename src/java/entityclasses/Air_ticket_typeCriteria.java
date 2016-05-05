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

public class Air_ticket_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression air_ticket_type_id;
	public final StringExpression air_ticket_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Air_ticket_typeCriteria(Criteria criteria) {
		super(criteria);
		air_ticket_type_id = new IntegerExpression("air_ticket_type_id", this);
		air_ticket_type_name = new StringExpression("air_ticket_type_name", this);
		is_active = new StringExpression("is_active", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public Air_ticket_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Air_ticket_type.class));
	}
	
	public Air_ticket_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Air_ticket_type uniqueAir_ticket_type() {
		return (Air_ticket_type) super.uniqueResult();
	}
	
	public Air_ticket_type[] listAir_ticket_type() {
		java.util.List list = super.list();
		return (Air_ticket_type[]) list.toArray(new Air_ticket_type[list.size()]);
	}
}

