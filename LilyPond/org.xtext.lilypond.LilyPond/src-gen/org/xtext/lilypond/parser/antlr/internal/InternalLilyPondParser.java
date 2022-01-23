package org.xtext.lilypond.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lilypond.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\\\version'", "'\\\\header'", "'{'", "'}'", "'title'", "'='", "'\\\\score'", "'<<'", "'>>'", "'\\\\new'", "'Staff'", "'\\\\key'", "'c'", "'\\\\major'", "'\\\\time'", "'4/4'", "'\\\\absolute'", "'\\''", "','", "'\\\\addlyrics'", "'a'", "'b'", "'d'", "'e'", "'f'", "'g'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLilyPondParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLilyPondParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLilyPondParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLilyPond.g"; }



     	private LilyPondGrammarAccess grammarAccess;

        public InternalLilyPondParser(TokenStream input, LilyPondGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected LilyPondGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalLilyPond.g:65:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalLilyPond.g:65:45: (iv_ruleFile= ruleFile EOF )
            // InternalLilyPond.g:66:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalLilyPond.g:72:1: ruleFile returns [EObject current=null] : ( () ( (lv_version_1_0= ruleVersion ) ) ( (lv_header_2_0= ruleHeader ) ) ( (lv_score_3_0= ruleScore ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_version_1_0 = null;

        EObject lv_header_2_0 = null;

        EObject lv_score_3_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:78:2: ( ( () ( (lv_version_1_0= ruleVersion ) ) ( (lv_header_2_0= ruleHeader ) ) ( (lv_score_3_0= ruleScore ) ) ) )
            // InternalLilyPond.g:79:2: ( () ( (lv_version_1_0= ruleVersion ) ) ( (lv_header_2_0= ruleHeader ) ) ( (lv_score_3_0= ruleScore ) ) )
            {
            // InternalLilyPond.g:79:2: ( () ( (lv_version_1_0= ruleVersion ) ) ( (lv_header_2_0= ruleHeader ) ) ( (lv_score_3_0= ruleScore ) ) )
            // InternalLilyPond.g:80:3: () ( (lv_version_1_0= ruleVersion ) ) ( (lv_header_2_0= ruleHeader ) ) ( (lv_score_3_0= ruleScore ) )
            {
            // InternalLilyPond.g:80:3: ()
            // InternalLilyPond.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalLilyPond.g:87:3: ( (lv_version_1_0= ruleVersion ) )
            // InternalLilyPond.g:88:4: (lv_version_1_0= ruleVersion )
            {
            // InternalLilyPond.g:88:4: (lv_version_1_0= ruleVersion )
            // InternalLilyPond.g:89:5: lv_version_1_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getFileAccess().getVersionVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_version_1_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_1_0,
            						"org.xtext.lilypond.LilyPond.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:106:3: ( (lv_header_2_0= ruleHeader ) )
            // InternalLilyPond.g:107:4: (lv_header_2_0= ruleHeader )
            {
            // InternalLilyPond.g:107:4: (lv_header_2_0= ruleHeader )
            // InternalLilyPond.g:108:5: lv_header_2_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getFileAccess().getHeaderHeaderParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_2_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_2_0,
            						"org.xtext.lilypond.LilyPond.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:125:3: ( (lv_score_3_0= ruleScore ) )
            // InternalLilyPond.g:126:4: (lv_score_3_0= ruleScore )
            {
            // InternalLilyPond.g:126:4: (lv_score_3_0= ruleScore )
            // InternalLilyPond.g:127:5: lv_score_3_0= ruleScore
            {

            					newCompositeNode(grammarAccess.getFileAccess().getScoreScoreParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_score_3_0=ruleScore();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"score",
            						lv_score_3_0,
            						"org.xtext.lilypond.LilyPond.Score");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleVersion"
    // InternalLilyPond.g:148:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalLilyPond.g:148:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalLilyPond.g:149:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalLilyPond.g:155:1: ruleVersion returns [EObject current=null] : ( () otherlv_1= '\\\\version' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLilyPond.g:161:2: ( ( () otherlv_1= '\\\\version' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLilyPond.g:162:2: ( () otherlv_1= '\\\\version' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLilyPond.g:162:2: ( () otherlv_1= '\\\\version' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLilyPond.g:163:3: () otherlv_1= '\\\\version' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalLilyPond.g:163:3: ()
            // InternalLilyPond.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionAccess().getVersionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getVersionKeyword_1());
            		
            // InternalLilyPond.g:174:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLilyPond.g:175:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLilyPond.g:175:4: (lv_value_2_0= RULE_STRING )
            // InternalLilyPond.g:176:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getVersionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleHeader"
    // InternalLilyPond.g:196:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalLilyPond.g:196:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalLilyPond.g:197:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalLilyPond.g:203:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= '\\\\header' otherlv_2= '{' ( (lv_title_3_0= ruleTitle ) ) otherlv_4= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:209:2: ( ( () otherlv_1= '\\\\header' otherlv_2= '{' ( (lv_title_3_0= ruleTitle ) ) otherlv_4= '}' ) )
            // InternalLilyPond.g:210:2: ( () otherlv_1= '\\\\header' otherlv_2= '{' ( (lv_title_3_0= ruleTitle ) ) otherlv_4= '}' )
            {
            // InternalLilyPond.g:210:2: ( () otherlv_1= '\\\\header' otherlv_2= '{' ( (lv_title_3_0= ruleTitle ) ) otherlv_4= '}' )
            // InternalLilyPond.g:211:3: () otherlv_1= '\\\\header' otherlv_2= '{' ( (lv_title_3_0= ruleTitle ) ) otherlv_4= '}'
            {
            // InternalLilyPond.g:211:3: ()
            // InternalLilyPond.g:212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLilyPond.g:226:3: ( (lv_title_3_0= ruleTitle ) )
            // InternalLilyPond.g:227:4: (lv_title_3_0= ruleTitle )
            {
            // InternalLilyPond.g:227:4: (lv_title_3_0= ruleTitle )
            // InternalLilyPond.g:228:5: lv_title_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getTitleTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_title_3_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.lilypond.LilyPond.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTitle"
    // InternalLilyPond.g:253:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalLilyPond.g:253:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalLilyPond.g:254:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLilyPond.g:260:1: ruleTitle returns [EObject current=null] : ( () otherlv_1= 'title' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalLilyPond.g:266:2: ( ( () otherlv_1= 'title' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalLilyPond.g:267:2: ( () otherlv_1= 'title' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalLilyPond.g:267:2: ( () otherlv_1= 'title' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalLilyPond.g:268:3: () otherlv_1= 'title' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            // InternalLilyPond.g:268:3: ()
            // InternalLilyPond.g:269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTitleAccess().getTitleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getTitleKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTitleAccess().getEqualsSignKeyword_2());
            		
            // InternalLilyPond.g:283:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalLilyPond.g:284:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalLilyPond.g:284:4: (lv_value_3_0= RULE_STRING )
            // InternalLilyPond.g:285:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleScore"
    // InternalLilyPond.g:305:1: entryRuleScore returns [EObject current=null] : iv_ruleScore= ruleScore EOF ;
    public final EObject entryRuleScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScore = null;


        try {
            // InternalLilyPond.g:305:46: (iv_ruleScore= ruleScore EOF )
            // InternalLilyPond.g:306:2: iv_ruleScore= ruleScore EOF
            {
             newCompositeNode(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScore=ruleScore();

            state._fsp--;

             current =iv_ruleScore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalLilyPond.g:312:1: ruleScore returns [EObject current=null] : ( () otherlv_1= '\\\\score' otherlv_2= '{' otherlv_3= '<<' ( (lv_staff_4_0= ruleStaff ) ) ( (lv_lyrics_5_0= ruleLyrics ) ) otherlv_6= '>>' otherlv_7= '}' ) ;
    public final EObject ruleScore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_staff_4_0 = null;

        EObject lv_lyrics_5_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:318:2: ( ( () otherlv_1= '\\\\score' otherlv_2= '{' otherlv_3= '<<' ( (lv_staff_4_0= ruleStaff ) ) ( (lv_lyrics_5_0= ruleLyrics ) ) otherlv_6= '>>' otherlv_7= '}' ) )
            // InternalLilyPond.g:319:2: ( () otherlv_1= '\\\\score' otherlv_2= '{' otherlv_3= '<<' ( (lv_staff_4_0= ruleStaff ) ) ( (lv_lyrics_5_0= ruleLyrics ) ) otherlv_6= '>>' otherlv_7= '}' )
            {
            // InternalLilyPond.g:319:2: ( () otherlv_1= '\\\\score' otherlv_2= '{' otherlv_3= '<<' ( (lv_staff_4_0= ruleStaff ) ) ( (lv_lyrics_5_0= ruleLyrics ) ) otherlv_6= '>>' otherlv_7= '}' )
            // InternalLilyPond.g:320:3: () otherlv_1= '\\\\score' otherlv_2= '{' otherlv_3= '<<' ( (lv_staff_4_0= ruleStaff ) ) ( (lv_lyrics_5_0= ruleLyrics ) ) otherlv_6= '>>' otherlv_7= '}'
            {
            // InternalLilyPond.g:320:3: ()
            // InternalLilyPond.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScoreAccess().getScoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getScoreAccess().getScoreKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getScoreAccess().getLessThanSignLessThanSignKeyword_3());
            		
            // InternalLilyPond.g:339:3: ( (lv_staff_4_0= ruleStaff ) )
            // InternalLilyPond.g:340:4: (lv_staff_4_0= ruleStaff )
            {
            // InternalLilyPond.g:340:4: (lv_staff_4_0= ruleStaff )
            // InternalLilyPond.g:341:5: lv_staff_4_0= ruleStaff
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getStaffStaffParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_staff_4_0=ruleStaff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"staff",
            						lv_staff_4_0,
            						"org.xtext.lilypond.LilyPond.Staff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:358:3: ( (lv_lyrics_5_0= ruleLyrics ) )
            // InternalLilyPond.g:359:4: (lv_lyrics_5_0= ruleLyrics )
            {
            // InternalLilyPond.g:359:4: (lv_lyrics_5_0= ruleLyrics )
            // InternalLilyPond.g:360:5: lv_lyrics_5_0= ruleLyrics
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getLyricsLyricsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_lyrics_5_0=ruleLyrics();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"lyrics",
            						lv_lyrics_5_0,
            						"org.xtext.lilypond.LilyPond.Lyrics");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getScoreAccess().getGreaterThanSignGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleStaff"
    // InternalLilyPond.g:389:1: entryRuleStaff returns [EObject current=null] : iv_ruleStaff= ruleStaff EOF ;
    public final EObject entryRuleStaff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaff = null;


        try {
            // InternalLilyPond.g:389:46: (iv_ruleStaff= ruleStaff EOF )
            // InternalLilyPond.g:390:2: iv_ruleStaff= ruleStaff EOF
            {
             newCompositeNode(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaff=ruleStaff();

            state._fsp--;

             current =iv_ruleStaff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalLilyPond.g:396:1: ruleStaff returns [EObject current=null] : ( () otherlv_1= '\\\\new' otherlv_2= 'Staff' otherlv_3= '{' ( (lv_key_4_0= ruleKey ) ) ( (lv_time_5_0= ruleTime ) ) ( (lv_absolute_6_0= ruleAbsolute ) ) otherlv_7= '}' ) ;
    public final EObject ruleStaff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_key_4_0 = null;

        EObject lv_time_5_0 = null;

        EObject lv_absolute_6_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:402:2: ( ( () otherlv_1= '\\\\new' otherlv_2= 'Staff' otherlv_3= '{' ( (lv_key_4_0= ruleKey ) ) ( (lv_time_5_0= ruleTime ) ) ( (lv_absolute_6_0= ruleAbsolute ) ) otherlv_7= '}' ) )
            // InternalLilyPond.g:403:2: ( () otherlv_1= '\\\\new' otherlv_2= 'Staff' otherlv_3= '{' ( (lv_key_4_0= ruleKey ) ) ( (lv_time_5_0= ruleTime ) ) ( (lv_absolute_6_0= ruleAbsolute ) ) otherlv_7= '}' )
            {
            // InternalLilyPond.g:403:2: ( () otherlv_1= '\\\\new' otherlv_2= 'Staff' otherlv_3= '{' ( (lv_key_4_0= ruleKey ) ) ( (lv_time_5_0= ruleTime ) ) ( (lv_absolute_6_0= ruleAbsolute ) ) otherlv_7= '}' )
            // InternalLilyPond.g:404:3: () otherlv_1= '\\\\new' otherlv_2= 'Staff' otherlv_3= '{' ( (lv_key_4_0= ruleKey ) ) ( (lv_time_5_0= ruleTime ) ) ( (lv_absolute_6_0= ruleAbsolute ) ) otherlv_7= '}'
            {
            // InternalLilyPond.g:404:3: ()
            // InternalLilyPond.g:405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaffAccess().getStaffAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getStaffAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStaffAccess().getStaffKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getStaffAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLilyPond.g:423:3: ( (lv_key_4_0= ruleKey ) )
            // InternalLilyPond.g:424:4: (lv_key_4_0= ruleKey )
            {
            // InternalLilyPond.g:424:4: (lv_key_4_0= ruleKey )
            // InternalLilyPond.g:425:5: lv_key_4_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_key_4_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_4_0,
            						"org.xtext.lilypond.LilyPond.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:442:3: ( (lv_time_5_0= ruleTime ) )
            // InternalLilyPond.g:443:4: (lv_time_5_0= ruleTime )
            {
            // InternalLilyPond.g:443:4: (lv_time_5_0= ruleTime )
            // InternalLilyPond.g:444:5: lv_time_5_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getTimeTimeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_time_5_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.xtext.lilypond.LilyPond.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:461:3: ( (lv_absolute_6_0= ruleAbsolute ) )
            // InternalLilyPond.g:462:4: (lv_absolute_6_0= ruleAbsolute )
            {
            // InternalLilyPond.g:462:4: (lv_absolute_6_0= ruleAbsolute )
            // InternalLilyPond.g:463:5: lv_absolute_6_0= ruleAbsolute
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getAbsoluteAbsoluteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_absolute_6_0=ruleAbsolute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"absolute",
            						lv_absolute_6_0,
            						"org.xtext.lilypond.LilyPond.Absolute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStaffAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleKey"
    // InternalLilyPond.g:488:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalLilyPond.g:488:44: (iv_ruleKey= ruleKey EOF )
            // InternalLilyPond.g:489:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalLilyPond.g:495:1: ruleKey returns [EObject current=null] : ( () otherlv_1= '\\\\key' otherlv_2= 'c' otherlv_3= '\\\\major' ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLilyPond.g:501:2: ( ( () otherlv_1= '\\\\key' otherlv_2= 'c' otherlv_3= '\\\\major' ) )
            // InternalLilyPond.g:502:2: ( () otherlv_1= '\\\\key' otherlv_2= 'c' otherlv_3= '\\\\major' )
            {
            // InternalLilyPond.g:502:2: ( () otherlv_1= '\\\\key' otherlv_2= 'c' otherlv_3= '\\\\major' )
            // InternalLilyPond.g:503:3: () otherlv_1= '\\\\key' otherlv_2= 'c' otherlv_3= '\\\\major'
            {
            // InternalLilyPond.g:503:3: ()
            // InternalLilyPond.g:504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyAccess().getKeyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getKeyKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getKeyAccess().getCKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyAccess().getMajorKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleTime"
    // InternalLilyPond.g:526:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalLilyPond.g:526:45: (iv_ruleTime= ruleTime EOF )
            // InternalLilyPond.g:527:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalLilyPond.g:533:1: ruleTime returns [EObject current=null] : ( () otherlv_1= '\\\\time' otherlv_2= '4/4' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLilyPond.g:539:2: ( ( () otherlv_1= '\\\\time' otherlv_2= '4/4' ) )
            // InternalLilyPond.g:540:2: ( () otherlv_1= '\\\\time' otherlv_2= '4/4' )
            {
            // InternalLilyPond.g:540:2: ( () otherlv_1= '\\\\time' otherlv_2= '4/4' )
            // InternalLilyPond.g:541:3: () otherlv_1= '\\\\time' otherlv_2= '4/4'
            {
            // InternalLilyPond.g:541:3: ()
            // InternalLilyPond.g:542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getDigitFourSolidusDigitFourKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleAbsolute"
    // InternalLilyPond.g:560:1: entryRuleAbsolute returns [EObject current=null] : iv_ruleAbsolute= ruleAbsolute EOF ;
    public final EObject entryRuleAbsolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsolute = null;


        try {
            // InternalLilyPond.g:560:49: (iv_ruleAbsolute= ruleAbsolute EOF )
            // InternalLilyPond.g:561:2: iv_ruleAbsolute= ruleAbsolute EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsolute=ruleAbsolute();

            state._fsp--;

             current =iv_ruleAbsolute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbsolute"


    // $ANTLR start "ruleAbsolute"
    // InternalLilyPond.g:567:1: ruleAbsolute returns [EObject current=null] : ( () otherlv_1= '\\\\absolute' otherlv_2= '{' ( (lv_items_3_0= ruleNote ) )* otherlv_4= '}' ) ;
    public final EObject ruleAbsolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:573:2: ( ( () otherlv_1= '\\\\absolute' otherlv_2= '{' ( (lv_items_3_0= ruleNote ) )* otherlv_4= '}' ) )
            // InternalLilyPond.g:574:2: ( () otherlv_1= '\\\\absolute' otherlv_2= '{' ( (lv_items_3_0= ruleNote ) )* otherlv_4= '}' )
            {
            // InternalLilyPond.g:574:2: ( () otherlv_1= '\\\\absolute' otherlv_2= '{' ( (lv_items_3_0= ruleNote ) )* otherlv_4= '}' )
            // InternalLilyPond.g:575:3: () otherlv_1= '\\\\absolute' otherlv_2= '{' ( (lv_items_3_0= ruleNote ) )* otherlv_4= '}'
            {
            // InternalLilyPond.g:575:3: ()
            // InternalLilyPond.g:576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbsoluteAccess().getAbsoluteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAbsoluteAccess().getAbsoluteKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAbsoluteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLilyPond.g:590:3: ( (lv_items_3_0= ruleNote ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||(LA1_0>=31 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLilyPond.g:591:4: (lv_items_3_0= ruleNote )
            	    {
            	    // InternalLilyPond.g:591:4: (lv_items_3_0= ruleNote )
            	    // InternalLilyPond.g:592:5: lv_items_3_0= ruleNote
            	    {

            	    					newCompositeNode(grammarAccess.getAbsoluteAccess().getItemsNoteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_items_3_0=ruleNote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbsoluteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"org.xtext.lilypond.LilyPond.Note");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAbsoluteAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbsolute"


    // $ANTLR start "entryRuleNote"
    // InternalLilyPond.g:617:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalLilyPond.g:617:45: (iv_ruleNote= ruleNote EOF )
            // InternalLilyPond.g:618:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalLilyPond.g:624:1: ruleNote returns [EObject current=null] : ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctaveRep ) ) ( (lv_duration_3_0= RULE_INT ) ) ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_duration_3_0=null;
        Enumerator lv_name_1_0 = null;

        EObject lv_octave_2_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:630:2: ( ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctaveRep ) ) ( (lv_duration_3_0= RULE_INT ) ) ) )
            // InternalLilyPond.g:631:2: ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctaveRep ) ) ( (lv_duration_3_0= RULE_INT ) ) )
            {
            // InternalLilyPond.g:631:2: ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctaveRep ) ) ( (lv_duration_3_0= RULE_INT ) ) )
            // InternalLilyPond.g:632:3: () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctaveRep ) ) ( (lv_duration_3_0= RULE_INT ) )
            {
            // InternalLilyPond.g:632:3: ()
            // InternalLilyPond.g:633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteAccess().getNoteAction_0(),
            					current);
            			

            }

            // InternalLilyPond.g:639:3: ( (lv_name_1_0= ruleNoteName ) )
            // InternalLilyPond.g:640:4: (lv_name_1_0= ruleNoteName )
            {
            // InternalLilyPond.g:640:4: (lv_name_1_0= ruleNoteName )
            // InternalLilyPond.g:641:5: lv_name_1_0= ruleNoteName
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleNoteName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lilypond.LilyPond.NoteName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:658:3: ( (lv_octave_2_0= ruleOctaveRep ) )
            // InternalLilyPond.g:659:4: (lv_octave_2_0= ruleOctaveRep )
            {
            // InternalLilyPond.g:659:4: (lv_octave_2_0= ruleOctaveRep )
            // InternalLilyPond.g:660:5: lv_octave_2_0= ruleOctaveRep
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getOctaveOctaveRepParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_octave_2_0=ruleOctaveRep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"octave",
            						lv_octave_2_0,
            						"org.xtext.lilypond.LilyPond.OctaveRep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLilyPond.g:677:3: ( (lv_duration_3_0= RULE_INT ) )
            // InternalLilyPond.g:678:4: (lv_duration_3_0= RULE_INT )
            {
            // InternalLilyPond.g:678:4: (lv_duration_3_0= RULE_INT )
            // InternalLilyPond.g:679:5: lv_duration_3_0= RULE_INT
            {
            lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_duration_3_0, grammarAccess.getNoteAccess().getDurationINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleOctaveRep"
    // InternalLilyPond.g:699:1: entryRuleOctaveRep returns [EObject current=null] : iv_ruleOctaveRep= ruleOctaveRep EOF ;
    public final EObject entryRuleOctaveRep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctaveRep = null;


        try {
            // InternalLilyPond.g:699:50: (iv_ruleOctaveRep= ruleOctaveRep EOF )
            // InternalLilyPond.g:700:2: iv_ruleOctaveRep= ruleOctaveRep EOF
            {
             newCompositeNode(grammarAccess.getOctaveRepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOctaveRep=ruleOctaveRep();

            state._fsp--;

             current =iv_ruleOctaveRep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOctaveRep"


    // $ANTLR start "ruleOctaveRep"
    // InternalLilyPond.g:706:1: ruleOctaveRep returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleQuote ) )* ) | ( () ( (lv_value_3_0= ruleComma ) )* ) ) ;
    public final EObject ruleOctaveRep() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalLilyPond.g:712:2: ( ( ( () ( (lv_value_1_0= ruleQuote ) )* ) | ( () ( (lv_value_3_0= ruleComma ) )* ) ) )
            // InternalLilyPond.g:713:2: ( ( () ( (lv_value_1_0= ruleQuote ) )* ) | ( () ( (lv_value_3_0= ruleComma ) )* ) )
            {
            // InternalLilyPond.g:713:2: ( ( () ( (lv_value_1_0= ruleQuote ) )* ) | ( () ( (lv_value_3_0= ruleComma ) )* ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case EOF:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLilyPond.g:714:3: ( () ( (lv_value_1_0= ruleQuote ) )* )
                    {
                    // InternalLilyPond.g:714:3: ( () ( (lv_value_1_0= ruleQuote ) )* )
                    // InternalLilyPond.g:715:4: () ( (lv_value_1_0= ruleQuote ) )*
                    {
                    // InternalLilyPond.g:715:4: ()
                    // InternalLilyPond.g:716:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOctaveRepAccess().getQuotesAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLilyPond.g:722:4: ( (lv_value_1_0= ruleQuote ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==28) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLilyPond.g:723:5: (lv_value_1_0= ruleQuote )
                    	    {
                    	    // InternalLilyPond.g:723:5: (lv_value_1_0= ruleQuote )
                    	    // InternalLilyPond.g:724:6: lv_value_1_0= ruleQuote
                    	    {

                    	    						newCompositeNode(grammarAccess.getOctaveRepAccess().getValueQuoteParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_value_1_0=ruleQuote();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOctaveRepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"value",
                    	    							lv_value_1_0,
                    	    							"org.xtext.lilypond.LilyPond.Quote");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalLilyPond.g:743:3: ( () ( (lv_value_3_0= ruleComma ) )* )
                    {
                    // InternalLilyPond.g:743:3: ( () ( (lv_value_3_0= ruleComma ) )* )
                    // InternalLilyPond.g:744:4: () ( (lv_value_3_0= ruleComma ) )*
                    {
                    // InternalLilyPond.g:744:4: ()
                    // InternalLilyPond.g:745:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOctaveRepAccess().getCommasAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLilyPond.g:751:4: ( (lv_value_3_0= ruleComma ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalLilyPond.g:752:5: (lv_value_3_0= ruleComma )
                    	    {
                    	    // InternalLilyPond.g:752:5: (lv_value_3_0= ruleComma )
                    	    // InternalLilyPond.g:753:6: lv_value_3_0= ruleComma
                    	    {

                    	    						newCompositeNode(grammarAccess.getOctaveRepAccess().getValueCommaParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_value_3_0=ruleComma();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOctaveRepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"value",
                    	    							lv_value_3_0,
                    	    							"org.xtext.lilypond.LilyPond.Comma");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOctaveRep"


    // $ANTLR start "entryRuleQuote"
    // InternalLilyPond.g:775:1: entryRuleQuote returns [String current=null] : iv_ruleQuote= ruleQuote EOF ;
    public final String entryRuleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuote = null;


        try {
            // InternalLilyPond.g:775:45: (iv_ruleQuote= ruleQuote EOF )
            // InternalLilyPond.g:776:2: iv_ruleQuote= ruleQuote EOF
            {
             newCompositeNode(grammarAccess.getQuoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuote=ruleQuote();

            state._fsp--;

             current =iv_ruleQuote.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuote"


    // $ANTLR start "ruleQuote"
    // InternalLilyPond.g:782:1: ruleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLilyPond.g:788:2: (kw= '\\'' )
            // InternalLilyPond.g:789:2: kw= '\\''
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getQuoteAccess().getApostropheKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuote"


    // $ANTLR start "entryRuleComma"
    // InternalLilyPond.g:797:1: entryRuleComma returns [String current=null] : iv_ruleComma= ruleComma EOF ;
    public final String entryRuleComma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComma = null;


        try {
            // InternalLilyPond.g:797:45: (iv_ruleComma= ruleComma EOF )
            // InternalLilyPond.g:798:2: iv_ruleComma= ruleComma EOF
            {
             newCompositeNode(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComma=ruleComma();

            state._fsp--;

             current =iv_ruleComma.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // InternalLilyPond.g:804:1: ruleComma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleComma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLilyPond.g:810:2: (kw= ',' )
            // InternalLilyPond.g:811:2: kw= ','
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCommaAccess().getCommaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleLyrics"
    // InternalLilyPond.g:819:1: entryRuleLyrics returns [EObject current=null] : iv_ruleLyrics= ruleLyrics EOF ;
    public final EObject entryRuleLyrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLyrics = null;


        try {
            // InternalLilyPond.g:819:47: (iv_ruleLyrics= ruleLyrics EOF )
            // InternalLilyPond.g:820:2: iv_ruleLyrics= ruleLyrics EOF
            {
             newCompositeNode(grammarAccess.getLyricsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLyrics=ruleLyrics();

            state._fsp--;

             current =iv_ruleLyrics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLyrics"


    // $ANTLR start "ruleLyrics"
    // InternalLilyPond.g:826:1: ruleLyrics returns [EObject current=null] : ( () otherlv_1= '\\\\addlyrics' otherlv_2= '{' ( (lv_syllables_3_0= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleLyrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_syllables_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLilyPond.g:832:2: ( ( () otherlv_1= '\\\\addlyrics' otherlv_2= '{' ( (lv_syllables_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalLilyPond.g:833:2: ( () otherlv_1= '\\\\addlyrics' otherlv_2= '{' ( (lv_syllables_3_0= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalLilyPond.g:833:2: ( () otherlv_1= '\\\\addlyrics' otherlv_2= '{' ( (lv_syllables_3_0= RULE_STRING ) )* otherlv_4= '}' )
            // InternalLilyPond.g:834:3: () otherlv_1= '\\\\addlyrics' otherlv_2= '{' ( (lv_syllables_3_0= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalLilyPond.g:834:3: ()
            // InternalLilyPond.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLyricsAccess().getLyricsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLyricsAccess().getAddlyricsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getLyricsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLilyPond.g:849:3: ( (lv_syllables_3_0= RULE_STRING ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyPond.g:850:4: (lv_syllables_3_0= RULE_STRING )
            	    {
            	    // InternalLilyPond.g:850:4: (lv_syllables_3_0= RULE_STRING )
            	    // InternalLilyPond.g:851:5: lv_syllables_3_0= RULE_STRING
            	    {
            	    lv_syllables_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    					newLeafNode(lv_syllables_3_0, grammarAccess.getLyricsAccess().getSyllablesSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLyricsRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"syllables",
            	    						lv_syllables_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLyricsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLyrics"


    // $ANTLR start "ruleNoteName"
    // InternalLilyPond.g:875:1: ruleNoteName returns [Enumerator current=null] : ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) ) ;
    public final Enumerator ruleNoteName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalLilyPond.g:881:2: ( ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) ) )
            // InternalLilyPond.g:882:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) )
            {
            // InternalLilyPond.g:882:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 36:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLilyPond.g:883:3: (enumLiteral_0= 'a' )
                    {
                    // InternalLilyPond.g:883:3: (enumLiteral_0= 'a' )
                    // InternalLilyPond.g:884:4: enumLiteral_0= 'a'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyPond.g:891:3: (enumLiteral_1= 'b' )
                    {
                    // InternalLilyPond.g:891:3: (enumLiteral_1= 'b' )
                    // InternalLilyPond.g:892:4: enumLiteral_1= 'b'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLilyPond.g:899:3: (enumLiteral_2= 'c' )
                    {
                    // InternalLilyPond.g:899:3: (enumLiteral_2= 'c' )
                    // InternalLilyPond.g:900:4: enumLiteral_2= 'c'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLilyPond.g:907:3: (enumLiteral_3= 'd' )
                    {
                    // InternalLilyPond.g:907:3: (enumLiteral_3= 'd' )
                    // InternalLilyPond.g:908:4: enumLiteral_3= 'd'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLilyPond.g:915:3: (enumLiteral_4= 'e' )
                    {
                    // InternalLilyPond.g:915:3: (enumLiteral_4= 'e' )
                    // InternalLilyPond.g:916:4: enumLiteral_4= 'e'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLilyPond.g:923:3: (enumLiteral_5= 'f' )
                    {
                    // InternalLilyPond.g:923:3: (enumLiteral_5= 'f' )
                    // InternalLilyPond.g:924:4: enumLiteral_5= 'f'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLilyPond.g:931:3: (enumLiteral_6= 'g' )
                    {
                    // InternalLilyPond.g:931:3: (enumLiteral_6= 'g' )
                    // InternalLilyPond.g:932:4: enumLiteral_6= 'g'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F80804000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004010L});

}