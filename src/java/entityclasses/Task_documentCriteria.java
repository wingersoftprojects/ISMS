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

public class Task_documentCriteria extends AbstractORMCriteria {
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
	
	public Task_documentCriteria(Criteria criteria) {
		super(criteria);
		task_document_id = new IntegerExpression("task_document_id", this);
		taskId = new IntegerExpression("task.task_id", this);
		task = new AssociationExpression("task", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		document_url = new StringExpression("document_url", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		expiry_date = new DateExpression("expiry_date", this);
		document_ref_no = new StringExpression("document_ref_no", this);
		document_typeonexpiry_document = new IntegerExpression("document_typeonexpiry_document", this);
		expiry_flag_date = new TimestampExpression("expiry_flag_date", this);
		direction = new StringExpression("direction", this);
		current_staff_documentsId = new IntegerExpression("current_staff_documents.task_document_id", this);
		current_staff_documents = new AssociationExpression("current_staff_documents", this);
	}
	
	public Task_documentCriteria(PersistentSession session) {
		this(session.createCriteria(Task_document.class));
	}
	
	public Task_documentCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Current_staff_documentsCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsCriteria(createCriteria("current_staff_documents"));
	}
	
	public Task_document uniqueTask_document() {
		return (Task_document) super.uniqueResult();
	}
	
	public Task_document[] listTask_document() {
		java.util.List list = super.list();
		return (Task_document[]) list.toArray(new Task_document[list.size()]);
	}
}

