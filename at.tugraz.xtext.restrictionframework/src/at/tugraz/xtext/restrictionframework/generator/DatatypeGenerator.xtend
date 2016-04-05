package at.tugraz.xtext.restrictionframework.generator

import at.tugraz.xtext.restrictionframework.restrictionFramework.Datatype
import at.tugraz.xtext.restrictionframework.restrictionFramework.StringRestriction
import at.tugraz.xtext.restrictionframework.restrictionFramework.ValueRestriction

class DatatypeGenerator {
	
	var static variables = ""
	var static setterCondition = ""
	
	def static generateDatatypeContent(Datatype d) {
		switch d.thisRestriction {
  	  		StringRestriction : d.stringRestrictionSetter(d.thisRestriction as StringRestriction)
  	  		ValueRestriction : d.valueRestrictionSetter(d.thisRestriction as ValueRestriction)
  	  	}
		'''
	  	public class «d.name» {
	  	  private «d.type.qualifiedName» «d.name» «IF d.defaultValue !=null»=«d.defaultValue» «ENDIF»;
	  	  «variables»
	  	
	  	  public «d.type.qualifiedName» get«d.name.toFirstUpper»() {
	  	    return «d.name»;
	  	  }
	  	  public void set«d.name.toFirstUpper»(«d.type.qualifiedName» «d.name»){
	  	    «IF(d.thisRestriction != null)»
	  	    if(«setterCondition») {
	  	      this.«d.name» = «d.name»;
	  	    }
	  	    «ELSE»
	  	    this.«d.name» = «d.name»;
	  	  «ENDIF»
	  	  }
	  	}
 		'''
	}
	
	def static valueRestrictionSetter(Datatype d, ValueRestriction restriction) {
		variables = "private int minValue = " + restriction.minvalue + ";\n"
		variables += "private int maxValue = " + restriction.maxvalue + ";\n"
		
		setterCondition = "minValue < " + d.name + " || " + d.name + " < maxValue"
	}
	
	def static stringRestrictionSetter(Datatype d, StringRestriction restriction) {
		variables = "private int minLength = " + restriction.minlength + ";\n"
		variables += "private int maxLength = " + restriction.maxlength + ";\n"
		
		setterCondition = "minLength < " + d.name + ".length() || " + d.name + ".length() < maxLength"
	}
	
}