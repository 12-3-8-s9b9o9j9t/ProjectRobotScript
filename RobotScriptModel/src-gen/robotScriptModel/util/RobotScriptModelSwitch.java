/**
 */
package robotScriptModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robotScriptModel.*;

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
		case RobotScriptModelPackage.ENTRY_POINT: {
			EntryPoint entryPoint = (EntryPoint) theEObject;
			T result = caseEntryPoint(entryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.FUNCTION_DEF: {
			FunctionDef functionDef = (FunctionDef) theEObject;
			T result = caseFunctionDef(functionDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ANY_TYPE: {
			AnyType anyType = (AnyType) theEObject;
			T result = caseAnyType(anyType);
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
		case RobotScriptModelPackage.VAR_DECL: {
			VarDecl varDecl = (VarDecl) theEObject;
			T result = caseVarDecl(varDecl);
			if (result == null)
				result = caseCommand(varDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.VOID_TYPE: {
			VoidType voidType = (VoidType) theEObject;
			T result = caseVoidType(voidType);
			if (result == null)
				result = caseAnyType(voidType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = caseAnyType(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NUMBER_TYPE: {
			NumberType numberType = (NumberType) theEObject;
			T result = caseNumberType(numberType);
			if (result == null)
				result = caseDataType(numberType);
			if (result == null)
				result = caseAnyType(numberType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOLEAN_TYPE: {
			BooleanType booleanType = (BooleanType) theEObject;
			T result = caseBooleanType(booleanType);
			if (result == null)
				result = caseDataType(booleanType);
			if (result == null)
				result = caseAnyType(booleanType);
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
		case RobotScriptModelPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseControlStructure(if_);
			if (result == null)
				result = caseCommand(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.IF_ELSE: {
			IfElse ifElse = (IfElse) theEObject;
			T result = caseIfElse(ifElse);
			if (result == null)
				result = caseIf(ifElse);
			if (result == null)
				result = caseControlStructure(ifElse);
			if (result == null)
				result = caseCommand(ifElse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
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
		case RobotScriptModelPackage.ASSIGN: {
			Assign assign = (Assign) theEObject;
			T result = caseAssign(assign);
			if (result == null)
				result = caseCommand(assign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ASSIGN_AT_DECL: {
			AssignAtDecl assignAtDecl = (AssignAtDecl) theEObject;
			T result = caseAssignAtDecl(assignAtDecl);
			if (result == null)
				result = caseAssign(assignAtDecl);
			if (result == null)
				result = caseCommand(assignAtDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.RE_ASSIGN: {
			ReAssign reAssign = (ReAssign) theEObject;
			T result = caseReAssign(reAssign);
			if (result == null)
				result = caseAssign(reAssign);
			if (result == null)
				result = caseCommand(reAssign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SET_SPEED: {
			SetSpeed setSpeed = (SetSpeed) theEObject;
			T result = caseSetSpeed(setSpeed);
			if (result == null)
				result = caseAssign(setSpeed);
			if (result == null)
				result = caseCommand(setSpeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.UN_OP: {
			UnOp unOp = (UnOp) theEObject;
			T result = caseUnOp(unOp);
			if (result == null)
				result = caseExpression(unOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BIN_OP: {
			BinOp binOp = (BinOp) theEObject;
			T result = caseBinOp(binOp);
			if (result == null)
				result = caseExpression(binOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NEG: {
			Neg neg = (Neg) theEObject;
			T result = caseNeg(neg);
			if (result == null)
				result = caseUnOp(neg);
			if (result == null)
				result = caseExpression(neg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseUnOp(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseBinOp(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBinOp(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ADD: {
			Add add = (Add) theEObject;
			T result = caseAdd(add);
			if (result == null)
				result = caseBinOp(add);
			if (result == null)
				result = caseExpression(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LESS: {
			Less less = (Less) theEObject;
			T result = caseLess(less);
			if (result == null)
				result = caseBinOp(less);
			if (result == null)
				result = caseExpression(less);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBinOp(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SUB: {
			Sub sub = (Sub) theEObject;
			T result = caseSub(sub);
			if (result == null)
				result = caseBinOp(sub);
			if (result == null)
				result = caseExpression(sub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.GEQ: {
			GEq gEq = (GEq) theEObject;
			T result = caseGEq(gEq);
			if (result == null)
				result = caseBinOp(gEq);
			if (result == null)
				result = caseExpression(gEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.EQU: {
			Equ equ = (Equ) theEObject;
			T result = caseEqu(equ);
			if (result == null)
				result = caseBinOp(equ);
			if (result == null)
				result = caseExpression(equ);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MUL: {
			Mul mul = (Mul) theEObject;
			T result = caseMul(mul);
			if (result == null)
				result = caseBinOp(mul);
			if (result == null)
				result = caseExpression(mul);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LEQ: {
			LEq lEq = (LEq) theEObject;
			T result = caseLEq(lEq);
			if (result == null)
				result = caseBinOp(lEq);
			if (result == null)
				result = caseExpression(lEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NEQ: {
			NEq nEq = (NEq) theEObject;
			T result = caseNEq(nEq);
			if (result == null)
				result = caseBinOp(nEq);
			if (result == null)
				result = caseExpression(nEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.DIV: {
			Div div = (Div) theEObject;
			T result = caseDiv(div);
			if (result == null)
				result = caseBinOp(div);
			if (result == null)
				result = caseExpression(div);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
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
				result = caseCommand(rotation);
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
				result = caseCommand(linear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.FRONT: {
			Front front = (Front) theEObject;
			T result = caseFront(front);
			if (result == null)
				result = caseLinear(front);
			if (result == null)
				result = caseMovement(front);
			if (result == null)
				result = caseCommand(front);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BACK: {
			Back back = (Back) theEObject;
			T result = caseBack(back);
			if (result == null)
				result = caseLinear(back);
			if (result == null)
				result = caseMovement(back);
			if (result == null)
				result = caseCommand(back);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.RIGHT: {
			Right right = (Right) theEObject;
			T result = caseRight(right);
			if (result == null)
				result = caseLinear(right);
			if (result == null)
				result = caseMovement(right);
			if (result == null)
				result = caseCommand(right);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LEFT: {
			Left left = (Left) theEObject;
			T result = caseLeft(left);
			if (result == null)
				result = caseLinear(left);
			if (result == null)
				result = caseMovement(left);
			if (result == null)
				result = caseCommand(left);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseExpression(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.TIME_SENSOR: {
			TimeSensor timeSensor = (TimeSensor) theEObject;
			T result = caseTimeSensor(timeSensor);
			if (result == null)
				result = caseValue(timeSensor);
			if (result == null)
				result = caseExpression(timeSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.DIST_SENSOR: {
			DistSensor distSensor = (DistSensor) theEObject;
			T result = caseDistSensor(distSensor);
			if (result == null)
				result = caseValue(distSensor);
			if (result == null)
				result = caseExpression(distSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BOOL_LITERAL: {
			BoolLiteral boolLiteral = (BoolLiteral) theEObject;
			T result = caseBoolLiteral(boolLiteral);
			if (result == null)
				result = caseValue(boolLiteral);
			if (result == null)
				result = caseExpression(boolLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NUMBER_LITERAL: {
			NumberLiteral numberLiteral = (NumberLiteral) theEObject;
			T result = caseNumberLiteral(numberLiteral);
			if (result == null)
				result = caseValue(numberLiteral);
			if (result == null)
				result = caseExpression(numberLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SPEED_STATE: {
			SpeedState speedState = (SpeedState) theEObject;
			T result = caseSpeedState(speedState);
			if (result == null)
				result = caseValue(speedState);
			if (result == null)
				result = caseExpression(speedState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseValue(variable);
			if (result == null)
				result = caseExpression(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.FUN_CALL: {
			FunCall funCall = (FunCall) theEObject;
			T result = caseFunCall(funCall);
			if (result == null)
				result = caseValue(funCall);
			if (result == null)
				result = caseCommand(funCall);
			if (result == null)
				result = caseExpression(funCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDef(FunctionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyType(AnyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDecl(VarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberType(NumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfElse(IfElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign At Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign At Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignAtDecl(AssignAtDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Re Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Re Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReAssign(ReAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSpeed(SetSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnOp(UnOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinOp(BinOp object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>GEq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEq(GEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqu(Equ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMul(Mul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEq(LEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NEq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NEq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNEq(NEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFront(Front object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSensor(TimeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dist Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dist Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistSensor(DistSensor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedState(SpeedState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunCall(FunCall object) {
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
