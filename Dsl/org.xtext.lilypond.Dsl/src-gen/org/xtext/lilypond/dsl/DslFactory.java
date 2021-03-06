/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.lilypond.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = org.xtext.lilypond.dsl.impl.DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Phrase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phrase</em>'.
   * @generated
   */
  Phrase createPhrase();

  /**
   * Returns a new object of class '<em>Song</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Song</em>'.
   * @generated
   */
  Song createSong();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  Item createItem();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Octave</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Octave</em>'.
   * @generated
   */
  Octave createOctave();

  /**
   * Returns a new object of class '<em>Note Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note Item</em>'.
   * @generated
   */
  NoteItem createNoteItem();

  /**
   * Returns a new object of class '<em>Phrase Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phrase Item</em>'.
   * @generated
   */
  PhraseItem createPhraseItem();

  /**
   * Returns a new object of class '<em>Is</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is</em>'.
   * @generated
   */
  Is createIs();

  /**
   * Returns a new object of class '<em>Es</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Es</em>'.
   * @generated
   */
  Es createEs();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory
