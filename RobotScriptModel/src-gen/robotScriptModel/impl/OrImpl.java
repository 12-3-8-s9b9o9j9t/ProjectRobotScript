/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotScriptModel.Expression;
import robotScriptModel.Or;
import robotScriptModel.RobotScriptModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.OrImpl#getRightOp <em>Right Op</em>}</li>
 *   <li>{@link robotScriptModel.impl.OrImpl#getLeftOp <em>Left Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrImpl extends MinimalEObjectImpl.Container implements Or {
	/**
	 * The cached value of the '{@link #getRightOp() <em>Right Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOp()
	 * @generated
	 * @ordered
	 */
	protected Expression rightOp;

	/**
	 * The cached value of the '{@link #getLeftOp() <em>Left Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOp()
	 * @generated
	 * @ordered
	 */
	protected Expression leftOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRightOp() {
		return rightOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOp(Expression newRightOp, NotificationChain msgs) {
		Expression oldRightOp = rightOp;
		rightOp = newRightOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.OR__RIGHT_OP, oldRightOp, newRightOp);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightOp(Expression newRightOp) {
		if (newRightOp != rightOp) {
			NotificationChain msgs = null;
			if (rightOp != null)
				msgs = ((InternalEObject) rightOp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.OR__RIGHT_OP, null, msgs);
			if (newRightOp != null)
				msgs = ((InternalEObject) newRightOp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.OR__RIGHT_OP, null, msgs);
			msgs = basicSetRightOp(newRightOp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.OR__RIGHT_OP, newRightOp,
					newRightOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLeftOp() {
		return leftOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOp(Expression newLeftOp, NotificationChain msgs) {
		Expression oldLeftOp = leftOp;
		leftOp = newLeftOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.OR__LEFT_OP, oldLeftOp, newLeftOp);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOp(Expression newLeftOp) {
		if (newLeftOp != leftOp) {
			NotificationChain msgs = null;
			if (leftOp != null)
				msgs = ((InternalEObject) leftOp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.OR__LEFT_OP, null, msgs);
			if (newLeftOp != null)
				msgs = ((InternalEObject) newLeftOp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.OR__LEFT_OP, null, msgs);
			msgs = basicSetLeftOp(newLeftOp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.OR__LEFT_OP, newLeftOp,
					newLeftOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.OR__RIGHT_OP:
			return basicSetRightOp(null, msgs);
		case RobotScriptModelPackage.OR__LEFT_OP:
			return basicSetLeftOp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotScriptModelPackage.OR__RIGHT_OP:
			return getRightOp();
		case RobotScriptModelPackage.OR__LEFT_OP:
			return getLeftOp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotScriptModelPackage.OR__RIGHT_OP:
			setRightOp((Expression) newValue);
			return;
		case RobotScriptModelPackage.OR__LEFT_OP:
			setLeftOp((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobotScriptModelPackage.OR__RIGHT_OP:
			setRightOp((Expression) null);
			return;
		case RobotScriptModelPackage.OR__LEFT_OP:
			setLeftOp((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobotScriptModelPackage.OR__RIGHT_OP:
			return rightOp != null;
		case RobotScriptModelPackage.OR__LEFT_OP:
			return leftOp != null;
		}
		return super.eIsSet(featureID);
	}

} //OrImpl
