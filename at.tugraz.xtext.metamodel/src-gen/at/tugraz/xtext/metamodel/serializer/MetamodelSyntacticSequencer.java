/*
 * generated by Xtext
 */
package at.tugraz.xtext.metamodel.serializer;

import at.tugraz.xtext.metamodel.services.MetamodelGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MetamodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MetamodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Function_GetsKeyword_7_0_q;
	protected AbstractElementAlias match_Function_ReturnsKeyword_8_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MetamodelGrammarAccess) access;
		match_Function_GetsKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getFunctionAccess().getGetsKeyword_7_0());
		match_Function_ReturnsKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getFunctionAccess().getReturnsKeyword_8_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Function_GetsKeyword_7_0_q.equals(syntax))
				emit_Function_GetsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_ReturnsKeyword_8_0_q.equals(syntax))
				emit_Function_ReturnsKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'gets'?
	 *
	 * This ambiguous syntax occurs at:
	 *     identifier=INT (ambiguity) 'returns' outpust+=[Type|ID]
	 *     identifier=INT (ambiguity) 'returns'? '}' (rule end)
	 *     issecure?='issecure' (ambiguity) 'returns' outpust+=[Type|ID]
	 *     issecure?='issecure' (ambiguity) 'returns'? '}' (rule end)
	 */
	protected void emit_Function_GetsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'returns'?
	 *
	 * This ambiguous syntax occurs at:
	 *     identifier=INT 'gets'? (ambiguity) '}' (rule end)
	 *     inputs+=[Type|ID] (ambiguity) '}' (rule end)
	 *     issecure?='issecure' 'gets'? (ambiguity) '}' (rule end)
	 */
	protected void emit_Function_ReturnsKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
