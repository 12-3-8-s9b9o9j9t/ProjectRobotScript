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

import robotScriptModel.Expression;
import robotScriptModel.FunCall;
import robotScriptModel.FunctionDef;
import robotScriptModel.RobotScriptModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.FunCallImpl#getFun <em>Fun</em>}</li>
 *   <li>{@link robotScriptModel.impl.FunCallImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunCallImpl extends MinimalEObjectImpl.Container implements FunCall {
	/**
	 * The cached value of the '{@link #getFun() <em>Fun</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFun()
	 * @generated
	 * @ordered
	 */
	protected FunctionDef fun;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.FUN_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionDef getFun() {
		if (fun != null && fun.eIsProxy()) {
			InternalEObject oldFun = (InternalEObject) fun;
			fun = (FunctionDef) eResolveProxy(oldFun);
			if (fun != oldFun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotScriptModelPackage.FUN_CALL__FUN,
							oldFun, fun));
			}
		}
		return fun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDef basicGetFun() {
		return fun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFun(FunctionDef newFun) {
		FunctionDef oldFun = fun;
		fun = newFun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.FUN_CALL__FUN, oldFun, fun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Expression>(Expression.class, this,
					RobotScriptModelPackage.FUN_CALL__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.FUN_CALL__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
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
		case RobotScriptModelPackage.FUN_CALL__FUN:
			if (resolve)
				return getFun();
			return basicGetFun();
		case RobotScriptModelPackage.FUN_CALL__INPUTS:
			return getInputs();
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
		case RobotScriptModelPackage.FUN_CALL__FUN:
			setFun((FunctionDef) newValue);
			return;
		case RobotScriptModelPackage.FUN_CALL__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Expression>) newValue);
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
		case RobotScriptModelPackage.FUN_CALL__FUN:
			setFun((FunctionDef) null);
			return;
		case RobotScriptModelPackage.FUN_CALL__INPUTS:
			getInputs().clear();
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
		case RobotScriptModelPackage.FUN_CALL__FUN:
			return fun != null;
		case RobotScriptModelPackage.FUN_CALL__INPUTS:
			return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunCallImpl
