/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Compare#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends PrimaryBoolExpr {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Add}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getCompare_Exprs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Add> getExprs();

} // Compare
