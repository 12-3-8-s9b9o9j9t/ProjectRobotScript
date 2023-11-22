/**
 */
package robotScriptModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Units#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getUnits()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Units extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(Prefix)
	 * @see robotScriptModel.RobotScriptModelPackage#getUnits_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	Prefix getPrefix();

	/**
	 * Sets the value of the '{@link robotScriptModel.Units#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(Prefix value);

} // Units
