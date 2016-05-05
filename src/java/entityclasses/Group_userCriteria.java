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

public class Group_userCriteria extends AbstractORMCriteria {
	public final IntegerExpression group_user_id;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	public final IntegerExpression user_detailId;
	public final AssociationExpression user_detail;
	
	public Group_userCriteria(Criteria criteria) {
		super(criteria);
		group_user_id = new IntegerExpression("group_user_id", this);
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this);
		group_detail = new AssociationExpression("group_detail", this);
		user_detailId = new IntegerExpression("user_detail.user_detail_id", this);
		user_detail = new AssociationExpression("user_detail", this);
	}
	
	public Group_userCriteria(PersistentSession session) {
		this(session.createCriteria(Group_user.class));
	}
	
	public Group_userCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public Group_user uniqueGroup_user() {
		return (Group_user) super.uniqueResult();
	}
	
	public Group_user[] listGroup_user() {
		java.util.List list = super.list();
		return (Group_user[]) list.toArray(new Group_user[list.size()]);
	}
}

