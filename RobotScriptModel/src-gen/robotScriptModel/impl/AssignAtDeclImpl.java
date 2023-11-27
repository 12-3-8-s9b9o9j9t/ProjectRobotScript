/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotScriptModel.AssignAtDecl;
import robotScriptModel.Expression;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign At Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.AssignAtDeclImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link robotScriptModel.impl.AssignAtDeclImpl#getVardecl <em>Vardecl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignAtDeclImpl extends MinimalEObjectImpl.Container implements AssignAtDecl {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getVardecl() <em>Vardecl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVardecl()
	 * @generated
	 * @ordered
	 */
	protected VarDecl vardecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignAtDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.ASSIGN_AT_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION,
					newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDecl getVardecl() {
		return vardecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVardecl(VarDecl newVardecl, NotificationChain msgs) {
		VarDecl oldVardecl = vardecl;
		vardecl = newVardecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL, oldVardecl, newVardecl);
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
	public void setVardecl(VarDecl newVardecl) {
		if (newVardecl != vardecl) {
			NotificationChain msgs = null;
			if (vardecl != null)
				msgs = ((InternalEObject) vardecl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL, null, msgs);
			if (newVardecl != null)
				msgs = ((InternalEObject) newVardecl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL, null, msgs);
			msgs = basicSetVardecl(newVardecl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL,
					newVardecl, newVardecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION:
			return basicSetExpression(null, msgs);
		case RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL:
			return basicSetVardecl(null, msgs);
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
		case RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION:
			return getExpression();
		case RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL:
			return getVardecl();
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
		case RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL:
			setVardecl((VarDecl) newValue);
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
		case RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION:
			setExpression((Expression) null);
			return;
		case RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL:
			setVardecl((VarDecl) null);
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
		case RobotScriptModelPackage.ASSIGN_AT_DECL__EXPRESSION:
			return expression != null;
		case RobotScriptModelPackage.ASSIGN_AT_DECL__VARDECL:
			return vardecl != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignAtDeclImpl
