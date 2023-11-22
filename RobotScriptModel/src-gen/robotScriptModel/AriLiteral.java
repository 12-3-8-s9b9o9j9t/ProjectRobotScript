/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ari Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AriLiteral#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAriLiteral()
 * @model
 * @generated
 */
public interface AriLiteral extends AriValues {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(Units)
	 * @see robotScriptModel.RobotScriptModelPackage#getAriLiteral_Units()
	 * @model containment="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link robotScriptModel.AriLiteral#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

} // AriLiteral
