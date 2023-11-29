/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.SetSpeed#getUnit <em>Unit</em>}</li>
 *   <li>{@link robotScriptModel.SetSpeed#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getSetSpeed()
 * @model
 * @generated
 */
public interface SetSpeed extends Assign {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link robotScriptModel.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see robotScriptModel.Unit
	 * @see #setUnit(Unit)
	 * @see robotScriptModel.RobotScriptModelPackage#getSetSpeed_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link robotScriptModel.SetSpeed#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see robotScriptModel.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(Speed)
	 * @see robotScriptModel.RobotScriptModelPackage#getSetSpeed_Speed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Speed getSpeed();

	/**
	 * Sets the value of the '{@link robotScriptModel.SetSpeed#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Speed value);

} // SetSpeed
