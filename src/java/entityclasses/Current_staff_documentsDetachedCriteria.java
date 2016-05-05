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

public class Current_staff_documentsDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression current_staff_documents_id;
	public final IntegerExpression staffId;
	public final AssociationExpression staff;
	public final IntegerExpression task_documentId;
	public final AssociationExpression task_document;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final StringExpression is_deleted;
	public final TimestampExpression delete_date;
	public final StringExpression current_direction;
	public final StringExpression current_direction_reason;
	public final StringExpression current_direction_reason_other;
	
	public Current_staff_documentsDetachedCriteria() {
		super(entityclasses.Current_staff_documents.class, entityclasses.Current_staff_documentsCriteria.class);
		current_staff_documents_id = new IntegerExpression("current_staff_documents_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		task_documentId = new IntegerExpression("task_document.task_document_id", this.getDetachedCriteria());
		task_document = new AssociationExpression("task_document", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_deleted = new StringExpression("is_deleted", this.getDetachedCriteria());
		delete_date = new TimestampExpression("delete_date", this.getDetachedCriteria());
		current_direction = new StringExpression("current_direction", this.getDetachedCriteria());
		current_direction_reason = new StringExpression("current_direction_reason", this.getDetachedCriteria());
		current_direction_reason_other = new StringExpression("current_direction_reason_other", this.getDetachedCriteria());
	}
	
	public Current_staff_documentsDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Current_staff_documentsCriteria.class);
		current_staff_documents_id = new IntegerExpression("current_staff_documents_id", this.getDetachedCriteria());
		staffId = new IntegerExpression("staff.staff_id", this.getDetachedCriteria());
		staff = new AssociationExpression("staff", this.getDetachedCriteria());
		task_documentId = new IntegerExpression("task_document.task_document_id", this.getDetachedCriteria());
		task_document = new AssociationExpression("task_document", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_deleted = new StringExpression("is_deleted", this.getDetachedCriteria());
		delete_date = new TimestampExpression("delete_date", this.getDetachedCriteria());
		current_direction = new StringExpression("current_direction", this.getDetachedCriteria());
		current_direction_reason = new StringExpression("current_direction_reason", this.getDetachedCriteria());
		current_direction_reason_other = new StringExpression("current_direction_reason_other", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("staff"));
	}
	
	public Task_documentDetachedCriteria createTask_documentCriteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Current_staff_documents uniqueCurrent_staff_documents(PersistentSession session) {
		return (Current_staff_documents) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Current_staff_documents[] listCurrent_staff_documents(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Current_staff_documents[]) list.toArray(new Current_staff_documents[list.size()]);
	}
}

