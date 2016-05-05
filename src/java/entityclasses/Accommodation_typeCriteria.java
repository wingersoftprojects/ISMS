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

public class Accommodation_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression accommodation_type_id;
	public final StringExpression accommodation_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Accommodation_typeCriteria(Criteria criteria) {
		super(criteria);
		accommodation_type_id = new IntegerExpression("accommodation_type_id", this);
		accommodation_type_name = new StringExpression("accommodation_type_name", this);
		is_active = new StringExpression("is_active", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public Accommodation_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Accommodation_type.class));
	}
	
	public Accommodation_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Accommodation_type uniqueAccommodation_type() {
		return (Accommodation_type) super.uniqueResult();
	}
	
	public Accommodation_type[] listAccommodation_type() {
		java.util.List list = super.list();
		return (Accommodation_type[]) list.toArray(new Accommodation_type[list.size()]);
	}
}

