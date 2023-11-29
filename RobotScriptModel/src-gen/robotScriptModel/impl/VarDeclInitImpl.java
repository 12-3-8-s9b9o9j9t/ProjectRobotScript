/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotScriptModel.DataType;
import robotScriptModel.Expression;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.VarDeclInit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.VarDeclInitImpl#getType <em>Type</em>}</li>
 *   <li>{@link robotScriptModel.impl.VarDeclInitImpl#getName <em>Name</em>}</li>
 *   <li>{@link robotScriptModel.impl.VarDeclInitImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclInitImpl extends MinimalEObjectImpl.Container implements VarDeclInit {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

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
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.VAR_DECL_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DataType newType, NotificationChain msgs) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.VAR_DECL_INIT__TYPE, oldType, newType);
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
	public void setType(DataType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.VAR_DECL_INIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.VAR_DECL_INIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.VAR_DECL_INIT__TYPE, newType,
					newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.VAR_DECL_INIT__NAME, oldName,
					name));
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
					RobotScriptModelPackage.VAR_DECL_INIT__EXPR, oldExpr, newExpr);
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
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.VAR_DECL_INIT__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.VAR_DECL_INIT__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.VAR_DECL_INIT__EXPR, newExpr,
					newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.VAR_DECL_INIT__TYPE:
			return basicSetType(null, msgs);
		case RobotScriptModelPackage.VAR_DECL_INIT__EXPR:
			return basicSetExpr(null, msgs);
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
		case RobotScriptModelPackage.VAR_DECL_INIT__TYPE:
			return getType();
		case RobotScriptModelPackage.VAR_DECL_INIT__NAME:
			return getName();
		case RobotScriptModelPackage.VAR_DECL_INIT__EXPR:
			return getExpr();
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
		case RobotScriptModelPackage.VAR_DECL_INIT__TYPE:
			setType((DataType) newValue);
			return;
		case RobotScriptModelPackage.VAR_DECL_INIT__NAME:
			setName((String) newValue);
			return;
		case RobotScriptModelPackage.VAR_DECL_INIT__EXPR:
			setExpr((Expression) newValue);
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
		case RobotScriptModelPackage.VAR_DECL_INIT__TYPE:
			setType((DataType) null);
			return;
		case RobotScriptModelPackage.VAR_DECL_INIT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobotScriptModelPackage.VAR_DECL_INIT__EXPR:
			setExpr((Expression) null);
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
		case RobotScriptModelPackage.VAR_DECL_INIT__TYPE:
			return type != null;
		case RobotScriptModelPackage.VAR_DECL_INIT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobotScriptModelPackage.VAR_DECL_INIT__EXPR:
			return expr != null;
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

} //VarDeclInitImpl
