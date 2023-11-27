
type Unit = Unit_M | Unit_DM | Unit_CM | Unit_MM;
type Unit_M = 'M';
type Unit_DM = 'DM';
type Unit_CM = 'CM';
type Unit_MM = 'MM';

interface EntryPoint {
	functions: FunctionDef[]
}

interface FunctionDef {
	name?: string
	returnType: AnyType
	body: Command[]
	inputs: VarDecl[]
}

interface AnyType {
}

interface Command {
}

interface VarDecl extends Command {
	^type: DataType
	name?: string
}

interface DataType extends AnyType {
}

interface Expression {
}

interface VoidType extends AnyType {
}

interface NumberType extends DataType {
}

interface BooleanType extends DataType {
}

interface Loop extends ControlStructure {
}

interface ControlStructure extends Command {
	body: Command[]
	cond: Expression
}

interface If extends ControlStructure {
}

interface IfElse extends If {
	bodyElse: Command[]
}

interface AssignAtDecl extends Assign {
	vardecl: VarDecl
}

interface Assign extends Command {
	expression: Expression
}

interface ReAssign extends Assign {
	var: @VarDecl
}

interface SetSpeed extends Assign {
	unit?: Unit
	speedstate: @SpeedState
}

interface SpeedState extends Value {
}

interface Value extends Expression {
}

interface Rotation extends Movement {
}

interface Movement extends Command {
	expression: Expression
}

interface Front extends Linear {
}

interface Linear extends Movement {
	unit?: Unit
}

interface Back extends Linear {
}

interface Right extends Linear {
}

interface Left extends Linear {
}

interface FunCall extends Value, Command {
	fun: @FunctionDef
	inputs: Expression[]
}

interface Neg extends UnOp {
}

interface UnOp extends Expression {
	op: Expression
}

interface Not extends UnOp {
}

interface Greater extends BinOp {
}

interface BinOp extends Expression {
	rightOp: Expression
	leftOp: Expression
}

interface And extends BinOp {
}

interface Add extends BinOp {
}

interface Less extends BinOp {
}

interface Or extends BinOp {
}

interface Sub extends BinOp {
}

interface GEq extends BinOp {
}

interface Equ extends BinOp {
}

interface Mul extends BinOp {
}

interface LEq extends BinOp {
}

interface NEq extends BinOp {
}

interface Div extends BinOp {
}

interface TimeSensor extends Value {
}

interface DistSensor extends Value {
}

interface BoolLiteral extends Value {
}

interface NumberLiteral extends Value {
}

interface Variable extends Value {
	var: @VarDecl
}

