// Generated from decaf3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class decaf3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PROGRAM=2, IF=3, WHILE=4, ELSE=5, RETURN=6, BOOLEAN=7, CHAR=8, 
		INT=9, STRING=10, TRUE=11, FALSE=12, VOID=13, PUNTOCOMA=14, LBIG=15, RBIG=16, 
		LCOR=17, RCOR=18, LPAR=19, RPAR=20, COMMA=21, COMILLAD=22, COMILLA=23, 
		ADD=24, SUB=25, MULTIPLY=26, DIVIDE=27, MODULO=28, AND=29, OR=30, NOT=31, 
		GREAT_OP=32, LESS_OP=33, GREAT_eq_op=34, LESS_eq_op=35, EQUAL_OP=36, ADD_eq_op=37, 
		SUB_eq_op=38, EQUALITY_OP=39, UNEQUALITY_OP=40, ID=41, ALPHA=42, CHAR_LITERAL=43, 
		DECIMAL_LITERAL=44, DIGIT=45, BOOL_LITERAL=46, STRING_LITERAL=47, ALPHA_NUM=48, 
		NEWLINE=49, WHITESPACE=50;
	public static final int
		RULE_program = 0, RULE_varDeclaration = 1, RULE_paramDeclaration = 2, 
		RULE_arrayId = 3, RULE_paramVar = 4, RULE_varId = 5, RULE_methodDeclaration = 6, 
		RULE_returnType = 7, RULE_block = 8, RULE_statement = 9, RULE_methodCallInter = 10, 
		RULE_methodCall = 11, RULE_expr = 12, RULE_location = 13, RULE_int_literal = 14, 
		RULE_rel_op = 15, RULE_eq_op = 16, RULE_cond_op = 17, RULE_literal = 18, 
		RULE_bin_op = 19, RULE_arith_op = 20, RULE_var_type = 21, RULE_assign_op = 22, 
		RULE_methodName = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDeclaration", "paramDeclaration", "arrayId", "paramVar", 
			"varId", "methodDeclaration", "returnType", "block", "statement", "methodCallInter", 
			"methodCall", "expr", "location", "int_literal", "rel_op", "eq_op", "cond_op", 
			"literal", "bin_op", "arith_op", "var_type", "assign_op", "methodName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'Program'", "'if'", "'while'", "'else'", "'return'", 
			"'boolean'", "'char'", "'int'", "'string'", "'True'", "'False'", "'void'", 
			"';'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "'\"'", "'''", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'>'", "'<'", 
			"'>='", "'<='", "'='", "'+='", "'-='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PROGRAM", "IF", "WHILE", "ELSE", "RETURN", "BOOLEAN", 
			"CHAR", "INT", "STRING", "TRUE", "FALSE", "VOID", "PUNTOCOMA", "LBIG", 
			"RBIG", "LCOR", "RCOR", "LPAR", "RPAR", "COMMA", "COMILLAD", "COMILLA", 
			"ADD", "SUB", "MULTIPLY", "DIVIDE", "MODULO", "AND", "OR", "NOT", "GREAT_OP", 
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

	@Override
	public String getGrammarFileName() { return "decaf3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public decaf3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(decaf3Parser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(decaf3Parser.PROGRAM, 0); }
		public TerminalNode LBIG() { return getToken(decaf3Parser.LBIG, 0); }
		public TerminalNode RBIG() { return getToken(decaf3Parser.RBIG, 0); }
		public List<ParamDeclarationContext> paramDeclaration() {
			return getRuleContexts(ParamDeclarationContext.class);
		}
		public ParamDeclarationContext paramDeclaration(int i) {
			return getRuleContext(ParamDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CLASS);
			setState(49);
			match(PROGRAM);
			setState(50);
			match(LBIG);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					paramDeclaration();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
				{
				{
				setState(57);
				methodDeclaration();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(RBIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(decaf3Parser.PUNTOCOMA, 0); }
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<ParamVarContext> paramVar() {
			return getRuleContexts(ParamVarContext.class);
		}
		public ParamVarContext paramVar(int i) {
			return getRuleContext(ParamVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(decaf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(decaf3Parser.COMMA, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			var_type();
			setState(66);
			paramVar();
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				var_type();
				setState(70);
				paramVar();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<ParamVarContext> paramVar() {
			return getRuleContexts(ParamVarContext.class);
		}
		public ParamVarContext paramVar(int i) {
			return getRuleContext(ParamVarContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(decaf3Parser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(decaf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(decaf3Parser.COMMA, i);
		}
		public ParamDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterParamDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitParamDeclaration(this);
		}
	}

	public final ParamDeclarationContext paramDeclaration() throws RecognitionException {
		ParamDeclarationContext _localctx = new ParamDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			var_type();
			setState(80);
			paramVar();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				paramVar();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(decaf3Parser.ID, 0); }
		public TerminalNode LCOR() { return getToken(decaf3Parser.LCOR, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RCOR() { return getToken(decaf3Parser.RCOR, 0); }
		public ArrayIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterArrayId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitArrayId(this);
		}
	}

	public final ArrayIdContext arrayId() throws RecognitionException {
		ArrayIdContext _localctx = new ArrayIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(LCOR);
			setState(92);
			int_literal();
			setState(93);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamVarContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public ArrayIdContext arrayId() {
			return getRuleContext(ArrayIdContext.class,0);
		}
		public ParamVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterParamVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitParamVar(this);
		}
	}

	public final ParamVarContext paramVar() throws RecognitionException {
		ParamVarContext _localctx = new ParamVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramVar);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				varId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				arrayId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(decaf3Parser.ID, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitVarId(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(decaf3Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(decaf3Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(decaf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(decaf3Parser.COMMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			returnType();
			setState(102);
			methodName();
			setState(103);
			match(LPAR);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(104);
				var_type();
				setState(105);
				varId();
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					var_type();
					setState(109);
					varId();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(RPAR);
			setState(119);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(decaf3Parser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case STRING:
				{
				setState(121);
				var_type();
				}
				break;
			case VOID:
				{
				setState(122);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBIG() { return getToken(decaf3Parser.LBIG, 0); }
		public TerminalNode RBIG() { return getToken(decaf3Parser.RBIG, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LBIG);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(126);
				varDeclaration();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RBIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(decaf3Parser.PUNTOCOMA, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode IF() { return getToken(decaf3Parser.IF, 0); }
		public TerminalNode LPAR() { return getToken(decaf3Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(decaf3Parser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(decaf3Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(decaf3Parser.WHILE, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode EQUAL_OP() { return getToken(decaf3Parser.EQUAL_OP, 0); }
		public TerminalNode RETURN() { return getToken(decaf3Parser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				location();
				setState(141);
				assign_op();
				setState(142);
				expr(0);
				setState(143);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				location();
				setState(146);
				assign_op();
				setState(147);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(IF);
				setState(151);
				match(LPAR);
				setState(152);
				expr(0);
				setState(153);
				match(RPAR);
				setState(154);
				block();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155);
					match(ELSE);
					setState(156);
					block();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(WHILE);
				setState(160);
				match(LPAR);
				setState(161);
				expr(0);
				setState(162);
				match(RPAR);
				setState(163);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				varId();
				setState(166);
				match(EQUAL_OP);
				setState(167);
				expr(0);
				setState(168);
				match(PUNTOCOMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(RETURN);
				setState(171);
				expr(0);
				setState(172);
				match(PUNTOCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallInterContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(decaf3Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(decaf3Parser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(decaf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(decaf3Parser.COMMA, i);
		}
		public MethodCallInterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallInter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterMethodCallInter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitMethodCallInter(this);
		}
	}

	public final MethodCallInterContext methodCallInter() throws RecognitionException {
		MethodCallInterContext _localctx = new MethodCallInterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodCallInter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			methodName();
			setState(177);
			match(LPAR);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << SUB) | (1L << NOT) | (1L << ID) | (1L << CHAR_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(178);
				expr(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					expr(0);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(188);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCallInterContext methodCallInter() {
			return getRuleContext(MethodCallInterContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(decaf3Parser.PUNTOCOMA, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodCall);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				methodCallInter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				methodCallInter();
				setState(192);
				match(PUNTOCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SUB() { return getToken(decaf3Parser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NOT() { return getToken(decaf3Parser.NOT, 0); }
		public TerminalNode LPAR() { return getToken(decaf3Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(decaf3Parser.RPAR, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(197);
				location();
				}
				break;
			case 2:
				{
				setState(198);
				literal();
				}
				break;
			case 3:
				{
				setState(199);
				match(SUB);
				setState(200);
				expr(4);
				}
				break;
			case 4:
				{
				setState(201);
				methodCall();
				}
				break;
			case 5:
				{
				setState(202);
				match(NOT);
				setState(203);
				expr(2);
				}
				break;
			case 6:
				{
				setState(204);
				match(LPAR);
				setState(205);
				expr(0);
				setState(206);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(210);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(211);
					bin_op();
					setState(212);
					expr(6);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public ArrayIdContext arrayId() {
			return getRuleContext(ArrayIdContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_location);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				varId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				arrayId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(decaf3Parser.DECIMAL_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GREAT_OP() { return getToken(decaf3Parser.GREAT_OP, 0); }
		public TerminalNode LESS_OP() { return getToken(decaf3Parser.LESS_OP, 0); }
		public TerminalNode LESS_eq_op() { return getToken(decaf3Parser.LESS_eq_op, 0); }
		public TerminalNode GREAT_eq_op() { return getToken(decaf3Parser.GREAT_eq_op, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREAT_OP) | (1L << LESS_OP) | (1L << GREAT_eq_op) | (1L << LESS_eq_op))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUALITY_OP() { return getToken(decaf3Parser.EQUALITY_OP, 0); }
		public TerminalNode UNEQUALITY_OP() { return getToken(decaf3Parser.UNEQUALITY_OP, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==EQUALITY_OP || _la==UNEQUALITY_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(decaf3Parser.AND, 0); }
		public TerminalNode OR() { return getToken(decaf3Parser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(decaf3Parser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(decaf3Parser.BOOL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(decaf3Parser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				int_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(CHAR_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(BOOL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_op);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULTIPLY:
			case DIVIDE:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				arith_op();
				}
				break;
			case GREAT_OP:
			case LESS_OP:
			case GREAT_eq_op:
			case LESS_eq_op:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				rel_op();
				}
				break;
			case EQUALITY_OP:
			case UNEQUALITY_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(decaf3Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(decaf3Parser.SUB, 0); }
		public TerminalNode MULTIPLY() { return getToken(decaf3Parser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(decaf3Parser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(decaf3Parser.MODULO, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(decaf3Parser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(decaf3Parser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(decaf3Parser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(decaf3Parser.CHAR, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQUAL_OP() { return getToken(decaf3Parser.EQUAL_OP, 0); }
		public TerminalNode ADD_eq_op() { return getToken(decaf3Parser.ADD_eq_op, 0); }
		public TerminalNode SUB_eq_op() { return getToken(decaf3Parser.SUB_eq_op, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_OP) | (1L << ADD_eq_op) | (1L << SUB_eq_op))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(decaf3Parser.ID, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof decaf3Listener ) ((decaf3Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6d\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b"+
		"\f\b\16\bu\13\b\5\bw\n\b\3\b\3\b\3\b\3\t\3\t\5\t~\n\t\3\n\3\n\7\n\u0082"+
		"\n\n\f\n\16\n\u0085\13\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00a0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00b8\n\f\f\f\16\f\u00bb\13\f\5\f\u00bd\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00c5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\16\3\16\7\16\u00d9\n\16\f\16\16\16"+
		"\u00dc\13\16\3\17\3\17\5\17\u00e0\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\5\24\u00ee\n\24\3\25\3\25\3\25\3\25\5\25"+
		"\u00f4\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\3\32\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\b\3\2\"%\3\2)*\3\2\37"+
		" \3\2\32\36\3\2\t\f\3\2&(\2\u0106\2\62\3\2\2\2\4C\3\2\2\2\6Q\3\2\2\2\b"+
		"\\\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20}\3\2\2\2\22\177\3\2\2"+
		"\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00c4\3\2\2\2\32\u00d2\3\2\2\2"+
		"\34\u00df\3\2\2\2\36\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00e5\3\2\2\2$\u00e7"+
		"\3\2\2\2&\u00ed\3\2\2\2(\u00f3\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2."+
		"\u00f9\3\2\2\2\60\u00fb\3\2\2\2\62\63\7\3\2\2\63\64\7\4\2\2\648\7\21\2"+
		"\2\65\67\5\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2"+
		"\2\2:8\3\2\2\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3"+
		"\2\2\2@>\3\2\2\2AB\7\22\2\2B\3\3\2\2\2CD\5,\27\2DE\5\n\6\2EL\3\2\2\2F"+
		"G\7\27\2\2GH\5,\27\2HI\5\n\6\2IK\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\20\2\2P\5\3\2\2\2QR\5,\27\2RW\5\n\6"+
		"\2ST\7\27\2\2TV\5\n\6\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2"+
		"\2\2YW\3\2\2\2Z[\7\20\2\2[\7\3\2\2\2\\]\7+\2\2]^\7\23\2\2^_\5\36\20\2"+
		"_`\7\24\2\2`\t\3\2\2\2ad\5\f\7\2bd\5\b\5\2ca\3\2\2\2cb\3\2\2\2d\13\3\2"+
		"\2\2ef\7+\2\2f\r\3\2\2\2gh\5\20\t\2hi\5\60\31\2iv\7\25\2\2jk\5,\27\2k"+
		"l\5\f\7\2ls\3\2\2\2mn\7\27\2\2no\5,\27\2op\5\f\7\2pr\3\2\2\2qm\3\2\2\2"+
		"ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vj\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\7\26\2\2yz\5\22\n\2z\17\3\2\2\2{~\5,\27\2|~\7\17\2\2}{\3"+
		"\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0083\7\21\2\2\u0080\u0082\5\4\3\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0089\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5\24\13\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\22\2\2\u008d"+
		"\23\3\2\2\2\u008e\u008f\5\34\17\2\u008f\u0090\5.\30\2\u0090\u0091\5\32"+
		"\16\2\u0091\u0092\7\20\2\2\u0092\u00b1\3\2\2\2\u0093\u0094\5\34\17\2\u0094"+
		"\u0095\5.\30\2\u0095\u0096\5\32\16\2\u0096\u00b1\3\2\2\2\u0097\u00b1\5"+
		"\30\r\2\u0098\u0099\7\5\2\2\u0099\u009a\7\25\2\2\u009a\u009b\5\32\16\2"+
		"\u009b\u009c\7\26\2\2\u009c\u009f\5\22\n\2\u009d\u009e\7\7\2\2\u009e\u00a0"+
		"\5\22\n\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b1\3\2\2\2"+
		"\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5\32\16\2\u00a4"+
		"\u00a5\7\26\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00b1\3\2\2\2\u00a7\u00a8\5"+
		"\f\7\2\u00a8\u00a9\7&\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\20\2\2\u00ab"+
		"\u00b1\3\2\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7"+
		"\20\2\2\u00af\u00b1\3\2\2\2\u00b0\u008e\3\2\2\2\u00b0\u0093\3\2\2\2\u00b0"+
		"\u0097\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a7\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\5\60\31\2\u00b3"+
		"\u00bc\7\25\2\2\u00b4\u00b9\5\32\16\2\u00b5\u00b6\7\27\2\2\u00b6\u00b8"+
		"\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b4"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\26\2\2"+
		"\u00bf\27\3\2\2\2\u00c0\u00c5\5\26\f\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3"+
		"\7\20\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2"+
		"\u00c5\31\3\2\2\2\u00c6\u00c7\b\16\1\2\u00c7\u00d3\5\34\17\2\u00c8\u00d3"+
		"\5&\24\2\u00c9\u00ca\7\33\2\2\u00ca\u00d3\5\32\16\6\u00cb\u00d3\5\30\r"+
		"\2\u00cc\u00cd\7!\2\2\u00cd\u00d3\5\32\16\4\u00ce\u00cf\7\25\2\2\u00cf"+
		"\u00d0\5\32\16\2\u00d0\u00d1\7\26\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c6"+
		"\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2"+
		"\u00cc\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\f\7"+
		"\2\2\u00d5\u00d6\5(\25\2\u00d6\u00d7\5\32\16\b\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\5\f\7\2\u00de\u00e0"+
		"\5\b\5\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\35\3\2\2\2\u00e1"+
		"\u00e2\7.\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4!\3\2\2\2\u00e5"+
		"\u00e6\t\3\2\2\u00e6#\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8%\3\2\2\2\u00e9"+
		"\u00ee\5\36\20\2\u00ea\u00ee\7-\2\2\u00eb\u00ee\7\60\2\2\u00ec\u00ee\7"+
		"\61\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00f4\5*\26\2\u00f0\u00f4\5 \21\2"+
		"\u00f1\u00f4\5\"\22\2\u00f2\u00f4\5$\23\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4)\3\2\2\2\u00f5"+
		"\u00f6\t\5\2\2\u00f6+\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8-\3\2\2\2\u00f9"+
		"\u00fa\t\7\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7+\2\2\u00fc\61\3\2\2\2\268"+
		">LWcsv}\u0083\u0089\u009f\u00b0\u00b9\u00bc\u00c4\u00d2\u00da\u00df\u00ed"+
		"\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}