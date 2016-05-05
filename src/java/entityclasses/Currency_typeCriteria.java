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

public class Currency_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression currency_type_id;
	public final StringExpression currency_type_name;
	public final StringExpression is_active;
	public final CollectionExpression staff_salary;
	
	public Currency_typeCriteria(Criteria criteria) {
		super(criteria);
		currency_type_id = new IntegerExpression("currency_type_id", this);
		currency_type_name = new StringExpression("currency_type_name", this);
		is_active = new StringExpression("is_active", this);
		staff_salary = new CollectionExpression("staff_salary", this);
	}
	
	public Currency_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Currency_type.class));
	}
	
	public Currency_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Staff_salaryCriteria createStaff_salaryCriteria() {
		return new Staff_salaryCriteria(createCriteria("staff_salary"));
	}
	
	public Currency_type uniqueCurrency_type() {
		return (Currency_type) super.uniqueResult();
	}
	
	public Currency_type[] listCurrency_type() {
		java.util.List list = super.list();
		return (Currency_type[]) list.toArray(new Currency_type[list.size()]);
	}
}

