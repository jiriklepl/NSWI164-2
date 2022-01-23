package org.xtext.lilypond.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.lilypond.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'phrase'", "'song'", "'{'", "'}'", "'\\\\'", "'+'", "'-'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleFile EOF )
            // InternalDsl.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDsl.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__File__Group__0 )
            // InternalDsl.g:69:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRulePhrase"
    // InternalDsl.g:78:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePhrase EOF )
            // InternalDsl.g:80:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalDsl.g:87:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Phrase__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Phrase__Group__0 )
            // InternalDsl.g:94:4: rule__Phrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleSong"
    // InternalDsl.g:103:1: entryRuleSong : ruleSong EOF ;
    public final void entryRuleSong() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSong EOF )
            // InternalDsl.g:105:1: ruleSong EOF
            {
             before(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_1);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getSongRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // InternalDsl.g:112:1: ruleSong : ( ( rule__Song__Group__0 ) ) ;
    public final void ruleSong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Song__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Song__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Song__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Song__Group__0 )
            {
             before(grammarAccess.getSongAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Song__Group__0 )
            // InternalDsl.g:119:4: rule__Song__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Song__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleBody"
    // InternalDsl.g:128:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleBody EOF )
            // InternalDsl.g:130:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalDsl.g:137:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Body__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Body__Group__0 )
            // InternalDsl.g:144:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleItem"
    // InternalDsl.g:153:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleItem EOF )
            // InternalDsl.g:155:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalDsl.g:162:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Item__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__Item__Alternatives )
            // InternalDsl.g:169:4: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNote"
    // InternalDsl.g:178:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleNote EOF )
            // InternalDsl.g:180:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalDsl.g:187:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Note__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Note__Group__0 )
            // InternalDsl.g:194:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleOctave"
    // InternalDsl.g:203:1: entryRuleOctave : ruleOctave EOF ;
    public final void entryRuleOctave() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleOctave EOF )
            // InternalDsl.g:205:1: ruleOctave EOF
            {
             before(grammarAccess.getOctaveRule()); 
            pushFollow(FOLLOW_1);
            ruleOctave();

            state._fsp--;

             after(grammarAccess.getOctaveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOctave"


    // $ANTLR start "ruleOctave"
    // InternalDsl.g:212:1: ruleOctave : ( ( rule__Octave__Alternatives ) ) ;
    public final void ruleOctave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Octave__Alternatives ) ) )
            // InternalDsl.g:217:2: ( ( rule__Octave__Alternatives ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Octave__Alternatives ) )
            // InternalDsl.g:218:3: ( rule__Octave__Alternatives )
            {
             before(grammarAccess.getOctaveAccess().getAlternatives()); 
            // InternalDsl.g:219:3: ( rule__Octave__Alternatives )
            // InternalDsl.g:219:4: rule__Octave__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Octave__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOctaveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOctave"


    // $ANTLR start "ruleNoteName"
    // InternalDsl.g:228:1: ruleNoteName : ( ( rule__NoteName__Alternatives ) ) ;
    public final void ruleNoteName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:232:1: ( ( ( rule__NoteName__Alternatives ) ) )
            // InternalDsl.g:233:2: ( ( rule__NoteName__Alternatives ) )
            {
            // InternalDsl.g:233:2: ( ( rule__NoteName__Alternatives ) )
            // InternalDsl.g:234:3: ( rule__NoteName__Alternatives )
            {
             before(grammarAccess.getNoteNameAccess().getAlternatives()); 
            // InternalDsl.g:235:3: ( rule__NoteName__Alternatives )
            // InternalDsl.g:235:4: rule__NoteName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteName"


    // $ANTLR start "rule__Item__Alternatives"
    // InternalDsl.g:243:1: rule__Item__Alternatives : ( ( ( rule__Item__Group_0__0 ) ) | ( ( rule__Item__Group_1__0 ) ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:247:1: ( ( ( rule__Item__Group_0__0 ) ) | ( ( rule__Item__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=17)) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:248:2: ( ( rule__Item__Group_0__0 ) )
                    {
                    // InternalDsl.g:248:2: ( ( rule__Item__Group_0__0 ) )
                    // InternalDsl.g:249:3: ( rule__Item__Group_0__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_0()); 
                    // InternalDsl.g:250:3: ( rule__Item__Group_0__0 )
                    // InternalDsl.g:250:4: rule__Item__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:254:2: ( ( rule__Item__Group_1__0 ) )
                    {
                    // InternalDsl.g:254:2: ( ( rule__Item__Group_1__0 ) )
                    // InternalDsl.g:255:3: ( rule__Item__Group_1__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1()); 
                    // InternalDsl.g:256:3: ( rule__Item__Group_1__0 )
                    // InternalDsl.g:256:4: rule__Item__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__Octave__Alternatives"
    // InternalDsl.g:264:1: rule__Octave__Alternatives : ( ( ( rule__Octave__Group_0__0 ) ) | ( ( rule__Octave__Group_1__0 ) ) );
    public final void rule__Octave__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:268:1: ( ( ( rule__Octave__Group_0__0 ) ) | ( ( rule__Octave__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:269:2: ( ( rule__Octave__Group_0__0 ) )
                    {
                    // InternalDsl.g:269:2: ( ( rule__Octave__Group_0__0 ) )
                    // InternalDsl.g:270:3: ( rule__Octave__Group_0__0 )
                    {
                     before(grammarAccess.getOctaveAccess().getGroup_0()); 
                    // InternalDsl.g:271:3: ( rule__Octave__Group_0__0 )
                    // InternalDsl.g:271:4: rule__Octave__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Octave__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctaveAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:275:2: ( ( rule__Octave__Group_1__0 ) )
                    {
                    // InternalDsl.g:275:2: ( ( rule__Octave__Group_1__0 ) )
                    // InternalDsl.g:276:3: ( rule__Octave__Group_1__0 )
                    {
                     before(grammarAccess.getOctaveAccess().getGroup_1()); 
                    // InternalDsl.g:277:3: ( rule__Octave__Group_1__0 )
                    // InternalDsl.g:277:4: rule__Octave__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Octave__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctaveAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Alternatives"


    // $ANTLR start "rule__NoteName__Alternatives"
    // InternalDsl.g:285:1: rule__NoteName__Alternatives : ( ( ( 'a' ) ) | ( ( 'b' ) ) | ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) );
    public final void rule__NoteName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:289:1: ( ( ( 'a' ) ) | ( ( 'b' ) ) | ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:290:2: ( ( 'a' ) )
                    {
                    // InternalDsl.g:290:2: ( ( 'a' ) )
                    // InternalDsl.g:291:3: ( 'a' )
                    {
                     before(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:292:3: ( 'a' )
                    // InternalDsl.g:292:4: 'a'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:296:2: ( ( 'b' ) )
                    {
                    // InternalDsl.g:296:2: ( ( 'b' ) )
                    // InternalDsl.g:297:3: ( 'b' )
                    {
                     before(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:298:3: ( 'b' )
                    // InternalDsl.g:298:4: 'b'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:302:2: ( ( 'c' ) )
                    {
                    // InternalDsl.g:302:2: ( ( 'c' ) )
                    // InternalDsl.g:303:3: ( 'c' )
                    {
                     before(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:304:3: ( 'c' )
                    // InternalDsl.g:304:4: 'c'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:308:2: ( ( 'd' ) )
                    {
                    // InternalDsl.g:308:2: ( ( 'd' ) )
                    // InternalDsl.g:309:3: ( 'd' )
                    {
                     before(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:310:3: ( 'd' )
                    // InternalDsl.g:310:4: 'd'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:314:2: ( ( 'e' ) )
                    {
                    // InternalDsl.g:314:2: ( ( 'e' ) )
                    // InternalDsl.g:315:3: ( 'e' )
                    {
                     before(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:316:3: ( 'e' )
                    // InternalDsl.g:316:4: 'e'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:320:2: ( ( 'f' ) )
                    {
                    // InternalDsl.g:320:2: ( ( 'f' ) )
                    // InternalDsl.g:321:3: ( 'f' )
                    {
                     before(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:322:3: ( 'f' )
                    // InternalDsl.g:322:4: 'f'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:326:2: ( ( 'g' ) )
                    {
                    // InternalDsl.g:326:2: ( ( 'g' ) )
                    // InternalDsl.g:327:3: ( 'g' )
                    {
                     before(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:328:3: ( 'g' )
                    // InternalDsl.g:328:4: 'g'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteName__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalDsl.g:336:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:340:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalDsl.g:341:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalDsl.g:348:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:352:1: ( ( () ) )
            // InternalDsl.g:353:1: ( () )
            {
            // InternalDsl.g:353:1: ( () )
            // InternalDsl.g:354:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalDsl.g:355:2: ()
            // InternalDsl.g:355:3: 
            {
            }

             after(grammarAccess.getFileAccess().getFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalDsl.g:363:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:367:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalDsl.g:368:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalDsl.g:375:1: rule__File__Group__1__Impl : ( ( rule__File__PhrasesAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:379:1: ( ( ( rule__File__PhrasesAssignment_1 )* ) )
            // InternalDsl.g:380:1: ( ( rule__File__PhrasesAssignment_1 )* )
            {
            // InternalDsl.g:380:1: ( ( rule__File__PhrasesAssignment_1 )* )
            // InternalDsl.g:381:2: ( rule__File__PhrasesAssignment_1 )*
            {
             before(grammarAccess.getFileAccess().getPhrasesAssignment_1()); 
            // InternalDsl.g:382:2: ( rule__File__PhrasesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:382:3: rule__File__PhrasesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__PhrasesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getPhrasesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalDsl.g:390:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:394:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalDsl.g:395:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalDsl.g:402:1: rule__File__Group__2__Impl : ( ( rule__File__SongAssignment_2 ) ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:1: ( ( ( rule__File__SongAssignment_2 ) ) )
            // InternalDsl.g:407:1: ( ( rule__File__SongAssignment_2 ) )
            {
            // InternalDsl.g:407:1: ( ( rule__File__SongAssignment_2 ) )
            // InternalDsl.g:408:2: ( rule__File__SongAssignment_2 )
            {
             before(grammarAccess.getFileAccess().getSongAssignment_2()); 
            // InternalDsl.g:409:2: ( rule__File__SongAssignment_2 )
            // InternalDsl.g:409:3: rule__File__SongAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__File__SongAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getSongAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalDsl.g:417:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:421:1: ( rule__File__Group__3__Impl )
            // InternalDsl.g:422:2: rule__File__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalDsl.g:428:1: rule__File__Group__3__Impl : ( ( rule__File__PhrasesAssignment_3 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:432:1: ( ( ( rule__File__PhrasesAssignment_3 )* ) )
            // InternalDsl.g:433:1: ( ( rule__File__PhrasesAssignment_3 )* )
            {
            // InternalDsl.g:433:1: ( ( rule__File__PhrasesAssignment_3 )* )
            // InternalDsl.g:434:2: ( rule__File__PhrasesAssignment_3 )*
            {
             before(grammarAccess.getFileAccess().getPhrasesAssignment_3()); 
            // InternalDsl.g:435:2: ( rule__File__PhrasesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:435:3: rule__File__PhrasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__PhrasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getPhrasesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalDsl.g:444:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:448:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalDsl.g:449:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Phrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0"


    // $ANTLR start "rule__Phrase__Group__0__Impl"
    // InternalDsl.g:456:1: rule__Phrase__Group__0__Impl : ( () ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:460:1: ( ( () ) )
            // InternalDsl.g:461:1: ( () )
            {
            // InternalDsl.g:461:1: ( () )
            // InternalDsl.g:462:2: ()
            {
             before(grammarAccess.getPhraseAccess().getPhraseAction_0()); 
            // InternalDsl.g:463:2: ()
            // InternalDsl.g:463:3: 
            {
            }

             after(grammarAccess.getPhraseAccess().getPhraseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0__Impl"


    // $ANTLR start "rule__Phrase__Group__1"
    // InternalDsl.g:471:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl rule__Phrase__Group__2 ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:475:1: ( rule__Phrase__Group__1__Impl rule__Phrase__Group__2 )
            // InternalDsl.g:476:2: rule__Phrase__Group__1__Impl rule__Phrase__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Phrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1"


    // $ANTLR start "rule__Phrase__Group__1__Impl"
    // InternalDsl.g:483:1: rule__Phrase__Group__1__Impl : ( 'phrase' ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:487:1: ( ( 'phrase' ) )
            // InternalDsl.g:488:1: ( 'phrase' )
            {
            // InternalDsl.g:488:1: ( 'phrase' )
            // InternalDsl.g:489:2: 'phrase'
            {
             before(grammarAccess.getPhraseAccess().getPhraseKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getPhraseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1__Impl"


    // $ANTLR start "rule__Phrase__Group__2"
    // InternalDsl.g:498:1: rule__Phrase__Group__2 : rule__Phrase__Group__2__Impl rule__Phrase__Group__3 ;
    public final void rule__Phrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:502:1: ( rule__Phrase__Group__2__Impl rule__Phrase__Group__3 )
            // InternalDsl.g:503:2: rule__Phrase__Group__2__Impl rule__Phrase__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Phrase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__2"


    // $ANTLR start "rule__Phrase__Group__2__Impl"
    // InternalDsl.g:510:1: rule__Phrase__Group__2__Impl : ( ( rule__Phrase__NameAssignment_2 ) ) ;
    public final void rule__Phrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( ( ( rule__Phrase__NameAssignment_2 ) ) )
            // InternalDsl.g:515:1: ( ( rule__Phrase__NameAssignment_2 ) )
            {
            // InternalDsl.g:515:1: ( ( rule__Phrase__NameAssignment_2 ) )
            // InternalDsl.g:516:2: ( rule__Phrase__NameAssignment_2 )
            {
             before(grammarAccess.getPhraseAccess().getNameAssignment_2()); 
            // InternalDsl.g:517:2: ( rule__Phrase__NameAssignment_2 )
            // InternalDsl.g:517:3: rule__Phrase__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__2__Impl"


    // $ANTLR start "rule__Phrase__Group__3"
    // InternalDsl.g:525:1: rule__Phrase__Group__3 : rule__Phrase__Group__3__Impl ;
    public final void rule__Phrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:529:1: ( rule__Phrase__Group__3__Impl )
            // InternalDsl.g:530:2: rule__Phrase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__3"


    // $ANTLR start "rule__Phrase__Group__3__Impl"
    // InternalDsl.g:536:1: rule__Phrase__Group__3__Impl : ( ( rule__Phrase__BodyAssignment_3 ) ) ;
    public final void rule__Phrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:540:1: ( ( ( rule__Phrase__BodyAssignment_3 ) ) )
            // InternalDsl.g:541:1: ( ( rule__Phrase__BodyAssignment_3 ) )
            {
            // InternalDsl.g:541:1: ( ( rule__Phrase__BodyAssignment_3 ) )
            // InternalDsl.g:542:2: ( rule__Phrase__BodyAssignment_3 )
            {
             before(grammarAccess.getPhraseAccess().getBodyAssignment_3()); 
            // InternalDsl.g:543:2: ( rule__Phrase__BodyAssignment_3 )
            // InternalDsl.g:543:3: rule__Phrase__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__3__Impl"


    // $ANTLR start "rule__Song__Group__0"
    // InternalDsl.g:552:1: rule__Song__Group__0 : rule__Song__Group__0__Impl rule__Song__Group__1 ;
    public final void rule__Song__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( rule__Song__Group__0__Impl rule__Song__Group__1 )
            // InternalDsl.g:557:2: rule__Song__Group__0__Impl rule__Song__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Song__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Song__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__0"


    // $ANTLR start "rule__Song__Group__0__Impl"
    // InternalDsl.g:564:1: rule__Song__Group__0__Impl : ( () ) ;
    public final void rule__Song__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( ( () ) )
            // InternalDsl.g:569:1: ( () )
            {
            // InternalDsl.g:569:1: ( () )
            // InternalDsl.g:570:2: ()
            {
             before(grammarAccess.getSongAccess().getSongAction_0()); 
            // InternalDsl.g:571:2: ()
            // InternalDsl.g:571:3: 
            {
            }

             after(grammarAccess.getSongAccess().getSongAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__0__Impl"


    // $ANTLR start "rule__Song__Group__1"
    // InternalDsl.g:579:1: rule__Song__Group__1 : rule__Song__Group__1__Impl rule__Song__Group__2 ;
    public final void rule__Song__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:583:1: ( rule__Song__Group__1__Impl rule__Song__Group__2 )
            // InternalDsl.g:584:2: rule__Song__Group__1__Impl rule__Song__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Song__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Song__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__1"


    // $ANTLR start "rule__Song__Group__1__Impl"
    // InternalDsl.g:591:1: rule__Song__Group__1__Impl : ( 'song' ) ;
    public final void rule__Song__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( ( 'song' ) )
            // InternalDsl.g:596:1: ( 'song' )
            {
            // InternalDsl.g:596:1: ( 'song' )
            // InternalDsl.g:597:2: 'song'
            {
             before(grammarAccess.getSongAccess().getSongKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSongAccess().getSongKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__1__Impl"


    // $ANTLR start "rule__Song__Group__2"
    // InternalDsl.g:606:1: rule__Song__Group__2 : rule__Song__Group__2__Impl rule__Song__Group__3 ;
    public final void rule__Song__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:610:1: ( rule__Song__Group__2__Impl rule__Song__Group__3 )
            // InternalDsl.g:611:2: rule__Song__Group__2__Impl rule__Song__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Song__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Song__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__2"


    // $ANTLR start "rule__Song__Group__2__Impl"
    // InternalDsl.g:618:1: rule__Song__Group__2__Impl : ( ( rule__Song__NameAssignment_2 ) ) ;
    public final void rule__Song__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( ( ( rule__Song__NameAssignment_2 ) ) )
            // InternalDsl.g:623:1: ( ( rule__Song__NameAssignment_2 ) )
            {
            // InternalDsl.g:623:1: ( ( rule__Song__NameAssignment_2 ) )
            // InternalDsl.g:624:2: ( rule__Song__NameAssignment_2 )
            {
             before(grammarAccess.getSongAccess().getNameAssignment_2()); 
            // InternalDsl.g:625:2: ( rule__Song__NameAssignment_2 )
            // InternalDsl.g:625:3: rule__Song__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Song__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__2__Impl"


    // $ANTLR start "rule__Song__Group__3"
    // InternalDsl.g:633:1: rule__Song__Group__3 : rule__Song__Group__3__Impl ;
    public final void rule__Song__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:637:1: ( rule__Song__Group__3__Impl )
            // InternalDsl.g:638:2: rule__Song__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Song__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__3"


    // $ANTLR start "rule__Song__Group__3__Impl"
    // InternalDsl.g:644:1: rule__Song__Group__3__Impl : ( ( rule__Song__BodyAssignment_3 ) ) ;
    public final void rule__Song__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:648:1: ( ( ( rule__Song__BodyAssignment_3 ) ) )
            // InternalDsl.g:649:1: ( ( rule__Song__BodyAssignment_3 ) )
            {
            // InternalDsl.g:649:1: ( ( rule__Song__BodyAssignment_3 ) )
            // InternalDsl.g:650:2: ( rule__Song__BodyAssignment_3 )
            {
             before(grammarAccess.getSongAccess().getBodyAssignment_3()); 
            // InternalDsl.g:651:2: ( rule__Song__BodyAssignment_3 )
            // InternalDsl.g:651:3: rule__Song__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Song__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalDsl.g:660:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:664:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalDsl.g:665:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalDsl.g:672:1: rule__Body__Group__0__Impl : ( () ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:676:1: ( ( () ) )
            // InternalDsl.g:677:1: ( () )
            {
            // InternalDsl.g:677:1: ( () )
            // InternalDsl.g:678:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0()); 
            // InternalDsl.g:679:2: ()
            // InternalDsl.g:679:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalDsl.g:687:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalDsl.g:692:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalDsl.g:699:1: rule__Body__Group__1__Impl : ( '{' ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( ( '{' ) )
            // InternalDsl.g:704:1: ( '{' )
            {
            // InternalDsl.g:704:1: ( '{' )
            // InternalDsl.g:705:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // InternalDsl.g:714:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:718:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // InternalDsl.g:719:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // InternalDsl.g:726:1: rule__Body__Group__2__Impl : ( ( rule__Body__ContentAssignment_2 )* ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( ( ( rule__Body__ContentAssignment_2 )* ) )
            // InternalDsl.g:731:1: ( ( rule__Body__ContentAssignment_2 )* )
            {
            // InternalDsl.g:731:1: ( ( rule__Body__ContentAssignment_2 )* )
            // InternalDsl.g:732:2: ( rule__Body__ContentAssignment_2 )*
            {
             before(grammarAccess.getBodyAccess().getContentAssignment_2()); 
            // InternalDsl.g:733:2: ( rule__Body__ContentAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=17)||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:733:3: rule__Body__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Body__ContentAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // InternalDsl.g:741:1: rule__Body__Group__3 : rule__Body__Group__3__Impl ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:745:1: ( rule__Body__Group__3__Impl )
            // InternalDsl.g:746:2: rule__Body__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // InternalDsl.g:752:1: rule__Body__Group__3__Impl : ( '}' ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:756:1: ( ( '}' ) )
            // InternalDsl.g:757:1: ( '}' )
            {
            // InternalDsl.g:757:1: ( '}' )
            // InternalDsl.g:758:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Item__Group_0__0"
    // InternalDsl.g:768:1: rule__Item__Group_0__0 : rule__Item__Group_0__0__Impl rule__Item__Group_0__1 ;
    public final void rule__Item__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:772:1: ( rule__Item__Group_0__0__Impl rule__Item__Group_0__1 )
            // InternalDsl.g:773:2: rule__Item__Group_0__0__Impl rule__Item__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Item__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_0__0"


    // $ANTLR start "rule__Item__Group_0__0__Impl"
    // InternalDsl.g:780:1: rule__Item__Group_0__0__Impl : ( () ) ;
    public final void rule__Item__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( ( () ) )
            // InternalDsl.g:785:1: ( () )
            {
            // InternalDsl.g:785:1: ( () )
            // InternalDsl.g:786:2: ()
            {
             before(grammarAccess.getItemAccess().getNoteItemAction_0_0()); 
            // InternalDsl.g:787:2: ()
            // InternalDsl.g:787:3: 
            {
            }

             after(grammarAccess.getItemAccess().getNoteItemAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_0__0__Impl"


    // $ANTLR start "rule__Item__Group_0__1"
    // InternalDsl.g:795:1: rule__Item__Group_0__1 : rule__Item__Group_0__1__Impl ;
    public final void rule__Item__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:799:1: ( rule__Item__Group_0__1__Impl )
            // InternalDsl.g:800:2: rule__Item__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_0__1"


    // $ANTLR start "rule__Item__Group_0__1__Impl"
    // InternalDsl.g:806:1: rule__Item__Group_0__1__Impl : ( ( rule__Item__NoteAssignment_0_1 ) ) ;
    public final void rule__Item__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:810:1: ( ( ( rule__Item__NoteAssignment_0_1 ) ) )
            // InternalDsl.g:811:1: ( ( rule__Item__NoteAssignment_0_1 ) )
            {
            // InternalDsl.g:811:1: ( ( rule__Item__NoteAssignment_0_1 ) )
            // InternalDsl.g:812:2: ( rule__Item__NoteAssignment_0_1 )
            {
             before(grammarAccess.getItemAccess().getNoteAssignment_0_1()); 
            // InternalDsl.g:813:2: ( rule__Item__NoteAssignment_0_1 )
            // InternalDsl.g:813:3: rule__Item__NoteAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NoteAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNoteAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_0__1__Impl"


    // $ANTLR start "rule__Item__Group_1__0"
    // InternalDsl.g:822:1: rule__Item__Group_1__0 : rule__Item__Group_1__0__Impl rule__Item__Group_1__1 ;
    public final void rule__Item__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:826:1: ( rule__Item__Group_1__0__Impl rule__Item__Group_1__1 )
            // InternalDsl.g:827:2: rule__Item__Group_1__0__Impl rule__Item__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Item__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__0"


    // $ANTLR start "rule__Item__Group_1__0__Impl"
    // InternalDsl.g:834:1: rule__Item__Group_1__0__Impl : ( () ) ;
    public final void rule__Item__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( ( () ) )
            // InternalDsl.g:839:1: ( () )
            {
            // InternalDsl.g:839:1: ( () )
            // InternalDsl.g:840:2: ()
            {
             before(grammarAccess.getItemAccess().getPhraseItemAction_1_0()); 
            // InternalDsl.g:841:2: ()
            // InternalDsl.g:841:3: 
            {
            }

             after(grammarAccess.getItemAccess().getPhraseItemAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__0__Impl"


    // $ANTLR start "rule__Item__Group_1__1"
    // InternalDsl.g:849:1: rule__Item__Group_1__1 : rule__Item__Group_1__1__Impl rule__Item__Group_1__2 ;
    public final void rule__Item__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:853:1: ( rule__Item__Group_1__1__Impl rule__Item__Group_1__2 )
            // InternalDsl.g:854:2: rule__Item__Group_1__1__Impl rule__Item__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Item__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__1"


    // $ANTLR start "rule__Item__Group_1__1__Impl"
    // InternalDsl.g:861:1: rule__Item__Group_1__1__Impl : ( '\\\\' ) ;
    public final void rule__Item__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( ( '\\\\' ) )
            // InternalDsl.g:866:1: ( '\\\\' )
            {
            // InternalDsl.g:866:1: ( '\\\\' )
            // InternalDsl.g:867:2: '\\\\'
            {
             before(grammarAccess.getItemAccess().getBackslashKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getBackslashKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__1__Impl"


    // $ANTLR start "rule__Item__Group_1__2"
    // InternalDsl.g:876:1: rule__Item__Group_1__2 : rule__Item__Group_1__2__Impl ;
    public final void rule__Item__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:880:1: ( rule__Item__Group_1__2__Impl )
            // InternalDsl.g:881:2: rule__Item__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__2"


    // $ANTLR start "rule__Item__Group_1__2__Impl"
    // InternalDsl.g:887:1: rule__Item__Group_1__2__Impl : ( ( rule__Item__PhraseAssignment_1_2 ) ) ;
    public final void rule__Item__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:1: ( ( ( rule__Item__PhraseAssignment_1_2 ) ) )
            // InternalDsl.g:892:1: ( ( rule__Item__PhraseAssignment_1_2 ) )
            {
            // InternalDsl.g:892:1: ( ( rule__Item__PhraseAssignment_1_2 ) )
            // InternalDsl.g:893:2: ( rule__Item__PhraseAssignment_1_2 )
            {
             before(grammarAccess.getItemAccess().getPhraseAssignment_1_2()); 
            // InternalDsl.g:894:2: ( rule__Item__PhraseAssignment_1_2 )
            // InternalDsl.g:894:3: rule__Item__PhraseAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Item__PhraseAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getPhraseAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__2__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalDsl.g:903:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:907:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalDsl.g:908:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalDsl.g:915:1: rule__Note__Group__0__Impl : ( () ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( ( () ) )
            // InternalDsl.g:920:1: ( () )
            {
            // InternalDsl.g:920:1: ( () )
            // InternalDsl.g:921:2: ()
            {
             before(grammarAccess.getNoteAccess().getNoteAction_0()); 
            // InternalDsl.g:922:2: ()
            // InternalDsl.g:922:3: 
            {
            }

             after(grammarAccess.getNoteAccess().getNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalDsl.g:930:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:934:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalDsl.g:935:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalDsl.g:942:1: rule__Note__Group__1__Impl : ( ( rule__Note__NameAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( ( ( rule__Note__NameAssignment_1 ) ) )
            // InternalDsl.g:947:1: ( ( rule__Note__NameAssignment_1 ) )
            {
            // InternalDsl.g:947:1: ( ( rule__Note__NameAssignment_1 ) )
            // InternalDsl.g:948:2: ( rule__Note__NameAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_1()); 
            // InternalDsl.g:949:2: ( rule__Note__NameAssignment_1 )
            // InternalDsl.g:949:3: rule__Note__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalDsl.g:957:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:961:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalDsl.g:962:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalDsl.g:969:1: rule__Note__Group__2__Impl : ( ( rule__Note__OctaveAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( ( ( rule__Note__OctaveAssignment_2 )? ) )
            // InternalDsl.g:974:1: ( ( rule__Note__OctaveAssignment_2 )? )
            {
            // InternalDsl.g:974:1: ( ( rule__Note__OctaveAssignment_2 )? )
            // InternalDsl.g:975:2: ( rule__Note__OctaveAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_2()); 
            // InternalDsl.g:976:2: ( rule__Note__OctaveAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=23 && LA7_0<=24)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:976:3: rule__Note__OctaveAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__OctaveAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getOctaveAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__3"
    // InternalDsl.g:984:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:988:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // InternalDsl.g:989:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3"


    // $ANTLR start "rule__Note__Group__3__Impl"
    // InternalDsl.g:996:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 ) ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( ( ( rule__Note__DurationAssignment_3 ) ) )
            // InternalDsl.g:1001:1: ( ( rule__Note__DurationAssignment_3 ) )
            {
            // InternalDsl.g:1001:1: ( ( rule__Note__DurationAssignment_3 ) )
            // InternalDsl.g:1002:2: ( rule__Note__DurationAssignment_3 )
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // InternalDsl.g:1003:2: ( rule__Note__DurationAssignment_3 )
            // InternalDsl.g:1003:3: rule__Note__DurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Note__DurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3__Impl"


    // $ANTLR start "rule__Note__Group__4"
    // InternalDsl.g:1011:1: rule__Note__Group__4 : rule__Note__Group__4__Impl ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1015:1: ( rule__Note__Group__4__Impl )
            // InternalDsl.g:1016:2: rule__Note__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4"


    // $ANTLR start "rule__Note__Group__4__Impl"
    // InternalDsl.g:1022:1: rule__Note__Group__4__Impl : ( ( rule__Note__SyllableAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1026:1: ( ( ( rule__Note__SyllableAssignment_4 )? ) )
            // InternalDsl.g:1027:1: ( ( rule__Note__SyllableAssignment_4 )? )
            {
            // InternalDsl.g:1027:1: ( ( rule__Note__SyllableAssignment_4 )? )
            // InternalDsl.g:1028:2: ( rule__Note__SyllableAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getSyllableAssignment_4()); 
            // InternalDsl.g:1029:2: ( rule__Note__SyllableAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1029:3: rule__Note__SyllableAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__SyllableAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getSyllableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4__Impl"


    // $ANTLR start "rule__Octave__Group_0__0"
    // InternalDsl.g:1038:1: rule__Octave__Group_0__0 : rule__Octave__Group_0__0__Impl rule__Octave__Group_0__1 ;
    public final void rule__Octave__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1042:1: ( rule__Octave__Group_0__0__Impl rule__Octave__Group_0__1 )
            // InternalDsl.g:1043:2: rule__Octave__Group_0__0__Impl rule__Octave__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Octave__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octave__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__0"


    // $ANTLR start "rule__Octave__Group_0__0__Impl"
    // InternalDsl.g:1050:1: rule__Octave__Group_0__0__Impl : ( () ) ;
    public final void rule__Octave__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( ( () ) )
            // InternalDsl.g:1055:1: ( () )
            {
            // InternalDsl.g:1055:1: ( () )
            // InternalDsl.g:1056:2: ()
            {
             before(grammarAccess.getOctaveAccess().getIsAction_0_0()); 
            // InternalDsl.g:1057:2: ()
            // InternalDsl.g:1057:3: 
            {
            }

             after(grammarAccess.getOctaveAccess().getIsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__0__Impl"


    // $ANTLR start "rule__Octave__Group_0__1"
    // InternalDsl.g:1065:1: rule__Octave__Group_0__1 : rule__Octave__Group_0__1__Impl rule__Octave__Group_0__2 ;
    public final void rule__Octave__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1069:1: ( rule__Octave__Group_0__1__Impl rule__Octave__Group_0__2 )
            // InternalDsl.g:1070:2: rule__Octave__Group_0__1__Impl rule__Octave__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Octave__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octave__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__1"


    // $ANTLR start "rule__Octave__Group_0__1__Impl"
    // InternalDsl.g:1077:1: rule__Octave__Group_0__1__Impl : ( '+' ) ;
    public final void rule__Octave__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( ( '+' ) )
            // InternalDsl.g:1082:1: ( '+' )
            {
            // InternalDsl.g:1082:1: ( '+' )
            // InternalDsl.g:1083:2: '+'
            {
             before(grammarAccess.getOctaveAccess().getPlusSignKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOctaveAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__1__Impl"


    // $ANTLR start "rule__Octave__Group_0__2"
    // InternalDsl.g:1092:1: rule__Octave__Group_0__2 : rule__Octave__Group_0__2__Impl ;
    public final void rule__Octave__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1096:1: ( rule__Octave__Group_0__2__Impl )
            // InternalDsl.g:1097:2: rule__Octave__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Octave__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__2"


    // $ANTLR start "rule__Octave__Group_0__2__Impl"
    // InternalDsl.g:1103:1: rule__Octave__Group_0__2__Impl : ( ( rule__Octave__ValueAssignment_0_2 ) ) ;
    public final void rule__Octave__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1107:1: ( ( ( rule__Octave__ValueAssignment_0_2 ) ) )
            // InternalDsl.g:1108:1: ( ( rule__Octave__ValueAssignment_0_2 ) )
            {
            // InternalDsl.g:1108:1: ( ( rule__Octave__ValueAssignment_0_2 ) )
            // InternalDsl.g:1109:2: ( rule__Octave__ValueAssignment_0_2 )
            {
             before(grammarAccess.getOctaveAccess().getValueAssignment_0_2()); 
            // InternalDsl.g:1110:2: ( rule__Octave__ValueAssignment_0_2 )
            // InternalDsl.g:1110:3: rule__Octave__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Octave__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOctaveAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_0__2__Impl"


    // $ANTLR start "rule__Octave__Group_1__0"
    // InternalDsl.g:1119:1: rule__Octave__Group_1__0 : rule__Octave__Group_1__0__Impl rule__Octave__Group_1__1 ;
    public final void rule__Octave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1123:1: ( rule__Octave__Group_1__0__Impl rule__Octave__Group_1__1 )
            // InternalDsl.g:1124:2: rule__Octave__Group_1__0__Impl rule__Octave__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Octave__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octave__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__0"


    // $ANTLR start "rule__Octave__Group_1__0__Impl"
    // InternalDsl.g:1131:1: rule__Octave__Group_1__0__Impl : ( () ) ;
    public final void rule__Octave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( ( () ) )
            // InternalDsl.g:1136:1: ( () )
            {
            // InternalDsl.g:1136:1: ( () )
            // InternalDsl.g:1137:2: ()
            {
             before(grammarAccess.getOctaveAccess().getEsAction_1_0()); 
            // InternalDsl.g:1138:2: ()
            // InternalDsl.g:1138:3: 
            {
            }

             after(grammarAccess.getOctaveAccess().getEsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__0__Impl"


    // $ANTLR start "rule__Octave__Group_1__1"
    // InternalDsl.g:1146:1: rule__Octave__Group_1__1 : rule__Octave__Group_1__1__Impl rule__Octave__Group_1__2 ;
    public final void rule__Octave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1150:1: ( rule__Octave__Group_1__1__Impl rule__Octave__Group_1__2 )
            // InternalDsl.g:1151:2: rule__Octave__Group_1__1__Impl rule__Octave__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Octave__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Octave__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__1"


    // $ANTLR start "rule__Octave__Group_1__1__Impl"
    // InternalDsl.g:1158:1: rule__Octave__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Octave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1162:1: ( ( '-' ) )
            // InternalDsl.g:1163:1: ( '-' )
            {
            // InternalDsl.g:1163:1: ( '-' )
            // InternalDsl.g:1164:2: '-'
            {
             before(grammarAccess.getOctaveAccess().getHyphenMinusKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOctaveAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__1__Impl"


    // $ANTLR start "rule__Octave__Group_1__2"
    // InternalDsl.g:1173:1: rule__Octave__Group_1__2 : rule__Octave__Group_1__2__Impl ;
    public final void rule__Octave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1177:1: ( rule__Octave__Group_1__2__Impl )
            // InternalDsl.g:1178:2: rule__Octave__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Octave__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__2"


    // $ANTLR start "rule__Octave__Group_1__2__Impl"
    // InternalDsl.g:1184:1: rule__Octave__Group_1__2__Impl : ( ( rule__Octave__ValueAssignment_1_2 ) ) ;
    public final void rule__Octave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1188:1: ( ( ( rule__Octave__ValueAssignment_1_2 ) ) )
            // InternalDsl.g:1189:1: ( ( rule__Octave__ValueAssignment_1_2 ) )
            {
            // InternalDsl.g:1189:1: ( ( rule__Octave__ValueAssignment_1_2 ) )
            // InternalDsl.g:1190:2: ( rule__Octave__ValueAssignment_1_2 )
            {
             before(grammarAccess.getOctaveAccess().getValueAssignment_1_2()); 
            // InternalDsl.g:1191:2: ( rule__Octave__ValueAssignment_1_2 )
            // InternalDsl.g:1191:3: rule__Octave__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Octave__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOctaveAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__Group_1__2__Impl"


    // $ANTLR start "rule__File__PhrasesAssignment_1"
    // InternalDsl.g:1200:1: rule__File__PhrasesAssignment_1 : ( rulePhrase ) ;
    public final void rule__File__PhrasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1204:1: ( ( rulePhrase ) )
            // InternalDsl.g:1205:2: ( rulePhrase )
            {
            // InternalDsl.g:1205:2: ( rulePhrase )
            // InternalDsl.g:1206:3: rulePhrase
            {
             before(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__PhrasesAssignment_1"


    // $ANTLR start "rule__File__SongAssignment_2"
    // InternalDsl.g:1215:1: rule__File__SongAssignment_2 : ( ruleSong ) ;
    public final void rule__File__SongAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1219:1: ( ( ruleSong ) )
            // InternalDsl.g:1220:2: ( ruleSong )
            {
            // InternalDsl.g:1220:2: ( ruleSong )
            // InternalDsl.g:1221:3: ruleSong
            {
             before(grammarAccess.getFileAccess().getSongSongParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getFileAccess().getSongSongParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__SongAssignment_2"


    // $ANTLR start "rule__File__PhrasesAssignment_3"
    // InternalDsl.g:1230:1: rule__File__PhrasesAssignment_3 : ( rulePhrase ) ;
    public final void rule__File__PhrasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1234:1: ( ( rulePhrase ) )
            // InternalDsl.g:1235:2: ( rulePhrase )
            {
            // InternalDsl.g:1235:2: ( rulePhrase )
            // InternalDsl.g:1236:3: rulePhrase
            {
             before(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getFileAccess().getPhrasesPhraseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__PhrasesAssignment_3"


    // $ANTLR start "rule__Phrase__NameAssignment_2"
    // InternalDsl.g:1245:1: rule__Phrase__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phrase__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1249:1: ( ( RULE_ID ) )
            // InternalDsl.g:1250:2: ( RULE_ID )
            {
            // InternalDsl.g:1250:2: ( RULE_ID )
            // InternalDsl.g:1251:3: RULE_ID
            {
             before(grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__NameAssignment_2"


    // $ANTLR start "rule__Phrase__BodyAssignment_3"
    // InternalDsl.g:1260:1: rule__Phrase__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__Phrase__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( ( ruleBody ) )
            // InternalDsl.g:1265:2: ( ruleBody )
            {
            // InternalDsl.g:1265:2: ( ruleBody )
            // InternalDsl.g:1266:3: ruleBody
            {
             before(grammarAccess.getPhraseAccess().getBodyBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getBodyBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__BodyAssignment_3"


    // $ANTLR start "rule__Song__NameAssignment_2"
    // InternalDsl.g:1275:1: rule__Song__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Song__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1280:2: ( RULE_STRING )
            {
            // InternalDsl.g:1280:2: ( RULE_STRING )
            // InternalDsl.g:1281:3: RULE_STRING
            {
             before(grammarAccess.getSongAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSongAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__NameAssignment_2"


    // $ANTLR start "rule__Song__BodyAssignment_3"
    // InternalDsl.g:1290:1: rule__Song__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__Song__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1294:1: ( ( ruleBody ) )
            // InternalDsl.g:1295:2: ( ruleBody )
            {
            // InternalDsl.g:1295:2: ( ruleBody )
            // InternalDsl.g:1296:3: ruleBody
            {
             before(grammarAccess.getSongAccess().getBodyBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getSongAccess().getBodyBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__BodyAssignment_3"


    // $ANTLR start "rule__Body__ContentAssignment_2"
    // InternalDsl.g:1305:1: rule__Body__ContentAssignment_2 : ( ruleItem ) ;
    public final void rule__Body__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1309:1: ( ( ruleItem ) )
            // InternalDsl.g:1310:2: ( ruleItem )
            {
            // InternalDsl.g:1310:2: ( ruleItem )
            // InternalDsl.g:1311:3: ruleItem
            {
             before(grammarAccess.getBodyAccess().getContentItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getContentItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__ContentAssignment_2"


    // $ANTLR start "rule__Item__NoteAssignment_0_1"
    // InternalDsl.g:1320:1: rule__Item__NoteAssignment_0_1 : ( ruleNote ) ;
    public final void rule__Item__NoteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1324:1: ( ( ruleNote ) )
            // InternalDsl.g:1325:2: ( ruleNote )
            {
            // InternalDsl.g:1325:2: ( ruleNote )
            // InternalDsl.g:1326:3: ruleNote
            {
             before(grammarAccess.getItemAccess().getNoteNoteParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getItemAccess().getNoteNoteParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NoteAssignment_0_1"


    // $ANTLR start "rule__Item__PhraseAssignment_1_2"
    // InternalDsl.g:1335:1: rule__Item__PhraseAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Item__PhraseAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1339:1: ( ( RULE_ID ) )
            // InternalDsl.g:1340:2: ( RULE_ID )
            {
            // InternalDsl.g:1340:2: ( RULE_ID )
            // InternalDsl.g:1341:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getPhraseIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getPhraseIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__PhraseAssignment_1_2"


    // $ANTLR start "rule__Note__NameAssignment_1"
    // InternalDsl.g:1350:1: rule__Note__NameAssignment_1 : ( ruleNoteName ) ;
    public final void rule__Note__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1354:1: ( ( ruleNoteName ) )
            // InternalDsl.g:1355:2: ( ruleNoteName )
            {
            // InternalDsl.g:1355:2: ( ruleNoteName )
            // InternalDsl.g:1356:3: ruleNoteName
            {
             before(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteName();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NameAssignment_1"


    // $ANTLR start "rule__Note__OctaveAssignment_2"
    // InternalDsl.g:1365:1: rule__Note__OctaveAssignment_2 : ( ruleOctave ) ;
    public final void rule__Note__OctaveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1369:1: ( ( ruleOctave ) )
            // InternalDsl.g:1370:2: ( ruleOctave )
            {
            // InternalDsl.g:1370:2: ( ruleOctave )
            // InternalDsl.g:1371:3: ruleOctave
            {
             before(grammarAccess.getNoteAccess().getOctaveOctaveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOctave();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getOctaveOctaveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__OctaveAssignment_2"


    // $ANTLR start "rule__Note__DurationAssignment_3"
    // InternalDsl.g:1380:1: rule__Note__DurationAssignment_3 : ( RULE_INT ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1384:1: ( ( RULE_INT ) )
            // InternalDsl.g:1385:2: ( RULE_INT )
            {
            // InternalDsl.g:1385:2: ( RULE_INT )
            // InternalDsl.g:1386:3: RULE_INT
            {
             before(grammarAccess.getNoteAccess().getDurationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDurationINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DurationAssignment_3"


    // $ANTLR start "rule__Note__SyllableAssignment_4"
    // InternalDsl.g:1395:1: rule__Note__SyllableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Note__SyllableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1400:2: ( RULE_STRING )
            {
            // InternalDsl.g:1400:2: ( RULE_STRING )
            // InternalDsl.g:1401:3: RULE_STRING
            {
             before(grammarAccess.getNoteAccess().getSyllableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getSyllableSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__SyllableAssignment_4"


    // $ANTLR start "rule__Octave__ValueAssignment_0_2"
    // InternalDsl.g:1410:1: rule__Octave__ValueAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Octave__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( ( RULE_INT ) )
            // InternalDsl.g:1415:2: ( RULE_INT )
            {
            // InternalDsl.g:1415:2: ( RULE_INT )
            // InternalDsl.g:1416:3: RULE_INT
            {
             before(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__ValueAssignment_0_2"


    // $ANTLR start "rule__Octave__ValueAssignment_1_2"
    // InternalDsl.g:1425:1: rule__Octave__ValueAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Octave__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1429:1: ( ( RULE_INT ) )
            // InternalDsl.g:1430:2: ( RULE_INT )
            {
            // InternalDsl.g:1430:2: ( RULE_INT )
            // InternalDsl.g:1431:3: RULE_INT
            {
             before(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Octave__ValueAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000063F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000043F802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000043F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});

}