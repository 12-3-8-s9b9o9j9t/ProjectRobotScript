/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.LoopStmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link robotScriptModel.LoopStmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getLoopStmt()
 * @model
 * @generated
 */
public interface LoopStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getLoopStmt_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link robotScriptModel.LoopStmt#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmt</em>' containment reference.
	 * @see #setStmt(Statement)
	 * @see robotScriptModel.RobotScriptModelPackage#getLoopStmt_Stmt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStmt();

	/**
	 * Sets the value of the '{@link robotScriptModel.LoopStmt#getStmt <em>Stmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stmt</em>' containment reference.
	 * @see #getStmt()
	 * @generated
	 */
	void setStmt(Statement value);

} // LoopStmt
