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

public class AgencyDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression agency_id;
	public final StringExpression agency_name;
	public final StringExpression is_active;
	public final CollectionExpression agent;
	
	public AgencyDetachedCriteria() {
		super(entityclasses.Agency.class, entityclasses.AgencyCriteria.class);
		agency_id = new IntegerExpression("agency_id", this.getDetachedCriteria());
		agency_name = new StringExpression("agency_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
	}
	
	public AgencyDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.AgencyCriteria.class);
		agency_id = new IntegerExpression("agency_id", this.getDetachedCriteria());
		agency_name = new StringExpression("agency_name", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
	}
	
	public AgentDetachedCriteria createAgentCriteria() {
		return new AgentDetachedCriteria(createCriteria("agent"));
	}
	
	public Agency uniqueAgency(PersistentSession session) {
		return (Agency) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Agency[] listAgency(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Agency[]) list.toArray(new Agency[list.size()]);
	}
}

