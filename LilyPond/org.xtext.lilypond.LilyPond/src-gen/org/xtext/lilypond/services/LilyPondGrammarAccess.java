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
public class LilyPondGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFileAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cVersionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVersionVersionParserRuleCall_1_0 = (RuleCall)cVersionAssignment_1.eContents().get(0);
		private final Assignment cHeaderAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHeaderHeaderParserRuleCall_2_0 = (RuleCall)cHeaderAssignment_2.eContents().get(0);
		private final Assignment cScoreAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cScoreScoreParserRuleCall_3_0 = (RuleCall)cScoreAssignment_3.eContents().get(0);
		
		//File:
		//    {File} version=Version header=Header score=Score;
		@Override public ParserRule getRule() { return rule; }
		
		//{File} version=Version header=Header score=Score
		public Group getGroup() { return cGroup; }
		
		//{File}
		public Action getFileAction_0() { return cFileAction_0; }
		
		//version=Version
		public Assignment getVersionAssignment_1() { return cVersionAssignment_1; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_1_0() { return cVersionVersionParserRuleCall_1_0; }
		
		//header=Header
		public Assignment getHeaderAssignment_2() { return cHeaderAssignment_2; }
		
		//Header
		public RuleCall getHeaderHeaderParserRuleCall_2_0() { return cHeaderHeaderParserRuleCall_2_0; }
		
		//score=Score
		public Assignment getScoreAssignment_3() { return cScoreAssignment_3; }
		
		//Score
		public RuleCall getScoreScoreParserRuleCall_3_0() { return cScoreScoreParserRuleCall_3_0; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVersionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVersionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Version:
		//    {Version} '\\version' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//{Version} '\\version' value=STRING
		public Group getGroup() { return cGroup; }
		
		//{Version}
		public Action getVersionAction_0() { return cVersionAction_0; }
		
		//'\\version'
		public Keyword getVersionKeyword_1() { return cVersionKeyword_1; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHeaderAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHeaderKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleTitleParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Header:
		//    {Header} '\\header' '{' title=Title '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Header} '\\header' '{' title=Title '}'
		public Group getGroup() { return cGroup; }
		
		//{Header}
		public Action getHeaderAction_0() { return cHeaderAction_0; }
		
		//'\\header'
		public Keyword getHeaderKeyword_1() { return cHeaderKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//title=Title
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Title
		public RuleCall getTitleTitleParserRuleCall_3_0() { return cTitleTitleParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TitleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Title");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTitleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTitleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Title:
		//    {Title} 'title' '=' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//{Title} 'title' '=' value=STRING
		public Group getGroup() { return cGroup; }
		
		//{Title}
		public Action getTitleAction_0() { return cTitleAction_0; }
		
		//'title'
		public Keyword getTitleKeyword_1() { return cTitleKeyword_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}
	public class ScoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Score");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cScoreAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cScoreKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLessThanSignLessThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStaffAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStaffStaffParserRuleCall_4_0 = (RuleCall)cStaffAssignment_4.eContents().get(0);
		private final Assignment cLyricsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLyricsLyricsParserRuleCall_5_0 = (RuleCall)cLyricsAssignment_5.eContents().get(0);
		private final Keyword cGreaterThanSignGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Score:
		//    {Score} '\\score' '{' '<<' staff=Staff lyrics=Lyrics '>>' '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Score} '\\score' '{' '<<' staff=Staff lyrics=Lyrics '>>' '}'
		public Group getGroup() { return cGroup; }
		
		//{Score}
		public Action getScoreAction_0() { return cScoreAction_0; }
		
		//'\\score'
		public Keyword getScoreKeyword_1() { return cScoreKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'<<'
		public Keyword getLessThanSignLessThanSignKeyword_3() { return cLessThanSignLessThanSignKeyword_3; }
		
		//staff=Staff
		public Assignment getStaffAssignment_4() { return cStaffAssignment_4; }
		
		//Staff
		public RuleCall getStaffStaffParserRuleCall_4_0() { return cStaffStaffParserRuleCall_4_0; }
		
		//lyrics=Lyrics
		public Assignment getLyricsAssignment_5() { return cLyricsAssignment_5; }
		
		//Lyrics
		public RuleCall getLyricsLyricsParserRuleCall_5_0() { return cLyricsLyricsParserRuleCall_5_0; }
		
		//'>>'
		public Keyword getGreaterThanSignGreaterThanSignKeyword_6() { return cGreaterThanSignGreaterThanSignKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class StaffElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Staff");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStaffAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNewKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cStaffKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cKeyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cKeyKeyParserRuleCall_4_0 = (RuleCall)cKeyAssignment_4.eContents().get(0);
		private final Assignment cTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTimeTimeParserRuleCall_5_0 = (RuleCall)cTimeAssignment_5.eContents().get(0);
		private final Assignment cAbsoluteAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAbsoluteAbsoluteParserRuleCall_6_0 = (RuleCall)cAbsoluteAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Staff:
		//    {Staff} '\\new' 'Staff' '{' key=Key time=Time absolute=Absolute '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Staff} '\\new' 'Staff' '{' key=Key time=Time absolute=Absolute '}'
		public Group getGroup() { return cGroup; }
		
		//{Staff}
		public Action getStaffAction_0() { return cStaffAction_0; }
		
		//'\\new'
		public Keyword getNewKeyword_1() { return cNewKeyword_1; }
		
		//'Staff'
		public Keyword getStaffKeyword_2() { return cStaffKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//key=Key
		public Assignment getKeyAssignment_4() { return cKeyAssignment_4; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_4_0() { return cKeyKeyParserRuleCall_4_0; }
		
		//time=Time
		public Assignment getTimeAssignment_5() { return cTimeAssignment_5; }
		
		//Time
		public RuleCall getTimeTimeParserRuleCall_5_0() { return cTimeTimeParserRuleCall_5_0; }
		
		//absolute=Absolute
		public Assignment getAbsoluteAssignment_6() { return cAbsoluteAssignment_6; }
		
		//Absolute
		public RuleCall getAbsoluteAbsoluteParserRuleCall_6_0() { return cAbsoluteAbsoluteParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class KeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Key");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKeyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKeyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cMajorKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Key:
		//    {Key} '\\key' 'c' '\\major';
		@Override public ParserRule getRule() { return rule; }
		
		//{Key} '\\key' 'c' '\\major'
		public Group getGroup() { return cGroup; }
		
		//{Key}
		public Action getKeyAction_0() { return cKeyAction_0; }
		
		//'\\key'
		public Keyword getKeyKeyword_1() { return cKeyKeyword_1; }
		
		//'c'
		public Keyword getCKeyword_2() { return cCKeyword_2; }
		
		//'\\major'
		public Keyword getMajorKeyword_3() { return cMajorKeyword_3; }
	}
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Time");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTimeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTimeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDigitFourSolidusDigitFourKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Time:
		//    {Time} '\\time' '4/4';
		@Override public ParserRule getRule() { return rule; }
		
		//{Time} '\\time' '4/4'
		public Group getGroup() { return cGroup; }
		
		//{Time}
		public Action getTimeAction_0() { return cTimeAction_0; }
		
		//'\\time'
		public Keyword getTimeKeyword_1() { return cTimeKeyword_1; }
		
		//'4/4'
		public Keyword getDigitFourSolidusDigitFourKeyword_2() { return cDigitFourSolidusDigitFourKeyword_2; }
	}
	public class AbsoluteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Absolute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAbsoluteAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAbsoluteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cItemsNoteParserRuleCall_3_0 = (RuleCall)cItemsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Absolute:
		//    {Absolute} '\\absolute' '{' items+=Note* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Absolute} '\\absolute' '{' items+=Note* '}'
		public Group getGroup() { return cGroup; }
		
		//{Absolute}
		public Action getAbsoluteAction_0() { return cAbsoluteAction_0; }
		
		//'\\absolute'
		public Keyword getAbsoluteKeyword_1() { return cAbsoluteKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//items+=Note*
		public Assignment getItemsAssignment_3() { return cItemsAssignment_3; }
		
		//Note
		public RuleCall getItemsNoteParserRuleCall_3_0() { return cItemsNoteParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class NoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Note");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNoteAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNoteNameEnumRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cOctaveAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOctaveOctaveRepParserRuleCall_2_0 = (RuleCall)cOctaveAssignment_2.eContents().get(0);
		private final Assignment cDurationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDurationINTTerminalRuleCall_3_0 = (RuleCall)cDurationAssignment_3.eContents().get(0);
		
		//Note:
		//    {Note} name=NoteName octave=OctaveRep duration=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{Note} name=NoteName octave=OctaveRep duration=INT
		public Group getGroup() { return cGroup; }
		
		//{Note}
		public Action getNoteAction_0() { return cNoteAction_0; }
		
		//name=NoteName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//NoteName
		public RuleCall getNameNoteNameEnumRuleCall_1_0() { return cNameNoteNameEnumRuleCall_1_0; }
		
		//octave=OctaveRep
		public Assignment getOctaveAssignment_2() { return cOctaveAssignment_2; }
		
		//OctaveRep
		public RuleCall getOctaveOctaveRepParserRuleCall_2_0() { return cOctaveOctaveRepParserRuleCall_2_0; }
		
		//duration=INT
		public Assignment getDurationAssignment_3() { return cDurationAssignment_3; }
		
		//INT
		public RuleCall getDurationINTTerminalRuleCall_3_0() { return cDurationINTTerminalRuleCall_3_0; }
	}
	public class OctaveRepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.OctaveRep");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cQuotesAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueQuoteParserRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cCommasAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueCommaParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		
		//OctaveRep: {Quotes} value+=Quote* | {Commas} value+=Comma*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Quotes} value+=Quote* | {Commas} value+=Comma*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Quotes} value+=Quote*
		public Group getGroup_0() { return cGroup_0; }
		
		//{Quotes}
		public Action getQuotesAction_0_0() { return cQuotesAction_0_0; }
		
		//value+=Quote*
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//Quote
		public RuleCall getValueQuoteParserRuleCall_0_1_0() { return cValueQuoteParserRuleCall_0_1_0; }
		
		//{Commas} value+=Comma*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Commas}
		public Action getCommasAction_1_0() { return cCommasAction_1_0; }
		
		//value+=Comma*
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//Comma
		public RuleCall getValueCommaParserRuleCall_1_1_0() { return cValueCommaParserRuleCall_1_1_0; }
	}
	public class QuoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Quote");
		private final Keyword cApostropheKeyword = (Keyword)rule.eContents().get(1);
		
		//Quote returns ecore::EChar: '\'';
		@Override public ParserRule getRule() { return rule; }
		
		//'\''
		public Keyword getApostropheKeyword() { return cApostropheKeyword; }
	}
	public class CommaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Comma");
		private final Keyword cCommaKeyword = (Keyword)rule.eContents().get(1);
		
		//Comma returns ecore::EChar: ',';
		@Override public ParserRule getRule() { return rule; }
		
		//','
		public Keyword getCommaKeyword() { return cCommaKeyword; }
	}
	public class LyricsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.Lyrics");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLyricsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAddlyricsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSyllablesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSyllablesSTRINGTerminalRuleCall_3_0 = (RuleCall)cSyllablesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Lyrics:
		//    {Lyrics} '\\addlyrics' '{' syllables+=STRING* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Lyrics} '\\addlyrics' '{' syllables+=STRING* '}'
		public Group getGroup() { return cGroup; }
		
		//{Lyrics}
		public Action getLyricsAction_0() { return cLyricsAction_0; }
		
		//'\\addlyrics'
		public Keyword getAddlyricsKeyword_1() { return cAddlyricsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//syllables+=STRING*
		public Assignment getSyllablesAssignment_3() { return cSyllablesAssignment_3; }
		
		//STRING
		public RuleCall getSyllablesSTRINGTerminalRuleCall_3_0() { return cSyllablesSTRINGTerminalRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	public class NoteNameElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.lilypond.LilyPond.NoteName");
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
	private final VersionElements pVersion;
	private final HeaderElements pHeader;
	private final TitleElements pTitle;
	private final ScoreElements pScore;
	private final StaffElements pStaff;
	private final KeyElements pKey;
	private final TimeElements pTime;
	private final AbsoluteElements pAbsolute;
	private final NoteElements pNote;
	private final OctaveRepElements pOctaveRep;
	private final QuoteElements pQuote;
	private final CommaElements pComma;
	private final NoteNameElements eNoteName;
	private final LyricsElements pLyrics;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LilyPondGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFile = new FileElements();
		this.pVersion = new VersionElements();
		this.pHeader = new HeaderElements();
		this.pTitle = new TitleElements();
		this.pScore = new ScoreElements();
		this.pStaff = new StaffElements();
		this.pKey = new KeyElements();
		this.pTime = new TimeElements();
		this.pAbsolute = new AbsoluteElements();
		this.pNote = new NoteElements();
		this.pOctaveRep = new OctaveRepElements();
		this.pQuote = new QuoteElements();
		this.pComma = new CommaElements();
		this.eNoteName = new NoteNameElements();
		this.pLyrics = new LyricsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.lilypond.LilyPond".equals(grammar.getName())) {
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
	//    {File} version=Version header=Header score=Score;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Version:
	//    {Version} '\\version' value=STRING;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//Header:
	//    {Header} '\\header' '{' title=Title '}';
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}
	
	//Title:
	//    {Title} 'title' '=' value=STRING;
	public TitleElements getTitleAccess() {
		return pTitle;
	}
	
	public ParserRule getTitleRule() {
		return getTitleAccess().getRule();
	}
	
	//Score:
	//    {Score} '\\score' '{' '<<' staff=Staff lyrics=Lyrics '>>' '}';
	public ScoreElements getScoreAccess() {
		return pScore;
	}
	
	public ParserRule getScoreRule() {
		return getScoreAccess().getRule();
	}
	
	//Staff:
	//    {Staff} '\\new' 'Staff' '{' key=Key time=Time absolute=Absolute '}';
	public StaffElements getStaffAccess() {
		return pStaff;
	}
	
	public ParserRule getStaffRule() {
		return getStaffAccess().getRule();
	}
	
	//Key:
	//    {Key} '\\key' 'c' '\\major';
	public KeyElements getKeyAccess() {
		return pKey;
	}
	
	public ParserRule getKeyRule() {
		return getKeyAccess().getRule();
	}
	
	//Time:
	//    {Time} '\\time' '4/4';
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Absolute:
	//    {Absolute} '\\absolute' '{' items+=Note* '}';
	public AbsoluteElements getAbsoluteAccess() {
		return pAbsolute;
	}
	
	public ParserRule getAbsoluteRule() {
		return getAbsoluteAccess().getRule();
	}
	
	//Note:
	//    {Note} name=NoteName octave=OctaveRep duration=INT;
	public NoteElements getNoteAccess() {
		return pNote;
	}
	
	public ParserRule getNoteRule() {
		return getNoteAccess().getRule();
	}
	
	//OctaveRep: {Quotes} value+=Quote* | {Commas} value+=Comma*;
	public OctaveRepElements getOctaveRepAccess() {
		return pOctaveRep;
	}
	
	public ParserRule getOctaveRepRule() {
		return getOctaveRepAccess().getRule();
	}
	
	//Quote returns ecore::EChar: '\'';
	public QuoteElements getQuoteAccess() {
		return pQuote;
	}
	
	public ParserRule getQuoteRule() {
		return getQuoteAccess().getRule();
	}
	
	//Comma returns ecore::EChar: ',';
	public CommaElements getCommaAccess() {
		return pComma;
	}
	
	public ParserRule getCommaRule() {
		return getCommaAccess().getRule();
	}
	
	//enum NoteName: A = 'a' | B = 'b' | C = 'c' | D = 'd' | E = 'e' | F = 'f' | G = 'g';
	public NoteNameElements getNoteNameAccess() {
		return eNoteName;
	}
	
	public EnumRule getNoteNameRule() {
		return getNoteNameAccess().getRule();
	}
	
	//Lyrics:
	//    {Lyrics} '\\addlyrics' '{' syllables+=STRING* '}';
	public LyricsElements getLyricsAccess() {
		return pLyrics;
	}
	
	public ParserRule getLyricsRule() {
		return getLyricsAccess().getRule();
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