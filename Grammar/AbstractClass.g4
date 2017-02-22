// Define a grammar called Zip
grammar AbstractClass;
full: SCOPE 'abstract class' ['{' '}';
SCOPE: 'public' | 'private' | 'internal';
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
