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

public class NationalityCriteria extends AbstractORMCriteria {
	public final IntegerExpression nationality_id;
	public final StringExpression nationality_name;
	public final StringExpression is_active;
	
	public NationalityCriteria(Criteria criteria) {
		super(criteria);
		nationality_id = new IntegerExpression("nationality_id", this);
		nationality_name = new StringExpression("nationality_name", this);
		is_active = new StringExpression("is_active", this);
	}
	
	public NationalityCriteria(PersistentSession session) {
		this(session.createCriteria(Nationality.class));
	}
	
	public NationalityCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Nationality uniqueNationality() {
		return (Nationality) super.uniqueResult();
	}
	
	public Nationality[] listNationality() {
		java.util.List list = super.list();
		return (Nationality[]) list.toArray(new Nationality[list.size()]);
	}
}

