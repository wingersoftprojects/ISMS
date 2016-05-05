/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListImmigrationStaffingManagementSystemData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Activity...");
		entityclasses.Activity[] entityclassesActivitys = entityclasses.Activity.listActivityByQuery(null, null);
		int length = Math.min(entityclassesActivitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Activity_document...");
		entityclasses.Activity_document[] entityclassesActivity_documents = entityclasses.Activity_document.listActivity_documentByQuery(null, null);
		length = Math.min(entityclassesActivity_documents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivity_documents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Document_type...");
		entityclasses.Document_type[] entityclassesDocument_types = entityclasses.Document_type.listDocument_typeByQuery(null, null);
		length = Math.min(entityclassesDocument_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesDocument_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Task...");
		entityclasses.Task[] entityclassesTasks = entityclasses.Task.listTaskByQuery(null, null);
		length = Math.min(entityclassesTasks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesTasks[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Activity_cost...");
		entityclasses.Activity_cost[] entityclassesActivity_costs = entityclasses.Activity_cost.listActivity_costByQuery(null, null);
		length = Math.min(entityclassesActivity_costs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivity_costs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Activity_group...");
		entityclasses.Activity_group[] entityclassesActivity_groups = entityclasses.Activity_group.listActivity_groupByQuery(null, null);
		length = Math.min(entityclassesActivity_groups.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivity_groups[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Activity_outcome...");
		entityclasses.Activity_outcome[] entityclassesActivity_outcomes = entityclasses.Activity_outcome.listActivity_outcomeByQuery(null, null);
		length = Math.min(entityclassesActivity_outcomes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivity_outcomes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Outcome...");
		entityclasses.Outcome[] entityclassesOutcomes = entityclasses.Outcome.listOutcomeByQuery(null, null);
		length = Math.min(entityclassesOutcomes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesOutcomes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Staff...");
		entityclasses.Staff[] entityclassesStaffs = entityclasses.Staff.listStaffByQuery(null, null);
		length = Math.min(entityclassesStaffs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesStaffs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Agency...");
		entityclasses.Agency[] entityclassesAgencys = entityclasses.Agency.listAgencyByQuery(null, null);
		length = Math.min(entityclassesAgencys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesAgencys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Agent...");
		entityclasses.Agent[] entityclassesAgents = entityclasses.Agent.listAgentByQuery(null, null);
		length = Math.min(entityclassesAgents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesAgents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User_detail...");
		entityclasses.User_detail[] entityclassesUser_details = entityclasses.User_detail.listUser_detailByQuery(null, null);
		length = Math.min(entityclassesUser_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesUser_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Leave_transaction...");
		entityclasses.Leave_transaction[] entityclassesLeave_transactions = entityclasses.Leave_transaction.listLeave_transactionByQuery(null, null);
		length = Math.min(entityclassesLeave_transactions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesLeave_transactions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fingerprint...");
		entityclasses.Fingerprint[] entityclassesFingerprints = entityclasses.Fingerprint.listFingerprintByQuery(null, null);
		length = Math.min(entityclassesFingerprints.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesFingerprints[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Task_document...");
		entityclasses.Task_document[] entityclassesTask_documents = entityclasses.Task_document.listTask_documentByQuery(null, null);
		length = Math.min(entityclassesTask_documents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesTask_documents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Task_payment...");
		entityclasses.Task_payment[] entityclassesTask_payments = entityclasses.Task_payment.listTask_paymentByQuery(null, null);
		length = Math.min(entityclassesTask_payments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesTask_payments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_detail...");
		entityclasses.Group_detail[] entityclassesGroup_details = entityclasses.Group_detail.listGroup_detailByQuery(null, null);
		length = Math.min(entityclassesGroup_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesGroup_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_right...");
		entityclasses.Group_right[] entityclassesGroup_rights = entityclasses.Group_right.listGroup_rightByQuery(null, null);
		length = Math.min(entityclassesGroup_rights.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesGroup_rights[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_user...");
		entityclasses.Group_user[] entityclassesGroup_users = entityclasses.Group_user.listGroup_userByQuery(null, null);
		length = Math.min(entityclassesGroup_users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesGroup_users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Company...");
		entityclasses.Company[] entityclassesCompanys = entityclasses.Company.listCompanyByQuery(null, null);
		length = Math.min(entityclassesCompanys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesCompanys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Agent_type...");
		entityclasses.Agent_type[] entityclassesAgent_types = entityclasses.Agent_type.listAgent_typeByQuery(null, null);
		length = Math.min(entityclassesAgent_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesAgent_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Approval_type...");
		entityclasses.Approval_type[] entityclassesApproval_types = entityclasses.Approval_type.listApproval_typeByQuery(null, null);
		length = Math.min(entityclassesApproval_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesApproval_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Leave_type...");
		entityclasses.Leave_type[] entityclassesLeave_types = entityclasses.Leave_type.listLeave_typeByQuery(null, null);
		length = Math.min(entityclassesLeave_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesLeave_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Currency_type...");
		entityclasses.Currency_type[] entityclassesCurrency_types = entityclasses.Currency_type.listCurrency_typeByQuery(null, null);
		length = Math.min(entityclassesCurrency_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesCurrency_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Air_ticket_type...");
		entityclasses.Air_ticket_type[] entityclassesAir_ticket_types = entityclasses.Air_ticket_type.listAir_ticket_typeByQuery(null, null);
		length = Math.min(entityclassesAir_ticket_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesAir_ticket_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Staff_type...");
		entityclasses.Staff_type[] entityclassesStaff_types = entityclasses.Staff_type.listStaff_typeByQuery(null, null);
		length = Math.min(entityclassesStaff_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesStaff_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Accommodation_type...");
		entityclasses.Accommodation_type[] entityclassesAccommodation_types = entityclasses.Accommodation_type.listAccommodation_typeByQuery(null, null);
		length = Math.min(entityclassesAccommodation_types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesAccommodation_types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Exit_mode...");
		entityclasses.Exit_mode[] entityclassesExit_modes = entityclasses.Exit_mode.listExit_modeByQuery(null, null);
		length = Math.min(entityclassesExit_modes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesExit_modes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Nationality...");
		entityclasses.Nationality[] entityclassesNationalitys = entityclasses.Nationality.listNationalityByQuery(null, null);
		length = Math.min(entityclassesNationalitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesNationalitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Activity_document_checklist...");
		entityclasses.Activity_document_checklist[] entityclassesActivity_document_checklists = entityclasses.Activity_document_checklist.listActivity_document_checklistByQuery(null, null);
		length = Math.min(entityclassesActivity_document_checklists.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesActivity_document_checklists[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Current_staff_documents...");
		entityclasses.Current_staff_documents[] entityclassesCurrent_staff_documentses = entityclasses.Current_staff_documents.listCurrent_staff_documentsByQuery(null, null);
		length = Math.min(entityclassesCurrent_staff_documentses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesCurrent_staff_documentses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Staff_salary...");
		entityclasses.Staff_salary[] entityclassesStaff_salarys = entityclasses.Staff_salary.listStaff_salaryByQuery(null, null);
		length = Math.min(entityclassesStaff_salarys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesStaff_salarys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Company_contact...");
		entityclasses.Company_contact[] entityclassesCompany_contacts = entityclasses.Company_contact.listCompany_contactByQuery(null, null);
		length = Math.min(entityclassesCompany_contacts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesCompany_contacts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Staff_post...");
		entityclasses.Staff_post[] entityclassesStaff_posts = entityclasses.Staff_post.listStaff_postByQuery(null, null);
		length = Math.min(entityclassesStaff_posts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityclassesStaff_posts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Activity by Criteria...");
		entityclasses.ActivityCriteria lentityclassesActivityCriteria = new entityclasses.ActivityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivityCriteria.activity_id.eq();
		lentityclassesActivityCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity[] entityclassesActivitys = lentityclassesActivityCriteria.listActivity();
		int length =entityclassesActivitys== null ? 0 : Math.min(entityclassesActivitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivitys[i]);
		}
		System.out.println(length + " Activity record(s) retrieved."); 
		
		System.out.println("Listing Activity_document by Criteria...");
		entityclasses.Activity_documentCriteria lentityclassesActivity_documentCriteria = new entityclasses.Activity_documentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivity_documentCriteria.activity_document_id.eq();
		lentityclassesActivity_documentCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity_document[] entityclassesActivity_documents = lentityclassesActivity_documentCriteria.listActivity_document();
		length =entityclassesActivity_documents== null ? 0 : Math.min(entityclassesActivity_documents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivity_documents[i]);
		}
		System.out.println(length + " Activity_document record(s) retrieved."); 
		
		System.out.println("Listing Document_type by Criteria...");
		entityclasses.Document_typeCriteria lentityclassesDocument_typeCriteria = new entityclasses.Document_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesDocument_typeCriteria.document_type_id.eq();
		lentityclassesDocument_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Document_type[] entityclassesDocument_types = lentityclassesDocument_typeCriteria.listDocument_type();
		length =entityclassesDocument_types== null ? 0 : Math.min(entityclassesDocument_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesDocument_types[i]);
		}
		System.out.println(length + " Document_type record(s) retrieved."); 
		
		System.out.println("Listing Task by Criteria...");
		entityclasses.TaskCriteria lentityclassesTaskCriteria = new entityclasses.TaskCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesTaskCriteria.task_id.eq();
		lentityclassesTaskCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Task[] entityclassesTasks = lentityclassesTaskCriteria.listTask();
		length =entityclassesTasks== null ? 0 : Math.min(entityclassesTasks.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesTasks[i]);
		}
		System.out.println(length + " Task record(s) retrieved."); 
		
		System.out.println("Listing Activity_cost by Criteria...");
		entityclasses.Activity_costCriteria lentityclassesActivity_costCriteria = new entityclasses.Activity_costCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivity_costCriteria.activity_cost_id.eq();
		lentityclassesActivity_costCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity_cost[] entityclassesActivity_costs = lentityclassesActivity_costCriteria.listActivity_cost();
		length =entityclassesActivity_costs== null ? 0 : Math.min(entityclassesActivity_costs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivity_costs[i]);
		}
		System.out.println(length + " Activity_cost record(s) retrieved."); 
		
		System.out.println("Listing Activity_group by Criteria...");
		entityclasses.Activity_groupCriteria lentityclassesActivity_groupCriteria = new entityclasses.Activity_groupCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivity_groupCriteria.activity_group_id.eq();
		lentityclassesActivity_groupCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity_group[] entityclassesActivity_groups = lentityclassesActivity_groupCriteria.listActivity_group();
		length =entityclassesActivity_groups== null ? 0 : Math.min(entityclassesActivity_groups.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivity_groups[i]);
		}
		System.out.println(length + " Activity_group record(s) retrieved."); 
		
		System.out.println("Listing Activity_outcome by Criteria...");
		entityclasses.Activity_outcomeCriteria lentityclassesActivity_outcomeCriteria = new entityclasses.Activity_outcomeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivity_outcomeCriteria.activity_outcome_id.eq();
		lentityclassesActivity_outcomeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity_outcome[] entityclassesActivity_outcomes = lentityclassesActivity_outcomeCriteria.listActivity_outcome();
		length =entityclassesActivity_outcomes== null ? 0 : Math.min(entityclassesActivity_outcomes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivity_outcomes[i]);
		}
		System.out.println(length + " Activity_outcome record(s) retrieved."); 
		
		System.out.println("Listing Outcome by Criteria...");
		entityclasses.OutcomeCriteria lentityclassesOutcomeCriteria = new entityclasses.OutcomeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesOutcomeCriteria.outcome_id.eq();
		lentityclassesOutcomeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Outcome[] entityclassesOutcomes = lentityclassesOutcomeCriteria.listOutcome();
		length =entityclassesOutcomes== null ? 0 : Math.min(entityclassesOutcomes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesOutcomes[i]);
		}
		System.out.println(length + " Outcome record(s) retrieved."); 
		
		System.out.println("Listing Staff by Criteria...");
		entityclasses.StaffCriteria lentityclassesStaffCriteria = new entityclasses.StaffCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesStaffCriteria.staff_id.eq();
		lentityclassesStaffCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Staff[] entityclassesStaffs = lentityclassesStaffCriteria.listStaff();
		length =entityclassesStaffs== null ? 0 : Math.min(entityclassesStaffs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesStaffs[i]);
		}
		System.out.println(length + " Staff record(s) retrieved."); 
		
		System.out.println("Listing Agency by Criteria...");
		entityclasses.AgencyCriteria lentityclassesAgencyCriteria = new entityclasses.AgencyCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesAgencyCriteria.agency_id.eq();
		lentityclassesAgencyCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Agency[] entityclassesAgencys = lentityclassesAgencyCriteria.listAgency();
		length =entityclassesAgencys== null ? 0 : Math.min(entityclassesAgencys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesAgencys[i]);
		}
		System.out.println(length + " Agency record(s) retrieved."); 
		
		System.out.println("Listing Agent by Criteria...");
		entityclasses.AgentCriteria lentityclassesAgentCriteria = new entityclasses.AgentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesAgentCriteria.agent_id.eq();
		lentityclassesAgentCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Agent[] entityclassesAgents = lentityclassesAgentCriteria.listAgent();
		length =entityclassesAgents== null ? 0 : Math.min(entityclassesAgents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesAgents[i]);
		}
		System.out.println(length + " Agent record(s) retrieved."); 
		
		System.out.println("Listing User_detail by Criteria...");
		entityclasses.User_detailCriteria lentityclassesUser_detailCriteria = new entityclasses.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesUser_detailCriteria.user_detail_id.eq();
		lentityclassesUser_detailCriteria.setMaxResults(ROW_COUNT);
		entityclasses.User_detail[] entityclassesUser_details = lentityclassesUser_detailCriteria.listUser_detail();
		length =entityclassesUser_details== null ? 0 : Math.min(entityclassesUser_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesUser_details[i]);
		}
		System.out.println(length + " User_detail record(s) retrieved."); 
		
		System.out.println("Listing Leave_transaction by Criteria...");
		entityclasses.Leave_transactionCriteria lentityclassesLeave_transactionCriteria = new entityclasses.Leave_transactionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesLeave_transactionCriteria.leave_transaction_id.eq();
		lentityclassesLeave_transactionCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Leave_transaction[] entityclassesLeave_transactions = lentityclassesLeave_transactionCriteria.listLeave_transaction();
		length =entityclassesLeave_transactions== null ? 0 : Math.min(entityclassesLeave_transactions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesLeave_transactions[i]);
		}
		System.out.println(length + " Leave_transaction record(s) retrieved."); 
		
		System.out.println("Listing Fingerprint by Criteria...");
		entityclasses.FingerprintCriteria lentityclassesFingerprintCriteria = new entityclasses.FingerprintCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesFingerprintCriteria.fingerprint_id.eq();
		lentityclassesFingerprintCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Fingerprint[] entityclassesFingerprints = lentityclassesFingerprintCriteria.listFingerprint();
		length =entityclassesFingerprints== null ? 0 : Math.min(entityclassesFingerprints.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesFingerprints[i]);
		}
		System.out.println(length + " Fingerprint record(s) retrieved."); 
		
		System.out.println("Listing Task_document by Criteria...");
		entityclasses.Task_documentCriteria lentityclassesTask_documentCriteria = new entityclasses.Task_documentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesTask_documentCriteria.task_document_id.eq();
		lentityclassesTask_documentCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Task_document[] entityclassesTask_documents = lentityclassesTask_documentCriteria.listTask_document();
		length =entityclassesTask_documents== null ? 0 : Math.min(entityclassesTask_documents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesTask_documents[i]);
		}
		System.out.println(length + " Task_document record(s) retrieved."); 
		
		System.out.println("Listing Task_payment by Criteria...");
		entityclasses.Task_paymentCriteria lentityclassesTask_paymentCriteria = new entityclasses.Task_paymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesTask_paymentCriteria.task_payment_id.eq();
		lentityclassesTask_paymentCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Task_payment[] entityclassesTask_payments = lentityclassesTask_paymentCriteria.listTask_payment();
		length =entityclassesTask_payments== null ? 0 : Math.min(entityclassesTask_payments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesTask_payments[i]);
		}
		System.out.println(length + " Task_payment record(s) retrieved."); 
		
		System.out.println("Listing Group_detail by Criteria...");
		entityclasses.Group_detailCriteria lentityclassesGroup_detailCriteria = new entityclasses.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesGroup_detailCriteria.group_detail_id.eq();
		lentityclassesGroup_detailCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Group_detail[] entityclassesGroup_details = lentityclassesGroup_detailCriteria.listGroup_detail();
		length =entityclassesGroup_details== null ? 0 : Math.min(entityclassesGroup_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesGroup_details[i]);
		}
		System.out.println(length + " Group_detail record(s) retrieved."); 
		
		System.out.println("Listing Group_right by Criteria...");
		entityclasses.Group_rightCriteria lentityclassesGroup_rightCriteria = new entityclasses.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesGroup_rightCriteria.group_right_id.eq();
		lentityclassesGroup_rightCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Group_right[] entityclassesGroup_rights = lentityclassesGroup_rightCriteria.listGroup_right();
		length =entityclassesGroup_rights== null ? 0 : Math.min(entityclassesGroup_rights.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesGroup_rights[i]);
		}
		System.out.println(length + " Group_right record(s) retrieved."); 
		
		System.out.println("Listing Group_user by Criteria...");
		entityclasses.Group_userCriteria lentityclassesGroup_userCriteria = new entityclasses.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesGroup_userCriteria.group_user_id.eq();
		lentityclassesGroup_userCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Group_user[] entityclassesGroup_users = lentityclassesGroup_userCriteria.listGroup_user();
		length =entityclassesGroup_users== null ? 0 : Math.min(entityclassesGroup_users.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesGroup_users[i]);
		}
		System.out.println(length + " Group_user record(s) retrieved."); 
		
		System.out.println("Listing Company by Criteria...");
		entityclasses.CompanyCriteria lentityclassesCompanyCriteria = new entityclasses.CompanyCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesCompanyCriteria.company_id.eq();
		lentityclassesCompanyCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Company[] entityclassesCompanys = lentityclassesCompanyCriteria.listCompany();
		length =entityclassesCompanys== null ? 0 : Math.min(entityclassesCompanys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesCompanys[i]);
		}
		System.out.println(length + " Company record(s) retrieved."); 
		
		System.out.println("Listing Agent_type by Criteria...");
		entityclasses.Agent_typeCriteria lentityclassesAgent_typeCriteria = new entityclasses.Agent_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesAgent_typeCriteria.agent_type_id.eq();
		lentityclassesAgent_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Agent_type[] entityclassesAgent_types = lentityclassesAgent_typeCriteria.listAgent_type();
		length =entityclassesAgent_types== null ? 0 : Math.min(entityclassesAgent_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesAgent_types[i]);
		}
		System.out.println(length + " Agent_type record(s) retrieved."); 
		
		System.out.println("Listing Approval_type by Criteria...");
		entityclasses.Approval_typeCriteria lentityclassesApproval_typeCriteria = new entityclasses.Approval_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesApproval_typeCriteria.approval_type_id.eq();
		lentityclassesApproval_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Approval_type[] entityclassesApproval_types = lentityclassesApproval_typeCriteria.listApproval_type();
		length =entityclassesApproval_types== null ? 0 : Math.min(entityclassesApproval_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesApproval_types[i]);
		}
		System.out.println(length + " Approval_type record(s) retrieved."); 
		
		System.out.println("Listing Leave_type by Criteria...");
		entityclasses.Leave_typeCriteria lentityclassesLeave_typeCriteria = new entityclasses.Leave_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesLeave_typeCriteria.leave_type_id.eq();
		lentityclassesLeave_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Leave_type[] entityclassesLeave_types = lentityclassesLeave_typeCriteria.listLeave_type();
		length =entityclassesLeave_types== null ? 0 : Math.min(entityclassesLeave_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesLeave_types[i]);
		}
		System.out.println(length + " Leave_type record(s) retrieved."); 
		
		System.out.println("Listing Currency_type by Criteria...");
		entityclasses.Currency_typeCriteria lentityclassesCurrency_typeCriteria = new entityclasses.Currency_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesCurrency_typeCriteria.currency_type_id.eq();
		lentityclassesCurrency_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Currency_type[] entityclassesCurrency_types = lentityclassesCurrency_typeCriteria.listCurrency_type();
		length =entityclassesCurrency_types== null ? 0 : Math.min(entityclassesCurrency_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesCurrency_types[i]);
		}
		System.out.println(length + " Currency_type record(s) retrieved."); 
		
		System.out.println("Listing Air_ticket_type by Criteria...");
		entityclasses.Air_ticket_typeCriteria lentityclassesAir_ticket_typeCriteria = new entityclasses.Air_ticket_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesAir_ticket_typeCriteria.air_ticket_type_id.eq();
		lentityclassesAir_ticket_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Air_ticket_type[] entityclassesAir_ticket_types = lentityclassesAir_ticket_typeCriteria.listAir_ticket_type();
		length =entityclassesAir_ticket_types== null ? 0 : Math.min(entityclassesAir_ticket_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesAir_ticket_types[i]);
		}
		System.out.println(length + " Air_ticket_type record(s) retrieved."); 
		
		System.out.println("Listing Staff_type by Criteria...");
		entityclasses.Staff_typeCriteria lentityclassesStaff_typeCriteria = new entityclasses.Staff_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesStaff_typeCriteria.staff_type_id.eq();
		lentityclassesStaff_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Staff_type[] entityclassesStaff_types = lentityclassesStaff_typeCriteria.listStaff_type();
		length =entityclassesStaff_types== null ? 0 : Math.min(entityclassesStaff_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesStaff_types[i]);
		}
		System.out.println(length + " Staff_type record(s) retrieved."); 
		
		System.out.println("Listing Accommodation_type by Criteria...");
		entityclasses.Accommodation_typeCriteria lentityclassesAccommodation_typeCriteria = new entityclasses.Accommodation_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesAccommodation_typeCriteria.accommodation_type_id.eq();
		lentityclassesAccommodation_typeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Accommodation_type[] entityclassesAccommodation_types = lentityclassesAccommodation_typeCriteria.listAccommodation_type();
		length =entityclassesAccommodation_types== null ? 0 : Math.min(entityclassesAccommodation_types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesAccommodation_types[i]);
		}
		System.out.println(length + " Accommodation_type record(s) retrieved."); 
		
		System.out.println("Listing Exit_mode by Criteria...");
		entityclasses.Exit_modeCriteria lentityclassesExit_modeCriteria = new entityclasses.Exit_modeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesExit_modeCriteria.exit_mode_id.eq();
		lentityclassesExit_modeCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Exit_mode[] entityclassesExit_modes = lentityclassesExit_modeCriteria.listExit_mode();
		length =entityclassesExit_modes== null ? 0 : Math.min(entityclassesExit_modes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesExit_modes[i]);
		}
		System.out.println(length + " Exit_mode record(s) retrieved."); 
		
		System.out.println("Listing Nationality by Criteria...");
		entityclasses.NationalityCriteria lentityclassesNationalityCriteria = new entityclasses.NationalityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesNationalityCriteria.nationality_id.eq();
		lentityclassesNationalityCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Nationality[] entityclassesNationalitys = lentityclassesNationalityCriteria.listNationality();
		length =entityclassesNationalitys== null ? 0 : Math.min(entityclassesNationalitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesNationalitys[i]);
		}
		System.out.println(length + " Nationality record(s) retrieved."); 
		
		System.out.println("Listing Activity_document_checklist by Criteria...");
		entityclasses.Activity_document_checklistCriteria lentityclassesActivity_document_checklistCriteria = new entityclasses.Activity_document_checklistCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesActivity_document_checklistCriteria.activity_document_checklist_id.eq();
		lentityclassesActivity_document_checklistCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Activity_document_checklist[] entityclassesActivity_document_checklists = lentityclassesActivity_document_checklistCriteria.listActivity_document_checklist();
		length =entityclassesActivity_document_checklists== null ? 0 : Math.min(entityclassesActivity_document_checklists.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesActivity_document_checklists[i]);
		}
		System.out.println(length + " Activity_document_checklist record(s) retrieved."); 
		
		System.out.println("Listing Current_staff_documents by Criteria...");
		entityclasses.Current_staff_documentsCriteria lentityclassesCurrent_staff_documentsCriteria = new entityclasses.Current_staff_documentsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesCurrent_staff_documentsCriteria.current_staff_documents_id.eq();
		lentityclassesCurrent_staff_documentsCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Current_staff_documents[] entityclassesCurrent_staff_documentses = lentityclassesCurrent_staff_documentsCriteria.listCurrent_staff_documents();
		length =entityclassesCurrent_staff_documentses== null ? 0 : Math.min(entityclassesCurrent_staff_documentses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesCurrent_staff_documentses[i]);
		}
		System.out.println(length + " Current_staff_documents record(s) retrieved."); 
		
		System.out.println("Listing Staff_salary by Criteria...");
		entityclasses.Staff_salaryCriteria lentityclassesStaff_salaryCriteria = new entityclasses.Staff_salaryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesStaff_salaryCriteria.staff_salary_id.eq();
		lentityclassesStaff_salaryCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Staff_salary[] entityclassesStaff_salarys = lentityclassesStaff_salaryCriteria.listStaff_salary();
		length =entityclassesStaff_salarys== null ? 0 : Math.min(entityclassesStaff_salarys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesStaff_salarys[i]);
		}
		System.out.println(length + " Staff_salary record(s) retrieved."); 
		
		System.out.println("Listing Company_contact by Criteria...");
		entityclasses.Company_contactCriteria lentityclassesCompany_contactCriteria = new entityclasses.Company_contactCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesCompany_contactCriteria.company_contact_id.eq();
		lentityclassesCompany_contactCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Company_contact[] entityclassesCompany_contacts = lentityclassesCompany_contactCriteria.listCompany_contact();
		length =entityclassesCompany_contacts== null ? 0 : Math.min(entityclassesCompany_contacts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesCompany_contacts[i]);
		}
		System.out.println(length + " Company_contact record(s) retrieved."); 
		
		System.out.println("Listing Staff_post by Criteria...");
		entityclasses.Staff_postCriteria lentityclassesStaff_postCriteria = new entityclasses.Staff_postCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentityclassesStaff_postCriteria.staff_post_id.eq();
		lentityclassesStaff_postCriteria.setMaxResults(ROW_COUNT);
		entityclasses.Staff_post[] entityclassesStaff_posts = lentityclassesStaff_postCriteria.listStaff_post();
		length =entityclassesStaff_posts== null ? 0 : Math.min(entityclassesStaff_posts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityclassesStaff_posts[i]);
		}
		System.out.println(length + " Staff_post record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListImmigrationStaffingManagementSystemData listImmigrationStaffingManagementSystemData = new ListImmigrationStaffingManagementSystemData();
			try {
				listImmigrationStaffingManagementSystemData.listTestData();
				//listImmigrationStaffingManagementSystemData.listByCriteria();
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
