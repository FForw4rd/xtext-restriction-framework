package at.tugraz.xtext.metamodel.generator

import at.tugraz.xtext.metamodel.metamodel.Datatype
import at.tugraz.xtext.metamodel.metamodel.StringRestriction
import at.tugraz.xtext.metamodel.metamodel.ValueRestriction

class DatatypeGenerator {
	
	def static generateDatatype(Datatype d) '''
  	public class «d.name» {
  	  private «d.type» «d.name» «IF d.defaultValue !=null»=«d.defaultValue» «ENDIF»
  	
  	  public «d.type» get«d.name.toFirstUpper»() {
  	    return «d.name»
  	  }
  	  public void set«d.name.toFirstUpper»(«d.type» «d.name»){
  	  «IF(d.dataRestriction != null)»
  	  	«switch d.dataRestriction {
  	  		StringRestriction : d.stringRestrictionSetter(d.dataRestriction as StringRestriction)
  	  		ValueRestriction : d.valueRestrictionSetter(d.dataRestriction as ValueRestriction)
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