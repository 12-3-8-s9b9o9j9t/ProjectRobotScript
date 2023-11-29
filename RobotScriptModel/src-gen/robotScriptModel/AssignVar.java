/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AssignVar#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAssignVar()
 * @model
 * @generated
 */
public interface AssignVar extends Assign {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(VarDecl)
	 * @see robotScriptModel.RobotScriptModelPackage#getAssignVar_Var()
	 * @model required="true"
	 * @generated
	 */
	VarDecl getVar();

	/**
	 * Sets the value of the '{@link robotScriptModel.AssignVar#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarDecl value);

} // AssignVar
