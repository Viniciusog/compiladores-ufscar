// Generated from br\u005Cufscar\dc\compiladores\la\lexico\LaLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.la.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DECLARE=2, LEIA=3, ESCREVA=4, FIM_ALGORITMO=5, FIM_REGISTRO=6, 
		PROCEDIMENTO=7, TIPO=8, LITERAL=9, VAR=10, LOGICO=11, INTEIRO=12, CONSTANTE=13, 
		FALSO=14, VERDADEIRO=15, REAL=16, REGISTRO=17, SE=18, SENAO=19, ENTAO=20, 
		ENQUANTO=21, NAO=22, FACA=23, FIM_ENQUANTO=24, FIM_SE=25, FIM_PROCEDIMENTO=26, 
		FIM_PARA=27, FIM_CASO=28, FUNCAO=29, RETORNE=30, FIM_FUNCAO=31, PARA=32, 
		ATE=33, CASO=34, SEJA=35, E=36, OU=37, IGUAL=38, DIFERENTE=39, ATRIBUICAO=40, 
		MENOR=41, MAIOR=42, MENOR_IGUAL=43, MAIOR_IGUAL=44, SOMA=45, MOD=46, SUBTRACAO=47, 
		DIVISAO=48, MULTIPLICACAO=49, ENDERECO=50, PONT=51, NUM_INT=52, NUM_REAL=53, 
		IDENT=54, CADEIA=55, PONTO=56, INTERVALO=57, DOIS_PONTOS=58, ABREPAR=59, 
		FECHAPAR=60, VIRGULA=61, ABRECOL=62, FECHACOL=63, COMENTARIO=64, WS=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "DECLARE", "LEIA", "ESCREVA", "FIM_ALGORITMO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "TIPO", "LITERAL", "VAR", "LOGICO", "INTEIRO", "CONSTANTE", 
			"FALSO", "VERDADEIRO", "REAL", "REGISTRO", "SE", "SENAO", "ENTAO", "ENQUANTO", 
			"NAO", "FACA", "FIM_ENQUANTO", "FIM_SE", "FIM_PROCEDIMENTO", "FIM_PARA", 
			"FIM_CASO", "FUNCAO", "RETORNE", "FIM_FUNCAO", "PARA", "ATE", "CASO", 
			"SEJA", "E", "OU", "IGUAL", "DIFERENTE", "ATRIBUICAO", "MENOR", "MAIOR", 
			"MENOR_IGUAL", "MAIOR_IGUAL", "SOMA", "MOD", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "ENDERECO", "PONT", "NUM_INT", "NUM_REAL", "IDENT", 
			"CADEIA", "PONTO", "INTERVALO", "DOIS_PONTOS", "ABREPAR", "FECHAPAR", 
			"VIRGULA", "ABRECOL", "FECHACOL", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'leia'", "'escreva'", "'fim_algoritmo'", 
			"'fim_registro'", "'procedimento'", "'tipo'", "'literal'", "'var'", "'logico'", 
			"'inteiro'", "'constante'", "'falso'", "'verdadeiro'", "'real'", "'registro'", 
			"'se'", "'senao'", "'entao'", "'enquanto'", "'nao'", "'faca'", "'fim_enquanto'", 
			"'fim_se'", "'fim_procedimento'", "'fim_para'", "'fim_caso'", "'funcao'", 
			"'retorne'", "'fim_funcao'", "'para'", "'ate'", "'caso'", "'seja'", "'e'", 
			"'ou'", "'='", "'<>'", "'<-'", "'<'", "'>'", "'<='", "'>='", "'+'", "'%'", 
			"'-'", "'/'", "'*'", "'&'", "'^'", null, null, null, null, "'.'", "'..'", 
			"':'", "'('", "')'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DECLARE", "LEIA", "ESCREVA", "FIM_ALGORITMO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "TIPO", "LITERAL", "VAR", "LOGICO", "INTEIRO", "CONSTANTE", 
			"FALSO", "VERDADEIRO", "REAL", "REGISTRO", "SE", "SENAO", "ENTAO", "ENQUANTO", 
			"NAO", "FACA", "FIM_ENQUANTO", "FIM_SE", "FIM_PROCEDIMENTO", "FIM_PARA", 
			"FIM_CASO", "FUNCAO", "RETORNE", "FIM_FUNCAO", "PARA", "ATE", "CASO", 
			"SEJA", "E", "OU", "IGUAL", "DIFERENTE", "ATRIBUICAO", "MENOR", "MAIOR", 
			"MENOR_IGUAL", "MAIOR_IGUAL", "SOMA", "MOD", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "ENDERECO", "PONT", "NUM_INT", "NUM_REAL", "IDENT", 
			"CADEIA", "PONTO", "INTERVALO", "DOIS_PONTOS", "ABREPAR", "FECHAPAR", 
			"VIRGULA", "ABRECOL", "FECHACOL", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\6\65\u01c1\n\65\r\65\16\65\u01c2\3\66\6\66\u01c6\n\66\r\66\16\66\u01c7"+
		"\3\66\3\66\6\66\u01cc\n\66\r\66\16\66\u01cd\3\67\3\67\7\67\u01d2\n\67"+
		"\f\67\16\67\u01d5\13\67\38\38\78\u01d9\n8\f8\168\u01dc\138\38\38\39\3"+
		"9\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\7A\u01f3\nA\fA\16"+
		"A\u01f6\13A\3A\3A\3A\3A\3B\3B\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2$$\3\2\177\177\5\2\13\f\17\17\"\"\2"+
		"\u0204\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\3\u0085\3\2\2\2\5\u008f\3\2\2\2\7\u0097\3\2\2\2\t\u009c\3\2\2\2\13"+
		"\u00a4\3\2\2\2\r\u00b2\3\2\2\2\17\u00bf\3\2\2\2\21\u00cc\3\2\2\2\23\u00d1"+
		"\3\2\2\2\25\u00d9\3\2\2\2\27\u00dd\3\2\2\2\31\u00e4\3\2\2\2\33\u00ec\3"+
		"\2\2\2\35\u00f6\3\2\2\2\37\u00fc\3\2\2\2!\u0107\3\2\2\2#\u010c\3\2\2\2"+
		"%\u0115\3\2\2\2\'\u0118\3\2\2\2)\u011e\3\2\2\2+\u0124\3\2\2\2-\u012d\3"+
		"\2\2\2/\u0131\3\2\2\2\61\u0136\3\2\2\2\63\u0143\3\2\2\2\65\u014a\3\2\2"+
		"\2\67\u015b\3\2\2\29\u0164\3\2\2\2;\u016d\3\2\2\2=\u0174\3\2\2\2?\u017c"+
		"\3\2\2\2A\u0187\3\2\2\2C\u018c\3\2\2\2E\u0190\3\2\2\2G\u0195\3\2\2\2I"+
		"\u019a\3\2\2\2K\u019c\3\2\2\2M\u019f\3\2\2\2O\u01a1\3\2\2\2Q\u01a4\3\2"+
		"\2\2S\u01a7\3\2\2\2U\u01a9\3\2\2\2W\u01ab\3\2\2\2Y\u01ae\3\2\2\2[\u01b1"+
		"\3\2\2\2]\u01b3\3\2\2\2_\u01b5\3\2\2\2a\u01b7\3\2\2\2c\u01b9\3\2\2\2e"+
		"\u01bb\3\2\2\2g\u01bd\3\2\2\2i\u01c0\3\2\2\2k\u01c5\3\2\2\2m\u01cf\3\2"+
		"\2\2o\u01d6\3\2\2\2q\u01df\3\2\2\2s\u01e1\3\2\2\2u\u01e4\3\2\2\2w\u01e6"+
		"\3\2\2\2y\u01e8\3\2\2\2{\u01ea\3\2\2\2}\u01ec\3\2\2\2\177\u01ee\3\2\2"+
		"\2\u0081\u01f0\3\2\2\2\u0083\u01fb\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7i\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7o\2\2\u008d\u008e\7q\2\2"+
		"\u008e\4\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091\u0092\7e"+
		"\2\2\u0092\u0093\7n\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7g\2\2\u0096\6\3\2\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7c\2\2\u009b\b\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7x\2\2\u00a2\u00a3\7c\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7c\2\2"+
		"\u00a9\u00aa\7n\2\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7o\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\f\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7o\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7i\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7q\2\2\u00be\16\3\2\2\2\u00bf\u00c0"+
		"\7r\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7e\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7o\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf"+
		"\7r\2\2\u00cf\u00d0\7q\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7x\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7n\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7i\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7e\2\2"+
		"\u00e2\u00e3\7q\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7"+
		"p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7q\2\2\u00eb\32\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5\34\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7"+
		"n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7q\2\2\u00fb\36\3\2\2\2\u00fc\u00fd"+
		"\7x\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7f\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7f\2\2\u0102\u0103\7g\2\2\u0103\u0104\7k\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7q\2\2\u0106 \3\2\2\2\u0107\u0108\7t\2"+
		"\2\u0108\u0109\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7n\2\2\u010b\"\3"+
		"\2\2\2\u010c\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e\u010f\7i\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7u\2\2\u0111\u0112\7v\2\2\u0112\u0113\7t\2\2"+
		"\u0113\u0114\7q\2\2\u0114$\3\2\2\2\u0115\u0116\7u\2\2\u0116\u0117\7g\2"+
		"\2\u0117&\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a\u011b\7"+
		"p\2\2\u011b\u011c\7c\2\2\u011c\u011d\7q\2\2\u011d(\3\2\2\2\u011e\u011f"+
		"\7g\2\2\u011f\u0120\7p\2\2\u0120\u0121\7v\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7q\2\2\u0123*\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2\u0126"+
		"\u0127\7s\2\2\u0127\u0128\7w\2\2\u0128\u0129\7c\2\2\u0129\u012a\7p\2\2"+
		"\u012a\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c,\3\2\2\2\u012d\u012e\7p\2"+
		"\2\u012e\u012f\7c\2\2\u012f\u0130\7q\2\2\u0130.\3\2\2\2\u0131\u0132\7"+
		"h\2\2\u0132\u0133\7c\2\2\u0133\u0134\7e\2\2\u0134\u0135\7c\2\2\u0135\60"+
		"\3\2\2\2\u0136\u0137\7h\2\2\u0137\u0138\7k\2\2\u0138\u0139\7o\2\2\u0139"+
		"\u013a\7a\2\2\u013a\u013b\7g\2\2\u013b\u013c\7p\2\2\u013c\u013d\7s\2\2"+
		"\u013d\u013e\7w\2\2\u013e\u013f\7c\2\2\u013f\u0140\7p\2\2\u0140\u0141"+
		"\7v\2\2\u0141\u0142\7q\2\2\u0142\62\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145"+
		"\7k\2\2\u0145\u0146\7o\2\2\u0146\u0147\7a\2\2\u0147\u0148\7u\2\2\u0148"+
		"\u0149\7g\2\2\u0149\64\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c\7k\2\2\u014c"+
		"\u014d\7o\2\2\u014d\u014e\7a\2\2\u014e\u014f\7r\2\2\u014f\u0150\7t\2\2"+
		"\u0150\u0151\7q\2\2\u0151\u0152\7e\2\2\u0152\u0153\7g\2\2\u0153\u0154"+
		"\7f\2\2\u0154\u0155\7k\2\2\u0155\u0156\7o\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7p\2\2\u0158\u0159\7v\2\2\u0159\u015a\7q\2\2\u015a\66\3\2\2\2\u015b"+
		"\u015c\7h\2\2\u015c\u015d\7k\2\2\u015d\u015e\7o\2\2\u015e\u015f\7a\2\2"+
		"\u015f\u0160\7r\2\2\u0160\u0161\7c\2\2\u0161\u0162\7t\2\2\u0162\u0163"+
		"\7c\2\2\u01638\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166\7k\2\2\u0166\u0167"+
		"\7o\2\2\u0167\u0168\7a\2\2\u0168\u0169\7e\2\2\u0169\u016a\7c\2\2\u016a"+
		"\u016b\7u\2\2\u016b\u016c\7q\2\2\u016c:\3\2\2\2\u016d\u016e\7h\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u0170\7p\2\2\u0170\u0171\7e\2\2\u0171\u0172\7c\2\2"+
		"\u0172\u0173\7q\2\2\u0173<\3\2\2\2\u0174\u0175\7t\2\2\u0175\u0176\7g\2"+
		"\2\u0176\u0177\7v\2\2\u0177\u0178\7q\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7p\2\2\u017a\u017b\7g\2\2\u017b>\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e"+
		"\7k\2\2\u017e\u017f\7o\2\2\u017f\u0180\7a\2\2\u0180\u0181\7h\2\2\u0181"+
		"\u0182\7w\2\2\u0182\u0183\7p\2\2\u0183\u0184\7e\2\2\u0184\u0185\7c\2\2"+
		"\u0185\u0186\7q\2\2\u0186@\3\2\2\2\u0187\u0188\7r\2\2\u0188\u0189\7c\2"+
		"\2\u0189\u018a\7t\2\2\u018a\u018b\7c\2\2\u018bB\3\2\2\2\u018c\u018d\7"+
		"c\2\2\u018d\u018e\7v\2\2\u018e\u018f\7g\2\2\u018fD\3\2\2\2\u0190\u0191"+
		"\7e\2\2\u0191\u0192\7c\2\2\u0192\u0193\7u\2\2\u0193\u0194\7q\2\2\u0194"+
		"F\3\2\2\2\u0195\u0196\7u\2\2\u0196\u0197\7g\2\2\u0197\u0198\7l\2\2\u0198"+
		"\u0199\7c\2\2\u0199H\3\2\2\2\u019a\u019b\7g\2\2\u019bJ\3\2\2\2\u019c\u019d"+
		"\7q\2\2\u019d\u019e\7w\2\2\u019eL\3\2\2\2\u019f\u01a0\7?\2\2\u01a0N\3"+
		"\2\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7@\2\2\u01a3P\3\2\2\2\u01a4\u01a5"+
		"\7>\2\2\u01a5\u01a6\7/\2\2\u01a6R\3\2\2\2\u01a7\u01a8\7>\2\2\u01a8T\3"+
		"\2\2\2\u01a9\u01aa\7@\2\2\u01aaV\3\2\2\2\u01ab\u01ac\7>\2\2\u01ac\u01ad"+
		"\7?\2\2\u01adX\3\2\2\2\u01ae\u01af\7@\2\2\u01af\u01b0\7?\2\2\u01b0Z\3"+
		"\2\2\2\u01b1\u01b2\7-\2\2\u01b2\\\3\2\2\2\u01b3\u01b4\7\'\2\2\u01b4^\3"+
		"\2\2\2\u01b5\u01b6\7/\2\2\u01b6`\3\2\2\2\u01b7\u01b8\7\61\2\2\u01b8b\3"+
		"\2\2\2\u01b9\u01ba\7,\2\2\u01bad\3\2\2\2\u01bb\u01bc\7(\2\2\u01bcf\3\2"+
		"\2\2\u01bd\u01be\7`\2\2\u01beh\3\2\2\2\u01bf\u01c1\4\62;\2\u01c0\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"j\3\2\2\2\u01c4\u01c6\4\62;\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2"+
		"\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb"+
		"\7\60\2\2\u01ca\u01cc\4\62;\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cel\3\2\2\2\u01cf\u01d3\t"+
		"\2\2\2\u01d0\u01d2\t\3\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4n\3\2\2\2\u01d5\u01d3\3\2\2\2"+
		"\u01d6\u01da\7$\2\2\u01d7\u01d9\n\4\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01de\7$\2\2\u01dep\3\2\2\2\u01df\u01e0\7\60\2\2"+
		"\u01e0r\3\2\2\2\u01e1\u01e2\7\60\2\2\u01e2\u01e3\7\60\2\2\u01e3t\3\2\2"+
		"\2\u01e4\u01e5\7<\2\2\u01e5v\3\2\2\2\u01e6\u01e7\7*\2\2\u01e7x\3\2\2\2"+
		"\u01e8\u01e9\7+\2\2\u01e9z\3\2\2\2\u01ea\u01eb\7.\2\2\u01eb|\3\2\2\2\u01ec"+
		"\u01ed\7]\2\2\u01ed~\3\2\2\2\u01ee\u01ef\7_\2\2\u01ef\u0080\3\2\2\2\u01f0"+
		"\u01f4\7}\2\2\u01f1\u01f3\n\5\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f7\u01f8\7\177\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\b"+
		"A\2\2\u01fa\u0082\3\2\2\2\u01fb\u01fc\t\6\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\bB\2\2\u01fe\u0084\3\2\2\2\t\2\u01c2\u01c7\u01cd\u01d3\u01da\u01f4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}