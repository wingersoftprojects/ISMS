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

public class Staff_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression staff_type_id;
	public final StringExpression staff_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Staff_typeCriteria(Criteria criteria) {
		super(criteria);
		staff_type_id = new IntegerExpression("staff_type_id", this);
		staff_type_name = new StringExpression("staff_type_name", this);
		is_active = new StringExpression("is_active", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public Staff_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Staff_type.class));
	}
	
	public Staff_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Staff_type uniqueStaff_type() {
		return (Staff_type) super.uniqueResult();
	}
	
	public Staff_type[] listStaff_type() {
		java.util.List list = super.list();
		return (Staff_type[]) list.toArray(new Staff_type[list.size()]);
	}
}

