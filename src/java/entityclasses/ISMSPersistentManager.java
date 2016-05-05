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
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;

public class ISMSPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "ImmigrationStaffingManagementSystem";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private ISMSPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	public Configuration createConfiguration() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(entityclasses.Activity.class);
		configuration.addAnnotatedClass(entityclasses.Activity_document.class);
		configuration.addAnnotatedClass(entityclasses.Document_type.class);
		configuration.addAnnotatedClass(entityclasses.Task.class);
		configuration.addAnnotatedClass(entityclasses.Activity_cost.class);
		configuration.addAnnotatedClass(entityclasses.Activity_group.class);
		configuration.addAnnotatedClass(entityclasses.Activity_outcome.class);
		configuration.addAnnotatedClass(entityclasses.Outcome.class);
		configuration.addAnnotatedClass(entityclasses.Staff.class);
		configuration.addAnnotatedClass(entityclasses.Agency.class);
		configuration.addAnnotatedClass(entityclasses.Agent.class);
		configuration.addAnnotatedClass(entityclasses.User_detail.class);
		configuration.addAnnotatedClass(entityclasses.Leave_transaction.class);
		configuration.addAnnotatedClass(entityclasses.Fingerprint.class);
		configuration.addAnnotatedClass(entityclasses.Task_document.class);
		configuration.addAnnotatedClass(entityclasses.Task_payment.class);
		configuration.addAnnotatedClass(entityclasses.Group_detail.class);
		configuration.addAnnotatedClass(entityclasses.Group_right.class);
		configuration.addAnnotatedClass(entityclasses.Group_user.class);
		configuration.addAnnotatedClass(entityclasses.Company.class);
		configuration.addAnnotatedClass(entityclasses.Agent_type.class);
		configuration.addAnnotatedClass(entityclasses.Approval_type.class);
		configuration.addAnnotatedClass(entityclasses.Leave_type.class);
		configuration.addAnnotatedClass(entityclasses.Currency_type.class);
		configuration.addAnnotatedClass(entityclasses.Air_ticket_type.class);
		configuration.addAnnotatedClass(entityclasses.Staff_type.class);
		configuration.addAnnotatedClass(entityclasses.Accommodation_type.class);
		configuration.addAnnotatedClass(entityclasses.Exit_mode.class);
		configuration.addAnnotatedClass(entityclasses.Nationality.class);
		configuration.addAnnotatedClass(entityclasses.Activity_document_checklist.class);
		configuration.addAnnotatedClass(entityclasses.Current_staff_documents.class);
		configuration.addAnnotatedClass(entityclasses.Staff_salary.class);
		configuration.addAnnotatedClass(entityclasses.Company_contact.class);
		configuration.addAnnotatedClass(entityclasses.Staff_post.class);
		configuration.buildMappings();
		return configuration;
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new ISMSPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
