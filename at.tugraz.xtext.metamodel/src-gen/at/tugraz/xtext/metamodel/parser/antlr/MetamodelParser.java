/*
 * generated by Xtext
 */
package at.tugraz.xtext.metamodel.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.tugraz.xtext.metamodel.services.MetamodelGrammarAccess;

public class MetamodelParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MetamodelGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected at.tugraz.xtext.metamodel.parser.antlr.internal.InternalMetamodelParser createParser(XtextTokenStream stream) {
		return new at.tugraz.xtext.metamodel.parser.antlr.internal.InternalMetamodelParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}
	
	public MetamodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MetamodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
