/*
 * generated by Xtext
 */
package at.tugraz.xtext.metamodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MetamodelUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return at.tugraz.xtext.metamodel.ui.internal.MetamodelActivator.getInstance().getInjector("at.tugraz.xtext.metamodel.Metamodel");
	}
	
}