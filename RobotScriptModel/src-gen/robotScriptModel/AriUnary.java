/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ari Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AriUnary#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAriUnary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AriUnary extends Arithmetic {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Arithmetic)
	 * @see robotScriptModel.RobotScriptModelPackage#getAriUnary_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arithmetic getOperand();

	/**
	 * Sets the value of the '{@link robotScriptModel.AriUnary#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Arithmetic value);

} // AriUnary
