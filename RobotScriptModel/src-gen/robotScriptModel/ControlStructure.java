/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.ControlStructure#getBody <em>Body</em>}</li>
 *   <li>{@link robotScriptModel.ControlStructure#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getControlStructure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ControlStructure extends Command {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getControlStructure_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getBody();

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getControlStructure_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCond();

	/**
	 * Sets the value of the '{@link robotScriptModel.ControlStructure#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expression value);

} // ControlStructure
