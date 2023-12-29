/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsla.myDslA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsla.myDslA.Model#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsla.myDslA.MyDslAPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsla.myDslA.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see org.xtext.example.mydsla.myDslA.MyDslAPackage#getModel_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

} // Model