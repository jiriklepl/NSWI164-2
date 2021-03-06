/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lilypond.dsl.DslPackage;
import org.xtext.lilypond.dsl.PhraseItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phrase Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.dsl.impl.PhraseItemImpl#getPhrase <em>Phrase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhraseItemImpl extends ItemImpl implements PhraseItem
{
  /**
   * The default value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhrase()
   * @generated
   * @ordered
   */
  protected static final String PHRASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhrase()
   * @generated
   * @ordered
   */
  protected String phrase = PHRASE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhraseItemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.PHRASE_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhrase()
  {
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhrase(String newPhrase)
  {
    String oldPhrase = phrase;
    phrase = newPhrase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PHRASE_ITEM__PHRASE, oldPhrase, phrase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.PHRASE_ITEM__PHRASE:
        return getPhrase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.PHRASE_ITEM__PHRASE:
        setPhrase((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.PHRASE_ITEM__PHRASE:
        setPhrase(PHRASE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.PHRASE_ITEM__PHRASE:
        return PHRASE_EDEFAULT == null ? phrase != null : !PHRASE_EDEFAULT.equals(phrase);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (phrase: ");
    result.append(phrase);
    result.append(')');
    return result.toString();
  }

} //PhraseItemImpl
