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

public class AgentCriteria extends AbstractORMCriteria {
	public final IntegerExpression agent_id;
	public final IntegerExpression agencyId;
	public final AssociationExpression agency;
	public final StringExpression agent_surname;
	public final StringExpression agent_other_names;
	public final IntegerExpression agent_typeId;
	public final AssociationExpression agent_type;
	public final StringExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final StringExpression status;
	public final StringExpression currentaction;
	public final CollectionExpression task;
	public final CollectionExpression staff;
	
	public AgentCriteria(Criteria criteria) {
		super(criteria);
		agent_id = new IntegerExpression("agent_id", this);
		agencyId = new IntegerExpression("agency.agency_id", this);
		agency = new AssociationExpression("agency", this);
		agent_surname = new StringExpression("agent_surname", this);
		agent_other_names = new StringExpression("agent_other_names", this);
		agent_typeId = new IntegerExpression("agent_type.agent_type_id", this);
		agent_type = new AssociationExpression("agent_type", this);
		is_active = new StringExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		status = new StringExpression("status", this);
		currentaction = new StringExpression("currentaction", this);
		task = new CollectionExpression("task", this);
		staff = new CollectionExpression("staff", this);
	}
	
	public AgentCriteria(PersistentSession session) {
		this(session.createCriteria(Agent.class));
	}
	
	public AgentCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public AgencyCriteria createAgencyCriteria() {
		return new AgencyCriteria(createCriteria("agency"));
	}
	
	public Agent_typeCriteria createAgent_typeCriteria() {
		return new Agent_typeCriteria(createCriteria("agent_type"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Agent uniqueAgent() {
		return (Agent) super.uniqueResult();
	}
	
	public Agent[] listAgent() {
		java.util.List list = super.list();
		return (Agent[]) list.toArray(new Agent[list.size()]);
	}
}

