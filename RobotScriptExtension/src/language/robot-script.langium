grammar RobotScript
import 'Terminals'
import 'robotScriptModel-types'

entry EntryPoint returns EntryPoint:
    {EntryPoint} 'EntryPoint' '{' ('functions' '{' functions+=FunctionDef  ("," functions+=FunctionDef  )* '}' )? '}'  
;

AnyType returns AnyType:
    VoidType | DataType 
;

Statement returns Statement:
    AssignVar | SetSpeed | Rotation | Linear | FunCall | Block | SimpleVarDecl | VarDeclInit | LoopStmt | IfStmt | ReturnStmt 
;

Expression returns Expression:
    And | Add | Or | Sensor | Literal | Speed | Variable | FunCall | Not | Compare | Mul | AriUnOp 
;

VarDecl returns VarDecl:
    SimpleVarDecl | VarDeclInit 
;

PrimaryBoolExpr returns PrimaryBoolExpr:
    Not | Compare 
;

PrimaryAriExpr returns PrimaryAriExpr:
    Sensor | Literal | Speed | Variable | FunCall | AriUnOp 
;

FunctionDef returns FunctionDef:
    'FunctionDef' name=EString  '{' 'returnType' returnType=AnyType  'block' block=Block  ('inputs' '{' inputs+=SimpleVarDecl  ("," inputs+=SimpleVarDecl  )* '}' )? '}'  
;

EString returns string:
    STRING | ID 
;

Block returns Block:
    {Block} 'Block' '{' ('stmts' '{' stmts+=Statement  ("," stmts+=Statement  )* '}' )? '}'  
;

SimpleVarDecl returns SimpleVarDecl:
    'SimpleVarDecl' name=EString  '{' 'type' ^type=DataType  '}'  
;

VoidType returns VoidType:
    {VoidType} 'VoidType'  
;

DataType returns DataType:
    {DataType} 'DataType'  
;

AssignVar returns AssignVar:
    'AssignVar' '{' 'var' var=[VarDecl:EString ] 'expr' expr=Expression  '}'  
;

SetSpeed returns SetSpeed:
    'SetSpeed' '{' ('unit' unit=Unit  )? 'expr' expr=Expression  'speed' speed=Speed  '}'  
;

Rotation returns Rotation:
    'Rotation' '{' 'expr' expr=Expression  '}'  
;

Linear returns Linear:
    'Linear' '{' ('unit' unit=Unit  )? 'expr' expr=Expression  '}'  
;

FunCall returns FunCall:
    'FunCall' '{' 'fun' fun=[FunctionDef:EString ] ('inputs' '{' inputs+=Expression  ("," inputs+=Expression  )* '}' )? '}'  
;

VarDeclInit returns VarDeclInit:
    'VarDeclInit' name=EString  '{' 'type' ^type=DataType  'expr' expr=Expression  '}'  
;

LoopStmt returns LoopStmt:
    'LoopStmt' '{' 'expr' expr=Expression  'stmt' stmt=Statement  '}'  
;

IfStmt returns IfStmt:
    'IfStmt' '{' 'expr' expr=Expression  'ifstmt' ifstmt=Statement  ('elsestmt' elsestmt=Statement  )? '}'  
;

ReturnStmt returns ReturnStmt:
    {ReturnStmt} 'ReturnStmt' '{' ('expr' expr=Expression  )? '}'  
;

And returns And:
    'And' '{' 'exprs' '{' exprs+=PrimaryBoolExpr  ("," exprs+=PrimaryBoolExpr  )* '}' '}'  
;

Add returns Add:
    'Add' '{' 'exprs' '{' exprs+=Mul  ("," exprs+=Mul  )* '}' '}'  
;

Or returns Or:
    'Or' '{' 'exprs' '{' exprs+=And  ("," exprs+=And  )* '}' '}'  
;

Sensor returns Sensor:
    {Sensor} 'Sensor'  
;

Literal returns Literal:
    {Literal} 'Literal'  
;

Speed returns Speed:
    {Speed} 'Speed'  
;

Variable returns Variable:
    'Variable' '{' 'var' var=[VarDecl:EString ] '}'  
;

Not returns Not:
    'Not' '{' 'expr' expr=Compare  '}'  
;

Compare returns Compare:
    'Compare' '{' 'exprs' '{' exprs+=Add  ("," exprs+=Add  )* '}' '}'  
;

Mul returns Mul:
    'Mul' '{' 'exprs' '{' exprs+=PrimaryAriExpr  ("," exprs+=PrimaryAriExpr  )* '}' '}'  
;

AriUnOp returns AriUnOp:
    'AriUnOp' '{' 'expr' expr=Expression  '}'  
;

Unit returns Unit:
    Unit_m | Unit_dm | Unit_cm | Unit_mm
;
Unit_m returns Unit_m: 'm' ;
Unit_dm returns Unit_dm: 'dm' ;
Unit_cm returns Unit_cm: 'cm' ;
Unit_mm returns Unit_mm: 'mm' ;

