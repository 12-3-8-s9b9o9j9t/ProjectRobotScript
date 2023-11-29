/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.VarDeclInit#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getVarDeclInit()
 * @model
 * @generated
 */
public interface VarDeclInit extends VarDecl {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getVarDeclInit_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link robotScriptModel.VarDeclInit#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // VarDeclInit
