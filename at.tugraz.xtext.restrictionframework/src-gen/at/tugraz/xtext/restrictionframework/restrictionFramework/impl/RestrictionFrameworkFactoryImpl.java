/**
 */
package at.tugraz.xtext.restrictionframework.restrictionFramework.impl;

import at.tugraz.xtext.restrictionframework.restrictionFramework.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionFrameworkFactoryImpl extends EFactoryImpl implements RestrictionFrameworkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestrictionFrameworkFactory init()
  {
    try
    {
      RestrictionFrameworkFactory theRestrictionFrameworkFactory = (RestrictionFrameworkFactory)EPackage.Registry.INSTANCE.getEFactory(RestrictionFrameworkPackage.eNS_URI);
      if (theRestrictionFrameworkFactory != null)
      {
        return theRestrictionFrameworkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestrictionFrameworkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionFrameworkFactoryImpl()
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
      case RestrictionFrameworkPackage.MODEL: return createModel();
      case RestrictionFrameworkPackage.GREETING: return createGreeting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionFrameworkPackage getRestrictionFrameworkPackage()
  {
    return (RestrictionFrameworkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestrictionFrameworkPackage getPackage()
  {
    return RestrictionFrameworkPackage.eINSTANCE;
  }

} //RestrictionFrameworkFactoryImpl
