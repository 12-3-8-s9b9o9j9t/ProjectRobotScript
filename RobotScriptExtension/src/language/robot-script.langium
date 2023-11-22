grammar RobotScript
import 'Terminals'
import 'robotScriptModel-types'

entry Model returns Model:
    {Model} 'Model' '{' ('command' '{' command+=Command  ("," command+=Command  )* '}' )? '}'  
;

Command returns Command:
    Rotation | Linear | Clock | UltraSound | Speed | Loop | Switch | DefVar 
;

Boolean returns Boolean:
    BoolVariables | And | Or | Not | BoolLiteral 
;

Expressions returns Expressions:
    BoolVariables | And | Or | Not | BoolLiteral | Add | AriLiteral | AriVariables | Sub | Neg 
;

Units returns Units:
    Meter | Second | Degree 
;

Arithmetic returns Arithmetic:
    Add | AriLiteral | AriVariables | Sub | Neg 
;

Prefix returns Prefix:
    Mili | Centi 
;

Rotation returns Rotation:
    'Rotation' '{' 'defvar' '{' defvar+=Command  ("," defvar+=Command  )* '}' '}'  
;

Linear returns Linear:
    'Linear' '{' 'defvar' '{' defvar+=Command  ("," defvar+=Command  )* '}' '}'  
;

Clock returns Clock:
    'Clock' '{' 'defvar' '{' defvar+=Command  ("," defvar+=Command  )* '}' '}'  
;

UltraSound returns UltraSound:
    'UltraSound' '{' 'defvar' '{' defvar+=Command  ("," defvar+=Command  )* '}' '}'  
;

Speed returns Speed:
    'Speed' '{' 'defvar' '{' defvar+=Command  ("," defvar+=Command  )* '}' '}'  
;

Loop returns Loop:
    'Loop' '{' 'loopCondition' loopCondition=Boolean  'body' '{' body+=Command  ("," body+=Command  )* '}' '}'  
;

Switch returns Switch:
    'Switch' '{' 'switchCondition' switchCondition=Boolean  'body' '{' body+=Command  ("," body+=Command  )* '}' '}'  
;

DefVar returns DefVar:
    'DefVar' name=EString  '{' 'expressions' expressions=Expressions  ('units' units=Units  )? '}'  
;

BoolVariables returns BoolVariables:
    'BoolVariables' '{' 'reference' reference=[DefVar:EString ] '}'  
;

And returns And:
    'And' '{' 'left' left=Boolean  'right' right=Boolean  '}'  
;

Or returns Or:
    'Or' '{' 'left' left=Boolean  'right' right=Boolean  '}'  
;

Not returns Not:
    'Not' '{' 'operand' operand=Boolean  '}'  
;

BoolLiteral returns BoolLiteral:
    {BoolLiteral} 'BoolLiteral'  
;

EString returns string:
    STRING | ID 
;

Add returns Add:
    'Add' '{' 'right' right=Arithmetic  'left' left=Arithmetic  '}'  
;

AriLiteral returns AriLiteral:
    {AriLiteral} 'AriLiteral' '{' ('units' units=Units  )? '}'  
;

AriVariables returns AriVariables:
    'AriVariables' '{' 'reference' reference=[DefVar:EString ] '}'  
;

Sub returns Sub:
    'Sub' '{' 'right' right=Arithmetic  'left' left=Arithmetic  '}'  
;

Neg returns Neg:
    'Neg' '{' 'operand' operand=Arithmetic  '}'  
;

Meter returns Meter:
    {Meter} 'Meter' '{' ('prefix' prefix=Prefix  )? '}'  
;

Second returns Second:
    {Second} 'Second' '{' ('prefix' prefix=Prefix  )? '}'  
;

Degree returns Degree:
    {Degree} 'Degree' '{' ('prefix' prefix=Prefix  )? '}'  
;

Mili returns Mili:
    {Mili} 'Mili'  
;

Centi returns Centi:
    {Centi} 'Centi'  
;

