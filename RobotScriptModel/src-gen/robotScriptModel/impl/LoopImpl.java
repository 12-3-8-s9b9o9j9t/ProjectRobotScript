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
import robotScriptModel.Loop;
import robotScriptModel.RobotScriptModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.LoopImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link robotScriptModel.impl.LoopImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends MinimalEObjectImpl.Container implements Loop {
	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCondition()
	 * @generated
	 * @ordered
	 */
	protected robotScriptModel.Boolean loopCondition;

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
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public robotScriptModel.Boolean getLoopCondition() {
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(robotScriptModel.Boolean newLoopCondition, NotificationChain msgs) {
		robotScriptModel.Boolean oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.LOOP__LOOP_CONDITION, oldLoopCondition, newLoopCondition);
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
	public void setLoopCondition(robotScriptModel.Boolean newLoopCondition) {
		if (newLoopCondition != loopCondition) {
			NotificationChain msgs = null;
			if (loopCondition != null)
				msgs = ((InternalEObject) loopCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP__LOOP_CONDITION, null, msgs);
			if (newLoopCondition != null)
				msgs = ((InternalEObject) newLoopCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP__LOOP_CONDITION, null, msgs);
			msgs = basicSetLoopCondition(newLoopCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.LOOP__LOOP_CONDITION,
					newLoopCondition, newLoopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Command>(Command.class, this, RobotScriptModelPackage.LOOP__BODY);
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
		case RobotScriptModelPackage.LOOP__LOOP_CONDITION:
			return basicSetLoopCondition(null, msgs);
		case RobotScriptModelPackage.LOOP__BODY:
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
		case RobotScriptModelPackage.LOOP__LOOP_CONDITION:
			return getLoopCondition();
		case RobotScriptModelPackage.LOOP__BODY:
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
		case RobotScriptModelPackage.LOOP__LOOP_CONDITION:
			setLoopCondition((robotScriptModel.Boolean) newValue);
			return;
		case RobotScriptModelPackage.LOOP__BODY:
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
		case RobotScriptModelPackage.LOOP__LOOP_CONDITION:
			setLoopCondition((robotScriptModel.Boolean) null);
			return;
		case RobotScriptModelPackage.LOOP__BODY:
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
		case RobotScriptModelPackage.LOOP__LOOP_CONDITION:
			return loopCondition != null;
		case RobotScriptModelPackage.LOOP__BODY:
			return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
