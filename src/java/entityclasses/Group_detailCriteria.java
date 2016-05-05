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

public class Group_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression group_detail_id;
	public final StringExpression group_name;
	public final StringExpression is_active;
	public final CollectionExpression activity_group;
	public final CollectionExpression group_user;
	public final CollectionExpression group_right;
	
	public Group_detailCriteria(Criteria criteria) {
		super(criteria);
		group_detail_id = new IntegerExpression("group_detail_id", this);
		group_name = new StringExpression("group_name", this);
		is_active = new StringExpression("is_active", this);
		activity_group = new CollectionExpression("activity_group", this);
		group_user = new CollectionExpression("group_user", this);
		group_right = new CollectionExpression("group_right", this);
	}
	
	public Group_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Group_detail.class));
	}
	
	public Group_detailCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Activity_groupCriteria createActivity_groupCriteria() {
		return new Activity_groupCriteria(createCriteria("activity_group"));
	}
	
	public Group_userCriteria createGroup_userCriteria() {
		return new Group_userCriteria(createCriteria("group_user"));
	}
	
	public Group_rightCriteria createGroup_rightCriteria() {
		return new Group_rightCriteria(createCriteria("group_right"));
	}
	
	public Group_detail uniqueGroup_detail() {
		return (Group_detail) super.uniqueResult();
	}
	
	public Group_detail[] listGroup_detail() {
		java.util.List list = super.list();
		return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
	}
}

