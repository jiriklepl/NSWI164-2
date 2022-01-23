/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.lilypond.lilyPond.Absolute;
import org.xtext.lilypond.lilyPond.Commas;
import org.xtext.lilypond.lilyPond.File;
import org.xtext.lilypond.lilyPond.Header;
import org.xtext.lilypond.lilyPond.Key;
import org.xtext.lilypond.lilyPond.LilyPondPackage;
import org.xtext.lilypond.lilyPond.Lyrics;
import org.xtext.lilypond.lilyPond.Note;
import org.xtext.lilypond.lilyPond.Quotes;
import org.xtext.lilypond.lilyPond.Score;
import org.xtext.lilypond.lilyPond.Staff;
import org.xtext.lilypond.lilyPond.Time;
import org.xtext.lilypond.lilyPond.Title;
import org.xtext.lilypond.lilyPond.Version;
import org.xtext.lilypond.services.LilyPondGrammarAccess;

@SuppressWarnings("all")
public class LilyPondSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LilyPondGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LilyPondPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LilyPondPackage.ABSOLUTE:
				sequence_Absolute(context, (Absolute) semanticObject); 
				return; 
			case LilyPondPackage.COMMAS:
				sequence_OctaveRep(context, (Commas) semanticObject); 
				return; 
			case LilyPondPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case LilyPondPackage.HEADER:
				sequence_Header(context, (Header) semanticObject); 
				return; 
			case LilyPondPackage.KEY:
				sequence_Key(context, (Key) semanticObject); 
				return; 
			case LilyPondPackage.LYRICS:
				sequence_Lyrics(context, (Lyrics) semanticObject); 
				return; 
			case LilyPondPackage.NOTE:
				sequence_Note(context, (Note) semanticObject); 
				return; 
			case LilyPondPackage.QUOTES:
				sequence_OctaveRep(context, (Quotes) semanticObject); 
				return; 
			case LilyPondPackage.SCORE:
				sequence_Score(context, (Score) semanticObject); 
				return; 
			case LilyPondPackage.STAFF:
				sequence_Staff(context, (Staff) semanticObject); 
				return; 
			case LilyPondPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case LilyPondPackage.TITLE:
				sequence_Title(context, (Title) semanticObject); 
				return; 
			case LilyPondPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Absolute returns Absolute
	 *
	 * Constraint:
	 *     items+=Note*
	 */
	protected void sequence_Absolute(ISerializationContext context, Absolute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     (version=Version header=Header score=Score)
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.FILE__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.FILE__VERSION));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.FILE__HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.FILE__HEADER));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.FILE__SCORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.FILE__SCORE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFileAccess().getVersionVersionParserRuleCall_1_0(), semanticObject.getVersion());
		feeder.accept(grammarAccess.getFileAccess().getHeaderHeaderParserRuleCall_2_0(), semanticObject.getHeader());
		feeder.accept(grammarAccess.getFileAccess().getScoreScoreParserRuleCall_3_0(), semanticObject.getScore());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Header returns Header
	 *
	 * Constraint:
	 *     title=Title
	 */
	protected void sequence_Header(ISerializationContext context, Header semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.HEADER__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.HEADER__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderAccess().getTitleTitleParserRuleCall_3_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Key returns Key
	 *
	 * Constraint:
	 *     {Key}
	 */
	protected void sequence_Key(ISerializationContext context, Key semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lyrics returns Lyrics
	 *
	 * Constraint:
	 *     syllables+=STRING*
	 */
	protected void sequence_Lyrics(ISerializationContext context, Lyrics semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Note returns Note
	 *
	 * Constraint:
	 *     (name=NoteName octave=OctaveRep duration=INT)
	 */
	protected void sequence_Note(ISerializationContext context, Note semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.NOTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.NOTE__NAME));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.NOTE__OCTAVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.NOTE__OCTAVE));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.NOTE__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.NOTE__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNoteAccess().getOctaveOctaveRepParserRuleCall_2_0(), semanticObject.getOctave());
		feeder.accept(grammarAccess.getNoteAccess().getDurationINTTerminalRuleCall_3_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OctaveRep returns Commas
	 *
	 * Constraint:
	 *     value+=Comma*
	 */
	protected void sequence_OctaveRep(ISerializationContext context, Commas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OctaveRep returns Quotes
	 *
	 * Constraint:
	 *     value+=Quote*
	 */
	protected void sequence_OctaveRep(ISerializationContext context, Quotes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Score returns Score
	 *
	 * Constraint:
	 *     (staff=Staff lyrics=Lyrics)
	 */
	protected void sequence_Score(ISerializationContext context, Score semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.SCORE__STAFF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.SCORE__STAFF));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.SCORE__LYRICS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.SCORE__LYRICS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScoreAccess().getStaffStaffParserRuleCall_4_0(), semanticObject.getStaff());
		feeder.accept(grammarAccess.getScoreAccess().getLyricsLyricsParserRuleCall_5_0(), semanticObject.getLyrics());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Staff returns Staff
	 *
	 * Constraint:
	 *     (key=Key time=Time absolute=Absolute)
	 */
	protected void sequence_Staff(ISerializationContext context, Staff semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.STAFF__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.STAFF__KEY));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.STAFF__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.STAFF__TIME));
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.STAFF__ABSOLUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.STAFF__ABSOLUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_4_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStaffAccess().getTimeTimeParserRuleCall_5_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getStaffAccess().getAbsoluteAbsoluteParserRuleCall_6_0(), semanticObject.getAbsolute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     {Time}
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Title returns Title
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Title(ISerializationContext context, Title semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.TITLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.TITLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Version returns Version
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Version(ISerializationContext context, Version semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyPondPackage.Literals.VERSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyPondPackage.Literals.VERSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVersionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
