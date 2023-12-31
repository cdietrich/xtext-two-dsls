/*
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydslb.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydslb.ui.internal.MydslbActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslBExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MydslbActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MydslbActivator activator = MydslbActivator.getInstance();
		return activator != null ? activator.getInjector(MydslbActivator.ORG_XTEXT_EXAMPLE_MYDSLB_MYDSLB) : null;
	}

}
