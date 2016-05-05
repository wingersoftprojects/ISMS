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

public class Group_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression group_detail_id;
	public final StringExpression group_name;
	public final StringExpression is_active;
	public final CollectionExpression activity_group;
	public final CollectionExpression group_user;
	public final CollectionExpression group_right;
	
	public Group_detailDetachedCriteria() {
		super(entityclasses.Group_detail.class, entityclasses.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		activity_group = new CollectionExpression("activity_group", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
	}
	
	public Group_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		activity_group = new CollectionExpression("activity_group", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
	}
	
	public Activity_groupDetachedCriteria createActivity_groupCriteria() {
		return new Activity_groupDetachedCriteria(createCriteria("activity_group"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public Group_rightDetachedCriteria createGroup_rightCriteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right"));
	}
	
	public Group_detail uniqueGroup_detail(PersistentSession session) {
		return (Group_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Group_detail[] listGroup_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
	}
}

