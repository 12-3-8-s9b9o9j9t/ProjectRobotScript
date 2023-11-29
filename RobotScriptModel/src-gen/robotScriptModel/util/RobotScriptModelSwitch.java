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
		case RobotScriptModelPackage.VAR_DECL: {
			VarDecl varDecl = (VarDecl) theEObject;
			T result = caseVarDecl(varDecl);
			if (result == null)
				result = caseStatement(varDecl);
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
		case RobotScriptModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ASSIGN: {
			Assign assign = (Assign) theEObject;
			T result = caseAssign(assign);
			if (result == null)
				result = caseStatement(assign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ASSIGN_VAR: {
			AssignVar assignVar = (AssignVar) theEObject;
			T result = caseAssignVar(assignVar);
			if (result == null)
				result = caseAssign(assignVar);
			if (result == null)
				result = caseStatement(assignVar);
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
				result = caseStatement(setSpeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.PRIMARY_BOOL_EXPR: {
			PrimaryBoolExpr primaryBoolExpr = (PrimaryBoolExpr) theEObject;
			T result = casePrimaryBoolExpr(primaryBoolExpr);
			if (result == null)
				result = caseExpression(primaryBoolExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
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
				result = caseExpression(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
			if (result == null)
				result = caseStatement(movement);
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
				result = caseStatement(rotation);
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
				result = caseStatement(linear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = casePrimaryAriExpr(value);
			if (result == null)
				result = caseExpression(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseValue(sensor);
			if (result == null)
				result = casePrimaryAriExpr(sensor);
			if (result == null)
				result = caseExpression(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseValue(literal);
			if (result == null)
				result = casePrimaryAriExpr(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SPEED: {
			Speed speed = (Speed) theEObject;
			T result = caseSpeed(speed);
			if (result == null)
				result = caseValue(speed);
			if (result == null)
				result = casePrimaryAriExpr(speed);
			if (result == null)
				result = caseExpression(speed);
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
				result = casePrimaryAriExpr(variable);
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
				result = caseStatement(funCall);
			if (result == null)
				result = casePrimaryAriExpr(funCall);
			if (result == null)
				result = caseExpression(funCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.PRIMARY_ARI_EXPR: {
			PrimaryAriExpr primaryAriExpr = (PrimaryAriExpr) theEObject;
			T result = casePrimaryAriExpr(primaryAriExpr);
			if (result == null)
				result = caseExpression(primaryAriExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = casePrimaryBoolExpr(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.COMPARE: {
			Compare compare = (Compare) theEObject;
			T result = caseCompare(compare);
			if (result == null)
				result = casePrimaryBoolExpr(compare);
			if (result == null)
				result = caseExpression(compare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.MUL: {
			Mul mul = (Mul) theEObject;
			T result = caseMul(mul);
			if (result == null)
				result = caseExpression(mul);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.ARI_UN_OP: {
			AriUnOp ariUnOp = (AriUnOp) theEObject;
			T result = caseAriUnOp(ariUnOp);
			if (result == null)
				result = casePrimaryAriExpr(ariUnOp);
			if (result == null)
				result = caseExpression(ariUnOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = caseStatement(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.SIMPLE_VAR_DECL: {
			SimpleVarDecl simpleVarDecl = (SimpleVarDecl) theEObject;
			T result = caseSimpleVarDecl(simpleVarDecl);
			if (result == null)
				result = caseVarDecl(simpleVarDecl);
			if (result == null)
				result = caseStatement(simpleVarDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.VAR_DECL_INIT: {
			VarDeclInit varDeclInit = (VarDeclInit) theEObject;
			T result = caseVarDeclInit(varDeclInit);
			if (result == null)
				result = caseVarDecl(varDeclInit);
			if (result == null)
				result = caseStatement(varDeclInit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.LOOP_STMT: {
			LoopStmt loopStmt = (LoopStmt) theEObject;
			T result = caseLoopStmt(loopStmt);
			if (result == null)
				result = caseStatement(loopStmt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.IF_STMT: {
			IfStmt ifStmt = (IfStmt) theEObject;
			T result = caseIfStmt(ifStmt);
			if (result == null)
				result = caseStatement(ifStmt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotScriptModelPackage.RETURN_STMT: {
			ReturnStmt returnStmt = (ReturnStmt) theEObject;
			T result = caseReturnStmt(returnStmt);
			if (result == null)
				result = caseStatement(returnStmt);
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
	 * Returns the result of interpreting the object as an instance of '<em>Assign Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignVar(AssignVar object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Primary Bool Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Bool Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryBoolExpr(PrimaryBoolExpr object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Primary Ari Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Ari Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryAriExpr(PrimaryAriExpr object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompare(Compare object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ari Un Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ari Un Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAriUnOp(AriUnOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleVarDecl(SimpleVarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Decl Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Decl Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDeclInit(VarDeclInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopStmt(LoopStmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStmt(IfStmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStmt(ReturnStmt object) {
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
