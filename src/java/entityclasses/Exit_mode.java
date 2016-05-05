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
@Table(name="exit_mode")
public class Exit_mode implements Serializable {
	public Exit_mode() {
	}
	
	public static Exit_mode loadExit_modeByORMID(int exit_mode_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadExit_modeByORMID(session, exit_mode_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode getExit_modeByORMID(int exit_mode_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getExit_modeByORMID(session, exit_mode_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByORMID(int exit_mode_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadExit_modeByORMID(session, exit_mode_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode getExit_modeByORMID(int exit_mode_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return getExit_modeByORMID(session, exit_mode_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByORMID(PersistentSession session, int exit_mode_id) throws PersistentException {
		try {
			return (Exit_mode) session.load(entityclasses.Exit_mode.class, new Integer(exit_mode_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode getExit_modeByORMID(PersistentSession session, int exit_mode_id) throws PersistentException {
		try {
			return (Exit_mode) session.get(entityclasses.Exit_mode.class, new Integer(exit_mode_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByORMID(PersistentSession session, int exit_mode_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Exit_mode) session.load(entityclasses.Exit_mode.class, new Integer(exit_mode_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode getExit_modeByORMID(PersistentSession session, int exit_mode_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Exit_mode) session.get(entityclasses.Exit_mode.class, new Integer(exit_mode_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExit_mode(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryExit_mode(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExit_mode(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return queryExit_mode(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode[] listExit_modeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listExit_modeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode[] listExit_modeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return listExit_modeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExit_mode(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Exit_mode as Exit_mode");
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
	
	public static List queryExit_mode(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Exit_mode as Exit_mode");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Exit_mode", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode[] listExit_modeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryExit_mode(session, condition, orderBy);
			return (Exit_mode[]) list.toArray(new Exit_mode[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode[] listExit_modeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryExit_mode(session, condition, orderBy, lockMode);
			return (Exit_mode[]) list.toArray(new Exit_mode[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadExit_modeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return loadExit_modeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Exit_mode[] exit_modes = listExit_modeByQuery(session, condition, orderBy);
		if (exit_modes != null && exit_modes.length > 0)
			return exit_modes[0];
		else
			return null;
	}
	
	public static Exit_mode loadExit_modeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Exit_mode[] exit_modes = listExit_modeByQuery(session, condition, orderBy, lockMode);
		if (exit_modes != null && exit_modes.length > 0)
			return exit_modes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateExit_modeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateExit_modeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExit_modeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.ISMSPersistentManager.instance().getSession();
			return iterateExit_modeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExit_modeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Exit_mode as Exit_mode");
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
	
	public static java.util.Iterator iterateExit_modeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Exit_mode as Exit_mode");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Exit_mode", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exit_mode loadExit_modeByCriteria(Exit_modeCriteria exit_modeCriteria) {
		Exit_mode[] exit_modes = listExit_modeByCriteria(exit_modeCriteria);
		if(exit_modes == null || exit_modes.length == 0) {
			return null;
		}
		return exit_modes[0];
	}
	
	public static Exit_mode[] listExit_modeByCriteria(Exit_modeCriteria exit_modeCriteria) {
		return exit_modeCriteria.listExit_mode();
	}
	
	public static Exit_mode createExit_mode() {
		return new entityclasses.Exit_mode();
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
			entityclasses.Staff[] lStaffs = (entityclasses.Staff[])getStaff().toArray(new entityclasses.Staff[getStaff().size()]);
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setExit_mode(null);
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
			entityclasses.Staff[] lStaffs = (entityclasses.Staff[])getStaff().toArray(new entityclasses.Staff[getStaff().size()]);
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setExit_mode(null);
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
	
	@Column(name="exit_mode_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_EXIT_MODE_EXIT_MODE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_EXIT_MODE_EXIT_MODE_ID_GENERATOR", strategy="native")	
	private int exit_mode_id;
	
	@Column(name="exit_mode_name", nullable=false, unique=true, length=50)	
	private String exit_mode_name;
	
	@Column(name="is_active", nullable=false, length=3)	
	private String is_active;
	
	@OneToMany(mappedBy="exit_mode", targetEntity=entityclasses.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set staff = new java.util.HashSet();
	
	private void setExit_mode_id(int value) {
		this.exit_mode_id = value;
	}
	
	public int getExit_mode_id() {
		return exit_mode_id;
	}
	
	public int getORMID() {
		return getExit_mode_id();
	}
	
	public void setExit_mode_name(String value) {
		this.exit_mode_name = value;
	}
	
	public String getExit_mode_name() {
		return exit_mode_name;
	}
	
	public void setIs_active(String value) {
		this.is_active = value;
	}
	
	public String getIs_active() {
		return is_active;
	}
	
	public void setStaff(java.util.Set value) {
		this.staff = value;
	}
	
	public java.util.Set getStaff() {
		return staff;
	}
	
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		Exit_mode object = (Exit_mode) obj;
		        return (this.getExit_mode_id() == object.getExit_mode_id());
	}
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	public String toString() {
		return String.valueOf(getExit_mode_id());
	}
	
}
