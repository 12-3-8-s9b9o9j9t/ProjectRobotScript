/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Switch#getSwitchCondition <em>Switch Condition</em>}</li>
 *   <li>{@link robotScriptModel.Switch#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Switch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Condition</em>' containment reference.
	 * @see #setSwitchCondition(robotScriptModel.Boolean)
	 * @see robotScriptModel.RobotScriptModelPackage#getSwitch_SwitchCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotScriptModel.Boolean getSwitchCondition();

	/**
	 * Sets the value of the '{@link robotScriptModel.Switch#getSwitchCondition <em>Switch Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Condition</em>' containment reference.
	 * @see #getSwitchCondition()
	 * @generated
	 */
	void setSwitchCondition(robotScriptModel.Boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getSwitch_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getBody();

} // Switch
