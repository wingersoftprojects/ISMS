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

public class Activity_documentCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_document_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final StringExpression is_mandatory;
	public final StringExpression direction;
	public final StringExpression is_active;
	
	public Activity_documentCriteria(Criteria criteria) {
		super(criteria);
		activity_document_id = new IntegerExpression("activity_document_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		is_mandatory = new StringExpression("is_mandatory", this);
		direction = new StringExpression("direction", this);
		is_active = new StringExpression("is_active", this);
	}
	
	public Activity_documentCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_document.class));
	}
	
	public Activity_documentCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Activity_document uniqueActivity_document() {
		return (Activity_document) super.uniqueResult();
	}
	
	public Activity_document[] listActivity_document() {
		java.util.List list = super.list();
		return (Activity_document[]) list.toArray(new Activity_document[list.size()]);
	}
}

