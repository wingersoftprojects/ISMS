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

public class Agent_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression agent_type_id;
	public final StringExpression agent_type_name;
	public final CollectionExpression agent;
	
	public Agent_typeDetachedCriteria() {
		super(entityclasses.Agent_type.class, entityclasses.Agent_typeCriteria.class);
		agent_type_id = new IntegerExpression("agent_type_id", this.getDetachedCriteria());
		agent_type_name = new StringExpression("agent_type_name", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
	}
	
	public Agent_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Agent_typeCriteria.class);
		agent_type_id = new IntegerExpression("agent_type_id", this.getDetachedCriteria());
		agent_type_name = new StringExpression("agent_type_name", this.getDetachedCriteria());
		agent = new CollectionExpression("agent", this.getDetachedCriteria());
	}
	
	public AgentDetachedCriteria createAgentCriteria() {
		return new AgentDetachedCriteria(createCriteria("agent"));
	}
	
	public Agent_type uniqueAgent_type(PersistentSession session) {
		return (Agent_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Agent_type[] listAgent_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Agent_type[]) list.toArray(new Agent_type[list.size()]);
	}
}

