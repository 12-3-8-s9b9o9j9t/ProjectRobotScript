/**
 */
package robotScriptModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotScriptModel.RobotScriptModelFactory
 * @model kind="package"
 * @generated
 */
public interface RobotScriptModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotScriptModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robotScriptModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotScriptModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotScriptModelPackage eINSTANCE = robotScriptModel.impl.RobotScriptModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.EntryPointImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.FunctionDefImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__INPUTS = 3;

	/**
	 * The number of structural features of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.AnyType <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.AnyType
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Statement
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 28;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.VarDecl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.VarDecl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VoidTypeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_OPERATION_COUNT = ANY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.DataTypeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ANY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Expression
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Assign <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Assign
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 7;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AssignVarImpl <em>Assign Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AssignVarImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssignVar()
	 * @generated
	 */
	int ASSIGN_VAR = 8;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_VAR__EXPR = ASSIGN__EXPR;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_VAR__VAR = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_VAR_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assign Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_VAR_OPERATION_COUNT = ASSIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SetSpeedImpl <em>Set Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SetSpeedImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSetSpeed()
	 * @generated
	 */
	int SET_SPEED = 9;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__EXPR = ASSIGN__EXPR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__UNIT = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__SPEED = ASSIGN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_OPERATION_COUNT = ASSIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.PrimaryBoolExpr <em>Primary Bool Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.PrimaryBoolExpr
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrimaryBoolExpr()
	 * @generated
	 */
	int PRIMARY_BOOL_EXPR = 10;

	/**
	 * The number of structural features of the '<em>Primary Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BOOL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BOOL_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AndImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 11;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AddImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 12;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__EXPRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.OrImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Movement <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Movement
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 14;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.RotationImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 15;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__EXPR = MOVEMENT__EXPR;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LinearImpl <em>Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LinearImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLinear()
	 * @generated
	 */
	int LINEAR = 16;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__EXPR = MOVEMENT__EXPR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__UNIT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.PrimaryAriExpr <em>Primary Ari Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.PrimaryAriExpr
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrimaryAriExpr()
	 * @generated
	 */
	int PRIMARY_ARI_EXPR = 23;

	/**
	 * The number of structural features of the '<em>Primary Ari Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_ARI_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Ari Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_ARI_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Value
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 17;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = PRIMARY_ARI_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = PRIMARY_ARI_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SensorImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 18;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LiteralImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 19;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SpeedImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 20;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VariableImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VAR = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.FunCallImpl <em>Fun Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.FunCallImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunCall()
	 * @generated
	 */
	int FUN_CALL = 22;

	/**
	 * The feature id for the '<em><b>Fun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__FUN = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__INPUTS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NotImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 24;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPR = PRIMARY_BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = PRIMARY_BOOL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = PRIMARY_BOOL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.CompareImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 25;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__EXPRS = PRIMARY_BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = PRIMARY_BOOL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION_COUNT = PRIMARY_BOOL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.MulImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 26;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__EXPRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AriUnOpImpl <em>Ari Un Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AriUnOpImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriUnOp()
	 * @generated
	 */
	int ARI_UN_OP = 27;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UN_OP__EXPR = PRIMARY_ARI_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ari Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UN_OP_FEATURE_COUNT = PRIMARY_ARI_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ari Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UN_OP_OPERATION_COUNT = PRIMARY_ARI_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BlockImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 29;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STMTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SimpleVarDeclImpl <em>Simple Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SimpleVarDeclImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSimpleVarDecl()
	 * @generated
	 */
	int SIMPLE_VAR_DECL = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VAR_DECL__TYPE = VAR_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VAR_DECL__NAME = VAR_DECL__NAME;

	/**
	 * The number of structural features of the '<em>Simple Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VAR_DECL_FEATURE_COUNT = VAR_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VAR_DECL_OPERATION_COUNT = VAR_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VarDeclInitImpl <em>Var Decl Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VarDeclInitImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVarDeclInit()
	 * @generated
	 */
	int VAR_DECL_INIT = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_INIT__TYPE = VAR_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_INIT__NAME = VAR_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_INIT__EXPR = VAR_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Decl Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_INIT_FEATURE_COUNT = VAR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Decl Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_INIT_OPERATION_COUNT = VAR_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LoopStmtImpl <em>Loop Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LoopStmtImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoopStmt()
	 * @generated
	 */
	int LOOP_STMT = 32;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STMT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STMT__STMT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.IfStmtImpl <em>If Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.IfStmtImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIfStmt()
	 * @generated
	 */
	int IF_STMT = 33;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifstmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__IFSTMT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsestmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ELSESTMT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.ReturnStmtImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getReturnStmt()
	 * @generated
	 */
	int RETURN_STMT = 34;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Unit
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 35;

	/**
	 * Returns the meta object for class '{@link robotScriptModel.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see robotScriptModel.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.EntryPoint#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see robotScriptModel.EntryPoint#getFunctions()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Functions();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see robotScriptModel.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link robotScriptModel.FunctionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotScriptModel.FunctionDef#getName()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EAttribute getFunctionDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.FunctionDef#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see robotScriptModel.FunctionDef#getReturnType()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.FunctionDef#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see robotScriptModel.FunctionDef#getBlock()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.FunctionDef#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see robotScriptModel.FunctionDef#getInputs()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Inputs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see robotScriptModel.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see robotScriptModel.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.VarDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see robotScriptModel.VarDecl#getType()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Type();

	/**
	 * Returns the meta object for the attribute '{@link robotScriptModel.VarDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotScriptModel.VarDecl#getName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_Name();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see robotScriptModel.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see robotScriptModel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robotScriptModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see robotScriptModel.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Assign#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.Assign#getExpr()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Expr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AssignVar <em>Assign Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Var</em>'.
	 * @see robotScriptModel.AssignVar
	 * @generated
	 */
	EClass getAssignVar();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.AssignVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see robotScriptModel.AssignVar#getVar()
	 * @see #getAssignVar()
	 * @generated
	 */
	EReference getAssignVar_Var();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.SetSpeed <em>Set Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Speed</em>'.
	 * @see robotScriptModel.SetSpeed
	 * @generated
	 */
	EClass getSetSpeed();

	/**
	 * Returns the meta object for the attribute '{@link robotScriptModel.SetSpeed#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see robotScriptModel.SetSpeed#getUnit()
	 * @see #getSetSpeed()
	 * @generated
	 */
	EAttribute getSetSpeed_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.SetSpeed#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see robotScriptModel.SetSpeed#getSpeed()
	 * @see #getSetSpeed()
	 * @generated
	 */
	EReference getSetSpeed_Speed();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.PrimaryBoolExpr <em>Primary Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Bool Expr</em>'.
	 * @see robotScriptModel.PrimaryBoolExpr
	 * @generated
	 */
	EClass getPrimaryBoolExpr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see robotScriptModel.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.And#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see robotScriptModel.And#getExprs()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Exprs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see robotScriptModel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Add#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see robotScriptModel.Add#getExprs()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Exprs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robotScriptModel.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Or#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see robotScriptModel.Or#getExprs()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Exprs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see robotScriptModel.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Movement#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.Movement#getExpr()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Expr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see robotScriptModel.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Linear <em>Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear</em>'.
	 * @see robotScriptModel.Linear
	 * @generated
	 */
	EClass getLinear();

	/**
	 * Returns the meta object for the attribute '{@link robotScriptModel.Linear#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see robotScriptModel.Linear#getUnit()
	 * @see #getLinear()
	 * @generated
	 */
	EAttribute getLinear_Unit();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see robotScriptModel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see robotScriptModel.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see robotScriptModel.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed</em>'.
	 * @see robotScriptModel.Speed
	 * @generated
	 */
	EClass getSpeed();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see robotScriptModel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.Variable#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see robotScriptModel.Variable#getVar()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Var();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Call</em>'.
	 * @see robotScriptModel.FunCall
	 * @generated
	 */
	EClass getFunCall();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.FunCall#getFun <em>Fun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fun</em>'.
	 * @see robotScriptModel.FunCall#getFun()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Fun();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.FunCall#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see robotScriptModel.FunCall#getInputs()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Inputs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.PrimaryAriExpr <em>Primary Ari Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Ari Expr</em>'.
	 * @see robotScriptModel.PrimaryAriExpr
	 * @generated
	 */
	EClass getPrimaryAriExpr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see robotScriptModel.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Not#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.Not#getExpr()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see robotScriptModel.Compare
	 * @generated
	 */
	EClass getCompare();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Compare#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see robotScriptModel.Compare#getExprs()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Exprs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul</em>'.
	 * @see robotScriptModel.Mul
	 * @generated
	 */
	EClass getMul();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Mul#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see robotScriptModel.Mul#getExprs()
	 * @see #getMul()
	 * @generated
	 */
	EReference getMul_Exprs();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AriUnOp <em>Ari Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Un Op</em>'.
	 * @see robotScriptModel.AriUnOp
	 * @generated
	 */
	EClass getAriUnOp();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AriUnOp#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.AriUnOp#getExpr()
	 * @see #getAriUnOp()
	 * @generated
	 */
	EReference getAriUnOp_Expr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see robotScriptModel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see robotScriptModel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Block#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see robotScriptModel.Block#getStmts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Stmts();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.SimpleVarDecl <em>Simple Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Var Decl</em>'.
	 * @see robotScriptModel.SimpleVarDecl
	 * @generated
	 */
	EClass getSimpleVarDecl();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.VarDeclInit <em>Var Decl Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl Init</em>'.
	 * @see robotScriptModel.VarDeclInit
	 * @generated
	 */
	EClass getVarDeclInit();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.VarDeclInit#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.VarDeclInit#getExpr()
	 * @see #getVarDeclInit()
	 * @generated
	 */
	EReference getVarDeclInit_Expr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.LoopStmt <em>Loop Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Stmt</em>'.
	 * @see robotScriptModel.LoopStmt
	 * @generated
	 */
	EClass getLoopStmt();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.LoopStmt#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.LoopStmt#getExpr()
	 * @see #getLoopStmt()
	 * @generated
	 */
	EReference getLoopStmt_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.LoopStmt#getStmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stmt</em>'.
	 * @see robotScriptModel.LoopStmt#getStmt()
	 * @see #getLoopStmt()
	 * @generated
	 */
	EReference getLoopStmt_Stmt();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.IfStmt <em>If Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Stmt</em>'.
	 * @see robotScriptModel.IfStmt
	 * @generated
	 */
	EClass getIfStmt();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.IfStmt#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.IfStmt#getExpr()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.IfStmt#getIfstmt <em>Ifstmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifstmt</em>'.
	 * @see robotScriptModel.IfStmt#getIfstmt()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_Ifstmt();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.IfStmt#getElsestmt <em>Elsestmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsestmt</em>'.
	 * @see robotScriptModel.IfStmt#getElsestmt()
	 * @see #getIfStmt()
	 * @generated
	 */
	EReference getIfStmt_Elsestmt();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.ReturnStmt <em>Return Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Stmt</em>'.
	 * @see robotScriptModel.ReturnStmt
	 * @generated
	 */
	EClass getReturnStmt();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.ReturnStmt#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robotScriptModel.ReturnStmt#getExpr()
	 * @see #getReturnStmt()
	 * @generated
	 */
	EReference getReturnStmt_Expr();

	/**
	 * Returns the meta object for enum '{@link robotScriptModel.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see robotScriptModel.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotScriptModelFactory getRobotScriptModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.EntryPointImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__FUNCTIONS = eINSTANCE.getEntryPoint_Functions();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.FunctionDefImpl <em>Function Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.FunctionDefImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunctionDef()
		 * @generated
		 */
		EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEF__NAME = eINSTANCE.getFunctionDef_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__RETURN_TYPE = eINSTANCE.getFunctionDef_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__BLOCK = eINSTANCE.getFunctionDef_Block();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__INPUTS = eINSTANCE.getFunctionDef_Inputs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.AnyType <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.AnyType
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.VarDecl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.VarDecl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.VoidTypeImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.DataTypeImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Expression
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Assign <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Assign
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__EXPR = eINSTANCE.getAssign_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AssignVarImpl <em>Assign Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AssignVarImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssignVar()
		 * @generated
		 */
		EClass ASSIGN_VAR = eINSTANCE.getAssignVar();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_VAR__VAR = eINSTANCE.getAssignVar_Var();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SetSpeedImpl <em>Set Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SetSpeedImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSetSpeed()
		 * @generated
		 */
		EClass SET_SPEED = eINSTANCE.getSetSpeed();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_SPEED__UNIT = eINSTANCE.getSetSpeed_Unit();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_SPEED__SPEED = eINSTANCE.getSetSpeed_Speed();

		/**
		 * The meta object literal for the '{@link robotScriptModel.PrimaryBoolExpr <em>Primary Bool Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.PrimaryBoolExpr
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrimaryBoolExpr()
		 * @generated
		 */
		EClass PRIMARY_BOOL_EXPR = eINSTANCE.getPrimaryBoolExpr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AndImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__EXPRS = eINSTANCE.getAnd_Exprs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AddImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__EXPRS = eINSTANCE.getAdd_Exprs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.OrImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__EXPRS = eINSTANCE.getOr_Exprs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Movement <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Movement
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__EXPR = eINSTANCE.getMovement_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.RotationImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LinearImpl <em>Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LinearImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLinear()
		 * @generated
		 */
		EClass LINEAR = eINSTANCE.getLinear();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR__UNIT = eINSTANCE.getLinear_Unit();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Value
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SensorImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LiteralImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SpeedImpl <em>Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SpeedImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSpeed()
		 * @generated
		 */
		EClass SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.VariableImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VAR = eINSTANCE.getVariable_Var();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.FunCallImpl <em>Fun Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.FunCallImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunCall()
		 * @generated
		 */
		EClass FUN_CALL = eINSTANCE.getFunCall();

		/**
		 * The meta object literal for the '<em><b>Fun</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__FUN = eINSTANCE.getFunCall_Fun();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__INPUTS = eINSTANCE.getFunCall_Inputs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.PrimaryAriExpr <em>Primary Ari Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.PrimaryAriExpr
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrimaryAriExpr()
		 * @generated
		 */
		EClass PRIMARY_ARI_EXPR = eINSTANCE.getPrimaryAriExpr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NotImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPR = eINSTANCE.getNot_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.CompareImpl <em>Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.CompareImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCompare()
		 * @generated
		 */
		EClass COMPARE = eINSTANCE.getCompare();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__EXPRS = eINSTANCE.getCompare_Exprs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.MulImpl <em>Mul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.MulImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMul()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMul();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL__EXPRS = eINSTANCE.getMul_Exprs();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AriUnOpImpl <em>Ari Un Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AriUnOpImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriUnOp()
		 * @generated
		 */
		EClass ARI_UN_OP = eINSTANCE.getAriUnOp();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_UN_OP__EXPR = eINSTANCE.getAriUnOp_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Statement
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.BlockImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STMTS = eINSTANCE.getBlock_Stmts();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SimpleVarDeclImpl <em>Simple Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SimpleVarDeclImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSimpleVarDecl()
		 * @generated
		 */
		EClass SIMPLE_VAR_DECL = eINSTANCE.getSimpleVarDecl();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.VarDeclInitImpl <em>Var Decl Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.VarDeclInitImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVarDeclInit()
		 * @generated
		 */
		EClass VAR_DECL_INIT = eINSTANCE.getVarDeclInit();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL_INIT__EXPR = eINSTANCE.getVarDeclInit_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LoopStmtImpl <em>Loop Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LoopStmtImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoopStmt()
		 * @generated
		 */
		EClass LOOP_STMT = eINSTANCE.getLoopStmt();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STMT__EXPR = eINSTANCE.getLoopStmt_Expr();

		/**
		 * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STMT__STMT = eINSTANCE.getLoopStmt_Stmt();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.IfStmtImpl <em>If Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.IfStmtImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIfStmt()
		 * @generated
		 */
		EClass IF_STMT = eINSTANCE.getIfStmt();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__EXPR = eINSTANCE.getIfStmt_Expr();

		/**
		 * The meta object literal for the '<em><b>Ifstmt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__IFSTMT = eINSTANCE.getIfStmt_Ifstmt();

		/**
		 * The meta object literal for the '<em><b>Elsestmt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__ELSESTMT = eINSTANCE.getIfStmt_Elsestmt();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.ReturnStmtImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getReturnStmt()
		 * @generated
		 */
		EClass RETURN_STMT = eINSTANCE.getReturnStmt();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STMT__EXPR = eINSTANCE.getReturnStmt_Expr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Unit
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

	}

} //RobotScriptModelPackage
