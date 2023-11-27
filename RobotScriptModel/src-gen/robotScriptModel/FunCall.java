/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.FunCall#getFun <em>Fun</em>}</li>
 *   <li>{@link robotScriptModel.FunCall#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends Value, Command {
	/**
	 * Returns the value of the '<em><b>Fun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fun</em>' reference.
	 * @see #setFun(FunctionDef)
	 * @see robotScriptModel.RobotScriptModelPackage#getFunCall_Fun()
	 * @model required="true"
	 * @generated
	 */
	FunctionDef getFun();

	/**
	 * Sets the value of the '{@link robotScriptModel.FunCall#getFun <em>Fun</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fun</em>' reference.
	 * @see #getFun()
	 * @generated
	 */
	void setFun(FunctionDef value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getFunCall_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getInputs();

} // FunCall
