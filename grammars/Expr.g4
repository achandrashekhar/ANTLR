grammar Expr;

s : e ; // <-- start rule
e : e '*' e # Mult
  | e '+' e # Add
  | INT # Number
  ;

INT : [0-9]+ ;
WS : [ \r\t\n]+ -> skip ;