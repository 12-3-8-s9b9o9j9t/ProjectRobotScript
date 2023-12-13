grammar RobotScript
import 'terminals'
import 'robot-script-model-types'

entry EntryPoint:
    (funs+=FunDef)*
;

FunDef:
    type=AnyType name=ID '('(params+=SimpleVarDecl  (',' params+=SimpleVarDecl)* )? ')' body=Block
;

AnyType:
    VoidType | DataType
;

VoidType infers AnyType:
    name='void'
;

DataType infers AnyType:
    name=('bool' | 'number')
;

VarDecl: SimpleVarDecl | VarDeclInit;

SimpleVarDecl infers VarDecl:
    type=DataType name=ID
;

VarDeclInit infers VarDecl:
    SimpleVarDecl '=' expr=Expression
;

Expression:
    Or
;

Or infers Expression:
    And ({infer BinExpr.expr1=current} op='||' expr2=And)*
;

And infers Expression:
    PrimBoolExpr ({infer BinExpr.expr1=current} op='&&' expr2=PrimBoolExpr)*
;

PrimBoolExpr infers Expression:
    Not | Compare 
;

Not infers UnExpr:
    op='!' expr=Compare
;

Compare infers Expression:
    Add ({infer BinExpr.expr1=current} op=('=='|'!='|'<='|'>='|'<'|'>') expr2=Add)*
;

Add infers Expression:
    Mul ({infer BinExpr.expr1=current} op=('+'|'-') expr2=Mul)*
;

Mul infers Expression:
    PrimExpr ({infer BinExpr.expr1=current} op=('*'|'/') expr2=PrimExpr)*
;

PrimExpr infers Expression:
    Neg | Group | Lit | Ref | FunCall | GetSpeed | Sensor
;

Neg infers UnExpr:
    op='-' expr=Expression
;

Group infers Expression:
    '(' Expression ')'
;

Lit:
    val=(BOOL|INT)
;

Ref:
    val=[VarDecl:ID]  
;

GetSpeed:
    Speed ('in' unit=Unit)?
;

Speed:
    val='Speed'
;

Sensor:
    Distance | Time
;

Distance:
    val='Distance' (UnitCast)?
;

Time:
    val='Time'
;

FunCall:
    fun=[FunDef:ID] '(' (params+=Expression  (',' params+=Expression  )* )? ')'  
;

Block:
    '{' (stmts+=Statement)* '}'
;

Statement:
    Block | VarDecl | Assign | FunCall | WhileStmt | IfStmt | ReturnStmt | Linear | Rotation
;


Assign:
    AssignVar | SetSpeed
;

AssignVar:
    ref=[VarDecl:ID ] '=' expr=Expression 
;

SetSpeed:
    Speed '=' expr=Expression (UnitCast)?
;

WhileStmt:
    'while' '(' expr=Expression ')' stmt=Statement  
;

IfStmt:
    'if' '(' expr=Expression ')' stmt1=Statement  ('else' stmt2=Statement  )?  
;

ReturnStmt:
    'return' (expr=Expression )?   
;

Linear:
    dir=('Forward' | 'Sideways') expr=Expression (UnitCast)? 
;

Rotation:
    'Rotate' expr=Expression 
;

UnitCast:
    'in' unit=Unit
;

Unit returns Unit:
    Unit_m | Unit_dm | Unit_cm | Unit_mm
;

Unit_m returns Unit_m: 'm' ;
Unit_dm returns Unit_dm: 'dm' ;
Unit_cm returns Unit_cm: 'cm' ;
Unit_mm returns Unit_mm: 'mm' ;