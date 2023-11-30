grammar RobotScript
import 'Terminals'
import 'robotScriptModel-types'

entry EntryPoint returns EntryPoint:
    {EntryPoint} (functions+=FunctionDef)*
;

AnyType returns AnyType:
    VoidType | DataType 
;

Statement returns Statement:
    AssignVar | SetSpeed | Rotation | Linear | FunCall | Block | VarDecl | LoopStmt | IfStmt | ReturnStmt 
;

Expression returns Expression:
    And | Add | Or | Sensor | Literal | Speed | Variable | FunCall | Not | Compare | Mul | AriUnOp 
;

VarDecl returns VarDecl:
    (SimpleVarDecl | VarDeclInit ) ';'
;

PrimaryBoolExpr returns PrimaryBoolExpr:
    Not | Compare 
;

PrimaryAriExpr returns PrimaryAriExpr:
    Sensor | Literal | Speed | Variable | FunCall | AriUnOp 
;

FunctionDef returns FunctionDef:
    returnType=AnyType  name=ID '('(inputs+=SimpleVarDecl  (',' inputs+=SimpleVarDecl)* )? ')' block=Block
;

Block returns Block:
    {Block} '{' (stmts+=Statement)* '}'
;

SimpleVarDecl returns SimpleVarDecl:
    ^type=DataType name=ID  
;

VoidType returns VoidType:
    {VoidType} 'void'  
;

DataType returns DataType:
    {DataType} 'bool' | 'number'  
;

AssignVar returns AssignVar:
    var=[VarDecl:ID ] '=' expr=Expression ';'
;

SetSpeed returns SetSpeed:
    speed=Speed '=' expr=Expression (unit=Unit)? ';'  
;

Rotation returns Rotation:
    'Rotate' expr=Expression ';'
;

Linear returns Linear:
    'Move' expr=Expression (unit=Unit)? ';'
;

FunCall returns FunCall:
    fun=[FunctionDef:ID ] '(' (inputs+=Expression  (',' inputs+=Expression  )* )? ')'  ';'
;

VarDeclInit returns VarDeclInit:
    ^type=DataType name=ID '=' expr=Expression
;

LoopStmt returns LoopStmt:
    'loop' '(' expr=Expression ')' stmt=Statement  
;

IfStmt returns IfStmt:
    'if' '(' expr=Expression ')' ifstmt=Statement  ('else' elsestmt=Statement  )?  
;

ReturnStmt returns ReturnStmt:
    {ReturnStmt} 'return' ('expr' expr=Expression  )? ';'  
;

And returns And:
    exprs+=PrimaryBoolExpr  ('&&' exprs+=PrimaryBoolExpr  )*  
;

Add returns Add:
    exprs+=Mul  ('+' exprs+=Mul  )*  
;

Or returns Or:
    exprs+=And  ('||' exprs+=And  )*
;

Sensor returns Sensor:
    {Sensor} 'Sensor'  
;

Literal returns Literal:
    {Literal} 'true' | 'false' 
;

Speed returns Speed:
    {Speed} 'Speed'  
;

Variable returns Variable:
    var=[VarDecl:ID ]  
;

Not returns Not:
    '!' expr=Compare
;

Compare returns Compare:
    exprs+=Add  ('==' exprs+=Add  )*
;

Mul returns Mul:
    exprs+=PrimaryAriExpr  ('*' exprs+=PrimaryAriExpr  )*
;

AriUnOp returns AriUnOp:
    '-'expr=Expression | '(' expr=Expression ')'
;

Unit returns Unit:
    Unit_m | Unit_dm | Unit_cm | Unit_mm
;
Unit_m returns Unit_m: 'm' ;
Unit_dm returns Unit_dm: 'dm' ;
Unit_cm returns Unit_cm: 'cm' ;
Unit_mm returns Unit_mm: 'mm' ;

