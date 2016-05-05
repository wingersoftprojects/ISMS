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

public class Activity_document_checklistCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_document_checklist_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	
	public Activity_document_checklistCriteria(Criteria criteria) {
		super(criteria);
		activity_document_checklist_id = new IntegerExpression("activity_document_checklist_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
	}
	
	public Activity_document_checklistCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_document_checklist.class));
	}
	
	public Activity_document_checklistCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Activity_document_checklist uniqueActivity_document_checklist() {
		return (Activity_document_checklist) super.uniqueResult();
	}
	
	public Activity_document_checklist[] listActivity_document_checklist() {
		java.util.List list = super.list();
		return (Activity_document_checklist[]) list.toArray(new Activity_document_checklist[list.size()]);
	}
}

