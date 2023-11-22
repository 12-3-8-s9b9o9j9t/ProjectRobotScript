/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ari Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AriBinary#getRight <em>Right</em>}</li>
 *   <li>{@link robotScriptModel.AriBinary#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAriBinary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AriBinary extends Arithmetic {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Arithmetic)
	 * @see robotScriptModel.RobotScriptModelPackage#getAriBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arithmetic getRight();

	/**
	 * Sets the value of the '{@link robotScriptModel.AriBinary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Arithmetic value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Arithmetic)
	 * @see robotScriptModel.RobotScriptModelPackage#getAriBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arithmetic getLeft();

	/**
	 * Sets the value of the '{@link robotScriptModel.AriBinary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Arithmetic value);

} // AriBinary
