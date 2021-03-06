/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFileAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cPhrasesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPhrasesPhraseParserRuleCall_1_0 = (RuleCall)cPhrasesAssignment_1.eContents().get(0);
		private final Assignment cSongAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSongSongParserRuleCall_2_0 = (RuleCall)cSongAssignment_2.eContents().get(0);
		private final Assignment cPhrasesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPhrasesPhraseParserRuleCall_3_0 = (RuleCall)cPhrasesAssignment_3.eContents().get(0);
		
		//File:
		//    {File} phrases+=Phrase* song=Song phrases+=Phrase*;
		@Override public ParserRule getRule() { return rule; }
		
		//{File} phrases+=Phrase* song=Song phrases+=Phrase*
		public Group getGroup() { return cGroup; }
		
		//{File}
		public Action getFileAction_0() { return cFileAction_0; }
		
		//phrases+=Phrase*
		public Assignment getPhrasesAssignment_1() { return cPhrasesAssignment_1; }
		
		//Phrase
		public RuleCall getPhrasesPhraseParserRuleCall_1_0() { return cPhrasesPhraseParserRuleCall_1_0; }
		
		//song=Song
		public Assignment getSongAssignment_2() { return cSongAssignment_2; }
		
		//Song
		public RuleCall getSongSongParserRuleCall_2_0() { return cSongSongParserRuleCall_2_0; }
		
		//phrases+=Phrase*
		public Assignment getPhrasesAssignment_3() { return cPhrasesAssignment_3; }
		
		//Phrase
		public RuleCall getPhrasesPhraseParserRuleCall_3_0() { return cPhrasesPhraseParserRuleCall_3_0; }
	}
	public class PhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Phrase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPhraseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPhraseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cBodyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBodyBodyParserRuleCall_3_0 = (RuleCall)cBodyAssignment_3.eContents().get(0);
		
		//Phrase:
		//    {Phrase} 'phrase' name=ID body=Body;
		@Override public ParserRule getRule() { return rule; }
		
		//{Phrase} 'phrase' name=ID body=Body
		public Group getGroup() { return cGroup; }
		
		//{Phrase}
		public Action getPhraseAction_0() { return cPhraseAction_0; }
		
		//'phrase'
		public Keyword getPhraseKeyword_1() { return cPhraseKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//body=Body
		public Assignment getBodyAssignment_3() { return cBodyAssignment_3; }
		
		//Body
		public RuleCall getBodyBodyParserRuleCall_3_0() { return cBodyBodyParserRuleCall_3_0; }
	}
	public class SongElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Song");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSongAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSongKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cBodyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBodyBodyParserRuleCall_3_0 = (RuleCall)cBodyAssignment_3.eContents().get(0);
		
		//Song:
		//    {Song} 'song' name=STRING body=Body;
		@Override public ParserRule getRule() { return rule; }
		
		//{Song} 'song' name=STRING body=Body
		public Group getGroup() { return cGroup; }
		
		//{Song}
		public Action getSongAction_0() { return cSongAction_0; }
		
		//'song'
		public Keyword getSongKeyword_1() { return cSongKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//body=Body
		public Assignment getBodyAssignment_3() { return cBodyAssignment_3; }
		
		//Body
		public RuleCall getBodyBodyParserRuleCall_3_0() { return cBodyBodyParserRuleCall_3_0; }
	}
	public class BodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Body");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentItemParserRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Body:
		//    {Body} '{' content+=Item* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Body} '{' content+=Item* '}'
		public Group getGroup() { return cGroup; }
		
		//{Body}
		public Action getBodyAction_0() { return cBodyAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//content+=Item*
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//Item
		public RuleCall getContentItemParserRuleCall_2_0() { return cContentItemParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Item");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNoteItemAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cNoteAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNoteNoteParserRuleCall_0_1_0 = (RuleCall)cNoteAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPhraseItemAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cBackslashKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cPhraseAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cPhraseIDTerminalRuleCall_1_2_0 = (RuleCall)cPhraseAssignment_1_2.eContents().get(0);
		
		//Item:
		//    {NoteItem} note=Note | {PhraseItem} '\\' phrase=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{NoteItem} note=Note | {PhraseItem} '\\' phrase=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{NoteItem} note=Note
		public Group getGroup_0() { return cGroup_0; }
		
		//{NoteItem}
		public Action getNoteItemAction_0_0() { return cNoteItemAction_0_0; }
		
		//note=Note
		public Assignment getNoteAssignment_0_1() { return cNoteAssignment_0_1; }
		
		//Note
		public RuleCall getNoteNoteParserRuleCall_0_1_0() { return cNoteNoteParserRuleCall_0_1_0; }
		
		//{PhraseItem} '\\' phrase=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{PhraseItem}
		public Action getPhraseItemAction_1_0() { return cPhraseItemAction_1_0; }
		
		//'\\'
		public Keyword getBackslashKeyword_1_1() { return cBackslashKeyword_1_1; }
		
		//phrase=ID
		public Assignment getPhraseAssignment_1_2() { return cPhraseAssignment_1_2; }
		
		//ID
		public RuleCall getPhraseIDTerminalRuleCall_1_2_0() { return cPhraseIDTerminalRuleCall_1_2_0; }
	}
	public class NoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Note");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNoteAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNoteNameEnumRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cOctaveAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOctaveOctaveParserRuleCall_2_0 = (RuleCall)cOctaveAssignment_2.eContents().get(0);
		private final Assignment cDurationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDurationINTTerminalRuleCall_3_0 = (RuleCall)cDurationAssignment_3.eContents().get(0);
		private final Assignment cSyllableAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSyllableSTRINGTerminalRuleCall_4_0 = (RuleCall)cSyllableAssignment_4.eContents().get(0);
		
		//Note: {Note} name=NoteName octave=Octave? duration=INT syllable=STRING?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Note} name=NoteName octave=Octave? duration=INT syllable=STRING?
		public Group getGroup() { return cGroup; }
		
		//{Note}
		public Action getNoteAction_0() { return cNoteAction_0; }
		
		//name=NoteName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//NoteName
		public RuleCall getNameNoteNameEnumRuleCall_1_0() { return cNameNoteNameEnumRuleCall_1_0; }
		
		//octave=Octave?
		public Assignment getOctaveAssignment_2() { return cOctaveAssignment_2; }
		
		//Octave
		public RuleCall getOctaveOctaveParserRuleCall_2_0() { return cOctaveOctaveParserRuleCall_2_0; }
		
		//duration=INT
		public Assignment getDurationAssignment_3() { return cDurationAssignment_3; }
		
		//INT
		public RuleCall getDurationINTTerminalRuleCall_3_0() { return cDurationINTTerminalRuleCall_3_0; }
		
		//syllable=STRING?
		public Assignment getSyllableAssignment_4() { return cSyllableAssignment_4; }
		
		//STRING
		public RuleCall getSyllableSTRINGTerminalRuleCall_4_0() { return cSyllableSTRINGTerminalRuleCall_4_0; }
	}
	public class OctaveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.Octave");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIsAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_0_2_0 = (RuleCall)cValueAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cEsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValueAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_1_2_0 = (RuleCall)cValueAssignment_1_2.eContents().get(0);
		
		//Octave: {Is} '+' value=INT | {Es} '-' value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{Is} '+' value=INT | {Es} '-' value=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Is} '+' value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{Is}
		public Action getIsAction_0_0() { return cIsAction_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_0_1() { return cPlusSignKeyword_0_1; }
		
		//value=INT
		public Assignment getValueAssignment_0_2() { return cValueAssignment_0_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_2_0() { return cValueINTTerminalRuleCall_0_2_0; }
		
		//{Es} '-' value=INT
		public Group getGroup_1() { return cGroup_1; }
		
		//{Es}
		public Action getEsAction_1_0() { return cEsAction_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }
		
		//value=INT
		public Assignment getValueAssignment_1_2() { return cValueAssignment_1_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_2_0() { return cValueINTTerminalRuleCall_1_2_0; }
	}
	
	public class NoteNameElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.Dsl.NoteName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAAKeyword_0_0 = (Keyword)cAEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBBKeyword_1_0 = (Keyword)cBEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCCKeyword_2_0 = (Keyword)cCEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDDKeyword_3_0 = (Keyword)cDEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cEEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cEEKeyword_4_0 = (Keyword)cEEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cFEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cFFKeyword_5_0 = (Keyword)cFEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cGEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cGGKeyword_6_0 = (Keyword)cGEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum NoteName: A = 'a' | B = 'b' | C = 'c' | D = 'd' | E = 'e' | F = 'f' | G = 'g';
		public EnumRule getRule() { return rule; }
		
		//A = 'a' | B = 'b' | C = 'c' | D = 'd' | E = 'e' | F = 'f' | G = 'g'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//A = 'a'
		public EnumLiteralDeclaration getAEnumLiteralDeclaration_0() { return cAEnumLiteralDeclaration_0; }
		
		//'a'
		public Keyword getAAKeyword_0_0() { return cAAKeyword_0_0; }
		
		//B = 'b'
		public EnumLiteralDeclaration getBEnumLiteralDeclaration_1() { return cBEnumLiteralDeclaration_1; }
		
		//'b'
		public Keyword getBBKeyword_1_0() { return cBBKeyword_1_0; }
		
		//C = 'c'
		public EnumLiteralDeclaration getCEnumLiteralDeclaration_2() { return cCEnumLiteralDeclaration_2; }
		
		//'c'
		public Keyword getCCKeyword_2_0() { return cCCKeyword_2_0; }
		
		//D = 'd'
		public EnumLiteralDeclaration getDEnumLiteralDeclaration_3() { return cDEnumLiteralDeclaration_3; }
		
		//'d'
		public Keyword getDDKeyword_3_0() { return cDDKeyword_3_0; }
		
		//E = 'e'
		public EnumLiteralDeclaration getEEnumLiteralDeclaration_4() { return cEEnumLiteralDeclaration_4; }
		
		//'e'
		public Keyword getEEKeyword_4_0() { return cEEKeyword_4_0; }
		
		//F = 'f'
		public EnumLiteralDeclaration getFEnumLiteralDeclaration_5() { return cFEnumLiteralDeclaration_5; }
		
		//'f'
		public Keyword getFFKeyword_5_0() { return cFFKeyword_5_0; }
		
		//G = 'g'
		public EnumLiteralDeclaration getGEnumLiteralDeclaration_6() { return cGEnumLiteralDeclaration_6; }
		
		//'g'
		public Keyword getGGKeyword_6_0() { return cGGKeyword_6_0; }
	}
	
	private final FileElements pFile;
	private final PhraseElements pPhrase;
	private final SongElements pSong;
	private final BodyElements pBody;
	private final ItemElements pItem;
	private final NoteElements pNote;
	private final OctaveElements pOctave;
	private final NoteNameElements eNoteName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFile = new FileElements();
		this.pPhrase = new PhraseElements();
		this.pSong = new SongElements();
		this.pBody = new BodyElements();
		this.pItem = new ItemElements();
		this.pNote = new NoteElements();
		this.pOctave = new OctaveElements();
		this.eNoteName = new NoteNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.lilypond.Dsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//File:
	//    {File} phrases+=Phrase* song=Song phrases+=Phrase*;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Phrase:
	//    {Phrase} 'phrase' name=ID body=Body;
	public PhraseElements getPhraseAccess() {
		return pPhrase;
	}
	
	public ParserRule getPhraseRule() {
		return getPhraseAccess().getRule();
	}
	
	//Song:
	//    {Song} 'song' name=STRING body=Body;
	public SongElements getSongAccess() {
		return pSong;
	}
	
	public ParserRule getSongRule() {
		return getSongAccess().getRule();
	}
	
	//Body:
	//    {Body} '{' content+=Item* '}';
	public BodyElements getBodyAccess() {
		return pBody;
	}
	
	public ParserRule getBodyRule() {
		return getBodyAccess().getRule();
	}
	
	//Item:
	//    {NoteItem} note=Note | {PhraseItem} '\\' phrase=ID;
	public ItemElements getItemAccess() {
		return pItem;
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}
	
	//Note: {Note} name=NoteName octave=Octave? duration=INT syllable=STRING?;
	public NoteElements getNoteAccess() {
		return pNote;
	}
	
	public ParserRule getNoteRule() {
		return getNoteAccess().getRule();
	}
	
	//Octave: {Is} '+' value=INT | {Es} '-' value=INT;
	public OctaveElements getOctaveAccess() {
		return pOctave;
	}
	
	public ParserRule getOctaveRule() {
		return getOctaveAccess().getRule();
	}
	
	//enum NoteName: A = 'a' | B = 'b' | C = 'c' | D = 'd' | E = 'e' | F = 'f' | G = 'g';
	public NoteNameElements getNoteNameAccess() {
		return eNoteName;
	}
	
	public EnumRule getNoteNameRule() {
		return getNoteNameAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
