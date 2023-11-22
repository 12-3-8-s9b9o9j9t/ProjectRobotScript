/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Loop#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link robotScriptModel.Loop#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(robotScriptModel.Boolean)
	 * @see robotScriptModel.RobotScriptModelPackage#getLoop_LoopCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotScriptModel.Boolean getLoopCondition();

	/**
	 * Sets the value of the '{@link robotScriptModel.Loop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(robotScriptModel.Boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getLoop_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getBody();

} // Loop
