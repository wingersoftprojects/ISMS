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

public class StaffDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public StaffDetachedCriteria() {
		super(entityclasses.Staff.class, entityclasses.StaffCriteria.class);
		staff_id = new IntegerExpression("staff_id", this.getDetachedCriteria());
		staff_typeId = new IntegerExpression("staff_type.staff_type_id", this.getDetachedCriteria());
		staff_type = new AssociationExpression("staff_type", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		leave_days = new IntegerExpression("leave_days", this.getDetachedCriteria());
		pp_type = new StringExpression("pp_type", this.getDetachedCriteria());
		pp_nationality = new StringExpression("pp_nationality", this.getDetachedCriteria());
		pp_passport_no = new StringExpression("pp_passport_no", this.getDetachedCriteria());
		pp_surname = new StringExpression("pp_surname", this.getDetachedCriteria());
		pp_given_names = new StringExpression("pp_given_names", this.getDetachedCriteria());
		pp_issuedby = new StringExpression("pp_issuedby", this.getDetachedCriteria());
		pp_date_of_birth = new DateExpression("pp_date_of_birth", this.getDetachedCriteria());
		pp_profession = new StringExpression("pp_profession", this.getDetachedCriteria());
		pp_sex = new StringExpression("pp_sex", this.getDetachedCriteria());
		pp_place_of_birth = new StringExpression("pp_place_of_birth", this.getDetachedCriteria());
		pp_date_of_issue = new DateExpression("pp_date_of_issue", this.getDetachedCriteria());
		pp_date_of_expiry = new DateExpression("pp_date_of_expiry", this.getDetachedCriteria());
		staff_postId = new IntegerExpression("staff_post.staff_post_id", this.getDetachedCriteria());
		staff_post = new AssociationExpression("staff_post", this.getDetachedCriteria());
		join_date = new DateExpression("join_date", this.getDetachedCriteria());
		recruit_agentId = new IntegerExpression("recruit_agent.agent_id", this.getDetachedCriteria());
		recruit_agent = new AssociationExpression("recruit_agent", this.getDetachedCriteria());
		air_ticket_typeId = new IntegerExpression("air_ticket_type.air_ticket_type_id", this.getDetachedCriteria());
		air_ticket_type = new AssociationExpression("air_ticket_type", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		exit_date = new DateExpression("exit_date", this.getDetachedCriteria());
		exit_modeId = new IntegerExpression("exit_mode.exit_mode_id", this.getDetachedCriteria());
		exit_mode = new AssociationExpression("exit_mode", this.getDetachedCriteria());
		accom_typeId = new IntegerExpression("accom_type.accommodation_type_id", this.getDetachedCriteria());
		accom_type = new AssociationExpression("accom_type", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		cabinet_no = new IntegerExpression("cabinet_no", this.getDetachedCriteria());
		cabinet_section = new StringExpression("cabinet_section", this.getDetachedCriteria());
		spouse = new BooleanExpression("spouse", this.getDetachedCriteria());
		kid1 = new BooleanExpression("kid1", this.getDetachedCriteria());
		kid2 = new BooleanExpression("kid2", this.getDetachedCriteria());
		spouse_name = new StringExpression("spouse_name", this.getDetachedCriteria());
		spouse_passport_no = new StringExpression("spouse_passport_no", this.getDetachedCriteria());
		spouse_visa_expiry_date = new DateExpression("spouse_visa_expiry_date", this.getDetachedCriteria());
		kid1_name = new StringExpression("kid1_name", this.getDetachedCriteria());
		kid1_passport_no = new StringExpression("kid1_passport_no", this.getDetachedCriteria());
		kid1_visa_expiry_date = new DateExpression("kid1_visa_expiry_date", this.getDetachedCriteria());
		kid2_name = new StringExpression("kid2_name", this.getDetachedCriteria());
		kid2_passport_no = new StringExpression("kid2_passport_no", this.getDetachedCriteria());
		kid2_visa_expiry_date = new DateExpression("kid2_visa_expiry_date", this.getDetachedCriteria());
		contract_start_date = new DateExpression("contract_start_date", this.getDetachedCriteria());
		contract_end_date = new DateExpression("contract_end_date", this.getDetachedCriteria());
		phone1 = new StringExpression("phone1", this.getDetachedCriteria());
		phone2 = new StringExpression("phone2", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		user_details = new CollectionExpression("user_details", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
		leave_transaction1 = new CollectionExpression("leave_transaction1", this.getDetachedCriteria());
		current_staff_documents = new CollectionExpression("current_staff_documents", this.getDetachedCriteria());
		staff_salary = new CollectionExpression("staff_salary", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.StaffCriteria.class);
		staff_id = new IntegerExpression("staff_id", this.getDetachedCriteria());
		staff_typeId = new IntegerExpression("staff_type.staff_type_id", this.getDetachedCriteria());
		staff_type = new AssociationExpression("staff_type", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		leave_days = new IntegerExpression("leave_days", this.getDetachedCriteria());
		pp_type = new StringExpression("pp_type", this.getDetachedCriteria());
		pp_nationality = new StringExpression("pp_nationality", this.getDetachedCriteria());
		pp_passport_no = new StringExpression("pp_passport_no", this.getDetachedCriteria());
		pp_surname = new StringExpression("pp_surname", this.getDetachedCriteria());
		pp_given_names = new StringExpression("pp_given_names", this.getDetachedCriteria());
		pp_issuedby = new StringExpression("pp_issuedby", this.getDetachedCriteria());
		pp_date_of_birth = new DateExpression("pp_date_of_birth", this.getDetachedCriteria());
		pp_profession = new StringExpression("pp_profession", this.getDetachedCriteria());
		pp_sex = new StringExpression("pp_sex", this.getDetachedCriteria());
		pp_place_of_birth = new StringExpression("pp_place_of_birth", this.getDetachedCriteria());
		pp_date_of_issue = new DateExpression("pp_date_of_issue", this.getDetachedCriteria());
		pp_date_of_expiry = new DateExpression("pp_date_of_expiry", this.getDetachedCriteria());
		staff_postId = new IntegerExpression("staff_post.staff_post_id", this.getDetachedCriteria());
		staff_post = new AssociationExpression("staff_post", this.getDetachedCriteria());
		join_date = new DateExpression("join_date", this.getDetachedCriteria());
		recruit_agentId = new IntegerExpression("recruit_agent.agent_id", this.getDetachedCriteria());
		recruit_agent = new AssociationExpression("recruit_agent", this.getDetachedCriteria());
		air_ticket_typeId = new IntegerExpression("air_ticket_type.air_ticket_type_id", this.getDetachedCriteria());
		air_ticket_type = new AssociationExpression("air_ticket_type", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_userId = new IntegerExpression("add_user.user_detail_id", this.getDetachedCriteria());
		add_user = new AssociationExpression("add_user", this.getDetachedCriteria());
		edit_date = new TimestampExpression("edit_date", this.getDetachedCriteria());
		edit_userId = new IntegerExpression("edit_user.user_detail_id", this.getDetachedCriteria());
		edit_user = new AssociationExpression("edit_user", this.getDetachedCriteria());
		is_active = new StringExpression("is_active", this.getDetachedCriteria());
		exit_date = new DateExpression("exit_date", this.getDetachedCriteria());
		exit_modeId = new IntegerExpression("exit_mode.exit_mode_id", this.getDetachedCriteria());
		exit_mode = new AssociationExpression("exit_mode", this.getDetachedCriteria());
		accom_typeId = new IntegerExpression("accom_type.accommodation_type_id", this.getDetachedCriteria());
		accom_type = new AssociationExpression("accom_type", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		cabinet_no = new IntegerExpression("cabinet_no", this.getDetachedCriteria());
		cabinet_section = new StringExpression("cabinet_section", this.getDetachedCriteria());
		spouse = new BooleanExpression("spouse", this.getDetachedCriteria());
		kid1 = new BooleanExpression("kid1", this.getDetachedCriteria());
		kid2 = new BooleanExpression("kid2", this.getDetachedCriteria());
		spouse_name = new StringExpression("spouse_name", this.getDetachedCriteria());
		spouse_passport_no = new StringExpression("spouse_passport_no", this.getDetachedCriteria());
		spouse_visa_expiry_date = new DateExpression("spouse_visa_expiry_date", this.getDetachedCriteria());
		kid1_name = new StringExpression("kid1_name", this.getDetachedCriteria());
		kid1_passport_no = new StringExpression("kid1_passport_no", this.getDetachedCriteria());
		kid1_visa_expiry_date = new DateExpression("kid1_visa_expiry_date", this.getDetachedCriteria());
		kid2_name = new StringExpression("kid2_name", this.getDetachedCriteria());
		kid2_passport_no = new StringExpression("kid2_passport_no", this.getDetachedCriteria());
		kid2_visa_expiry_date = new DateExpression("kid2_visa_expiry_date", this.getDetachedCriteria());
		contract_start_date = new DateExpression("contract_start_date", this.getDetachedCriteria());
		contract_end_date = new DateExpression("contract_end_date", this.getDetachedCriteria());
		phone1 = new StringExpression("phone1", this.getDetachedCriteria());
		phone2 = new StringExpression("phone2", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		user_details = new CollectionExpression("user_details", this.getDetachedCriteria());
		leave_transaction = new CollectionExpression("leave_transaction", this.getDetachedCriteria());
		leave_transaction1 = new CollectionExpression("leave_transaction1", this.getDetachedCriteria());
		current_staff_documents = new CollectionExpression("current_staff_documents", this.getDetachedCriteria());
		staff_salary = new CollectionExpression("staff_salary", this.getDetachedCriteria());
	}
	
	public Staff_typeDetachedCriteria createStaff_typeCriteria() {
		return new Staff_typeDetachedCriteria(createCriteria("staff_type"));
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Staff_postDetachedCriteria createStaff_postCriteria() {
		return new Staff_postDetachedCriteria(createCriteria("staff_post"));
	}
	
	public AgentDetachedCriteria createRecruit_agentCriteria() {
		return new AgentDetachedCriteria(createCriteria("recruit_agent"));
	}
	
	public Air_ticket_typeDetachedCriteria createAir_ticket_typeCriteria() {
		return new Air_ticket_typeDetachedCriteria(createCriteria("air_ticket_type"));
	}
	
	public User_detailDetachedCriteria createAdd_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("add_user"));
	}
	
	public User_detailDetachedCriteria createEdit_userCriteria() {
		return new User_detailDetachedCriteria(createCriteria("edit_user"));
	}
	
	public Exit_modeDetachedCriteria createExit_modeCriteria() {
		return new Exit_modeDetachedCriteria(createCriteria("exit_mode"));
	}
	
	public Accommodation_typeDetachedCriteria createAccom_typeCriteria() {
		return new Accommodation_typeDetachedCriteria(createCriteria("accom_type"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public User_detailDetachedCriteria createUser_detailsCriteria() {
		return new User_detailDetachedCriteria(createCriteria("user_details"));
	}
	
	public Leave_transactionDetachedCriteria createLeave_transactionCriteria() {
		return new Leave_transactionDetachedCriteria(createCriteria("leave_transaction"));
	}
	
	public Leave_transactionDetachedCriteria createLeave_transaction1Criteria() {
		return new Leave_transactionDetachedCriteria(createCriteria("leave_transaction1"));
	}
	
	public Current_staff_documentsDetachedCriteria createCurrent_staff_documentsCriteria() {
		return new Current_staff_documentsDetachedCriteria(createCriteria("current_staff_documents"));
	}
	
	public Staff_salaryDetachedCriteria createStaff_salaryCriteria() {
		return new Staff_salaryDetachedCriteria(createCriteria("staff_salary"));
	}
	
	public Staff uniqueStaff(PersistentSession session) {
		return (Staff) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff[] listStaff(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff[]) list.toArray(new Staff[list.size()]);
	}
}

