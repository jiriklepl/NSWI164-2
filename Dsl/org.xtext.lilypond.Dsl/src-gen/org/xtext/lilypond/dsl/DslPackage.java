/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.lilypond.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/lilypond/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = org.xtext.lilypond.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.FileImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Phrases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__PHRASES = 0;

  /**
   * The feature id for the '<em><b>Song</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__SONG = 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.PhraseImpl <em>Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.PhraseImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getPhrase()
   * @generated
   */
  int PHRASE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE__BODY = 1;

  /**
   * The number of structural features of the '<em>Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.SongImpl <em>Song</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.SongImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getSong()
   * @generated
   */
  int SONG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__BODY = 1;

  /**
   * The number of structural features of the '<em>Song</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.BodyImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getBody()
   * @generated
   */
  int BODY = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.ItemImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getItem()
   * @generated
   */
  int ITEM = 4;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.NoteImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNote()
   * @generated
   */
  int NOTE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Octave</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__OCTAVE = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__DURATION = 2;

  /**
   * The feature id for the '<em><b>Syllable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__SYLLABLE = 3;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.OctaveImpl <em>Octave</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.OctaveImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getOctave()
   * @generated
   */
  int OCTAVE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAVE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Octave</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.NoteItemImpl <em>Note Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.NoteItemImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNoteItem()
   * @generated
   */
  int NOTE_ITEM = 7;

  /**
   * The feature id for the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_ITEM__NOTE = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Note Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.PhraseItemImpl <em>Phrase Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.PhraseItemImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getPhraseItem()
   * @generated
   */
  int PHRASE_ITEM = 8;

  /**
   * The feature id for the '<em><b>Phrase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_ITEM__PHRASE = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Phrase Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.IsImpl <em>Is</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.IsImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getIs()
   * @generated
   */
  int IS = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS__VALUE = OCTAVE__VALUE;

  /**
   * The number of structural features of the '<em>Is</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_FEATURE_COUNT = OCTAVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.impl.EsImpl <em>Es</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.impl.EsImpl
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getEs()
   * @generated
   */
  int ES = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ES__VALUE = OCTAVE__VALUE;

  /**
   * The number of structural features of the '<em>Es</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ES_FEATURE_COUNT = OCTAVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.lilypond.dsl.NoteName <em>Note Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lilypond.dsl.NoteName
   * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNoteName()
   * @generated
   */
  int NOTE_NAME = 11;


  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.lilypond.dsl.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lilypond.dsl.File#getPhrases <em>Phrases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phrases</em>'.
   * @see org.xtext.lilypond.dsl.File#getPhrases()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Phrases();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lilypond.dsl.File#getSong <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Song</em>'.
   * @see org.xtext.lilypond.dsl.File#getSong()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Song();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase</em>'.
   * @see org.xtext.lilypond.dsl.Phrase
   * @generated
   */
  EClass getPhrase();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Phrase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.lilypond.dsl.Phrase#getName()
   * @see #getPhrase()
   * @generated
   */
  EAttribute getPhrase_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lilypond.dsl.Phrase#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.lilypond.dsl.Phrase#getBody()
   * @see #getPhrase()
   * @generated
   */
  EReference getPhrase_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Song <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Song</em>'.
   * @see org.xtext.lilypond.dsl.Song
   * @generated
   */
  EClass getSong();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Song#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.lilypond.dsl.Song#getName()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lilypond.dsl.Song#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.lilypond.dsl.Song#getBody()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.lilypond.dsl.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lilypond.dsl.Body#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.xtext.lilypond.dsl.Body#getContent()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.xtext.lilypond.dsl.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see org.xtext.lilypond.dsl.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Note#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.lilypond.dsl.Note#getName()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lilypond.dsl.Note#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Octave</em>'.
   * @see org.xtext.lilypond.dsl.Note#getOctave()
   * @see #getNote()
   * @generated
   */
  EReference getNote_Octave();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Note#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.lilypond.dsl.Note#getDuration()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Note#getSyllable <em>Syllable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Syllable</em>'.
   * @see org.xtext.lilypond.dsl.Note#getSyllable()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Syllable();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Octave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octave</em>'.
   * @see org.xtext.lilypond.dsl.Octave
   * @generated
   */
  EClass getOctave();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.Octave#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.lilypond.dsl.Octave#getValue()
   * @see #getOctave()
   * @generated
   */
  EAttribute getOctave_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.NoteItem <em>Note Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note Item</em>'.
   * @see org.xtext.lilypond.dsl.NoteItem
   * @generated
   */
  EClass getNoteItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.lilypond.dsl.NoteItem#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Note</em>'.
   * @see org.xtext.lilypond.dsl.NoteItem#getNote()
   * @see #getNoteItem()
   * @generated
   */
  EReference getNoteItem_Note();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.PhraseItem <em>Phrase Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase Item</em>'.
   * @see org.xtext.lilypond.dsl.PhraseItem
   * @generated
   */
  EClass getPhraseItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lilypond.dsl.PhraseItem#getPhrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phrase</em>'.
   * @see org.xtext.lilypond.dsl.PhraseItem#getPhrase()
   * @see #getPhraseItem()
   * @generated
   */
  EAttribute getPhraseItem_Phrase();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Is <em>Is</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is</em>'.
   * @see org.xtext.lilypond.dsl.Is
   * @generated
   */
  EClass getIs();

  /**
   * Returns the meta object for class '{@link org.xtext.lilypond.dsl.Es <em>Es</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Es</em>'.
   * @see org.xtext.lilypond.dsl.Es
   * @generated
   */
  EClass getEs();

  /**
   * Returns the meta object for enum '{@link org.xtext.lilypond.dsl.NoteName <em>Note Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Note Name</em>'.
   * @see org.xtext.lilypond.dsl.NoteName
   * @generated
   */
  EEnum getNoteName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.FileImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Phrases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__PHRASES = eINSTANCE.getFile_Phrases();

    /**
     * The meta object literal for the '<em><b>Song</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__SONG = eINSTANCE.getFile_Song();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.PhraseImpl <em>Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.PhraseImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getPhrase()
     * @generated
     */
    EClass PHRASE = eINSTANCE.getPhrase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHRASE__NAME = eINSTANCE.getPhrase_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHRASE__BODY = eINSTANCE.getPhrase_Body();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.SongImpl <em>Song</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.SongImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getSong()
     * @generated
     */
    EClass SONG = eINSTANCE.getSong();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__NAME = eINSTANCE.getSong_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONG__BODY = eINSTANCE.getSong_Body();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.BodyImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__CONTENT = eINSTANCE.getBody_Content();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.ItemImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.NoteImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__NAME = eINSTANCE.getNote_Name();

    /**
     * The meta object literal for the '<em><b>Octave</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE__OCTAVE = eINSTANCE.getNote_Octave();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

    /**
     * The meta object literal for the '<em><b>Syllable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__SYLLABLE = eINSTANCE.getNote_Syllable();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.OctaveImpl <em>Octave</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.OctaveImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getOctave()
     * @generated
     */
    EClass OCTAVE = eINSTANCE.getOctave();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCTAVE__VALUE = eINSTANCE.getOctave_Value();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.NoteItemImpl <em>Note Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.NoteItemImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNoteItem()
     * @generated
     */
    EClass NOTE_ITEM = eINSTANCE.getNoteItem();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE_ITEM__NOTE = eINSTANCE.getNoteItem_Note();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.PhraseItemImpl <em>Phrase Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.PhraseItemImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getPhraseItem()
     * @generated
     */
    EClass PHRASE_ITEM = eINSTANCE.getPhraseItem();

    /**
     * The meta object literal for the '<em><b>Phrase</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHRASE_ITEM__PHRASE = eINSTANCE.getPhraseItem_Phrase();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.IsImpl <em>Is</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.IsImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getIs()
     * @generated
     */
    EClass IS = eINSTANCE.getIs();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.impl.EsImpl <em>Es</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.impl.EsImpl
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getEs()
     * @generated
     */
    EClass ES = eINSTANCE.getEs();

    /**
     * The meta object literal for the '{@link org.xtext.lilypond.dsl.NoteName <em>Note Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lilypond.dsl.NoteName
     * @see org.xtext.lilypond.dsl.impl.DslPackageImpl#getNoteName()
     * @generated
     */
    EEnum NOTE_NAME = eINSTANCE.getNoteName();

  }

} //DslPackage
