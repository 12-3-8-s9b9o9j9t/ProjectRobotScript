
type Unit = Unit_m | Unit_dm | Unit_cm | Unit_mm;
type Unit_m = 'm';
type Unit_dm = 'dm';
type Unit_cm = 'cm';
type Unit_mm = 'mm';

interface EntryPoint {
	functions: FunctionDef[]
}

interface FunctionDef {
	name?: string
	returnType: AnyType
	block: Block
	inputs: SimpleVarDecl[]
}

interface AnyType {
}

interface Block extends Statement {
	stmts: Statement[]
}

interface Statement {
}

interface SimpleVarDecl extends VarDecl {
}

interface VarDecl extends Statement {
	^type: DataType
	name?: string
}

interface DataType extends AnyType {
}

interface Expression {
}

interface PrimaryBoolExpr extends Expression {
}

interface PrimaryAriExpr extends Expression {
}

interface VoidType extends AnyType {
}

interface AssignVar extends Assign {
	var: @VarDecl
}

interface Assign extends Statement {
	expr: Expression
}

interface SetSpeed extends Assign {
	unit?: Unit
	speed: Speed
}

interface Speed extends Value {
}

interface Value extends PrimaryAriExpr {
}

interface Rotation extends Movement {
}

interface Movement extends Statement {
	expr: Expression
}

interface Linear extends Movement {
	unit?: Unit
}

interface FunCall extends Value, Statement {
	fun: @FunctionDef
	inputs: Expression[]
}

interface VarDeclInit extends VarDecl {
	expr: Expression
}

interface LoopStmt extends Statement {
	expr: Expression
	stmt: Statement
}

interface IfStmt extends Statement {
	expr: Expression
	ifstmt: Statement
	elsestmt?: Statement
}

interface ReturnStmt extends Statement {
	expr?: Expression
}

interface And extends Expression {
	exprs: PrimaryBoolExpr[]
}

interface Add extends Expression {
	exprs: Mul[]
}

interface Mul extends Expression {
	exprs: PrimaryAriExpr[]
}

interface Or extends Expression {
	exprs: And[]
}

interface Sensor extends Value {
}

interface Literal extends Value {
}

interface Variable extends Value {
	var: @VarDecl
}

interface Not extends PrimaryBoolExpr {
	expr: Compare
}

interface Compare extends PrimaryBoolExpr {
	exprs: Add[]
}

interface AriUnOp extends PrimaryAriExpr {
	expr: Expression
}

