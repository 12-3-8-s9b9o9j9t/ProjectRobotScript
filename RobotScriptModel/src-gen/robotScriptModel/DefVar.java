/**
 */
package robotScriptModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotScriptModel.DefVar#getName <em>Name</em>}</li>
 *   <li>{@link robotScriptModel.DefVar#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link robotScriptModel.DefVar#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see robotScriptModel.RobotScriptModelPackage#getDefVar()
 * @model
 * @generated
 */
public interface DefVar extends Command {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robotScriptModel.RobotScriptModelPackage#getDefVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robotScriptModel.DefVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference.
	 * @see #setExpressions(Expressions)
	 * @see robotScriptModel.RobotScriptModelPackage#getDefVar_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressions getExpressions();

	/**
	 * Sets the value of the '{@link robotScriptModel.DefVar#getExpressions <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' containment reference.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(Expressions value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(Units)
	 * @see robotScriptModel.RobotScriptModelPackage#getDefVar_Units()
	 * @model containment="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link robotScriptModel.DefVar#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

} // DefVar
