/*
 * generated by Xtext
 */
package at.tugraz.xtext.metamodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
//import org.example.domainmodel.domainmodel.Entity
//import org.example.domainmodel.domainmodel.Feature
//import at.tugraz.xtext.metamodel.metamodel.Function
import at.tugraz.xtext.metamodel.metamodel.Object
import org.eclipse.xtext.naming.IQualifiedNameProvider
 
import com.google.inject.Inject
import at.tugraz.xtext.metamodel.metamodel.Member

class MetamodelGenerator implements IGenerator {
 
  @Inject extension IQualifiedNameProvider
 
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    for(e: resource.allContents.toIterable.filter(Object)) {
      fsa.generateFile(
        e.fullyQualifiedName.toString("/") + ".java",
        e.compile)
    }
  }
 
  def compile(Object e) ''' 
    «IF e.eContainer.fullyQualifiedName != null»
      package «e.eContainer.fullyQualifiedName»;
    «ENDIF»
    
    public class «e.name» «IF e.superType != null
            »extends «e.superType.fullyQualifiedName» «ENDIF»{
      «e.secure»
      «FOR f:e.members»
        «f.compile»
      «ENDFOR»
    }
  '''
	
  def secure(Object e) '''
    private static final boolean issecure = «e.isIssecure»;
    
    public bool isSecure() {
      return this.issecure
    }
    
  '''
 
  def compile(Member f) '''
    private «f.type.fullyQualifiedName» «f.name»;
    
    public «f.type.fullyQualifiedName» get«f.name.toFirstUpper»() {
      return «f.name»;
    }
    
    public void set«f.name.toFirstUpper»(«f.type.fullyQualifiedName» «f.name») {
      this.«f.name» = «f.name»;
    }
  '''
}