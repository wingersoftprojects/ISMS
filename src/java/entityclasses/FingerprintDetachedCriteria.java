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

public class FingerprintDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression fingerprint_id;
	
	public FingerprintDetachedCriteria() {
		super(entityclasses.Fingerprint.class, entityclasses.FingerprintCriteria.class);
		fingerprint_id = new IntegerExpression("fingerprint_id", this.getDetachedCriteria());
	}
	
	public FingerprintDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.FingerprintCriteria.class);
		fingerprint_id = new IntegerExpression("fingerprint_id", this.getDetachedCriteria());
	}
	
	public Fingerprint uniqueFingerprint(PersistentSession session) {
		return (Fingerprint) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fingerprint[] listFingerprint(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fingerprint[]) list.toArray(new Fingerprint[list.size()]);
	}
}

