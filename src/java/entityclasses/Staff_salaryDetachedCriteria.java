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

public class Staff_salaryDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Staff_salaryDetachedCriteria() {
		super(entityclasses.Staff_salary.class, entityclasses.Staff_salaryCriteria.class);
		staff_salary_id = new IntegerExpression("staff_salary_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		currency_typeId = new IntegerExpression("currency_type.currency_type_id", this.getDetachedCriteria());
		currency_type = new AssociationExpression("currency_type", this.getDetachedCriteria());
		salary = new FloatExpression("salary", this.getDetachedCriteria());
		startdate = new DateExpression("startdate", this.getDetachedCriteria());
		enddate = new DateExpression("enddate", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		editting_id = new IntegerExpression("editting_id", this.getDetachedCriteria());
		is_net_or_gross = new StringExpression("is_net_or_gross", this.getDetachedCriteria());
	}
	
	public Staff_salaryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Staff_salaryCriteria.class);
		staff_salary_id = new IntegerExpression("staff_salary_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		currency_typeId = new IntegerExpression("currency_type.currency_type_id", this.getDetachedCriteria());
		currency_type = new AssociationExpression("currency_type", this.getDetachedCriteria());
		salary = new FloatExpression("salary", this.getDetachedCriteria());
		startdate = new DateExpression("startdate", this.getDetachedCriteria());
		enddate = new DateExpression("enddate", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		editting_id = new IntegerExpression("editting_id", this.getDetachedCriteria());
		is_net_or_gross = new StringExpression("is_net_or_gross", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Currency_typeDetachedCriteria createCurrency_typeCriteria() {
		return new Currency_typeDetachedCriteria(createCriteria("currency_type"));
	}
	
	public Staff_salary uniqueStaff_salary(PersistentSession session) {
		return (Staff_salary) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff_salary[] listStaff_salary(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff_salary[]) list.toArray(new Staff_salary[list.size()]);
	}
}

