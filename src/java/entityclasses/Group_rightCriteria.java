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

public class Group_rightCriteria extends AbstractORMCriteria {
	public final IntegerExpression group_right_id;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	public final StringExpression function_name;
	public final StringExpression allow_view;
	public final StringExpression allow_add;
	public final StringExpression allow_edit;
	public final StringExpression allow_delete;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	
	public Group_rightCriteria(Criteria criteria) {
		super(criteria);
		group_right_id = new IntegerExpression("group_right_id", this);
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this);
		group_detail = new AssociationExpression("group_detail", this);
		function_name = new StringExpression("function_name", this);
		allow_view = new StringExpression("allow_view", this);
		allow_add = new StringExpression("allow_add", this);
		allow_edit = new StringExpression("allow_edit", this);
		allow_delete = new StringExpression("allow_delete", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
	}
	
	public Group_rightCriteria(PersistentSession session) {
		this(session.createCriteria(Group_right.class));
	}
	
	public Group_rightCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Group_right uniqueGroup_right() {
		return (Group_right) super.uniqueResult();
	}
	
	public Group_right[] listGroup_right() {
		java.util.List list = super.list();
		return (Group_right[]) list.toArray(new Group_right[list.size()]);
	}
}

