// Generated from SysML2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SysML2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, KW_ABOUT=8, KW_ACTOR=9, 
		KW_ATTRIBUTE=10, KW_CASE=11, KW_COMMENT=12, KW_DEF=13, KW_DOC=14, KW_IMPORT=15, 
		KW_ITEM=16, KW_OBJECTIVE=17, KW_PACKAGE=18, KW_PART=19, KW_PORT=20, KW_REDEFINES=21, 
		KW_REF=22, KW_SPECIALIZES=23, KW_SUBJECT=24, KW_SUBSETS=25, KW_USE=26, 
		KW_SYM_FQN=27, KW_SYM_REDEFINES=28, KW_SYM_SUBSETS=29, CONSTANT=30, TYPE=31, 
		ID=32, INTEGER=33, REAL=34, BOOL=35, STRING=36, MULTIPLICITY=37, NULL=38, 
		WS=39, NOTE=40, COMMENT_LONG=41;
	public static final int
		RULE_model = 0, RULE_element = 1, RULE_namespace = 2, RULE_sysml2_package = 3, 
		RULE_part_blk = 4, RULE_part = 5, RULE_part_def = 6, RULE_part_def_specializes = 7, 
		RULE_port = 8, RULE_port_def = 9, RULE_port_blk = 10, RULE_use_case_blk = 11, 
		RULE_use_case_def = 12, RULE_part_objective_blk = 13, RULE_objective_def = 14, 
		RULE_feature = 15, RULE_feature_attribute_def = 16, RULE_feature_attribute_redefines = 17, 
		RULE_feature_part_specializes = 18, RULE_feature_part_specializes_subsets = 19, 
		RULE_feature_item_def = 20, RULE_feature_item_ref = 21, RULE_feature_actor_specializes = 22, 
		RULE_comment = 23, RULE_comment_unnamed = 24, RULE_comment_named = 25, 
		RULE_comment_named_about = 26, RULE_doc = 27, RULE_doc_unnamed = 28, RULE_doc_named = 29, 
		RULE_statement = 30, RULE_import_package = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "element", "namespace", "sysml2_package", "part_blk", "part", 
			"part_def", "part_def_specializes", "port", "port_def", "port_blk", "use_case_blk", 
			"use_case_def", "part_objective_blk", "objective_def", "feature", "feature_attribute_def", 
			"feature_attribute_redefines", "feature_part_specializes", "feature_part_specializes_subsets", 
			"feature_item_def", "feature_item_ref", "feature_actor_specializes", 
			"comment", "comment_unnamed", "comment_named", "comment_named_about", 
			"doc", "doc_unnamed", "doc_named", "statement", "import_package"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "','", "':'", "'='", "'*'", "'about'", "'actor'", 
			"'attribute'", "'case'", "'comment'", "'def'", "'doc'", "'import'", "'item'", 
			"'objective'", "'package'", "'part'", "'port'", "'redefines'", "'ref'", 
			"'specializes'", "'subject'", "'subsets'", "'use'", "'::'", "':>>'", 
			"':>'", null, null, null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "KW_ABOUT", "KW_ACTOR", 
			"KW_ATTRIBUTE", "KW_CASE", "KW_COMMENT", "KW_DEF", "KW_DOC", "KW_IMPORT", 
			"KW_ITEM", "KW_OBJECTIVE", "KW_PACKAGE", "KW_PART", "KW_PORT", "KW_REDEFINES", 
			"KW_REF", "KW_SPECIALIZES", "KW_SUBJECT", "KW_SUBSETS", "KW_USE", "KW_SYM_FQN", 
			"KW_SYM_REDEFINES", "KW_SYM_SUBSETS", "CONSTANT", "TYPE", "ID", "INTEGER", 
			"REAL", "BOOL", "STRING", "MULTIPLICITY", "NULL", "WS", "NOTE", "COMMENT_LONG"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199096514048L) != 0)) {
				{
				{
				setState(64);
				element();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				namespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				feature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				comment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				doc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
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
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				sysml2_package();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				part();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				use_case_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				doc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterSysml2_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitSysml2_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitSysml2_package(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sysml2_packageContext sysml2_package() throws RecognitionException {
		Sysml2_packageContext _localctx = new Sysml2_packageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sysml2_package);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(KW_PACKAGE);
			setState(89);
			match(ID);
			setState(90);
			match(T__0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199096481280L) != 0)) {
				{
				{
				setState(91);
				namespace();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
		public Part_def_specializesContext part_def_specializes() {
			return getRuleContext(Part_def_specializesContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public Part_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_blk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPart_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPart_blk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPart_blk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part_blkContext part_blk() throws RecognitionException {
		Part_blkContext _localctx = new Part_blkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_part_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(99);
				feature();
				}
				break;
			case 2:
				{
				setState(100);
				comment();
				}
				break;
			case 3:
				{
				setState(101);
				doc();
				}
				break;
			case 4:
				{
				setState(102);
				part_def_specializes();
				}
				break;
			case 5:
				{
				setState(103);
				port();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				part_def();
				}
				break;
			case 2:
				{
				setState(107);
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
		public TerminalNode KW_DEF() { return getToken(SysML2Parser.KW_DEF, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPart_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPart_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPart_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part_defContext part_def() throws RecognitionException {
		Part_defContext _localctx = new Part_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_part_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				{
				setState(110);
				match(KW_PART);
				setState(111);
				match(KW_DEF);
				setState(112);
				match(ID);
				setState(113);
				match(T__0);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199029110272L) != 0)) {
					{
					{
					setState(114);
					part_blk();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(T__1);
				}
				}
				break;
			case 2:
				{
				{
				setState(121);
				match(KW_PART);
				setState(122);
				match(KW_DEF);
				setState(123);
				match(ID);
				setState(124);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPart_def_specializes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPart_def_specializes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPart_def_specializes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part_def_specializesContext part_def_specializes() throws RecognitionException {
		Part_def_specializesContext _localctx = new Part_def_specializesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_part_def_specializes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(KW_PART);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEF) {
				{
				setState(128);
				match(KW_DEF);
				}
			}

			setState(131);
			match(ID);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==KW_SPECIALIZES || _la==KW_SYM_SUBSETS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(ID);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(134);
					match(T__3);
					setState(135);
					match(ID);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(141);
				match(T__0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199029110272L) != 0)) {
					{
					{
					setState(142);
					part_blk();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__1);
				}
				break;
			case T__2:
				{
				setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PORT:
				{
				setState(152);
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
				setState(153);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPort_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPort_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPort_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_defContext port_def() throws RecognitionException {
		Port_defContext _localctx = new Port_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_port_def);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(KW_PORT);
				setState(157);
				match(ID);
				setState(158);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(159);
				match(KW_PORT);
				setState(160);
				match(ID);
				setState(161);
				match(T__0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199028061696L) != 0)) {
					{
					{
					setState(162);
					port_blk();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPort_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPort_blk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPort_blk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_blkContext port_blk() throws RecognitionException {
		Port_blkContext _localctx = new Port_blkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_port_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_ITEM:
			case KW_PART:
			case KW_REF:
				{
				setState(171);
				feature();
				}
				break;
			case KW_COMMENT:
			case COMMENT_LONG:
				{
				setState(172);
				comment();
				}
				break;
			case KW_DOC:
				{
				setState(173);
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
		public Use_case_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_case_blk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterUse_case_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitUse_case_blk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitUse_case_blk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_case_blkContext use_case_blk() throws RecognitionException {
		Use_case_blkContext _localctx = new Use_case_blkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_use_case_blk);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTOR:
			case KW_ATTRIBUTE:
			case KW_COMMENT:
			case KW_DOC:
			case KW_ITEM:
			case KW_PART:
			case KW_PORT:
			case KW_REF:
			case COMMENT_LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				part_blk();
				}
				break;
			case KW_OBJECTIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				objective_def();
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
		public TerminalNode KW_DEF() { return getToken(SysML2Parser.KW_DEF, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterUse_case_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitUse_case_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitUse_case_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_case_defContext use_case_def() throws RecognitionException {
		Use_case_defContext _localctx = new Use_case_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_use_case_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(KW_USE);
			setState(181);
			match(KW_CASE);
			setState(182);
			match(KW_DEF);
			setState(183);
			match(ID);
			setState(184);
			match(T__0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199029241344L) != 0)) {
				{
				{
				setState(185);
				use_case_blk();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterPart_objective_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitPart_objective_blk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitPart_objective_blk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part_objective_blkContext part_objective_blk() throws RecognitionException {
		Part_objective_blkContext _localctx = new Part_objective_blkContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_part_objective_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterObjective_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitObjective_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitObjective_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Objective_defContext objective_def() throws RecognitionException {
		Objective_defContext _localctx = new Objective_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objective_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(KW_OBJECTIVE);
			setState(196);
			match(T__0);
			setState(197);
			part_objective_blk();
			setState(198);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_feature);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				feature_attribute_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				feature_attribute_redefines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				feature_part_specializes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				feature_part_specializes_subsets();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				feature_item_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				feature_item_ref();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
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
	public static class Feature_attribute_defContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(SysML2Parser.KW_ATTRIBUTE, 0); }
		public TerminalNode ID() { return getToken(SysML2Parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(SysML2Parser.TYPE, 0); }
		public Feature_attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_attribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_attribute_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_attribute_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_attribute_defContext feature_attribute_def() throws RecognitionException {
		Feature_attribute_defContext _localctx = new Feature_attribute_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_feature_attribute_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(KW_ATTRIBUTE);
			setState(210);
			match(ID);
			setState(211);
			match(T__4);
			setState(212);
			match(TYPE);
			setState(213);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_attribute_redefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_attribute_redefines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_attribute_redefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_attribute_redefinesContext feature_attribute_redefines() throws RecognitionException {
		Feature_attribute_redefinesContext _localctx = new Feature_attribute_redefinesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_feature_attribute_redefines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(KW_ATTRIBUTE);
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 807403520L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(ID);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(218);
				match(T__4);
				setState(219);
				match(TYPE);
				}
			}

			setState(222);
			match(T__5);
			setState(223);
			match(CONSTANT);
			setState(224);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_part_specializes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_part_specializes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_part_specializes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_part_specializesContext feature_part_specializes() throws RecognitionException {
		Feature_part_specializesContext _localctx = new Feature_part_specializesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_feature_part_specializes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(KW_PART);
			setState(227);
			match(ID);
			setState(228);
			match(T__4);
			setState(229);
			match(ID);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(230);
				match(MULTIPLICITY);
				}
			}

			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(233);
				match(T__2);
				}
				break;
			case T__0:
				{
				setState(234);
				match(T__0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199029110272L) != 0)) {
					{
					{
					setState(235);
					part_blk();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_part_specializes_subsets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_part_specializes_subsets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_part_specializes_subsets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_part_specializes_subsetsContext feature_part_specializes_subsets() throws RecognitionException {
		Feature_part_specializes_subsetsContext _localctx = new Feature_part_specializes_subsetsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_feature_part_specializes_subsets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(KW_PART);
			setState(245);
			match(ID);
			setState(246);
			match(T__4);
			setState(247);
			match(ID);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(248);
				match(MULTIPLICITY);
				}
			}

			setState(251);
			_la = _input.LA(1);
			if ( !(_la==KW_SUBSETS || _la==KW_SYM_SUBSETS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			match(ID);
			setState(253);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_item_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_item_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_item_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_item_defContext feature_item_def() throws RecognitionException {
		Feature_item_defContext _localctx = new Feature_item_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_feature_item_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(KW_ITEM);
			setState(256);
			match(ID);
			setState(257);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_item_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_item_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_item_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_item_refContext feature_item_ref() throws RecognitionException {
		Feature_item_refContext _localctx = new Feature_item_refContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_feature_item_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_REF) {
				{
				setState(259);
				match(KW_REF);
				}
			}

			setState(262);
			match(KW_ITEM);
			setState(263);
			match(ID);
			setState(264);
			match(T__4);
			setState(265);
			match(ID);
			setState(266);
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
		public TerminalNode MULTIPLICITY() { return getToken(SysML2Parser.MULTIPLICITY, 0); }
		public Feature_actor_specializesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_actor_specializes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterFeature_actor_specializes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitFeature_actor_specializes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitFeature_actor_specializes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_actor_specializesContext feature_actor_specializes() throws RecognitionException {
		Feature_actor_specializesContext _localctx = new Feature_actor_specializesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_feature_actor_specializes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(KW_ACTOR);
			setState(269);
			match(ID);
			setState(270);
			match(T__4);
			setState(271);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICITY) {
				{
				setState(272);
				match(MULTIPLICITY);
				}
			}

			setState(275);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comment);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				comment_unnamed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				comment_named();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterComment_unnamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitComment_unnamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitComment_unnamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_unnamedContext comment_unnamed() throws RecognitionException {
		Comment_unnamedContext _localctx = new Comment_unnamedContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comment_unnamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterComment_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitComment_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitComment_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_namedContext comment_named() throws RecognitionException {
		Comment_namedContext _localctx = new Comment_namedContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comment_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(KW_COMMENT);
			setState(285);
			match(ID);
			setState(286);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterComment_named_about(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitComment_named_about(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitComment_named_about(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_named_aboutContext comment_named_about() throws RecognitionException {
		Comment_named_aboutContext _localctx = new Comment_named_aboutContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comment_named_about);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(KW_COMMENT);
			setState(289);
			match(KW_ABOUT);
			setState(290);
			match(ID);
			setState(291);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doc);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				doc_unnamed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterDoc_unnamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitDoc_unnamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitDoc_unnamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Doc_unnamedContext doc_unnamed() throws RecognitionException {
		Doc_unnamedContext _localctx = new Doc_unnamedContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doc_unnamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(KW_DOC);
			setState(298);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterDoc_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitDoc_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitDoc_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Doc_namedContext doc_named() throws RecognitionException {
		Doc_namedContext _localctx = new Doc_namedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_doc_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(KW_DOC);
			setState(301);
			match(ID);
			setState(302);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).enterImport_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SysML2Listener ) ((SysML2Listener)listener).exitImport_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SysML2Visitor ) return ((SysML2Visitor<? extends T>)visitor).visitImport_package(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_packageContext import_package() throws RecognitionException {
		Import_packageContext _localctx = new Import_packageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_import_package);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(KW_IMPORT);
			setState(307);
			match(ID);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(KW_SYM_FQN);
					setState(309);
					match(ID);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SYM_FQN) {
				{
				setState(315);
				match(KW_SYM_FQN);
				setState(316);
				match(T__6);
				}
			}

			setState(319);
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
		"\u0004\u0001)\u0142\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"]\b\u0003\n\u0003\f\u0003`\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006"+
		"w\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006~\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0089\b\u0007\n\u0007\f\u0007\u008c\t\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0090\b\u0007\n\u0007\f\u0007\u0093\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0097\b\u0007\u0001\b\u0001\b\u0003\b\u009b\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a4\b\t\n\t\f\t\u00a7"+
		"\t\t\u0001\t\u0003\t\u00aa\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00af\b"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u00b3\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bb\b\f\n\f\f\f\u00be\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00d0\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00e8\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00ed\b\u0012\n\u0012\f\u0012\u00f0\t\u0012\u0001"+
		"\u0012\u0003\u0012\u00f3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00fa\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0003\u0015\u0105\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0112\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0119\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0128\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0137\b\u001f\n\u001f\f\u001f"+
		"\u013a\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013e\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u008a\u0000 \u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>\u0000\u0003\u0002\u0000\u0017\u0017\u001d\u001d\u0002\u0000\u0015"+
		"\u0015\u001c\u001d\u0002\u0000\u0019\u0019\u001d\u001d\u0151\u0000C\u0001"+
		"\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000"+
		"\u0000\u0006X\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\nl\u0001"+
		"\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000"+
		"\u0000\u0000\u0010\u009a\u0001\u0000\u0000\u0000\u0012\u00a9\u0001\u0000"+
		"\u0000\u0000\u0014\u00ae\u0001\u0000\u0000\u0000\u0016\u00b2\u0001\u0000"+
		"\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000"+
		"\u0000\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000"+
		"\u0000\u0000 \u00d1\u0001\u0000\u0000\u0000\"\u00d7\u0001\u0000\u0000"+
		"\u0000$\u00e2\u0001\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000("+
		"\u00ff\u0001\u0000\u0000\u0000*\u0104\u0001\u0000\u0000\u0000,\u010c\u0001"+
		"\u0000\u0000\u0000.\u0118\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000"+
		"\u00002\u011c\u0001\u0000\u0000\u00004\u0120\u0001\u0000\u0000\u00006"+
		"\u0127\u0001\u0000\u0000\u00008\u0129\u0001\u0000\u0000\u0000:\u012c\u0001"+
		"\u0000\u0000\u0000<\u0130\u0001\u0000\u0000\u0000>\u0132\u0001\u0000\u0000"+
		"\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0000\u0000\u0001"+
		"G\u0001\u0001\u0000\u0000\u0000HO\u0003\u0004\u0002\u0000IO\u0003\u001e"+
		"\u000f\u0000JO\u0003.\u0017\u0000KO\u00036\u001b\u0000LO\u0003<\u001e"+
		"\u0000MO\u0003\u0010\b\u0000NH\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000"+
		"\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0003\u0001\u0000\u0000\u0000"+
		"PW\u0003\u0006\u0003\u0000QW\u0003\n\u0005\u0000RW\u0003\u0018\f\u0000"+
		"SW\u0003.\u0017\u0000TW\u00036\u001b\u0000UW\u0003\u0010\b\u0000VP\u0001"+
		"\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000"+
		"VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u0012\u0000\u0000YZ\u0005"+
		" \u0000\u0000Z^\u0005\u0001\u0000\u0000[]\u0003\u0004\u0002\u0000\\[\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0002\u0000\u0000b\u0007\u0001\u0000\u0000\u0000ci\u0003"+
		"\u001e\u000f\u0000di\u0003.\u0017\u0000ei\u00036\u001b\u0000fi\u0003\u000e"+
		"\u0007\u0000gi\u0003\u0010\b\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000"+
		"\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000i\t\u0001\u0000\u0000\u0000jm\u0003\f\u0006\u0000km"+
		"\u0003\u000e\u0007\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u0013\u0000\u0000op\u0005"+
		"\r\u0000\u0000pq\u0005 \u0000\u0000qu\u0005\u0001\u0000\u0000rt\u0003"+
		"\b\u0004\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000x~\u0005\u0002\u0000\u0000yz\u0005\u0013\u0000"+
		"\u0000z{\u0005\r\u0000\u0000{|\u0005 \u0000\u0000|~\u0005\u0003\u0000"+
		"\u0000}n\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000~\r\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0005\u0013\u0000\u0000\u0080\u0082\u0005\r\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005 \u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u008a\u0005 \u0000\u0000\u0086"+
		"\u0087\u0005\u0004\u0000\u0000\u0087\u0089\u0005 \u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0096"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0091"+
		"\u0005\u0001\u0000\u0000\u008e\u0090\u0003\b\u0004\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0005"+
		"\u0002\u0000\u0000\u0095\u0097\u0005\u0003\u0000\u0000\u0096\u008d\u0001"+
		"\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u000f\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0003\u0012\t\u0000\u0099\u009b\u0003\u0014"+
		"\n\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0014\u0000"+
		"\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u00aa\u0005\u0003\u0000\u0000"+
		"\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1"+
		"\u00a5\u0005\u0001\u0000\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0005\u0002\u0000\u0000\u00a9\u009c\u0001\u0000\u0000\u0000\u00a9\u009f"+
		"\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00af"+
		"\u0003\u001e\u000f\u0000\u00ac\u00af\u0003.\u0017\u0000\u00ad\u00af\u0003"+
		"6\u001b\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u0015\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0003\b\u0004\u0000\u00b1\u00b3\u0003\u001c\u000e"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u0017\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001a\u0000"+
		"\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7\u0005\r\u0000\u0000"+
		"\u00b7\u00b8\u0005 \u0000\u0000\u00b8\u00bc\u0005\u0001\u0000\u0000\u00b9"+
		"\u00bb\u0003\u0016\u000b\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000\u00c0"+
		"\u0019\u0001\u0000\u0000\u0000\u00c1\u00c2\u00036\u001b\u0000\u00c2\u001b"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0001\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6\u00c7\u0005"+
		"\u0002\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00d0\u0003"+
		" \u0010\u0000\u00c9\u00d0\u0003\"\u0011\u0000\u00ca\u00d0\u0003$\u0012"+
		"\u0000\u00cb\u00d0\u0003&\u0013\u0000\u00cc\u00d0\u0003(\u0014\u0000\u00cd"+
		"\u00d0\u0003*\u0015\u0000\u00ce\u00d0\u0003,\u0016\u0000\u00cf\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\n\u0000\u0000\u00d2\u00d3\u0005 \u0000\u0000\u00d3\u00d4\u0005\u0005"+
		"\u0000\u0000\u00d4\u00d5\u0005\u001f\u0000\u0000\u00d5\u00d6\u0005\u0003"+
		"\u0000\u0000\u00d6!\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\n\u0000"+
		"\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9\u00dc\u0005 \u0000\u0000"+
		"\u00da\u00db\u0005\u0005\u0000\u0000\u00db\u00dd\u0005\u001f\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0006\u0000\u0000"+
		"\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000"+
		"\u00e1#\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0013\u0000\u0000\u00e3"+
		"\u00e4\u0005 \u0000\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e7"+
		"\u0005 \u0000\u0000\u00e6\u00e8\u0005%\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00f2\u0001\u0000"+
		"\u0000\u0000\u00e9\u00f3\u0005\u0003\u0000\u0000\u00ea\u00ee\u0005\u0001"+
		"\u0000\u0000\u00eb\u00ed\u0003\b\u0004\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005\u0002\u0000"+
		"\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f3%\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0013\u0000\u0000"+
		"\u00f5\u00f6\u0005 \u0000\u0000\u00f6\u00f7\u0005\u0005\u0000\u0000\u00f7"+
		"\u00f9\u0005 \u0000\u0000\u00f8\u00fa\u0005%\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0007\u0002\u0000\u0000\u00fc\u00fd\u0005"+
		" \u0000\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe\'\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u0010\u0000\u0000\u0100\u0101\u0005 \u0000"+
		"\u0000\u0101\u0102\u0005\u0003\u0000\u0000\u0102)\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0005\u0016\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0010\u0000\u0000\u0107\u0108\u0005 \u0000\u0000\u0108"+
		"\u0109\u0005\u0005\u0000\u0000\u0109\u010a\u0005 \u0000\u0000\u010a\u010b"+
		"\u0005\u0003\u0000\u0000\u010b+\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"\t\u0000\u0000\u010d\u010e\u0005 \u0000\u0000\u010e\u010f\u0005\u0005"+
		"\u0000\u0000\u010f\u0111\u0005 \u0000\u0000\u0110\u0112\u0005%\u0000\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000"+
		"\u0114-\u0001\u0000\u0000\u0000\u0115\u0119\u00030\u0018\u0000\u0116\u0119"+
		"\u00032\u0019\u0000\u0117\u0119\u00034\u001a\u0000\u0118\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119/\u0001\u0000\u0000\u0000\u011a\u011b\u0005)\u0000\u0000"+
		"\u011b1\u0001\u0000\u0000\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d"+
		"\u011e\u0005 \u0000\u0000\u011e\u011f\u0005)\u0000\u0000\u011f3\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005\f\u0000\u0000\u0121\u0122\u0005\b"+
		"\u0000\u0000\u0122\u0123\u0005 \u0000\u0000\u0123\u0124\u0005)\u0000\u0000"+
		"\u01245\u0001\u0000\u0000\u0000\u0125\u0128\u00038\u001c\u0000\u0126\u0128"+
		"\u0003:\u001d\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u01287\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u000e"+
		"\u0000\u0000\u012a\u012b\u0005)\u0000\u0000\u012b9\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u000e\u0000\u0000\u012d\u012e\u0005 \u0000\u0000\u012e"+
		"\u012f\u0005)\u0000\u0000\u012f;\u0001\u0000\u0000\u0000\u0130\u0131\u0003"+
		">\u001f\u0000\u0131=\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u000f\u0000"+
		"\u0000\u0133\u0138\u0005 \u0000\u0000\u0134\u0135\u0005\u001b\u0000\u0000"+
		"\u0135\u0137\u0005 \u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013d\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001b\u0000\u0000\u013c"+
		"\u013e\u0005\u0007\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\u0003\u0000\u0000\u0140?\u0001\u0000\u0000\u0000\u001eCN"+
		"V^hlu}\u0081\u008a\u0091\u0096\u009a\u00a5\u00a9\u00ae\u00b2\u00bc\u00cf"+
		"\u00dc\u00e7\u00ee\u00f2\u00f9\u0104\u0111\u0118\u0127\u0138\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}