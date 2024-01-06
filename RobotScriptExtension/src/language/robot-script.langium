grammar RobotScript
import 'terminals'

entry EntryPoint:
    (funs+=FunDef)* 
;

FunDef:
    type=AnyType name=ID '('(params+=Param (',' params+=Param)* )? ')' body=Block   
;

AnyType:
    VoidType | DataType 
;

VoidType infers AnyType:
    name='void'  
;

DataType infers AnyType:
    name=('bool'|'number')
;

fragment VarSign:
    type=DataType name=ID
;

VarDecl: 
    VarSign ('=' expr=Expression)?
;

Param infers VarDecl:
    VarSign
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
    Not | Equ 
;

Not infers UnExpr:
    op='!'  expr=Equ
;

Equ infers Expression:
    Comp ({infer BinExpr.expr1=current} op=('=='|'!=') expr2=Add)*  
;

Comp infers Expression:
    Add ({infer BinExpr.expr1=current} op=('<'|'<='|'>'|'>=') expr2=Add)*
;

Add infers Expression:
    Mul ({infer BinExpr.expr1=current} op=('+'|'-') expr2=Mul)*  
;

Mul infers Expression:
    PrimExpr ({infer BinExpr.expr1=current} op=('*'|'/'|'%') expr2=PrimExpr)*  
;

PrimExpr infers Expression:
    Neg | Group | Lit | Ref | FunCall | GetSpeed | Distance | Time 
;

Neg infers UnExpr:
    op='-' expr=Expression   
;

Group infers Expression:
    '(' Expression ')'  
;

Lit:
    val=(BOOL|NUMBER)  
;

Ref:
    val=[VarDecl:ID] 
;

GetSpeed:
    'Speed' (unit=UnitCast)?
;

Distance:
    'Distance' (unit=UnitCast )?  
;

Time:
    {infer Time} 'Time'  
;

FunCall:
    fun=[FunDef:ID ] '(' (params+=Expression (',' params+=Expression)* )? ')'  
;

Block:
    '{' (stmts+=Statement )* '}'  
;

Statement:
    Block | WhileStmt | IfStmt | (VarDecl | AssignVar | SetSpeed | FunCall | ReturnStmt | Linear | Rotation) ';' 
;

fragment Assign:
    op=('||='|'&&='|'+='|'-='|'*='|'/='|'%='|'=') expr=Expression
;

AssignVar:
    ref=[VarDecl:ID ] Assign
;

SetSpeed:
    'Speed' Assign (unit=UnitCast)?  
;

WhileStmt:
    'while' '(' expr=Expression ')' stmt=Statement   
;

IfStmt:
    'if' '(' expr=Expression ')' stmt1=Statement ('else' stmt2=Statement)?  
;

ReturnStmt:
    'return' (expr=Expression)?  
;

Linear:
    dir=('Forward'|'Sideways') expr=Expression (unit=UnitCast )?  
;

Rotation:
    'Rotate' expr=Expression   
;

UnitCast:
    'in' unit=('m'|'dm'|'cm'|'mm')   
;
