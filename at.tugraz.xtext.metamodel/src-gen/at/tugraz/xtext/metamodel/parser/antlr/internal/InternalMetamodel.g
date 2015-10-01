/*
 * generated by Xtext
 */
grammar InternalMetamodel;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.tugraz.xtext.metamodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.tugraz.xtext.metamodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.tugraz.xtext.metamodel.services.MetamodelGrammarAccess;

}

@parser::members {

 	private MetamodelGrammarAccess grammarAccess;
 	
    public InternalMetamodelParser(TokenStream input, MetamodelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Domainmodel";	
   	}
   	
   	@Override
   	protected MetamodelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDomainmodel
entryRuleDomainmodel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainmodelRule()); }
	 iv_ruleDomainmodel=ruleDomainmodel 
	 { $current=$iv_ruleDomainmodel.current; } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainmodelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 
    }
    this_Type_0=ruleType
    { 
        $current = $this_Type_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 
    }
    this_Function_1=ruleFunction
    { 
        $current = $this_Function_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 
    }
    this_Datatype_0=ruleDatatype
    { 
        $current = $this_Datatype_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getObjectParserRuleCall_1()); 
    }
    this_Object_1=ruleObject
    { 
        $current = $this_Object_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFunctionType
entryRuleFunctionType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionTypeRule()); }
	 iv_ruleFunctionType=ruleFunctionType 
	 { $current=$iv_ruleFunctionType.current; } 
	 EOF 
;

// Rule FunctionType
ruleFunctionType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_repeat_0_0=	'repeat' 
    {
        newLeafNode(lv_repeat_0_0, grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionTypeRule());
	        }
       		setWithLastConsumed($current, "repeat", true, "repeat");
	    }

)
)?(
(
		lv_optional_1_0=	'optional' 
    {
        newLeafNode(lv_optional_1_0, grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionTypeRule());
	        }
       		setWithLastConsumed($current, "optional", true, "optional");
	    }

)
)?(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionTypeRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getTypeTypeCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleDatatype
entryRuleDatatype returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	 iv_ruleDatatype=ruleDatatype 
	 { $current=$iv_ruleDatatype.current; } 
	 EOF 
;

// Rule Datatype
ruleDatatype returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='datatype' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDatatypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_2_0());
    }
(
(
		lv_type_3_0=RULE_STRING
		{
			newLeafNode(lv_type_3_0, grammarAccess.getDatatypeAccess().getTypeSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDatatypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"STRING");
	    }

)
)(	otherlv_4='defaultvalue=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getDefaultvalueKeyword_2_2_0());
    }
(
(
		lv_defaultValue_5_0=RULE_STRING
		{
			newLeafNode(lv_defaultValue_5_0, grammarAccess.getDatatypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDatatypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_5_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getDatatypeAccess().getRestrictionsRestrictionParserRuleCall_2_3_0()); 
	    }
		lv_restrictions_6_0=ruleRestriction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDatatypeRule());
	        }
       		add(
       			$current, 
       			"restrictions",
        		lv_restrictions_6_0, 
        		"Restriction");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_2_4());
    }
)?)
;





// Entry rule entryRuleRestriction
entryRuleRestriction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRestrictionRule()); }
	 iv_ruleRestriction=ruleRestriction 
	 { $current=$iv_ruleRestriction.current; } 
	 EOF 
;

// Rule Restriction
ruleRestriction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_stringrestriction_0_0=	'stringrestriction' 
    {
        newLeafNode(lv_stringrestriction_0_0, grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed($current, "stringrestriction", true, "stringrestriction");
	    }

)
)(	otherlv_1='maxlength' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getMaxlengthKeyword_0_1_0());
    }
(
(
		lv_maxlength_2_0=RULE_INT
		{
			newLeafNode(lv_maxlength_2_0, grammarAccess.getRestrictionAccess().getMaxlengthINTTerminalRuleCall_0_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"maxlength",
        		lv_maxlength_2_0, 
        		"INT");
	    }

)
))?	otherlv_3='minlength' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRestrictionAccess().getMinlengthKeyword_0_2());
    }
(
(
		lv_minlength_4_0=RULE_INT
		{
			newLeafNode(lv_minlength_4_0, grammarAccess.getRestrictionAccess().getMinlengthINTTerminalRuleCall_0_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minlength",
        		lv_minlength_4_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_valuerestriction_5_0=	'valuerestricion' 
    {
        newLeafNode(lv_valuerestriction_5_0, grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed($current, "valuerestriction", true, "valuerestricion");
	    }

)
)(	otherlv_6='maxvalue' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRestrictionAccess().getMaxvalueKeyword_1_1_0());
    }
(
(
		lv_maxvalue_7_0=RULE_INT
		{
			newLeafNode(lv_maxvalue_7_0, grammarAccess.getRestrictionAccess().getMaxvalueINTTerminalRuleCall_1_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"maxvalue",
        		lv_maxvalue_7_0, 
        		"INT");
	    }

)
))?	otherlv_8='minvalue' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRestrictionAccess().getMinvalueKeyword_1_2());
    }
(
(
		lv_minvalue_9_0=RULE_INT
		{
			newLeafNode(lv_minvalue_9_0, grammarAccess.getRestrictionAccess().getMinvalueINTTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRestrictionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minvalue",
        		lv_minvalue_9_0, 
        		"INT");
	    }

)
)))
;





// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	 iv_ruleMember=ruleMember 
	 { $current=$iv_ruleMember.current; } 
	 EOF 
;

// Rule Member
ruleMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMemberRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getTypeTypeCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	 iv_ruleObject=ruleObject 
	 { $current=$iv_ruleObject.current; } 
	 EOF 
;

// Rule Object
ruleObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='object' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjectRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjectRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
	}

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_4_0_0()); 
	    }
		lv_members_5_0=ruleMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_5_0, 
        		"Member");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjectAccess().getRestrictionsRestrictionParserRuleCall_4_1_1_0()); 
	    }
		lv_restrictions_7_0=ruleRestriction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjectRule());
	        }
       		add(
       			$current, 
       			"restrictions",
        		lv_restrictions_7_0, 
        		"Restriction");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4_1_2());
    }
)?)*(
(
		lv_issecure_9_0=	'issecure' 
    {
        newLeafNode(lv_issecure_9_0, grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjectRule());
	        }
       		setWithLastConsumed($current, "issecure", true, "issecure");
	    }

)
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='function' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getSuperTypeObjectCrossReference_2_1_0()); 
	}

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
    }
	otherlv_5='id' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getIdKeyword_4());
    }
(
(
		lv_identifier_6_0=RULE_INT
		{
			newLeafNode(lv_identifier_6_0, grammarAccess.getFunctionAccess().getIdentifierINTTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"identifier",
        		lv_identifier_6_0, 
        		"INT");
	    }

)
)(
(
		lv_issecure_7_0=	'issecure' 
    {
        newLeafNode(lv_issecure_7_0, grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed($current, "issecure", true, "issecure");
	    }

)
)?(	otherlv_8='gets' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getGetsKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getInputsFunctionTypeParserRuleCall_7_1_0()); 
	    }
		lv_inputs_9_0=ruleFunctionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		add(
       			$current, 
       			"inputs",
        		lv_inputs_9_0, 
        		"FunctionType");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_10='returns' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getReturnsKeyword_8_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getOutpustFunctionTypeParserRuleCall_8_1_0()); 
	    }
		lv_outpust_11_0=ruleFunctionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		add(
       			$current, 
       			"outpust",
        		lv_outpust_11_0, 
        		"FunctionType");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


