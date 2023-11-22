/**
 */
package robotScriptModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotScriptModel.Add;
import robotScriptModel.And;
import robotScriptModel.AriLiteral;
import robotScriptModel.AriVariables;
import robotScriptModel.BoolLiteral;
import robotScriptModel.BoolVariables;
import robotScriptModel.Centi;
import robotScriptModel.Clock;
import robotScriptModel.DefVar;
import robotScriptModel.Degree;
import robotScriptModel.Linear;
import robotScriptModel.Loop;
import robotScriptModel.Meter;
import robotScriptModel.Mili;
import robotScriptModel.Model;
import robotScriptModel.Neg;
import robotScriptModel.Not;
import robotScriptModel.Or;
import robotScriptModel.RobotScriptModelFactory;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Rotation;
import robotScriptModel.Second;
import robotScriptModel.Speed;
import robotScriptModel.Sub;
import robotScriptModel.Switch;
import robotScriptModel.UltraSound;

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
		case RobotScriptModelPackage.ROTATION:
			return createRotation();
		case RobotScriptModelPackage.MODEL:
			return createModel();
		case RobotScriptModelPackage.BOOL_VARIABLES:
			return createBoolVariables();
		case RobotScriptModelPackage.LINEAR:
			return createLinear();
		case RobotScriptModelPackage.CLOCK:
			return createClock();
		case RobotScriptModelPackage.ULTRA_SOUND:
			return createUltraSound();
		case RobotScriptModelPackage.SPEED:
			return createSpeed();
		case RobotScriptModelPackage.LOOP:
			return createLoop();
		case RobotScriptModelPackage.METER:
			return createMeter();
		case RobotScriptModelPackage.SECOND:
			return createSecond();
		case RobotScriptModelPackage.SWITCH:
			return createSwitch();
		case RobotScriptModelPackage.AND:
			return createAnd();
		case RobotScriptModelPackage.OR:
			return createOr();
		case RobotScriptModelPackage.NOT:
			return createNot();
		case RobotScriptModelPackage.BOOL_LITERAL:
			return createBoolLiteral();
		case RobotScriptModelPackage.ADD:
			return createAdd();
		case RobotScriptModelPackage.ARI_LITERAL:
			return createAriLiteral();
		case RobotScriptModelPackage.ARI_VARIABLES:
			return createAriVariables();
		case RobotScriptModelPackage.SUB:
			return createSub();
		case RobotScriptModelPackage.NEG:
			return createNeg();
		case RobotScriptModelPackage.DEF_VAR:
			return createDefVar();
		case RobotScriptModelPackage.MILI:
			return createMili();
		case RobotScriptModelPackage.CENTI:
			return createCenti();
		case RobotScriptModelPackage.DEGREE:
			return createDegree();
		case RobotScriptModelPackage.NUMBER:
			return createNumber();
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolVariables createBoolVariables() {
		BoolVariablesImpl boolVariables = new BoolVariablesImpl();
		return boolVariables;
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
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UltraSound createUltraSound() {
		UltraSoundImpl ultraSound = new UltraSoundImpl();
		return ultraSound;
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
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Second createSecond() {
		SecondImpl second = new SecondImpl();
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
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
	public AriLiteral createAriLiteral() {
		AriLiteralImpl ariLiteral = new AriLiteralImpl();
		return ariLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AriVariables createAriVariables() {
		AriVariablesImpl ariVariables = new AriVariablesImpl();
		return ariVariables;
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
	public DefVar createDefVar() {
		DefVarImpl defVar = new DefVarImpl();
		return defVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mili createMili() {
		MiliImpl mili = new MiliImpl();
		return mili;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Centi createCenti() {
		CentiImpl centi = new CentiImpl();
		return centi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Degree createDegree() {
		DegreeImpl degree = new DegreeImpl();
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public robotScriptModel.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
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
