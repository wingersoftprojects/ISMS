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

public class StaffCriteria extends AbstractORMCriteria {
	public final IntegerExpression staff_id;
	public final IntegerExpression staff_typeId;
	public final AssociationExpression staff_type;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final IntegerExpression leave_days;
	public final StringExpression pp_type;
	public final StringExpression pp_nationality;
	public final StringExpression pp_passport_no;
	public final StringExpression pp_surname;
	public final StringExpression pp_given_names;
	public final StringExpression pp_issuedby;
	public final DateExpression pp_date_of_birth;
	public final StringExpression pp_profession;
	public final StringExpression pp_sex;
	public final StringExpression pp_place_of_birth;
	public final DateExpression pp_date_of_issue;
	public final DateExpression pp_date_of_expiry;
	public final IntegerExpression staff_postId;
	public final AssociationExpression staff_post;
	public final DateExpression join_date;
	public final IntegerExpression recruit_agentId;
	public final AssociationExpression recruit_agent;
	public final IntegerExpression air_ticket_typeId;
	public final AssociationExpression air_ticket_type;
	public final TimestampExpression add_date;
	public final IntegerExpression add_userId;
	public final AssociationExpression add_user;
	public final TimestampExpression edit_date;
	public final IntegerExpression edit_userId;
	public final AssociationExpression edit_user;
	public final StringExpression is_active;
	public final DateExpression exit_date;
	public final IntegerExpression exit_modeId;
	public final AssociationExpression exit_mode;
	public final IntegerExpression accom_typeId;
	public final AssociationExpression accom_type;
	public final StringExpression email;
	public final IntegerExpression cabinet_no;
	public final StringExpression cabinet_section;
	public final BooleanExpression spouse;
	public final BooleanExpression kid1;
	public final BooleanExpression kid2;
	public final StringExpression spouse_name;
	public final StringExpression spouse_passport_no;
	public final DateExpression spouse_visa_expiry_date;
	public final StringExpression kid1_name;
	public final StringExpression kid1_passport_no;
	public final DateExpression kid1_visa_expiry_date;
	public final StringExpression kid2_name;
	public final StringExpression kid2_passport_no;
	public final DateExpression kid2_visa_expiry_date;
	public final DateExpression contract_start_date;
	public final DateExpression contract_end_date;
	public final StringExpression phone1;
	public final StringExpression phone2;
	public final CollectionExpression task;
	public final CollectionExpression user_details;
	public final CollectionExpression leave_transaction;
	public final CollectionExpression leave_transaction1;
	public final CollectionExpression current_staff_documents;
	public final CollectionExpression staff_salary;
	
