/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.lilyPond.Absolute#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getAbsolute()
 * @model
 * @generated
 */
public interface Absolute extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lilypond.lilyPond.Note}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getAbsolute_Items()
   * @model containment="true"
   * @generated
   */
  EList<Note> getItems();

} // Absolute
