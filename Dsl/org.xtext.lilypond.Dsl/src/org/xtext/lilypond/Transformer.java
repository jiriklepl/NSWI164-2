package org.xtext.lilypond;

import org.xtext.lilypond.dsl.Body;
import org.xtext.lilypond.dsl.Es;
import org.xtext.lilypond.dsl.File;
import org.xtext.lilypond.dsl.Is;
import org.xtext.lilypond.dsl.NoteItem;
import org.xtext.lilypond.dsl.NoteName;
import org.xtext.lilypond.dsl.Octave;
import org.xtext.lilypond.dsl.Phrase;
import org.xtext.lilypond.dsl.PhraseItem;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Transformer {
	
	private final Map<String, Body> phrases = new TreeMap<String, org.xtext.lilypond.dsl.Body>();
	
	private void makePhrases(List<Phrase> phraseList) {
		for (var phrase : phraseList) {
			phrases.put(phrase.getName(), phrase.getBody());
		}
	}
	
	private static org.xtext.lilypond.lilyPond.NoteName translateName(NoteName name) {
		return org.xtext.lilypond.lilyPond.NoteName.get(name.getValue());
	}
	
	private static org.xtext.lilypond.lilyPond.OctaveRep translateOctave(Octave octave) {
		org.xtext.lilypond.lilyPond.OctaveRep newOctave = null;

		if (octave == null) {
			newOctave = new org.xtext.lilypond.lilyPond.impl.QuotesImpl() {};
		} else if (octave instanceof Is) {
			var value = octave.getValue();
			newOctave = new org.xtext.lilypond.lilyPond.impl.QuotesImpl() {};
			var chars = newOctave.getValue();
			
			for (var i = 0; i < value; i++) {
				chars.add('\'');
			}
		} else if (octave instanceof Es) {
			var value = octave.getValue();
			newOctave = new org.xtext.lilypond.lilyPond.impl.CommasImpl() {};
			var chars = newOctave.getValue();
			
			for (var i = 0; i < value; i++) {
				chars.add(',');
			}
		} else {
			System.err.printf("Error: Bad octave %s%n", octave.toString());
			System.exit(1);
		}

		return newOctave;
	}
	
	private void fillScore(List<org.xtext.lilypond.lilyPond.Note> notes, List<String> syllables, Body input) {
		for (var item : input.getContent()) {
			if (item instanceof PhraseItem) {
				var phrase= ((PhraseItem)item).getPhrase();
				var body = phrases.get(phrase);
				
				if (body != null) {
					fillScore(notes, syllables, body);
				} else {
					System.err.printf("Error: Bad reference %s%n", phrase);
					System.exit(1);
				}
			} else if (item instanceof NoteItem) {
				var note = ((NoteItem)item).getNote();
				
				var newNote = new org.xtext.lilypond.lilyPond.impl.NoteImpl() {};

				newNote.setDuration(note.getDuration());
				newNote.setName(translateName(note.getName()));
				newNote.setOctave(translateOctave(note.getOctave()));
				
				notes.add(newNote);
				syllables.add(note.getSyllable());
			} else {
				System.err.printf("Error: Bad item %s%n", item.toString());
				System.exit(1);
			}
		}
	}

	public org.xtext.lilypond.lilyPond.File transformFile(File input)
	{
		var file = new org.xtext.lilypond.lilyPond.impl.FileImpl() {};
		var version = new org.xtext.lilypond.lilyPond.impl.VersionImpl() {};
		var header = new org.xtext.lilypond.lilyPond.impl.HeaderImpl() {};
		var score = new org.xtext.lilypond.lilyPond.impl.ScoreImpl() {};
		var title = new org.xtext.lilypond.lilyPond.impl.TitleImpl() {};

		makePhrases(input.getPhrases());
		
		version.setValue("2.18.2");
		file.setVersion(version);

		title.setValue(input.getSong().getName());
		header.setTitle(title);
		file.setHeader(header);

		fillScore(score.getStaff().getAbsolute().getItems() , score.getLyrics().getSyllables(), input.getSong().getBody());
		file.setScore(score);

		return file;
	}

}
