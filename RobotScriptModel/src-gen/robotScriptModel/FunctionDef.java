/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.FunctionDef#getName <em>Name</em>}</li>
 *   <li>{@link robotScriptModel.FunctionDef#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link robotScriptModel.FunctionDef#getBody <em>Body</em>}</li>
 *   <li>{@link robotScriptModel.FunctionDef#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robotScriptModel.RobotScriptModelPackage#getFunctionDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robotScriptModel.FunctionDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(AnyType)
	 * @see robotScriptModel.RobotScriptModelPackage#getFunctionDef_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AnyType getReturnType();

	/**
	 * Sets the value of the '{@link robotScriptModel.FunctionDef#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(AnyType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getFunctionDef_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getBody();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.VarDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getFunctionDef_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarDecl> getInputs();

} // FunctionDef
