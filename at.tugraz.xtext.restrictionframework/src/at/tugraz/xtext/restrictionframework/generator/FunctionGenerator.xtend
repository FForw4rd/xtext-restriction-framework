package at.tugraz.xtext.restrictionframework.generator

import at.tugraz.xtext.restrictionframework.restrictionFramework.Function

class FunctionGenerator {
	
	def static generateFunctionContent(Function f) '''
	private final int id = «f.identifier»;
	private final boolean issecure = «f.isIssecure»;
		
	public bool isSecure() {
	  return this.issecure
	}
	public int getId {
	  return this.id
	}
	'''
	
}