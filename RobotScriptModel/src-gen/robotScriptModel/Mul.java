/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Mul#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getMul()
 * @model
 * @generated
 */
public interface Mul extends Expression {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.PrimaryAriExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getMul_Exprs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryAriExpr> getExprs();

} // Mul
