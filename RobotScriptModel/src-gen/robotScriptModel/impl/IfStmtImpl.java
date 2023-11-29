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
import robotScriptModel.IfStmt;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.IfStmtImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link robotScriptModel.impl.IfStmtImpl#getIfstmt <em>Ifstmt</em>}</li>
 *   <li>{@link robotScriptModel.impl.IfStmtImpl#getElsestmt <em>Elsestmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends MinimalEObjectImpl.Container implements IfStmt {
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
	 * The cached value of the '{@link #getIfstmt() <em>Ifstmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfstmt()
	 * @generated
	 * @ordered
	 */
	protected Statement ifstmt;

	/**
	 * The cached value of the '{@link #getElsestmt() <em>Elsestmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsestmt()
	 * @generated
	 * @ordered
	 */
	protected Statement elsestmt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.IF_STMT;
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
					RobotScriptModelPackage.IF_STMT__EXPR, oldExpr, newExpr);
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
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.IF_STMT__EXPR, newExpr,
					newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getIfstmt() {
		return ifstmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfstmt(Statement newIfstmt, NotificationChain msgs) {
		Statement oldIfstmt = ifstmt;
		ifstmt = newIfstmt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.IF_STMT__IFSTMT, oldIfstmt, newIfstmt);
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
	public void setIfstmt(Statement newIfstmt) {
		if (newIfstmt != ifstmt) {
			NotificationChain msgs = null;
			if (ifstmt != null)
				msgs = ((InternalEObject) ifstmt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__IFSTMT, null, msgs);
			if (newIfstmt != null)
				msgs = ((InternalEObject) newIfstmt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__IFSTMT, null, msgs);
			msgs = basicSetIfstmt(newIfstmt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.IF_STMT__IFSTMT, newIfstmt,
					newIfstmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getElsestmt() {
		return elsestmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElsestmt(Statement newElsestmt, NotificationChain msgs) {
		Statement oldElsestmt = elsestmt;
		elsestmt = newElsestmt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.IF_STMT__ELSESTMT, oldElsestmt, newElsestmt);
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
	public void setElsestmt(Statement newElsestmt) {
		if (newElsestmt != elsestmt) {
			NotificationChain msgs = null;
			if (elsestmt != null)
				msgs = ((InternalEObject) elsestmt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__ELSESTMT, null, msgs);
			if (newElsestmt != null)
				msgs = ((InternalEObject) newElsestmt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.IF_STMT__ELSESTMT, null, msgs);
			msgs = basicSetElsestmt(newElsestmt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.IF_STMT__ELSESTMT,
					newElsestmt, newElsestmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.IF_STMT__EXPR:
			return basicSetExpr(null, msgs);
		case RobotScriptModelPackage.IF_STMT__IFSTMT:
			return basicSetIfstmt(null, msgs);
		case RobotScriptModelPackage.IF_STMT__ELSESTMT:
			return basicSetElsestmt(null, msgs);
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
		case RobotScriptModelPackage.IF_STMT__EXPR:
			return getExpr();
		case RobotScriptModelPackage.IF_STMT__IFSTMT:
			return getIfstmt();
		case RobotScriptModelPackage.IF_STMT__ELSESTMT:
			return getElsestmt();
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
		case RobotScriptModelPackage.IF_STMT__EXPR:
			setExpr((Expression) newValue);
			return;
		case RobotScriptModelPackage.IF_STMT__IFSTMT:
			setIfstmt((Statement) newValue);
			return;
		case RobotScriptModelPackage.IF_STMT__ELSESTMT:
			setElsestmt((Statement) newValue);
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
		case RobotScriptModelPackage.IF_STMT__EXPR:
			setExpr((Expression) null);
			return;
		case RobotScriptModelPackage.IF_STMT__IFSTMT:
			setIfstmt((Statement) null);
			return;
		case RobotScriptModelPackage.IF_STMT__ELSESTMT:
			setElsestmt((Statement) null);
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
		case RobotScriptModelPackage.IF_STMT__EXPR:
			return expr != null;
		case RobotScriptModelPackage.IF_STMT__IFSTMT:
			return ifstmt != null;
		case RobotScriptModelPackage.IF_STMT__ELSESTMT:
			return elsestmt != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStmtImpl
