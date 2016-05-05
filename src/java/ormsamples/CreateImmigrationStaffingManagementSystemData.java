/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateImmigrationStaffingManagementSystemData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = entityclasses.ISMSPersistentManager.instance().getSession().beginTransaction();
		try {
			entityclasses.Activity lentityclassesActivity = entityclasses.Activity.createActivity();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activity_document_checklist, task, activity_group, activity_outcome, activity_cost, activity_document, add_user, add_date, is_approval_required, flag_after, duration, is_final, is_start, activity_name
			lentityclassesActivity.save();
			entityclasses.Activity_document lentityclassesActivity_document = entityclasses.Activity_document.createActivity_document();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, direction, is_mandatory, document_type, activity
			lentityclassesActivity_document.save();
			entityclasses.Document_type lentityclassesDocument_type = entityclasses.Document_type.createDocument_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : current_staff_documents, activity_document_checklist, task_document, activity_document, is_active, is_renewable, doc_type_name
			lentityclassesDocument_type.save();
			entityclasses.Task lentityclassesTask = entityclasses.Task.createTask();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : task_payment, add_user, add_date, assigned_user, staff, task_status, activity
			lentityclassesTask.save();
			entityclasses.Activity_cost lentityclassesActivity_cost = entityclasses.Activity_cost.createActivity_cost();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, cost_value, cost_name, activity
			lentityclassesActivity_cost.save();
			entityclasses.Activity_group lentityclassesActivity_group = entityclasses.Activity_group.createActivity_group();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_detail, activity
			lentityclassesActivity_group.save();
			entityclasses.Activity_outcome lentityclassesActivity_outcome = entityclasses.Activity_outcome.createActivity_outcome();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activity_outcome_name, outcome, activity
			lentityclassesActivity_outcome.save();
			entityclasses.Outcome lentityclassesOutcome = entityclasses.Outcome.createOutcome();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activity_outcome, outcome_name
			lentityclassesOutcome.save();
			entityclasses.Staff lentityclassesStaff = entityclasses.Staff.createStaff();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : staff_salary, current_staff_documents, leave_transaction1, leave_transaction, task, is_active, add_user, add_date, pp_sex, pp_date_of_birth, pp_issuedby, pp_given_names, pp_surname, pp_passport_no, company
			lentityclassesStaff.save();
			entityclasses.Agency lentityclassesAgency = entityclasses.Agency.createAgency();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : agent, is_active, agency_name
			lentityclassesAgency.save();
			entityclasses.Agent lentityclassesAgent = entityclasses.Agent.createAgent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : add_user, add_date, agent_type, agent_other_names, agent_surname, agency
			lentityclassesAgent.save();
			entityclasses.User_detail lentityclassesUser_detail = entityclasses.User_detail.createUser_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : leave_transaction1, task1, agent, task_document, staff1, company1, group_right, activity, task, group_user, add_date, is_active, is_general_admin, password, username
			lentityclassesUser_detail.save();
			entityclasses.Leave_transaction lentityclassesLeave_transaction = entityclasses.Leave_transaction.createLeave_transaction();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : add_user, add_date, leave_type, approved_by, start_date, days_taken, staff
			lentityclassesLeave_transaction.save();
			entityclasses.Fingerprint lentityclassesFingerprint = entityclasses.Fingerprint.createFingerprint();
			// Initialize the properties of the persistent object here
			lentityclassesFingerprint.save();
			entityclasses.Task_document lentityclassesTask_document = entityclasses.Task_document.createTask_document();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : current_staff_documents, add_user, add_date, document_type
			lentityclassesTask_document.save();
			entityclasses.Task_payment lentityclassesTask_payment = entityclasses.Task_payment.createTask_payment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paid_for, paid_amount, task
			lentityclassesTask_payment.save();
			entityclasses.Group_detail lentityclassesGroup_detail = entityclasses.Group_detail.createGroup_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_right, group_user, activity_group, is_active, group_name
			lentityclassesGroup_detail.save();
			entityclasses.Group_right lentityclassesGroup_right = entityclasses.Group_right.createGroup_right();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : add_user, add_date, allow_delete, allow_edit, allow_add, allow_view, function_name, group_detail
			lentityclassesGroup_right.save();
			entityclasses.Group_user lentityclassesGroup_user = entityclasses.Group_user.createGroup_user();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user_detail, group_detail
			lentityclassesGroup_user.save();
			entityclasses.Company lentityclassesCompany = entityclasses.Company.createCompany();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : company_contact, staff, add_user, add_date, is_active, company_name
			lentityclassesCompany.save();
			entityclasses.Agent_type lentityclassesAgent_type = entityclasses.Agent_type.createAgent_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : agent, agent_type_name
			lentityclassesAgent_type.save();
			entityclasses.Approval_type lentityclassesApproval_type = entityclasses.Approval_type.createApproval_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : approval_type_name
			lentityclassesApproval_type.save();
			entityclasses.Leave_type lentityclassesLeave_type = entityclasses.Leave_type.createLeave_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : leave_transaction, leave_type_name
			lentityclassesLeave_type.save();
			entityclasses.Currency_type lentityclassesCurrency_type = entityclasses.Currency_type.createCurrency_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : staff_salary, is_active, currency_type_name
			lentityclassesCurrency_type.save();
			entityclasses.Air_ticket_type lentityclassesAir_ticket_type = entityclasses.Air_ticket_type.createAir_ticket_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, air_ticket_type_name
			lentityclassesAir_ticket_type.save();
			entityclasses.Staff_type lentityclassesStaff_type = entityclasses.Staff_type.createStaff_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, staff_type_name
			lentityclassesStaff_type.save();
			entityclasses.Accommodation_type lentityclassesAccommodation_type = entityclasses.Accommodation_type.createAccommodation_type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, accommodation_type_name
			lentityclassesAccommodation_type.save();
			entityclasses.Exit_mode lentityclassesExit_mode = entityclasses.Exit_mode.createExit_mode();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, exit_mode_name
			lentityclassesExit_mode.save();
			entityclasses.Nationality lentityclassesNationality = entityclasses.Nationality.createNationality();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, nationality_name
			lentityclassesNationality.save();
			entityclasses.Activity_document_checklist lentityclassesActivity_document_checklist = entityclasses.Activity_document_checklist.createActivity_document_checklist();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : document_type, activity
			lentityclassesActivity_document_checklist.save();
			entityclasses.Current_staff_documents lentityclassesCurrent_staff_documents = entityclasses.Current_staff_documents.createCurrent_staff_documents();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : document_type, task_document, staff
			lentityclassesCurrent_staff_documents.save();
			entityclasses.Staff_salary lentityclassesStaff_salary = entityclasses.Staff_salary.createStaff_salary();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : salary, currency_type, staff
			lentityclassesStaff_salary.save();
			entityclasses.Company_contact lentityclassesCompany_contact = entityclasses.Company_contact.createCompany_contact();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : company, contact_title, contact_email, contact_name
			lentityclassesCompany_contact.save();
			entityclasses.Staff_post lentityclassesStaff_post = entityclasses.Staff_post.createStaff_post();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, staff_post_name
			lentityclassesStaff_post.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateImmigrationStaffingManagementSystemData createImmigrationStaffingManagementSystemData = new CreateImmigrationStaffingManagementSystemData();
			try {
				createImmigrationStaffingManagementSystemData.createTestData();
			}
			finally {
				entityclasses.ISMSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
