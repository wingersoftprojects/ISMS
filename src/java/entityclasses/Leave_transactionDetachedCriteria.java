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

public class Leave_transactionDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Leave_transactionDetachedCriteria() {
		super(entityclasses.Leave_transaction.class, entityclasses.Leave_transactionCriteria.class);
		leave_transaction_id = new IntegerExpression("leave_transaction_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		days_taken = new IntegerExpression("days_taken", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		leave_year = new IntegerExpression("leave_year", this.getDetachedCriteria());
		leave_quarter = new StringExpression("leave_quarter", this.getDetachedCriteria());
		ticket_issue_by = new StringExpression("ticket_issue_by", this.getDetachedCriteria());
		paid_leave = new StringExpression("paid_leave", this.getDetachedCriteria());
		approved_byId = new IntegerExpression("approved_by.staff_id", this.getDetachedCriteria());
		approved_by = new AssociationExpression("approved_by", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		leave_typeId = new IntegerExpression("leave_type.leave_type_id", this.getDetachedCriteria());
		leave_type = new AssociationExpression("leave_type", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
	}
	
	public Leave_transactionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Leave_transactionCriteria.class);
		leave_transaction_id = new IntegerExpression("leave_transaction_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		days_taken = new IntegerExpression("days_taken", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		leave_year = new IntegerExpression("leave_year", this.getDetachedCriteria());
		leave_quarter = new StringExpression("leave_quarter", this.getDetachedCriteria());
		ticket_issue_by = new StringExpression("ticket_issue_by", this.getDetachedCriteria());
		paid_leave = new StringExpression("paid_leave", this.getDetachedCriteria());
		approved_byId = new IntegerExpression("approved_by.staff_id", this.getDetachedCriteria());
		approved_by = new AssociationExpression("approved_by", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		leave_typeId = new IntegerExpression("leave_type.leave_type_id", this.getDetachedCriteria());
		leave_type = new AssociationExpression("leave_type", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public StaffDetachedCriteria createApproved_byCriteria() {
		return new StaffDetachedCriteria(createCriteria("approved_by"));
	}
	
	public Leave_typeDetachedCriteria createLeave_typeCriteria() {
		return new Leave_typeDetachedCriteria(createCriteria("leave_type"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Leave_transaction uniqueLeave_transaction(PersistentSession session) {
		return (Leave_transaction) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Leave_transaction[] listLeave_transaction(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Leave_transaction[]) list.toArray(new Leave_transaction[list.size()]);
	}
}

