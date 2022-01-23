/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lilypond.lilyPond.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.lilypond.lilyPond.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilyPondFactoryImpl extends EFactoryImpl implements LilyPondFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilyPondFactory init()
  {
    try
    {
      LilyPondFactory theLilyPondFactory = (LilyPondFactory)EPackage.Registry.INSTANCE.getEFactory(LilyPondPackage.eNS_URI);
      if (theLilyPondFactory != null)
      {
        return theLilyPondFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilyPondFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilyPondPackage.FILE: return createFile();
      case LilyPondPackage.VERSION: return createVersion();
      case LilyPondPackage.HEADER: return createHeader();
      case LilyPondPackage.TITLE: return createTitle();
      case LilyPondPackage.SCORE: return createScore();
      case LilyPondPackage.STAFF: return createStaff();
      case LilyPondPackage.KEY: return createKey();
      case LilyPondPackage.TIME: return createTime();
      case LilyPondPackage.ABSOLUTE: return createAbsolute();
      case LilyPondPackage.NOTE: return createNote();
      case LilyPondPackage.OCTAVE_REP: return createOctaveRep();
      case LilyPondPackage.LYRICS: return createLyrics();
      case LilyPondPackage.QUOTES: return createQuotes();
      case LilyPondPackage.COMMAS: return createCommas();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LilyPondPackage.NOTE_NAME:
        return createNoteNameFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LilyPondPackage.NOTE_NAME:
        return convertNoteNameToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Score createScore()
  {
    ScoreImpl score = new ScoreImpl();
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Staff createStaff()
  {
    StaffImpl staff = new StaffImpl();
    return staff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Absolute createAbsolute()
  {
    AbsoluteImpl absolute = new AbsoluteImpl();
    return absolute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OctaveRep createOctaveRep()
  {
    OctaveRepImpl octaveRep = new OctaveRepImpl();
    return octaveRep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lyrics createLyrics()
  {
    LyricsImpl lyrics = new LyricsImpl();
    return lyrics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Quotes createQuotes()
  {
    QuotesImpl quotes = new QuotesImpl();
    return quotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Commas createCommas()
  {
    CommasImpl commas = new CommasImpl();
    return commas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteName createNoteNameFromString(EDataType eDataType, String initialValue)
  {
    NoteName result = NoteName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNoteNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LilyPondPackage getLilyPondPackage()
  {
    return (LilyPondPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilyPondPackage getPackage()
  {
    return LilyPondPackage.eINSTANCE;
  }

} //LilyPondFactoryImpl
