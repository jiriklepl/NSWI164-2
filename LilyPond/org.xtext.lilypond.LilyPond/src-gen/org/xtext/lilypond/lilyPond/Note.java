/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.lilyPond.Note#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lilypond.lilyPond.Note#getOctave <em>Octave</em>}</li>
 *   <li>{@link org.xtext.lilypond.lilyPond.Note#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.lilypond.lilyPond.NoteName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.xtext.lilypond.lilyPond.NoteName
   * @see #setName(NoteName)
   * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getNote_Name()
   * @model
   * @generated
   */
  NoteName getName();

  /**
   * Sets the value of the '{@link org.xtext.lilypond.lilyPond.Note#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.xtext.lilypond.lilyPond.NoteName
   * @see #getName()
   * @generated
   */
  void setName(NoteName value);

  /**
   * Returns the value of the '<em><b>Octave</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave</em>' containment reference.
   * @see #setOctave(OctaveRep)
   * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getNote_Octave()
   * @model containment="true"
   * @generated
   */
  OctaveRep getOctave();

  /**
   * Sets the value of the '{@link org.xtext.lilypond.lilyPond.Note#getOctave <em>Octave</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave</em>' containment reference.
   * @see #getOctave()
   * @generated
   */
  void setOctave(OctaveRep value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getNote_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link org.xtext.lilypond.lilyPond.Note#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

} // Note
