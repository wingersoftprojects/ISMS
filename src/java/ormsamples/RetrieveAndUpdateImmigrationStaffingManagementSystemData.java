/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateImmigrationStaffingManagementSystemData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = entityclasses.ISMSPersistentManager.instance().getSession().beginTransaction();
		try {
			entityclasses.Activity lentityclassesActivity = entityclasses.Activity.loadActivityByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity.save();
			entityclasses.Activity_document lentityclassesActivity_document = entityclasses.Activity_document.loadActivity_documentByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity_document.save();
			entityclasses.Document_type lentityclassesDocument_type = entityclasses.Document_type.loadDocument_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesDocument_type.save();
			entityclasses.Task lentityclassesTask = entityclasses.Task.loadTaskByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesTask.save();
			entityclasses.Activity_cost lentityclassesActivity_cost = entityclasses.Activity_cost.loadActivity_costByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity_cost.save();
			entityclasses.Activity_group lentityclassesActivity_group = entityclasses.Activity_group.loadActivity_groupByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity_group.save();
			entityclasses.Activity_outcome lentityclassesActivity_outcome = entityclasses.Activity_outcome.loadActivity_outcomeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity_outcome.save();
			entityclasses.Outcome lentityclassesOutcome = entityclasses.Outcome.loadOutcomeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesOutcome.save();
			entityclasses.Staff lentityclassesStaff = entityclasses.Staff.loadStaffByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesStaff.save();
			entityclasses.Agency lentityclassesAgency = entityclasses.Agency.loadAgencyByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesAgency.save();
			entityclasses.Agent lentityclassesAgent = entityclasses.Agent.loadAgentByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesAgent.save();
			entityclasses.User_detail lentityclassesUser_detail = entityclasses.User_detail.loadUser_detailByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesUser_detail.save();
			entityclasses.Leave_transaction lentityclassesLeave_transaction = entityclasses.Leave_transaction.loadLeave_transactionByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesLeave_transaction.save();
			entityclasses.Fingerprint lentityclassesFingerprint = entityclasses.Fingerprint.loadFingerprintByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesFingerprint.save();
			entityclasses.Task_document lentityclassesTask_document = entityclasses.Task_document.loadTask_documentByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesTask_document.save();
			entityclasses.Task_payment lentityclassesTask_payment = entityclasses.Task_payment.loadTask_paymentByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesTask_payment.save();
			entityclasses.Group_detail lentityclassesGroup_detail = entityclasses.Group_detail.loadGroup_detailByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesGroup_detail.save();
			entityclasses.Group_right lentityclassesGroup_right = entityclasses.Group_right.loadGroup_rightByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesGroup_right.save();
			entityclasses.Group_user lentityclassesGroup_user = entityclasses.Group_user.loadGroup_userByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesGroup_user.save();
			entityclasses.Company lentityclassesCompany = entityclasses.Company.loadCompanyByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesCompany.save();
			entityclasses.Agent_type lentityclassesAgent_type = entityclasses.Agent_type.loadAgent_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesAgent_type.save();
			entityclasses.Approval_type lentityclassesApproval_type = entityclasses.Approval_type.loadApproval_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesApproval_type.save();
			entityclasses.Leave_type lentityclassesLeave_type = entityclasses.Leave_type.loadLeave_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesLeave_type.save();
			entityclasses.Currency_type lentityclassesCurrency_type = entityclasses.Currency_type.loadCurrency_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesCurrency_type.save();
			entityclasses.Air_ticket_type lentityclassesAir_ticket_type = entityclasses.Air_ticket_type.loadAir_ticket_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesAir_ticket_type.save();
			entityclasses.Staff_type lentityclassesStaff_type = entityclasses.Staff_type.loadStaff_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesStaff_type.save();
			entityclasses.Accommodation_type lentityclassesAccommodation_type = entityclasses.Accommodation_type.loadAccommodation_typeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesAccommodation_type.save();
			entityclasses.Exit_mode lentityclassesExit_mode = entityclasses.Exit_mode.loadExit_modeByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesExit_mode.save();
			entityclasses.Nationality lentityclassesNationality = entityclasses.Nationality.loadNationalityByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesNationality.save();
			entityclasses.Activity_document_checklist lentityclassesActivity_document_checklist = entityclasses.Activity_document_checklist.loadActivity_document_checklistByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesActivity_document_checklist.save();
			entityclasses.Current_staff_documents lentityclassesCurrent_staff_documents = entityclasses.Current_staff_documents.loadCurrent_staff_documentsByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesCurrent_staff_documents.save();
			entityclasses.Staff_salary lentityclassesStaff_salary = entityclasses.Staff_salary.loadStaff_salaryByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesStaff_salary.save();
			entityclasses.Company_contact lentityclassesCompany_contact = entityclasses.Company_contact.loadCompany_contactByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesCompany_contact.save();
			entityclasses.Staff_post lentityclassesStaff_post = entityclasses.Staff_post.loadStaff_postByQuery(null, null);
			// Update the properties of the persistent object
			lentityclassesStaff_post.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Activity by ActivityCriteria");
		entityclasses.ActivityCriteria lentityclassesActivityCriteria = new entityclasses.ActivityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivityCriteria.activity_id.eq();
		System.out.println(lentityclassesActivityCriteria.uniqueActivity());
		
		System.out.println("Retrieving Activity_document by Activity_documentCriteria");
		entityclasses.Activity_documentCriteria lentityclassesActivity_documentCriteria = new entityclasses.Activity_documentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivity_documentCriteria.activity_document_id.eq();
		System.out.println(lentityclassesActivity_documentCriteria.uniqueActivity_document());
		
		System.out.println("Retrieving Document_type by Document_typeCriteria");
		entityclasses.Document_typeCriteria lentityclassesDocument_typeCriteria = new entityclasses.Document_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesDocument_typeCriteria.document_type_id.eq();
		System.out.println(lentityclassesDocument_typeCriteria.uniqueDocument_type());
		
		System.out.println("Retrieving Task by TaskCriteria");
		entityclasses.TaskCriteria lentityclassesTaskCriteria = new entityclasses.TaskCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesTaskCriteria.task_id.eq();
		System.out.println(lentityclassesTaskCriteria.uniqueTask());
		
		System.out.println("Retrieving Activity_cost by Activity_costCriteria");
		entityclasses.Activity_costCriteria lentityclassesActivity_costCriteria = new entityclasses.Activity_costCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivity_costCriteria.activity_cost_id.eq();
		System.out.println(lentityclassesActivity_costCriteria.uniqueActivity_cost());
		
		System.out.println("Retrieving Activity_group by Activity_groupCriteria");
		entityclasses.Activity_groupCriteria lentityclassesActivity_groupCriteria = new entityclasses.Activity_groupCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivity_groupCriteria.activity_group_id.eq();
		System.out.println(lentityclassesActivity_groupCriteria.uniqueActivity_group());
		
		System.out.println("Retrieving Activity_outcome by Activity_outcomeCriteria");
		entityclasses.Activity_outcomeCriteria lentityclassesActivity_outcomeCriteria = new entityclasses.Activity_outcomeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivity_outcomeCriteria.activity_outcome_id.eq();
		System.out.println(lentityclassesActivity_outcomeCriteria.uniqueActivity_outcome());
		
		System.out.println("Retrieving Outcome by OutcomeCriteria");
		entityclasses.OutcomeCriteria lentityclassesOutcomeCriteria = new entityclasses.OutcomeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesOutcomeCriteria.outcome_id.eq();
		System.out.println(lentityclassesOutcomeCriteria.uniqueOutcome());
		
		System.out.println("Retrieving Staff by StaffCriteria");
		entityclasses.StaffCriteria lentityclassesStaffCriteria = new entityclasses.StaffCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesStaffCriteria.staff_id.eq();
		System.out.println(lentityclassesStaffCriteria.uniqueStaff());
		
		System.out.println("Retrieving Agency by AgencyCriteria");
		entityclasses.AgencyCriteria lentityclassesAgencyCriteria = new entityclasses.AgencyCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesAgencyCriteria.agency_id.eq();
		System.out.println(lentityclassesAgencyCriteria.uniqueAgency());
		
		System.out.println("Retrieving Agent by AgentCriteria");
		entityclasses.AgentCriteria lentityclassesAgentCriteria = new entityclasses.AgentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesAgentCriteria.agent_id.eq();
		System.out.println(lentityclassesAgentCriteria.uniqueAgent());
		
		System.out.println("Retrieving User_detail by User_detailCriteria");
		entityclasses.User_detailCriteria lentityclassesUser_detailCriteria = new entityclasses.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesUser_detailCriteria.user_detail_id.eq();
		System.out.println(lentityclassesUser_detailCriteria.uniqueUser_detail());
		
		System.out.println("Retrieving Leave_transaction by Leave_transactionCriteria");
		entityclasses.Leave_transactionCriteria lentityclassesLeave_transactionCriteria = new entityclasses.Leave_transactionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesLeave_transactionCriteria.leave_transaction_id.eq();
		System.out.println(lentityclassesLeave_transactionCriteria.uniqueLeave_transaction());
		
		System.out.println("Retrieving Fingerprint by FingerprintCriteria");
		entityclasses.FingerprintCriteria lentityclassesFingerprintCriteria = new entityclasses.FingerprintCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesFingerprintCriteria.fingerprint_id.eq();
		System.out.println(lentityclassesFingerprintCriteria.uniqueFingerprint());
		
		System.out.println("Retrieving Task_document by Task_documentCriteria");
		entityclasses.Task_documentCriteria lentityclassesTask_documentCriteria = new entityclasses.Task_documentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesTask_documentCriteria.task_document_id.eq();
		System.out.println(lentityclassesTask_documentCriteria.uniqueTask_document());
		
		System.out.println("Retrieving Task_payment by Task_paymentCriteria");
		entityclasses.Task_paymentCriteria lentityclassesTask_paymentCriteria = new entityclasses.Task_paymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesTask_paymentCriteria.task_payment_id.eq();
		System.out.println(lentityclassesTask_paymentCriteria.uniqueTask_payment());
		
		System.out.println("Retrieving Group_detail by Group_detailCriteria");
		entityclasses.Group_detailCriteria lentityclassesGroup_detailCriteria = new entityclasses.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesGroup_detailCriteria.group_detail_id.eq();
		System.out.println(lentityclassesGroup_detailCriteria.uniqueGroup_detail());
		
		System.out.println("Retrieving Group_right by Group_rightCriteria");
		entityclasses.Group_rightCriteria lentityclassesGroup_rightCriteria = new entityclasses.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesGroup_rightCriteria.group_right_id.eq();
		System.out.println(lentityclassesGroup_rightCriteria.uniqueGroup_right());
		
		System.out.println("Retrieving Group_user by Group_userCriteria");
		entityclasses.Group_userCriteria lentityclassesGroup_userCriteria = new entityclasses.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesGroup_userCriteria.group_user_id.eq();
		System.out.println(lentityclassesGroup_userCriteria.uniqueGroup_user());
		
		System.out.println("Retrieving Company by CompanyCriteria");
		entityclasses.CompanyCriteria lentityclassesCompanyCriteria = new entityclasses.CompanyCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesCompanyCriteria.company_id.eq();
		System.out.println(lentityclassesCompanyCriteria.uniqueCompany());
		
		System.out.println("Retrieving Agent_type by Agent_typeCriteria");
		entityclasses.Agent_typeCriteria lentityclassesAgent_typeCriteria = new entityclasses.Agent_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesAgent_typeCriteria.agent_type_id.eq();
		System.out.println(lentityclassesAgent_typeCriteria.uniqueAgent_type());
		
		System.out.println("Retrieving Approval_type by Approval_typeCriteria");
		entityclasses.Approval_typeCriteria lentityclassesApproval_typeCriteria = new entityclasses.Approval_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesApproval_typeCriteria.approval_type_id.eq();
		System.out.println(lentityclassesApproval_typeCriteria.uniqueApproval_type());
		
		System.out.println("Retrieving Leave_type by Leave_typeCriteria");
		entityclasses.Leave_typeCriteria lentityclassesLeave_typeCriteria = new entityclasses.Leave_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesLeave_typeCriteria.leave_type_id.eq();
		System.out.println(lentityclassesLeave_typeCriteria.uniqueLeave_type());
		
		System.out.println("Retrieving Currency_type by Currency_typeCriteria");
		entityclasses.Currency_typeCriteria lentityclassesCurrency_typeCriteria = new entityclasses.Currency_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesCurrency_typeCriteria.currency_type_id.eq();
		System.out.println(lentityclassesCurrency_typeCriteria.uniqueCurrency_type());
		
		System.out.println("Retrieving Air_ticket_type by Air_ticket_typeCriteria");
		entityclasses.Air_ticket_typeCriteria lentityclassesAir_ticket_typeCriteria = new entityclasses.Air_ticket_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesAir_ticket_typeCriteria.air_ticket_type_id.eq();
		System.out.println(lentityclassesAir_ticket_typeCriteria.uniqueAir_ticket_type());
		
		System.out.println("Retrieving Staff_type by Staff_typeCriteria");
		entityclasses.Staff_typeCriteria lentityclassesStaff_typeCriteria = new entityclasses.Staff_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesStaff_typeCriteria.staff_type_id.eq();
		System.out.println(lentityclassesStaff_typeCriteria.uniqueStaff_type());
		
		System.out.println("Retrieving Accommodation_type by Accommodation_typeCriteria");
		entityclasses.Accommodation_typeCriteria lentityclassesAccommodation_typeCriteria = new entityclasses.Accommodation_typeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesAccommodation_typeCriteria.accommodation_type_id.eq();
		System.out.println(lentityclassesAccommodation_typeCriteria.uniqueAccommodation_type());
		
		System.out.println("Retrieving Exit_mode by Exit_modeCriteria");
		entityclasses.Exit_modeCriteria lentityclassesExit_modeCriteria = new entityclasses.Exit_modeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesExit_modeCriteria.exit_mode_id.eq();
		System.out.println(lentityclassesExit_modeCriteria.uniqueExit_mode());
		
		System.out.println("Retrieving Nationality by NationalityCriteria");
		entityclasses.NationalityCriteria lentityclassesNationalityCriteria = new entityclasses.NationalityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesNationalityCriteria.nationality_id.eq();
		System.out.println(lentityclassesNationalityCriteria.uniqueNationality());
		
		System.out.println("Retrieving Activity_document_checklist by Activity_document_checklistCriteria");
		entityclasses.Activity_document_checklistCriteria lentityclassesActivity_document_checklistCriteria = new entityclasses.Activity_document_checklistCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesActivity_document_checklistCriteria.activity_document_checklist_id.eq();
		System.out.println(lentityclassesActivity_document_checklistCriteria.uniqueActivity_document_checklist());
		
		System.out.println("Retrieving Current_staff_documents by Current_staff_documentsCriteria");
		entityclasses.Current_staff_documentsCriteria lentityclassesCurrent_staff_documentsCriteria = new entityclasses.Current_staff_documentsCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesCurrent_staff_documentsCriteria.current_staff_documents_id.eq();
		System.out.println(lentityclassesCurrent_staff_documentsCriteria.uniqueCurrent_staff_documents());
		
		System.out.println("Retrieving Staff_salary by Staff_salaryCriteria");
		entityclasses.Staff_salaryCriteria lentityclassesStaff_salaryCriteria = new entityclasses.Staff_salaryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesStaff_salaryCriteria.staff_salary_id.eq();
		System.out.println(lentityclassesStaff_salaryCriteria.uniqueStaff_salary());
		
		System.out.println("Retrieving Company_contact by Company_contactCriteria");
		entityclasses.Company_contactCriteria lentityclassesCompany_contactCriteria = new entityclasses.Company_contactCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesCompany_contactCriteria.company_contact_id.eq();
		System.out.println(lentityclassesCompany_contactCriteria.uniqueCompany_contact());
		
		System.out.println("Retrieving Staff_post by Staff_postCriteria");
		entityclasses.Staff_postCriteria lentityclassesStaff_postCriteria = new entityclasses.Staff_postCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentityclassesStaff_postCriteria.staff_post_id.eq();
		System.out.println(lentityclassesStaff_postCriteria.uniqueStaff_post());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateImmigrationStaffingManagementSystemData retrieveAndUpdateImmigrationStaffingManagementSystemData = new RetrieveAndUpdateImmigrationStaffingManagementSystemData();
			try {
				retrieveAndUpdateImmigrationStaffingManagementSystemData.retrieveAndUpdateTestData();
				//retrieveAndUpdateImmigrationStaffingManagementSystemData.retrieveByCriteria();
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
