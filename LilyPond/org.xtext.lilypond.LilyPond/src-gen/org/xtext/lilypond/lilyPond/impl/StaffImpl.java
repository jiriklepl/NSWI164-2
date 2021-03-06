/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.lilypond.lilyPond.Absolute;
import org.xtext.lilypond.lilyPond.Key;
import org.xtext.lilypond.lilyPond.LilyPondPackage;
import org.xtext.lilypond.lilyPond.Staff;
import org.xtext.lilypond.lilyPond.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lilypond.lilyPond.impl.StaffImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.lilypond.lilyPond.impl.StaffImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.lilypond.lilyPond.impl.StaffImpl#getAbsolute <em>Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffImpl extends MinimalEObjectImpl.Container implements Staff
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Key key;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected Time time;

  /**
   * The cached value of the '{@link #getAbsolute() <em>Absolute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsolute()
   * @generated
   * @ordered
   */
  protected Absolute absolute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaffImpl()
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
    return LilyPondPackage.Literals.STAFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Key getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(Key newKey, NotificationChain msgs)
  {
    Key oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKey(Key newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Time getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(Time newTime, NotificationChain msgs)
  {
    Time oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(Time newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__TIME, newTime, newTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Absolute getAbsolute()
  {
    return absolute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsolute(Absolute newAbsolute, NotificationChain msgs)
  {
    Absolute oldAbsolute = absolute;
    absolute = newAbsolute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__ABSOLUTE, oldAbsolute, newAbsolute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbsolute(Absolute newAbsolute)
  {
    if (newAbsolute != absolute)
    {
      NotificationChain msgs = null;
      if (absolute != null)
        msgs = ((InternalEObject)absolute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__ABSOLUTE, null, msgs);
      if (newAbsolute != null)
        msgs = ((InternalEObject)newAbsolute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.STAFF__ABSOLUTE, null, msgs);
      msgs = basicSetAbsolute(newAbsolute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.STAFF__ABSOLUTE, newAbsolute, newAbsolute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilyPondPackage.STAFF__KEY:
        return basicSetKey(null, msgs);
      case LilyPondPackage.STAFF__TIME:
        return basicSetTime(null, msgs);
      case LilyPondPackage.STAFF__ABSOLUTE:
        return basicSetAbsolute(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LilyPondPackage.STAFF__KEY:
        return getKey();
      case LilyPondPackage.STAFF__TIME:
        return getTime();
      case LilyPondPackage.STAFF__ABSOLUTE:
        return getAbsolute();
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
      case LilyPondPackage.STAFF__KEY:
        setKey((Key)newValue);
        return;
      case LilyPondPackage.STAFF__TIME:
        setTime((Time)newValue);
        return;
      case LilyPondPackage.STAFF__ABSOLUTE:
        setAbsolute((Absolute)newValue);
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
      case LilyPondPackage.STAFF__KEY:
        setKey((Key)null);
        return;
      case LilyPondPackage.STAFF__TIME:
        setTime((Time)null);
        return;
      case LilyPondPackage.STAFF__ABSOLUTE:
        setAbsolute((Absolute)null);
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
      case LilyPondPackage.STAFF__KEY:
        return key != null;
      case LilyPondPackage.STAFF__TIME:
        return time != null;
      case LilyPondPackage.STAFF__ABSOLUTE:
        return absolute != null;
    }
    return super.eIsSet(featureID);
  }

} //StaffImpl
