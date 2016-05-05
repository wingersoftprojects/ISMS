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

public class FingerprintCriteria extends AbstractORMCriteria {
	public final IntegerExpression fingerprint_id;
	
	public FingerprintCriteria(Criteria criteria) {
		super(criteria);
		fingerprint_id = new IntegerExpression("fingerprint_id", this);
	}
	
	public FingerprintCriteria(PersistentSession session) {
		this(session.createCriteria(Fingerprint.class));
	}
	
	public FingerprintCriteria() throws PersistentException {
		this(entityclasses.ISMSPersistentManager.instance().getSession());
	}
	
	public Fingerprint uniqueFingerprint() {
		return (Fingerprint) super.uniqueResult();
	}
	
	public Fingerprint[] listFingerprint() {
		java.util.List list = super.list();
		return (Fingerprint[]) list.toArray(new Fingerprint[list.size()]);
	}
}

