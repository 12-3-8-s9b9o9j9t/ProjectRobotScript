/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Linear#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getLinear()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Linear extends Movement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link robotScriptModel.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see robotScriptModel.Unit
	 * @see #setUnit(Unit)
	 * @see robotScriptModel.RobotScriptModelPackage#getLinear_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link robotScriptModel.Linear#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see robotScriptModel.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Linear
