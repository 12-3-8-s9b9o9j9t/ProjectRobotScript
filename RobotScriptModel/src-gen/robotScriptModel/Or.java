/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Or#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Expression {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getOr_Exprs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<And> getExprs();

} // Or
