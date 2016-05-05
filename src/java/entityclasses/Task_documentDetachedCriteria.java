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

public class Task_documentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_document_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final StringExpression document_url;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final DateExpression expiry_date;
	public final StringExpression document_ref_no;
	public final IntegerExpression document_typeonexpiry_document;
	public final TimestampExpression expiry_flag_date;
	public final StringExpression direction;
	public final IntegerExpression current_staff_documentsId;
	public final AssociationExpression current_staff_documents;
	
	public Task_documentDetachedCriteria() {
		super(entityclasses.Task_document.class, entityclasses.Task_documentCriteria.class);
		task_document_id = new IntegerExpression("task_document_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_url = new StringExpression("document_url", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		expiry_date = new DateExpression("expiry_date", this.getDetachedCriteria());
		document_ref_no = new StringExpression("document_ref_no", this.getDetachedCriteria());
		document_typeonexpiry_document = new IntegerExpression("document_typeonexpiry_document", this.getDetachedCriteria());
		expiry_flag_date = new TimestampExpression("expiry_flag_date", this.getDetachedCriteria());
		direction = new StringExpression("direction", this.getDetachedCriteria());
		current_staff_documentsId = new IntegerExpression("current_staff_documents.task_document_id", this.getDetachedCriteria());
		current_staff_documents = new AssociationExpression("current_staff_documents", this.getDetachedCriteria());
	}
	
	public Task_documentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Task_documentCriteria.class);
		task_document_id = new IntegerExpression("task_document_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_url = new StringExpression("document_url", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		expiry_date = new DateExpression("expiry_date", this.getDetachedCriteria());
		document_ref_no = new StringExpression("document_ref_no", this.getDetachedCriteria());
		document_typeonexpiry_document = new IntegerExpression("document_typeonexpiry_document", this.getDetachedCriteria());
		expiry_flag_date = new TimestampExpression("expiry_flag_date", this.getDetachedCriteria());
		direction = new StringExpression("direction", this.getDetachedCriteria());
		current_staff_documentsId = new IntegerExpression("current_staff_documents.task_document_id", this.getDetachedCriteria());
		current_staff_documents = new AssociationExpression("current_staff_documents", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Current_staff_documentsDetachedCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsDetachedCriteria(createCriteria("current_staff_documents"));
	}
	
	public Task_document uniqueTask_document(PersistentSession session) {
		return (Task_document) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_document[] listTask_document(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_document[]) list.toArray(new Task_document[list.size()]);
	}
}

