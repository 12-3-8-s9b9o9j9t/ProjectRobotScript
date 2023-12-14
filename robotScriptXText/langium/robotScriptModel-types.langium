
type Unit = Unit_m | Unit_dm | Unit_cm | Unit_mm;
type Unit_m = 'm';
type Unit_dm = 'dm';
type Unit_cm = 'cm';
type Unit_mm = 'mm';

type Direction = Direction_Forward | Direction_Sideways;
type Direction_Forward = 'Forward';
type Direction_Sideways = 'Sideways';

interface EntryPoint {
	funs: FunDef[]
}

interface FunDef {
	name: string
	^type: AnyType
	body: Block
	params: SimpleVarDecl[]
}

interface AnyType {
	name: string
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
	name: string
}

interface DataType extends AnyType {
}

interface VoidType extends AnyType {
}

interface VarDeclInit extends VarDecl {
	expr: Expression
}

interface Expression {
}

interface BinExpr extends Expression {
	op: string
	expr1: Expression
	expr2: Expression
}

interface UnExpr extends Expression {
	op: string
	expr: Expression
}

interface Lit extends PrimExpr {
	val: number
}

interface PrimExpr extends Expression {
}

interface Ref extends PrimExpr {
	val: @VarDecl
}

interface GetSpeed extends PrimExpr {
	unit?: UnitCast
}

interface UnitCast {
	unit: Unit
}

interface Distance extends Sensor {
	unit?: UnitCast
}

interface Sensor extends PrimExpr {
}

interface Time extends Sensor {
}

interface FunCall extends Statement, PrimExpr {
	fun: @FunDef
	params: Expression[]
}

interface AssignVar extends Assign {
	ref: @VarDecl
}

interface Assign extends Statement {
	expr: Expression
}

interface SetSpeed extends Assign {
	unit?: UnitCast
}

interface WhileStmt extends Statement {
	expr: Expression
	stmt: Statement
}

interface IfStmt extends Statement {
	expr: Expression
	stmt1: Statement
	stmt2?: Statement
}

interface ReturnStmt extends Statement {
	expr?: Expression
}

interface Linear extends Movement {
	unit?: UnitCast
	dir: Direction
}

interface Movement extends Statement {
	expr: Expression
}

interface Rotation extends Movement {
}

