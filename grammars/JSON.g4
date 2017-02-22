grammar JSON;

s: object;

object: '{' pair (','pair)* '}'
        ;

pair: STRING' : ' VALUE;

VALUE : STRING
    |INT
    ;
STRING: '"'.*?'"';
INT : [0-9]+ ;