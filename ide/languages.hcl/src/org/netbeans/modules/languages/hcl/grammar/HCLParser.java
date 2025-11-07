// Generated from HCLParser.g4 by ANTLR 4.13.1
package org.netbeans.modules.languages.hcl.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HCLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK_COMMENT=1, LINE_COMMENT=2, FOR=3, IF=4, IN=5, HEREDOC_START=6, EQUALS=7, 
		RARROW=8, EQUAL=9, LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, LPAREN=14, 
		RPAREN=15, QUESTION=16, SCOPE=17, COLON=18, GTE=19, GT=20, LTE=21, LT=22, 
		NOT_EQUALS=23, NOT=24, COMMA=25, ELLIPSIS=26, LEGACY_INDEX=27, DOT=28, 
		PLUS=29, MINUS=30, STAR=31, SLASH=32, PERCENT=33, AND=34, OR=35, TRUE=36, 
		FALSE=37, NULL=38, NUMERIC_LIT=39, QUOTE=40, IDENTIFIER=41, WS=42, NL=43, 
		ERRCHAR=44, INTERPOLATION_START=45, TEMPLATE_START=46, STRING_CONTENT=47, 
		STRING_ERR=48, INTERPOLATION_END=49, INTERPOLATION_CONTENT=50, TEMPLATE_END=51, 
		TEMPLATE_CONTENT=52, HEREDOC_END=53, HEREDOC_CONTENT=54;
	public static final int
		RULE_configFile = 0, RULE_body = 1, RULE_attribute = 2, RULE_block = 3, 
		RULE_expression = 4, RULE_exprTerm = 5, RULE_literalValue = 6, RULE_collectionValue = 7, 
		RULE_tuple = 8, RULE_object = 9, RULE_objectElem = 10, RULE_templateExpr = 11, 
		RULE_stringLit = 12, RULE_quotedTemplate = 13, RULE_stringContent = 14, 
		RULE_interpolationContent = 15, RULE_interpolation = 16, RULE_templateContent = 17, 
		RULE_template = 18, RULE_heredocContent = 19, RULE_heredocTemplate = 20, 
		RULE_heredoc = 21, RULE_scopedId = 22, RULE_variableExpr = 23, RULE_functionCall = 24, 
		RULE_arguments = 25, RULE_forExpr = 26, RULE_forTupleExpr = 27, RULE_forObjectExpr = 28, 
		RULE_forIntro = 29, RULE_forCond = 30, RULE_index = 31, RULE_getAttr = 32, 
		RULE_splat = 33, RULE_attrSplat = 34, RULE_fullSplat = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"configFile", "body", "attribute", "block", "expression", "exprTerm", 
			"literalValue", "collectionValue", "tuple", "object", "objectElem", "templateExpr", 
			"stringLit", "quotedTemplate", "stringContent", "interpolationContent", 
			"interpolation", "templateContent", "template", "heredocContent", "heredocTemplate", 
			"heredoc", "scopedId", "variableExpr", "functionCall", "arguments", "forExpr", 
			"forTupleExpr", "forObjectExpr", "forIntro", "forCond", "index", "getAttr", 
			"splat", "attrSplat", "fullSplat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'for'", "'if'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLOCK_COMMENT", "LINE_COMMENT", "FOR", "IF", "IN", "HEREDOC_START", 
			"EQUALS", "RARROW", "EQUAL", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"LPAREN", "RPAREN", "QUESTION", "SCOPE", "COLON", "GTE", "GT", "LTE", 
			"LT", "NOT_EQUALS", "NOT", "COMMA", "ELLIPSIS", "LEGACY_INDEX", "DOT", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "AND", "OR", "TRUE", "FALSE", 
			"NULL", "NUMERIC_LIT", "QUOTE", "IDENTIFIER", "WS", "NL", "ERRCHAR", 
			"INTERPOLATION_START", "TEMPLATE_START", "STRING_CONTENT", "STRING_ERR", 
			"INTERPOLATION_END", "INTERPOLATION_CONTENT", "TEMPLATE_END", "TEMPLATE_CONTENT", 
			"HEREDOC_END", "HEREDOC_CONTENT"
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
	public String getGrammarFileName() { return "HCLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HCLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigFileContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HCLParser.EOF, 0); }
		public ConfigFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterConfigFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitConfigFile(this);
		}
	}

	public final ConfigFileContext configFile() throws RecognitionException {
		ConfigFileContext _localctx = new ConfigFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_configFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			body();
			setState(73);
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
	public static class BodyContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(75);
					attribute();
					}
					break;
				case 2:
					{
					setState(76);
					block();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HCLParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(HCLParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(EQUAL);
			setState(84);
			expression(0);
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
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HCLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HCLParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(HCLParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HCLParser.RBRACE, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUOTE || _la==IDENTIFIER) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTE:
					{
					setState(87);
					stringLit();
					}
					break;
				case IDENTIFIER:
					{
					setState(88);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(LBRACE);
			setState(95);
			body();
			setState(96);
			match(RBRACE);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public ExpressionContext exprCond;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext exprTrue;
		public ExpressionContext exprFalse;
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(HCLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(HCLParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(HCLParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(HCLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HCLParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(HCLParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(HCLParser.AND, 0); }
		public TerminalNode OR() { return getToken(HCLParser.OR, 0); }
		public TerminalNode LTE() { return getToken(HCLParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(HCLParser.GTE, 0); }
		public TerminalNode LT() { return getToken(HCLParser.LT, 0); }
		public TerminalNode GT() { return getToken(HCLParser.GT, 0); }
		public TerminalNode EQUALS() { return getToken(HCLParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(HCLParser.NOT_EQUALS, 0); }
		public TerminalNode QUESTION() { return getToken(HCLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(HCLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEREDOC_START:
			case LBRACE:
			case LBRACK:
			case LPAREN:
			case TRUE:
			case FALSE:
			case NULL:
			case NUMERIC_LIT:
			case QUOTE:
			case IDENTIFIER:
				{
				setState(99);
				exprTerm(0);
				}
				break;
			case NOT:
			case MINUS:
				{
				setState(100);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				((ExpressionContext)_localctx).right = expression(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						((ExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16253056L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exprCond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						((ExpressionContext)_localctx).op = match(QUESTION);
						{
						setState(118);
						((ExpressionContext)_localctx).exprTrue = expression(0);
						setState(119);
						match(COLON);
						setState(120);
						((ExpressionContext)_localctx).exprFalse = expression(0);
						}
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HCLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HCLParser.RPAREN, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CollectionValueContext collectionValue() {
			return getRuleContext(CollectionValueContext.class,0);
		}
		public TemplateExprContext templateExpr() {
			return getRuleContext(TemplateExprContext.class,0);
		}
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public GetAttrContext getAttr() {
			return getRuleContext(GetAttrContext.class,0);
		}
		public SplatContext splat() {
			return getRuleContext(SplatContext.class,0);
		}
		public ExprTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitExprTerm(this);
		}
	}

	public final ExprTermContext exprTerm() throws RecognitionException {
		return exprTerm(0);
	}

	private ExprTermContext exprTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprTermContext _localctx = new ExprTermContext(_ctx, _parentState);
		ExprTermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exprTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(128);
				match(LPAREN);
				setState(129);
				expression(0);
				setState(130);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(132);
				literalValue();
				}
				break;
			case 3:
				{
				setState(133);
				collectionValue();
				}
				break;
			case 4:
				{
				setState(134);
				templateExpr();
				}
				break;
			case 5:
				{
				setState(135);
				variableExpr();
				}
				break;
			case 6:
				{
				setState(136);
				functionCall();
				}
				break;
			case 7:
				{
				setState(137);
				forExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprTermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprTerm);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						index();
						}
						break;
					case 2:
						{
						_localctx = new ExprTermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprTerm);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						getAttr();
						}
						break;
					case 3:
						{
						_localctx = new ExprTermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprTerm);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						splat();
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode NUMERIC_LIT() { return getToken(HCLParser.NUMERIC_LIT, 0); }
		public TerminalNode TRUE() { return getToken(HCLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HCLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(HCLParser.NULL, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literalValue);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				stringLit();
				}
				break;
			case NUMERIC_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(NUMERIC_LIT);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(NULL);
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
	public static class CollectionValueContext extends ParserRuleContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public CollectionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterCollectionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitCollectionValue(this);
		}
	}

	public final CollectionValueContext collectionValue() throws RecognitionException {
		CollectionValueContext _localctx = new CollectionValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collectionValue);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				tuple();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				object();
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
	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(HCLParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(HCLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HCLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HCLParser.COMMA, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			int _alt;
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(LBRACK);
				setState(163);
				expression(0);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						match(COMMA);
						setState(165);
						expression(0);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(171);
					match(COMMA);
					}
				}

				setState(174);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(LBRACK);
				setState(177);
				match(RBRACK);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HCLParser.LBRACE, 0); }
		public List<ObjectElemContext> objectElem() {
			return getRuleContexts(ObjectElemContext.class);
		}
		public ObjectElemContext objectElem(int i) {
			return getRuleContext(ObjectElemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(HCLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HCLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HCLParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_object);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(LBRACE);
				setState(181);
				objectElem();
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(182);
							match(COMMA);
							}
						}

						setState(185);
						objectElem();
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191);
					match(COMMA);
					}
				}

				setState(194);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(LBRACE);
				setState(197);
				match(RBRACE);
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
	public static class ObjectElemContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(HCLParser.EQUAL, 0); }
		public TerminalNode COLON() { return getToken(HCLParser.COLON, 0); }
		public ObjectElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterObjectElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitObjectElem(this);
		}
	}

	public final ObjectElemContext objectElem() throws RecognitionException {
		ObjectElemContext _localctx = new ObjectElemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((ObjectElemContext)_localctx).key = expression(0);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			((ObjectElemContext)_localctx).value = expression(0);
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
	public static class TemplateExprContext extends ParserRuleContext {
		public QuotedTemplateContext quotedTemplate() {
			return getRuleContext(QuotedTemplateContext.class,0);
		}
		public HeredocContext heredoc() {
			return getRuleContext(HeredocContext.class,0);
		}
		public TemplateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterTemplateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitTemplateExpr(this);
		}
	}

	public final TemplateExprContext templateExpr() throws RecognitionException {
		TemplateExprContext _localctx = new TemplateExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_templateExpr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				quotedTemplate();
				}
				break;
			case HEREDOC_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				heredoc();
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
	public static class StringLitContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(HCLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HCLParser.QUOTE, i);
		}
		public StringContentContext stringContent() {
			return getRuleContext(StringContentContext.class,0);
		}
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitStringLit(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringLit);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(QUOTE);
				setState(209);
				match(QUOTE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(QUOTE);
				setState(211);
				stringContent();
				setState(212);
				match(QUOTE);
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
	public static class QuotedTemplateContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(HCLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HCLParser.QUOTE, i);
		}
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public QuotedTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterQuotedTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitQuotedTemplate(this);
		}
	}

	public final QuotedTemplateContext quotedTemplate() throws RecognitionException {
		QuotedTemplateContext _localctx = new QuotedTemplateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_quotedTemplate);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(QUOTE);
				setState(217);
				match(QUOTE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(QUOTE);
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(222);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING_CONTENT:
						{
						setState(219);
						stringContent();
						}
						break;
					case INTERPOLATION_START:
						{
						setState(220);
						interpolation();
						}
						break;
					case TEMPLATE_START:
						{
						setState(221);
						template();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0) );
				setState(226);
				match(QUOTE);
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
	public static class StringContentContext extends ParserRuleContext {
		public List<TerminalNode> STRING_CONTENT() { return getTokens(HCLParser.STRING_CONTENT); }
		public TerminalNode STRING_CONTENT(int i) {
			return getToken(HCLParser.STRING_CONTENT, i);
		}
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitStringContent(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					match(STRING_CONTENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class InterpolationContentContext extends ParserRuleContext {
		public List<TerminalNode> INTERPOLATION_CONTENT() { return getTokens(HCLParser.INTERPOLATION_CONTENT); }
		public TerminalNode INTERPOLATION_CONTENT(int i) {
			return getToken(HCLParser.INTERPOLATION_CONTENT, i);
		}
		public InterpolationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterInterpolationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitInterpolationContent(this);
		}
	}

	public final InterpolationContentContext interpolationContent() throws RecognitionException {
		InterpolationContentContext _localctx = new InterpolationContentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interpolationContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(235);
					match(INTERPOLATION_CONTENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(238); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(HCLParser.INTERPOLATION_START, 0); }
		public TerminalNode INTERPOLATION_END() { return getToken(HCLParser.INTERPOLATION_END, 0); }
		public List<InterpolationContentContext> interpolationContent() {
			return getRuleContexts(InterpolationContentContext.class);
		}
		public InterpolationContentContext interpolationContent(int i) {
			return getRuleContext(InterpolationContentContext.class,i);
		}
		public List<QuotedTemplateContext> quotedTemplate() {
			return getRuleContexts(QuotedTemplateContext.class);
		}
		public QuotedTemplateContext quotedTemplate(int i) {
			return getRuleContext(QuotedTemplateContext.class,i);
		}
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitInterpolation(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(INTERPOLATION_START);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUOTE || _la==INTERPOLATION_CONTENT) {
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERPOLATION_CONTENT:
					{
					setState(241);
					interpolationContent();
					}
					break;
				case QUOTE:
					{
					setState(242);
					quotedTemplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(INTERPOLATION_END);
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
	public static class TemplateContentContext extends ParserRuleContext {
		public List<TerminalNode> TEMPLATE_CONTENT() { return getTokens(HCLParser.TEMPLATE_CONTENT); }
		public TerminalNode TEMPLATE_CONTENT(int i) {
			return getToken(HCLParser.TEMPLATE_CONTENT, i);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitTemplateContent(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_templateContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					match(TEMPLATE_CONTENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_START() { return getToken(HCLParser.TEMPLATE_START, 0); }
		public TerminalNode TEMPLATE_END() { return getToken(HCLParser.TEMPLATE_END, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public List<QuotedTemplateContext> quotedTemplate() {
			return getRuleContexts(QuotedTemplateContext.class);
		}
		public QuotedTemplateContext quotedTemplate(int i) {
			return getRuleContext(QuotedTemplateContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TEMPLATE_START);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUOTE || _la==TEMPLATE_CONTENT) {
				{
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEMPLATE_CONTENT:
					{
					setState(256);
					templateContent();
					}
					break;
				case QUOTE:
					{
					setState(257);
					quotedTemplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(TEMPLATE_END);
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
	public static class HeredocContentContext extends ParserRuleContext {
		public List<TerminalNode> HEREDOC_CONTENT() { return getTokens(HCLParser.HEREDOC_CONTENT); }
		public TerminalNode HEREDOC_CONTENT(int i) {
			return getToken(HCLParser.HEREDOC_CONTENT, i);
		}
		public HeredocContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heredocContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterHeredocContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitHeredocContent(this);
		}
	}

	public final HeredocContentContext heredocContent() throws RecognitionException {
		HeredocContentContext _localctx = new HeredocContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_heredocContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(265);
					match(HEREDOC_CONTENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class HeredocTemplateContext extends ParserRuleContext {
		public List<HeredocContentContext> heredocContent() {
			return getRuleContexts(HeredocContentContext.class);
		}
		public HeredocContentContext heredocContent(int i) {
			return getRuleContext(HeredocContentContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public HeredocTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heredocTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterHeredocTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitHeredocTemplate(this);
		}
	}

	public final HeredocTemplateContext heredocTemplate() throws RecognitionException {
		HeredocTemplateContext _localctx = new HeredocTemplateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_heredocTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18119951625748480L) != 0)) {
				{
				setState(273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEREDOC_CONTENT:
					{
					setState(270);
					heredocContent();
					}
					break;
				case INTERPOLATION_START:
					{
					setState(271);
					interpolation();
					}
					break;
				case TEMPLATE_START:
					{
					setState(272);
					template();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class HeredocContext extends ParserRuleContext {
		public TerminalNode HEREDOC_START() { return getToken(HCLParser.HEREDOC_START, 0); }
		public HeredocTemplateContext heredocTemplate() {
			return getRuleContext(HeredocTemplateContext.class,0);
		}
		public TerminalNode HEREDOC_END() { return getToken(HCLParser.HEREDOC_END, 0); }
		public HeredocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heredoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterHeredoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitHeredoc(this);
		}
	}

	public final HeredocContext heredoc() throws RecognitionException {
		HeredocContext _localctx = new HeredocContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_heredoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(HEREDOC_START);
			setState(279);
			heredocTemplate();
			setState(280);
			match(HEREDOC_END);
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
	public static class ScopedIdContext extends ParserRuleContext {
		public Token target;
		public Token ref;
		public TerminalNode SCOPE() { return getToken(HCLParser.SCOPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HCLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HCLParser.IDENTIFIER, i);
		}
		public ScopedIdContext scopedId() {
			return getRuleContext(ScopedIdContext.class,0);
		}
		public ScopedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterScopedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitScopedId(this);
		}
	}

	public final ScopedIdContext scopedId() throws RecognitionException {
		return scopedId(0);
	}

	private ScopedIdContext scopedId(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ScopedIdContext _localctx = new ScopedIdContext(_ctx, _parentState);
		ScopedIdContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_scopedId, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			((ScopedIdContext)_localctx).target = match(IDENTIFIER);
			setState(284);
			match(SCOPE);
			setState(285);
			((ScopedIdContext)_localctx).ref = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ScopedIdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_scopedId);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(SCOPE);
					setState(289);
					((ScopedIdContext)_localctx).ref = match(IDENTIFIER);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HCLParser.IDENTIFIER, 0); }
		public VariableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitVariableExpr(this);
		}
	}

	public final VariableExprContext variableExpr() throws RecognitionException {
		VariableExprContext _localctx = new VariableExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(IDENTIFIER);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HCLParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HCLParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HCLParser.IDENTIFIER, 0); }
		public ScopedIdContext scopedId() {
			return getRuleContext(ScopedIdContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(297);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(298);
					scopedId(0);
					}
					break;
				}
				setState(301);
				match(LPAREN);
				setState(302);
				arguments();
				setState(303);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(305);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(306);
					scopedId(0);
					}
					break;
				}
				setState(309);
				match(LPAREN);
				setState(310);
				match(RPAREN);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HCLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HCLParser.COMMA, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(HCLParser.ELLIPSIS, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expression(0);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(COMMA);
					setState(315);
					expression(0);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==ELLIPSIS) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==ELLIPSIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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
	public static class ForExprContext extends ParserRuleContext {
		public ForTupleExprContext forTupleExpr() {
			return getRuleContext(ForTupleExprContext.class,0);
		}
		public ForObjectExprContext forObjectExpr() {
			return getRuleContext(ForObjectExprContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitForExpr(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forExpr);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				forTupleExpr();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				forObjectExpr();
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
	public static class ForTupleExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(HCLParser.LBRACK, 0); }
		public ForIntroContext forIntro() {
			return getRuleContext(ForIntroContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(HCLParser.RBRACK, 0); }
		public ForCondContext forCond() {
			return getRuleContext(ForCondContext.class,0);
		}
		public ForTupleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forTupleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterForTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitForTupleExpr(this);
		}
	}

	public final ForTupleExprContext forTupleExpr() throws RecognitionException {
		ForTupleExprContext _localctx = new ForTupleExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forTupleExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LBRACK);
			setState(329);
			forIntro();
			setState(330);
			expression(0);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(331);
				forCond();
				}
			}

			setState(334);
			match(RBRACK);
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
	public static class ForObjectExprContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode LBRACE() { return getToken(HCLParser.LBRACE, 0); }
		public ForIntroContext forIntro() {
			return getRuleContext(ForIntroContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(HCLParser.RARROW, 0); }
		public TerminalNode RBRACE() { return getToken(HCLParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELLIPSIS() { return getToken(HCLParser.ELLIPSIS, 0); }
		public ForCondContext forCond() {
			return getRuleContext(ForCondContext.class,0);
		}
		public ForObjectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forObjectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterForObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitForObjectExpr(this);
		}
	}

	public final ForObjectExprContext forObjectExpr() throws RecognitionException {
		ForObjectExprContext _localctx = new ForObjectExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forObjectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LBRACE);
			setState(337);
			forIntro();
			setState(338);
			((ForObjectExprContext)_localctx).key = expression(0);
			setState(339);
			match(RARROW);
			setState(340);
			((ForObjectExprContext)_localctx).value = expression(0);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(341);
				match(ELLIPSIS);
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(344);
				forCond();
				}
			}

			setState(347);
			match(RBRACE);
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
	public static class ForIntroContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode FOR() { return getToken(HCLParser.FOR, 0); }
		public TerminalNode IN() { return getToken(HCLParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HCLParser.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HCLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HCLParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(HCLParser.COMMA, 0); }
		public ForIntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIntro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterForIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitForIntro(this);
		}
	}

	public final ForIntroContext forIntro() throws RecognitionException {
		ForIntroContext _localctx = new ForIntroContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forIntro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(FOR);
			setState(350);
			((ForIntroContext)_localctx).first = match(IDENTIFIER);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(351);
				match(COMMA);
				setState(352);
				((ForIntroContext)_localctx).second = match(IDENTIFIER);
				}
			}

			setState(355);
			match(IN);
			setState(356);
			expression(0);
			setState(357);
			match(COLON);
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
	public static class ForCondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HCLParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitForCond(this);
		}
	}

	public final ForCondContext forCond() throws RecognitionException {
		ForCondContext _localctx = new ForCondContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IF);
			setState(360);
			expression(0);
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(HCLParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(HCLParser.RBRACK, 0); }
		public TerminalNode LEGACY_INDEX() { return getToken(HCLParser.LEGACY_INDEX, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_index);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(LBRACK);
				setState(363);
				expression(0);
				setState(364);
				match(RBRACK);
				}
				break;
			case LEGACY_INDEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(LEGACY_INDEX);
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
	public static class GetAttrContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HCLParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HCLParser.IDENTIFIER, 0); }
		public GetAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterGetAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitGetAttr(this);
		}
	}

	public final GetAttrContext getAttr() throws RecognitionException {
		GetAttrContext _localctx = new GetAttrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_getAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(DOT);
			setState(370);
			match(IDENTIFIER);
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
	public static class SplatContext extends ParserRuleContext {
		public AttrSplatContext attrSplat() {
			return getRuleContext(AttrSplatContext.class,0);
		}
		public FullSplatContext fullSplat() {
			return getRuleContext(FullSplatContext.class,0);
		}
		public SplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitSplat(this);
		}
	}

	public final SplatContext splat() throws RecognitionException {
		SplatContext _localctx = new SplatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_splat);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				attrSplat();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				fullSplat();
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
	public static class AttrSplatContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HCLParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(HCLParser.STAR, 0); }
		public List<GetAttrContext> getAttr() {
			return getRuleContexts(GetAttrContext.class);
		}
		public GetAttrContext getAttr(int i) {
			return getRuleContext(GetAttrContext.class,i);
		}
		public AttrSplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrSplat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterAttrSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitAttrSplat(this);
		}
	}

	public final AttrSplatContext attrSplat() throws RecognitionException {
		AttrSplatContext _localctx = new AttrSplatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_attrSplat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(DOT);
			setState(377);
			match(STAR);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					getAttr();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
	public static class FullSplatContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(HCLParser.LBRACK, 0); }
		public TerminalNode STAR() { return getToken(HCLParser.STAR, 0); }
		public TerminalNode RBRACK() { return getToken(HCLParser.RBRACK, 0); }
		public List<GetAttrContext> getAttr() {
			return getRuleContexts(GetAttrContext.class);
		}
		public GetAttrContext getAttr(int i) {
			return getRuleContext(GetAttrContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public FullSplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullSplat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).enterFullSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HCLParserListener ) ((HCLParserListener)listener).exitFullSplat(this);
		}
	}

	public final FullSplatContext fullSplat() throws RecognitionException {
		FullSplatContext _localctx = new FullSplatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fullSplat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LBRACK);
			setState(385);
			match(STAR);
			setState(386);
			match(RBRACK);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(389);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(387);
						getAttr();
						}
						break;
					case LBRACK:
					case LEGACY_INDEX:
						{
						setState(388);
						index();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 5:
			return exprTerm_sempred((ExprTermContext)_localctx, predIndex);
		case 22:
			return scopedId_sempred((ScopedIdContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprTerm_sempred(ExprTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean scopedId_sempred(ScopedIdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00016\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001N\b\u0001\n\u0001\f\u0001Q\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Z\b"+
		"\u0003\n\u0003\f\u0003]\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008b\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00a7\b\b\n\b\f\b\u00aa\t\b\u0001\b\u0003\b\u00ad\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00b3\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00b8\b\t\u0001\t\u0005\t\u00bb\b\t\n\t\f\t\u00be\t\t\u0001\t\u0003"+
		"\t\u00c1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c7\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00cf\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d7\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00df\b\r\u000b\r\f"+
		"\r\u00e0\u0001\r\u0001\r\u0003\r\u00e5\b\r\u0001\u000e\u0004\u000e\u00e8"+
		"\b\u000e\u000b\u000e\f\u000e\u00e9\u0001\u000f\u0004\u000f\u00ed\b\u000f"+
		"\u000b\u000f\f\u000f\u00ee\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00f4\b\u0010\n\u0010\f\u0010\u00f7\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011\u00fc\b\u0011\u000b\u0011\f\u0011\u00fd\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0103\b\u0012\n\u0012\f\u0012\u0106"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u010b\b\u0013"+
		"\u000b\u0013\f\u0013\u010c\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0112\b\u0014\n\u0014\f\u0014\u0115\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0123\b\u0016\n"+
		"\u0016\f\u0016\u0126\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u012c\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0134\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0138\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u013d\b\u0019\n\u0019\f\u0019\u0140\t\u0019\u0001\u0019\u0003\u0019"+
		"\u0143\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0147\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u014d\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0157\b\u001c\u0001\u001c\u0003\u001c\u015a"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0162\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0170\b\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0003!\u0177\b!\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u017c\b\"\n\"\f\"\u017f\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0186\b#\n#\f#\u0189\t#\u0001#\u0000\u0003\b\n,$\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDF\u0000\u0007\u0002\u0000\u0018\u0018\u001e\u001e\u0001\u0000"+
		"\u001f!\u0001\u0000\u001d\u001e\u0001\u0000\"#\u0002\u0000\u0007\u0007"+
		"\u0013\u0017\u0002\u0000\t\t\u0012\u0012\u0001\u0000\u0019\u001a\u01a6"+
		"\u0000H\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004R"+
		"\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bf\u0001\u0000"+
		"\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000"+
		"\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00b2\u0001\u0000\u0000"+
		"\u0000\u0012\u00c6\u0001\u0000\u0000\u0000\u0014\u00c8\u0001\u0000\u0000"+
		"\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000\u0000"+
		"\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00e7\u0001\u0000\u0000"+
		"\u0000\u001e\u00ec\u0001\u0000\u0000\u0000 \u00f0\u0001\u0000\u0000\u0000"+
		"\"\u00fb\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000\u0000&\u010a"+
		"\u0001\u0000\u0000\u0000(\u0113\u0001\u0000\u0000\u0000*\u0116\u0001\u0000"+
		"\u0000\u0000,\u011a\u0001\u0000\u0000\u0000.\u0127\u0001\u0000\u0000\u0000"+
		"0\u0137\u0001\u0000\u0000\u00002\u0139\u0001\u0000\u0000\u00004\u0146"+
		"\u0001\u0000\u0000\u00006\u0148\u0001\u0000\u0000\u00008\u0150\u0001\u0000"+
		"\u0000\u0000:\u015d\u0001\u0000\u0000\u0000<\u0167\u0001\u0000\u0000\u0000"+
		">\u016f\u0001\u0000\u0000\u0000@\u0171\u0001\u0000\u0000\u0000B\u0176"+
		"\u0001\u0000\u0000\u0000D\u0178\u0001\u0000\u0000\u0000F\u0180\u0001\u0000"+
		"\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0005\u0000\u0000\u0001J\u0001"+
		"\u0001\u0000\u0000\u0000KN\u0003\u0004\u0002\u0000LN\u0003\u0006\u0003"+
		"\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0003"+
		"\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000"+
		"ST\u0005\t\u0000\u0000TU\u0003\b\u0004\u0000U\u0005\u0001\u0000\u0000"+
		"\u0000V[\u0005)\u0000\u0000WZ\u0003\u0018\f\u0000XZ\u0005)\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\n\u0000\u0000_`\u0003\u0002"+
		"\u0001\u0000`a\u0005\u000b\u0000\u0000a\u0007\u0001\u0000\u0000\u0000"+
		"bc\u0006\u0004\uffff\uffff\u0000cg\u0003\n\u0005\u0000de\u0007\u0000\u0000"+
		"\u0000eg\u0003\b\u0004\u0006fb\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000g|\u0001\u0000\u0000\u0000hi\n\u0005\u0000\u0000ij\u0007\u0001\u0000"+
		"\u0000j{\u0003\b\u0004\u0006kl\n\u0004\u0000\u0000lm\u0007\u0002\u0000"+
		"\u0000m{\u0003\b\u0004\u0005no\n\u0003\u0000\u0000op\u0007\u0003\u0000"+
		"\u0000p{\u0003\b\u0004\u0004qr\n\u0002\u0000\u0000rs\u0007\u0004\u0000"+
		"\u0000s{\u0003\b\u0004\u0003tu\n\u0001\u0000\u0000uv\u0005\u0010\u0000"+
		"\u0000vw\u0003\b\u0004\u0000wx\u0005\u0012\u0000\u0000xy\u0003\b\u0004"+
		"\u0000y{\u0001\u0000\u0000\u0000zh\u0001\u0000\u0000\u0000zk\u0001\u0000"+
		"\u0000\u0000zn\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\t\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\u0005\uffff\uffff\u0000\u0080\u0081\u0005\u000e"+
		"\u0000\u0000\u0081\u0082\u0003\b\u0004\u0000\u0082\u0083\u0005\u000f\u0000"+
		"\u0000\u0083\u008b\u0001\u0000\u0000\u0000\u0084\u008b\u0003\f\u0006\u0000"+
		"\u0085\u008b\u0003\u000e\u0007\u0000\u0086\u008b\u0003\u0016\u000b\u0000"+
		"\u0087\u008b\u0003.\u0017\u0000\u0088\u008b\u00030\u0018\u0000\u0089\u008b"+
		"\u00034\u001a\u0000\u008a\u007f\u0001\u0000\u0000\u0000\u008a\u0084\u0001"+
		"\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a\u0086\u0001"+
		"\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0094\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\n\u0003\u0000\u0000\u008d\u0093\u0003>"+
		"\u001f\u0000\u008e\u008f\n\u0002\u0000\u0000\u008f\u0093\u0003@ \u0000"+
		"\u0090\u0091\n\u0001\u0000\u0000\u0091\u0093\u0003B!\u0000\u0092\u008c"+
		"\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u000b"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009d"+
		"\u0003\u0018\f\u0000\u0098\u009d\u0005\'\u0000\u0000\u0099\u009d\u0005"+
		"$\u0000\u0000\u009a\u009d\u0005%\u0000\u0000\u009b\u009d\u0005&\u0000"+
		"\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000"+
		"\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\r\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0003\u0010\b\u0000\u009f\u00a1\u0003\u0012\t\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\f\u0000\u0000\u00a3\u00a8"+
		"\u0003\b\u0004\u0000\u00a4\u00a5\u0005\u0019\u0000\u0000\u00a5\u00a7\u0003"+
		"\b\u0004\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0005\u0019\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b3\u0005\r\u0000\u0000"+
		"\u00b2\u00a2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5"+
		"\u00bc\u0003\u0014\n\u0000\u00b6\u00b8\u0005\u0019\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u0014\n\u0000\u00ba\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005"+
		"\u0019\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u000b\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\n\u0000\u0000\u00c5\u00c7\u0005\u000b\u0000\u0000\u00c6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u0013\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0003\b\u0004\u0000\u00c9\u00ca\u0007\u0005\u0000"+
		"\u0000\u00ca\u00cb\u0003\b\u0004\u0000\u00cb\u0015\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0003\u001a\r\u0000\u00cd\u00cf\u0003*\u0015\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u0017\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005(\u0000\u0000\u00d1\u00d7"+
		"\u0005(\u0000\u0000\u00d2\u00d3\u0005(\u0000\u0000\u00d3\u00d4\u0003\u001c"+
		"\u000e\u0000\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005(\u0000\u0000"+
		"\u00d9\u00e5\u0005(\u0000\u0000\u00da\u00de\u0005(\u0000\u0000\u00db\u00df"+
		"\u0003\u001c\u000e\u0000\u00dc\u00df\u0003 \u0010\u0000\u00dd\u00df\u0003"+
		"$\u0012\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005(\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e4\u00da\u0001\u0000\u0000\u0000\u00e5\u001b\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0005/\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u001d\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u00052\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u001f\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f5\u0005-\u0000\u0000\u00f1\u00f4\u0003\u001e\u000f\u0000\u00f2\u00f4"+
		"\u0003\u001a\r\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"1\u0000\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fc\u00054\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe#\u0001\u0000\u0000\u0000\u00ff\u0104\u0005.\u0000\u0000\u0100"+
		"\u0103\u0003\"\u0011\u0000\u0101\u0103\u0003\u001a\r\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u00053\u0000\u0000\u0108%\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u00056\u0000\u0000\u010a\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\'\u0001\u0000\u0000\u0000"+
		"\u010e\u0112\u0003&\u0013\u0000\u010f\u0112\u0003 \u0010\u0000\u0110\u0112"+
		"\u0003$\u0012\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001"+
		"\u0000\u0000\u0000\u0114)\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005\u0006\u0000\u0000\u0117\u0118\u0003(\u0014"+
		"\u0000\u0118\u0119\u00055\u0000\u0000\u0119+\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0006\u0016\uffff\uffff\u0000\u011b\u011c\u0005)\u0000\u0000\u011c"+
		"\u011d\u0005\u0011\u0000\u0000\u011d\u011e\u0005)\u0000\u0000\u011e\u0124"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\n\u0001\u0000\u0000\u0120\u0121\u0005"+
		"\u0011\u0000\u0000\u0121\u0123\u0005)\u0000\u0000\u0122\u011f\u0001\u0000"+
		"\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125-\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005)\u0000\u0000"+
		"\u0128/\u0001\u0000\u0000\u0000\u0129\u012c\u0005)\u0000\u0000\u012a\u012c"+
		"\u0003,\u0016\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"\u000e\u0000\u0000\u012e\u012f\u00032\u0019\u0000\u012f\u0130\u0005\u000f"+
		"\u0000\u0000\u0130\u0138\u0001\u0000\u0000\u0000\u0131\u0134\u0005)\u0000"+
		"\u0000\u0132\u0134\u0003,\u0016\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\u000e\u0000\u0000\u0136\u0138\u0005\u000f\u0000\u0000"+
		"\u0137\u012b\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000"+
		"\u01381\u0001\u0000\u0000\u0000\u0139\u013e\u0003\b\u0004\u0000\u013a"+
		"\u013b\u0005\u0019\u0000\u0000\u013b\u013d\u0003\b\u0004\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0007\u0006\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u01433\u0001\u0000\u0000\u0000\u0144\u0147\u0003"+
		"6\u001b\u0000\u0145\u0147\u00038\u001c\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u01475\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005\f\u0000\u0000\u0149\u014a\u0003:\u001d\u0000\u014a"+
		"\u014c\u0003\b\u0004\u0000\u014b\u014d\u0003<\u001e\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005\r\u0000\u0000\u014f7\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005\n\u0000\u0000\u0151\u0152\u0003:"+
		"\u001d\u0000\u0152\u0153\u0003\b\u0004\u0000\u0153\u0154\u0005\b\u0000"+
		"\u0000\u0154\u0156\u0003\b\u0004\u0000\u0155\u0157\u0005\u001a\u0000\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u015a\u0003<\u001e\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u000b\u0000\u0000\u015c"+
		"9\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0003\u0000\u0000\u015e\u0161"+
		"\u0005)\u0000\u0000\u015f\u0160\u0005\u0019\u0000\u0000\u0160\u0162\u0005"+
		")\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0005"+
		"\u0000\u0000\u0164\u0165\u0003\b\u0004\u0000\u0165\u0166\u0005\u0012\u0000"+
		"\u0000\u0166;\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0004\u0000\u0000"+
		"\u0168\u0169\u0003\b\u0004\u0000\u0169=\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\f\u0000\u0000\u016b\u016c\u0003\b\u0004\u0000\u016c\u016d"+
		"\u0005\r\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u0170\u0005"+
		"\u001b\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u0170?\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001c"+
		"\u0000\u0000\u0172\u0173\u0005)\u0000\u0000\u0173A\u0001\u0000\u0000\u0000"+
		"\u0174\u0177\u0003D\"\u0000\u0175\u0177\u0003F#\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177C\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005\u001c\u0000\u0000\u0179\u017d\u0005\u001f"+
		"\u0000\u0000\u017a\u017c\u0003@ \u0000\u017b\u017a\u0001\u0000\u0000\u0000"+
		"\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0001\u0000\u0000\u0000\u017eE\u0001\u0000\u0000\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005\f\u0000\u0000\u0181\u0182"+
		"\u0005\u001f\u0000\u0000\u0182\u0187\u0005\r\u0000\u0000\u0183\u0186\u0003"+
		"@ \u0000\u0184\u0186\u0003>\u001f\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188G\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"2MOY[fz|\u008a\u0092\u0094\u009c\u00a0\u00a8\u00ac\u00b2\u00b7\u00bc\u00c0"+
		"\u00c6\u00ce\u00d6\u00de\u00e0\u00e4\u00e9\u00ee\u00f3\u00f5\u00fd\u0102"+
		"\u0104\u010c\u0111\u0113\u0124\u012b\u0133\u0137\u013e\u0142\u0146\u014c"+
		"\u0156\u0159\u0161\u016f\u0176\u017d\u0185\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}