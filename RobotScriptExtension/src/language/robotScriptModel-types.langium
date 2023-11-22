
interface Model {
	command: Command[]
}

interface Command {
}

interface Boolean extends Expressions {
}

interface Expressions {
}

interface Units {
	prefix?: Prefix
}

interface Prefix {
}

interface Arithmetic extends Expressions {
}

interface Rotation extends Movement {
}

interface Movement extends Functions {
}

interface Functions extends Command {
	defvar: Command[]
}

interface Linear extends Movement {
}

interface Clock extends Sensors {
}

interface Sensors extends Functions {
}

interface UltraSound extends Sensors {
}

interface Speed extends State {
}

interface State extends Functions {
}

interface Loop extends ControlStructure {
	loopCondition: Boolean
	body: Command[]
}

interface ControlStructure extends Command {
}

interface Switch extends ControlStructure {
	switchCondition: Boolean
	body: Command[]
}

interface DefVar extends Command {
	name?: string
	expressions: Expressions
	units?: Units
}

interface BoolVariables extends BoolValues {
	reference: @DefVar
}

interface BoolValues extends Boolean {
}

interface And extends BoolBinary {
}

interface BoolBinary extends Boolean {
	left: Boolean
	right: Boolean
}

interface Or extends BoolBinary {
}

interface Not extends BoolUnary {
}

interface BoolUnary extends Boolean {
	operand: Boolean
}

interface BoolLiteral extends BoolValues {
}

interface Add extends AriBinary {
}

interface AriBinary extends Arithmetic {
	right: Arithmetic
	left: Arithmetic
}

interface AriLiteral extends AriValues {
	units?: Units
}

interface AriValues extends Arithmetic {
}

interface AriVariables extends AriValues {
	reference: @DefVar
}

interface Sub extends AriBinary {
}

interface Neg extends AriUnary {
}

interface AriUnary extends Arithmetic {
	operand: Arithmetic
}

interface Meter extends Units {
}

interface Second extends Units {
}

interface Degree extends Units {
}

interface Mili extends Prefix {
}

interface Centi extends Prefix {
}

