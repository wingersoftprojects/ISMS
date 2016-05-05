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

public class Staff_postCriteria extends AbstractORMCriteria {
	public final IntegerExpression staff_post_id;
	public final StringExpression staff_post_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Staff_postCriteria(Criteria criteria) {
		super(criteria);
		staff_post_id = new IntegerExpression("staff_post_id", this);
		staff_post_name = new StringExpression("staff_post_name", this);
		is_active = new StringExpression("is_active", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public Staff_postCriteria(PersistentSession session) {
		this(session.createCriteria(Staff_post.class));
	}
	
	public Staff_postCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Staff_post uniqueStaff_post() {
		return (Staff_post) super.uniqueResult();
	}
	
	public Staff_post[] listStaff_post() {
		java.util.List list = super.list();
		return (Staff_post[]) list.toArray(new Staff_post[list.size()]);
	}
}

