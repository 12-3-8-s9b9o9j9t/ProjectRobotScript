terminal BOOL returns boolean: /true|false/;
terminal INT returns number: /[0-9]+(\.[0-9]+)?/;
terminal ID returns string: /[a-zA-Z_][a-zA-Z0-9_]*/ ;

hidden terminal ML_COMMENT returns string:'/*'  -> '*/'  ;
hidden terminal SL_COMMENT returns string: /\/\/[^\r\n]*/ ;
hidden terminal WS returns string:(' ' | '\t' | '\r' | '\n' )+;
terminal ANY_OTHER returns string:.;
