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

public class Staff_postDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression staff_post_id;
	public final StringExpression staff_post_name;
	public final StringExpression is_active;
	public final CollectionExpression staff;
	
	public Staff_postDetachedCriteria() {
		super(entityclasses.Staff_post.class, entityclasses.Staff_postCriteria.class);
		staff_post_id = new IntegerExpression("staff_post_id", this.getDetachedCriteria());
		staff_post_name = new StringExpression("staff_post_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public Staff_postDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Staff_postCriteria.class);
		staff_post_id = new IntegerExpression("staff_post_id", this.getDetachedCriteria());
		staff_post_name = new StringExpression("staff_post_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Staff_post uniqueStaff_post(PersistentSession session) {
		return (Staff_post) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff_post[] listStaff_post(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff_post[]) list.toArray(new Staff_post[list.size()]);
	}
}

