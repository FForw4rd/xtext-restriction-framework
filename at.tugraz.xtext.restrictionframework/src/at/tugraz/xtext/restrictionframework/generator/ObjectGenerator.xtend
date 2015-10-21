package at.tugraz.xtext.restrictionframework.generator

import at.tugraz.xtext.restrictionframework.restrictionFramework.Member
import at.tugraz.xtext.restrictionframework.restrictionFramework.Object

class ObjectGenerator {
	
	def static generateObjectContent(Object e) ''' 
		private final boolean issecure = «e.isIssecure»;
		
		public bool isSecure() {
		  return this.issecure
		}
		«FOR f:e.members»
			«f.generateMembers»
		«ENDFOR»
		}
  	'''
  
	def static generateMembers(Member f) '''
		private «f.type.qualifiedName» «f.name»;
		
		public «f.type.qualifiedName» get«f.name.toFirstUpper»() {
		  return «f.name»;
		}
		
		public void set«f.name.toFirstUpper»(«f.type.qualifiedName» «f.name») {
		  this.«f.name» = «f.name»;
		}
  	'''
}