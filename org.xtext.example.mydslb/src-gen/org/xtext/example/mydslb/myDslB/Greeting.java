/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydslb.myDslB;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsla.myDslA.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydslb.myDslB.Greeting#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydslb.myDslB.MyDslBPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person</em>' reference.
   * @see #setPerson(Person)
   * @see org.xtext.example.mydslb.myDslB.MyDslBPackage#getGreeting_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link org.xtext.example.mydslb.myDslB.Greeting#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // Greeting
