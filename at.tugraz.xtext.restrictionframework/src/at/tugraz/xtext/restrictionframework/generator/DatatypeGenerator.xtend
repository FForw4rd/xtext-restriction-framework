package at.tugraz.xtext.restrictionframework.generator

import at.tugraz.xtext.restrictionframework.restrictionFramework.Datatype
import at.tugraz.xtext.restrictionframework.restrictionFramework.StringRestriction
import at.tugraz.xtext.restrictionframework.restrictionFramework.ValueRestriction

class DatatypeGenerator {
	
	def static generateDatatype(Datatype d) '''
  	public class «d.name» {
  	  private «d.type» «d.name» «IF d.defaultValue !=null»=«d.defaultValue» «ENDIF»
  	
  	  public «d.type» get«d.name.toFirstUpper»() {
  	    return «d.name»
  	  }
  	  public void set«d.name.toFirstUpper»(«d.type» «d.name»){
  	  «IF(d.thisRestriction != null)»
  	  	«switch d.thisRestriction {
  	  		StringRestriction : d.stringRestrictionSetter(d.thisRestriction as StringRestriction)
  	  		ValueRestriction : d.valueRestrictionSetter(d.thisRestriction as ValueRestriction)
  	  	}»
  	  «ELSE»
  	    this.«d.name» = «d.name»;
  	«ENDIF»
  	  }
  	}
  '''
	
	def static valueRestrictionSetter(Datatype d, ValueRestriction restriction) '''
	if(«restriction.minvalue» < «d.name» < «restriction.maxvalue») {
		this.«d.name» = «d.name»
	}
	'''
	
	def static stringRestrictionSetter(Datatype d, StringRestriction restriction) '''
	if(«restriction.minlength» < «d.name».getlength < «restriction.maxlength») {
		this.«d.name» = «d.name»
	}
		'''
	
}