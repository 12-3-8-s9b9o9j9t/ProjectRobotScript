/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ari Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.AriVariables#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAriVariables()
 * @model
 * @generated
 */
public interface AriVariables extends AriValues {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(DefVar)
	 * @see robotScriptModel.RobotScriptModelPackage#getAriVariables_Reference()
	 * @model required="true"
	 * @generated
	 */
	DefVar getReference();

	/**
	 * Sets the value of the '{@link robotScriptModel.AriVariables#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(DefVar value);

} // AriVariables
