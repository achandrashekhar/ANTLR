// Generated from /Users/ashi/git/inclassLabs/grammars/CDecl.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CDeclParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, WS=11;
	public static final int
		RULE_declaration = 0, RULE_typename = 1, RULE_declarator = 2, RULE_declaration2 = 3, 
		RULE_declarator2 = 4;
	public static final String[] ruleNames = {
		"declaration", "typename", "declarator", "declaration2", "declarator2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'void'", "'float'", "'int'", "'['", "']'", "'('", "')'", 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "WS"
	};
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
	public String getGrammarFileName() { return "CDecl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDeclParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DeclarationContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			typename();
			setState(11);
			declarator(0);
			setState(12);
			match(T__0);
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

	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDeclParser.ID, 0); }
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << ID))) != 0)) ) {
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	 
		public DeclaratorContext() { }
		public void copyFrom(DeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends DeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ArrayContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends DeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FuncContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends DeclaratorContext {
		public TerminalNode ID() { return getToken(CDeclParser.ID, 0); }
		public VarContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerContext extends DeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public PointerContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingContext extends DeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public GroupingContext(DeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		return declarator(0);
	}

	private DeclaratorContext declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, _parentState);
		DeclaratorContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_declarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(T__8);
				setState(18);
				declarator(3);
				}
				break;
			case T__6:
				{
				_localctx = new GroupingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__6);
				setState(20);
				declarator(0);
				setState(21);
				match(T__7);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayContext(new DeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_declarator);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						match(T__4);
						setState(28);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new FuncContext(new DeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_declarator);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						match(T__6);
						setState(31);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Declaration2Context extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public Declarator2Context declarator2() {
			return getRuleContext(Declarator2Context.class,0);
		}
		public Declaration2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitDeclaration2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitDeclaration2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration2Context declaration2() throws RecognitionException {
		Declaration2Context _localctx = new Declaration2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			typename();
			setState(38);
			declarator2();
			setState(39);
			match(T__0);
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

	public static class Declarator2Context extends ParserRuleContext {
		public Declarator2Context declarator2() {
			return getRuleContext(Declarator2Context.class,0);
		}
		public TerminalNode ID() { return getToken(CDeclParser.ID, 0); }
		public Declarator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).enterDeclarator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CDeclListener ) ((CDeclListener)listener).exitDeclarator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CDeclVisitor ) return ((CDeclVisitor<? extends T>)visitor).visitDeclarator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarator2Context declarator2() throws RecognitionException {
		Declarator2Context _localctx = new Declarator2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarator2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(41);
				match(T__8);
				setState(42);
				declarator2();
				}
				break;
			case T__6:
				{
				setState(43);
				match(T__6);
				setState(44);
				declarator2();
				setState(45);
				match(T__7);
				}
				break;
			case ID:
				{
				setState(47);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(54);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(50);
						match(T__4);
						setState(51);
						match(T__5);
						}
						break;
					case T__6:
						{
						setState(52);
						match(T__6);
						setState(53);
						match(T__7);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 2:
			return declarator_sempred((DeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarator_sempred(DeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16\4&\13"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\6\3\6\3\6"+
		"\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\2\3\6\7\2\4\6\b\n\2\3\4\2\4\6\f\f@\2"+
		"\f\3\2\2\2\4\20\3\2\2\2\6\32\3\2\2\2\b\'\3\2\2\2\n\62\3\2\2\2\f\r\5\4"+
		"\3\2\r\16\5\6\4\2\16\17\7\3\2\2\17\3\3\2\2\2\20\21\t\2\2\2\21\5\3\2\2"+
		"\2\22\23\b\4\1\2\23\24\7\13\2\2\24\33\5\6\4\5\25\26\7\t\2\2\26\27\5\6"+
		"\4\2\27\30\7\n\2\2\30\33\3\2\2\2\31\33\7\f\2\2\32\22\3\2\2\2\32\25\3\2"+
		"\2\2\32\31\3\2\2\2\33$\3\2\2\2\34\35\f\7\2\2\35\36\7\7\2\2\36#\7\b\2\2"+
		"\37 \f\6\2\2 !\7\t\2\2!#\7\n\2\2\"\34\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$"+
		"\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\'(\5\4\3\2()\5\n\6\2)*\7\3\2"+
		"\2*\t\3\2\2\2+,\7\13\2\2,\63\5\n\6\2-.\7\t\2\2./\5\n\6\2/\60\7\n\2\2\60"+
		"\63\3\2\2\2\61\63\7\f\2\2\62+\3\2\2\2\62-\3\2\2\2\62\61\3\2\2\2\63:\3"+
		"\2\2\2\64\65\7\7\2\2\659\7\b\2\2\66\67\7\t\2\2\679\7\n\2\28\64\3\2\2\2"+
		"8\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2\b\32"+
		"\"$\628:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}