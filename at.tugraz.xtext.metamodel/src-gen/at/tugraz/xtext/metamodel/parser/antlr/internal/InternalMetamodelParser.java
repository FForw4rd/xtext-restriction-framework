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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetamodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "':'", "'object'", "'extends'", "'{'", "'issecure'", "'}'", "'function'", "'id'", "'gets'", "'returns'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMetamodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetamodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetamodelParser.tokenNames; }
    public String getGrammarFileName() { return "../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g"; }



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



    // $ANTLR start "entryRuleDomainmodel"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:76:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:115:1: ruleAbstractElement returns [EObject current=null] : (this_Type_0= ruleType | this_Function_1= ruleFunction ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Function_1 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:118:28: ( (this_Type_0= ruleType | this_Function_1= ruleFunction ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:119:1: (this_Type_0= ruleType | this_Function_1= ruleFunction )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:119:1: (this_Type_0= ruleType | this_Function_1= ruleFunction )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:120:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement223);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:130:5: this_Function_1= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleAbstractElement250);
                    this_Function_1=ruleFunction();

                    state._fsp--;

                     
                            current = this_Function_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleType"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:146:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:147:2: (iv_ruleType= ruleType EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:148:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType285);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:155:1: ruleType returns [EObject current=null] : (this_Datatype_0= ruleDatatype | this_Object_1= ruleObject ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Datatype_0 = null;

        EObject this_Object_1 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:158:28: ( (this_Datatype_0= ruleDatatype | this_Object_1= ruleObject ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:159:1: (this_Datatype_0= ruleDatatype | this_Object_1= ruleObject )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:159:1: (this_Datatype_0= ruleDatatype | this_Object_1= ruleObject )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:160:5: this_Datatype_0= ruleDatatype
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDatatype_in_ruleType342);
                    this_Datatype_0=ruleDatatype();

                    state._fsp--;

                     
                            current = this_Datatype_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:170:5: this_Object_1= ruleObject
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObject_in_ruleType369);
                    this_Object_1=ruleObject();

                    state._fsp--;

                     
                            current = this_Object_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDatatype"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:186:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:187:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:188:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype404);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype414); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:195:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:198:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDatatype451); 

                	newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:203:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:204:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:204:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:205:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype468); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatatypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleMember"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:229:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:230:2: (iv_ruleMember= ruleMember EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:231:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember509);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:238:1: ruleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:241:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:242:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:242:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:242:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:242:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:243:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:243:1: (lv_name_0_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:244:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember561); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMember578); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:264:1: ( (otherlv_2= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:265:1: (otherlv_2= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:265:1: (otherlv_2= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:266:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember598); 

            		newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleObject"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:285:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:286:2: (iv_ruleObject= ruleObject EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:287:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject634);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:294:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* ( (lv_issecure_6_0= 'issecure' ) )? otherlv_7= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_issecure_6_0=null;
        Token otherlv_7=null;
        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:297:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* ( (lv_issecure_6_0= 'issecure' ) )? otherlv_7= '}' ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:298:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* ( (lv_issecure_6_0= 'issecure' ) )? otherlv_7= '}' )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:298:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* ( (lv_issecure_6_0= 'issecure' ) )? otherlv_7= '}' )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:298:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* ( (lv_issecure_6_0= 'issecure' ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleObject681); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:303:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:303:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject698); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:320:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:320:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleObject716); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getExtendsKeyword_2_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:324:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:325:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:325:1: (otherlv_3= RULE_ID )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:326:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject736); 

                    		newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleObject750); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:341:1: ( (lv_members_5_0= ruleMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:342:1: (lv_members_5_0= ruleMember )
            	    {
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:342:1: (lv_members_5_0= ruleMember )
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:343:3: lv_members_5_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleObject771);
            	    lv_members_5_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_5_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:359:3: ( (lv_issecure_6_0= 'issecure' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:360:1: (lv_issecure_6_0= 'issecure' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:360:1: (lv_issecure_6_0= 'issecure' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:361:3: lv_issecure_6_0= 'issecure'
                    {
                    lv_issecure_6_0=(Token)match(input,16,FOLLOW_16_in_ruleObject790); 

                            newLeafNode(lv_issecure_6_0, grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectRule());
                    	        }
                           		setWithLastConsumed(current, "issecure", true, "issecure");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleObject816); 

                	newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleFunction"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:386:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:387:2: (iv_ruleFunction= ruleFunction EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:388:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction852);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction862); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:395:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )? (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_identifier_6_0=null;
        Token lv_issecure_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:398:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )? (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:399:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )? (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:399:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )? (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:399:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )? (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFunction899); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:403:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:404:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:404:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:405:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction916); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:421:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:421:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFunction934); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getExtendsKeyword_2_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:425:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:426:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:426:1: (otherlv_3= RULE_ID )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:427:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction954); 

                    		newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getSuperTypeObjectCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFunction968); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFunction980); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getIdKeyword_4());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:446:1: ( (lv_identifier_6_0= RULE_INT ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:447:1: (lv_identifier_6_0= RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:447:1: (lv_identifier_6_0= RULE_INT )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:448:3: lv_identifier_6_0= RULE_INT
            {
            lv_identifier_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFunction997); 

            			newLeafNode(lv_identifier_6_0, grammarAccess.getFunctionAccess().getIdentifierINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_6_0, 
                    		"INT");
            	    

            }


            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:464:2: ( (lv_issecure_7_0= 'issecure' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:465:1: (lv_issecure_7_0= 'issecure' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:465:1: (lv_issecure_7_0= 'issecure' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:466:3: lv_issecure_7_0= 'issecure'
                    {
                    lv_issecure_7_0=(Token)match(input,16,FOLLOW_16_in_ruleFunction1020); 

                            newLeafNode(lv_issecure_7_0, grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                           		setWithLastConsumed(current, "issecure", true, "issecure");
                    	    

                    }


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:479:3: (otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:479:5: otherlv_8= 'gets' ( (otherlv_9= RULE_ID ) )*
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleFunction1047); 

                        	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getGetsKeyword_7_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:483:1: ( (otherlv_9= RULE_ID ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:484:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:484:1: (otherlv_9= RULE_ID )
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:485:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1067); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getInputsTypeCrossReference_7_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:496:5: (otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:496:7: otherlv_10= 'returns' ( (otherlv_11= RULE_ID ) )*
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleFunction1083); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getReturnsKeyword_8_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:500:1: ( (otherlv_11= RULE_ID ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:501:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:501:1: (otherlv_11= RULE_ID )
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:502:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1103); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getOutpustTypeCrossReference_8_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleFunction1118); 

                	newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000042802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleType342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDatatype451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember561 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMember578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleObject681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject698 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleObject716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject736 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleObject750 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleObject771 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_16_in_ruleObject790 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleObject816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunction899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction916 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleFunction934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction954 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunction968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFunction997 = new BitSet(new long[]{0x0000000000330000L});
    public static final BitSet FOLLOW_16_in_ruleFunction1020 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_20_in_ruleFunction1047 = new BitSet(new long[]{0x0000000000220010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1067 = new BitSet(new long[]{0x0000000000220010L});
    public static final BitSet FOLLOW_21_in_ruleFunction1083 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1103 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleFunction1118 = new BitSet(new long[]{0x0000000000000002L});

}