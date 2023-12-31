/*
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsla.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsla.myDslA.Model;
import org.xtext.example.mydsla.myDslA.MyDslAPackage;
import org.xtext.example.mydsla.myDslA.Person;
import org.xtext.example.mydsla.services.MyDslAGrammarAccess;

@SuppressWarnings("all")
public class MyDslASemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslAGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslAPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslAPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslAPackage.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     persons+=Person+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslAPackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslAPackage.Literals.PERSON__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
