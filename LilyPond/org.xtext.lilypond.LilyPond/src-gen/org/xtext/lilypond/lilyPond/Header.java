/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.lilyPond.Header#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(Title)
   * @see org.xtext.lilypond.lilyPond.LilyPondPackage#getHeader_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link org.xtext.lilypond.lilyPond.Header#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

} // Header
