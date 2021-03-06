/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.dsl.File#getPhrases <em>Phrases</em>}</li>
 *   <li>{@link org.xtext.lilypond.dsl.File#getSong <em>Song</em>}</li>
 * </ul>
 *
 * @see org.xtext.lilypond.dsl.DslPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>Phrases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lilypond.dsl.Phrase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phrases</em>' containment reference list.
   * @see org.xtext.lilypond.dsl.DslPackage#getFile_Phrases()
   * @model containment="true"
   * @generated
   */
  EList<Phrase> getPhrases();

  /**
   * Returns the value of the '<em><b>Song</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Song</em>' containment reference.
   * @see #setSong(Song)
   * @see org.xtext.lilypond.dsl.DslPackage#getFile_Song()
   * @model containment="true"
   * @generated
   */
  Song getSong();

  /**
   * Sets the value of the '{@link org.xtext.lilypond.dsl.File#getSong <em>Song</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Song</em>' containment reference.
   * @see #getSong()
   * @generated
   */
  void setSong(Song value);

} // File
