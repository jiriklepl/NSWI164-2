/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.lilypond.lilyPond.LilyPondPackage;
import org.xtext.lilypond.lilyPond.OctaveRep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Octave Rep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.lilyPond.impl.OctaveRepImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OctaveRepImpl extends MinimalEObjectImpl.Container implements OctaveRep
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<Character> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OctaveRepImpl()
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
    return LilyPondPackage.Literals.OCTAVE_REP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Character> getValue()
  {
    if (value == null)
    {
      value = new EDataTypeEList<Character>(Character.class, this, LilyPondPackage.OCTAVE_REP__VALUE);
    }
    return value;
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
      case LilyPondPackage.OCTAVE_REP__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilyPondPackage.OCTAVE_REP__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends Character>)newValue);
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
      case LilyPondPackage.OCTAVE_REP__VALUE:
        getValue().clear();
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
      case LilyPondPackage.OCTAVE_REP__VALUE:
        return value != null && !value.isEmpty();
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //OctaveRepImpl
