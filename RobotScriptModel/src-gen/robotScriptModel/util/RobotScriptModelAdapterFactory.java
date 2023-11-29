/**
 */
package robotScriptModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robotScriptModel.*;

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
		public Adapter caseEntryPoint(EntryPoint object) {
			return createEntryPointAdapter();
		}

		@Override
		public Adapter caseFunctionDef(FunctionDef object) {
			return createFunctionDefAdapter();
		}

		@Override
		public Adapter caseAnyType(AnyType object) {
			return createAnyTypeAdapter();
		}

		@Override
		public Adapter caseVarDecl(VarDecl object) {
			return createVarDeclAdapter();
		}

		@Override
		public Adapter caseVoidType(VoidType object) {
			return createVoidTypeAdapter();
		}

		@Override
		public Adapter caseDataType(DataType object) {
			return createDataTypeAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseAssign(Assign object) {
			return createAssignAdapter();
		}

		@Override
		public Adapter caseAssignVar(AssignVar object) {
			return createAssignVarAdapter();
		}

		@Override
		public Adapter caseSetSpeed(SetSpeed object) {
			return createSetSpeedAdapter();
		}

		@Override
		public Adapter casePrimaryBoolExpr(PrimaryBoolExpr object) {
			return createPrimaryBoolExprAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseAdd(Add object) {
			return createAddAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseMovement(Movement object) {
			return createMovementAdapter();
		}

		@Override
		public Adapter caseRotation(Rotation object) {
			return createRotationAdapter();
		}

		@Override
		public Adapter caseLinear(Linear object) {
			return createLinearAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseLiteral(Literal object) {
			return createLiteralAdapter();
		}

		@Override
		public Adapter caseSpeed(Speed object) {
			return createSpeedAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseFunCall(FunCall object) {
			return createFunCallAdapter();
		}

		@Override
		public Adapter casePrimaryAriExpr(PrimaryAriExpr object) {
			return createPrimaryAriExprAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseCompare(Compare object) {
			return createCompareAdapter();
		}

		@Override
		public Adapter caseMul(Mul object) {
			return createMulAdapter();
		}

		@Override
		public Adapter caseAriUnOp(AriUnOp object) {
			return createAriUnOpAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseSimpleVarDecl(SimpleVarDecl object) {
			return createSimpleVarDeclAdapter();
		}

		@Override
		public Adapter caseVarDeclInit(VarDeclInit object) {
			return createVarDeclInitAdapter();
		}

		@Override
		public Adapter caseLoopStmt(LoopStmt object) {
			return createLoopStmtAdapter();
		}

		@Override
		public Adapter caseIfStmt(IfStmt object) {
			return createIfStmtAdapter();
		}

		@Override
		public Adapter caseReturnStmt(ReturnStmt object) {
			return createReturnStmtAdapter();
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
	 * Creates a new adapter for an object of class '{@link robotScriptModel.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.EntryPoint
	 * @generated
	 */
	public Adapter createEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.FunctionDef
	 * @generated
	 */
	public Adapter createFunctionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AnyType
	 * @generated
	 */
	public Adapter createAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.VarDecl
	 * @generated
	 */
	public Adapter createVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AssignVar <em>Assign Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AssignVar
	 * @generated
	 */
	public Adapter createAssignVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.SetSpeed <em>Set Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.SetSpeed
	 * @generated
	 */
	public Adapter createSetSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.PrimaryBoolExpr <em>Primary Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.PrimaryBoolExpr
	 * @generated
	 */
	public Adapter createPrimaryBoolExprAdapter() {
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
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
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
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.FunCall
	 * @generated
	 */
	public Adapter createFunCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.PrimaryAriExpr <em>Primary Ari Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.PrimaryAriExpr
	 * @generated
	 */
	public Adapter createPrimaryAriExprAdapter() {
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
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Compare
	 * @generated
	 */
	public Adapter createCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Mul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Mul
	 * @generated
	 */
	public Adapter createMulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.AriUnOp <em>Ari Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.AriUnOp
	 * @generated
	 */
	public Adapter createAriUnOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.SimpleVarDecl <em>Simple Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.SimpleVarDecl
	 * @generated
	 */
	public Adapter createSimpleVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.VarDeclInit <em>Var Decl Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.VarDeclInit
	 * @generated
	 */
	public Adapter createVarDeclInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.LoopStmt <em>Loop Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.LoopStmt
	 * @generated
	 */
	public Adapter createLoopStmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.IfStmt <em>If Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.IfStmt
	 * @generated
	 */
	public Adapter createIfStmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotScriptModel.ReturnStmt <em>Return Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotScriptModel.ReturnStmt
	 * @generated
	 */
	public Adapter createReturnStmtAdapter() {
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
