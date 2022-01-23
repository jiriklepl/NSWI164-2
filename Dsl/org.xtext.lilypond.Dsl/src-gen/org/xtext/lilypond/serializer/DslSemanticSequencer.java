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
import org.xtext.lilypond.dsl.Body;
import org.xtext.lilypond.dsl.DslPackage;
import org.xtext.lilypond.dsl.Es;
import org.xtext.lilypond.dsl.File;
import org.xtext.lilypond.dsl.Is;
import org.xtext.lilypond.dsl.Note;
import org.xtext.lilypond.dsl.NoteItem;
import org.xtext.lilypond.dsl.Phrase;
import org.xtext.lilypond.dsl.PhraseItem;
import org.xtext.lilypond.dsl.Song;
import org.xtext.lilypond.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case DslPackage.ES:
				sequence_Octave(context, (Es) semanticObject); 
				return; 
			case DslPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case DslPackage.IS:
				sequence_Octave(context, (Is) semanticObject); 
				return; 
			case DslPackage.NOTE:
				sequence_Note(context, (Note) semanticObject); 
				return; 
			case DslPackage.NOTE_ITEM:
				sequence_Item(context, (NoteItem) semanticObject); 
				return; 
			case DslPackage.PHRASE:
				sequence_Phrase(context, (Phrase) semanticObject); 
				return; 
			case DslPackage.PHRASE_ITEM:
				sequence_Item(context, (PhraseItem) semanticObject); 
				return; 
			case DslPackage.SONG:
				sequence_Song(context, (Song) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     content+=Item*
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     (phrases+=Phrase* song=Song phrases+=Phrase*)
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Item returns NoteItem
	 *
	 * Constraint:
	 *     note=Note
	 */
	protected void sequence_Item(ISerializationContext context, NoteItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.NOTE_ITEM__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.NOTE_ITEM__NOTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemAccess().getNoteNoteParserRuleCall_0_1_0(), semanticObject.getNote());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Item returns PhraseItem
	 *
	 * Constraint:
	 *     phrase=ID
	 */
	protected void sequence_Item(ISerializationContext context, PhraseItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.PHRASE_ITEM__PHRASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PHRASE_ITEM__PHRASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemAccess().getPhraseIDTerminalRuleCall_1_2_0(), semanticObject.getPhrase());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Note returns Note
	 *
	 * Constraint:
	 *     (name=NoteName octave=Octave? duration=INT syllable=STRING?)
	 */
	protected void sequence_Note(ISerializationContext context, Note semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Octave returns Es
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Octave(ISerializationContext context, Es semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.OCTAVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.OCTAVE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_1_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Octave returns Is
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Octave(ISerializationContext context, Is semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.OCTAVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.OCTAVE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOctaveAccess().getValueINTTerminalRuleCall_0_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Phrase returns Phrase
	 *
	 * Constraint:
	 *     (name=ID body=Body)
	 */
	protected void sequence_Phrase(ISerializationContext context, Phrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PHRASE__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.PHRASE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PHRASE__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPhraseAccess().getBodyBodyParserRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Song returns Song
	 *
	 * Constraint:
	 *     (name=STRING body=Body)
	 */
	protected void sequence_Song(ISerializationContext context, Song semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SONG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SONG__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SONG__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SONG__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSongAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSongAccess().getBodyBodyParserRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
}
