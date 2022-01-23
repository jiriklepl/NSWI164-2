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
import org.xtext.lilypond.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'phrase'", "'song'", "'{'", "'}'", "'\\\\'", "'+'", "'-'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:65:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalDsl.g:65:45: (iv_ruleFile= ruleFile EOF )
            // InternalDsl.g:66:2: iv_ruleFile= ruleFile EOF
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
    // InternalDsl.g:72:1: ruleFile returns [EObject current=null] : ( () ( (lv_phrases_1_0= rulePhrase ) )* ( (lv_song_2_0= ruleSong ) ) ( (lv_phrases_3_0= rulePhrase ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_phrases_1_0 = null;

        EObject lv_song_2_0 = null;

        EObject lv_phrases_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () ( (lv_phrases_1_0= rulePhrase ) )* ( (lv_song_2_0= ruleSong ) ) ( (lv_phrases_3_0= rulePhrase ) )* ) )
            // InternalDsl.g:79:2: ( () ( (lv_phrases_1_0= rulePhrase ) )* ( (lv_song_2_0= ruleSong ) ) ( (lv_phrases_3_0= rulePhrase ) )* )
            {
            // InternalDsl.g:79:2: ( () ( (lv_phrases_1_0= rulePhrase ) )* ( (lv_song_2_0= ruleSong ) ) ( (lv_phrases_3_0= rulePhrase ) )* )
            // InternalDsl.g:80:3: () ( (lv_phrases_1_0= rulePhrase ) )* ( (lv_song_2_0= ruleSong ) ) ( (lv_phrases_3_0= rulePhrase ) )*
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalDsl.g:87:3: ( (lv_phrases_1_0= rulePhrase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:88:4: (lv_phrases_1_0= rulePhrase )
            	    {
            	    // InternalDsl.g:88:4: (lv_phrases_1_0= rulePhrase )
            	    // InternalDsl.g:89:5: lv_phrases_1_0= rulePhrase
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_phrases_1_0=rulePhrase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"phrases",
            	    						lv_phrases_1_0,
            	    						"org.xtext.lilypond.Dsl.Phrase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:106:3: ( (lv_song_2_0= ruleSong ) )
            // InternalDsl.g:107:4: (lv_song_2_0= ruleSong )
            {
            // InternalDsl.g:107:4: (lv_song_2_0= ruleSong )
            // InternalDsl.g:108:5: lv_song_2_0= ruleSong
            {

            					newCompositeNode(grammarAccess.getFileAccess().getSongSongParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_song_2_0=ruleSong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"song",
            						lv_song_2_0,
            						"org.xtext.lilypond.Dsl.Song");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:125:3: ( (lv_phrases_3_0= rulePhrase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:126:4: (lv_phrases_3_0= rulePhrase )
            	    {
            	    // InternalDsl.g:126:4: (lv_phrases_3_0= rulePhrase )
            	    // InternalDsl.g:127:5: lv_phrases_3_0= rulePhrase
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_phrases_3_0=rulePhrase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"phrases",
            	    						lv_phrases_3_0,
            	    						"org.xtext.lilypond.Dsl.Phrase");
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


    // $ANTLR start "entryRulePhrase"
    // InternalDsl.g:148:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalDsl.g:148:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalDsl.g:149:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalDsl.g:155:1: rulePhrase returns [EObject current=null] : ( () otherlv_1= 'phrase' ( (lv_name_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleBody ) ) ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:161:2: ( ( () otherlv_1= 'phrase' ( (lv_name_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleBody ) ) ) )
            // InternalDsl.g:162:2: ( () otherlv_1= 'phrase' ( (lv_name_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleBody ) ) )
            {
            // InternalDsl.g:162:2: ( () otherlv_1= 'phrase' ( (lv_name_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleBody ) ) )
            // InternalDsl.g:163:3: () otherlv_1= 'phrase' ( (lv_name_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleBody ) )
            {
            // InternalDsl.g:163:3: ()
            // InternalDsl.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhraseAccess().getPhraseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPhraseAccess().getPhraseKeyword_1());
            		
            // InternalDsl.g:174:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:175:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:175:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:176:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:192:3: ( (lv_body_3_0= ruleBody ) )
            // InternalDsl.g:193:4: (lv_body_3_0= ruleBody )
            {
            // InternalDsl.g:193:4: (lv_body_3_0= ruleBody )
            // InternalDsl.g:194:5: lv_body_3_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getPhraseAccess().getBodyBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhraseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.xtext.lilypond.Dsl.Body");
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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleSong"
    // InternalDsl.g:215:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // InternalDsl.g:215:45: (iv_ruleSong= ruleSong EOF )
            // InternalDsl.g:216:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
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
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // InternalDsl.g:222:1: ruleSong returns [EObject current=null] : ( () otherlv_1= 'song' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_body_3_0= ruleBody ) ) ) ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:228:2: ( ( () otherlv_1= 'song' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_body_3_0= ruleBody ) ) ) )
            // InternalDsl.g:229:2: ( () otherlv_1= 'song' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_body_3_0= ruleBody ) ) )
            {
            // InternalDsl.g:229:2: ( () otherlv_1= 'song' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_body_3_0= ruleBody ) ) )
            // InternalDsl.g:230:3: () otherlv_1= 'song' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_body_3_0= ruleBody ) )
            {
            // InternalDsl.g:230:3: ()
            // InternalDsl.g:231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSongAccess().getSongAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSongAccess().getSongKeyword_1());
            		
            // InternalDsl.g:241:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDsl.g:242:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDsl.g:242:4: (lv_name_2_0= RULE_STRING )
            // InternalDsl.g:243:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSongAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:259:3: ( (lv_body_3_0= ruleBody ) )
            // InternalDsl.g:260:4: (lv_body_3_0= ruleBody )
            {
            // InternalDsl.g:260:4: (lv_body_3_0= ruleBody )
            // InternalDsl.g:261:5: lv_body_3_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getSongAccess().getBodyBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSongRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.xtext.lilypond.Dsl.Body");
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
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleBody"
    // InternalDsl.g:282:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalDsl.g:282:45: (iv_ruleBody= ruleBody EOF )
            // InternalDsl.g:283:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalDsl.g:289:1: ruleBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_content_2_0= ruleItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:295:2: ( ( () otherlv_1= '{' ( (lv_content_2_0= ruleItem ) )* otherlv_3= '}' ) )
            // InternalDsl.g:296:2: ( () otherlv_1= '{' ( (lv_content_2_0= ruleItem ) )* otherlv_3= '}' )
            {
            // InternalDsl.g:296:2: ( () otherlv_1= '{' ( (lv_content_2_0= ruleItem ) )* otherlv_3= '}' )
            // InternalDsl.g:297:3: () otherlv_1= '{' ( (lv_content_2_0= ruleItem ) )* otherlv_3= '}'
            {
            // InternalDsl.g:297:3: ()
            // InternalDsl.g:298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:308:3: ( (lv_content_2_0= ruleItem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=18 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:309:4: (lv_content_2_0= ruleItem )
            	    {
            	    // InternalDsl.g:309:4: (lv_content_2_0= ruleItem )
            	    // InternalDsl.g:310:5: lv_content_2_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getContentItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_content_2_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_2_0,
            	    						"org.xtext.lilypond.Dsl.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleItem"
    // InternalDsl.g:335:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalDsl.g:335:45: (iv_ruleItem= ruleItem EOF )
            // InternalDsl.g:336:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalDsl.g:342:1: ruleItem returns [EObject current=null] : ( ( () ( (lv_note_1_0= ruleNote ) ) ) | ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_phrase_4_0=null;
        EObject lv_note_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:348:2: ( ( ( () ( (lv_note_1_0= ruleNote ) ) ) | ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) ) ) )
            // InternalDsl.g:349:2: ( ( () ( (lv_note_1_0= ruleNote ) ) ) | ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) ) )
            {
            // InternalDsl.g:349:2: ( ( () ( (lv_note_1_0= ruleNote ) ) ) | ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:350:3: ( () ( (lv_note_1_0= ruleNote ) ) )
                    {
                    // InternalDsl.g:350:3: ( () ( (lv_note_1_0= ruleNote ) ) )
                    // InternalDsl.g:351:4: () ( (lv_note_1_0= ruleNote ) )
                    {
                    // InternalDsl.g:351:4: ()
                    // InternalDsl.g:352:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getItemAccess().getNoteItemAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:358:4: ( (lv_note_1_0= ruleNote ) )
                    // InternalDsl.g:359:5: (lv_note_1_0= ruleNote )
                    {
                    // InternalDsl.g:359:5: (lv_note_1_0= ruleNote )
                    // InternalDsl.g:360:6: lv_note_1_0= ruleNote
                    {

                    						newCompositeNode(grammarAccess.getItemAccess().getNoteNoteParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_note_1_0=ruleNote();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_1_0,
                    							"org.xtext.lilypond.Dsl.Note");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:379:3: ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) )
                    {
                    // InternalDsl.g:379:3: ( () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) ) )
                    // InternalDsl.g:380:4: () otherlv_3= '\\\\' ( (lv_phrase_4_0= RULE_ID ) )
                    {
                    // InternalDsl.g:380:4: ()
                    // InternalDsl.g:381:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getItemAccess().getPhraseItemAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getItemAccess().getBackslashKeyword_1_1());
                    			
                    // InternalDsl.g:391:4: ( (lv_phrase_4_0= RULE_ID ) )
                    // InternalDsl.g:392:5: (lv_phrase_4_0= RULE_ID )
                    {
                    // InternalDsl.g:392:5: (lv_phrase_4_0= RULE_ID )
                    // InternalDsl.g:393:6: lv_phrase_4_0= RULE_ID
                    {
                    lv_phrase_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_phrase_4_0, grammarAccess.getItemAccess().getPhraseIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"phrase",
                    							lv_phrase_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNote"
    // InternalDsl.g:414:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalDsl.g:414:45: (iv_ruleNote= ruleNote EOF )
            // InternalDsl.g:415:2: iv_ruleNote= ruleNote EOF
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
    // InternalDsl.g:421:1: ruleNote returns [EObject current=null] : ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctave ) )? ( (lv_duration_3_0= RULE_INT ) ) ( (lv_syllable_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_duration_3_0=null;
        Token lv_syllable_4_0=null;
        Enumerator lv_name_1_0 = null;

        EObject lv_octave_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:427:2: ( ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctave ) )? ( (lv_duration_3_0= RULE_INT ) ) ( (lv_syllable_4_0= RULE_STRING ) )? ) )
            // InternalDsl.g:428:2: ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctave ) )? ( (lv_duration_3_0= RULE_INT ) ) ( (lv_syllable_4_0= RULE_STRING ) )? )
            {
            // InternalDsl.g:428:2: ( () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctave ) )? ( (lv_duration_3_0= RULE_INT ) ) ( (lv_syllable_4_0= RULE_STRING ) )? )
            // InternalDsl.g:429:3: () ( (lv_name_1_0= ruleNoteName ) ) ( (lv_octave_2_0= ruleOctave ) )? ( (lv_duration_3_0= RULE_INT ) ) ( (lv_syllable_4_0= RULE_STRING ) )?
            {
            // InternalDsl.g:429:3: ()
            // InternalDsl.g:430:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteAccess().getNoteAction_0(),
            					current);
            			

            }

            // InternalDsl.g:436:3: ( (lv_name_1_0= ruleNoteName ) )
            // InternalDsl.g:437:4: (lv_name_1_0= ruleNoteName )
            {
            // InternalDsl.g:437:4: (lv_name_1_0= ruleNoteName )
            // InternalDsl.g:438:5: lv_name_1_0= ruleNoteName
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleNoteName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lilypond.Dsl.NoteName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:455:3: ( (lv_octave_2_0= ruleOctave ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:456:4: (lv_octave_2_0= ruleOctave )
                    {
                    // InternalDsl.g:456:4: (lv_octave_2_0= ruleOctave )
                    // InternalDsl.g:457:5: lv_octave_2_0= ruleOctave
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getOctaveOctaveParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_octave_2_0=ruleOctave();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"octave",
                    						lv_octave_2_0,
                    						"org.xtext.lilypond.Dsl.Octave");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:474:3: ( (lv_duration_3_0= RULE_INT ) )
            // InternalDsl.g:475:4: (lv_duration_3_0= RULE_INT )
            {
            // InternalDsl.g:475:4: (lv_duration_3_0= RULE_INT )
            // InternalDsl.g:476:5: lv_duration_3_0= RULE_INT
            {
            lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            // InternalDsl.g:492:3: ( (lv_syllable_4_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:493:4: (lv_syllable_4_0= RULE_STRING )
                    {
                    // InternalDsl.g:493:4: (lv_syllable_4_0= RULE_STRING )
                    // InternalDsl.g:494:5: lv_syllable_4_0= RULE_STRING
                    {
                    lv_syllable_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_syllable_4_0, grammarAccess.getNoteAccess().getSyllableSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"syllable",
                    						lv_syllable_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleOctave"
    // InternalDsl.g:514:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // InternalDsl.g:514:47: (iv_ruleOctave= ruleOctave EOF )
            // InternalDsl.g:515:2: iv_ruleOctave= ruleOctave EOF
            {
             newCompositeNode(grammarAccess.getOctaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOctave=ruleOctave();

            state._fsp--;

             current =iv_ruleOctave; 
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
    // $ANTLR end "entryRuleOctave"


    // $ANTLR start "ruleOctave"
    // InternalDsl.g:521:1: ruleOctave returns [EObject current=null] : ( ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) ) | ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalDsl.g:527:2: ( ( ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) ) | ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalDsl.g:528:2: ( ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) ) | ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalDsl.g:528:2: ( ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) ) | ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:529:3: ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:529:3: ( () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) ) )
                    // InternalDsl.g:530:4: () otherlv_1= '+' ( (lv_value_2_0= RULE_INT ) )
                    {
                    // InternalDsl.g:530:4: ()
                    // InternalDsl.g:531:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOctaveAccess().getIsAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getOctaveAccess().getPlusSignKeyword_0_1());
                    			
                    // InternalDsl.g:541:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalDsl.g:542:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalDsl.g:542:5: (lv_value_2_0= RULE_INT )
                    // InternalDsl.g:543:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOctaveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:561:3: ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:561:3: ( () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalDsl.g:562:4: () otherlv_4= '-' ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalDsl.g:562:4: ()
                    // InternalDsl.g:563:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOctaveAccess().getEsAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getOctaveAccess().getHyphenMinusKeyword_1_1());
                    			
                    // InternalDsl.g:573:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalDsl.g:574:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalDsl.g:574:5: (lv_value_5_0= RULE_INT )
                    // InternalDsl.g:575:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOctaveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleOctave"


    // $ANTLR start "ruleNoteName"
    // InternalDsl.g:596:1: ruleNoteName returns [Enumerator current=null] : ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) ) ;
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
            // InternalDsl.g:602:2: ( ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) ) )
            // InternalDsl.g:603:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) )
            {
            // InternalDsl.g:603:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) | (enumLiteral_2= 'c' ) | (enumLiteral_3= 'd' ) | (enumLiteral_4= 'e' ) | (enumLiteral_5= 'f' ) | (enumLiteral_6= 'g' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:604:3: (enumLiteral_0= 'a' )
                    {
                    // InternalDsl.g:604:3: (enumLiteral_0= 'a' )
                    // InternalDsl.g:605:4: enumLiteral_0= 'a'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:612:3: (enumLiteral_1= 'b' )
                    {
                    // InternalDsl.g:612:3: (enumLiteral_1= 'b' )
                    // InternalDsl.g:613:4: enumLiteral_1= 'b'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:620:3: (enumLiteral_2= 'c' )
                    {
                    // InternalDsl.g:620:3: (enumLiteral_2= 'c' )
                    // InternalDsl.g:621:4: enumLiteral_2= 'c'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:628:3: (enumLiteral_3= 'd' )
                    {
                    // InternalDsl.g:628:3: (enumLiteral_3= 'd' )
                    // InternalDsl.g:629:4: enumLiteral_3= 'd'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:636:3: (enumLiteral_4= 'e' )
                    {
                    // InternalDsl.g:636:3: (enumLiteral_4= 'e' )
                    // InternalDsl.g:637:4: enumLiteral_4= 'e'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:644:3: (enumLiteral_5= 'f' )
                    {
                    // InternalDsl.g:644:3: (enumLiteral_5= 'f' )
                    // InternalDsl.g:645:4: enumLiteral_5= 'f'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:652:3: (enumLiteral_6= 'g' )
                    {
                    // InternalDsl.g:652:3: (enumLiteral_6= 'g' )
                    // InternalDsl.g:653:4: enumLiteral_6= 'g'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001FCC000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});

}