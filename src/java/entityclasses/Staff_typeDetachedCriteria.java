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

public class Staff_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression staff_type_id;
	public final StringExpression staff_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Staff_typeDetachedCriteria() {
		super(entityclasses.Staff_type.class, entityclasses.Staff_typeCriteria.class);
		staff_type_id = new IntegerExpression("staff_type_id", this.getDetachedCriteria());
		staff_type_name = new StringExpression("staff_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public Staff_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Staff_typeCriteria.class);
		staff_type_id = new IntegerExpression("staff_type_id", this.getDetachedCriteria());
		staff_type_name = new StringExpression("staff_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Staff_type uniqueStaff_type(PersistentSession session) {
		return (Staff_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff_type[] listStaff_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff_type[]) list.toArray(new Staff_type[list.size()]);
	}
}

