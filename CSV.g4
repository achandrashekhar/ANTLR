grammar CSV;

file : (row '\n')+;

row: value (',' value)*;

value : Number | String;

Number : [0-9]+;

String : [a-z]+;