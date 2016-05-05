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

public class Staff_salaryCriteria extends AbstractORMCriteria {
	public final IntegerExpression staff_salary_id;
	public final IntegerExpression staffId;
	public final AssociationExpression staff;
	public final IntegerExpression currency_typeId;
	public final AssociationExpression currency_type;
	public final FloatExpression salary;
	public final DateExpression startdate;
	public final DateExpression enddate;
	public final StringExpression is_active;
	public final IntegerExpression editting_id;
	public final StringExpression is_net_or_gross;
	
	public Staff_salaryCriteria(Criteria criteria) {
		super(criteria);
		staff_salary_id = new IntegerExpression("staff_salary_id", this);
		staffId = new IntegerExpression("staff.staff_id", this);
		staff = new AssociationExpression("staff", this);
		currency_typeId = new IntegerExpression("currency_type.currency_type_id", this);
		currency_type = new AssociationExpression("currency_type", this);
		salary = new FloatExpression("salary", this);
		startdate = new DateExpression("startdate", this);
		enddate = new DateExpression("enddate", this);
		is_active = new StringExpression("is_active", this);
		editting_id = new IntegerExpression("editting_id", this);
		is_net_or_gross = new StringExpression("is_net_or_gross", this);
	}
	
	public Staff_salaryCriteria(PersistentSession session) {
		this(session.createCriteria(Staff_salary.class));
	}
	
	public Staff_salaryCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Currency_typeCriteria createCurrency_typeCriteria() {
		return new Currency_typeCriteria(createCriteria("currency_type"));
	}
	
	public Staff_salary uniqueStaff_salary() {
		return (Staff_salary) super.uniqueResult();
	}
	
	public Staff_salary[] listStaff_salary() {
		java.util.List list = super.list();
		return (Staff_salary[]) list.toArray(new Staff_salary[list.size()]);
	}
}

