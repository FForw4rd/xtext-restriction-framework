/*
 * generated by Xtext
 */
package at.tugraz.xtext.restrictionframework.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractRestrictionFrameworkValidator extends org.eclipse.xtext.xbase.validation.XbaseValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
	    result.add(at.tugraz.xtext.restrictionframework.restrictionFramework.RestrictionFrameworkPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xbase"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xtype"));
		return result;
	}
}
