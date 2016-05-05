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

public class Activity_document_checklistDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_document_checklist_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	
	public Activity_document_checklistDetachedCriteria() {
		super(entityclasses.Activity_document_checklist.class, entityclasses.Activity_document_checklistCriteria.class);
		activity_document_checklist_id = new IntegerExpression("activity_document_checklist_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
	}
	
	public Activity_document_checklistDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Activity_document_checklistCriteria.class);
		activity_document_checklist_id = new IntegerExpression("activity_document_checklist_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Activity_document_checklist uniqueActivity_document_checklist(PersistentSession session) {
		return (Activity_document_checklist) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_document_checklist[] listActivity_document_checklist(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_document_checklist[]) list.toArray(new Activity_document_checklist[list.size()]);
	}
}

