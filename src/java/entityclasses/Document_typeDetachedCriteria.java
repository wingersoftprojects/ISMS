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

public class Document_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression document_type_id;
	public final StringExpression doc_type_name;
	public final StringExpression is_renewable;
	public final StringExpression is_active;
	public final IntegerExpression onexpire_activityId;
	public final AssociationExpression onexpire_activity;
	public final IntegerExpression flag_duration_beforeexpiry;
	public final IntegerExpression document_type_level;
	public final CollectionExpression activity_document;
	public final CollectionExpression task_document;
	public final CollectionExpression activity_document_checklist;
	public final CollectionExpression current_staff_documents;
	
	public Document_typeDetachedCriteria() {
		super(entityclasses.Document_type.class, entityclasses.Document_typeCriteria.class);
		document_type_id = new IntegerExpression("document_type_id", this.getDetachedCriteria());
		doc_type_name = new StringExpression("doc_type_name", this.getDetachedCriteria());
		is_renewable = new StringExpression("is_renewable", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		onexpire_activityId = new IntegerExpression("onexpire_activity.activity_id", this.getDetachedCriteria());
		onexpire_activity = new AssociationExpression("onexpire_activity", this.getDetachedCriteria());
		flag_duration_beforeexpiry = new IntegerExpression("flag_duration_beforeexpiry", this.getDetachedCriteria());
		document_type_level = new IntegerExpression("document_type_level", this.getDetachedCriteria());
		activity_document = new CollectionExpression("activity_document", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this.getDetachedCriteria());
		current_staff_documents = new CollectionExpression("current_staff_documents", this.getDetachedCriteria());
	}
	
	public Document_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Document_typeCriteria.class);
		document_type_id = new IntegerExpression("document_type_id", this.getDetachedCriteria());
		doc_type_name = new StringExpression("doc_type_name", this.getDetachedCriteria());
		is_renewable = new StringExpression("is_renewable", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		onexpire_activityId = new IntegerExpression("onexpire_activity.activity_id", this.getDetachedCriteria());
		onexpire_activity = new AssociationExpression("onexpire_activity", this.getDetachedCriteria());
		flag_duration_beforeexpiry = new IntegerExpression("flag_duration_beforeexpiry", this.getDetachedCriteria());
		document_type_level = new IntegerExpression("document_type_level", this.getDetachedCriteria());
		activity_document = new CollectionExpression("activity_document", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this.getDetachedCriteria());
		current_staff_documents = new CollectionExpression("current_staff_documents", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createOnexpire_activityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("onexpire_activity"));
	}
	
	public Activity_documentDetachedCriteria createActivity_documentCriteria() {
		return new Activity_documentDetachedCriteria(createCriteria("activity_document"));
	}
	
	public Task_documentDetachedCriteria createTask_documentCriteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document"));
	}
	
	public Activity_document_checklistDetachedCriteria createActivity_document_checklistCriteria() {
		return new Activity_document_checklistDetachedCriteria(createCriteria("activity_document_checklist"));
	}
	
	public Current_staff_documentsDetachedCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsDetachedCriteria(createCriteria("current_staff_documents"));
	}
	
	public Document_type uniqueDocument_type(PersistentSession session) {
		return (Document_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Document_type[] listDocument_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Document_type[]) list.toArray(new Document_type[list.size()]);
	}
}

