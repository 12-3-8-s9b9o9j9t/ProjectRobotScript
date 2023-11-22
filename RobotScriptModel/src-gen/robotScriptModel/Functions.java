/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Functions#getDefvar <em>Defvar</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getFunctions()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Functions extends Command {
	/**
	 * Returns the value of the '<em><b>Defvar</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defvar</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getFunctions_Defvar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getDefvar();

} // Functions
