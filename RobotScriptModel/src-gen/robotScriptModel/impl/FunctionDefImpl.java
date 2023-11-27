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

import robotScriptModel.AnyType;
import robotScriptModel.Command;
import robotScriptModel.FunctionDef;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.FunctionDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link robotScriptModel.impl.FunctionDefImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link robotScriptModel.impl.FunctionDefImpl#getBody <em>Body</em>}</li>
 *   <li>{@link robotScriptModel.impl.FunctionDefImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefImpl extends MinimalEObjectImpl.Container implements FunctionDef {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected AnyType returnType;

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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDecl> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.FUNCTION_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.FUNCTION_DEF__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(AnyType newReturnType, NotificationChain msgs) {
		AnyType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE, oldReturnType, newReturnType);
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
	public void setReturnType(AnyType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject) returnType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject) newReturnType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE,
					newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Command>(Command.class, this,
					RobotScriptModelPackage.FUNCTION_DEF__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarDecl> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<VarDecl>(VarDecl.class, this,
					RobotScriptModelPackage.FUNCTION_DEF__INPUTS);
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
		case RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE:
			return basicSetReturnType(null, msgs);
		case RobotScriptModelPackage.FUNCTION_DEF__BODY:
			return ((InternalEList<?>) getBody()).basicRemove(otherEnd, msgs);
		case RobotScriptModelPackage.FUNCTION_DEF__INPUTS:
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
		case RobotScriptModelPackage.FUNCTION_DEF__NAME:
			return getName();
		case RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE:
			return getReturnType();
		case RobotScriptModelPackage.FUNCTION_DEF__BODY:
			return getBody();
		case RobotScriptModelPackage.FUNCTION_DEF__INPUTS:
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
		case RobotScriptModelPackage.FUNCTION_DEF__NAME:
			setName((String) newValue);
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE:
			setReturnType((AnyType) newValue);
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__BODY:
			getBody().clear();
			getBody().addAll((Collection<? extends Command>) newValue);
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends VarDecl>) newValue);
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
		case RobotScriptModelPackage.FUNCTION_DEF__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE:
			setReturnType((AnyType) null);
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__BODY:
			getBody().clear();
			return;
		case RobotScriptModelPackage.FUNCTION_DEF__INPUTS:
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
		case RobotScriptModelPackage.FUNCTION_DEF__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobotScriptModelPackage.FUNCTION_DEF__RETURN_TYPE:
			return returnType != null;
		case RobotScriptModelPackage.FUNCTION_DEF__BODY:
			return body != null && !body.isEmpty();
		case RobotScriptModelPackage.FUNCTION_DEF__INPUTS:
			return inputs != null && !inputs.isEmpty();
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

} //FunctionDefImpl
