/**
 * Licensee: Kiyingi Simon Peter
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateImmigrationStaffingManagementSystemDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(entityclasses.ISMSPersistentManager.instance());
			entityclasses.ISMSPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
