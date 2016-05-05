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

public class AgentDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AgentDetachedCriteria() {
		super(entityclasses.Agent.class, entityclasses.AgentCriteria.class);
		agent_id = new IntegerExpression("agent_id", this.getDetachedCriteria());
		agencyId = new IntegerExpression("agency.agency_id", this.getDetachedCriteria());
		agency = new AssociationExpression("agency", this.getDetachedCriteria());
		agent_surname = new StringExpression("agent_surname", this.getDetachedCriteria());
		agent_other_names = new StringExpression("agent_other_names", this.getDetachedCriteria());
		agent_typeId = new IntegerExpression("agent_type.agent_type_id", this.getDetachedCriteria());
		agent_type = new AssociationExpression("agent_type", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		currentaction = new StringExpression("currentaction", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public AgentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.AgentCriteria.class);
		agent_id = new IntegerExpression("agent_id", this.getDetachedCriteria());
		agencyId = new IntegerExpression("agency.agency_id", this.getDetachedCriteria());
		agency = new AssociationExpression("agency", this.getDetachedCriteria());
		agent_surname = new StringExpression("agent_surname", this.getDetachedCriteria());
		agent_other_names = new StringExpression("agent_other_names", this.getDetachedCriteria());
		agent_typeId = new IntegerExpression("agent_type.agent_type_id", this.getDetachedCriteria());
		agent_type = new AssociationExpression("agent_type", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		currentaction = new StringExpression("currentaction", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		staff = new CollectionExpression("staff", this.getDetachedCriteria());
	}
	
	public AgencyDetachedCriteria createAgencyCriteria() {
		return new AgencyDetachedCriteria(createCriteria("agency"));
	}
	
	public Agent_typeDetachedCriteria createAgent_typeCriteria() {
		return new Agent_typeDetachedCriteria(createCriteria("agent_type"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Agent uniqueAgent(PersistentSession session) {
		return (Agent) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Agent[] listAgent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Agent[]) list.toArray(new Agent[list.size()]);
	}
}

