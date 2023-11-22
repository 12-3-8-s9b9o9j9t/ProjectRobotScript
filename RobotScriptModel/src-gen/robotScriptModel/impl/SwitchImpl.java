/**
 */
package robotScriptModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotScriptModel.Command;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.SwitchImpl#getSwitchCondition <em>Switch Condition</em>}</li>
 *   <li>{@link robotScriptModel.impl.SwitchImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends MinimalEObjectImpl.Container implements Switch {
	/**
	 * The cached value of the '{@link #getSwitchCondition() <em>Switch Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchCondition()
	 * @generated
	 * @ordered
	 */
	protected robotScriptModel.Boolean switchCondition;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public robotScriptModel.Boolean getSwitchCondition() {
		return switchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchCondition(robotScriptModel.Boolean newSwitchCondition,
			NotificationChain msgs) {
		robotScriptModel.Boolean oldSwitchCondition = switchCondition;
		switchCondition = newSwitchCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.SWITCH__SWITCH_CONDITION, oldSwitchCondition, newSwitchCondition);
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
	public void setSwitchCondition(robotScriptModel.Boolean newSwitchCondition) {
		if (newSwitchCondition != switchCondition) {
			NotificationChain msgs = null;
			if (switchCondition != null)
				msgs = ((InternalEObject) switchCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SWITCH__SWITCH_CONDITION, null, msgs);
			if (newSwitchCondition != null)
				msgs = ((InternalEObject) newSwitchCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.SWITCH__SWITCH_CONDITION, null, msgs);
			msgs = basicSetSwitchCondition(newSwitchCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.SWITCH__SWITCH_CONDITION,
					newSwitchCondition, newSwitchCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Command>(Command.class, this, RobotScriptModelPackage.SWITCH__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.SWITCH__SWITCH_CONDITION:
			return basicSetSwitchCondition(null, msgs);
		case RobotScriptModelPackage.SWITCH__BODY:
			return ((InternalEList<?>) getBody()).basicRemove(otherEnd, msgs);
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
		case RobotScriptModelPackage.SWITCH__SWITCH_CONDITION:
			return getSwitchCondition();
		case RobotScriptModelPackage.SWITCH__BODY:
			return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotScriptModelPackage.SWITCH__SWITCH_CONDITION:
			setSwitchCondition((robotScriptModel.Boolean) newValue);
			return;
		case RobotScriptModelPackage.SWITCH__BODY:
			getBody().clear();
			getBody().addAll((Collection<? extends Command>) newValue);
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
		case RobotScriptModelPackage.SWITCH__SWITCH_CONDITION:
			setSwitchCondition((robotScriptModel.Boolean) null);
			return;
		case RobotScriptModelPackage.SWITCH__BODY:
			getBody().clear();
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
		case RobotScriptModelPackage.SWITCH__SWITCH_CONDITION:
			return switchCondition != null;
		case RobotScriptModelPackage.SWITCH__BODY:
			return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
