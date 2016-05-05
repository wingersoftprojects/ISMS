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

public class Currency_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression currency_type_id;
	public final StringExpression currency_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff_salary;
	
	public Currency_typeDetachedCriteria() {
		super(entityclasses.Currency_type.class, entityclasses.Currency_typeCriteria.class);
		currency_type_id = new IntegerExpression("currency_type_id", this.getDetachedCriteria());
		currency_type_name = new StringExpression("currency_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff_salary = new CollectionExpression("staff_salary", this.getDetachedCriteria());
	}
	
	public Currency_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Currency_typeCriteria.class);
		currency_type_id = new IntegerExpression("currency_type_id", this.getDetachedCriteria());
		currency_type_name = new StringExpression("currency_type_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		staff_salary = new CollectionExpression("staff_salary", this.getDetachedCriteria());
	}
	
	public Staff_salaryDetachedCriteria createStaff_salaryCriteria() {
		return new Staff_salaryDetachedCriteria(createCriteria("staff_salary"));
	}
	
	public Currency_type uniqueCurrency_type(PersistentSession session) {
		return (Currency_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Currency_type[] listCurrency_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Currency_type[]) list.toArray(new Currency_type[list.size()]);
	}
}

