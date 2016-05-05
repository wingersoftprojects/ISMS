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

public class Document_typeCriteria extends AbstractORMCriteria {
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
	
	public Document_typeCriteria(Criteria criteria) {
		super(criteria);
		document_type_id = new IntegerExpression("document_type_id", this);
		doc_type_name = new StringExpression("doc_type_name", this);
		is_renewable = new StringExpression("is_renewable", this);
		is_active = new StringExpression("is_active", this);
		onexpire_activityId = new IntegerExpression("onexpire_activity.activity_id", this);
		onexpire_activity = new AssociationExpression("onexpire_activity", this);
		flag_duration_beforeexpiry = new IntegerExpression("flag_duration_beforeexpiry", this);
		document_type_level = new IntegerExpression("document_type_level", this);
		activity_document = new CollectionExpression("activity_document", this);
		task_document = new CollectionExpression("task_document", this);
		activity_document_checklist = new CollectionExpression("activity_document_checklist", this);
		current_staff_documents = new CollectionExpression("current_staff_documents", this);
	}
	
	public Document_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Document_type.class));
	}
	
	public Document_typeCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createOnexpire_activityCriteria() {
		return new ActivityCriteria(createCriteria("onexpire_activity"));
	}
	
	public Activity_documentCriteria createActivity_documentCriteria() {
		return new Activity_documentCriteria(createCriteria("activity_document"));
	}
	
	public Task_documentCriteria createTask_documentCriteria() {
		return new Task_documentCriteria(createCriteria("task_document"));
	}
	
	public Activity_document_checklistCriteria createActivity_document_checklistCriteria() {
		return new Activity_document_checklistCriteria(createCriteria("activity_document_checklist"));
	}
	
	public Current_staff_documentsCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsCriteria(createCriteria("current_staff_documents"));
	}
	
	public Document_type uniqueDocument_type() {
		return (Document_type) super.uniqueResult();
	}
	
	public Document_type[] listDocument_type() {
		java.util.List list = super.list();
		return (Document_type[]) list.toArray(new Document_type[list.size()]);
	}
}

