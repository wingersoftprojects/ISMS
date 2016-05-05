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

public class Company_contactCriteria extends AbstractORMCriteria {
	public final IntegerExpression company_contact_id;
	public final StringExpression contact_name;
	public final StringExpression contact_email;
	public final StringExpression contact_phone;
	public final StringExpression contact_title;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	
	public Company_contactCriteria(Criteria criteria) {
		super(criteria);
		company_contact_id = new IntegerExpression("company_contact_id", this);
		contact_name = new StringExpression("contact_name", this);
		contact_email = new StringExpression("contact_email", this);
		contact_phone = new StringExpression("contact_phone", this);
		contact_title = new StringExpression("contact_title", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
	}
	
	public Company_contactCriteria(PersistentSession session) {
		this(session.createCriteria(Company_contact.class));
	}
	
	public Company_contactCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Company_contact uniqueCompany_contact() {
		return (Company_contact) super.uniqueResult();
	}
	
	public Company_contact[] listCompany_contact() {
		java.util.List list = super.list();
		return (Company_contact[]) list.toArray(new Company_contact[list.size()]);
	}
}

