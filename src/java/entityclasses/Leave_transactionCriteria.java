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

public class Leave_transactionCriteria extends AbstractORMCriteria {
	public final IntegerExpression leave_transaction_id;
	public final IntegerExpression staffId;
	public final AssociationExpression staff;
	public final IntegerExpression days_taken;
	public final DateExpression start_date;
	public final DateExpression end_date;
	public final IntegerExpression leave_year;
	public final StringExpression leave_quarter;
	public final StringExpression ticket_issue_by;
	public final StringExpression paid_leave;
	public final IntegerExpression approved_byId;
	public final AssociationExpression approved_by;
	public final StringExpression comment;
	public final IntegerExpression leave_typeId;
	public final AssociationExpression leave_type;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	
	public Leave_transactionCriteria(Criteria criteria) {
		super(criteria);
		leave_transaction_id = new IntegerExpression("leave_transaction_id", this);
		staffId = new IntegerExpression("staff.staff_id", this);
		staff = new AssociationExpression("staff", this);
		days_taken = new IntegerExpression("days_taken", this);
		start_date = new DateExpression("start_date", this);
		end_date = new DateExpression("end_date", this);
		leave_year = new IntegerExpression("leave_year", this);
		leave_quarter = new StringExpression("leave_quarter", this);
		ticket_issue_by = new StringExpression("ticket_issue_by", this);
		paid_leave = new StringExpression("paid_leave", this);
		approved_byId = new IntegerExpression("approved_by.staff_id", this);
		approved_by = new AssociationExpression("approved_by", this);
		comment = new StringExpression("comment", this);
		leave_typeId = new IntegerExpression("leave_type.leave_type_id", this);
		leave_type = new AssociationExpression("leave_type", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
	}
	
	public Leave_transactionCriteria(PersistentSession session) {
		this(session.createCriteria(Leave_transaction.class));
	}
	
	public Leave_transactionCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public StaffCriteria createApproved_byCriteria() {
		return new StaffCriteria(createCriteria("approved_by"));
	}
	
	public Leave_typeCriteria createLeave_typeCriteria() {
		return new Leave_typeCriteria(createCriteria("leave_type"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Leave_transaction uniqueLeave_transaction() {
		return (Leave_transaction) super.uniqueResult();
	}
	
	public Leave_transaction[] listLeave_transaction() {
		java.util.List list = super.list();
		return (Leave_transaction[]) list.toArray(new Leave_transaction[list.size()]);
	}
}

