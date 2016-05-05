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

public class Air_ticket_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression air_ticket_type_id;
	public final StringExpression air_ticket_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Air_ticket_typeDetachedCriteria() {
		super(entityclasses.Air_ticket_type.class, entityclasses.Air_ticket_typeCriteria.class);
		air_ticket_type_id = new IntegerExpression("air_ticket_type_id", this.getDetachedCriteria());
		air_ticket_type_name = new StringExpression("air_ticket_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public Air_ticket_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Air_ticket_typeCriteria.class);
		air_ticket_type_id = new IntegerExpression("air_ticket_type_id", this.getDetachedCriteria());
		air_ticket_type_name = new StringExpression("air_ticket_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Air_ticket_type uniqueAir_ticket_type(PersistentSession session) {
		return (Air_ticket_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Air_ticket_type[] listAir_ticket_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Air_ticket_type[]) list.toArray(new Air_ticket_type[list.size()]);
	}
}

