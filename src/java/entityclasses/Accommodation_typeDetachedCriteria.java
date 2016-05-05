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

public class Accommodation_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression accommodation_type_id;
	public final StringExpression accommodation_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Accommodation_typeDetachedCriteria() {
		super(entityclasses.Accommodation_type.class, entityclasses.Accommodation_typeCriteria.class);
		accommodation_type_id = new IntegerExpression("accommodation_type_id", this.getDetachedCriteria());
		accommodation_type_name = new StringExpression("accommodation_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public Accommodation_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Accommodation_typeCriteria.class);
		accommodation_type_id = new IntegerExpression("accommodation_type_id", this.getDetachedCriteria());
		accommodation_type_name = new StringExpression("accommodation_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Accommodation_type uniqueAccommodation_type(PersistentSession session) {
		return (Accommodation_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Accommodation_type[] listAccommodation_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Accommodation_type[]) list.toArray(new Accommodation_type[list.size()]);
	}
}

