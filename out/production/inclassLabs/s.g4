grammar s;

code: (stat)* ;
stat: 'return ' expr ';' | expr ';';

expr: expr '*' expr
      | expr '+' expr
      |expr '=' expr
      |INT
      | ID
      ;

INT: [0-9]+;
ID: [a-z]+;