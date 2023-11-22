/**
 */
package robotScriptModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robotScriptModel.Add;
import robotScriptModel.And;
import robotScriptModel.AriBinary;
import robotScriptModel.AriLiteral;
import robotScriptModel.AriUnary;
import robotScriptModel.AriValues;
import robotScriptModel.AriVariables;
import robotScriptModel.Arithmetic;
import robotScriptModel.BoolBinary;
import robotScriptModel.BoolLiteral;
import robotScriptModel.BoolUnary;
import robotScriptModel.BoolValues;
import robotScriptModel.BoolVariables;
import robotScriptModel.Centi;
import robotScriptModel.Clock;
import robotScriptModel.Command;
import robotScriptModel.ControlStructure;
import robotScriptModel.DefVar;
import robotScriptModel.Degree;
import robotScriptModel.Expressions;
import robotScriptModel.Functions;
import robotScriptModel.Linear;
import robotScriptModel.Loop;
import robotScriptModel.Meter;
import robotScriptModel.Mili;
import robotScriptModel.Model;
import robotScriptModel.Movement;
import robotScriptModel.Neg;
import robotScriptModel.Not;
import robotScriptModel.Or;
import robotScriptModel.Prefix;
import robotScriptModel.RobotScriptModelPackage;
import robotScriptModel.Rotation;
import robotScriptModel.Second;
import robotScriptModel.Sensors;
import robotScriptModel.Speed;
import robotScriptModel.State;
import robotScriptModel.Sub;
import robotScriptModel.Switch;
import robotScriptModel.UltraSound;
import robotScriptModel.Units;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robotScriptModel.RobotScriptModelPackage
 * @generated
 */
public class RobotScriptModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotScriptModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotScriptModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotScriptModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotScriptModelSwitch<Adapter> modelSwitch = new RobotScriptModelSwitch<Adapter>() {
		@Override
		public Adapter caseMovement(Movement object) {
			return createMovementAdapter();
		}

		@Override
		public Adapter caseRotation(Rotation object) {
			return createRotationAdapter();
		}

		@Override
		public Adapter caseSensors(Sensors object) {
			return createSensorsAdapter();
		}

		@Override
		public Adapter caseUnits(Units object) {
			return createUnitsAdapter();
		}

		@Override
		public Adapter caseControlStructure(ControlStructure object) {
			return createControlStructureAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseFunctions(Functions object) {
			return createFunctionsAdapter();
		}

		@Override
		public Adapter caseBoolVariables(BoolVariables object) {
			return createBoolVariablesAdapter();
		}

		@Override
		public Adapter caseLinear(Linear object) {
			return createLinearAdapter();
		}

		@Override
		public Adapter caseClock(Clock object) {
			return createClockAdapter();
		}

		@Override
		public Adapter caseUltraSound(UltraSound object) {
			return createUltraSoundAdapter();
		}

		@Override
		public Adapter caseSpeed(Speed object) {
			return createSpeedAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseMeter(Meter object) {
			return createMeterAdapter();
		}

		@Override
		public Adapter caseSecond(Second object) {
			return createSecondAdapter();
		}

		@Override
		public Adapter caseSwitch(Switch object) {
			return createSwitchAdapter();
		}

		@Override
		public Adapter caseExpressions(Expressions object) {
			return createExpressionsAdapter();
		}

		@Override
		public Adapter caseBoolean(robotScriptModel.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseBoolBinary(BoolBinary object) {
			return createBoolBinaryAdapter();
		}

		@Override
		public Adapter caseBoolUnary(BoolUnary object) {
			return createBoolUnaryAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseArithmetic(Arithmetic object) {
			return createArithmeticAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseBoolValues(BoolValues object) {
			return createBoolValuesAdapter();
		}

		@Override
		public Adapter caseBoolLiteral(BoolLiteral object) {
			return createBoolLiteralAdapter();
		}

		@Override
		public Adapter caseAriBinary(AriBinary object) {
			return createAriBinaryAdapter();
		}

		@Override
		public Adapter caseAriUnary(AriUnary object) {
			return createAriUnaryAdapter();
		}

		@Override
		public Adapter caseAdd(Add object) {
			return createAddAdapter();
		}

		@Override
		public Adapter caseAriValues(AriValues object) {
			return createAriValuesAdapter();
		}

		@Override
		public Adapter caseAriLiteral(AriLiteral object) {
			return createAriLiteralAdapter();
		}

		@Override
		public Adapter caseAriVariables(AriVariables object) {
			return createAriVariablesAdapter();
		}

		@Override
		public Adapter caseSub(Sub object) {
			return createSubAdapter();
		}

		@Override
		public Adapter caseNeg(Neg object) {
			return createNegAdapter();
		}

		@Override
		public Adapter caseDefVar(DefVar object) {
			return createDefVarAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter casePrefix(Prefix object) {
			return createPrefixAdapter();
		}

		@Override
		public Adapter caseMili(Mili object) {
			return createMiliAdapter();
		}

		@Override
		public Adapter caseCenti(Centi object) {
			return createCentiAdapter();
		}

		@Override
		public Adapter caseDegree(Degree object) {
			return createDegreeAdapter();
		}

		@Override
		public Adapter caseNumber(robotScriptModel.Number object) {
			return createNumberAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Movement
	 * @generated
	 */
	public Adapter createMovementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Sensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Sensors
	 * @generated
	 */
	public Adapter createSensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Units
	 * @generated
	 */
	public Adapter createUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Functions
	 * @generated
	 */
	public Adapter createFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.BoolVariables <em>Bool Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.BoolVariables
	 * @generated
	 */
	public Adapter createBoolVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Linear <em>Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Linear
	 * @generated
	 */
	public Adapter createLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.UltraSound <em>Ultra Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.UltraSound
	 * @generated
	 */
	public Adapter createUltraSoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Speed
	 * @generated
	 */
	public Adapter createSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Second
	 * @generated
	 */
	public Adapter createSecondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Expressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Expressions
	 * @generated
	 */
	public Adapter createExpressionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.BoolBinary <em>Bool Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.BoolBinary
	 * @generated
	 */
	public Adapter createBoolBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.BoolUnary <em>Bool Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.BoolUnary
	 * @generated
	 */
	public Adapter createBoolUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Arithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Arithmetic
	 * @generated
	 */
	public Adapter createArithmeticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.BoolValues <em>Bool Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.BoolValues
	 * @generated
	 */
	public Adapter createBoolValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.BoolLiteral <em>Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.BoolLiteral
	 * @generated
	 */
	public Adapter createBoolLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriBinary <em>Ari Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriBinary
	 * @generated
	 */
	public Adapter createAriBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriUnary <em>Ari Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriUnary
	 * @generated
	 */
	public Adapter createAriUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriValues <em>Ari Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriValues
	 * @generated
	 */
	public Adapter createAriValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriLiteral <em>Ari Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriLiteral
	 * @generated
	 */
	public Adapter createAriLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriVariables <em>Ari Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriVariables
	 * @generated
	 */
	public Adapter createAriVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Sub
	 * @generated
	 */
	public Adapter createSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Neg
	 * @generated
	 */
	public Adapter createNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.DefVar <em>Def Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.DefVar
	 * @generated
	 */
	public Adapter createDefVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Prefix
	 * @generated
	 */
	public Adapter createPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Mili <em>Mili</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Mili
	 * @generated
	 */
	public Adapter createMiliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Centi <em>Centi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Centi
	 * @generated
	 */
	public Adapter createCentiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotScriptModelAdapterFactory
