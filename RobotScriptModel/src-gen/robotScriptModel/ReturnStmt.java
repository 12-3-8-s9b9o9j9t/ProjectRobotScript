/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.ReturnStmt#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getReturnStmt()
 * @model
 * @generated
 */
public interface ReturnStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getReturnStmt_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link robotScriptModel.ReturnStmt#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // ReturnStmt
