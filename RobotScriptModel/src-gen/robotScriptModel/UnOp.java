/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.UnOp#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getUnOp()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UnOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getUnOp_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOp();

	/**
	 * Sets the value of the '{@link robotScriptModel.UnOp#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Expression value);

} // UnOp
