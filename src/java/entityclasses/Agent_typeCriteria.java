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

public class Agent_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression agent_type_id;
	public final StringExpression agent_type_name;
	public final CollectionExpression agent;
	
	public Agent_typeCriteria(Criteria criteria) {
		super(criteria);
		agent_type_id = new IntegerExpression("agent_type_id", this);
		agent_type_name = new StringExpression("agent_type_name", this);
		agent = new CollectionExpression("agent", this);
	}
	
	public Agent_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Agent_type.class));
	}
	
	public Agent_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public AgentCriteria createAgentCriteria() {
		return new AgentCriteria(createCriteria("agent"));
	}
	
	public Agent_type uniqueAgent_type() {
		return (Agent_type) super.uniqueResult();
	}
	
	public Agent_type[] listAgent_type() {
		java.util.List list = super.list();
		return (Agent_type[]) list.toArray(new Agent_type[list.size()]);
	}
}

