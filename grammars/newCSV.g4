grammar newCSV;

file  : (row '\n')* ;
row   : field (',' field)* ;
field : INT
      | STRING
        ;

INT   : [0-9]+ ;
WS    : [ \r\t]+ -> skip ;
STRING : ~[,\n]
        ;