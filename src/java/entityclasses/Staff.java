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
@Table(name="staff")
public class Staff implements Serializable {
	public Staff() {
	}
	
	public static Staff loadStaffByORMID(int staff_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaffByORMID(session, staff_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(int staff_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaffByORMID(session, staff_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(int staff_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaffByORMID(session, staff_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(int staff_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getStaffByORMID(session, staff_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(PersistentSession session, int staff_id) throws PersistentException {
		try {
			return (Staff) session.load(entityclasses.Staff.class, new Integer(staff_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(PersistentSession session, int staff_id) throws PersistentException {
		try {
			return (Staff) session.get(entityclasses.Staff.class, new Integer(staff_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(PersistentSession session, int staff_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff) session.load(entityclasses.Staff.class, new Integer(staff_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(PersistentSession session, int staff_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff) session.get(entityclasses.Staff.class, new Integer(staff_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryStaff(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff as Staff");
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
	
	public static List queryStaff(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff as Staff");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStaff(session, condition, orderBy);
			return (Staff[]) list.toArray(new Staff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStaff(session, condition, orderBy, lockMode);
			return (Staff[]) list.toArray(new Staff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Staff[] staffs = listStaffByQuery(session, condition, orderBy);
		if (staffs != null && staffs.length > 0)
			return staffs[0];
		else
			return null;
	}
	
	public static Staff loadStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Staff[] staffs = listStaffByQuery(session, condition, orderBy, lockMode);
		if (staffs != null && staffs.length > 0)
			return staffs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff as Staff");
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
	
	public static java.util.Iterator iterateStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Staff as Staff");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Staff", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByCriteria(StaffCriteria staffCriteria) {
		Staff[] staffs = listStaffByCriteria(staffCriteria);
		if(staffs == null || staffs.length == 0) {
			return null;
		}
		return staffs[0];
	}
	
	public static Staff[] listStaffByCriteria(StaffCriteria staffCriteria) {
		return staffCriteria.listStaff();
	}
	
	public static Staff createStaff() {
		return new entityclasses.Staff();
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
			if(getStaff_type() != null) {
				getStaff_type().getStaff().remove(this);
			}
			
			if(getCompany() != null) {
				getCompany().getStaff().remove(this);
			}
			
			if(getStaff_post() != null) {
				getStaff_post().getStaff().remove(this);
			}
			
			if(getRecruit_agent() != null) {
				getRecruit_agent().getStaff().remove(this);
			}
			
			if(getAir_ticket_type() != null) {
				getAir_ticket_type().getStaff().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getStaff1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getStaff2().remove(this);
			}
			
			if(getExit_mode() != null) {
				getExit_mode().getStaff().remove(this);
			}
			
			if(getAccom_type() != null) {
				getAccom_type().getStaff().remove(this);
			}
			
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setStaff(null);
			}
			entityclasses.User_detail[] lUser_detailss = (entityclasses.User_detail[])getUser_details().toArray(new entityclasses.User_detail[getUser_details().size()]);
			for(int i = 0; i < lUser_detailss.length; i++) {
				lUser_detailss[i].setStaff(null);
			}
			entityclasses.Leave_transaction[] lLeave_transactions = (entityclasses.Leave_transaction[])getLeave_transaction().toArray(new entityclasses.Leave_transaction[getLeave_transaction().size()]);
			for(int i = 0; i < lLeave_transactions.length; i++) {
				lLeave_transactions[i].setStaff(null);
			}
			entityclasses.Leave_transaction[] lLeave_transaction1s = (entityclasses.Leave_transaction[])getLeave_transaction1().toArray(new entityclasses.Leave_transaction[getLeave_transaction1().size()]);
			for(int i = 0; i < lLeave_transaction1s.length; i++) {
				lLeave_transaction1s[i].setApproved_by(null);
			}
			entityclasses.Current_staff_documents[] lCurrent_staff_documentss = (entityclasses.Current_staff_documents[])getCurrent_staff_documents().toArray(new entityclasses.Current_staff_documents[getCurrent_staff_documents().size()]);
			for(int i = 0; i < lCurrent_staff_documentss.length; i++) {
				lCurrent_staff_documentss[i].setStaff(null);
			}
			entityclasses.Staff_salary[] lStaff_salarys = (entityclasses.Staff_salary[])getStaff_salary().toArray(new entityclasses.Staff_salary[getStaff_salary().size()]);
			for(int i = 0; i < lStaff_salarys.length; i++) {
				lStaff_salarys[i].setStaff(null);
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
			if(getStaff_type() != null) {
				getStaff_type().getStaff().remove(this);
			}
			
			if(getCompany() != null) {
				getCompany().getStaff().remove(this);
			}
			
			if(getStaff_post() != null) {
				getStaff_post().getStaff().remove(this);
			}
			
			if(getRecruit_agent() != null) {
				getRecruit_agent().getStaff().remove(this);
			}
			
			if(getAir_ticket_type() != null) {
				getAir_ticket_type().getStaff().remove(this);
			}
			
			if(getAdd_user() != null) {
				getAdd_user().getStaff1().remove(this);
			}
			
			if(getEdit_user() != null) {
				getEdit_user().getStaff2().remove(this);
			}
			
			if(getExit_mode() != null) {
				getExit_mode().getStaff().remove(this);
			}
			
			if(getAccom_type() != null) {
				getAccom_type().getStaff().remove(this);
			}
			
			entityclasses.Task[] lTasks = (entityclasses.Task[])getTask().toArray(new entityclasses.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setStaff(null);
			}
			entityclasses.User_detail[] lUser_detailss = (entityclasses.User_detail[])getUser_details().toArray(new entityclasses.User_detail[getUser_details().size()]);
			for(int i = 0; i < lUser_detailss.length; i++) {
				lUser_detailss[i].setStaff(null);
			}
			entityclasses.Leave_transaction[] lLeave_transactions = (entityclasses.Leave_transaction[])getLeave_transaction().toArray(new entityclasses.Leave_transaction[getLeave_transaction().size()]);
			for(int i = 0; i < lLeave_transactions.length; i++) {
				lLeave_transactions[i].setStaff(null);
			}
			entityclasses.Leave_transaction[] lLeave_transaction1s = (entityclasses.Leave_transaction[])getLeave_transaction1().toArray(new entityclasses.Leave_transaction[getLeave_transaction1().size()]);
			for(int i = 0; i < lLeave_transaction1s.length; i++) {
				lLeave_transaction1s[i].setApproved_by(null);
			}
			entityclasses.Current_staff_documents[] lCurrent_staff_documentss = (entityclasses.Current_staff_documents[])getCurrent_staff_documents().toArray(new entityclasses.Current_staff_documents[getCurrent_staff_documents().size()]);
			for(int i = 0; i < lCurrent_staff_documentss.length; i++) {
				lCurrent_staff_documentss[i].setStaff(null);
			}
			entityclasses.Staff_salary[] lStaff_salarys = (entityclasses.Staff_salary[])getStaff_salary().toArray(new entityclasses.Staff_salary[getStaff_salary().size()]);
			for(int i = 0; i < lStaff_salarys.length; i++) {
				lStaff_salarys[i].setStaff(null);
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
	
	@Column(name="staff_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_STAFF_STAFF_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_STAFF_STAFF_ID_GENERATOR", strategy="native")	
	private int staff_id;
	
	@ManyToOne(targetEntity=entityclasses.Staff_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_type_id", referencedColumnName="staff_type_id") })	
	private entityclasses.Staff_type staff_type;
	
	@ManyToOne(targetEntity=entityclasses.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private entityclasses.Company company;
	
	@Column(name="leave_days", nullable=true, length=11)	
	private int leave_days;
	
	@Column(name="pp_type", nullable=true, length=50)	
	private String pp_type;
	
	@Column(name="pp_nationality", nullable=true, length=200)	
	private String pp_nationality;
	
	@Column(name="pp_passport_no", nullable=false, unique=true, length=50)	
	private String pp_passport_no;
	
	@Column(name="pp_surname", nullable=false, length=200)	
	private String pp_surname;
	
	@Column(name="pp_given_names", nullable=false, length=200)	
	private String pp_given_names;
	
	@Column(name="pp_issuedby", nullable=false, length=100)	
	private String pp_issuedby;
	
	@Column(name="pp_date_of_birth", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date pp_date_of_birth;
	
	@Column(name="pp_profession", nullable=true, length=200)	
	private String pp_profession;
	
	@Column(name="pp_sex", nullable=false, length=20)	
	private String pp_sex;
	
	@Column(name="pp_place_of_birth", nullable=true, length=200)	
	private String pp_place_of_birth;
	
	@Column(name="pp_date_of_issue", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date pp_date_of_issue;
	
	@Column(name="pp_date_of_expiry", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date pp_date_of_expiry;
	
	@ManyToOne(targetEntity=entityclasses.Staff_post.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="staff_post_id", referencedColumnName="staff_post_id") })	
	private entityclasses.Staff_post staff_post;
	
	@Column(name="join_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date join_date;
	
	@ManyToOne(targetEntity=entityclasses.Agent.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="recruit_agent_id", referencedColumnName="agent_id") })	
	private entityclasses.Agent recruit_agent;
	
	@ManyToOne(targetEntity=entityclasses.Air_ticket_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="air_ticket_type_id", referencedColumnName="air_ticket_type_id") })	
	private entityclasses.Air_ticket_type air_ticket_type;
	
	@Column(name="add_date", nullable=false)	
	private java.sql.Timestamp add_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="add_user", referencedColumnName="user_detail_id", nullable=false) })	
	private entityclasses.User_detail add_user;
	
	@Column(name="edit_date", nullable=true)	
	private java.sql.Timestamp edit_date;
	
	@ManyToOne(targetEntity=entityclasses.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="edit_user", referencedColumnName="user_detail_id") })	
	private entityclasses.User_detail edit_user;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@Column(name="exit_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date exit_date;
	
	@ManyToOne(targetEntity=entityclasses.Exit_mode.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="exit_mode_id", referencedColumnName="exit_mode_id") })	
	private entityclasses.Exit_mode exit_mode;
	
	@ManyToOne(targetEntity=entityclasses.Accommodation_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="accom_type_id", referencedColumnName="accommodation_type_id") })	
	private entityclasses.Accommodation_type accom_type;
	
	@Column(name="email", nullable=true, length=100)	
	private String email;
	
	@Column(name="cabinet_no", nullable=true, length=11)	
	private Integer cabinet_no;
	
	@Column(name="cabinet_section", nullable=true, length=1)	
	private String cabinet_section;
	
	@Column(name="spouse", nullable=true, length=1)	
	private Boolean spouse;
	
	@Column(name="kid1", nullable=true, length=1)	
	private Boolean kid1;
	
	@Column(name="kid2", nullable=true, length=1)	
	private Boolean kid2;
	
	@Column(name="spouse_name", nullable=true, length=100)	
	private String spouse_name;
	
	@Column(name="spouse_passport_no", nullable=true, length=50)	
	private String spouse_passport_no;
	
	@Column(name="spouse_visa_expiry_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date spouse_visa_expiry_date;
	
	@Column(name="kid1_name", nullable=true, length=100)	
	private String kid1_name;
	
	@Column(name="kid1_passport_no", nullable=true, length=50)	
	private String kid1_passport_no;
	
	@Column(name="kid1_visa_expiry_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date kid1_visa_expiry_date;
	
	@Column(name="kid2_name", nullable=true, length=100)	
	private String kid2_name;
	
	@Column(name="kid2_passport_no", nullable=true, length=50)	
	private String kid2_passport_no;
	
	@Column(name="kid2_visa_expiry_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date kid2_visa_expiry_date;
	
	@Column(name="contract_start_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date contract_start_date;
	
	@Column(name="contract_end_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date contract_end_date;
	
	@Column(name="phone1", nullable=true, length=50)	
	private String phone1;
	
	@Column(name="phone2", nullable=true, length=50)	
	private String phone2;
	
	@OneToMany(mappedBy="staff", targetEntity=entityclasses.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set task = new java.util.HashSet();
	
	@OneToMany(mappedBy="staff", targetEntity=entityclasses.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set user_details = new java.util.HashSet();
	
	@OneToMany(mappedBy="staff", targetEntity=entityclasses.Leave_transaction.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set leave_transaction = new java.util.HashSet();
	
	@OneToMany(mappedBy="approved_by", targetEntity=entityclasses.Leave_transaction.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set leave_transaction1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="staff", targetEntity=entityclasses.Current_staff_documents.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set current_staff_documents = new java.util.HashSet();
	
	@OneToMany(mappedBy="staff", targetEntity=entityclasses.Staff_salary.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff_salary = new java.util.HashSet();
	
	private void setStaff_id(int value) {
		this.staff_id = value;
	}
	
	public int getStaff_id() {
		return staff_id;
	}
	
	public int getORMID() {
		return getStaff_id();
	}
	
	public void setLeave_days(int value) {
		this.leave_days = value;
	}
	
	public int getLeave_days() {
		return leave_days;
	}
	
	public void setPp_type(String value) {
		this.pp_type = value;
	}
	
	public String getPp_type() {
		return pp_type;
	}
	
	public void setPp_nationality(String value) {
		this.pp_nationality = value;
	}
	
	public String getPp_nationality() {
		return pp_nationality;
	}
	
	public void setPp_passport_no(String value) {
		this.pp_passport_no = value;
	}
	
	public String getPp_passport_no() {
		return pp_passport_no;
	}
	
	public void setPp_surname(String value) {
		this.pp_surname = value;
	}
	
	public String getPp_surname() {
		return pp_surname;
	}
	
	public void setPp_given_names(String value) {
		this.pp_given_names = value;
	}
	
	public String getPp_given_names() {
		return pp_given_names;
	}
	
	public void setPp_date_of_birth(java.util.Date value) {
		this.pp_date_of_birth = value;
	}
	
	public java.util.Date getPp_date_of_birth() {
		return pp_date_of_birth;
	}
	
	public void setPp_profession(String value) {
		this.pp_profession = value;
	}
	
	public String getPp_profession() {
		return pp_profession;
	}
	
	public void setPp_sex(String value) {
		this.pp_sex = value;
	}
	
	public String getPp_sex() {
		return pp_sex;
	}
	
	public void setPp_place_of_birth(String value) {
		this.pp_place_of_birth = value;
	}
	
	public String getPp_place_of_birth() {
		return pp_place_of_birth;
	}
	
	public void setPp_date_of_issue(java.util.Date value) {
		this.pp_date_of_issue = value;
	}
	
	public java.util.Date getPp_date_of_issue() {
		return pp_date_of_issue;
	}
	
	public void setPp_date_of_expiry(java.util.Date value) {
		this.pp_date_of_expiry = value;
	}
	
	public java.util.Date getPp_date_of_expiry() {
		return pp_date_of_expiry;
	}
	
	public void setJoin_date(java.util.Date value) {
		this.join_date = value;
	}
	
	public java.util.Date getJoin_date() {
		return join_date;
	}
	
	public void setAdd_date(java.sql.Timestamp value) {
		this.add_date = value;
	}
	
	public java.sql.Timestamp getAdd_date() {
		return add_date;
	}
	
	public void setEdit_date(java.sql.Timestamp value) {
		this.edit_date = value;
	}
	
	public java.sql.Timestamp getEdit_date() {
		return edit_date;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setExit_date(java.util.Date value) {
		this.exit_date = value;
	}
	
	public java.util.Date getExit_date() {
		return exit_date;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPp_issuedby(String value) {
		this.pp_issuedby = value;
	}
	
	public String getPp_issuedby() {
		return pp_issuedby;
	}
	
	public void setCabinet_no(int value) {
		setCabinet_no(new Integer(value));
	}
	
	public void setCabinet_no(Integer value) {
		this.cabinet_no = value;
	}
	
	public Integer getCabinet_no() {
		return cabinet_no;
	}
	
	public void setCabinet_section(String value) {
		this.cabinet_section = value;
	}
	
	public String getCabinet_section() {
		return cabinet_section;
	}
	
	public void setSpouse(boolean value) {
		setSpouse(new Boolean(value));
	}
	
	public void setSpouse(Boolean value) {
		this.spouse = value;
	}
	
	public Boolean getSpouse() {
		return spouse;
	}
	
	public void setKid1(boolean value) {
		setKid1(new Boolean(value));
	}
	
	public void setKid1(Boolean value) {
		this.kid1 = value;
	}
	
	public Boolean getKid1() {
		return kid1;
	}
	
	public void setKid2(boolean value) {
		setKid2(new Boolean(value));
	}
	
	public void setKid2(Boolean value) {
		this.kid2 = value;
	}
	
	public Boolean getKid2() {
		return kid2;
	}
	
	public void setSpouse_name(String value) {
		this.spouse_name = value;
	}
	
	public String getSpouse_name() {
		return spouse_name;
	}
	
	public void setSpouse_passport_no(String value) {
		this.spouse_passport_no = value;
	}
	
	public String getSpouse_passport_no() {
		return spouse_passport_no;
	}
	
	public void setSpouse_visa_expiry_date(java.util.Date value) {
		this.spouse_visa_expiry_date = value;
	}
	
	public java.util.Date getSpouse_visa_expiry_date() {
		return spouse_visa_expiry_date;
	}
	
	public void setKid1_name(String value) {
		this.kid1_name = value;
	}
	
	public String getKid1_name() {
		return kid1_name;
	}
	
	public void setKid1_passport_no(String value) {
		this.kid1_passport_no = value;
	}
	
	public String getKid1_passport_no() {
		return kid1_passport_no;
	}
	
	public void setKid1_visa_expiry_date(java.util.Date value) {
		this.kid1_visa_expiry_date = value;
	}
	
	public java.util.Date getKid1_visa_expiry_date() {
		return kid1_visa_expiry_date;
	}
	
	public void setKid2_name(String value) {
		this.kid2_name = value;
	}
	
	public String getKid2_name() {
		return kid2_name;
	}
	
	public void setKid2_passport_no(String value) {
		this.kid2_passport_no = value;
	}
	
	public String getKid2_passport_no() {
		return kid2_passport_no;
	}
	
	public void setKid2_visa_expiry_date(java.util.Date value) {
		this.kid2_visa_expiry_date = value;
	}
	
	public java.util.Date getKid2_visa_expiry_date() {
		return kid2_visa_expiry_date;
	}
	
	public void setContract_start_date(java.util.Date value) {
		this.contract_start_date = value;
	}
	
	public java.util.Date getContract_start_date() {
		return contract_start_date;
	}
	
	public void setContract_end_date(java.util.Date value) {
		this.contract_end_date = value;
	}
	
	public java.util.Date getContract_end_date() {
		return contract_end_date;
	}
	
	public void setPhone1(String value) {
		this.phone1 = value;
	}
	
	public String getPhone1() {
		return phone1;
	}
	
	public void setPhone2(String value) {
		this.phone2 = value;
	}
	
	public String getPhone2() {
		return phone2;
	}
	
	public void setCompany(entityclasses.Company value) {
		this.company = value;
	}
	
	public entityclasses.Company getCompany() {
		return company;
	}
	
	public void setAdd_user(entityclasses.User_detail value) {
		this.add_user = value;
	}
	
	public entityclasses.User_detail getAdd_user() {
		return add_user;
	}
	
	public void setEdit_user(entityclasses.User_detail value) {
		this.edit_user = value;
	}
	
	public entityclasses.User_detail getEdit_user() {
		return edit_user;
	}
	
	public void setAir_ticket_type(entityclasses.Air_ticket_type value) {
		this.air_ticket_type = value;
	}
	
	public entityclasses.Air_ticket_type getAir_ticket_type() {
		return air_ticket_type;
	}
	
	public void setRecruit_agent(entityclasses.Agent value) {
		this.recruit_agent = value;
	}
	
	public entityclasses.Agent getRecruit_agent() {
		return recruit_agent;
	}
	
	public void setStaff_type(entityclasses.Staff_type value) {
		this.staff_type = value;
	}
	
	public entityclasses.Staff_type getStaff_type() {
		return staff_type;
	}
	
	public void setExit_mode(entityclasses.Exit_mode value) {
		this.exit_mode = value;
	}
	
	public entityclasses.Exit_mode getExit_mode() {
		return exit_mode;
	}
	
	public void setAccom_type(entityclasses.Accommodation_type value) {
		this.accom_type = value;
	}
	
	public entityclasses.Accommodation_type getAccom_type() {
		return accom_type;
	}
	
	public void setStaff_post(entityclasses.Staff_post value) {
		this.staff_post = value;
	}
	
	public entityclasses.Staff_post getStaff_post() {
		return staff_post;
	}
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
	}
	
	
	public void setUser_details(java.util.Set value) {
		this.user_details = value;
	}
	
	public java.util.Set getUser_details() {
		return user_details;
	}
	
	
	public void setLeave_transaction(java.util.Set value) {
		this.leave_transaction = value;
	}
	
	public java.util.Set getLeave_transaction() {
		return leave_transaction;
	}
	
	
	public void setLeave_transaction1(java.util.Set value) {
		this.leave_transaction1 = value;
	}
	
	public java.util.Set getLeave_transaction1() {
		return leave_transaction1;
	}
	
	
	public void setCurrent_staff_documents(java.util.Set value) {
		this.current_staff_documents = value;
	}
	
	public java.util.Set getCurrent_staff_documents() {
		return current_staff_documents;
	}
	
	
	public void setStaff_salary(java.util.Set value) {
		this.staff_salary = value;
	}
	
	public java.util.Set getStaff_salary() {
		return staff_salary;
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
		return String.valueOf(getStaff_id());
	}
	
}
