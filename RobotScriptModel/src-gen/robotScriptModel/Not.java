/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Not#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends PrimaryBoolExpr {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Compare)
	 * @see robotScriptModel.RobotScriptModelPackage#getNot_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Compare getExpr();

	/**
	 * Sets the value of the '{@link robotScriptModel.Not#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Compare value);

} // Not
