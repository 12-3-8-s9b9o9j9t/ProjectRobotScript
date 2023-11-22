/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Model#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getModel_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

} // Model
