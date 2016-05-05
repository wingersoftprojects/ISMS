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

public class Activity_groupCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_group_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	
	public Activity_groupCriteria(Criteria criteria) {
		super(criteria);
		activity_group_id = new IntegerExpression("activity_group_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this);
		group_detail = new AssociationExpression("group_detail", this);
	}
	
	public Activity_groupCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_group.class));
	}
	
	public Activity_groupCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public Activity_group uniqueActivity_group() {
		return (Activity_group) super.uniqueResult();
	}
	
	public Activity_group[] listActivity_group() {
		java.util.List list = super.list();
		return (Activity_group[]) list.toArray(new Activity_group[list.size()]);
	}
}

