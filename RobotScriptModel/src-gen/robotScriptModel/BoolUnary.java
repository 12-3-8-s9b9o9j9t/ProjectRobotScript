/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.BoolUnary#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getBoolUnary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BoolUnary extends robotScriptModel.Boolean {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(robotScriptModel.Boolean)
	 * @see robotScriptModel.RobotScriptModelPackage#getBoolUnary_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotScriptModel.Boolean getOperand();

	/**
	 * Sets the value of the '{@link robotScriptModel.BoolUnary#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(robotScriptModel.Boolean value);

} // BoolUnary
