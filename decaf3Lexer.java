// Generated from decaf3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class decaf3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PROGRAM=2, IF=3, ELSE=4, RETURN=5, BOOLEAN=6, CHAR=7, INT=8, 
		STRING=9, TRUE=10, FALSE=11, VOID=12, PUNTOCOMA=13, LBIG=14, RBIG=15, 
		LCOR=16, RCOR=17, LPAR=18, RPAR=19, COMMA=20, COMILLAD=21, COMILLA=22, 
		ADD=23, SUB=24, MULTIPLY=25, DIVIDE=26, MODULO=27, AND=28, OR=29, NOT=30, 
		GREAT_OP=31, LESS_OP=32, GREAT_eq_op=33, LESS_eq_op=34, EQUAL_OP=35, ADD_eq_op=36, 
		SUB_eq_op=37, EQUALITY_OP=38, UNEQUALITY_OP=39, ID=40, ALPHA=41, CHAR_LITERAL=42, 
		DECIMAL_LITERAL=43, DIGIT=44, BOOL_LITERAL=45, STRING_LITERAL=46, ALPHA_NUM=47, 
		NEWLINE=48, WHITESPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "PROGRAM", "IF", "ELSE", "RETURN", "BOOLEAN", "CHAR", "INT", 
			"STRING", "TRUE", "FALSE", "VOID", "PUNTOCOMA", "LBIG", "RBIG", "LCOR", 
			"RCOR", "LPAR", "RPAR", "COMMA", "COMILLAD", "COMILLA", "ADD", "SUB", 
			"MULTIPLY", "DIVIDE", "MODULO", "AND", "OR", "NOT", "GREAT_OP", "LESS_OP", 
			"GREAT_eq_op", "LESS_eq_op", "EQUAL_OP", "ADD_eq_op", "SUB_eq_op", "EQUALITY_OP", 
			"UNEQUALITY_OP", "ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", "DIGIT", 
			"BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'Program'", "'if'", "'else'", "'return'", "'boolean'", 
			"'char'", "'int'", "'string'", "'True'", "'False'", "'void'", "';'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "','", "'\"'", "'''", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
			"'<='", "'='", "'+='", "'-='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PROGRAM", "IF", "ELSE", "RETURN", "BOOLEAN", "CHAR", 
			"INT", "STRING", "TRUE", "FALSE", "VOID", "PUNTOCOMA", "LBIG", "RBIG", 
			"LCOR", "RCOR", "LPAR", "RPAR", "COMMA", "COMILLAD", "COMILLA", "ADD", 
			"SUB", "MULTIPLY", "DIVIDE", "MODULO", "AND", "OR", "NOT", "GREAT_OP", 
			"LESS_OP", "GREAT_eq_op", "LESS_eq_op", "EQUAL_OP", "ADD_eq_op", "SUB_eq_op", 
			"EQUALITY_OP", "UNEQUALITY_OP", "ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", 
			"DIGIT", "BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "NEWLINE", "WHITESPACE"
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


	public decaf3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "decaf3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u00eb\n)\f)\16"+
		")\u00ee\13)\3*\3*\3+\3+\3+\3+\5+\u00f6\n+\3+\3+\3,\6,\u00fb\n,\r,\16,"+
		"\u00fc\3-\3-\3.\3.\5.\u0103\n.\3/\3/\3/\3/\7/\u0109\n/\f/\16/\u010c\13"+
		"/\3/\3/\3\60\3\60\5\60\u0112\n\60\3\61\5\61\u0115\n\61\3\61\3\61\6\61"+
		"\u0119\n\61\r\61\16\61\u011a\3\61\3\61\3\62\3\62\3\62\3\62\2\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\5\2C\\aac|\n\2$$"+
		"))^^ddhhppttvv\6\2\f\f\17\17$$^^\3\2\62;\5\2\13\f\17\17\"\"\2\u012b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\3e\3\2\2\2\5k\3\2\2\2\7s\3\2\2\2\tv\3\2\2\2\13{\3\2\2"+
		"\2\r\u0082\3\2\2\2\17\u008a\3\2\2\2\21\u008f\3\2\2\2\23\u0093\3\2\2\2"+
		"\25\u009a\3\2\2\2\27\u009f\3\2\2\2\31\u00a5\3\2\2\2\33\u00aa\3\2\2\2\35"+
		"\u00ac\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3"+
		"\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be"+
		"\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3"+
		"\2\2\29\u00c8\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2"+
		"\3\2\2\2C\u00d4\3\2\2\2E\u00d7\3\2\2\2G\u00da\3\2\2\2I\u00dc\3\2\2\2K"+
		"\u00df\3\2\2\2M\u00e2\3\2\2\2O\u00e5\3\2\2\2Q\u00e8\3\2\2\2S\u00ef\3\2"+
		"\2\2U\u00f1\3\2\2\2W\u00fa\3\2\2\2Y\u00fe\3\2\2\2[\u0102\3\2\2\2]\u0104"+
		"\3\2\2\2_\u0111\3\2\2\2a\u0118\3\2\2\2c\u011e\3\2\2\2ef\7e\2\2fg\7n\2"+
		"\2gh\7c\2\2hi\7u\2\2ij\7u\2\2j\4\3\2\2\2kl\7R\2\2lm\7t\2\2mn\7q\2\2no"+
		"\7i\2\2op\7t\2\2pq\7c\2\2qr\7o\2\2r\6\3\2\2\2st\7k\2\2tu\7h\2\2u\b\3\2"+
		"\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\n\3\2\2\2{|\7t\2\2|}\7g\2\2"+
		"}~\7v\2\2~\177\7w\2\2\177\u0080\7t\2\2\u0080\u0081\7p\2\2\u0081\f\3\2"+
		"\2\2\u0082\u0083\7d\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7j\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7t\2\2\u008e\20\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\22\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2"+
		"\u0099\24\3\2\2\2\u009a\u009b\7V\2\2\u009b\u009c\7t\2\2\u009c\u009d\7"+
		"w\2\2\u009d\u009e\7g\2\2\u009e\26\3\2\2\2\u009f\u00a0\7H\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\30\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\34\3\2\2\2\u00ac"+
		"\u00ad\7}\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7\177\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7]\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b5\7*\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7(\3\2\2\2\u00b8\u00b9"+
		"\7.\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7"+
		")\2\2\u00bd.\3\2\2\2\u00be\u00bf\7-\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7"+
		"/\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\64\3\2\2\2\u00c4\u00c5"+
		"\7\61\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7\'\2\2\u00c78\3\2\2\2\u00c8\u00c9"+
		"\7(\2\2\u00c9\u00ca\7(\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7~\2\2\u00cc\u00cd"+
		"\7~\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7"+
		"@\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7@"+
		"\2\2\u00d5\u00d6\7?\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9F\3\2\2\2\u00da\u00db\7?\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7"+
		"-\2\2\u00dd\u00de\7?\2\2\u00deJ\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1"+
		"\7?\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7?\2\2\u00e4N\3"+
		"\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7?\2\2\u00e7P\3\2\2\2\u00e8\u00ec"+
		"\5S*\2\u00e9\u00eb\5_\60\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00edR\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f0\t\2\2\2\u00f0T\3\2\2\2\u00f1\u00f5\5-\27\2\u00f2\u00f3\7"+
		"^\2\2\u00f3\u00f6\t\3\2\2\u00f4\u00f6\n\4\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5-\27\2\u00f8V\3\2\2\2"+
		"\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdX\3\2\2\2\u00fe\u00ff\t\5\2\2\u00ff"+
		"Z\3\2\2\2\u0100\u0103\5\25\13\2\u0101\u0103\5\27\f\2\u0102\u0100\3\2\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\\\3\2\2\2\u0104\u010a\7$\2\2\u0105\u0106"+
		"\7^\2\2\u0106\u0109\t\3\2\2\u0107\u0109\n\4\2\2\u0108\u0105\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7$\2\2\u010e"+
		"^\3\2\2\2\u010f\u0112\5S*\2\u0110\u0112\5Y-\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112`\3\2\2\2\u0113\u0115\7\17\2\2\u0114\u0113\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119\7\f\2\2\u0117\u0119"+
		"\7\17\2\2\u0118\u0114\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\b\61\2\2\u011db\3\2\2\2\u011e\u011f\t\6\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\b\62\2\2\u0121d\3\2\2\2\r\2\u00ec\u00f5\u00fc\u0102\u0108\u010a"+
		"\u0111\u0114\u0118\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}