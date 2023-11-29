/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Add#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Expression {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Mul}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getAdd_Exprs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mul> getExprs();

} // Add
