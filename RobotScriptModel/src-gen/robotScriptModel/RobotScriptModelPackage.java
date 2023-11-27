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
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__BODY = 2;

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
	 * The meta object id for the '{@link robotScriptModel.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Command
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VarDeclImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VoidTypeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 5;

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
	 * The meta object id for the '{@link robotScriptModel.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.DataType
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

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
	 * The meta object id for the '{@link robotScriptModel.impl.NumberTypeImpl <em>Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NumberTypeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumberType()
	 * @generated
	 */
	int NUMBER_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BooleanTypeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.ControlStructure <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.ControlStructure
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 13;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__BODY = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__COND = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LoopImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = CONTROL_STRUCTURE__BODY;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__COND = CONTROL_STRUCTURE__COND;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.IfImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 10;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BODY = CONTROL_STRUCTURE__BODY;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = CONTROL_STRUCTURE__COND;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.IfElseImpl <em>If Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.IfElseImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIfElse()
	 * @generated
	 */
	int IF_ELSE = 11;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__BODY = IF__BODY;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__COND = IF__COND;

	/**
	 * The feature id for the '<em><b>Body Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__BODY_ELSE = IF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_FEATURE_COUNT = IF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>If Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_OPERATION_COUNT = IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Expression
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

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
	int ASSIGN = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXPRESSION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AssignAtDeclImpl <em>Assign At Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AssignAtDeclImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssignAtDecl()
	 * @generated
	 */
	int ASSIGN_AT_DECL = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_AT_DECL__EXPRESSION = ASSIGN__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Vardecl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_AT_DECL__VARDECL = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign At Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_AT_DECL_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assign At Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_AT_DECL_OPERATION_COUNT = ASSIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.ReAssignImpl <em>Re Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.ReAssignImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getReAssign()
	 * @generated
	 */
	int RE_ASSIGN = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_ASSIGN__EXPRESSION = ASSIGN__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_ASSIGN__VAR = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Re Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_ASSIGN_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Re Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_ASSIGN_OPERATION_COUNT = ASSIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SetSpeedImpl <em>Set Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SetSpeedImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSetSpeed()
	 * @generated
	 */
	int SET_SPEED = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__EXPRESSION = ASSIGN__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__UNIT = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speedstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__SPEEDSTATE = ASSIGN_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link robotScriptModel.UnOp <em>Un Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.UnOp
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnOp()
	 * @generated
	 */
	int UN_OP = 18;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.BinOp <em>Bin Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.BinOp
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBinOp()
	 * @generated
	 */
	int BIN_OP = 19;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__RIGHT_OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__LEFT_OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NegImpl <em>Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NegImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNeg()
	 * @generated
	 */
	int NEG = 20;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG__OP = UN_OP__OP;

	/**
	 * The number of structural features of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_FEATURE_COUNT = UN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_OPERATION_COUNT = UN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NotImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 21;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OP = UN_OP__OP;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.GreaterImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 22;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AndImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 23;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AddImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 24;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LessImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 25;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.OrImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 26;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SubImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 27;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.GEqImpl <em>GEq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.GEqImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getGEq()
	 * @generated
	 */
	int GEQ = 28;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQ__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQ__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>GEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQ_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQ_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.EquImpl <em>Equ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.EquImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getEqu()
	 * @generated
	 */
	int EQU = 29;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQU__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQU__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Equ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQU_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQU_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.MulImpl <em>Mul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.MulImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMul()
	 * @generated
	 */
	int MUL = 30;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LEqImpl <em>LEq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LEqImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLEq()
	 * @generated
	 */
	int LEQ = 31;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEQ__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEQ__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>LEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEQ_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEQ_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NEqImpl <em>NEq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NEqImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNEq()
	 * @generated
	 */
	int NEQ = 32;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEQ__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEQ__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>NEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEQ_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NEq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEQ_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.DivImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 33;

	/**
	 * The feature id for the '<em><b>Right Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__RIGHT_OP = BIN_OP__RIGHT_OP;

	/**
	 * The feature id for the '<em><b>Left Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LEFT_OP = BIN_OP__LEFT_OP;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Movement <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Movement
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 34;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__EXPRESSION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.RotationImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 35;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__EXPRESSION = MOVEMENT__EXPRESSION;

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
	 * The meta object id for the '{@link robotScriptModel.Linear <em>Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Linear
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLinear()
	 * @generated
	 */
	int LINEAR = 36;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__EXPRESSION = MOVEMENT__EXPRESSION;

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
	 * The meta object id for the '{@link robotScriptModel.impl.FrontImpl <em>Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.FrontImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFront()
	 * @generated
	 */
	int FRONT = 37;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__EXPRESSION = LINEAR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT__UNIT = LINEAR__UNIT;

	/**
	 * The number of structural features of the '<em>Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT_FEATURE_COUNT = LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONT_OPERATION_COUNT = LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BackImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBack()
	 * @generated
	 */
	int BACK = 38;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__EXPRESSION = LINEAR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK__UNIT = LINEAR__UNIT;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_OPERATION_COUNT = LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.RightImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 39;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__EXPRESSION = LINEAR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__UNIT = LINEAR__UNIT;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LeftImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 40;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__EXPRESSION = LINEAR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__UNIT = LINEAR__UNIT;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Value
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 41;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.TimeSensorImpl <em>Time Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.TimeSensorImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getTimeSensor()
	 * @generated
	 */
	int TIME_SENSOR = 42;

	/**
	 * The number of structural features of the '<em>Time Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SENSOR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SENSOR_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.DistSensorImpl <em>Dist Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.DistSensorImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDistSensor()
	 * @generated
	 */
	int DIST_SENSOR = 43;

	/**
	 * The number of structural features of the '<em>Dist Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIST_SENSOR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dist Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIST_SENSOR_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BoolLiteralImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolLiteral()
	 * @generated
	 */
	int BOOL_LITERAL = 44;

	/**
	 * The number of structural features of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NumberLiteralImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 45;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SpeedStateImpl <em>Speed State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SpeedStateImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSpeedState()
	 * @generated
	 */
	int SPEED_STATE = 46;

	/**
	 * The number of structural features of the '<em>Speed State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_STATE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speed State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_STATE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.VariableImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 47;

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
	int FUN_CALL = 48;

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
	 * The meta object id for the '{@link robotScriptModel.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Unit
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 49;

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
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.FunctionDef#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotScriptModel.FunctionDef#getBody()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Body();

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
	 * Returns the meta object for class '{@link robotScriptModel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see robotScriptModel.Command
	 * @generated
	 */
	EClass getCommand();

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
	 * Returns the meta object for class '{@link robotScriptModel.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see robotScriptModel.NumberType
	 * @generated
	 */
	EClass getNumberType();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see robotScriptModel.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see robotScriptModel.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see robotScriptModel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.IfElse <em>If Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Else</em>'.
	 * @see robotScriptModel.IfElse
	 * @generated
	 */
	EClass getIfElse();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.IfElse#getBodyElse <em>Body Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Else</em>'.
	 * @see robotScriptModel.IfElse#getBodyElse()
	 * @see #getIfElse()
	 * @generated
	 */
	EReference getIfElse_BodyElse();

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
	 * Returns the meta object for class '{@link robotScriptModel.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see robotScriptModel.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.ControlStructure#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotScriptModel.ControlStructure#getBody()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Body();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.ControlStructure#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see robotScriptModel.ControlStructure#getCond()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Cond();

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
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Assign#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robotScriptModel.Assign#getExpression()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Expression();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AssignAtDecl <em>Assign At Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign At Decl</em>'.
	 * @see robotScriptModel.AssignAtDecl
	 * @generated
	 */
	EClass getAssignAtDecl();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AssignAtDecl#getVardecl <em>Vardecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vardecl</em>'.
	 * @see robotScriptModel.AssignAtDecl#getVardecl()
	 * @see #getAssignAtDecl()
	 * @generated
	 */
	EReference getAssignAtDecl_Vardecl();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.ReAssign <em>Re Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Assign</em>'.
	 * @see robotScriptModel.ReAssign
	 * @generated
	 */
	EClass getReAssign();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.ReAssign#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see robotScriptModel.ReAssign#getVar()
	 * @see #getReAssign()
	 * @generated
	 */
	EReference getReAssign_Var();

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
	 * Returns the meta object for the reference '{@link robotScriptModel.SetSpeed#getSpeedstate <em>Speedstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speedstate</em>'.
	 * @see robotScriptModel.SetSpeed#getSpeedstate()
	 * @see #getSetSpeed()
	 * @generated
	 */
	EReference getSetSpeed_Speedstate();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.UnOp <em>Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Op</em>'.
	 * @see robotScriptModel.UnOp
	 * @generated
	 */
	EClass getUnOp();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.UnOp#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see robotScriptModel.UnOp#getOp()
	 * @see #getUnOp()
	 * @generated
	 */
	EReference getUnOp_Op();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op</em>'.
	 * @see robotScriptModel.BinOp
	 * @generated
	 */
	EClass getBinOp();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.BinOp#getRightOp <em>Right Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Op</em>'.
	 * @see robotScriptModel.BinOp#getRightOp()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_RightOp();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.BinOp#getLeftOp <em>Left Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Op</em>'.
	 * @see robotScriptModel.BinOp#getLeftOp()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_LeftOp();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg</em>'.
	 * @see robotScriptModel.Neg
	 * @generated
	 */
	EClass getNeg();

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
	 * Returns the meta object for class '{@link robotScriptModel.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see robotScriptModel.Greater
	 * @generated
	 */
	EClass getGreater();

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
	 * Returns the meta object for class '{@link robotScriptModel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see robotScriptModel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see robotScriptModel.Less
	 * @generated
	 */
	EClass getLess();

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
	 * Returns the meta object for class '{@link robotScriptModel.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see robotScriptModel.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.GEq <em>GEq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEq</em>'.
	 * @see robotScriptModel.GEq
	 * @generated
	 */
	EClass getGEq();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Equ <em>Equ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equ</em>'.
	 * @see robotScriptModel.Equ
	 * @generated
	 */
	EClass getEqu();

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
	 * Returns the meta object for class '{@link robotScriptModel.LEq <em>LEq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEq</em>'.
	 * @see robotScriptModel.LEq
	 * @generated
	 */
	EClass getLEq();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.NEq <em>NEq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NEq</em>'.
	 * @see robotScriptModel.NEq
	 * @generated
	 */
	EClass getNEq();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see robotScriptModel.Div
	 * @generated
	 */
	EClass getDiv();

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
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Movement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robotScriptModel.Movement#getExpression()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Expression();

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
	 * Returns the meta object for class '{@link robotScriptModel.Front <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Front</em>'.
	 * @see robotScriptModel.Front
	 * @generated
	 */
	EClass getFront();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see robotScriptModel.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see robotScriptModel.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see robotScriptModel.Left
	 * @generated
	 */
	EClass getLeft();

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
	 * Returns the meta object for class '{@link robotScriptModel.TimeSensor <em>Time Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sensor</em>'.
	 * @see robotScriptModel.TimeSensor
	 * @generated
	 */
	EClass getTimeSensor();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.DistSensor <em>Dist Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dist Sensor</em>'.
	 * @see robotScriptModel.DistSensor
	 * @generated
	 */
	EClass getDistSensor();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BoolLiteral <em>Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Literal</em>'.
	 * @see robotScriptModel.BoolLiteral
	 * @generated
	 */
	EClass getBoolLiteral();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see robotScriptModel.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.SpeedState <em>Speed State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed State</em>'.
	 * @see robotScriptModel.SpeedState
	 * @generated
	 */
	EClass getSpeedState();

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
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEF__BODY = eINSTANCE.getFunctionDef_Body();

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
		 * The meta object literal for the '{@link robotScriptModel.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Command
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.VarDeclImpl
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
		 * The meta object literal for the '{@link robotScriptModel.DataType <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.DataType
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NumberTypeImpl <em>Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NumberTypeImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumberType()
		 * @generated
		 */
		EClass NUMBER_TYPE = eINSTANCE.getNumberType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.BooleanTypeImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LoopImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.IfImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.IfElseImpl <em>If Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.IfElseImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getIfElse()
		 * @generated
		 */
		EClass IF_ELSE = eINSTANCE.getIfElse();

		/**
		 * The meta object literal for the '<em><b>Body Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_ELSE__BODY_ELSE = eINSTANCE.getIfElse_BodyElse();

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
		 * The meta object literal for the '{@link robotScriptModel.ControlStructure <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.ControlStructure
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__BODY = eINSTANCE.getControlStructure_Body();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__COND = eINSTANCE.getControlStructure_Cond();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__EXPRESSION = eINSTANCE.getAssign_Expression();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AssignAtDeclImpl <em>Assign At Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AssignAtDeclImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAssignAtDecl()
		 * @generated
		 */
		EClass ASSIGN_AT_DECL = eINSTANCE.getAssignAtDecl();

		/**
		 * The meta object literal for the '<em><b>Vardecl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_AT_DECL__VARDECL = eINSTANCE.getAssignAtDecl_Vardecl();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.ReAssignImpl <em>Re Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.ReAssignImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getReAssign()
		 * @generated
		 */
		EClass RE_ASSIGN = eINSTANCE.getReAssign();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RE_ASSIGN__VAR = eINSTANCE.getReAssign_Var();

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
		 * The meta object literal for the '<em><b>Speedstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_SPEED__SPEEDSTATE = eINSTANCE.getSetSpeed_Speedstate();

		/**
		 * The meta object literal for the '{@link robotScriptModel.UnOp <em>Un Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.UnOp
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnOp()
		 * @generated
		 */
		EClass UN_OP = eINSTANCE.getUnOp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_OP__OP = eINSTANCE.getUnOp_Op();

		/**
		 * The meta object literal for the '{@link robotScriptModel.BinOp <em>Bin Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.BinOp
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBinOp()
		 * @generated
		 */
		EClass BIN_OP = eINSTANCE.getBinOp();

		/**
		 * The meta object literal for the '<em><b>Right Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__RIGHT_OP = eINSTANCE.getBinOp_RightOp();

		/**
		 * The meta object literal for the '<em><b>Left Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__LEFT_OP = eINSTANCE.getBinOp_LeftOp();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NegImpl <em>Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NegImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNeg()
		 * @generated
		 */
		EClass NEG = eINSTANCE.getNeg();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.GreaterImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AddImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LessImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SubImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.GEqImpl <em>GEq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.GEqImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getGEq()
		 * @generated
		 */
		EClass GEQ = eINSTANCE.getGEq();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.EquImpl <em>Equ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.EquImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getEqu()
		 * @generated
		 */
		EClass EQU = eINSTANCE.getEqu();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.LEqImpl <em>LEq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LEqImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLEq()
		 * @generated
		 */
		EClass LEQ = eINSTANCE.getLEq();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NEqImpl <em>NEq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NEqImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNEq()
		 * @generated
		 */
		EClass NEQ = eINSTANCE.getNEq();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.DivImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__EXPRESSION = eINSTANCE.getMovement_Expression();

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
		 * The meta object literal for the '{@link robotScriptModel.Linear <em>Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Linear
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
		 * The meta object literal for the '{@link robotScriptModel.impl.FrontImpl <em>Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.FrontImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFront()
		 * @generated
		 */
		EClass FRONT = eINSTANCE.getFront();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.BackImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.RightImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LeftImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.TimeSensorImpl <em>Time Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.TimeSensorImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getTimeSensor()
		 * @generated
		 */
		EClass TIME_SENSOR = eINSTANCE.getTimeSensor();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.DistSensorImpl <em>Dist Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.DistSensorImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDistSensor()
		 * @generated
		 */
		EClass DIST_SENSOR = eINSTANCE.getDistSensor();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.BoolLiteralImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolLiteral()
		 * @generated
		 */
		EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NumberLiteralImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SpeedStateImpl <em>Speed State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SpeedStateImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSpeedState()
		 * @generated
		 */
		EClass SPEED_STATE = eINSTANCE.getSpeedState();

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
