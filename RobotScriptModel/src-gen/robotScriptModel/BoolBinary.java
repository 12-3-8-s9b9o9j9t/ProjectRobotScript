/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.BoolBinary#getLeft <em>Left</em>}</li>
 *   <li>{@link robotScriptModel.BoolBinary#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getBoolBinary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BoolBinary extends robotScriptModel.Boolean {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(robotScriptModel.Boolean)
	 * @see robotScriptModel.RobotScriptModelPackage#getBoolBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotScriptModel.Boolean getLeft();

	/**
	 * Sets the value of the '{@link robotScriptModel.BoolBinary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(robotScriptModel.Boolean value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(robotScriptModel.Boolean)
	 * @see robotScriptModel.RobotScriptModelPackage#getBoolBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotScriptModel.Boolean getRight();

	/**
	 * Sets the value of the '{@link robotScriptModel.BoolBinary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(robotScriptModel.Boolean value);

} // BoolBinary
