/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign At Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AssignAtDecl#getVardecl <em>Vardecl</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAssignAtDecl()
 * @model
 * @generated
 */
public interface AssignAtDecl extends Assign {
	/**
	 * Returns the value of the '<em><b>Vardecl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vardecl</em>' containment reference.
	 * @see #setVardecl(VarDecl)
	 * @see robotScriptModel.RobotScriptModelPackage#getAssignAtDecl_Vardecl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VarDecl getVardecl();

	/**
	 * Sets the value of the '{@link robotScriptModel.AssignAtDecl#getVardecl <em>Vardecl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vardecl</em>' containment reference.
	 * @see #getVardecl()
	 * @generated
	 */
	void setVardecl(VarDecl value);

} // AssignAtDecl
