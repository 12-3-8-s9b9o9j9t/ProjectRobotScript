/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.IfStmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link robotScriptModel.IfStmt#getIfstmt <em>Ifstmt</em>}</li>
 *   <li>{@link robotScriptModel.IfStmt#getElsestmt <em>Elsestmt</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getIfStmt_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link robotScriptModel.IfStmt#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Ifstmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifstmt</em>' containment reference.
	 * @see #setIfstmt(Statement)
	 * @see robotScriptModel.RobotScriptModelPackage#getIfStmt_Ifstmt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getIfstmt();

	/**
	 * Sets the value of the '{@link robotScriptModel.IfStmt#getIfstmt <em>Ifstmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifstmt</em>' containment reference.
	 * @see #getIfstmt()
	 * @generated
	 */
	void setIfstmt(Statement value);

	/**
	 * Returns the value of the '<em><b>Elsestmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsestmt</em>' containment reference.
	 * @see #setElsestmt(Statement)
	 * @see robotScriptModel.RobotScriptModelPackage#getIfStmt_Elsestmt()
	 * @model containment="true"
	 * @generated
	 */
	Statement getElsestmt();

	/**
	 * Sets the value of the '{@link robotScriptModel.IfStmt#getElsestmt <em>Elsestmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsestmt</em>' containment reference.
	 * @see #getElsestmt()
	 * @generated
	 */
	void setElsestmt(Statement value);

} // IfStmt
