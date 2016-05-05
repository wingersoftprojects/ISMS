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

public class Activity_documentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_document_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final StringExpression is_mandatory;
	public final StringExpression direction;
	public final StringExpression is_active;
	
	public Activity_documentDetachedCriteria() {
		super(entityclasses.Activity_document.class, entityclasses.Activity_documentCriteria.class);
		activity_document_id = new IntegerExpression("activity_document_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_mandatory = new StringExpression("is_mandatory", this.getDetachedCriteria());
		direction = new StringExpression("direction", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public Activity_documentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Activity_documentCriteria.class);
		activity_document_id = new IntegerExpression("activity_document_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_mandatory = new StringExpression("is_mandatory", this.getDetachedCriteria());
		direction = new StringExpression("direction", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Activity_document uniqueActivity_document(PersistentSession session) {
		return (Activity_document) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_document[] listActivity_document(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_document[]) list.toArray(new Activity_document[list.size()]);
	}
}

