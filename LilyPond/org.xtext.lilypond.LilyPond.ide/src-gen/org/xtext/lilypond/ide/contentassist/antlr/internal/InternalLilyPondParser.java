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
import org.xtext.lilypond.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\''", "','", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'\\\\version'", "'\\\\header'", "'{'", "'}'", "'title'", "'='", "'\\\\score'", "'<<'", "'>>'", "'\\\\new'", "'Staff'", "'\\\\key'", "'\\\\major'", "'\\\\time'", "'4/4'", "'\\\\absolute'", "'\\\\addlyrics'"
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

    	public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
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
    // InternalLilyPond.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalLilyPond.g:54:1: ( ruleFile EOF )
            // InternalLilyPond.g:55:1: ruleFile EOF
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
    // InternalLilyPond.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalLilyPond.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalLilyPond.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalLilyPond.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalLilyPond.g:69:3: ( rule__File__Group__0 )
            // InternalLilyPond.g:69:4: rule__File__Group__0
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


    // $ANTLR start "entryRuleVersion"
    // InternalLilyPond.g:78:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalLilyPond.g:79:1: ( ruleVersion EOF )
            // InternalLilyPond.g:80:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalLilyPond.g:87:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:91:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalLilyPond.g:92:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalLilyPond.g:92:2: ( ( rule__Version__Group__0 ) )
            // InternalLilyPond.g:93:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalLilyPond.g:94:3: ( rule__Version__Group__0 )
            // InternalLilyPond.g:94:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleHeader"
    // InternalLilyPond.g:103:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalLilyPond.g:104:1: ( ruleHeader EOF )
            // InternalLilyPond.g:105:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalLilyPond.g:112:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:116:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalLilyPond.g:117:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalLilyPond.g:117:2: ( ( rule__Header__Group__0 ) )
            // InternalLilyPond.g:118:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalLilyPond.g:119:3: ( rule__Header__Group__0 )
            // InternalLilyPond.g:119:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTitle"
    // InternalLilyPond.g:128:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalLilyPond.g:129:1: ( ruleTitle EOF )
            // InternalLilyPond.g:130:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLilyPond.g:137:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:141:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalLilyPond.g:142:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalLilyPond.g:142:2: ( ( rule__Title__Group__0 ) )
            // InternalLilyPond.g:143:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalLilyPond.g:144:3: ( rule__Title__Group__0 )
            // InternalLilyPond.g:144:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleScore"
    // InternalLilyPond.g:153:1: entryRuleScore : ruleScore EOF ;
    public final void entryRuleScore() throws RecognitionException {
        try {
            // InternalLilyPond.g:154:1: ( ruleScore EOF )
            // InternalLilyPond.g:155:1: ruleScore EOF
            {
             before(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getScoreRule()); 
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
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalLilyPond.g:162:1: ruleScore : ( ( rule__Score__Group__0 ) ) ;
    public final void ruleScore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:166:2: ( ( ( rule__Score__Group__0 ) ) )
            // InternalLilyPond.g:167:2: ( ( rule__Score__Group__0 ) )
            {
            // InternalLilyPond.g:167:2: ( ( rule__Score__Group__0 ) )
            // InternalLilyPond.g:168:3: ( rule__Score__Group__0 )
            {
             before(grammarAccess.getScoreAccess().getGroup()); 
            // InternalLilyPond.g:169:3: ( rule__Score__Group__0 )
            // InternalLilyPond.g:169:4: rule__Score__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getGroup()); 

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
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleStaff"
    // InternalLilyPond.g:178:1: entryRuleStaff : ruleStaff EOF ;
    public final void entryRuleStaff() throws RecognitionException {
        try {
            // InternalLilyPond.g:179:1: ( ruleStaff EOF )
            // InternalLilyPond.g:180:1: ruleStaff EOF
            {
             before(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getStaffRule()); 
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
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalLilyPond.g:187:1: ruleStaff : ( ( rule__Staff__Group__0 ) ) ;
    public final void ruleStaff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:191:2: ( ( ( rule__Staff__Group__0 ) ) )
            // InternalLilyPond.g:192:2: ( ( rule__Staff__Group__0 ) )
            {
            // InternalLilyPond.g:192:2: ( ( rule__Staff__Group__0 ) )
            // InternalLilyPond.g:193:3: ( rule__Staff__Group__0 )
            {
             before(grammarAccess.getStaffAccess().getGroup()); 
            // InternalLilyPond.g:194:3: ( rule__Staff__Group__0 )
            // InternalLilyPond.g:194:4: rule__Staff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getGroup()); 

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
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleKey"
    // InternalLilyPond.g:203:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalLilyPond.g:204:1: ( ruleKey EOF )
            // InternalLilyPond.g:205:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalLilyPond.g:212:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:216:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalLilyPond.g:217:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalLilyPond.g:217:2: ( ( rule__Key__Group__0 ) )
            // InternalLilyPond.g:218:3: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalLilyPond.g:219:3: ( rule__Key__Group__0 )
            // InternalLilyPond.g:219:4: rule__Key__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleTime"
    // InternalLilyPond.g:228:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalLilyPond.g:229:1: ( ruleTime EOF )
            // InternalLilyPond.g:230:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalLilyPond.g:237:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:241:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalLilyPond.g:242:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalLilyPond.g:242:2: ( ( rule__Time__Group__0 ) )
            // InternalLilyPond.g:243:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalLilyPond.g:244:3: ( rule__Time__Group__0 )
            // InternalLilyPond.g:244:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleAbsolute"
    // InternalLilyPond.g:253:1: entryRuleAbsolute : ruleAbsolute EOF ;
    public final void entryRuleAbsolute() throws RecognitionException {
        try {
            // InternalLilyPond.g:254:1: ( ruleAbsolute EOF )
            // InternalLilyPond.g:255:1: ruleAbsolute EOF
            {
             before(grammarAccess.getAbsoluteRule()); 
            pushFollow(FOLLOW_1);
            ruleAbsolute();

            state._fsp--;

             after(grammarAccess.getAbsoluteRule()); 
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
    // $ANTLR end "entryRuleAbsolute"


    // $ANTLR start "ruleAbsolute"
    // InternalLilyPond.g:262:1: ruleAbsolute : ( ( rule__Absolute__Group__0 ) ) ;
    public final void ruleAbsolute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:266:2: ( ( ( rule__Absolute__Group__0 ) ) )
            // InternalLilyPond.g:267:2: ( ( rule__Absolute__Group__0 ) )
            {
            // InternalLilyPond.g:267:2: ( ( rule__Absolute__Group__0 ) )
            // InternalLilyPond.g:268:3: ( rule__Absolute__Group__0 )
            {
             before(grammarAccess.getAbsoluteAccess().getGroup()); 
            // InternalLilyPond.g:269:3: ( rule__Absolute__Group__0 )
            // InternalLilyPond.g:269:4: rule__Absolute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Absolute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteAccess().getGroup()); 

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
    // $ANTLR end "ruleAbsolute"


    // $ANTLR start "entryRuleNote"
    // InternalLilyPond.g:278:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyPond.g:279:1: ( ruleNote EOF )
            // InternalLilyPond.g:280:1: ruleNote EOF
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
    // InternalLilyPond.g:287:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:291:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyPond.g:292:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyPond.g:292:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyPond.g:293:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalLilyPond.g:294:3: ( rule__Note__Group__0 )
            // InternalLilyPond.g:294:4: rule__Note__Group__0
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


    // $ANTLR start "entryRuleOctaveRep"
    // InternalLilyPond.g:303:1: entryRuleOctaveRep : ruleOctaveRep EOF ;
    public final void entryRuleOctaveRep() throws RecognitionException {
        try {
            // InternalLilyPond.g:304:1: ( ruleOctaveRep EOF )
            // InternalLilyPond.g:305:1: ruleOctaveRep EOF
            {
             before(grammarAccess.getOctaveRepRule()); 
            pushFollow(FOLLOW_1);
            ruleOctaveRep();

            state._fsp--;

             after(grammarAccess.getOctaveRepRule()); 
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
    // $ANTLR end "entryRuleOctaveRep"


    // $ANTLR start "ruleOctaveRep"
    // InternalLilyPond.g:312:1: ruleOctaveRep : ( ( rule__OctaveRep__Alternatives ) ) ;
    public final void ruleOctaveRep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:316:2: ( ( ( rule__OctaveRep__Alternatives ) ) )
            // InternalLilyPond.g:317:2: ( ( rule__OctaveRep__Alternatives ) )
            {
            // InternalLilyPond.g:317:2: ( ( rule__OctaveRep__Alternatives ) )
            // InternalLilyPond.g:318:3: ( rule__OctaveRep__Alternatives )
            {
             before(grammarAccess.getOctaveRepAccess().getAlternatives()); 
            // InternalLilyPond.g:319:3: ( rule__OctaveRep__Alternatives )
            // InternalLilyPond.g:319:4: rule__OctaveRep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OctaveRep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOctaveRepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOctaveRep"


    // $ANTLR start "entryRuleQuote"
    // InternalLilyPond.g:328:1: entryRuleQuote : ruleQuote EOF ;
    public final void entryRuleQuote() throws RecognitionException {
        try {
            // InternalLilyPond.g:329:1: ( ruleQuote EOF )
            // InternalLilyPond.g:330:1: ruleQuote EOF
            {
             before(grammarAccess.getQuoteRule()); 
            pushFollow(FOLLOW_1);
            ruleQuote();

            state._fsp--;

             after(grammarAccess.getQuoteRule()); 
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
    // $ANTLR end "entryRuleQuote"


    // $ANTLR start "ruleQuote"
    // InternalLilyPond.g:337:1: ruleQuote : ( '\\'' ) ;
    public final void ruleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:341:2: ( ( '\\'' ) )
            // InternalLilyPond.g:342:2: ( '\\'' )
            {
            // InternalLilyPond.g:342:2: ( '\\'' )
            // InternalLilyPond.g:343:3: '\\''
            {
             before(grammarAccess.getQuoteAccess().getApostropheKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getQuoteAccess().getApostropheKeyword()); 

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
    // $ANTLR end "ruleQuote"


    // $ANTLR start "entryRuleComma"
    // InternalLilyPond.g:353:1: entryRuleComma : ruleComma EOF ;
    public final void entryRuleComma() throws RecognitionException {
        try {
            // InternalLilyPond.g:354:1: ( ruleComma EOF )
            // InternalLilyPond.g:355:1: ruleComma EOF
            {
             before(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_1);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getCommaRule()); 
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
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // InternalLilyPond.g:362:1: ruleComma : ( ',' ) ;
    public final void ruleComma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:366:2: ( ( ',' ) )
            // InternalLilyPond.g:367:2: ( ',' )
            {
            // InternalLilyPond.g:367:2: ( ',' )
            // InternalLilyPond.g:368:3: ','
            {
             before(grammarAccess.getCommaAccess().getCommaKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCommaAccess().getCommaKeyword()); 

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
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleLyrics"
    // InternalLilyPond.g:378:1: entryRuleLyrics : ruleLyrics EOF ;
    public final void entryRuleLyrics() throws RecognitionException {
        try {
            // InternalLilyPond.g:379:1: ( ruleLyrics EOF )
            // InternalLilyPond.g:380:1: ruleLyrics EOF
            {
             before(grammarAccess.getLyricsRule()); 
            pushFollow(FOLLOW_1);
            ruleLyrics();

            state._fsp--;

             after(grammarAccess.getLyricsRule()); 
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
    // $ANTLR end "entryRuleLyrics"


    // $ANTLR start "ruleLyrics"
    // InternalLilyPond.g:387:1: ruleLyrics : ( ( rule__Lyrics__Group__0 ) ) ;
    public final void ruleLyrics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:391:2: ( ( ( rule__Lyrics__Group__0 ) ) )
            // InternalLilyPond.g:392:2: ( ( rule__Lyrics__Group__0 ) )
            {
            // InternalLilyPond.g:392:2: ( ( rule__Lyrics__Group__0 ) )
            // InternalLilyPond.g:393:3: ( rule__Lyrics__Group__0 )
            {
             before(grammarAccess.getLyricsAccess().getGroup()); 
            // InternalLilyPond.g:394:3: ( rule__Lyrics__Group__0 )
            // InternalLilyPond.g:394:4: rule__Lyrics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLyricsAccess().getGroup()); 

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
    // $ANTLR end "ruleLyrics"


    // $ANTLR start "ruleNoteName"
    // InternalLilyPond.g:403:1: ruleNoteName : ( ( rule__NoteName__Alternatives ) ) ;
    public final void ruleNoteName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:407:1: ( ( ( rule__NoteName__Alternatives ) ) )
            // InternalLilyPond.g:408:2: ( ( rule__NoteName__Alternatives ) )
            {
            // InternalLilyPond.g:408:2: ( ( rule__NoteName__Alternatives ) )
            // InternalLilyPond.g:409:3: ( rule__NoteName__Alternatives )
            {
             before(grammarAccess.getNoteNameAccess().getAlternatives()); 
            // InternalLilyPond.g:410:3: ( rule__NoteName__Alternatives )
            // InternalLilyPond.g:410:4: rule__NoteName__Alternatives
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


    // $ANTLR start "rule__OctaveRep__Alternatives"
    // InternalLilyPond.g:418:1: rule__OctaveRep__Alternatives : ( ( ( rule__OctaveRep__Group_0__0 ) ) | ( ( rule__OctaveRep__Group_1__0 ) ) );
    public final void rule__OctaveRep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:422:1: ( ( ( rule__OctaveRep__Group_0__0 ) ) | ( ( rule__OctaveRep__Group_1__0 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case EOF:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLilyPond.g:423:2: ( ( rule__OctaveRep__Group_0__0 ) )
                    {
                    // InternalLilyPond.g:423:2: ( ( rule__OctaveRep__Group_0__0 ) )
                    // InternalLilyPond.g:424:3: ( rule__OctaveRep__Group_0__0 )
                    {
                     before(grammarAccess.getOctaveRepAccess().getGroup_0()); 
                    // InternalLilyPond.g:425:3: ( rule__OctaveRep__Group_0__0 )
                    // InternalLilyPond.g:425:4: rule__OctaveRep__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OctaveRep__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctaveRepAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyPond.g:429:2: ( ( rule__OctaveRep__Group_1__0 ) )
                    {
                    // InternalLilyPond.g:429:2: ( ( rule__OctaveRep__Group_1__0 ) )
                    // InternalLilyPond.g:430:3: ( rule__OctaveRep__Group_1__0 )
                    {
                     before(grammarAccess.getOctaveRepAccess().getGroup_1()); 
                    // InternalLilyPond.g:431:3: ( rule__OctaveRep__Group_1__0 )
                    // InternalLilyPond.g:431:4: rule__OctaveRep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OctaveRep__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctaveRepAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OctaveRep__Alternatives"


    // $ANTLR start "rule__NoteName__Alternatives"
    // InternalLilyPond.g:439:1: rule__NoteName__Alternatives : ( ( ( 'a' ) ) | ( ( 'b' ) ) | ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) );
    public final void rule__NoteName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:443:1: ( ( ( 'a' ) ) | ( ( 'b' ) ) | ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLilyPond.g:444:2: ( ( 'a' ) )
                    {
                    // InternalLilyPond.g:444:2: ( ( 'a' ) )
                    // InternalLilyPond.g:445:3: ( 'a' )
                    {
                     before(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalLilyPond.g:446:3: ( 'a' )
                    // InternalLilyPond.g:446:4: 'a'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyPond.g:450:2: ( ( 'b' ) )
                    {
                    // InternalLilyPond.g:450:2: ( ( 'b' ) )
                    // InternalLilyPond.g:451:3: ( 'b' )
                    {
                     before(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalLilyPond.g:452:3: ( 'b' )
                    // InternalLilyPond.g:452:4: 'b'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLilyPond.g:456:2: ( ( 'c' ) )
                    {
                    // InternalLilyPond.g:456:2: ( ( 'c' ) )
                    // InternalLilyPond.g:457:3: ( 'c' )
                    {
                     before(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalLilyPond.g:458:3: ( 'c' )
                    // InternalLilyPond.g:458:4: 'c'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLilyPond.g:462:2: ( ( 'd' ) )
                    {
                    // InternalLilyPond.g:462:2: ( ( 'd' ) )
                    // InternalLilyPond.g:463:3: ( 'd' )
                    {
                     before(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalLilyPond.g:464:3: ( 'd' )
                    // InternalLilyPond.g:464:4: 'd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLilyPond.g:468:2: ( ( 'e' ) )
                    {
                    // InternalLilyPond.g:468:2: ( ( 'e' ) )
                    // InternalLilyPond.g:469:3: ( 'e' )
                    {
                     before(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalLilyPond.g:470:3: ( 'e' )
                    // InternalLilyPond.g:470:4: 'e'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLilyPond.g:474:2: ( ( 'f' ) )
                    {
                    // InternalLilyPond.g:474:2: ( ( 'f' ) )
                    // InternalLilyPond.g:475:3: ( 'f' )
                    {
                     before(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalLilyPond.g:476:3: ( 'f' )
                    // InternalLilyPond.g:476:4: 'f'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLilyPond.g:480:2: ( ( 'g' ) )
                    {
                    // InternalLilyPond.g:480:2: ( ( 'g' ) )
                    // InternalLilyPond.g:481:3: ( 'g' )
                    {
                     before(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalLilyPond.g:482:3: ( 'g' )
                    // InternalLilyPond.g:482:4: 'g'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalLilyPond.g:490:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:494:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalLilyPond.g:495:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalLilyPond.g:502:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:506:1: ( ( () ) )
            // InternalLilyPond.g:507:1: ( () )
            {
            // InternalLilyPond.g:507:1: ( () )
            // InternalLilyPond.g:508:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalLilyPond.g:509:2: ()
            // InternalLilyPond.g:509:3: 
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
    // InternalLilyPond.g:517:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:521:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalLilyPond.g:522:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalLilyPond.g:529:1: rule__File__Group__1__Impl : ( ( rule__File__VersionAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:533:1: ( ( ( rule__File__VersionAssignment_1 ) ) )
            // InternalLilyPond.g:534:1: ( ( rule__File__VersionAssignment_1 ) )
            {
            // InternalLilyPond.g:534:1: ( ( rule__File__VersionAssignment_1 ) )
            // InternalLilyPond.g:535:2: ( rule__File__VersionAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getVersionAssignment_1()); 
            // InternalLilyPond.g:536:2: ( rule__File__VersionAssignment_1 )
            // InternalLilyPond.g:536:3: rule__File__VersionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__File__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getVersionAssignment_1()); 

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
    // InternalLilyPond.g:544:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:548:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalLilyPond.g:549:2: rule__File__Group__2__Impl rule__File__Group__3
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
    // InternalLilyPond.g:556:1: rule__File__Group__2__Impl : ( ( rule__File__HeaderAssignment_2 ) ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:560:1: ( ( ( rule__File__HeaderAssignment_2 ) ) )
            // InternalLilyPond.g:561:1: ( ( rule__File__HeaderAssignment_2 ) )
            {
            // InternalLilyPond.g:561:1: ( ( rule__File__HeaderAssignment_2 ) )
            // InternalLilyPond.g:562:2: ( rule__File__HeaderAssignment_2 )
            {
             before(grammarAccess.getFileAccess().getHeaderAssignment_2()); 
            // InternalLilyPond.g:563:2: ( rule__File__HeaderAssignment_2 )
            // InternalLilyPond.g:563:3: rule__File__HeaderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__File__HeaderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getHeaderAssignment_2()); 

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
    // InternalLilyPond.g:571:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:575:1: ( rule__File__Group__3__Impl )
            // InternalLilyPond.g:576:2: rule__File__Group__3__Impl
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
    // InternalLilyPond.g:582:1: rule__File__Group__3__Impl : ( ( rule__File__ScoreAssignment_3 ) ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:586:1: ( ( ( rule__File__ScoreAssignment_3 ) ) )
            // InternalLilyPond.g:587:1: ( ( rule__File__ScoreAssignment_3 ) )
            {
            // InternalLilyPond.g:587:1: ( ( rule__File__ScoreAssignment_3 ) )
            // InternalLilyPond.g:588:2: ( rule__File__ScoreAssignment_3 )
            {
             before(grammarAccess.getFileAccess().getScoreAssignment_3()); 
            // InternalLilyPond.g:589:2: ( rule__File__ScoreAssignment_3 )
            // InternalLilyPond.g:589:3: rule__File__ScoreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__File__ScoreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getScoreAssignment_3()); 

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


    // $ANTLR start "rule__Version__Group__0"
    // InternalLilyPond.g:598:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:602:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalLilyPond.g:603:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalLilyPond.g:610:1: rule__Version__Group__0__Impl : ( () ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:614:1: ( ( () ) )
            // InternalLilyPond.g:615:1: ( () )
            {
            // InternalLilyPond.g:615:1: ( () )
            // InternalLilyPond.g:616:2: ()
            {
             before(grammarAccess.getVersionAccess().getVersionAction_0()); 
            // InternalLilyPond.g:617:2: ()
            // InternalLilyPond.g:617:3: 
            {
            }

             after(grammarAccess.getVersionAccess().getVersionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalLilyPond.g:625:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:629:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalLilyPond.g:630:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalLilyPond.g:637:1: rule__Version__Group__1__Impl : ( '\\\\version' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:641:1: ( ( '\\\\version' ) )
            // InternalLilyPond.g:642:1: ( '\\\\version' )
            {
            // InternalLilyPond.g:642:1: ( '\\\\version' )
            // InternalLilyPond.g:643:2: '\\\\version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_1()); 

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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalLilyPond.g:652:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:656:1: ( rule__Version__Group__2__Impl )
            // InternalLilyPond.g:657:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__2__Impl();

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
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalLilyPond.g:663:1: rule__Version__Group__2__Impl : ( ( rule__Version__ValueAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:667:1: ( ( ( rule__Version__ValueAssignment_2 ) ) )
            // InternalLilyPond.g:668:1: ( ( rule__Version__ValueAssignment_2 ) )
            {
            // InternalLilyPond.g:668:1: ( ( rule__Version__ValueAssignment_2 ) )
            // InternalLilyPond.g:669:2: ( rule__Version__ValueAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getValueAssignment_2()); 
            // InternalLilyPond.g:670:2: ( rule__Version__ValueAssignment_2 )
            // InternalLilyPond.g:670:3: rule__Version__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Version__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalLilyPond.g:679:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:683:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalLilyPond.g:684:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalLilyPond.g:691:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:695:1: ( ( () ) )
            // InternalLilyPond.g:696:1: ( () )
            {
            // InternalLilyPond.g:696:1: ( () )
            // InternalLilyPond.g:697:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalLilyPond.g:698:2: ()
            // InternalLilyPond.g:698:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalLilyPond.g:706:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:710:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalLilyPond.g:711:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalLilyPond.g:718:1: rule__Header__Group__1__Impl : ( '\\\\header' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:722:1: ( ( '\\\\header' ) )
            // InternalLilyPond.g:723:1: ( '\\\\header' )
            {
            // InternalLilyPond.g:723:1: ( '\\\\header' )
            // InternalLilyPond.g:724:2: '\\\\header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalLilyPond.g:733:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:737:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalLilyPond.g:738:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalLilyPond.g:745:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:749:1: ( ( '{' ) )
            // InternalLilyPond.g:750:1: ( '{' )
            {
            // InternalLilyPond.g:750:1: ( '{' )
            // InternalLilyPond.g:751:2: '{'
            {
             before(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalLilyPond.g:760:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:764:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalLilyPond.g:765:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

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
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalLilyPond.g:772:1: rule__Header__Group__3__Impl : ( ( rule__Header__TitleAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:776:1: ( ( ( rule__Header__TitleAssignment_3 ) ) )
            // InternalLilyPond.g:777:1: ( ( rule__Header__TitleAssignment_3 ) )
            {
            // InternalLilyPond.g:777:1: ( ( rule__Header__TitleAssignment_3 ) )
            // InternalLilyPond.g:778:2: ( rule__Header__TitleAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getTitleAssignment_3()); 
            // InternalLilyPond.g:779:2: ( rule__Header__TitleAssignment_3 )
            // InternalLilyPond.g:779:3: rule__Header__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Header__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalLilyPond.g:787:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:791:1: ( rule__Header__Group__4__Impl )
            // InternalLilyPond.g:792:2: rule__Header__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__4__Impl();

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
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalLilyPond.g:798:1: rule__Header__Group__4__Impl : ( '}' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:802:1: ( ( '}' ) )
            // InternalLilyPond.g:803:1: ( '}' )
            {
            // InternalLilyPond.g:803:1: ( '}' )
            // InternalLilyPond.g:804:2: '}'
            {
             before(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalLilyPond.g:814:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:818:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalLilyPond.g:819:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

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
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalLilyPond.g:826:1: rule__Title__Group__0__Impl : ( () ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:830:1: ( ( () ) )
            // InternalLilyPond.g:831:1: ( () )
            {
            // InternalLilyPond.g:831:1: ( () )
            // InternalLilyPond.g:832:2: ()
            {
             before(grammarAccess.getTitleAccess().getTitleAction_0()); 
            // InternalLilyPond.g:833:2: ()
            // InternalLilyPond.g:833:3: 
            {
            }

             after(grammarAccess.getTitleAccess().getTitleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalLilyPond.g:841:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:845:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalLilyPond.g:846:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__2();

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
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalLilyPond.g:853:1: rule__Title__Group__1__Impl : ( 'title' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:857:1: ( ( 'title' ) )
            // InternalLilyPond.g:858:1: ( 'title' )
            {
            // InternalLilyPond.g:858:1: ( 'title' )
            // InternalLilyPond.g:859:2: 'title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_1()); 

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
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // InternalLilyPond.g:868:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:872:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalLilyPond.g:873:2: rule__Title__Group__2__Impl rule__Title__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Title__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__3();

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
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // InternalLilyPond.g:880:1: rule__Title__Group__2__Impl : ( '=' ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:884:1: ( ( '=' ) )
            // InternalLilyPond.g:885:1: ( '=' )
            {
            // InternalLilyPond.g:885:1: ( '=' )
            // InternalLilyPond.g:886:2: '='
            {
             before(grammarAccess.getTitleAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__Title__Group__3"
    // InternalLilyPond.g:895:1: rule__Title__Group__3 : rule__Title__Group__3__Impl ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:899:1: ( rule__Title__Group__3__Impl )
            // InternalLilyPond.g:900:2: rule__Title__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__3__Impl();

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
    // $ANTLR end "rule__Title__Group__3"


    // $ANTLR start "rule__Title__Group__3__Impl"
    // InternalLilyPond.g:906:1: rule__Title__Group__3__Impl : ( ( rule__Title__ValueAssignment_3 ) ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:910:1: ( ( ( rule__Title__ValueAssignment_3 ) ) )
            // InternalLilyPond.g:911:1: ( ( rule__Title__ValueAssignment_3 ) )
            {
            // InternalLilyPond.g:911:1: ( ( rule__Title__ValueAssignment_3 ) )
            // InternalLilyPond.g:912:2: ( rule__Title__ValueAssignment_3 )
            {
             before(grammarAccess.getTitleAccess().getValueAssignment_3()); 
            // InternalLilyPond.g:913:2: ( rule__Title__ValueAssignment_3 )
            // InternalLilyPond.g:913:3: rule__Title__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Title__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Title__Group__3__Impl"


    // $ANTLR start "rule__Score__Group__0"
    // InternalLilyPond.g:922:1: rule__Score__Group__0 : rule__Score__Group__0__Impl rule__Score__Group__1 ;
    public final void rule__Score__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:926:1: ( rule__Score__Group__0__Impl rule__Score__Group__1 )
            // InternalLilyPond.g:927:2: rule__Score__Group__0__Impl rule__Score__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Score__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__1();

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
    // $ANTLR end "rule__Score__Group__0"


    // $ANTLR start "rule__Score__Group__0__Impl"
    // InternalLilyPond.g:934:1: rule__Score__Group__0__Impl : ( () ) ;
    public final void rule__Score__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:938:1: ( ( () ) )
            // InternalLilyPond.g:939:1: ( () )
            {
            // InternalLilyPond.g:939:1: ( () )
            // InternalLilyPond.g:940:2: ()
            {
             before(grammarAccess.getScoreAccess().getScoreAction_0()); 
            // InternalLilyPond.g:941:2: ()
            // InternalLilyPond.g:941:3: 
            {
            }

             after(grammarAccess.getScoreAccess().getScoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0__Impl"


    // $ANTLR start "rule__Score__Group__1"
    // InternalLilyPond.g:949:1: rule__Score__Group__1 : rule__Score__Group__1__Impl rule__Score__Group__2 ;
    public final void rule__Score__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:953:1: ( rule__Score__Group__1__Impl rule__Score__Group__2 )
            // InternalLilyPond.g:954:2: rule__Score__Group__1__Impl rule__Score__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Score__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__2();

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
    // $ANTLR end "rule__Score__Group__1"


    // $ANTLR start "rule__Score__Group__1__Impl"
    // InternalLilyPond.g:961:1: rule__Score__Group__1__Impl : ( '\\\\score' ) ;
    public final void rule__Score__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:965:1: ( ( '\\\\score' ) )
            // InternalLilyPond.g:966:1: ( '\\\\score' )
            {
            // InternalLilyPond.g:966:1: ( '\\\\score' )
            // InternalLilyPond.g:967:2: '\\\\score'
            {
             before(grammarAccess.getScoreAccess().getScoreKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getScoreKeyword_1()); 

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
    // $ANTLR end "rule__Score__Group__1__Impl"


    // $ANTLR start "rule__Score__Group__2"
    // InternalLilyPond.g:976:1: rule__Score__Group__2 : rule__Score__Group__2__Impl rule__Score__Group__3 ;
    public final void rule__Score__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:980:1: ( rule__Score__Group__2__Impl rule__Score__Group__3 )
            // InternalLilyPond.g:981:2: rule__Score__Group__2__Impl rule__Score__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Score__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__3();

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
    // $ANTLR end "rule__Score__Group__2"


    // $ANTLR start "rule__Score__Group__2__Impl"
    // InternalLilyPond.g:988:1: rule__Score__Group__2__Impl : ( '{' ) ;
    public final void rule__Score__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:992:1: ( ( '{' ) )
            // InternalLilyPond.g:993:1: ( '{' )
            {
            // InternalLilyPond.g:993:1: ( '{' )
            // InternalLilyPond.g:994:2: '{'
            {
             before(grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Score__Group__2__Impl"


    // $ANTLR start "rule__Score__Group__3"
    // InternalLilyPond.g:1003:1: rule__Score__Group__3 : rule__Score__Group__3__Impl rule__Score__Group__4 ;
    public final void rule__Score__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1007:1: ( rule__Score__Group__3__Impl rule__Score__Group__4 )
            // InternalLilyPond.g:1008:2: rule__Score__Group__3__Impl rule__Score__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Score__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__4();

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
    // $ANTLR end "rule__Score__Group__3"


    // $ANTLR start "rule__Score__Group__3__Impl"
    // InternalLilyPond.g:1015:1: rule__Score__Group__3__Impl : ( '<<' ) ;
    public final void rule__Score__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1019:1: ( ( '<<' ) )
            // InternalLilyPond.g:1020:1: ( '<<' )
            {
            // InternalLilyPond.g:1020:1: ( '<<' )
            // InternalLilyPond.g:1021:2: '<<'
            {
             before(grammarAccess.getScoreAccess().getLessThanSignLessThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getLessThanSignLessThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Score__Group__3__Impl"


    // $ANTLR start "rule__Score__Group__4"
    // InternalLilyPond.g:1030:1: rule__Score__Group__4 : rule__Score__Group__4__Impl rule__Score__Group__5 ;
    public final void rule__Score__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1034:1: ( rule__Score__Group__4__Impl rule__Score__Group__5 )
            // InternalLilyPond.g:1035:2: rule__Score__Group__4__Impl rule__Score__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Score__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__5();

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
    // $ANTLR end "rule__Score__Group__4"


    // $ANTLR start "rule__Score__Group__4__Impl"
    // InternalLilyPond.g:1042:1: rule__Score__Group__4__Impl : ( ( rule__Score__StaffAssignment_4 ) ) ;
    public final void rule__Score__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1046:1: ( ( ( rule__Score__StaffAssignment_4 ) ) )
            // InternalLilyPond.g:1047:1: ( ( rule__Score__StaffAssignment_4 ) )
            {
            // InternalLilyPond.g:1047:1: ( ( rule__Score__StaffAssignment_4 ) )
            // InternalLilyPond.g:1048:2: ( rule__Score__StaffAssignment_4 )
            {
             before(grammarAccess.getScoreAccess().getStaffAssignment_4()); 
            // InternalLilyPond.g:1049:2: ( rule__Score__StaffAssignment_4 )
            // InternalLilyPond.g:1049:3: rule__Score__StaffAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Score__StaffAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getStaffAssignment_4()); 

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
    // $ANTLR end "rule__Score__Group__4__Impl"


    // $ANTLR start "rule__Score__Group__5"
    // InternalLilyPond.g:1057:1: rule__Score__Group__5 : rule__Score__Group__5__Impl rule__Score__Group__6 ;
    public final void rule__Score__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1061:1: ( rule__Score__Group__5__Impl rule__Score__Group__6 )
            // InternalLilyPond.g:1062:2: rule__Score__Group__5__Impl rule__Score__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Score__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__6();

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
    // $ANTLR end "rule__Score__Group__5"


    // $ANTLR start "rule__Score__Group__5__Impl"
    // InternalLilyPond.g:1069:1: rule__Score__Group__5__Impl : ( ( rule__Score__LyricsAssignment_5 ) ) ;
    public final void rule__Score__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1073:1: ( ( ( rule__Score__LyricsAssignment_5 ) ) )
            // InternalLilyPond.g:1074:1: ( ( rule__Score__LyricsAssignment_5 ) )
            {
            // InternalLilyPond.g:1074:1: ( ( rule__Score__LyricsAssignment_5 ) )
            // InternalLilyPond.g:1075:2: ( rule__Score__LyricsAssignment_5 )
            {
             before(grammarAccess.getScoreAccess().getLyricsAssignment_5()); 
            // InternalLilyPond.g:1076:2: ( rule__Score__LyricsAssignment_5 )
            // InternalLilyPond.g:1076:3: rule__Score__LyricsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Score__LyricsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getLyricsAssignment_5()); 

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
    // $ANTLR end "rule__Score__Group__5__Impl"


    // $ANTLR start "rule__Score__Group__6"
    // InternalLilyPond.g:1084:1: rule__Score__Group__6 : rule__Score__Group__6__Impl rule__Score__Group__7 ;
    public final void rule__Score__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1088:1: ( rule__Score__Group__6__Impl rule__Score__Group__7 )
            // InternalLilyPond.g:1089:2: rule__Score__Group__6__Impl rule__Score__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Score__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__7();

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
    // $ANTLR end "rule__Score__Group__6"


    // $ANTLR start "rule__Score__Group__6__Impl"
    // InternalLilyPond.g:1096:1: rule__Score__Group__6__Impl : ( '>>' ) ;
    public final void rule__Score__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1100:1: ( ( '>>' ) )
            // InternalLilyPond.g:1101:1: ( '>>' )
            {
            // InternalLilyPond.g:1101:1: ( '>>' )
            // InternalLilyPond.g:1102:2: '>>'
            {
             before(grammarAccess.getScoreAccess().getGreaterThanSignGreaterThanSignKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getGreaterThanSignGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__Score__Group__6__Impl"


    // $ANTLR start "rule__Score__Group__7"
    // InternalLilyPond.g:1111:1: rule__Score__Group__7 : rule__Score__Group__7__Impl ;
    public final void rule__Score__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1115:1: ( rule__Score__Group__7__Impl )
            // InternalLilyPond.g:1116:2: rule__Score__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__7__Impl();

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
    // $ANTLR end "rule__Score__Group__7"


    // $ANTLR start "rule__Score__Group__7__Impl"
    // InternalLilyPond.g:1122:1: rule__Score__Group__7__Impl : ( '}' ) ;
    public final void rule__Score__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1126:1: ( ( '}' ) )
            // InternalLilyPond.g:1127:1: ( '}' )
            {
            // InternalLilyPond.g:1127:1: ( '}' )
            // InternalLilyPond.g:1128:2: '}'
            {
             before(grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Score__Group__7__Impl"


    // $ANTLR start "rule__Staff__Group__0"
    // InternalLilyPond.g:1138:1: rule__Staff__Group__0 : rule__Staff__Group__0__Impl rule__Staff__Group__1 ;
    public final void rule__Staff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1142:1: ( rule__Staff__Group__0__Impl rule__Staff__Group__1 )
            // InternalLilyPond.g:1143:2: rule__Staff__Group__0__Impl rule__Staff__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Staff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__1();

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
    // $ANTLR end "rule__Staff__Group__0"


    // $ANTLR start "rule__Staff__Group__0__Impl"
    // InternalLilyPond.g:1150:1: rule__Staff__Group__0__Impl : ( () ) ;
    public final void rule__Staff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1154:1: ( ( () ) )
            // InternalLilyPond.g:1155:1: ( () )
            {
            // InternalLilyPond.g:1155:1: ( () )
            // InternalLilyPond.g:1156:2: ()
            {
             before(grammarAccess.getStaffAccess().getStaffAction_0()); 
            // InternalLilyPond.g:1157:2: ()
            // InternalLilyPond.g:1157:3: 
            {
            }

             after(grammarAccess.getStaffAccess().getStaffAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__0__Impl"


    // $ANTLR start "rule__Staff__Group__1"
    // InternalLilyPond.g:1165:1: rule__Staff__Group__1 : rule__Staff__Group__1__Impl rule__Staff__Group__2 ;
    public final void rule__Staff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1169:1: ( rule__Staff__Group__1__Impl rule__Staff__Group__2 )
            // InternalLilyPond.g:1170:2: rule__Staff__Group__1__Impl rule__Staff__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Staff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__2();

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
    // $ANTLR end "rule__Staff__Group__1"


    // $ANTLR start "rule__Staff__Group__1__Impl"
    // InternalLilyPond.g:1177:1: rule__Staff__Group__1__Impl : ( '\\\\new' ) ;
    public final void rule__Staff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1181:1: ( ( '\\\\new' ) )
            // InternalLilyPond.g:1182:1: ( '\\\\new' )
            {
            // InternalLilyPond.g:1182:1: ( '\\\\new' )
            // InternalLilyPond.g:1183:2: '\\\\new'
            {
             before(grammarAccess.getStaffAccess().getNewKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getNewKeyword_1()); 

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
    // $ANTLR end "rule__Staff__Group__1__Impl"


    // $ANTLR start "rule__Staff__Group__2"
    // InternalLilyPond.g:1192:1: rule__Staff__Group__2 : rule__Staff__Group__2__Impl rule__Staff__Group__3 ;
    public final void rule__Staff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1196:1: ( rule__Staff__Group__2__Impl rule__Staff__Group__3 )
            // InternalLilyPond.g:1197:2: rule__Staff__Group__2__Impl rule__Staff__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Staff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__3();

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
    // $ANTLR end "rule__Staff__Group__2"


    // $ANTLR start "rule__Staff__Group__2__Impl"
    // InternalLilyPond.g:1204:1: rule__Staff__Group__2__Impl : ( 'Staff' ) ;
    public final void rule__Staff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1208:1: ( ( 'Staff' ) )
            // InternalLilyPond.g:1209:1: ( 'Staff' )
            {
            // InternalLilyPond.g:1209:1: ( 'Staff' )
            // InternalLilyPond.g:1210:2: 'Staff'
            {
             before(grammarAccess.getStaffAccess().getStaffKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getStaffKeyword_2()); 

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
    // $ANTLR end "rule__Staff__Group__2__Impl"


    // $ANTLR start "rule__Staff__Group__3"
    // InternalLilyPond.g:1219:1: rule__Staff__Group__3 : rule__Staff__Group__3__Impl rule__Staff__Group__4 ;
    public final void rule__Staff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1223:1: ( rule__Staff__Group__3__Impl rule__Staff__Group__4 )
            // InternalLilyPond.g:1224:2: rule__Staff__Group__3__Impl rule__Staff__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Staff__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__4();

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
    // $ANTLR end "rule__Staff__Group__3"


    // $ANTLR start "rule__Staff__Group__3__Impl"
    // InternalLilyPond.g:1231:1: rule__Staff__Group__3__Impl : ( '{' ) ;
    public final void rule__Staff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1235:1: ( ( '{' ) )
            // InternalLilyPond.g:1236:1: ( '{' )
            {
            // InternalLilyPond.g:1236:1: ( '{' )
            // InternalLilyPond.g:1237:2: '{'
            {
             before(grammarAccess.getStaffAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Staff__Group__3__Impl"


    // $ANTLR start "rule__Staff__Group__4"
    // InternalLilyPond.g:1246:1: rule__Staff__Group__4 : rule__Staff__Group__4__Impl rule__Staff__Group__5 ;
    public final void rule__Staff__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1250:1: ( rule__Staff__Group__4__Impl rule__Staff__Group__5 )
            // InternalLilyPond.g:1251:2: rule__Staff__Group__4__Impl rule__Staff__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Staff__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__5();

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
    // $ANTLR end "rule__Staff__Group__4"


    // $ANTLR start "rule__Staff__Group__4__Impl"
    // InternalLilyPond.g:1258:1: rule__Staff__Group__4__Impl : ( ( rule__Staff__KeyAssignment_4 ) ) ;
    public final void rule__Staff__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1262:1: ( ( ( rule__Staff__KeyAssignment_4 ) ) )
            // InternalLilyPond.g:1263:1: ( ( rule__Staff__KeyAssignment_4 ) )
            {
            // InternalLilyPond.g:1263:1: ( ( rule__Staff__KeyAssignment_4 ) )
            // InternalLilyPond.g:1264:2: ( rule__Staff__KeyAssignment_4 )
            {
             before(grammarAccess.getStaffAccess().getKeyAssignment_4()); 
            // InternalLilyPond.g:1265:2: ( rule__Staff__KeyAssignment_4 )
            // InternalLilyPond.g:1265:3: rule__Staff__KeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Staff__KeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getKeyAssignment_4()); 

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
    // $ANTLR end "rule__Staff__Group__4__Impl"


    // $ANTLR start "rule__Staff__Group__5"
    // InternalLilyPond.g:1273:1: rule__Staff__Group__5 : rule__Staff__Group__5__Impl rule__Staff__Group__6 ;
    public final void rule__Staff__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1277:1: ( rule__Staff__Group__5__Impl rule__Staff__Group__6 )
            // InternalLilyPond.g:1278:2: rule__Staff__Group__5__Impl rule__Staff__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Staff__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__6();

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
    // $ANTLR end "rule__Staff__Group__5"


    // $ANTLR start "rule__Staff__Group__5__Impl"
    // InternalLilyPond.g:1285:1: rule__Staff__Group__5__Impl : ( ( rule__Staff__TimeAssignment_5 ) ) ;
    public final void rule__Staff__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1289:1: ( ( ( rule__Staff__TimeAssignment_5 ) ) )
            // InternalLilyPond.g:1290:1: ( ( rule__Staff__TimeAssignment_5 ) )
            {
            // InternalLilyPond.g:1290:1: ( ( rule__Staff__TimeAssignment_5 ) )
            // InternalLilyPond.g:1291:2: ( rule__Staff__TimeAssignment_5 )
            {
             before(grammarAccess.getStaffAccess().getTimeAssignment_5()); 
            // InternalLilyPond.g:1292:2: ( rule__Staff__TimeAssignment_5 )
            // InternalLilyPond.g:1292:3: rule__Staff__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Staff__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getTimeAssignment_5()); 

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
    // $ANTLR end "rule__Staff__Group__5__Impl"


    // $ANTLR start "rule__Staff__Group__6"
    // InternalLilyPond.g:1300:1: rule__Staff__Group__6 : rule__Staff__Group__6__Impl rule__Staff__Group__7 ;
    public final void rule__Staff__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1304:1: ( rule__Staff__Group__6__Impl rule__Staff__Group__7 )
            // InternalLilyPond.g:1305:2: rule__Staff__Group__6__Impl rule__Staff__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Staff__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__7();

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
    // $ANTLR end "rule__Staff__Group__6"


    // $ANTLR start "rule__Staff__Group__6__Impl"
    // InternalLilyPond.g:1312:1: rule__Staff__Group__6__Impl : ( ( rule__Staff__AbsoluteAssignment_6 ) ) ;
    public final void rule__Staff__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1316:1: ( ( ( rule__Staff__AbsoluteAssignment_6 ) ) )
            // InternalLilyPond.g:1317:1: ( ( rule__Staff__AbsoluteAssignment_6 ) )
            {
            // InternalLilyPond.g:1317:1: ( ( rule__Staff__AbsoluteAssignment_6 ) )
            // InternalLilyPond.g:1318:2: ( rule__Staff__AbsoluteAssignment_6 )
            {
             before(grammarAccess.getStaffAccess().getAbsoluteAssignment_6()); 
            // InternalLilyPond.g:1319:2: ( rule__Staff__AbsoluteAssignment_6 )
            // InternalLilyPond.g:1319:3: rule__Staff__AbsoluteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Staff__AbsoluteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getAbsoluteAssignment_6()); 

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
    // $ANTLR end "rule__Staff__Group__6__Impl"


    // $ANTLR start "rule__Staff__Group__7"
    // InternalLilyPond.g:1327:1: rule__Staff__Group__7 : rule__Staff__Group__7__Impl ;
    public final void rule__Staff__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1331:1: ( rule__Staff__Group__7__Impl )
            // InternalLilyPond.g:1332:2: rule__Staff__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__7__Impl();

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
    // $ANTLR end "rule__Staff__Group__7"


    // $ANTLR start "rule__Staff__Group__7__Impl"
    // InternalLilyPond.g:1338:1: rule__Staff__Group__7__Impl : ( '}' ) ;
    public final void rule__Staff__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1342:1: ( ( '}' ) )
            // InternalLilyPond.g:1343:1: ( '}' )
            {
            // InternalLilyPond.g:1343:1: ( '}' )
            // InternalLilyPond.g:1344:2: '}'
            {
             before(grammarAccess.getStaffAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Staff__Group__7__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // InternalLilyPond.g:1354:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1358:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalLilyPond.g:1359:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__1();

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
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // InternalLilyPond.g:1366:1: rule__Key__Group__0__Impl : ( () ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1370:1: ( ( () ) )
            // InternalLilyPond.g:1371:1: ( () )
            {
            // InternalLilyPond.g:1371:1: ( () )
            // InternalLilyPond.g:1372:2: ()
            {
             before(grammarAccess.getKeyAccess().getKeyAction_0()); 
            // InternalLilyPond.g:1373:2: ()
            // InternalLilyPond.g:1373:3: 
            {
            }

             after(grammarAccess.getKeyAccess().getKeyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // InternalLilyPond.g:1381:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1385:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalLilyPond.g:1386:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__2();

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
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // InternalLilyPond.g:1393:1: rule__Key__Group__1__Impl : ( '\\\\key' ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1397:1: ( ( '\\\\key' ) )
            // InternalLilyPond.g:1398:1: ( '\\\\key' )
            {
            // InternalLilyPond.g:1398:1: ( '\\\\key' )
            // InternalLilyPond.g:1399:2: '\\\\key'
            {
             before(grammarAccess.getKeyAccess().getKeyKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getKeyKeyword_1()); 

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
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group__2"
    // InternalLilyPond.g:1408:1: rule__Key__Group__2 : rule__Key__Group__2__Impl rule__Key__Group__3 ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1412:1: ( rule__Key__Group__2__Impl rule__Key__Group__3 )
            // InternalLilyPond.g:1413:2: rule__Key__Group__2__Impl rule__Key__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Key__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__3();

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
    // $ANTLR end "rule__Key__Group__2"


    // $ANTLR start "rule__Key__Group__2__Impl"
    // InternalLilyPond.g:1420:1: rule__Key__Group__2__Impl : ( 'c' ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1424:1: ( ( 'c' ) )
            // InternalLilyPond.g:1425:1: ( 'c' )
            {
            // InternalLilyPond.g:1425:1: ( 'c' )
            // InternalLilyPond.g:1426:2: 'c'
            {
             before(grammarAccess.getKeyAccess().getCKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getCKeyword_2()); 

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
    // $ANTLR end "rule__Key__Group__2__Impl"


    // $ANTLR start "rule__Key__Group__3"
    // InternalLilyPond.g:1435:1: rule__Key__Group__3 : rule__Key__Group__3__Impl ;
    public final void rule__Key__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1439:1: ( rule__Key__Group__3__Impl )
            // InternalLilyPond.g:1440:2: rule__Key__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__3__Impl();

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
    // $ANTLR end "rule__Key__Group__3"


    // $ANTLR start "rule__Key__Group__3__Impl"
    // InternalLilyPond.g:1446:1: rule__Key__Group__3__Impl : ( '\\\\major' ) ;
    public final void rule__Key__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1450:1: ( ( '\\\\major' ) )
            // InternalLilyPond.g:1451:1: ( '\\\\major' )
            {
            // InternalLilyPond.g:1451:1: ( '\\\\major' )
            // InternalLilyPond.g:1452:2: '\\\\major'
            {
             before(grammarAccess.getKeyAccess().getMajorKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getMajorKeyword_3()); 

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
    // $ANTLR end "rule__Key__Group__3__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalLilyPond.g:1462:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1466:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalLilyPond.g:1467:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

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
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalLilyPond.g:1474:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1478:1: ( ( () ) )
            // InternalLilyPond.g:1479:1: ( () )
            {
            // InternalLilyPond.g:1479:1: ( () )
            // InternalLilyPond.g:1480:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0()); 
            // InternalLilyPond.g:1481:2: ()
            // InternalLilyPond.g:1481:3: 
            {
            }

             after(grammarAccess.getTimeAccess().getTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalLilyPond.g:1489:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1493:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalLilyPond.g:1494:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__2();

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
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalLilyPond.g:1501:1: rule__Time__Group__1__Impl : ( '\\\\time' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1505:1: ( ( '\\\\time' ) )
            // InternalLilyPond.g:1506:1: ( '\\\\time' )
            {
            // InternalLilyPond.g:1506:1: ( '\\\\time' )
            // InternalLilyPond.g:1507:2: '\\\\time'
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeKeyword_1()); 

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
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__2"
    // InternalLilyPond.g:1516:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1520:1: ( rule__Time__Group__2__Impl )
            // InternalLilyPond.g:1521:2: rule__Time__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__2__Impl();

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
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // InternalLilyPond.g:1527:1: rule__Time__Group__2__Impl : ( '4/4' ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1531:1: ( ( '4/4' ) )
            // InternalLilyPond.g:1532:1: ( '4/4' )
            {
            // InternalLilyPond.g:1532:1: ( '4/4' )
            // InternalLilyPond.g:1533:2: '4/4'
            {
             before(grammarAccess.getTimeAccess().getDigitFourSolidusDigitFourKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getDigitFourSolidusDigitFourKeyword_2()); 

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
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Absolute__Group__0"
    // InternalLilyPond.g:1543:1: rule__Absolute__Group__0 : rule__Absolute__Group__0__Impl rule__Absolute__Group__1 ;
    public final void rule__Absolute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1547:1: ( rule__Absolute__Group__0__Impl rule__Absolute__Group__1 )
            // InternalLilyPond.g:1548:2: rule__Absolute__Group__0__Impl rule__Absolute__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Absolute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absolute__Group__1();

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
    // $ANTLR end "rule__Absolute__Group__0"


    // $ANTLR start "rule__Absolute__Group__0__Impl"
    // InternalLilyPond.g:1555:1: rule__Absolute__Group__0__Impl : ( () ) ;
    public final void rule__Absolute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1559:1: ( ( () ) )
            // InternalLilyPond.g:1560:1: ( () )
            {
            // InternalLilyPond.g:1560:1: ( () )
            // InternalLilyPond.g:1561:2: ()
            {
             before(grammarAccess.getAbsoluteAccess().getAbsoluteAction_0()); 
            // InternalLilyPond.g:1562:2: ()
            // InternalLilyPond.g:1562:3: 
            {
            }

             after(grammarAccess.getAbsoluteAccess().getAbsoluteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Absolute__Group__0__Impl"


    // $ANTLR start "rule__Absolute__Group__1"
    // InternalLilyPond.g:1570:1: rule__Absolute__Group__1 : rule__Absolute__Group__1__Impl rule__Absolute__Group__2 ;
    public final void rule__Absolute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1574:1: ( rule__Absolute__Group__1__Impl rule__Absolute__Group__2 )
            // InternalLilyPond.g:1575:2: rule__Absolute__Group__1__Impl rule__Absolute__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Absolute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absolute__Group__2();

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
    // $ANTLR end "rule__Absolute__Group__1"


    // $ANTLR start "rule__Absolute__Group__1__Impl"
    // InternalLilyPond.g:1582:1: rule__Absolute__Group__1__Impl : ( '\\\\absolute' ) ;
    public final void rule__Absolute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1586:1: ( ( '\\\\absolute' ) )
            // InternalLilyPond.g:1587:1: ( '\\\\absolute' )
            {
            // InternalLilyPond.g:1587:1: ( '\\\\absolute' )
            // InternalLilyPond.g:1588:2: '\\\\absolute'
            {
             before(grammarAccess.getAbsoluteAccess().getAbsoluteKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAbsoluteAccess().getAbsoluteKeyword_1()); 

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
    // $ANTLR end "rule__Absolute__Group__1__Impl"


    // $ANTLR start "rule__Absolute__Group__2"
    // InternalLilyPond.g:1597:1: rule__Absolute__Group__2 : rule__Absolute__Group__2__Impl rule__Absolute__Group__3 ;
    public final void rule__Absolute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1601:1: ( rule__Absolute__Group__2__Impl rule__Absolute__Group__3 )
            // InternalLilyPond.g:1602:2: rule__Absolute__Group__2__Impl rule__Absolute__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Absolute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absolute__Group__3();

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
    // $ANTLR end "rule__Absolute__Group__2"


    // $ANTLR start "rule__Absolute__Group__2__Impl"
    // InternalLilyPond.g:1609:1: rule__Absolute__Group__2__Impl : ( '{' ) ;
    public final void rule__Absolute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1613:1: ( ( '{' ) )
            // InternalLilyPond.g:1614:1: ( '{' )
            {
            // InternalLilyPond.g:1614:1: ( '{' )
            // InternalLilyPond.g:1615:2: '{'
            {
             before(grammarAccess.getAbsoluteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAbsoluteAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Absolute__Group__2__Impl"


    // $ANTLR start "rule__Absolute__Group__3"
    // InternalLilyPond.g:1624:1: rule__Absolute__Group__3 : rule__Absolute__Group__3__Impl rule__Absolute__Group__4 ;
    public final void rule__Absolute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1628:1: ( rule__Absolute__Group__3__Impl rule__Absolute__Group__4 )
            // InternalLilyPond.g:1629:2: rule__Absolute__Group__3__Impl rule__Absolute__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Absolute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absolute__Group__4();

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
    // $ANTLR end "rule__Absolute__Group__3"


    // $ANTLR start "rule__Absolute__Group__3__Impl"
    // InternalLilyPond.g:1636:1: rule__Absolute__Group__3__Impl : ( ( rule__Absolute__ItemsAssignment_3 )* ) ;
    public final void rule__Absolute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1640:1: ( ( ( rule__Absolute__ItemsAssignment_3 )* ) )
            // InternalLilyPond.g:1641:1: ( ( rule__Absolute__ItemsAssignment_3 )* )
            {
            // InternalLilyPond.g:1641:1: ( ( rule__Absolute__ItemsAssignment_3 )* )
            // InternalLilyPond.g:1642:2: ( rule__Absolute__ItemsAssignment_3 )*
            {
             before(grammarAccess.getAbsoluteAccess().getItemsAssignment_3()); 
            // InternalLilyPond.g:1643:2: ( rule__Absolute__ItemsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLilyPond.g:1643:3: rule__Absolute__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Absolute__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAbsoluteAccess().getItemsAssignment_3()); 

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
    // $ANTLR end "rule__Absolute__Group__3__Impl"


    // $ANTLR start "rule__Absolute__Group__4"
    // InternalLilyPond.g:1651:1: rule__Absolute__Group__4 : rule__Absolute__Group__4__Impl ;
    public final void rule__Absolute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1655:1: ( rule__Absolute__Group__4__Impl )
            // InternalLilyPond.g:1656:2: rule__Absolute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Absolute__Group__4__Impl();

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
    // $ANTLR end "rule__Absolute__Group__4"


    // $ANTLR start "rule__Absolute__Group__4__Impl"
    // InternalLilyPond.g:1662:1: rule__Absolute__Group__4__Impl : ( '}' ) ;
    public final void rule__Absolute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1666:1: ( ( '}' ) )
            // InternalLilyPond.g:1667:1: ( '}' )
            {
            // InternalLilyPond.g:1667:1: ( '}' )
            // InternalLilyPond.g:1668:2: '}'
            {
             before(grammarAccess.getAbsoluteAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAbsoluteAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Absolute__Group__4__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalLilyPond.g:1678:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1682:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyPond.g:1683:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalLilyPond.g:1690:1: rule__Note__Group__0__Impl : ( () ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1694:1: ( ( () ) )
            // InternalLilyPond.g:1695:1: ( () )
            {
            // InternalLilyPond.g:1695:1: ( () )
            // InternalLilyPond.g:1696:2: ()
            {
             before(grammarAccess.getNoteAccess().getNoteAction_0()); 
            // InternalLilyPond.g:1697:2: ()
            // InternalLilyPond.g:1697:3: 
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
    // InternalLilyPond.g:1705:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1709:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalLilyPond.g:1710:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalLilyPond.g:1717:1: rule__Note__Group__1__Impl : ( ( rule__Note__NameAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1721:1: ( ( ( rule__Note__NameAssignment_1 ) ) )
            // InternalLilyPond.g:1722:1: ( ( rule__Note__NameAssignment_1 ) )
            {
            // InternalLilyPond.g:1722:1: ( ( rule__Note__NameAssignment_1 ) )
            // InternalLilyPond.g:1723:2: ( rule__Note__NameAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_1()); 
            // InternalLilyPond.g:1724:2: ( rule__Note__NameAssignment_1 )
            // InternalLilyPond.g:1724:3: rule__Note__NameAssignment_1
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
    // InternalLilyPond.g:1732:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1736:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalLilyPond.g:1737:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalLilyPond.g:1744:1: rule__Note__Group__2__Impl : ( ( rule__Note__OctaveAssignment_2 ) ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1748:1: ( ( ( rule__Note__OctaveAssignment_2 ) ) )
            // InternalLilyPond.g:1749:1: ( ( rule__Note__OctaveAssignment_2 ) )
            {
            // InternalLilyPond.g:1749:1: ( ( rule__Note__OctaveAssignment_2 ) )
            // InternalLilyPond.g:1750:2: ( rule__Note__OctaveAssignment_2 )
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_2()); 
            // InternalLilyPond.g:1751:2: ( rule__Note__OctaveAssignment_2 )
            // InternalLilyPond.g:1751:3: rule__Note__OctaveAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Note__OctaveAssignment_2();

            state._fsp--;


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
    // InternalLilyPond.g:1759:1: rule__Note__Group__3 : rule__Note__Group__3__Impl ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1763:1: ( rule__Note__Group__3__Impl )
            // InternalLilyPond.g:1764:2: rule__Note__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__3__Impl();

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
    // InternalLilyPond.g:1770:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 ) ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1774:1: ( ( ( rule__Note__DurationAssignment_3 ) ) )
            // InternalLilyPond.g:1775:1: ( ( rule__Note__DurationAssignment_3 ) )
            {
            // InternalLilyPond.g:1775:1: ( ( rule__Note__DurationAssignment_3 ) )
            // InternalLilyPond.g:1776:2: ( rule__Note__DurationAssignment_3 )
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // InternalLilyPond.g:1777:2: ( rule__Note__DurationAssignment_3 )
            // InternalLilyPond.g:1777:3: rule__Note__DurationAssignment_3
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


    // $ANTLR start "rule__OctaveRep__Group_0__0"
    // InternalLilyPond.g:1786:1: rule__OctaveRep__Group_0__0 : rule__OctaveRep__Group_0__0__Impl rule__OctaveRep__Group_0__1 ;
    public final void rule__OctaveRep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1790:1: ( rule__OctaveRep__Group_0__0__Impl rule__OctaveRep__Group_0__1 )
            // InternalLilyPond.g:1791:2: rule__OctaveRep__Group_0__0__Impl rule__OctaveRep__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__OctaveRep__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OctaveRep__Group_0__1();

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
    // $ANTLR end "rule__OctaveRep__Group_0__0"


    // $ANTLR start "rule__OctaveRep__Group_0__0__Impl"
    // InternalLilyPond.g:1798:1: rule__OctaveRep__Group_0__0__Impl : ( () ) ;
    public final void rule__OctaveRep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1802:1: ( ( () ) )
            // InternalLilyPond.g:1803:1: ( () )
            {
            // InternalLilyPond.g:1803:1: ( () )
            // InternalLilyPond.g:1804:2: ()
            {
             before(grammarAccess.getOctaveRepAccess().getQuotesAction_0_0()); 
            // InternalLilyPond.g:1805:2: ()
            // InternalLilyPond.g:1805:3: 
            {
            }

             after(grammarAccess.getOctaveRepAccess().getQuotesAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OctaveRep__Group_0__0__Impl"


    // $ANTLR start "rule__OctaveRep__Group_0__1"
    // InternalLilyPond.g:1813:1: rule__OctaveRep__Group_0__1 : rule__OctaveRep__Group_0__1__Impl ;
    public final void rule__OctaveRep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1817:1: ( rule__OctaveRep__Group_0__1__Impl )
            // InternalLilyPond.g:1818:2: rule__OctaveRep__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OctaveRep__Group_0__1__Impl();

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
    // $ANTLR end "rule__OctaveRep__Group_0__1"


    // $ANTLR start "rule__OctaveRep__Group_0__1__Impl"
    // InternalLilyPond.g:1824:1: rule__OctaveRep__Group_0__1__Impl : ( ( rule__OctaveRep__ValueAssignment_0_1 )* ) ;
    public final void rule__OctaveRep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1828:1: ( ( ( rule__OctaveRep__ValueAssignment_0_1 )* ) )
            // InternalLilyPond.g:1829:1: ( ( rule__OctaveRep__ValueAssignment_0_1 )* )
            {
            // InternalLilyPond.g:1829:1: ( ( rule__OctaveRep__ValueAssignment_0_1 )* )
            // InternalLilyPond.g:1830:2: ( rule__OctaveRep__ValueAssignment_0_1 )*
            {
             before(grammarAccess.getOctaveRepAccess().getValueAssignment_0_1()); 
            // InternalLilyPond.g:1831:2: ( rule__OctaveRep__ValueAssignment_0_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLilyPond.g:1831:3: rule__OctaveRep__ValueAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__OctaveRep__ValueAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOctaveRepAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__OctaveRep__Group_0__1__Impl"


    // $ANTLR start "rule__OctaveRep__Group_1__0"
    // InternalLilyPond.g:1840:1: rule__OctaveRep__Group_1__0 : rule__OctaveRep__Group_1__0__Impl rule__OctaveRep__Group_1__1 ;
    public final void rule__OctaveRep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1844:1: ( rule__OctaveRep__Group_1__0__Impl rule__OctaveRep__Group_1__1 )
            // InternalLilyPond.g:1845:2: rule__OctaveRep__Group_1__0__Impl rule__OctaveRep__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__OctaveRep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OctaveRep__Group_1__1();

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
    // $ANTLR end "rule__OctaveRep__Group_1__0"


    // $ANTLR start "rule__OctaveRep__Group_1__0__Impl"
    // InternalLilyPond.g:1852:1: rule__OctaveRep__Group_1__0__Impl : ( () ) ;
    public final void rule__OctaveRep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1856:1: ( ( () ) )
            // InternalLilyPond.g:1857:1: ( () )
            {
            // InternalLilyPond.g:1857:1: ( () )
            // InternalLilyPond.g:1858:2: ()
            {
             before(grammarAccess.getOctaveRepAccess().getCommasAction_1_0()); 
            // InternalLilyPond.g:1859:2: ()
            // InternalLilyPond.g:1859:3: 
            {
            }

             after(grammarAccess.getOctaveRepAccess().getCommasAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OctaveRep__Group_1__0__Impl"


    // $ANTLR start "rule__OctaveRep__Group_1__1"
    // InternalLilyPond.g:1867:1: rule__OctaveRep__Group_1__1 : rule__OctaveRep__Group_1__1__Impl ;
    public final void rule__OctaveRep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1871:1: ( rule__OctaveRep__Group_1__1__Impl )
            // InternalLilyPond.g:1872:2: rule__OctaveRep__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OctaveRep__Group_1__1__Impl();

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
    // $ANTLR end "rule__OctaveRep__Group_1__1"


    // $ANTLR start "rule__OctaveRep__Group_1__1__Impl"
    // InternalLilyPond.g:1878:1: rule__OctaveRep__Group_1__1__Impl : ( ( rule__OctaveRep__ValueAssignment_1_1 )* ) ;
    public final void rule__OctaveRep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1882:1: ( ( ( rule__OctaveRep__ValueAssignment_1_1 )* ) )
            // InternalLilyPond.g:1883:1: ( ( rule__OctaveRep__ValueAssignment_1_1 )* )
            {
            // InternalLilyPond.g:1883:1: ( ( rule__OctaveRep__ValueAssignment_1_1 )* )
            // InternalLilyPond.g:1884:2: ( rule__OctaveRep__ValueAssignment_1_1 )*
            {
             before(grammarAccess.getOctaveRepAccess().getValueAssignment_1_1()); 
            // InternalLilyPond.g:1885:2: ( rule__OctaveRep__ValueAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyPond.g:1885:3: rule__OctaveRep__ValueAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__OctaveRep__ValueAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOctaveRepAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__OctaveRep__Group_1__1__Impl"


    // $ANTLR start "rule__Lyrics__Group__0"
    // InternalLilyPond.g:1894:1: rule__Lyrics__Group__0 : rule__Lyrics__Group__0__Impl rule__Lyrics__Group__1 ;
    public final void rule__Lyrics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1898:1: ( rule__Lyrics__Group__0__Impl rule__Lyrics__Group__1 )
            // InternalLilyPond.g:1899:2: rule__Lyrics__Group__0__Impl rule__Lyrics__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Lyrics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__1();

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
    // $ANTLR end "rule__Lyrics__Group__0"


    // $ANTLR start "rule__Lyrics__Group__0__Impl"
    // InternalLilyPond.g:1906:1: rule__Lyrics__Group__0__Impl : ( () ) ;
    public final void rule__Lyrics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1910:1: ( ( () ) )
            // InternalLilyPond.g:1911:1: ( () )
            {
            // InternalLilyPond.g:1911:1: ( () )
            // InternalLilyPond.g:1912:2: ()
            {
             before(grammarAccess.getLyricsAccess().getLyricsAction_0()); 
            // InternalLilyPond.g:1913:2: ()
            // InternalLilyPond.g:1913:3: 
            {
            }

             after(grammarAccess.getLyricsAccess().getLyricsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lyrics__Group__0__Impl"


    // $ANTLR start "rule__Lyrics__Group__1"
    // InternalLilyPond.g:1921:1: rule__Lyrics__Group__1 : rule__Lyrics__Group__1__Impl rule__Lyrics__Group__2 ;
    public final void rule__Lyrics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1925:1: ( rule__Lyrics__Group__1__Impl rule__Lyrics__Group__2 )
            // InternalLilyPond.g:1926:2: rule__Lyrics__Group__1__Impl rule__Lyrics__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Lyrics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__2();

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
    // $ANTLR end "rule__Lyrics__Group__1"


    // $ANTLR start "rule__Lyrics__Group__1__Impl"
    // InternalLilyPond.g:1933:1: rule__Lyrics__Group__1__Impl : ( '\\\\addlyrics' ) ;
    public final void rule__Lyrics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1937:1: ( ( '\\\\addlyrics' ) )
            // InternalLilyPond.g:1938:1: ( '\\\\addlyrics' )
            {
            // InternalLilyPond.g:1938:1: ( '\\\\addlyrics' )
            // InternalLilyPond.g:1939:2: '\\\\addlyrics'
            {
             before(grammarAccess.getLyricsAccess().getAddlyricsKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLyricsAccess().getAddlyricsKeyword_1()); 

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
    // $ANTLR end "rule__Lyrics__Group__1__Impl"


    // $ANTLR start "rule__Lyrics__Group__2"
    // InternalLilyPond.g:1948:1: rule__Lyrics__Group__2 : rule__Lyrics__Group__2__Impl rule__Lyrics__Group__3 ;
    public final void rule__Lyrics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1952:1: ( rule__Lyrics__Group__2__Impl rule__Lyrics__Group__3 )
            // InternalLilyPond.g:1953:2: rule__Lyrics__Group__2__Impl rule__Lyrics__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Lyrics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__3();

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
    // $ANTLR end "rule__Lyrics__Group__2"


    // $ANTLR start "rule__Lyrics__Group__2__Impl"
    // InternalLilyPond.g:1960:1: rule__Lyrics__Group__2__Impl : ( '{' ) ;
    public final void rule__Lyrics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1964:1: ( ( '{' ) )
            // InternalLilyPond.g:1965:1: ( '{' )
            {
            // InternalLilyPond.g:1965:1: ( '{' )
            // InternalLilyPond.g:1966:2: '{'
            {
             before(grammarAccess.getLyricsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLyricsAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Lyrics__Group__2__Impl"


    // $ANTLR start "rule__Lyrics__Group__3"
    // InternalLilyPond.g:1975:1: rule__Lyrics__Group__3 : rule__Lyrics__Group__3__Impl rule__Lyrics__Group__4 ;
    public final void rule__Lyrics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1979:1: ( rule__Lyrics__Group__3__Impl rule__Lyrics__Group__4 )
            // InternalLilyPond.g:1980:2: rule__Lyrics__Group__3__Impl rule__Lyrics__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Lyrics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__4();

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
    // $ANTLR end "rule__Lyrics__Group__3"


    // $ANTLR start "rule__Lyrics__Group__3__Impl"
    // InternalLilyPond.g:1987:1: rule__Lyrics__Group__3__Impl : ( ( rule__Lyrics__SyllablesAssignment_3 )* ) ;
    public final void rule__Lyrics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:1991:1: ( ( ( rule__Lyrics__SyllablesAssignment_3 )* ) )
            // InternalLilyPond.g:1992:1: ( ( rule__Lyrics__SyllablesAssignment_3 )* )
            {
            // InternalLilyPond.g:1992:1: ( ( rule__Lyrics__SyllablesAssignment_3 )* )
            // InternalLilyPond.g:1993:2: ( rule__Lyrics__SyllablesAssignment_3 )*
            {
             before(grammarAccess.getLyricsAccess().getSyllablesAssignment_3()); 
            // InternalLilyPond.g:1994:2: ( rule__Lyrics__SyllablesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyPond.g:1994:3: rule__Lyrics__SyllablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Lyrics__SyllablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLyricsAccess().getSyllablesAssignment_3()); 

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
    // $ANTLR end "rule__Lyrics__Group__3__Impl"


    // $ANTLR start "rule__Lyrics__Group__4"
    // InternalLilyPond.g:2002:1: rule__Lyrics__Group__4 : rule__Lyrics__Group__4__Impl ;
    public final void rule__Lyrics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2006:1: ( rule__Lyrics__Group__4__Impl )
            // InternalLilyPond.g:2007:2: rule__Lyrics__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lyrics__Group__4__Impl();

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
    // $ANTLR end "rule__Lyrics__Group__4"


    // $ANTLR start "rule__Lyrics__Group__4__Impl"
    // InternalLilyPond.g:2013:1: rule__Lyrics__Group__4__Impl : ( '}' ) ;
    public final void rule__Lyrics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2017:1: ( ( '}' ) )
            // InternalLilyPond.g:2018:1: ( '}' )
            {
            // InternalLilyPond.g:2018:1: ( '}' )
            // InternalLilyPond.g:2019:2: '}'
            {
             before(grammarAccess.getLyricsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLyricsAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Lyrics__Group__4__Impl"


    // $ANTLR start "rule__File__VersionAssignment_1"
    // InternalLilyPond.g:2029:1: rule__File__VersionAssignment_1 : ( ruleVersion ) ;
    public final void rule__File__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2033:1: ( ( ruleVersion ) )
            // InternalLilyPond.g:2034:2: ( ruleVersion )
            {
            // InternalLilyPond.g:2034:2: ( ruleVersion )
            // InternalLilyPond.g:2035:3: ruleVersion
            {
             before(grammarAccess.getFileAccess().getVersionVersionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getFileAccess().getVersionVersionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__File__VersionAssignment_1"


    // $ANTLR start "rule__File__HeaderAssignment_2"
    // InternalLilyPond.g:2044:1: rule__File__HeaderAssignment_2 : ( ruleHeader ) ;
    public final void rule__File__HeaderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2048:1: ( ( ruleHeader ) )
            // InternalLilyPond.g:2049:2: ( ruleHeader )
            {
            // InternalLilyPond.g:2049:2: ( ruleHeader )
            // InternalLilyPond.g:2050:3: ruleHeader
            {
             before(grammarAccess.getFileAccess().getHeaderHeaderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getFileAccess().getHeaderHeaderParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__File__HeaderAssignment_2"


    // $ANTLR start "rule__File__ScoreAssignment_3"
    // InternalLilyPond.g:2059:1: rule__File__ScoreAssignment_3 : ( ruleScore ) ;
    public final void rule__File__ScoreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2063:1: ( ( ruleScore ) )
            // InternalLilyPond.g:2064:2: ( ruleScore )
            {
            // InternalLilyPond.g:2064:2: ( ruleScore )
            // InternalLilyPond.g:2065:3: ruleScore
            {
             before(grammarAccess.getFileAccess().getScoreScoreParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getFileAccess().getScoreScoreParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__File__ScoreAssignment_3"


    // $ANTLR start "rule__Version__ValueAssignment_2"
    // InternalLilyPond.g:2074:1: rule__Version__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Version__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2078:1: ( ( RULE_STRING ) )
            // InternalLilyPond.g:2079:2: ( RULE_STRING )
            {
            // InternalLilyPond.g:2079:2: ( RULE_STRING )
            // InternalLilyPond.g:2080:3: RULE_STRING
            {
             before(grammarAccess.getVersionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Version__ValueAssignment_2"


    // $ANTLR start "rule__Header__TitleAssignment_3"
    // InternalLilyPond.g:2089:1: rule__Header__TitleAssignment_3 : ( ruleTitle ) ;
    public final void rule__Header__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2093:1: ( ( ruleTitle ) )
            // InternalLilyPond.g:2094:2: ( ruleTitle )
            {
            // InternalLilyPond.g:2094:2: ( ruleTitle )
            // InternalLilyPond.g:2095:3: ruleTitle
            {
             before(grammarAccess.getHeaderAccess().getTitleTitleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getTitleTitleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Header__TitleAssignment_3"


    // $ANTLR start "rule__Title__ValueAssignment_3"
    // InternalLilyPond.g:2104:1: rule__Title__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Title__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2108:1: ( ( RULE_STRING ) )
            // InternalLilyPond.g:2109:2: ( RULE_STRING )
            {
            // InternalLilyPond.g:2109:2: ( RULE_STRING )
            // InternalLilyPond.g:2110:3: RULE_STRING
            {
             before(grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Title__ValueAssignment_3"


    // $ANTLR start "rule__Score__StaffAssignment_4"
    // InternalLilyPond.g:2119:1: rule__Score__StaffAssignment_4 : ( ruleStaff ) ;
    public final void rule__Score__StaffAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2123:1: ( ( ruleStaff ) )
            // InternalLilyPond.g:2124:2: ( ruleStaff )
            {
            // InternalLilyPond.g:2124:2: ( ruleStaff )
            // InternalLilyPond.g:2125:3: ruleStaff
            {
             before(grammarAccess.getScoreAccess().getStaffStaffParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getStaffStaffParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Score__StaffAssignment_4"


    // $ANTLR start "rule__Score__LyricsAssignment_5"
    // InternalLilyPond.g:2134:1: rule__Score__LyricsAssignment_5 : ( ruleLyrics ) ;
    public final void rule__Score__LyricsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2138:1: ( ( ruleLyrics ) )
            // InternalLilyPond.g:2139:2: ( ruleLyrics )
            {
            // InternalLilyPond.g:2139:2: ( ruleLyrics )
            // InternalLilyPond.g:2140:3: ruleLyrics
            {
             before(grammarAccess.getScoreAccess().getLyricsLyricsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLyrics();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getLyricsLyricsParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Score__LyricsAssignment_5"


    // $ANTLR start "rule__Staff__KeyAssignment_4"
    // InternalLilyPond.g:2149:1: rule__Staff__KeyAssignment_4 : ( ruleKey ) ;
    public final void rule__Staff__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2153:1: ( ( ruleKey ) )
            // InternalLilyPond.g:2154:2: ( ruleKey )
            {
            // InternalLilyPond.g:2154:2: ( ruleKey )
            // InternalLilyPond.g:2155:3: ruleKey
            {
             before(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Staff__KeyAssignment_4"


    // $ANTLR start "rule__Staff__TimeAssignment_5"
    // InternalLilyPond.g:2164:1: rule__Staff__TimeAssignment_5 : ( ruleTime ) ;
    public final void rule__Staff__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2168:1: ( ( ruleTime ) )
            // InternalLilyPond.g:2169:2: ( ruleTime )
            {
            // InternalLilyPond.g:2169:2: ( ruleTime )
            // InternalLilyPond.g:2170:3: ruleTime
            {
             before(grammarAccess.getStaffAccess().getTimeTimeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getTimeTimeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Staff__TimeAssignment_5"


    // $ANTLR start "rule__Staff__AbsoluteAssignment_6"
    // InternalLilyPond.g:2179:1: rule__Staff__AbsoluteAssignment_6 : ( ruleAbsolute ) ;
    public final void rule__Staff__AbsoluteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2183:1: ( ( ruleAbsolute ) )
            // InternalLilyPond.g:2184:2: ( ruleAbsolute )
            {
            // InternalLilyPond.g:2184:2: ( ruleAbsolute )
            // InternalLilyPond.g:2185:3: ruleAbsolute
            {
             before(grammarAccess.getStaffAccess().getAbsoluteAbsoluteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbsolute();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getAbsoluteAbsoluteParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Staff__AbsoluteAssignment_6"


    // $ANTLR start "rule__Absolute__ItemsAssignment_3"
    // InternalLilyPond.g:2194:1: rule__Absolute__ItemsAssignment_3 : ( ruleNote ) ;
    public final void rule__Absolute__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2198:1: ( ( ruleNote ) )
            // InternalLilyPond.g:2199:2: ( ruleNote )
            {
            // InternalLilyPond.g:2199:2: ( ruleNote )
            // InternalLilyPond.g:2200:3: ruleNote
            {
             before(grammarAccess.getAbsoluteAccess().getItemsNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getAbsoluteAccess().getItemsNoteParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Absolute__ItemsAssignment_3"


    // $ANTLR start "rule__Note__NameAssignment_1"
    // InternalLilyPond.g:2209:1: rule__Note__NameAssignment_1 : ( ruleNoteName ) ;
    public final void rule__Note__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2213:1: ( ( ruleNoteName ) )
            // InternalLilyPond.g:2214:2: ( ruleNoteName )
            {
            // InternalLilyPond.g:2214:2: ( ruleNoteName )
            // InternalLilyPond.g:2215:3: ruleNoteName
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
    // InternalLilyPond.g:2224:1: rule__Note__OctaveAssignment_2 : ( ruleOctaveRep ) ;
    public final void rule__Note__OctaveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2228:1: ( ( ruleOctaveRep ) )
            // InternalLilyPond.g:2229:2: ( ruleOctaveRep )
            {
            // InternalLilyPond.g:2229:2: ( ruleOctaveRep )
            // InternalLilyPond.g:2230:3: ruleOctaveRep
            {
             before(grammarAccess.getNoteAccess().getOctaveOctaveRepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOctaveRep();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getOctaveOctaveRepParserRuleCall_2_0()); 

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
    // InternalLilyPond.g:2239:1: rule__Note__DurationAssignment_3 : ( RULE_INT ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2243:1: ( ( RULE_INT ) )
            // InternalLilyPond.g:2244:2: ( RULE_INT )
            {
            // InternalLilyPond.g:2244:2: ( RULE_INT )
            // InternalLilyPond.g:2245:3: RULE_INT
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


    // $ANTLR start "rule__OctaveRep__ValueAssignment_0_1"
    // InternalLilyPond.g:2254:1: rule__OctaveRep__ValueAssignment_0_1 : ( ruleQuote ) ;
    public final void rule__OctaveRep__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2258:1: ( ( ruleQuote ) )
            // InternalLilyPond.g:2259:2: ( ruleQuote )
            {
            // InternalLilyPond.g:2259:2: ( ruleQuote )
            // InternalLilyPond.g:2260:3: ruleQuote
            {
             before(grammarAccess.getOctaveRepAccess().getValueQuoteParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuote();

            state._fsp--;

             after(grammarAccess.getOctaveRepAccess().getValueQuoteParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__OctaveRep__ValueAssignment_0_1"


    // $ANTLR start "rule__OctaveRep__ValueAssignment_1_1"
    // InternalLilyPond.g:2269:1: rule__OctaveRep__ValueAssignment_1_1 : ( ruleComma ) ;
    public final void rule__OctaveRep__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2273:1: ( ( ruleComma ) )
            // InternalLilyPond.g:2274:2: ( ruleComma )
            {
            // InternalLilyPond.g:2274:2: ( ruleComma )
            // InternalLilyPond.g:2275:3: ruleComma
            {
             before(grammarAccess.getOctaveRepAccess().getValueCommaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getOctaveRepAccess().getValueCommaParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__OctaveRep__ValueAssignment_1_1"


    // $ANTLR start "rule__Lyrics__SyllablesAssignment_3"
    // InternalLilyPond.g:2284:1: rule__Lyrics__SyllablesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Lyrics__SyllablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyPond.g:2288:1: ( ( RULE_STRING ) )
            // InternalLilyPond.g:2289:2: ( RULE_STRING )
            {
            // InternalLilyPond.g:2289:2: ( RULE_STRING )
            // InternalLilyPond.g:2290:3: RULE_STRING
            {
             before(grammarAccess.getLyricsAccess().getSyllablesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLyricsAccess().getSyllablesSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Lyrics__SyllablesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000008FE000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});

}