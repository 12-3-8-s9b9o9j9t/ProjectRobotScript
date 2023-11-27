grammar RobotScript
import 'Terminals'
import 'robotScriptModel-types'

entry EntryPoint returns EntryPoint:
    {EntryPoint} 'EntryPoint' '{' ('functions' '{' functions+=FunctionDef  ("," functions+=FunctionDef  )* '}' )? '}'  
;

AnyType returns AnyType:
    VoidType | NumberType | BooleanType 
;

Command returns Command:
    VarDecl | Loop | If_Impl | IfElse | AssignAtDecl | ReAssign | SetSpeed | Rotation | Front | Back | Right | Left | FunCall 
;

DataType returns DataType:
    NumberType | BooleanType 
;

Expression returns Expression:
    Neg | Not | Greater | And | Add | Less | Or | Sub | GEq | Equ | Mul | LEq | NEq | Div | TimeSensor | DistSensor | BoolLiteral | NumberLiteral | SpeedState | Variable | FunCall 
;

FunctionDef returns FunctionDef:
    'FunctionDef' name=EString  '{' 'returnType' returnType=AnyType  ('body' '{' body+=Command  ("," body+=Command  )* '}' )? ('inputs' '{' inputs+=VarDecl  ("," inputs+=VarDecl  )* '}' )? '}'  
;

EString returns string:
    STRING | ID 
;

VarDecl returns VarDecl:
    'VarDecl' name=EString  '{' 'type' ^type=DataType  '}'  
;

VoidType returns VoidType:
    {VoidType} 'VoidType'  
;

NumberType returns NumberType:
    {NumberType} 'NumberType'  
;

BooleanType returns BooleanType:
    {BooleanType} 'BooleanType'  
;

Loop returns Loop:
    'Loop' '{' ('body' '{' body+=Command  ("," body+=Command  )* '}' )? 'cond' cond=Expression  '}'  
;

If_Impl returns If:
    'If' '{' ('body' '{' body+=Command  ("," body+=Command  )* '}' )? 'cond' cond=Expression  '}'  
;

IfElse returns IfElse:
    'IfElse' '{' ('body' '{' body+=Command  ("," body+=Command  )* '}' )? 'cond' cond=Expression  ('bodyElse' '{' bodyElse+=Command  ("," bodyElse+=Command  )* '}' )? '}'  
;

AssignAtDecl returns AssignAtDecl:
    'AssignAtDecl' '{' 'expression' expression=Expression  'vardecl' vardecl=VarDecl  '}'  
;

ReAssign returns ReAssign:
    'ReAssign' '{' 'var' var=[VarDecl:EString ] 'expression' expression=Expression  '}'  
;

SetSpeed returns SetSpeed:
    'SetSpeed' '{' ('unit' unit=Unit  )? 'speedstate' speedstate=[SpeedState:EString ] 'expression' expression=Expression  '}'  
;

Rotation returns Rotation:
    'Rotation' '{' 'expression' expression=Expression  '}'  
;

Front returns Front:
    'Front' '{' ('unit' unit=Unit  )? 'expression' expression=Expression  '}'  
;

Back returns Back:
    'Back' '{' ('unit' unit=Unit  )? 'expression' expression=Expression  '}'  
;

Right returns Right:
    'Right' '{' ('unit' unit=Unit  )? 'expression' expression=Expression  '}'  
;

Left returns Left:
    'Left' '{' ('unit' unit=Unit  )? 'expression' expression=Expression  '}'  
;

FunCall returns FunCall:
    'FunCall' '{' 'fun' fun=[FunctionDef:EString ] ('inputs' '{' inputs+=Expression  ("," inputs+=Expression  )* '}' )? '}'  
;

Neg returns Neg:
    'Neg' '{' 'op' op=Expression  '}'  
;

Not returns Not:
    'Not' '{' 'op' op=Expression  '}'  
;

Greater returns Greater:
    'Greater' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

And returns And:
    'And' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Add returns Add:
    'Add' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Less returns Less:
    'Less' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Or returns Or:
    'Or' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Sub returns Sub:
    'Sub' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

GEq returns GEq:
    'GEq' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Equ returns Equ:
    'Equ' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Mul returns Mul:
    'Mul' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

LEq returns LEq:
    'LEq' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

NEq returns NEq:
    'NEq' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

Div returns Div:
    'Div' '{' 'rightOp' rightOp=Expression  'leftOp' leftOp=Expression  '}'  
;

TimeSensor returns TimeSensor:
    {TimeSensor} 'TimeSensor'  
;

DistSensor returns DistSensor:
    {DistSensor} 'DistSensor'  
;

BoolLiteral returns BoolLiteral:
    {BoolLiteral} 'BoolLiteral'  
;

NumberLiteral returns NumberLiteral:
    {NumberLiteral} 'NumberLiteral'  
;

SpeedState returns SpeedState:
    {SpeedState} 'SpeedState'  
;

Variable returns Variable:
    'Variable' '{' 'var' var=[VarDecl:EString ] '}'  
;

Unit returns Unit:
    Unit_M | Unit_DM | Unit_CM | Unit_MM
;
Unit_M returns Unit_M: 'm' ;
Unit_DM returns Unit_DM: 'dm' ;
Unit_CM returns Unit_CM: 'cm' ;
Unit_MM returns Unit_MM: 'mm' ;

