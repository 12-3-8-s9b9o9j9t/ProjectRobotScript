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
import robotScriptModel.LoopStmt;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.impl.LoopStmtImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link robotScriptModel.impl.LoopStmtImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopStmtImpl extends MinimalEObjectImpl.Container implements LoopStmt {
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
	 * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStmt()
	 * @generated
	 * @ordered
	 */
	protected Statement stmt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotScriptModelPackage.Literals.LOOP_STMT;
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
					RobotScriptModelPackage.LOOP_STMT__EXPR, oldExpr, newExpr);
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
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP_STMT__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP_STMT__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.LOOP_STMT__EXPR, newExpr,
					newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getStmt() {
		return stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStmt(Statement newStmt, NotificationChain msgs) {
		Statement oldStmt = stmt;
		stmt = newStmt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotScriptModelPackage.LOOP_STMT__STMT, oldStmt, newStmt);
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
	public void setStmt(Statement newStmt) {
		if (newStmt != stmt) {
			NotificationChain msgs = null;
			if (stmt != null)
				msgs = ((InternalEObject) stmt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP_STMT__STMT, null, msgs);
			if (newStmt != null)
				msgs = ((InternalEObject) newStmt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotScriptModelPackage.LOOP_STMT__STMT, null, msgs);
			msgs = basicSetStmt(newStmt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotScriptModelPackage.LOOP_STMT__STMT, newStmt,
					newStmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotScriptModelPackage.LOOP_STMT__EXPR:
			return basicSetExpr(null, msgs);
		case RobotScriptModelPackage.LOOP_STMT__STMT:
			return basicSetStmt(null, msgs);
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
		case RobotScriptModelPackage.LOOP_STMT__EXPR:
			return getExpr();
		case RobotScriptModelPackage.LOOP_STMT__STMT:
			return getStmt();
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
		case RobotScriptModelPackage.LOOP_STMT__EXPR:
			setExpr((Expression) newValue);
			return;
		case RobotScriptModelPackage.LOOP_STMT__STMT:
			setStmt((Statement) newValue);
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
		case RobotScriptModelPackage.LOOP_STMT__EXPR:
			setExpr((Expression) null);
			return;
		case RobotScriptModelPackage.LOOP_STMT__STMT:
			setStmt((Statement) null);
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
		case RobotScriptModelPackage.LOOP_STMT__EXPR:
			return expr != null;
		case RobotScriptModelPackage.LOOP_STMT__STMT:
			return stmt != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopStmtImpl
