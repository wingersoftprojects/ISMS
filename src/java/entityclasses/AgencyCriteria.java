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

public class AgencyCriteria extends AbstractORMCriteria {
	public final IntegerExpression agency_id;
	public final StringExpression agency_name;
	public final StringExpression is_active;
	public final CollectionExpression agent;
	
	public AgencyCriteria(Criteria criteria) {
		super(criteria);
		agency_id = new IntegerExpression("agency_id", this);
		agency_name = new StringExpression("agency_name", this);
		is_active = new StringExpression("is_active", this);
		agent = new CollectionExpression("agent", this);
	}
	
	public AgencyCriteria(PersistentSession session) {
		this(session.createCriteria(Agency.class));
	}
	
	public AgencyCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public AgentCriteria createAgentCriteria() {
		return new AgentCriteria(createCriteria("agent"));
	}
	
	public Agency uniqueAgency() {
		return (Agency) super.uniqueResult();
	}
	
	public Agency[] listAgency() {
		java.util.List list = super.list();
		return (Agency[]) list.toArray(new Agency[list.size()]);
	}
}

