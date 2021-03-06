/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.lilypond.parser.antlr.internal.InternalLilyPondParser;
import org.xtext.lilypond.services.LilyPondGrammarAccess;

public class LilyPondParser extends AbstractAntlrParser {

	@Inject
	private LilyPondGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLilyPondParser createParser(XtextTokenStream stream) {
		return new InternalLilyPondParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "File";
	}

	public LilyPondGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
