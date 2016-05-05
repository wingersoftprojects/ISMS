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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="document_type")
public class Document_type implements Serializable {
	public Document_type() {
	}
	
	public static Document_type loadDocument_typeByORMID(int document_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadDocument_typeByORMID(session, document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(int document_type_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getDocument_typeByORMID(session, document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadDocument_typeByORMID(session, document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getDocument_typeByORMID(session, document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(PersistentSession session, int document_type_id) throws PersistentException {
		try {
			return (Document_type) session.load(entityclasses.Document_type.class, new Integer(document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(PersistentSession session, int document_type_id) throws PersistentException {
		try {
			return (Document_type) session.get(entityclasses.Document_type.class, new Integer(document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(PersistentSession session, int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Document_type) session.load(entityclasses.Document_type.class, new Integer(document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(PersistentSession session, int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Document_type) session.get(entityclasses.Document_type.class, new Integer(document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryDocument_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryDocument_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Document_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDocument_type(session, condition, orderBy);
			return (Document_type[]) list.toArray(new Document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDocument_type(session, condition, orderBy, lockMode);
			return (Document_type[]) list.toArray(new Document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Document_type[] document_types = listDocument_typeByQuery(session, condition, orderBy);
		if (document_types != null && document_types.length > 0)
			return document_types[0];
		else
			return null;
	}
	
	public static Document_type loadDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Document_type[] document_types = listDocument_typeByQuery(session, condition, orderBy, lockMode);
		if (document_types != null && document_types.length > 0)
			return document_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Document_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByCriteria(Document_typeCriteria document_typeCriteria) {
		Document_type[] document_types = listDocument_typeByCriteria(document_typeCriteria);
		if(document_types == null || document_types.length == 0) {
			return null;
		}
		return document_types[0];
	}
	
	public static Document_type[] listDocument_typeByCriteria(Document_typeCriteria document_typeCriteria) {
		return document_typeCriteria.listDocument_type();
	}
	
	public static Document_type createDocument_type() {
		return new entityclasses.Document_type();
	}
	
	public boolean save() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			entityclasses.ISMSPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getOnexpire_activity() != null) {
				getOnexpire_activity().getDocument_type().remove(this);
			}
			
			entityclasses.Activity_document[] lActivity_documents = (entityclasses.Activity_document[])getActivity_document().toArray(new entityclasses.Activity_document[getActivity_document().size()]);
			for(int i = 0; i < lActivity_documents.length; i++) {
				lActivity_documents[i].setDocument_type(null);
			}
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setDocument_type(null);
			}
			entityclasses.Activity_document_checklist[] lActivity_document_checklists = (entityclasses.Activity_document_checklist[])getActivity_document_checklist().toArray(new entityclasses.Activity_document_checklist[getActivity_document_checklist().size()]);
			for(int i = 0; i < lActivity_document_checklists.length; i++) {
				lActivity_document_checklists[i].setDocument_type(null);
			}
			entityclasses.Current_staff_documents[] lCurrent_staff_documentss = (entityclasses.Current_staff_documents[])getCurrent_staff_documents().toArray(new entityclasses.Current_staff_documents[getCurrent_staff_documents().size()]);
			for(int i = 0; i < lCurrent_staff_documentss.length; i++) {
				lCurrent_staff_documentss[i].setDocument_type(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getOnexpire_activity() != null) {
				getOnexpire_activity().getDocument_type().remove(this);
			}
			
			entityclasses.Activity_document[] lActivity_documents = (entityclasses.Activity_document[])getActivity_document().toArray(new entityclasses.Activity_document[getActivity_document().size()]);
			for(int i = 0; i < lActivity_documents.length; i++) {
				lActivity_documents[i].setDocument_type(null);
			}
			entityclasses.Task_document[] lTask_documents = (entityclasses.Task_document[])getTask_document().toArray(new entityclasses.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setDocument_type(null);
			}
			entityclasses.Activity_document_checklist[] lActivity_document_checklists = (entityclasses.Activity_document_checklist[])getActivity_document_checklist().toArray(new entityclasses.Activity_document_checklist[getActivity_document_checklist().size()]);
			for(int i = 0; i < lActivity_document_checklists.length; i++) {
				lActivity_document_checklists[i].setDocument_type(null);
			}
			entityclasses.Current_staff_documents[] lCurrent_staff_documentss = (entityclasses.Current_staff_documents[])getCurrent_staff_documents().toArray(new entityclasses.Current_staff_documents[getCurrent_staff_documents().size()]);
			for(int i = 0; i < lCurrent_staff_documentss.length; i++) {
				lCurrent_staff_documentss[i].setDocument_type(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="document_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_DOCUMENT_TYPE_DOCUMENT_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_DOCUMENT_TYPE_DOCUMENT_TYPE_ID_GENERATOR", strategy="native")	
	private int document_type_id;
	
	@Column(name="doc_type_name", nullable=false, length=20)	
	private String doc_type_name;
	
	@Column(name="is_renewable", nullable=false, length=3)	
	private String is_renewable;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@ManyToOne(targetEntity=entityclasses.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="onexpire_activity", referencedColumnName="activity_id") })	
	private entityclasses.Activity onexpire_activity;
	
	@Column(name="flag_duration_beforeexpiry", nullable=true, length=11)	
	private Integer flag_duration_beforeexpiry;
	
	@Column(name="document_type_level", nullable=true, length=11)	
	private Integer document_type_level;
	
	@OneToMany(mappedBy="document_type", targetEntity=entityclasses.Activity_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_document = new java.util.HashSet();
	
	@OneToMany(mappedBy="document_type", targetEntity=entityclasses.Task_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task_document = new java.util.HashSet();
	
	@OneToMany(mappedBy="document_type", targetEntity=entityclasses.Activity_document_checklist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set activity_document_checklist = new java.util.HashSet();
	
	@OneToMany(mappedBy="document_type", targetEntity=entityclasses.Current_staff_documents.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set current_staff_documents = new java.util.HashSet();
	
	private void setDocument_type_id(int value) {
		this.document_type_id = value;
	}
	
	public int getDocument_type_id() {
		return document_type_id;
	}
	
	public int getORMID() {
		return getDocument_type_id();
	}
	
	public void setDoc_type_name(String value) {
		this.doc_type_name = value;
	}
	
	public String getDoc_type_name() {
		return doc_type_name;
	}
	
	public void setIs_renewable(String value) {
		this.is_renewable = value;
	}
	
	public String getIs_renewable() {
		return is_renewable;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setFlag_duration_beforeexpiry(int value) {
		setFlag_duration_beforeexpiry(new Integer(value));
	}
	
	public void setFlag_duration_beforeexpiry(Integer value) {
		this.flag_duration_beforeexpiry = value;
	}
	
	public Integer getFlag_duration_beforeexpiry() {
		return flag_duration_beforeexpiry;
	}
	
	/**
	 * Leve1:
	 * for IDs such as PP, NID, EID, etc
	 * 
	 * Level2:
	 * for Parent/main permit docs
	 * 
	 * Level3:
	 * for Child permit docs e,g SPs, VPs, BCs, etc
	 */
	public void setDocument_type_level(int value) {
		setDocument_type_level(new Integer(value));
	}
	
	/**
	 * Leve1:
	 * for IDs such as PP, NID, EID, etc
	 * 
	 * Level2:
	 * for Parent/main permit docs
	 * 
	 * Level3:
	 * for Child permit docs e,g SPs, VPs, BCs, etc
	 */
	public void setDocument_type_level(Integer value) {
		this.document_type_level = value;
	}
	
	/**
	 * Leve1:
	 * for IDs such as PP, NID, EID, etc
	 * 
	 * Level2:
	 * for Parent/main permit docs
	 * 
	 * Level3:
	 * for Child permit docs e,g SPs, VPs, BCs, etc
	 */
	public Integer getDocument_type_level() {
		return document_type_level;
	}
	
	public void setOnexpire_activity(entityclasses.Activity value) {
		this.onexpire_activity = value;
	}
	
	public entityclasses.Activity getOnexpire_activity() {
		return onexpire_activity;
	}
	
	public void setActivity_document(java.util.Set value) {
		this.activity_document = value;
	}
	
	public java.util.Set getActivity_document() {
		return activity_document;
	}
	
	
	public void setTask_document(java.util.Set value) {
		this.task_document = value;
	}
	
	public java.util.Set getTask_document() {
		return task_document;
	}
	
	
	public void setActivity_document_checklist(java.util.Set value) {
		this.activity_document_checklist = value;
	}
	
	public java.util.Set getActivity_document_checklist() {
		return activity_document_checklist;
	}
	
	
	public void setCurrent_staff_documents(java.util.Set value) {
		this.current_staff_documents = value;
	}
	
	public java.util.Set getCurrent_staff_documents() {
		return current_staff_documents;
	}
	
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		        return getClass() == obj.getClass();
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getDocument_type_id());
	}
	
}
