/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotScriptModel.DefVar;
import robotScriptModel.Expressions;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.DefVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link robotScriptModel.impl.DefVarImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link robotScriptModel.impl.DefVarImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefVarImpl extends MinimalEObjectImpl.Container implements DefVar {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected Expressions expressions;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.DEF_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.DEF_VAR__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expressions getExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressions(Expressions newExpressions, NotificationChain msgs) {
		Expressions oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.DEF_VAR__EXPRESSIONS, oldExpressions, newExpressions);
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
	public void setExpressions(Expressions newExpressions) {
		if (newExpressions != expressions) {
			NotificationChain msgs = null;
			if (expressions != null)
				msgs = ((InternalEObject) expressions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.DEF_VAR__EXPRESSIONS, null, msgs);
			if (newExpressions != null)
				msgs = ((InternalEObject) newExpressions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.DEF_VAR__EXPRESSIONS, null, msgs);
			msgs = basicSetExpressions(newExpressions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.DEF_VAR__EXPRESSIONS,
					newExpressions, newExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Units getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnits(Units newUnits, NotificationChain msgs) {
		Units oldUnits = units;
		units = newUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.DEF_VAR__UNITS, oldUnits, newUnits);
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
	public void setUnits(Units newUnits) {
		if (newUnits != units) {
			NotificationChain msgs = null;
			if (units != null)
				msgs = ((InternalEObject) units).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.DEF_VAR__UNITS, null, msgs);
			if (newUnits != null)
				msgs = ((InternalEObject) newUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.DEF_VAR__UNITS, null, msgs);
			msgs = basicSetUnits(newUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.DEF_VAR__UNITS, newUnits,
					newUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.DEF_VAR__EXPRESSIONS:
			return basicSetExpressions(null, msgs);
		case RobotScriptModelPackage.DEF_VAR__UNITS:
			return basicSetUnits(null, msgs);
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
		case RobotScriptModelPackage.DEF_VAR__NAME:
			return getName();
		case RobotScriptModelPackage.DEF_VAR__EXPRESSIONS:
			return getExpressions();
		case RobotScriptModelPackage.DEF_VAR__UNITS:
			return getUnits();
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
		case RobotScriptModelPackage.DEF_VAR__NAME:
			setName((String) newValue);
			return;
		case RobotScriptModelPackage.DEF_VAR__EXPRESSIONS:
			setExpressions((Expressions) newValue);
			return;
		case RobotScriptModelPackage.DEF_VAR__UNITS:
			setUnits((Units) newValue);
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
		case RobotScriptModelPackage.DEF_VAR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobotScriptModelPackage.DEF_VAR__EXPRESSIONS:
			setExpressions((Expressions) null);
			return;
		case RobotScriptModelPackage.DEF_VAR__UNITS:
			setUnits((Units) null);
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
		case RobotScriptModelPackage.DEF_VAR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobotScriptModelPackage.DEF_VAR__EXPRESSIONS:
			return expressions != null;
		case RobotScriptModelPackage.DEF_VAR__UNITS:
			return units != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DefVarImpl
