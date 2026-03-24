// Generated from c:/Users/mathg/Documents/GitHub/PySysML2/pysysml2/grammar/SysML2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SysML2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, KW_ABOUT=9, 
		KW_ACTOR=10, KW_ATTRIBUTE=11, KW_CASE=12, KW_COMMENT=13, KW_CONNECTION=14, 
		KW_CONNECT=15, KW_DEF=16, KW_DOC=17, KW_FROM=18, KW_END=19, KW_IMPORT=20, 
		KW_INCLUDE=21, KW_ITEM=22, KW_MESSAGE=23, KW_OBJECTIVE=24, KW_PACKAGE=25, 
		KW_PART=26, KW_PORT=27, KW_REF=28, KW_REDEFINES=29, KW_SPECIALIZES=30, 
		KW_SUBJECT=31, KW_SUBSETS=32, KW_SYM_FQN=33, KW_SYM_REDEFINES=34, KW_SYM_SUBSETS=35, 
		KW_TO=36, KW_USE=37, KW_IN=38, KW_OUT=39, KW_OF=40, CONSTANT=41, TYPE=42, 
		ID=43, INTEGER=44, REAL=45, BOOL=46, STRING=47, MULTIPLICITY=48, NULL=49, 
		WS=50, NOTE=51, COMMENT_LONG=52;
	public static final int
		RULE_model = 0, RULE_element = 1, RULE_namespace = 2, RULE_sysml2_package = 3, 
		RULE_part_blk = 4, RULE_part = 5, RULE_part_def = 6, RULE_part_def_specializes = 7, 
		RULE_port = 8, RULE_port_def = 9, RULE_port_blk = 10, RULE_use_case_blk = 11, 
		RULE_use_case_def = 12, RULE_part_objective_blk = 13, RULE_objective_def = 14, 
		RULE_subject_def = 15, RULE_include = 16, RULE_include_blk = 17, RULE_message = 18, 
		RULE_message_expr = 19, RULE_feature = 20, RULE_connection = 21, RULE_connection_blk = 22, 
		RULE_end_part = 23, RULE_connect = 24, RULE_connect_expr = 25, RULE_feature_attribute_def = 26, 
		RULE_feature_attribute_redefines = 27, RULE_feature_part_specializes = 28, 
		RULE_feature_part_specializes_subsets = 29, RULE_feature_item_def = 30, 
		RULE_feature_item_ref = 31, RULE_feature_actor_specializes = 32, RULE_comment = 33, 
		RULE_comment_unnamed = 34, RULE_comment_named = 35, RULE_comment_named_about = 36, 
		RULE_doc = 37, RULE_doc_unnamed = 38, RULE_doc_named = 39, RULE_statement = 40, 
		RULE_import_package = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "element", "namespace", "sysml2_package", "part_blk", "part", 
			"part_def", "part_def_specializes", "port", "port_def", "port_blk", "use_case_blk", 
			"use_case_def", "part_objective_blk", "objective_def", "subject_def", 
			"include", "include_blk", "message", "message_expr", "feature", "connection", 
			"connection_blk", "end_part", "connect", "connect_expr", "feature_attribute_def", 
			"feature_attribute_redefines", "feature_part_specializes", "feature_part_specializes_subsets", 
			"feature_item_def", "feature_item_ref", "feature_actor_specializes", 
			"comment", "comment_unnamed", "comment_named", "comment_named_about", 
			"doc", "doc_unnamed", "doc_named", "statement", "import_package"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "','", "'='", "'.'", "':'", "'*'", "'about'", 
			"'actor'", "'attribute'", "'case'", "'comment'", "'connection'", "'connect'", 
			"'def'", "'doc'", "'from'", "'end'", "'import'", "'include'", "'item'", 
			"'message'", "'objective'", "'package'", "'part'", "'port'", "'ref'", 
			"'redefines'", "'specializes'", "'subject'", "'subsets'", "'::'", "':>>'", 
			"':>'", "'to'", "'use'", "'in'", "'out'", "'of'", null, null, null, null, 
			null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "KW_ABOUT", "KW_ACTOR", 
			"KW_ATTRIBUTE", "KW_CASE", "KW_COMMENT", "KW_CONNECTION", "KW_CONNECT", 
			"KW_DEF", "KW_DOC", "KW_FROM", "KW_END", "KW_IMPORT", "KW_INCLUDE", "KW_ITEM", 
			"KW_MESSAGE", "KW_OBJECTIVE", "KW_PACKAGE", "KW_PART", "KW_PORT", "KW_REF", 
			"KW_REDEFINES", "KW_SPECIALIZES", "KW_SUBJECT", "KW_SUBSETS", "KW_SYM_FQN", 
			"KW_SYM_REDEFINES", "KW_SYM_SUBSETS", "KW_TO", "KW_USE", "KW_IN", "KW_OUT", 
			"KW_OF", "CONSTANT", "TYPE", "ID", "INTEGER", "REAL", "BOOL", "STRING", 
			"MULTIPLICITY", "NULL", "WS", "NOTE", "COMMENT_LONG"
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
	public String getGrammarFileName() { return "SysML2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SysML2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SysML2Parser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504562208779264L) != 0)) {
				{
				{
				setState(84);
				element();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				namespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				feature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				comment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				doc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				port();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public Sysml2_packageContext sysml2_package() {
			return getRuleContext(Sysml2_packageContext.class,0);
		}
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Use_case_defContext use_case_def() {
			return getRuleContext(Use_case_defContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				sysml2_package();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				part();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				use_case_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				doc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				port();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				connect();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sysml2_packageContext extends ParserRuleContext {
		public TerminalNode KW_PACKAGE() { return getToken(SysML2Parser.KW_PACKAGE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public Sysml2_packageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysml2_package; }
	}

	public final Sysml2_packageContext sysml2_package() throws RecognitionException {
		Sysml2_packageContext _localctx = new Sysml2_packageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sysml2_package);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(KW_PACKAGE);
			setState(110);
			match(ID);
			setState(111);
			match(T__0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504562207730688L) != 0)) {
				{
				{
				setState(112);
				namespace();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part_blkContext extends ParserRuleContext {
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public Part_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_blk; }
	}

	public final Part_blkContext part_blk() throws RecognitionException {
		Part_blkContext _localctx = new Part_blkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_part_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(120);
				feature();
				}
				break;
			case 2:
				{
				setState(121);
				comment();
				}
				break;
			case 3:
				{
				setState(122);
				doc();
				}
				break;
			case 4:
				{
				setState(123);
				part();
				}
				break;
			case 5:
				{
				setState(124);
				port();
				}
				break;
			case 6:
				{
				setState(125);
				connect();
				}
				break;
			case 7:
				{
				setState(126);
				connection();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartContext extends ParserRuleContext {
		public Part_defContext part_def() {
			return getRuleContext(Part_defContext.class,0);
		}
		public Part_def_specializesContext part_def_specializes() {
			return getRuleContext(Part_def_specializesContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				part_def();
				}
				break;
			case 2:
				{
				setState(130);
				part_def_specializes();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part_defContext extends ParserRuleContext {
		public TerminalNode KW_PART() { return getToken(SysML2Parser.KW_PART, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode KW_DEF() { return getToken(SysML2Parser.KW_DEF, 0); }
		public List<Part_blkContext> part_blk() {
			return getRuleContexts(Part_blkContext.class);
		}
		public Part_blkContext part_blk(int i) {
			return getRuleContext(Part_blkContext.class,i);
		}
		public Part_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_def; }
	}

	public final Part_defContext part_def() throws RecognitionException {
		Part_defContext _localctx = new Part_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_part_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(133);
				match(KW_PART);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DEF) {
					{
					setState(134);
					match(KW_DEF);
					}
				}

				setState(137);
				match(ID);
				setState(138);
				match(T__0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504424735239168L) != 0)) {
					{
					{
					setState(139);
					part_blk();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__1);
				}
				}
				break;
			case 2:
				{
				{
				setState(146);
				match(KW_PART);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DEF) {
					{
					setState(147);
					match(KW_DEF);
					}
				}

				setState(150);
				match(ID);
				setState(151);
				match(T__2);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part_def_specializesContext extends ParserRuleContext {
		public TerminalNode KW_PART() { return getToken(SysML2Parser.KW_PART, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public TerminalNode KW_SPECIALIZES() { return getToken(SysML2Parser.KW_SPECIALIZES, 0); }
		public TerminalNode KW_SYM_SUBSETS() { return getToken(SysML2Parser.KW_SYM_SUBSETS, 0); }
		public TerminalNode KW_DEF() { return getToken(SysML2Parser.KW_DEF, 0); }
		public List<Part_blkContext> part_blk() {
			return getRuleContexts(Part_blkContext.class);
		}
		public Part_blkContext part_blk(int i) {
			return getRuleContext(Part_blkContext.class,i);
		}
		public Part_def_specializesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_def_specializes; }
	}

	public final Part_def_specializesContext part_def_specializes() throws RecognitionException {
		Part_def_specializesContext _localctx = new Part_def_specializesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_part_def_specializes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(KW_PART);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEF) {
				{
				setState(155);
				match(KW_DEF);
				}
			}

			setState(158);
			match(ID);
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==KW_SPECIALIZES || _la==KW_SYM_SUBSETS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
			match(ID);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(161);
					match(T__3);
					setState(162);
					match(ID);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(168);
				match(T__0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504424735239168L) != 0)) {
					{
					{
					setState(169);
					part_blk();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__1);
				}
				break;
			case T__2:
				{
				setState(176);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PortContext extends ParserRuleContext {
		public Port_defContext port_def() {
			return getRuleContext(Port_defContext.class,0);
		}
		public Port_blkContext port_blk() {
			return getRuleContext(Port_blkContext.class,0);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PORT:
			case KW_IN:
			case KW_OUT:
				{
				setState(179);
				port_def();
				}
				break;
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_COMMENT:
			case KW_DOC:
			case KW_ITEM:
			case KW_PART:
			case KW_REF:
			case COMMENT_LONG:
				{
				setState(180);
				port_blk();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Port_defContext extends ParserRuleContext {
		public TerminalNode KW_PORT() { return getToken(SysML2Parser.KW_PORT, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode KW_IN() { return getToken(SysML2Parser.KW_IN, 0); }
		public TerminalNode KW_OUT() { return getToken(SysML2Parser.KW_OUT, 0); }
		public List<Port_blkContext> port_blk() {
			return getRuleContexts(Port_blkContext.class);
		}
		public Port_blkContext port_blk(int i) {
			return getRuleContext(Port_blkContext.class,i);
		}
		public Port_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_def; }
	}

	public final Port_defContext port_def() throws RecognitionException {
		Port_defContext _localctx = new Port_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_port_def);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IN || _la==KW_OUT) {
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==KW_IN || _la==KW_OUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(186);
				match(KW_PORT);
				setState(187);
				match(ID);
				setState(188);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IN || _la==KW_OUT) {
					{
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==KW_IN || _la==KW_OUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(192);
				match(KW_PORT);
				setState(193);
				match(ID);
				setState(194);
				match(T__0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599967251456L) != 0)) {
					{
					{
					setState(195);
					port_blk();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Port_blkContext extends ParserRuleContext {
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public Port_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_blk; }
	}

	public final Port_blkContext port_blk() throws RecognitionException {
		Port_blkContext _localctx = new Port_blkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_port_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_ITEM:
			case KW_PART:
			case KW_REF:
				{
				setState(204);
				feature();
				}
				break;
			case KW_COMMENT:
			case COMMENT_LONG:
				{
				setState(205);
				comment();
				}
				break;
			case KW_DOC:
				{
				setState(206);
				doc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Use_case_blkContext extends ParserRuleContext {
		public Part_blkContext part_blk() {
			return getRuleContext(Part_blkContext.class,0);
		}
		public Objective_defContext objective_def() {
			return getRuleContext(Objective_defContext.class,0);
		}
		public Subject_defContext subject_def() {
			return getRuleContext(Subject_defContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public Use_case_defContext use_case_def() {
			return getRuleContext(Use_case_defContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public Use_case_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_case_blk; }
	}

	public final Use_case_blkContext use_case_blk() throws RecognitionException {
		Use_case_blkContext _localctx = new Use_case_blkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_use_case_blk);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_COMMENT:
			case KW_CONNECTION:
			case KW_CONNECT:
			case KW_DOC:
			case KW_ITEM:
			case KW_PART:
			case KW_PORT:
			case KW_REF:
			case KW_IN:
			case KW_OUT:
			case COMMENT_LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				part_blk();
				}
				break;
			case KW_OBJECTIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				objective_def();
				}
				break;
			case KW_SUBJECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				subject_def();
				}
				break;
			case KW_INCLUDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				include();
				}
				break;
			case KW_USE:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				use_case_def();
				}
				break;
			case KW_MESSAGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				message();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Use_case_defContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(SysML2Parser.KW_USE, 0); }
		public TerminalNode KW_CASE() { return getToken(SysML2Parser.KW_CASE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode KW_DEF() { return getToken(SysML2Parser.KW_DEF, 0); }
		public List<Use_case_blkContext> use_case_blk() {
			return getRuleContexts(Use_case_blkContext.class);
		}
		public Use_case_blkContext use_case_blk(int i) {
			return getRuleContext(Use_case_blkContext.class,i);
		}
		public Use_case_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_case_def; }
	}

	public final Use_case_defContext use_case_def() throws RecognitionException {
		Use_case_defContext _localctx = new Use_case_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_use_case_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KW_USE);
			setState(218);
			match(KW_CASE);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEF) {
				{
				setState(219);
				match(KW_DEF);
				}
			}

			setState(222);
			match(ID);
			setState(223);
			match(T__0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504564348939264L) != 0)) {
				{
				{
				setState(224);
				use_case_blk();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part_objective_blkContext extends ParserRuleContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public Part_objective_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_objective_blk; }
	}

	public final Part_objective_blkContext part_objective_blk() throws RecognitionException {
		Part_objective_blkContext _localctx = new Part_objective_blkContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_part_objective_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			doc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Objective_defContext extends ParserRuleContext {
		public TerminalNode KW_OBJECTIVE() { return getToken(SysML2Parser.KW_OBJECTIVE, 0); }
		public Part_objective_blkContext part_objective_blk() {
			return getRuleContext(Part_objective_blkContext.class,0);
		}
		public Objective_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objective_def; }
	}

	public final Objective_defContext objective_def() throws RecognitionException {
		Objective_defContext _localctx = new Objective_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objective_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(KW_OBJECTIVE);
			setState(235);
			match(T__0);
			setState(236);
			part_objective_blk();
			setState(237);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Subject_defContext extends ParserRuleContext {
		public TerminalNode KW_SUBJECT() { return getToken(SysML2Parser.KW_SUBJECT, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public Subject_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_def; }
	}

	public final Subject_defContext subject_def() throws RecognitionException {
		Subject_defContext _localctx = new Subject_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subject_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(KW_SUBJECT);
			setState(240);
			match(ID);
			setState(241);
			match(T__4);
			setState(242);
			match(ID);
			setState(243);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode KW_INCLUDE() { return getToken(SysML2Parser.KW_INCLUDE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public List<Include_blkContext> include_blk() {
			return getRuleContexts(Include_blkContext.class);
		}
		public Include_blkContext include_blk(int i) {
			return getRuleContext(Include_blkContext.class,i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(KW_INCLUDE);
			setState(246);
			match(ID);
			setState(247);
			match(T__0);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504426907888640L) != 0)) {
				{
				{
				setState(248);
				include_blk();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Include_blkContext extends ParserRuleContext {
		public Part_blkContext part_blk() {
			return getRuleContext(Part_blkContext.class,0);
		}
		public Objective_defContext objective_def() {
			return getRuleContext(Objective_defContext.class,0);
		}
		public Subject_defContext subject_def() {
			return getRuleContext(Subject_defContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public Include_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_blk; }
	}

	public final Include_blkContext include_blk() throws RecognitionException {
		Include_blkContext _localctx = new Include_blkContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_include_blk);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_COMMENT:
			case KW_CONNECTION:
			case KW_CONNECT:
			case KW_DOC:
			case KW_ITEM:
			case KW_PART:
			case KW_PORT:
			case KW_REF:
			case KW_IN:
			case KW_OUT:
			case COMMENT_LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				part_blk();
				}
				break;
			case KW_OBJECTIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				objective_def();
				}
				break;
			case KW_SUBJECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				subject_def();
				}
				break;
			case KW_MESSAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				message();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageContext extends ParserRuleContext {
		public TerminalNode KW_MESSAGE() { return getToken(SysML2Parser.KW_MESSAGE, 0); }
		public TerminalNode KW_OF() { return getToken(SysML2Parser.KW_OF, 0); }
		public List<Message_exprContext> message_expr() {
			return getRuleContexts(Message_exprContext.class);
		}
		public Message_exprContext message_expr(int i) {
			return getRuleContext(Message_exprContext.class,i);
		}
		public TerminalNode KW_FROM() { return getToken(SysML2Parser.KW_FROM, 0); }
		public TerminalNode KW_TO() { return getToken(SysML2Parser.KW_TO, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(KW_MESSAGE);
			setState(263);
			match(KW_OF);
			setState(264);
			message_expr();
			setState(265);
			match(KW_FROM);
			setState(266);
			message_expr();
			setState(267);
			match(KW_TO);
			setState(268);
			message_expr();
			setState(269);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Message_exprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public Message_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expr; }
	}

	public final Message_exprContext message_expr() throws RecognitionException {
		Message_exprContext _localctx = new Message_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_message_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(272);
					match(T__5);
					setState(273);
					match(ID);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureContext extends ParserRuleContext {
		public Feature_attribute_defContext feature_attribute_def() {
			return getRuleContext(Feature_attribute_defContext.class,0);
		}
		public Feature_attribute_redefinesContext feature_attribute_redefines() {
			return getRuleContext(Feature_attribute_redefinesContext.class,0);
		}
		public Feature_part_specializesContext feature_part_specializes() {
			return getRuleContext(Feature_part_specializesContext.class,0);
		}
		public Feature_part_specializes_subsetsContext feature_part_specializes_subsets() {
			return getRuleContext(Feature_part_specializes_subsetsContext.class,0);
		}
		public Feature_item_defContext feature_item_def() {
			return getRuleContext(Feature_item_defContext.class,0);
		}
		public Feature_item_refContext feature_item_ref() {
			return getRuleContext(Feature_item_refContext.class,0);
		}
		public Feature_actor_specializesContext feature_actor_specializes() {
			return getRuleContext(Feature_actor_specializesContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_feature);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				feature_attribute_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				feature_attribute_redefines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				feature_part_specializes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				feature_part_specializes_subsets();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				feature_item_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				feature_item_ref();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				feature_actor_specializes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode KW_CONNECTION() { return getToken(SysML2Parser.KW_CONNECTION, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public List<Connection_blkContext> connection_blk() {
			return getRuleContexts(Connection_blkContext.class);
		}
		public Connection_blkContext connection_blk(int i) {
			return getRuleContext(Connection_blkContext.class,i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(KW_CONNECTION);
			setState(289);
			match(ID);
			setState(290);
			match(T__0);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ATTRIBUTE || _la==KW_END) {
				{
				{
				setState(291);
				connection_blk();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Connection_blkContext extends ParserRuleContext {
		public End_partContext end_part() {
			return getRuleContext(End_partContext.class,0);
		}
		public Feature_attribute_defContext feature_attribute_def() {
			return getRuleContext(Feature_attribute_defContext.class,0);
		}
		public Connection_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection_blk; }
	}

	public final Connection_blkContext connection_blk() throws RecognitionException {
		Connection_blkContext _localctx = new Connection_blkContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_connection_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_END:
				{
				setState(299);
				end_part();
				}
				break;
			case KW_ATTRIBUTE:
				{
				setState(300);
				feature_attribute_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_partContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(SysML2Parser.KW_END, 0); }
		public TerminalNode KW_PART() { return getToken(SysML2Parser.KW_PART, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public End_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_part; }
	}

	public final End_partContext end_part() throws RecognitionException {
		End_partContext _localctx = new End_partContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_end_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(KW_END);
			setState(304);
			match(KW_PART);
			setState(305);
			match(ID);
			setState(306);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectContext extends ParserRuleContext {
		public TerminalNode KW_CONNECT() { return getToken(SysML2Parser.KW_CONNECT, 0); }
		public List<Connect_exprContext> connect_expr() {
			return getRuleContexts(Connect_exprContext.class);
		}
		public Connect_exprContext connect_expr(int i) {
			return getRuleContext(Connect_exprContext.class,i);
		}
		public TerminalNode KW_TO() { return getToken(SysML2Parser.KW_TO, 0); }
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(KW_CONNECT);
			setState(309);
			connect_expr();
			setState(310);
			match(KW_TO);
			setState(311);
			connect_expr();
			setState(312);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Connect_exprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public Connect_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect_expr; }
	}

	public final Connect_exprContext connect_expr() throws RecognitionException {
		Connect_exprContext _localctx = new Connect_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_connect_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ID);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(315);
					match(T__5);
					setState(316);
					match(ID);
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_attribute_defContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(SysML2Parser.KW_ATTRIBUTE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(SysML2Parser.TYPE, 0); }
		public TerminalNode CONSTANT() { return getToken(SysML2Parser.CONSTANT, 0); }
		public Feature_attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_attribute_def; }
	}

	public final Feature_attribute_defContext feature_attribute_def() throws RecognitionException {
		Feature_attribute_defContext _localctx = new Feature_attribute_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_feature_attribute_def);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(KW_ATTRIBUTE);
				setState(323);
				match(ID);
				setState(324);
				match(T__6);
				setState(325);
				match(TYPE);
				setState(326);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(KW_ATTRIBUTE);
				setState(328);
				match(ID);
				setState(329);
				match(T__4);
				setState(330);
				match(CONSTANT);
				setState(331);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_attribute_redefinesContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(SysML2Parser.KW_ATTRIBUTE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode CONSTANT() { return getToken(SysML2Parser.CONSTANT, 0); }
		public TerminalNode KW_REDEFINES() { return getToken(SysML2Parser.KW_REDEFINES, 0); }
		public TerminalNode KW_SYM_REDEFINES() { return getToken(SysML2Parser.KW_SYM_REDEFINES, 0); }
		public TerminalNode KW_SYM_SUBSETS() { return getToken(SysML2Parser.KW_SYM_SUBSETS, 0); }
		public TerminalNode TYPE() { return getToken(SysML2Parser.TYPE, 0); }
		public Feature_attribute_redefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_attribute_redefines; }
	}

	public final Feature_attribute_redefinesContext feature_attribute_redefines() throws RecognitionException {
		Feature_attribute_redefinesContext _localctx = new Feature_attribute_redefinesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_feature_attribute_redefines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(KW_ATTRIBUTE);
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52076478464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(336);
			match(ID);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(337);
				match(T__6);
				setState(338);
				match(TYPE);
				}
			}

			setState(341);
			match(T__4);
			setState(342);
			match(CONSTANT);
			setState(343);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_part_specializesContext extends ParserRuleContext {
		public TerminalNode KW_PART() { return getToken(SysML2Parser.KW_PART, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public TerminalNode MULTIPLICITY() { return getToken(SysML2Parser.MULTIPLICITY, 0); }
		public List<Part_blkContext> part_blk() {
			return getRuleContexts(Part_blkContext.class);
		}
		public Part_blkContext part_blk(int i) {
			return getRuleContext(Part_blkContext.class,i);
		}
		public Feature_part_specializesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_part_specializes; }
	}

	public final Feature_part_specializesContext feature_part_specializes() throws RecognitionException {
		Feature_part_specializesContext _localctx = new Feature_part_specializesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_feature_part_specializes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(KW_PART);
			setState(346);
			match(ID);
			setState(347);
			match(T__6);
			setState(348);
			match(ID);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(349);
				match(MULTIPLICITY);
				}
			}

			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(352);
				match(T__2);
				}
				break;
			case T__0:
				{
				setState(353);
				match(T__0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504424735239168L) != 0)) {
					{
					{
					setState(354);
					part_blk();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_part_specializes_subsetsContext extends ParserRuleContext {
		public TerminalNode KW_PART() { return getToken(SysML2Parser.KW_PART, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public TerminalNode KW_SUBSETS() { return getToken(SysML2Parser.KW_SUBSETS, 0); }
		public TerminalNode KW_SYM_SUBSETS() { return getToken(SysML2Parser.KW_SYM_SUBSETS, 0); }
		public TerminalNode MULTIPLICITY() { return getToken(SysML2Parser.MULTIPLICITY, 0); }
		public Feature_part_specializes_subsetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_part_specializes_subsets; }
	}

	public final Feature_part_specializes_subsetsContext feature_part_specializes_subsets() throws RecognitionException {
		Feature_part_specializes_subsetsContext _localctx = new Feature_part_specializes_subsetsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_feature_part_specializes_subsets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(KW_PART);
			setState(364);
			match(ID);
			setState(365);
			match(T__6);
			setState(366);
			match(ID);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(367);
				match(MULTIPLICITY);
				}
			}

			setState(370);
			_la = _input.LA(1);
			if ( !(_la==KW_SUBSETS || _la==KW_SYM_SUBSETS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(371);
			match(ID);
			setState(372);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_item_defContext extends ParserRuleContext {
		public TerminalNode KW_ITEM() { return getToken(SysML2Parser.KW_ITEM, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public Feature_item_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_item_def; }
	}

	public final Feature_item_defContext feature_item_def() throws RecognitionException {
		Feature_item_defContext _localctx = new Feature_item_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_feature_item_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(KW_ITEM);
			setState(375);
			match(ID);
			setState(376);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_item_refContext extends ParserRuleContext {
		public TerminalNode KW_ITEM() { return getToken(SysML2Parser.KW_ITEM, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public TerminalNode KW_REF() { return getToken(SysML2Parser.KW_REF, 0); }
		public Feature_item_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_item_ref; }
	}

	public final Feature_item_refContext feature_item_ref() throws RecognitionException {
		Feature_item_refContext _localctx = new Feature_item_refContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_feature_item_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_REF) {
				{
				setState(378);
				match(KW_REF);
				}
			}

			setState(381);
			match(KW_ITEM);
			setState(382);
			match(ID);
			setState(383);
			match(T__6);
			setState(384);
			match(ID);
			setState(385);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Feature_actor_specializesContext extends ParserRuleContext {
		public TerminalNode KW_ACTOR() { return getToken(SysML2Parser.KW_ACTOR, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public TerminalNode KW_SYM_REDEFINES() { return getToken(SysML2Parser.KW_SYM_REDEFINES, 0); }
		public TerminalNode MULTIPLICITY() { return getToken(SysML2Parser.MULTIPLICITY, 0); }
		public Feature_actor_specializesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_actor_specializes; }
	}

	public final Feature_actor_specializesContext feature_actor_specializes() throws RecognitionException {
		Feature_actor_specializesContext _localctx = new Feature_actor_specializesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_feature_actor_specializes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(KW_ACTOR);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SYM_REDEFINES) {
				{
				setState(388);
				match(KW_SYM_REDEFINES);
				}
			}

			setState(391);
			match(ID);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(392);
				match(T__6);
				setState(393);
				match(ID);
				}
				break;
			case T__4:
				{
				setState(394);
				match(T__4);
				setState(395);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(398);
				match(MULTIPLICITY);
				}
			}

			setState(401);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public Comment_unnamedContext comment_unnamed() {
			return getRuleContext(Comment_unnamedContext.class,0);
		}
		public Comment_namedContext comment_named() {
			return getRuleContext(Comment_namedContext.class,0);
		}
		public Comment_named_aboutContext comment_named_about() {
			return getRuleContext(Comment_named_aboutContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comment);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				comment_unnamed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				comment_named();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				comment_named_about();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comment_unnamedContext extends ParserRuleContext {
		public TerminalNode COMMENT_LONG() { return getToken(SysML2Parser.COMMENT_LONG, 0); }
		public Comment_unnamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_unnamed; }
	}

	public final Comment_unnamedContext comment_unnamed() throws RecognitionException {
		Comment_unnamedContext _localctx = new Comment_unnamedContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comment_unnamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(COMMENT_LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comment_namedContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(SysML2Parser.KW_COMMENT, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode COMMENT_LONG() { return getToken(SysML2Parser.COMMENT_LONG, 0); }
		public Comment_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_named; }
	}

	public final Comment_namedContext comment_named() throws RecognitionException {
		Comment_namedContext _localctx = new Comment_namedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comment_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(KW_COMMENT);
			setState(411);
			match(ID);
			setState(412);
			match(COMMENT_LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comment_named_aboutContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(SysML2Parser.KW_COMMENT, 0); }
		public TerminalNode KW_ABOUT() { return getToken(SysML2Parser.KW_ABOUT, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode COMMENT_LONG() { return getToken(SysML2Parser.COMMENT_LONG, 0); }
		public Comment_named_aboutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_named_about; }
	}

	public final Comment_named_aboutContext comment_named_about() throws RecognitionException {
		Comment_named_aboutContext _localctx = new Comment_named_aboutContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comment_named_about);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(KW_COMMENT);
			setState(415);
			match(KW_ABOUT);
			setState(416);
			match(ID);
			setState(417);
			match(COMMENT_LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DocContext extends ParserRuleContext {
		public Doc_unnamedContext doc_unnamed() {
			return getRuleContext(Doc_unnamedContext.class,0);
		}
		public Doc_namedContext doc_named() {
			return getRuleContext(Doc_namedContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_doc);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				doc_unnamed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				doc_named();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Doc_unnamedContext extends ParserRuleContext {
		public TerminalNode KW_DOC() { return getToken(SysML2Parser.KW_DOC, 0); }
		public TerminalNode COMMENT_LONG() { return getToken(SysML2Parser.COMMENT_LONG, 0); }
		public Doc_unnamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_unnamed; }
	}

	public final Doc_unnamedContext doc_unnamed() throws RecognitionException {
		Doc_unnamedContext _localctx = new Doc_unnamedContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doc_unnamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(KW_DOC);
			setState(424);
			match(COMMENT_LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Doc_namedContext extends ParserRuleContext {
		public TerminalNode KW_DOC() { return getToken(SysML2Parser.KW_DOC, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode COMMENT_LONG() { return getToken(SysML2Parser.COMMENT_LONG, 0); }
		public Doc_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_named; }
	}

	public final Doc_namedContext doc_named() throws RecognitionException {
		Doc_namedContext _localctx = new Doc_namedContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_doc_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(KW_DOC);
			setState(427);
			match(ID);
			setState(428);
			match(COMMENT_LONG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Import_packageContext import_package() {
			return getRuleContext(Import_packageContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			import_package();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Import_packageContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(SysML2Parser.KW_IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(SysML2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SysML2Parser.ID, i);
		}
		public List<TerminalNode> KW_SYM_FQN() { return getTokens(SysML2Parser.KW_SYM_FQN); }
		public TerminalNode KW_SYM_FQN(int i) {
			return getToken(SysML2Parser.KW_SYM_FQN, i);
		}
		public Import_packageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_package; }
	}

	public final Import_packageContext import_package() throws RecognitionException {
		Import_packageContext _localctx = new Import_packageContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_import_package);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(KW_IMPORT);
			setState(433);
			match(ID);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(KW_SYM_FQN);
					setState(435);
					match(ID);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SYM_FQN) {
				{
				setState(441);
				match(KW_SYM_FQN);
				setState(442);
				match(T__7);
				}
			}

			setState(445);
			match(T__2);
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

	public static final String _serializedATN =
		"\u0004\u00014\u01c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002l\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003r\b\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0084\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006"+
		"\u0090\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0095\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00a4\b\u0007\n\u0007\f\u0007\u00a7\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00ab\b\u0007\n\u0007\f\u0007\u00ae"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b2\b\u0007\u0001\b\u0001"+
		"\b\u0003\b\u00b6\b\b\u0001\t\u0003\t\u00b9\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00bf\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c5"+
		"\b\t\n\t\f\t\u00c8\t\t\u0001\t\u0003\t\u00cb\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00d0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00dd\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e2\b\f\n\f\f\f\u00e5\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00fa\b\u0010\n\u0010\f\u0010\u00fd\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0105"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0113\b\u0013\n\u0013\f\u0013\u0116\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u011f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0125\b\u0015\n\u0015\f\u0015\u0128\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u012e\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u013e\b\u0019\n\u0019\f\u0019\u0141\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u014d\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0154\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u015f\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0164\b\u001c\n\u001c\f\u001c\u0167"+
		"\t\u001c\u0001\u001c\u0003\u001c\u016a\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0171\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0003\u001f\u017c\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 "+
		"\u0186\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u018d\b \u0001 \u0003"+
		" \u0190\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0197\b!\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0003%\u01a6\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u01b5\b)\n"+
		")\f)\u01b8\t)\u0001)\u0001)\u0003)\u01bc\b)\u0001)\u0001)\u0001)\u0003"+
		"\u00a5\u0114\u013f\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000"+
		"\u0004\u0002\u0000\u001e\u001e##\u0001\u0000&\'\u0002\u0000\u001d\u001d"+
		"\"#\u0002\u0000  ##\u01dc\u0000W\u0001\u0000\u0000\u0000\u0002b\u0001"+
		"\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000"+
		"\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000"+
		"\f\u0098\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000\u0000\u0010"+
		"\u00b5\u0001\u0000\u0000\u0000\u0012\u00ca\u0001\u0000\u0000\u0000\u0014"+
		"\u00cf\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000\u0000\u0000\u0018"+
		"\u00d9\u0001\u0000\u0000\u0000\u001a\u00e8\u0001\u0000\u0000\u0000\u001c"+
		"\u00ea\u0001\u0000\u0000\u0000\u001e\u00ef\u0001\u0000\u0000\u0000 \u00f5"+
		"\u0001\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000$\u0106\u0001"+
		"\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000"+
		"\u0000*\u0120\u0001\u0000\u0000\u0000,\u012d\u0001\u0000\u0000\u0000."+
		"\u012f\u0001\u0000\u0000\u00000\u0134\u0001\u0000\u0000\u00002\u013a\u0001"+
		"\u0000\u0000\u00004\u014c\u0001\u0000\u0000\u00006\u014e\u0001\u0000\u0000"+
		"\u00008\u0159\u0001\u0000\u0000\u0000:\u016b\u0001\u0000\u0000\u0000<"+
		"\u0176\u0001\u0000\u0000\u0000>\u017b\u0001\u0000\u0000\u0000@\u0183\u0001"+
		"\u0000\u0000\u0000B\u0196\u0001\u0000\u0000\u0000D\u0198\u0001\u0000\u0000"+
		"\u0000F\u019a\u0001\u0000\u0000\u0000H\u019e\u0001\u0000\u0000\u0000J"+
		"\u01a5\u0001\u0000\u0000\u0000L\u01a7\u0001\u0000\u0000\u0000N\u01aa\u0001"+
		"\u0000\u0000\u0000P\u01ae\u0001\u0000\u0000\u0000R\u01b0\u0001\u0000\u0000"+
		"\u0000TV\u0003\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0000\u0000\u0001"+
		"[\u0001\u0001\u0000\u0000\u0000\\c\u0003\u0004\u0002\u0000]c\u0003(\u0014"+
		"\u0000^c\u0003B!\u0000_c\u0003J%\u0000`c\u0003P(\u0000ac\u0003\u0010\b"+
		"\u0000b\\\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000dl\u0003\u0006\u0003"+
		"\u0000el\u0003\n\u0005\u0000fl\u0003\u0018\f\u0000gl\u0003B!\u0000hl\u0003"+
		"J%\u0000il\u0003\u0010\b\u0000jl\u00030\u0018\u0000kd\u0001\u0000\u0000"+
		"\u0000ke\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000"+
		"\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000mn\u0005\u0019\u0000"+
		"\u0000no\u0005+\u0000\u0000os\u0005\u0001\u0000\u0000pr\u0003\u0004\u0002"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0002\u0000\u0000w\u0007\u0001\u0000\u0000"+
		"\u0000x\u0080\u0003(\u0014\u0000y\u0080\u0003B!\u0000z\u0080\u0003J%\u0000"+
		"{\u0080\u0003\n\u0005\u0000|\u0080\u0003\u0010\b\u0000}\u0080\u00030\u0018"+
		"\u0000~\u0080\u0003*\u0015\u0000\u007fx\u0001\u0000\u0000\u0000\u007f"+
		"y\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0003\f\u0006\u0000\u0082\u0084\u0003\u000e\u0007\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u000b\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u001a\u0000\u0000\u0086"+
		"\u0088\u0005\u0010\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005+\u0000\u0000\u008a\u008e\u0005\u0001\u0000\u0000\u008b\u008d"+
		"\u0003\b\u0004\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0099\u0005\u0002\u0000\u0000\u0092\u0094\u0005"+
		"\u001a\u0000\u0000\u0093\u0095\u0005\u0010\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005+\u0000\u0000\u0097\u0099\u0005\u0003"+
		"\u0000\u0000\u0098\u0085\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000"+
		"\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u001a\u0000"+
		"\u0000\u009b\u009d\u0005\u0010\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005+\u0000\u0000\u009f\u00a0\u0007\u0000\u0000\u0000"+
		"\u00a0\u00a5\u0005+\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2"+
		"\u00a4\u0005+\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00b1\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ac\u0005\u0001\u0000\u0000\u00a9\u00ab"+
		"\u0003\b\u0004\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0005\u0002\u0000\u0000\u00b0\u00b2\u0005"+
		"\u0003\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u000f\u0001\u0000\u0000\u0000\u00b3\u00b6\u0003"+
		"\u0012\t\u0000\u00b4\u00b6\u0003\u0014\n\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0011\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0007\u0001\u0000\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb\u00bc\u0005+\u0000"+
		"\u0000\u00bc\u00cb\u0005\u0003\u0000\u0000\u00bd\u00bf\u0007\u0001\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001b\u0000"+
		"\u0000\u00c1\u00c2\u0005+\u0000\u0000\u00c2\u00c6\u0005\u0001\u0000\u0000"+
		"\u00c3\u00c5\u0003\u0014\n\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0002\u0000\u0000\u00ca"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ca\u00be\u0001\u0000\u0000\u0000\u00cb"+
		"\u0013\u0001\u0000\u0000\u0000\u00cc\u00d0\u0003(\u0014\u0000\u00cd\u00d0"+
		"\u0003B!\u0000\u00ce\u00d0\u0003J%\u0000\u00cf\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u0015\u0001\u0000\u0000\u0000\u00d1\u00d8\u0003\b\u0004\u0000"+
		"\u00d2\u00d8\u0003\u001c\u000e\u0000\u00d3\u00d8\u0003\u001e\u000f\u0000"+
		"\u00d4\u00d8\u0003 \u0010\u0000\u00d5\u00d8\u0003\u0018\f\u0000\u00d6"+
		"\u00d8\u0003$\u0012\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005%\u0000\u0000\u00da\u00dc\u0005\f\u0000\u0000\u00db\u00dd\u0005"+
		"\u0010\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"+\u0000\u0000\u00df\u00e3\u0005\u0001\u0000\u0000\u00e0\u00e2\u0003\u0016"+
		"\u000b\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0002\u0000\u0000\u00e7\u0019\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0003J%\u0000\u00e9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0018\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000\u0000"+
		"\u00ec\u00ed\u0003\u001a\r\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000\u00ee"+
		"\u001d\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u001f\u0000\u0000\u00f0"+
		"\u00f1\u0005+\u0000\u0000\u00f1\u00f2\u0005\u0005\u0000\u0000\u00f2\u00f3"+
		"\u0005+\u0000\u0000\u00f3\u00f4\u0005\u0003\u0000\u0000\u00f4\u001f\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0015\u0000\u0000\u00f6\u00f7\u0005"+
		"+\u0000\u0000\u00f7\u00fb\u0005\u0001\u0000\u0000\u00f8\u00fa\u0003\""+
		"\u0011\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0002\u0000\u0000\u00ff!\u0001\u0000\u0000"+
		"\u0000\u0100\u0105\u0003\b\u0004\u0000\u0101\u0105\u0003\u001c\u000e\u0000"+
		"\u0102\u0105\u0003\u001e\u000f\u0000\u0103\u0105\u0003$\u0012\u0000\u0104"+
		"\u0100\u0001\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"#\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0017\u0000\u0000\u0107\u0108"+
		"\u0005(\u0000\u0000\u0108\u0109\u0003&\u0013\u0000\u0109\u010a\u0005\u0012"+
		"\u0000\u0000\u010a\u010b\u0003&\u0013\u0000\u010b\u010c\u0005$\u0000\u0000"+
		"\u010c\u010d\u0003&\u0013\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e"+
		"%\u0001\u0000\u0000\u0000\u010f\u0114\u0005+\u0000\u0000\u0110\u0111\u0005"+
		"\u0006\u0000\u0000\u0111\u0113\u0005+\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\'\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011f\u00034\u001a\u0000"+
		"\u0118\u011f\u00036\u001b\u0000\u0119\u011f\u00038\u001c\u0000\u011a\u011f"+
		"\u0003:\u001d\u0000\u011b\u011f\u0003<\u001e\u0000\u011c\u011f\u0003>"+
		"\u001f\u0000\u011d\u011f\u0003@ \u0000\u011e\u0117\u0001\u0000\u0000\u0000"+
		"\u011e\u0118\u0001\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000"+
		"\u011e\u011a\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011f)\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u000e\u0000\u0000\u0121"+
		"\u0122\u0005+\u0000\u0000\u0122\u0126\u0005\u0001\u0000\u0000\u0123\u0125"+
		"\u0003,\u0016\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\u0002\u0000\u0000\u012a+\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0003.\u0017\u0000\u012c\u012e\u00034\u001a\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012e-\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0013\u0000\u0000\u0130"+
		"\u0131\u0005\u001a\u0000\u0000\u0131\u0132\u0005+\u0000\u0000\u0132\u0133"+
		"\u0005\u0003\u0000\u0000\u0133/\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u000f\u0000\u0000\u0135\u0136\u00032\u0019\u0000\u0136\u0137\u0005$\u0000"+
		"\u0000\u0137\u0138\u00032\u0019\u0000\u0138\u0139\u0005\u0003\u0000\u0000"+
		"\u01391\u0001\u0000\u0000\u0000\u013a\u013f\u0005+\u0000\u0000\u013b\u013c"+
		"\u0005\u0006\u0000\u0000\u013c\u013e\u0005+\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u01403\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u000b"+
		"\u0000\u0000\u0143\u0144\u0005+\u0000\u0000\u0144\u0145\u0005\u0007\u0000"+
		"\u0000\u0145\u0146\u0005*\u0000\u0000\u0146\u014d\u0005\u0003\u0000\u0000"+
		"\u0147\u0148\u0005\u000b\u0000\u0000\u0148\u0149\u0005+\u0000\u0000\u0149"+
		"\u014a\u0005\u0005\u0000\u0000\u014a\u014b\u0005)\u0000\u0000\u014b\u014d"+
		"\u0005\u0003\u0000\u0000\u014c\u0142\u0001\u0000\u0000\u0000\u014c\u0147"+
		"\u0001\u0000\u0000\u0000\u014d5\u0001\u0000\u0000\u0000\u014e\u014f\u0005"+
		"\u000b\u0000\u0000\u014f\u0150\u0007\u0002\u0000\u0000\u0150\u0153\u0005"+
		"+\u0000\u0000\u0151\u0152\u0005\u0007\u0000\u0000\u0152\u0154\u0005*\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0005\u0000"+
		"\u0000\u0156\u0157\u0005)\u0000\u0000\u0157\u0158\u0005\u0003\u0000\u0000"+
		"\u01587\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u001a\u0000\u0000\u015a"+
		"\u015b\u0005+\u0000\u0000\u015b\u015c\u0005\u0007\u0000\u0000\u015c\u015e"+
		"\u0005+\u0000\u0000\u015d\u015f\u00050\u0000\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0169\u0001\u0000"+
		"\u0000\u0000\u0160\u016a\u0005\u0003\u0000\u0000\u0161\u0165\u0005\u0001"+
		"\u0000\u0000\u0162\u0164\u0003\b\u0004\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016a\u0005\u0002\u0000"+
		"\u0000\u0169\u0160\u0001\u0000\u0000\u0000\u0169\u0161\u0001\u0000\u0000"+
		"\u0000\u016a9\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u001a\u0000\u0000"+
		"\u016c\u016d\u0005+\u0000\u0000\u016d\u016e\u0005\u0007\u0000\u0000\u016e"+
		"\u0170\u0005+\u0000\u0000\u016f\u0171\u00050\u0000\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0007\u0003\u0000\u0000\u0173\u0174\u0005"+
		"+\u0000\u0000\u0174\u0175\u0005\u0003\u0000\u0000\u0175;\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005\u0016\u0000\u0000\u0177\u0178\u0005+\u0000\u0000"+
		"\u0178\u0179\u0005\u0003\u0000\u0000\u0179=\u0001\u0000\u0000\u0000\u017a"+
		"\u017c\u0005\u001c\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0005\u0016\u0000\u0000\u017e\u017f\u0005+\u0000\u0000\u017f\u0180"+
		"\u0005\u0007\u0000\u0000\u0180\u0181\u0005+\u0000\u0000\u0181\u0182\u0005"+
		"\u0003\u0000\u0000\u0182?\u0001\u0000\u0000\u0000\u0183\u0185\u0005\n"+
		"\u0000\u0000\u0184\u0186\u0005\"\u0000\u0000\u0185\u0184\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u018c\u0005+\u0000\u0000\u0188\u0189\u0005\u0007\u0000\u0000"+
		"\u0189\u018d\u0005+\u0000\u0000\u018a\u018b\u0005\u0005\u0000\u0000\u018b"+
		"\u018d\u0005+\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0190"+
		"\u00050\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0003\u0000\u0000\u0192A\u0001\u0000\u0000\u0000\u0193\u0197\u0003D\""+
		"\u0000\u0194\u0197\u0003F#\u0000\u0195\u0197\u0003H$\u0000\u0196\u0193"+
		"\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0195"+
		"\u0001\u0000\u0000\u0000\u0197C\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"4\u0000\u0000\u0199E\u0001\u0000\u0000\u0000\u019a\u019b\u0005\r\u0000"+
		"\u0000\u019b\u019c\u0005+\u0000\u0000\u019c\u019d\u00054\u0000\u0000\u019d"+
		"G\u0001\u0000\u0000\u0000\u019e\u019f\u0005\r\u0000\u0000\u019f\u01a0"+
		"\u0005\t\u0000\u0000\u01a0\u01a1\u0005+\u0000\u0000\u01a1\u01a2\u0005"+
		"4\u0000\u0000\u01a2I\u0001\u0000\u0000\u0000\u01a3\u01a6\u0003L&\u0000"+
		"\u01a4\u01a6\u0003N\'\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6K\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0005\u0011\u0000\u0000\u01a8\u01a9\u00054\u0000\u0000\u01a9M\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005\u0011\u0000\u0000\u01ab\u01ac\u0005+\u0000"+
		"\u0000\u01ac\u01ad\u00054\u0000\u0000\u01adO\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0003R)\u0000\u01afQ\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"\u0014\u0000\u0000\u01b1\u01b6\u0005+\u0000\u0000\u01b2\u01b3\u0005!\u0000"+
		"\u0000\u01b3\u01b5\u0005+\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005!\u0000\u0000\u01ba"+
		"\u01bc\u0005\b\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0005\u0003\u0000\u0000\u01beS\u0001\u0000\u0000\u0000,Wbks\u007f\u0083"+
		"\u0087\u008e\u0094\u0098\u009c\u00a5\u00ac\u00b1\u00b5\u00b8\u00be\u00c6"+
		"\u00ca\u00cf\u00d7\u00dc\u00e3\u00fb\u0104\u0114\u011e\u0126\u012d\u013f"+
		"\u014c\u0153\u015e\u0165\u0169\u0170\u017b\u0185\u018c\u018f\u0196\u01a5"+
		"\u01b6\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}