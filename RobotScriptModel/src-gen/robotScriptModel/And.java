/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.And#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Expression {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.PrimaryBoolExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getAnd_Exprs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryBoolExpr> getExprs();

} // And