	public StaffCriteria(Criteria criteria) {
		super(criteria);
		staff_id = new IntegerExpression("staff_id", this);
		staff_typeId = new IntegerExpression("staff_type.staff_type_id", this);
		staff_type = new AssociationExpression("staff_type", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		leave_days = new IntegerExpression("leave_days", this);
		pp_type = new StringExpression("pp_type", this);
		pp_nationality = new StringExpression("pp_nationality", this);
		pp_passport_no = new StringExpression("pp_passport_no", this);
		pp_surname = new StringExpression("pp_surname", this);
		pp_given_names = new StringExpression("pp_given_names", this);
		pp_issuedby = new StringExpression("pp_issuedby", this);
		pp_date_of_birth = new DateExpression("pp_date_of_birth", this);
		pp_profession = new StringExpression("pp_profession", this);
		pp_sex = new StringExpression("pp_sex", this);
		pp_place_of_birth = new StringExpression("pp_place_of_birth", this);
		pp_date_of_issue = new DateExpression("pp_date_of_issue", this);
		pp_date_of_expiry = new DateExpression("pp_date_of_expiry", this);
		staff_postId = new IntegerExpression("staff_post.staff_post_id", this);
		staff_post = new AssociationExpression("staff_post", this);
		join_date = new DateExpression("join_date", this);
		recruit_agentId = new IntegerExpression("recruit_agent.agent_id", this);
		recruit_agent = new AssociationExpression("recruit_agent", this);
		air_ticket_typeId = new IntegerExpression("air_ticket_type.air_ticket_type_id", this);
		air_ticket_type = new AssociationExpression("air_ticket_type", this);
		add_date = new TimestampExpression("add_date", this);
		add_userId = new IntegerExpression("add_user.user_detail_id", this);
		add_user = new AssociationExpression("add_user", this);
		edit_date = new TimestampExpression("edit_date", this);
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this);
		edit_user = new AssociationExpression("edit_user", this);
		is_active = new StringExpression("is_active", this);
		exit_date = new DateExpression("exit_date", this);
		exit_modeId = new IntegerExpression("exit_mode.exit_mode_id", this);
		exit_mode = new AssociationExpression("exit_mode", this);
		accom_typeId = new IntegerExpression("accom_type.accommodation_type_id", this);
		accom_type = new AssociationExpression("accom_type", this);
		email = new StringExpression("email", this);
		cabinet_no = new IntegerExpression("cabinet_no", this);
		cabinet_section = new StringExpression("cabinet_section", this);
		spouse = new BooleanExpression("spouse", this);
		kid1 = new BooleanExpression("kid1", this);
		kid2 = new BooleanExpression("kid2", this);
		spouse_name = new StringExpression("spouse_name", this);
		spouse_passport_no = new StringExpression("spouse_passport_no", this);
		spouse_visa_expiry_date = new DateExpression("spouse_visa_expiry_date", this);
		kid1_name = new StringExpression("kid1_name", this);
		kid1_passport_no = new StringExpression("kid1_passport_no", this);
		kid1_visa_expiry_date = new DateExpression("kid1_visa_expiry_date", this);
		kid2_name = new StringExpression("kid2_name", this);
		kid2_passport_no = new StringExpression("kid2_passport_no", this);
		kid2_visa_expiry_date = new DateExpression("kid2_visa_expiry_date", this);
		contract_start_date = new DateExpression("contract_start_date", this);
		contract_end_date = new DateExpression("contract_end_date", this);
		phone1 = new StringExpression("phone1", this);
		phone2 = new StringExpression("phone2", this);
		task = new CollectionExpression("task", this);
		user_details = new CollectionExpression("user_details", this);
		leave_transaction = new CollectionExpression("leave_transaction", this);
		leave_transaction1 = new CollectionExpression("leave_transaction1", this);
		current_staff_documents = new CollectionExpression("current_staff_documents", this);
		staff_salary = new CollectionExpression("staff_salary", this);
	}
	
	public StaffCriteria(PersistentSession session) {
		this(session.createCriteria(Staff.class));
	}
	
	public StaffCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Staff_typeCriteria createStaff_typeCriteria() {
		return new Staff_typeCriteria(createCriteria("staff_type"));
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Staff_postCriteria createStaff_postCriteria() {
		return new Staff_postCriteria(createCriteria("staff_post"));
	}
	
	public AgentCriteria createRecruit_agentCriteria() {
		return new AgentCriteria(createCriteria("recruit_agent"));
	}
	
	public Air_ticket_typeCriteria createAir_ticket_typeCriteria() {
		return new Air_ticket_typeCriteria(createCriteria("air_ticket_type"));
	}
	
	public User_detailCriteria createAdd_userCriteria() {
		return new User_detailCriteria(createCriteria("add_user"));
	}
	
	public User_detailCriteria createEdit_userCriteria() {
		return new User_detailCriteria(createCriteria("edit_user"));
	}
	
	public Exit_modeCriteria createExit_modeCriteria() {
		return new Exit_modeCriteria(createCriteria("exit_mode"));
	}
	
	public Accommodation_typeCriteria createAccom_typeCriteria() {
		return new Accommodation_typeCriteria(createCriteria("accom_type"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public User_detailCriteria createUser_detailsCriteria() {
		return new User_detailCriteria(createCriteria("user_details"));
	}
	
	public Leave_transactionCriteria createLeave_transactionCriteria() {
		return new Leave_transactionCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_transactionCriteria createLeave_transaction1Criteria() {
		return new Leave_transactionCriteria(createCriteria("leave_transaction1"));
	}
	
	public Current_staff_documentsCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsCriteria(createCriteria("current_staff_documents"));
	}
	
	public Staff_salaryCriteria createStaff_salaryCriteria() {
		return new Staff_salaryCriteria(createCriteria("staff_salary"));
	}
	
	public Staff uniqueStaff() {
		return (Staff) super.uniqueResult();
	}
	
	public Staff[] listStaff() {
		java.util.List list = super.list();
		return (Staff[]) list.toArray(new Staff[list.size()]);
	}
}

