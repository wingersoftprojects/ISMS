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

public class NationalityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nationality_id;
	public final StringExpression nationality_name;
	public final StringExpression is_active;
	
	public NationalityDetachedCriteria() {
		super(entityclasses.Nationality.class, entityclasses.NationalityCriteria.class);
		nationality_id = new IntegerExpression("nationality_id", this.getDetachedCriteria());
		nationality_name = new StringExpression("nationality_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public NationalityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.NationalityCriteria.class);
		nationality_id = new IntegerExpression("nationality_id", this.getDetachedCriteria());
		nationality_name = new StringExpression("nationality_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public Nationality uniqueNationality(PersistentSession session) {
		return (Nationality) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Nationality[] listNationality(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Nationality[]) list.toArray(new Nationality[list.size()]);
	}
}

