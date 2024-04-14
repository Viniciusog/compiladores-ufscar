lexer grammar LaLexer;

ALGORITMO: 'algoritmo';
DECLARE: 'declare';
LEIA: 'leia';
ESCREVA: 'escreva';
FIM_ALGORITMO: 'fim_algoritmo';
FIM_REGISTRO: 'fim_registro';
PROCEDIMENTO: 'procedimento';
TIPO: 'tipo';
LITERAL: 'literal';
VAR: 'var';
LOGICO: 'logico';
INTEIRO: 'inteiro';
CONSTANTE: 'constante';
FALSO: 'falso';
VERDADEIRO: 'verdadeiro';
REAL: 'real';
REGISTRO: 'registro';
SE: 'se';
SENAO: 'senao';
ENTAO: 'entao';
ENQUANTO: 'enquanto';
NAO: 'nao';
FACA: 'faca';
FIM_ENQUANTO: 'fim_enquanto';
FIM_SE: 'fim_se';
FIM_PROCEDIMENTO: 'fim_procedimento';
FIM_PARA: 'fim_para';
FIM_CASO: 'fim_caso';
FUNCAO: 'funcao';
RETORNE: 'retorne';
FIM_FUNCAO: 'fim_funcao';
// laço de repetição
PARA: 'para';
ATE: 'ate';
CASO: 'caso';
SEJA: 'seja';


E: 'e';
OU: 'ou';
IGUAL: '=';
DIFERENTE: '<>';
ATRIBUICAO: '<-';
MENOR: '<';
MAIOR: '>';
MENOR_IGUAL: '<=';
MAIOR_IGUAL: '>=';
SOMA: '+';
MOD: '%';
SUBTRACAO: '-';
DIVISAO: '/';
MULTIPLICACAO: '*';
ENDERECO:'&';
PONT: '^';

NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

IDENT: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

CADEIA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '"';

CADEIA_NAO_FECHADA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '\n';

PONTO: '.';
INTERVALO: '..';
DOIS_PONTOS: ':';
ABREPAR: '(';
FECHAPAR: ')';
VIRGULA: ',';
ABRECOL: '[';
FECHACOL: ']';

COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip;
COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

WS: (' ' | '\t' | '\r' | '\n') -> skip;


ERRO: .;