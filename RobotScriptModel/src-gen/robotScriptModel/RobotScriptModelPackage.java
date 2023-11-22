/**
 */
package robotScriptModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link robotScriptModel.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Command
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 35;

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
	 * The meta object id for the '{@link robotScriptModel.Functions <em>Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Functions
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunctions()
	 * @generated
	 */
	int FUNCTIONS = 6;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__DEFVAR = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Movement <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Movement
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 0;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DEFVAR = FUNCTIONS__DEFVAR;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.RotationImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 1;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__DEFVAR = MOVEMENT__DEFVAR;

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
	 * The meta object id for the '{@link robotScriptModel.Sensors <em>Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Sensors
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSensors()
	 * @generated
	 */
	int SENSORS = 2;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS__DEFVAR = FUNCTIONS__DEFVAR;

	/**
	 * The number of structural features of the '<em>Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Units <em>Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Units
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS__PREFIX = 0;

	/**
	 * The number of structural features of the '<em>Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.ControlStructure <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.ControlStructure
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 4;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.ModelImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Expressions <em>Expressions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Expressions
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getExpressions()
	 * @generated
	 */
	int EXPRESSIONS = 16;

	/**
	 * The number of structural features of the '<em>Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Boolean <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Boolean
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 17;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = EXPRESSIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = EXPRESSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.BoolValues <em>Bool Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.BoolValues
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolValues()
	 * @generated
	 */
	int BOOL_VALUES = 24;

	/**
	 * The number of structural features of the '<em>Bool Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUES_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUES_OPERATION_COUNT = BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BoolVariablesImpl <em>Bool Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BoolVariablesImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolVariables()
	 * @generated
	 */
	int BOOL_VARIABLES = 7;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VARIABLES__REFERENCE = BOOL_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VARIABLES_FEATURE_COUNT = BOOL_VALUES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VARIABLES_OPERATION_COUNT = BOOL_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LinearImpl <em>Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LinearImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLinear()
	 * @generated
	 */
	int LINEAR = 8;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__DEFVAR = MOVEMENT__DEFVAR;

	/**
	 * The number of structural features of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.ClockImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 9;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DEFVAR = SENSORS__DEFVAR;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = SENSORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = SENSORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.UltraSoundImpl <em>Ultra Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.UltraSoundImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUltraSound()
	 * @generated
	 */
	int ULTRA_SOUND = 10;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SOUND__DEFVAR = SENSORS__DEFVAR;

	/**
	 * The number of structural features of the '<em>Ultra Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SOUND_FEATURE_COUNT = SENSORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ultra Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SOUND_OPERATION_COUNT = SENSORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.State
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 36;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DEFVAR = FUNCTIONS__DEFVAR;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SpeedImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 11;

	/**
	 * The feature id for the '<em><b>Defvar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__DEFVAR = STATE__DEFVAR;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.LoopImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 12;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_CONDITION = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.MeterImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 13;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__PREFIX = UNITS__PREFIX;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = UNITS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = UNITS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SecondImpl <em>Second</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SecondImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSecond()
	 * @generated
	 */
	int SECOND = 14;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND__PREFIX = UNITS__PREFIX;

	/**
	 * The number of structural features of the '<em>Second</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_FEATURE_COUNT = UNITS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Second</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_OPERATION_COUNT = UNITS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SwitchImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 15;

	/**
	 * The feature id for the '<em><b>Switch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCH_CONDITION = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BODY = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.BoolBinary <em>Bool Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.BoolBinary
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolBinary()
	 * @generated
	 */
	int BOOL_BINARY = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_BINARY__LEFT = BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_BINARY__RIGHT = BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_BINARY_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bool Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_BINARY_OPERATION_COUNT = BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.BoolUnary <em>Bool Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.BoolUnary
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolUnary()
	 * @generated
	 */
	int BOOL_UNARY = 19;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_UNARY__OPERAND = BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_UNARY_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_UNARY_OPERATION_COUNT = BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AndImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOL_BINARY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOL_BINARY__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.OrImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOL_BINARY__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOL_BINARY__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Arithmetic <em>Arithmetic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Arithmetic
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getArithmetic()
	 * @generated
	 */
	int ARITHMETIC = 22;

	/**
	 * The number of structural features of the '<em>Arithmetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_FEATURE_COUNT = EXPRESSIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_COUNT = EXPRESSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NotImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 23;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = BOOL_UNARY__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOL_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOL_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.BoolLiteralImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolLiteral()
	 * @generated
	 */
	int BOOL_LITERAL = 25;

	/**
	 * The number of structural features of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_FEATURE_COUNT = BOOL_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_OPERATION_COUNT = BOOL_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.AriBinary <em>Ari Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.AriBinary
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriBinary()
	 * @generated
	 */
	int ARI_BINARY = 26;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_BINARY__RIGHT = ARITHMETIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_BINARY__LEFT = ARITHMETIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ari Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_BINARY_FEATURE_COUNT = ARITHMETIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ari Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_BINARY_OPERATION_COUNT = ARITHMETIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.AriUnary <em>Ari Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.AriUnary
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriUnary()
	 * @generated
	 */
	int ARI_UNARY = 27;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UNARY__OPERAND = ARITHMETIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ari Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UNARY_FEATURE_COUNT = ARITHMETIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ari Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_UNARY_OPERATION_COUNT = ARITHMETIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AddImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 28;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__RIGHT = ARI_BINARY__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LEFT = ARI_BINARY__LEFT;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = ARI_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = ARI_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.AriValues <em>Ari Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.AriValues
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriValues()
	 * @generated
	 */
	int ARI_VALUES = 29;

	/**
	 * The number of structural features of the '<em>Ari Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_VALUES_FEATURE_COUNT = ARITHMETIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ari Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_VALUES_OPERATION_COUNT = ARITHMETIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AriLiteralImpl <em>Ari Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AriLiteralImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriLiteral()
	 * @generated
	 */
	int ARI_LITERAL = 30;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_LITERAL__UNITS = ARI_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ari Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_LITERAL_FEATURE_COUNT = ARI_VALUES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ari Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_LITERAL_OPERATION_COUNT = ARI_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.AriVariablesImpl <em>Ari Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.AriVariablesImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriVariables()
	 * @generated
	 */
	int ARI_VARIABLES = 31;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_VARIABLES__REFERENCE = ARI_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ari Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_VARIABLES_FEATURE_COUNT = ARI_VALUES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ari Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARI_VARIABLES_OPERATION_COUNT = ARI_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.SubImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 32;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__RIGHT = ARI_BINARY__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__LEFT = ARI_BINARY__LEFT;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = ARI_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = ARI_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NegImpl <em>Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NegImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNeg()
	 * @generated
	 */
	int NEG = 33;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG__OPERAND = ARI_UNARY__OPERAND;

	/**
	 * The number of structural features of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_FEATURE_COUNT = ARI_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_OPERATION_COUNT = ARI_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.DefVarImpl <em>Def Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.DefVarImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDefVar()
	 * @generated
	 */
	int DEF_VAR = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VAR__NAME = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VAR__EXPRESSIONS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VAR__UNITS = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Def Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VAR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Def Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VAR_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.Prefix <em>Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.Prefix
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrefix()
	 * @generated
	 */
	int PREFIX = 37;

	/**
	 * The number of structural features of the '<em>Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.MiliImpl <em>Mili</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.MiliImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMili()
	 * @generated
	 */
	int MILI = 38;

	/**
	 * The number of structural features of the '<em>Mili</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILI_FEATURE_COUNT = PREFIX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mili</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILI_OPERATION_COUNT = PREFIX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.CentiImpl <em>Centi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.CentiImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCenti()
	 * @generated
	 */
	int CENTI = 39;

	/**
	 * The number of structural features of the '<em>Centi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTI_FEATURE_COUNT = PREFIX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Centi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTI_OPERATION_COUNT = PREFIX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.DegreeImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 40;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__PREFIX = UNITS__PREFIX;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = UNITS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OPERATION_COUNT = UNITS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotScriptModel.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotScriptModel.impl.NumberImpl
	 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 41;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link robotScriptModel.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see robotScriptModel.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Sensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensors</em>'.
	 * @see robotScriptModel.Sensors
	 * @generated
	 */
	EClass getSensors();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Units</em>'.
	 * @see robotScriptModel.Units
	 * @generated
	 */
	EClass getUnits();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Units#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see robotScriptModel.Units#getPrefix()
	 * @see #getUnits()
	 * @generated
	 */
	EReference getUnits_Prefix();

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
	 * Returns the meta object for class '{@link robotScriptModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see robotScriptModel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Model#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see robotScriptModel.Model#getCommand()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Command();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions</em>'.
	 * @see robotScriptModel.Functions
	 * @generated
	 */
	EClass getFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Functions#getDefvar <em>Defvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defvar</em>'.
	 * @see robotScriptModel.Functions#getDefvar()
	 * @see #getFunctions()
	 * @generated
	 */
	EReference getFunctions_Defvar();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BoolVariables <em>Bool Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Variables</em>'.
	 * @see robotScriptModel.BoolVariables
	 * @generated
	 */
	EClass getBoolVariables();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.BoolVariables#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see robotScriptModel.BoolVariables#getReference()
	 * @see #getBoolVariables()
	 * @generated
	 */
	EReference getBoolVariables_Reference();

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
	 * Returns the meta object for class '{@link robotScriptModel.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see robotScriptModel.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.UltraSound <em>Ultra Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultra Sound</em>'.
	 * @see robotScriptModel.UltraSound
	 * @generated
	 */
	EClass getUltraSound();

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
	 * Returns the meta object for class '{@link robotScriptModel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see robotScriptModel.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Loop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see robotScriptModel.Loop#getLoopCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotScriptModel.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see robotScriptModel.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second</em>'.
	 * @see robotScriptModel.Second
	 * @generated
	 */
	EClass getSecond();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see robotScriptModel.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.Switch#getSwitchCondition <em>Switch Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Condition</em>'.
	 * @see robotScriptModel.Switch#getSwitchCondition()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_SwitchCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link robotScriptModel.Switch#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotScriptModel.Switch#getBody()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Body();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Expressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressions</em>'.
	 * @see robotScriptModel.Expressions
	 * @generated
	 */
	EClass getExpressions();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see robotScriptModel.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BoolBinary <em>Bool Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Binary</em>'.
	 * @see robotScriptModel.BoolBinary
	 * @generated
	 */
	EClass getBoolBinary();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.BoolBinary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robotScriptModel.BoolBinary#getLeft()
	 * @see #getBoolBinary()
	 * @generated
	 */
	EReference getBoolBinary_Left();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.BoolBinary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robotScriptModel.BoolBinary#getRight()
	 * @see #getBoolBinary()
	 * @generated
	 */
	EReference getBoolBinary_Right();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.BoolUnary <em>Bool Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Unary</em>'.
	 * @see robotScriptModel.BoolUnary
	 * @generated
	 */
	EClass getBoolUnary();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.BoolUnary#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see robotScriptModel.BoolUnary#getOperand()
	 * @see #getBoolUnary()
	 * @generated
	 */
	EReference getBoolUnary_Operand();

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
	 * Returns the meta object for class '{@link robotScriptModel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robotScriptModel.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Arithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic</em>'.
	 * @see robotScriptModel.Arithmetic
	 * @generated
	 */
	EClass getArithmetic();

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
	 * Returns the meta object for class '{@link robotScriptModel.BoolValues <em>Bool Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Values</em>'.
	 * @see robotScriptModel.BoolValues
	 * @generated
	 */
	EClass getBoolValues();

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
	 * Returns the meta object for class '{@link robotScriptModel.AriBinary <em>Ari Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Binary</em>'.
	 * @see robotScriptModel.AriBinary
	 * @generated
	 */
	EClass getAriBinary();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AriBinary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robotScriptModel.AriBinary#getRight()
	 * @see #getAriBinary()
	 * @generated
	 */
	EReference getAriBinary_Right();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AriBinary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robotScriptModel.AriBinary#getLeft()
	 * @see #getAriBinary()
	 * @generated
	 */
	EReference getAriBinary_Left();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AriUnary <em>Ari Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Unary</em>'.
	 * @see robotScriptModel.AriUnary
	 * @generated
	 */
	EClass getAriUnary();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AriUnary#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see robotScriptModel.AriUnary#getOperand()
	 * @see #getAriUnary()
	 * @generated
	 */
	EReference getAriUnary_Operand();

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
	 * Returns the meta object for class '{@link robotScriptModel.AriValues <em>Ari Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Values</em>'.
	 * @see robotScriptModel.AriValues
	 * @generated
	 */
	EClass getAriValues();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AriLiteral <em>Ari Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Literal</em>'.
	 * @see robotScriptModel.AriLiteral
	 * @generated
	 */
	EClass getAriLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.AriLiteral#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Units</em>'.
	 * @see robotScriptModel.AriLiteral#getUnits()
	 * @see #getAriLiteral()
	 * @generated
	 */
	EReference getAriLiteral_Units();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.AriVariables <em>Ari Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ari Variables</em>'.
	 * @see robotScriptModel.AriVariables
	 * @generated
	 */
	EClass getAriVariables();

	/**
	 * Returns the meta object for the reference '{@link robotScriptModel.AriVariables#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see robotScriptModel.AriVariables#getReference()
	 * @see #getAriVariables()
	 * @generated
	 */
	EReference getAriVariables_Reference();

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
	 * Returns the meta object for class '{@link robotScriptModel.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg</em>'.
	 * @see robotScriptModel.Neg
	 * @generated
	 */
	EClass getNeg();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.DefVar <em>Def Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def Var</em>'.
	 * @see robotScriptModel.DefVar
	 * @generated
	 */
	EClass getDefVar();

	/**
	 * Returns the meta object for the attribute '{@link robotScriptModel.DefVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotScriptModel.DefVar#getName()
	 * @see #getDefVar()
	 * @generated
	 */
	EAttribute getDefVar_Name();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.DefVar#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see robotScriptModel.DefVar#getExpressions()
	 * @see #getDefVar()
	 * @generated
	 */
	EReference getDefVar_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link robotScriptModel.DefVar#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Units</em>'.
	 * @see robotScriptModel.DefVar#getUnits()
	 * @see #getDefVar()
	 * @generated
	 */
	EReference getDefVar_Units();

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
	 * Returns the meta object for class '{@link robotScriptModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see robotScriptModel.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix</em>'.
	 * @see robotScriptModel.Prefix
	 * @generated
	 */
	EClass getPrefix();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Mili <em>Mili</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mili</em>'.
	 * @see robotScriptModel.Mili
	 * @generated
	 */
	EClass getMili();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Centi <em>Centi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centi</em>'.
	 * @see robotScriptModel.Centi
	 * @generated
	 */
	EClass getCenti();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see robotScriptModel.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for class '{@link robotScriptModel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see robotScriptModel.Number
	 * @generated
	 */
	EClass getNumber();

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
		 * The meta object literal for the '{@link robotScriptModel.Movement <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Movement
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

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
		 * The meta object literal for the '{@link robotScriptModel.Sensors <em>Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Sensors
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSensors()
		 * @generated
		 */
		EClass SENSORS = eINSTANCE.getSensors();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Units <em>Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Units
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUnits()
		 * @generated
		 */
		EClass UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITS__PREFIX = eINSTANCE.getUnits_Prefix();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.ModelImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMMAND = eINSTANCE.getModel_Command();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Functions <em>Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Functions
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getFunctions()
		 * @generated
		 */
		EClass FUNCTIONS = eINSTANCE.getFunctions();

		/**
		 * The meta object literal for the '<em><b>Defvar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS__DEFVAR = eINSTANCE.getFunctions_Defvar();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.BoolVariablesImpl <em>Bool Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.BoolVariablesImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolVariables()
		 * @generated
		 */
		EClass BOOL_VARIABLES = eINSTANCE.getBoolVariables();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_VARIABLES__REFERENCE = eINSTANCE.getBoolVariables_Reference();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.ClockImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.UltraSoundImpl <em>Ultra Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.UltraSoundImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getUltraSound()
		 * @generated
		 */
		EClass ULTRA_SOUND = eINSTANCE.getUltraSound();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.LoopImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_CONDITION = eINSTANCE.getLoop_LoopCondition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.MeterImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SecondImpl <em>Second</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SecondImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSecond()
		 * @generated
		 */
		EClass SECOND = eINSTANCE.getSecond();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.SwitchImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Switch Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__SWITCH_CONDITION = eINSTANCE.getSwitch_SwitchCondition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__BODY = eINSTANCE.getSwitch_Body();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Expressions <em>Expressions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Expressions
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getExpressions()
		 * @generated
		 */
		EClass EXPRESSIONS = eINSTANCE.getExpressions();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Boolean <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Boolean
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link robotScriptModel.BoolBinary <em>Bool Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.BoolBinary
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolBinary()
		 * @generated
		 */
		EClass BOOL_BINARY = eINSTANCE.getBoolBinary();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_BINARY__LEFT = eINSTANCE.getBoolBinary_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_BINARY__RIGHT = eINSTANCE.getBoolBinary_Right();

		/**
		 * The meta object literal for the '{@link robotScriptModel.BoolUnary <em>Bool Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.BoolUnary
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolUnary()
		 * @generated
		 */
		EClass BOOL_UNARY = eINSTANCE.getBoolUnary();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_UNARY__OPERAND = eINSTANCE.getBoolUnary_Operand();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.OrImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Arithmetic <em>Arithmetic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Arithmetic
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getArithmetic()
		 * @generated
		 */
		EClass ARITHMETIC = eINSTANCE.getArithmetic();

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
		 * The meta object literal for the '{@link robotScriptModel.BoolValues <em>Bool Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.BoolValues
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getBoolValues()
		 * @generated
		 */
		EClass BOOL_VALUES = eINSTANCE.getBoolValues();

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
		 * The meta object literal for the '{@link robotScriptModel.AriBinary <em>Ari Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.AriBinary
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriBinary()
		 * @generated
		 */
		EClass ARI_BINARY = eINSTANCE.getAriBinary();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_BINARY__RIGHT = eINSTANCE.getAriBinary_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_BINARY__LEFT = eINSTANCE.getAriBinary_Left();

		/**
		 * The meta object literal for the '{@link robotScriptModel.AriUnary <em>Ari Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.AriUnary
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriUnary()
		 * @generated
		 */
		EClass ARI_UNARY = eINSTANCE.getAriUnary();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_UNARY__OPERAND = eINSTANCE.getAriUnary_Operand();

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
		 * The meta object literal for the '{@link robotScriptModel.AriValues <em>Ari Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.AriValues
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriValues()
		 * @generated
		 */
		EClass ARI_VALUES = eINSTANCE.getAriValues();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AriLiteralImpl <em>Ari Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AriLiteralImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriLiteral()
		 * @generated
		 */
		EClass ARI_LITERAL = eINSTANCE.getAriLiteral();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_LITERAL__UNITS = eINSTANCE.getAriLiteral_Units();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.AriVariablesImpl <em>Ari Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.AriVariablesImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getAriVariables()
		 * @generated
		 */
		EClass ARI_VARIABLES = eINSTANCE.getAriVariables();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARI_VARIABLES__REFERENCE = eINSTANCE.getAriVariables_Reference();

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
		 * The meta object literal for the '{@link robotScriptModel.impl.NegImpl <em>Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NegImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNeg()
		 * @generated
		 */
		EClass NEG = eINSTANCE.getNeg();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.DefVarImpl <em>Def Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.DefVarImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDefVar()
		 * @generated
		 */
		EClass DEF_VAR = eINSTANCE.getDefVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_VAR__NAME = eINSTANCE.getDefVar_Name();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_VAR__EXPRESSIONS = eINSTANCE.getDefVar_Expressions();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_VAR__UNITS = eINSTANCE.getDefVar_Units();

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
		 * The meta object literal for the '{@link robotScriptModel.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.State
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link robotScriptModel.Prefix <em>Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.Prefix
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getPrefix()
		 * @generated
		 */
		EClass PREFIX = eINSTANCE.getPrefix();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.MiliImpl <em>Mili</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.MiliImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getMili()
		 * @generated
		 */
		EClass MILI = eINSTANCE.getMili();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.CentiImpl <em>Centi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.CentiImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getCenti()
		 * @generated
		 */
		EClass CENTI = eINSTANCE.getCenti();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.DegreeImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '{@link robotScriptModel.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotScriptModel.impl.NumberImpl
		 * @see robotScriptModel.impl.RobotScriptModelPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

	}

} //RobotScriptModelPackage
