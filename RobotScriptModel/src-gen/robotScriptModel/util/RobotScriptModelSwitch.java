/**
 */
package robotScriptModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import robotScriptModel.UltraSound;
import robotScriptModel.Units;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robotScriptModel.RobotScriptModelPackage
 * @generated
 */
public class RobotScriptModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotScriptModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotScriptModelSwitch() {
		if (modelPackage == null) {
			modelPackage = RobotScriptModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RobotScriptModelPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
			if (result == null)
				result = caseFunctions(movement);
			if (result == null)
				result = caseCommand(movement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ROTATION: {
			Rotation rotation = (Rotation) theEObject;
			T result = caseRotation(rotation);
			if (result == null)
				result = caseMovement(rotation);
			if (result == null)
				result = caseFunctions(rotation);
			if (result == null)
				result = caseCommand(rotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SENSORS: {
			Sensors sensors = (Sensors) theEObject;
			T result = caseSensors(sensors);
			if (result == null)
				result = caseFunctions(sensors);
			if (result == null)
				result = caseCommand(sensors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.UNITS: {
			Units units = (Units) theEObject;
			T result = caseUnits(units);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.CONTROL_STRUCTURE: {
			ControlStructure controlStructure = (ControlStructure) theEObject;
			T result = caseControlStructure(controlStructure);
			if (result == null)
				result = caseCommand(controlStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.FUNCTIONS: {
			Functions functions = (Functions) theEObject;
			T result = caseFunctions(functions);
			if (result == null)
				result = caseCommand(functions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_VARIABLES: {
			BoolVariables boolVariables = (BoolVariables) theEObject;
			T result = caseBoolVariables(boolVariables);
			if (result == null)
				result = caseBoolValues(boolVariables);
			if (result == null)
				result = caseBoolean(boolVariables);
			if (result == null)
				result = caseExpressions(boolVariables);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LINEAR: {
			Linear linear = (Linear) theEObject;
			T result = caseLinear(linear);
			if (result == null)
				result = caseMovement(linear);
			if (result == null)
				result = caseFunctions(linear);
			if (result == null)
				result = caseCommand(linear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = caseSensors(clock);
			if (result == null)
				result = caseFunctions(clock);
			if (result == null)
				result = caseCommand(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ULTRA_SOUND: {
			UltraSound ultraSound = (UltraSound) theEObject;
			T result = caseUltraSound(ultraSound);
			if (result == null)
				result = caseSensors(ultraSound);
			if (result == null)
				result = caseFunctions(ultraSound);
			if (result == null)
				result = caseCommand(ultraSound);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SPEED: {
			Speed speed = (Speed) theEObject;
			T result = caseSpeed(speed);
			if (result == null)
				result = caseState(speed);
			if (result == null)
				result = caseFunctions(speed);
			if (result == null)
				result = caseCommand(speed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseControlStructure(loop);
			if (result == null)
				result = caseCommand(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.METER: {
			Meter meter = (Meter) theEObject;
			T result = caseMeter(meter);
			if (result == null)
				result = caseUnits(meter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SECOND: {
			Second second = (Second) theEObject;
			T result = caseSecond(second);
			if (result == null)
				result = caseUnits(second);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SWITCH: {
			robotScriptModel.Switch switch_ = (robotScriptModel.Switch) theEObject;
			T result = caseSwitch(switch_);
			if (result == null)
				result = caseControlStructure(switch_);
			if (result == null)
				result = caseCommand(switch_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.EXPRESSIONS: {
			Expressions expressions = (Expressions) theEObject;
			T result = caseExpressions(expressions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOLEAN: {
			robotScriptModel.Boolean boolean_ = (robotScriptModel.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseExpressions(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_BINARY: {
			BoolBinary boolBinary = (BoolBinary) theEObject;
			T result = caseBoolBinary(boolBinary);
			if (result == null)
				result = caseBoolean(boolBinary);
			if (result == null)
				result = caseExpressions(boolBinary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_UNARY: {
			BoolUnary boolUnary = (BoolUnary) theEObject;
			T result = caseBoolUnary(boolUnary);
			if (result == null)
				result = caseBoolean(boolUnary);
			if (result == null)
				result = caseExpressions(boolUnary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBoolBinary(and);
			if (result == null)
				result = caseBoolean(and);
			if (result == null)
				result = caseExpressions(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBoolBinary(or);
			if (result == null)
				result = caseBoolean(or);
			if (result == null)
				result = caseExpressions(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARITHMETIC: {
			Arithmetic arithmetic = (Arithmetic) theEObject;
			T result = caseArithmetic(arithmetic);
			if (result == null)
				result = caseExpressions(arithmetic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseBoolUnary(not);
			if (result == null)
				result = caseBoolean(not);
			if (result == null)
				result = caseExpressions(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_VALUES: {
			BoolValues boolValues = (BoolValues) theEObject;
			T result = caseBoolValues(boolValues);
			if (result == null)
				result = caseBoolean(boolValues);
			if (result == null)
				result = caseExpressions(boolValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_LITERAL: {
			BoolLiteral boolLiteral = (BoolLiteral) theEObject;
			T result = caseBoolLiteral(boolLiteral);
			if (result == null)
				result = caseBoolValues(boolLiteral);
			if (result == null)
				result = caseBoolean(boolLiteral);
			if (result == null)
				result = caseExpressions(boolLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_BINARY: {
			AriBinary ariBinary = (AriBinary) theEObject;
			T result = caseAriBinary(ariBinary);
			if (result == null)
				result = caseArithmetic(ariBinary);
			if (result == null)
				result = caseExpressions(ariBinary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_UNARY: {
			AriUnary ariUnary = (AriUnary) theEObject;
			T result = caseAriUnary(ariUnary);
			if (result == null)
				result = caseArithmetic(ariUnary);
			if (result == null)
				result = caseExpressions(ariUnary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ADD: {
			Add add = (Add) theEObject;
			T result = caseAdd(add);
			if (result == null)
				result = caseAriBinary(add);
			if (result == null)
				result = caseArithmetic(add);
			if (result == null)
				result = caseExpressions(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_VALUES: {
			AriValues ariValues = (AriValues) theEObject;
			T result = caseAriValues(ariValues);
			if (result == null)
				result = caseArithmetic(ariValues);
			if (result == null)
				result = caseExpressions(ariValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_LITERAL: {
			AriLiteral ariLiteral = (AriLiteral) theEObject;
			T result = caseAriLiteral(ariLiteral);
			if (result == null)
				result = caseAriValues(ariLiteral);
			if (result == null)
				result = caseArithmetic(ariLiteral);
			if (result == null)
				result = caseExpressions(ariLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_VARIABLES: {
			AriVariables ariVariables = (AriVariables) theEObject;
			T result = caseAriVariables(ariVariables);
			if (result == null)
				result = caseAriValues(ariVariables);
			if (result == null)
				result = caseArithmetic(ariVariables);
			if (result == null)
				result = caseExpressions(ariVariables);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SUB: {
			Sub sub = (Sub) theEObject;
			T result = caseSub(sub);
			if (result == null)
				result = caseAriBinary(sub);
			if (result == null)
				result = caseArithmetic(sub);
			if (result == null)
				result = caseExpressions(sub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NEG: {
			Neg neg = (Neg) theEObject;
			T result = caseNeg(neg);
			if (result == null)
				result = caseAriUnary(neg);
			if (result == null)
				result = caseArithmetic(neg);
			if (result == null)
				result = caseExpressions(neg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.DEF_VAR: {
			DefVar defVar = (DefVar) theEObject;
			T result = caseDefVar(defVar);
			if (result == null)
				result = caseCommand(defVar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseFunctions(state);
			if (result == null)
				result = caseCommand(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.PREFIX: {
			Prefix prefix = (Prefix) theEObject;
			T result = casePrefix(prefix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MILI: {
			Mili mili = (Mili) theEObject;
			T result = caseMili(mili);
			if (result == null)
				result = casePrefix(mili);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.CENTI: {
			Centi centi = (Centi) theEObject;
			T result = caseCenti(centi);
			if (result == null)
				result = casePrefix(centi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.DEGREE: {
			Degree degree = (Degree) theEObject;
			T result = caseDegree(degree);
			if (result == null)
				result = caseUnits(degree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NUMBER: {
			robotScriptModel.Number number = (robotScriptModel.Number) theEObject;
			T result = caseNumber(number);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovement(Movement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotation(Rotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensors(Sensors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Units</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Units</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnits(Units object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStructure(ControlStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctions(Functions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolVariables(BoolVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinear(Linear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ultra Sound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ultra Sound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUltraSound(UltraSound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeed(Speed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecond(Second object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(robotScriptModel.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expressions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expressions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressions(Expressions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(robotScriptModel.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolBinary(BoolBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolUnary(BoolUnary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetic(Arithmetic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolValues(BoolValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolLiteral(BoolLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ari Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriBinary(AriBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ari Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriUnary(AriUnary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ari Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriValues(AriValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ari Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriLiteral(AriLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ari Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriVariables(AriVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSub(Sub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeg(Neg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefVar(DefVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefix(Prefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mili</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mili</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMili(Mili object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenti(Centi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree(Degree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(robotScriptModel.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobotScriptModelSwitch
