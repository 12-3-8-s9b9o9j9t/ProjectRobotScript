grammar RobotScript
import 'Terminals'
import 'robotScriptModel-types'

entry EntryPoint returns EntryPoint:
    (funs+=FunDef )* 
;

FunDef returns FunDef:
    ^type=AnyType  name=ID  '(' (params+=SimpleVarDecl  (',' params+=SimpleVarDecl  )* )? ')' body=Block   
;

AnyType returns AnyType:
    VoidType | DataType 
;

VoidType returns VoidType:
    name='void'  
;

DataType returns DataType:
    name=('bool' | 'number' ) 
;

SimpleVarDecl returns SimpleVarDecl:
    ^type=DataType  name=ID   
;

VarDeclInit returns VarDeclInit:
    ^type=DataType  name=ID  '=' expr=Expression   
;

Expression returns Expression:
    Or 
;

Or returns Expression:
    And ({BinExpr.expr1=current} op='||'  expr2=And  )*  
;

And returns Expression:
    PrimBoolExpr ({BinExpr.expr1=current} op='&&'  expr2=PrimBoolExpr  )*  
;

PrimBoolExpr returns Expression:
    Not | Compare 
;

Not returns UnExpr:
    op='!'  expr=Expression   
;

Compare returns Expression:
    Add ({BinExpr.expr1=current} op=('==' | '!=' | '<=' | '>=' | '<' | '>' ) expr2=Add  )*  
;

Add returns Expression:
    Mul ({BinExpr.expr1=current} op=('+' | '-' ) expr2=Mul  )*  
;

Mul returns Expression:
    PrimExpr ({BinExpr.expr1=current} op=('*' | '/' ) expr2=PrimExpr  )*  
;

PrimExpr returns Expression:
    Neg | Group | Lit | Ref | FunCall | GetSpeed | Distance | Time 
;

Neg returns UnExpr:
    op='-'  expr=Expression   
;

Group returns Expression:
    '(' Expression ')'  
;

Lit returns Lit:
    val=INT  
;

Ref returns Ref:
    val=[VarDecl:ID ] 
;

GetSpeed returns GetSpeed:
    {GetSpeed} 'Speed' (unit=UnitCast )?  
;

Distance returns Distance:
    {Distance} 'Distance' (unit=UnitCast )?  
;

Time returns Time:
    {Time} 'Time'  
;

FunCall returns FunCall:
    fun=[FunDef:ID ] '(' (params+=Expression  (',' params+=Expression  )* )? ')'  
;

Block returns Block:
    {Block} '{' (stmts+=Statement )* '}'  
;

Statement returns Statement:
    Block | SimpleVarDecl | VarDeclInit | AssignVar | SetSpeed | FunCall | WhileStmt | IfStmt | ReturnStmt | Linear | Rotation 
;

AssignVar returns AssignVar:
    ref=[VarDecl:ID ] '=' expr=Expression   
;

SetSpeed returns SetSpeed:
    'Speed' '=' expr=Expression  (unit=UnitCast )?  
;

WhileStmt returns WhileStmt:
    'while' '(' expr=Expression  ')' stmt=Statement   
;

IfStmt returns IfStmt:
    'if' '(' expr=Expression  ')' stmt1=Statement  ('else' stmt2=Statement  )?  
;

ReturnStmt returns ReturnStmt:
    {ReturnStmt} 'return' (expr=Expression )?  
;

Linear returns Linear:
    dir=Direction  expr=Expression  (unit=UnitCast )?  
;

Rotation returns Rotation:
    'Rotate' expr=Expression   
;

UnitCast returns UnitCast:
    'in' unit=Unit   
;

Unit returns Unit:
    Unit_m | Unit_dm | Unit_cm | Unit_mm
;
Unit_m returns Unit_m: 'm' ;
Unit_dm returns Unit_dm: 'dm' ;
Unit_cm returns Unit_cm: 'cm' ;
Unit_mm returns Unit_mm: 'mm' ;

Direction returns Direction:
    Direction_Forward | Direction_Sideways
;
Direction_Forward returns Direction_Forward: 'Forward' ;
Direction_Sideways returns Direction_Sideways: 'Sideways' ;

