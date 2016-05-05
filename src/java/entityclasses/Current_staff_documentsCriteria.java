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

public class Current_staff_documentsCriteria extends AbstractORMCriteria {
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
	
	public Current_staff_documentsCriteria(Criteria criteria) {
		super(criteria);
		current_staff_documents_id = new IntegerExpression("current_staff_documents_id", this);
		staffId = new IntegerExpression("staff.staff_id", this);
		staff = new AssociationExpression("staff", this);
		task_documentId = new IntegerExpression("task_document.task_document_id", this);
		task_document = new AssociationExpression("task_document", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		is_deleted = new StringExpression("is_deleted", this);
		delete_date = new TimestampExpression("delete_date", this);
		current_direction = new StringExpression("current_direction", this);
		current_direction_reason = new StringExpression("current_direction_reason", this);
		current_direction_reason_other = new StringExpression("current_direction_reason_other", this);
	}
	
	public Current_staff_documentsCriteria(PersistentSession session) {
		this(session.createCriteria(Current_staff_documents.class));
	}
	
	public Current_staff_documentsCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("staff"));
	}
	
	public Task_documentCriteria createTask_documentCriteria() {
		return new Task_documentCriteria(createCriteria("task_document"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Current_staff_documents uniqueCurrent_staff_documents() {
		return (Current_staff_documents) super.uniqueResult();
	}
	
	public Current_staff_documents[] listCurrent_staff_documents() {
		java.util.List list = super.list();
		return (Current_staff_documents[]) list.toArray(new Current_staff_documents[list.size()]);
	}
}

