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
		case RobotScriptModelPackage.VOID_TYPE:
			return createVoidType();
		case RobotScriptModelPackage.DATA_TYPE:
			return createDataType();
		case RobotScriptModelPackage.ASSIGN_VAR:
			return createAssignVar();
		case RobotScriptModelPackage.SET_SPEED:
			return createSetSpeed();
		case RobotScriptModelPackage.AND:
			return createAnd();
		case RobotScriptModelPackage.ADD:
			return createAdd();
		case RobotScriptModelPackage.OR:
			return createOr();
		case RobotScriptModelPackage.ROTATION:
			return createRotation();
		case RobotScriptModelPackage.LINEAR:
			return createLinear();
		case RobotScriptModelPackage.SENSOR:
			return createSensor();
		case RobotScriptModelPackage.LITERAL:
			return createLiteral();
		case RobotScriptModelPackage.SPEED:
			return createSpeed();
		case RobotScriptModelPackage.VARIABLE:
			return createVariable();
		case RobotScriptModelPackage.FUN_CALL:
			return createFunCall();
		case RobotScriptModelPackage.NOT:
			return createNot();
		case RobotScriptModelPackage.COMPARE:
			return createCompare();
		case RobotScriptModelPackage.MUL:
			return createMul();
		case RobotScriptModelPackage.ARI_UN_OP:
			return createAriUnOp();
		case RobotScriptModelPackage.BLOCK:
			return createBlock();
		case RobotScriptModelPackage.SIMPLE_VAR_DECL:
			return createSimpleVarDecl();
		case RobotScriptModelPackage.VAR_DECL_INIT:
			return createVarDeclInit();
		case RobotScriptModelPackage.LOOP_STMT:
			return createLoopStmt();
		case RobotScriptModelPackage.IF_STMT:
			return createIfStmt();
		case RobotScriptModelPackage.RETURN_STMT:
			return createReturnStmt();
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
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignVar createAssignVar() {
		AssignVarImpl assignVar = new AssignVarImpl();
		return assignVar;
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
	public Linear createLinear() {
		LinearImpl linear = new LinearImpl();
		return linear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speed createSpeed() {
		SpeedImpl speed = new SpeedImpl();
		return speed;
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
	public Compare createCompare() {
		CompareImpl compare = new CompareImpl();
		return compare;
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
	public AriUnOp createAriUnOp() {
		AriUnOpImpl ariUnOp = new AriUnOpImpl();
		return ariUnOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleVarDecl createSimpleVarDecl() {
		SimpleVarDeclImpl simpleVarDecl = new SimpleVarDeclImpl();
		return simpleVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDeclInit createVarDeclInit() {
		VarDeclInitImpl varDeclInit = new VarDeclInitImpl();
		return varDeclInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopStmt createLoopStmt() {
		LoopStmtImpl loopStmt = new LoopStmtImpl();
		return loopStmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStmt createIfStmt() {
		IfStmtImpl ifStmt = new IfStmtImpl();
		return ifStmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStmt createReturnStmt() {
		ReturnStmtImpl returnStmt = new ReturnStmtImpl();
		return returnStmt;
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
