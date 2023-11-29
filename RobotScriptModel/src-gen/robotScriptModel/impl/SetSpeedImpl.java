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
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.SetSpeed;
import robotScriptModel.Speed;
import robotScriptModel.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Speed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.SetSpeedImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link robotScriptModel.impl.SetSpeedImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link robotScriptModel.impl.SetSpeedImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetSpeedImpl extends MinimalEObjectImpl.Container implements SetSpeed {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression expr;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Unit UNIT_EDEFAULT = Unit.M;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed speed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetSpeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.SET_SPEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs) {
		Expression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.SET_SPEED__EXPR, oldExpr, newExpr);
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
	public void setExpr(Expression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject) expr).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SET_SPEED__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SET_SPEED__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.SET_SPEED__EXPR, newExpr,
					newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.SET_SPEED__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speed getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeed(Speed newSpeed, NotificationChain msgs) {
		Speed oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.SET_SPEED__SPEED, oldSpeed, newSpeed);
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
	public void setSpeed(Speed newSpeed) {
		if (newSpeed != speed) {
			NotificationChain msgs = null;
			if (speed != null)
				msgs = ((InternalEObject) speed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SET_SPEED__SPEED, null, msgs);
			if (newSpeed != null)
				msgs = ((InternalEObject) newSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SET_SPEED__SPEED, null, msgs);
			msgs = basicSetSpeed(newSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.SET_SPEED__SPEED, newSpeed,
					newSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.SET_SPEED__EXPR:
			return basicSetExpr(null, msgs);
		case RobotScriptModelPackage.SET_SPEED__SPEED:
			return basicSetSpeed(null, msgs);
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
		case RobotScriptModelPackage.SET_SPEED__EXPR:
			return getExpr();
		case RobotScriptModelPackage.SET_SPEED__UNIT:
			return getUnit();
		case RobotScriptModelPackage.SET_SPEED__SPEED:
			return getSpeed();
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
		case RobotScriptModelPackage.SET_SPEED__EXPR:
			setExpr((Expression) newValue);
			return;
		case RobotScriptModelPackage.SET_SPEED__UNIT:
			setUnit((Unit) newValue);
			return;
		case RobotScriptModelPackage.SET_SPEED__SPEED:
			setSpeed((Speed) newValue);
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
		case RobotScriptModelPackage.SET_SPEED__EXPR:
			setExpr((Expression) null);
			return;
		case RobotScriptModelPackage.SET_SPEED__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case RobotScriptModelPackage.SET_SPEED__SPEED:
			setSpeed((Speed) null);
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
		case RobotScriptModelPackage.SET_SPEED__EXPR:
			return expr != null;
		case RobotScriptModelPackage.SET_SPEED__UNIT:
			return unit != UNIT_EDEFAULT;
		case RobotScriptModelPackage.SET_SPEED__SPEED:
			return speed != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //SetSpeedImpl
