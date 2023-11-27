/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.IfElse#getBodyElse <em>Body Else</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getIfElse()
 * @model
 * @generated
 */
public interface IfElse extends If {
	/**
	 * Returns the value of the '<em><b>Body Else</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Else</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getIfElse_BodyElse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getBodyElse();

} // IfElse
