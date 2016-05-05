/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteImmigrationStaffingManagementSystemData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = entityclasses.ISMSPersistentManager.instance().getSession().beginTransaction();
		try {
			entityclasses.Activity lentityclassesActivity = entityclasses.Activity.loadActivityByQuery(null, null);
			lentityclassesActivity.delete();
			entityclasses.Activity_document lentityclassesActivity_document = entityclasses.Activity_document.loadActivity_documentByQuery(null, null);
			lentityclassesActivity_document.delete();
			entityclasses.Document_type lentityclassesDocument_type = entityclasses.Document_type.loadDocument_typeByQuery(null, null);
			lentityclassesDocument_type.delete();
			entityclasses.Task lentityclassesTask = entityclasses.Task.loadTaskByQuery(null, null);
			lentityclassesTask.delete();
			entityclasses.Activity_cost lentityclassesActivity_cost = entityclasses.Activity_cost.loadActivity_costByQuery(null, null);
			lentityclassesActivity_cost.delete();
			entityclasses.Activity_group lentityclassesActivity_group = entityclasses.Activity_group.loadActivity_groupByQuery(null, null);
			lentityclassesActivity_group.delete();
			entityclasses.Activity_outcome lentityclassesActivity_outcome = entityclasses.Activity_outcome.loadActivity_outcomeByQuery(null, null);
			lentityclassesActivity_outcome.delete();
			entityclasses.Outcome lentityclassesOutcome = entityclasses.Outcome.loadOutcomeByQuery(null, null);
			lentityclassesOutcome.delete();
			entityclasses.Staff lentityclassesStaff = entityclasses.Staff.loadStaffByQuery(null, null);
			lentityclassesStaff.delete();
			entityclasses.Agency lentityclassesAgency = entityclasses.Agency.loadAgencyByQuery(null, null);
			lentityclassesAgency.delete();
			entityclasses.Agent lentityclassesAgent = entityclasses.Agent.loadAgentByQuery(null, null);
			lentityclassesAgent.delete();
			entityclasses.User_detail lentityclassesUser_detail = entityclasses.User_detail.loadUser_detailByQuery(null, null);
			lentityclassesUser_detail.delete();
			entityclasses.Leave_transaction lentityclassesLeave_transaction = entityclasses.Leave_transaction.loadLeave_transactionByQuery(null, null);
			lentityclassesLeave_transaction.delete();
			entityclasses.Fingerprint lentityclassesFingerprint = entityclasses.Fingerprint.loadFingerprintByQuery(null, null);
			lentityclassesFingerprint.delete();
			entityclasses.Task_document lentityclassesTask_document = entityclasses.Task_document.loadTask_documentByQuery(null, null);
			lentityclassesTask_document.delete();
			entityclasses.Task_payment lentityclassesTask_payment = entityclasses.Task_payment.loadTask_paymentByQuery(null, null);
			lentityclassesTask_payment.delete();
			entityclasses.Group_detail lentityclassesGroup_detail = entityclasses.Group_detail.loadGroup_detailByQuery(null, null);
			lentityclassesGroup_detail.delete();
			entityclasses.Group_right lentityclassesGroup_right = entityclasses.Group_right.loadGroup_rightByQuery(null, null);
			lentityclassesGroup_right.delete();
			entityclasses.Group_user lentityclassesGroup_user = entityclasses.Group_user.loadGroup_userByQuery(null, null);
			lentityclassesGroup_user.delete();
			entityclasses.Company lentityclassesCompany = entityclasses.Company.loadCompanyByQuery(null, null);
			lentityclassesCompany.delete();
			entityclasses.Agent_type lentityclassesAgent_type = entityclasses.Agent_type.loadAgent_typeByQuery(null, null);
			lentityclassesAgent_type.delete();
			entityclasses.Approval_type lentityclassesApproval_type = entityclasses.Approval_type.loadApproval_typeByQuery(null, null);
			lentityclassesApproval_type.delete();
			entityclasses.Leave_type lentityclassesLeave_type = entityclasses.Leave_type.loadLeave_typeByQuery(null, null);
			lentityclassesLeave_type.delete();
			entityclasses.Currency_type lentityclassesCurrency_type = entityclasses.Currency_type.loadCurrency_typeByQuery(null, null);
			lentityclassesCurrency_type.delete();
			entityclasses.Air_ticket_type lentityclassesAir_ticket_type = entityclasses.Air_ticket_type.loadAir_ticket_typeByQuery(null, null);
			lentityclassesAir_ticket_type.delete();
			entityclasses.Staff_type lentityclassesStaff_type = entityclasses.Staff_type.loadStaff_typeByQuery(null, null);
			lentityclassesStaff_type.delete();
			entityclasses.Accommodation_type lentityclassesAccommodation_type = entityclasses.Accommodation_type.loadAccommodation_typeByQuery(null, null);
			lentityclassesAccommodation_type.delete();
			entityclasses.Exit_mode lentityclassesExit_mode = entityclasses.Exit_mode.loadExit_modeByQuery(null, null);
			lentityclassesExit_mode.delete();
			entityclasses.Nationality lentityclassesNationality = entityclasses.Nationality.loadNationalityByQuery(null, null);
			lentityclassesNationality.delete();
			entityclasses.Activity_document_checklist lentityclassesActivity_document_checklist = entityclasses.Activity_document_checklist.loadActivity_document_checklistByQuery(null, null);
			lentityclassesActivity_document_checklist.delete();
			entityclasses.Current_staff_documents lentityclassesCurrent_staff_documents = entityclasses.Current_staff_documents.loadCurrent_staff_documentsByQuery(null, null);
			lentityclassesCurrent_staff_documents.delete();
			entityclasses.Staff_salary lentityclassesStaff_salary = entityclasses.Staff_salary.loadStaff_salaryByQuery(null, null);
			lentityclassesStaff_salary.delete();
			entityclasses.Company_contact lentityclassesCompany_contact = entityclasses.Company_contact.loadCompany_contactByQuery(null, null);
			lentityclassesCompany_contact.delete();
			entityclasses.Staff_post lentityclassesStaff_post = entityclasses.Staff_post.loadStaff_postByQuery(null, null);
			lentityclassesStaff_post.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteImmigrationStaffingManagementSystemData deleteImmigrationStaffingManagementSystemData = new DeleteImmigrationStaffingManagementSystemData();
			try {
				deleteImmigrationStaffingManagementSystemData.deleteTestData();
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
