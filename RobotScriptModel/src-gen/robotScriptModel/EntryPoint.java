/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.EntryPoint#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.FunctionDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getEntryPoint_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionDef> getFunctions();

} // EntryPoint
