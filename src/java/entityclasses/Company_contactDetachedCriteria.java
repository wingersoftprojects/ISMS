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

public class Company_contactDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression company_contact_id;
	public final StringExpression contact_name;
	public final StringExpression contact_email;
	public final StringExpression contact_phone;
	public final StringExpression contact_title;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	
	public Company_contactDetachedCriteria() {
		super(entityclasses.Company_contact.class, entityclasses.Company_contactCriteria.class);
		company_contact_id = new IntegerExpression("company_contact_id", this.getDetachedCriteria());
		contact_name = new StringExpression("contact_name", this.getDetachedCriteria());
		contact_email = new StringExpression("contact_email", this.getDetachedCriteria());
		contact_phone = new StringExpression("contact_phone", this.getDetachedCriteria());
		contact_title = new StringExpression("contact_title", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
	}
	
	public Company_contactDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Company_contactCriteria.class);
		company_contact_id = new IntegerExpression("company_contact_id", this.getDetachedCriteria());
		contact_name = new StringExpression("contact_name", this.getDetachedCriteria());
		contact_email = new StringExpression("contact_email", this.getDetachedCriteria());
		contact_phone = new StringExpression("contact_phone", this.getDetachedCriteria());
		contact_title = new StringExpression("contact_title", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Company_contact uniqueCompany_contact(PersistentSession session) {
		return (Company_contact) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Company_contact[] listCompany_contact(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Company_contact[]) list.toArray(new Company_contact[list.size()]);
	}
}

