/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotScriptModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotScriptModelFactoryImpl extends EFactoryImpl implements RobotScriptModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotScriptModelFactory init() {
		try {
			RobotScriptModelFactory theRobotScriptModelFactory = (RobotScriptModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(RobotScriptModelPackage.eNS_URI);
			if (theRobotScriptModelFactory != null) {
				return theRobotScriptModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotScriptModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotScriptModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RobotScriptModelPackage.ENTRY_POINT:
			return createEntryPoint();
		case RobotScriptModelPackage.FUNCTION_DEF:
			return createFunctionDef();
		case RobotScriptModelPackage.VAR_DECL:
			return createVarDecl();
		case RobotScriptModelPackage.VOID_TYPE:
			return createVoidType();
		case RobotScriptModelPackage.NUMBER_TYPE:
			return createNumberType();
		case RobotScriptModelPackage.BOOLEAN_TYPE:
			return createBooleanType();
		case RobotScriptModelPackage.LOOP:
			return createLoop();
		case RobotScriptModelPackage.IF:
			return createIf();
		case RobotScriptModelPackage.IF_ELSE:
			return createIfElse();
		case RobotScriptModelPackage.ASSIGN_AT_DECL:
			return createAssignAtDecl();
		case RobotScriptModelPackage.RE_ASSIGN:
			return createReAssign();
		case RobotScriptModelPackage.SET_SPEED:
			return createSetSpeed();
		case RobotScriptModelPackage.NEG:
			return createNeg();
		case RobotScriptModelPackage.NOT:
			return createNot();
		case RobotScriptModelPackage.GREATER:
			return createGreater();
		case RobotScriptModelPackage.AND:
			return createAnd();
		case RobotScriptModelPackage.ADD:
			return createAdd();
		case RobotScriptModelPackage.LESS:
			return createLess();
		case RobotScriptModelPackage.OR:
			return createOr();
		case RobotScriptModelPackage.SUB:
			return createSub();
		case RobotScriptModelPackage.GEQ:
			return createGEq();
		case RobotScriptModelPackage.EQU:
			return createEqu();
		case RobotScriptModelPackage.MUL:
			return createMul();
		case RobotScriptModelPackage.LEQ:
			return createLEq();
		case RobotScriptModelPackage.NEQ:
			return createNEq();
		case RobotScriptModelPackage.DIV:
			return createDiv();
		case RobotScriptModelPackage.ROTATION:
			return createRotation();
		case RobotScriptModelPackage.FRONT:
			return createFront();
		case RobotScriptModelPackage.BACK:
			return createBack();
		case RobotScriptModelPackage.RIGHT:
			return createRight();
		case RobotScriptModelPackage.LEFT:
			return createLeft();
		case RobotScriptModelPackage.TIME_SENSOR:
			return createTimeSensor();
		case RobotScriptModelPackage.DIST_SENSOR:
			return createDistSensor();
		case RobotScriptModelPackage.BOOL_LITERAL:
			return createBoolLiteral();
		case RobotScriptModelPackage.NUMBER_LITERAL:
			return createNumberLiteral();
		case RobotScriptModelPackage.SPEED_STATE:
			return createSpeedState();
		case RobotScriptModelPackage.VARIABLE:
			return createVariable();
		case RobotScriptModelPackage.FUN_CALL:
			return createFunCall();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RobotScriptModelPackage.UNIT:
			return createUnitFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RobotScriptModelPackage.UNIT:
			return convertUnitToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionDef createFunctionDef() {
		FunctionDefImpl functionDef = new FunctionDefImpl();
		return functionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberType createNumberType() {
		NumberTypeImpl numberType = new NumberTypeImpl();
		return numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfElse createIfElse() {
		IfElseImpl ifElse = new IfElseImpl();
		return ifElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignAtDecl createAssignAtDecl() {
		AssignAtDeclImpl assignAtDecl = new AssignAtDeclImpl();
		return assignAtDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReAssign createReAssign() {
		ReAssignImpl reAssign = new ReAssignImpl();
		return reAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetSpeed createSetSpeed() {
		SetSpeedImpl setSpeed = new SetSpeedImpl();
		return setSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neg createNeg() {
		NegImpl neg = new NegImpl();
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEq createGEq() {
		GEqImpl gEq = new GEqImpl();
		return gEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equ createEqu() {
		EquImpl equ = new EquImpl();
		return equ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mul createMul() {
		MulImpl mul = new MulImpl();
		return mul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEq createLEq() {
		LEqImpl lEq = new LEqImpl();
		return lEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NEq createNEq() {
		NEqImpl nEq = new NEqImpl();
		return nEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Front createFront() {
		FrontImpl front = new FrontImpl();
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSensor createTimeSensor() {
		TimeSensorImpl timeSensor = new TimeSensorImpl();
		return timeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistSensor createDistSensor() {
		DistSensorImpl distSensor = new DistSensorImpl();
		return distSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolLiteral createBoolLiteral() {
		BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
		return boolLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedState createSpeedState() {
		SpeedStateImpl speedState = new SpeedStateImpl();
		return speedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunCall createFunCall() {
		FunCallImpl funCall = new FunCallImpl();
		return funCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotScriptModelPackage getRobotScriptModelPackage() {
		return (RobotScriptModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotScriptModelPackage getPackage() {
		return RobotScriptModelPackage.eINSTANCE;
	}

} //RobotScriptModelFactoryImpl
