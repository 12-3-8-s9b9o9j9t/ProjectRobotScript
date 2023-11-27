/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.BinOp#getRightOp <em>Right Op</em>}</li>
 *   <li>{@link robotScriptModel.BinOp#getLeftOp <em>Left Op</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getBinOp()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BinOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Op</em>' containment reference.
	 * @see #setRightOp(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getBinOp_RightOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOp();

	/**
	 * Sets the value of the '{@link robotScriptModel.BinOp#getRightOp <em>Right Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Op</em>' containment reference.
	 * @see #getRightOp()
	 * @generated
	 */
	void setRightOp(Expression value);

	/**
	 * Returns the value of the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Op</em>' containment reference.
	 * @see #setLeftOp(Expression)
	 * @see robotScriptModel.RobotScriptModelPackage#getBinOp_LeftOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftOp();

	/**
	 * Sets the value of the '{@link robotScriptModel.BinOp#getLeftOp <em>Left Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Op</em>' containment reference.
	 * @see #getLeftOp()
	 * @generated
	 */
	void setLeftOp(Expression value);

} // BinOp
