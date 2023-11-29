/**
 */
package robotScriptModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.Block#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link robotScriptModel.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see robotScriptModel.RobotScriptModelPackage#getBlock_Stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStmts();

} // Block
