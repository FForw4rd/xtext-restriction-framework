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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'repeat'", "'optional'", "'datatype'", "'{'", "'defaultvalue='", "'}'", "'stringrestriction'", "'maxlength'", "'minlength'", "'valuerestricion'", "'maxvalue'", "'minvalue'", "':'", "'object'", "'extends'", "'issecure'", "'function'", "'id'", "'gets'", "'returns'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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

                if ( (LA1_0==13||LA1_0==24||LA1_0==27) ) {
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

            if ( (LA2_0==13||LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
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

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
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


    // $ANTLR start "entryRuleFunctionType"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:186:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:187:2: (iv_ruleFunctionType= ruleFunctionType EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:188:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_ruleFunctionType_in_entryRuleFunctionType404);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;

             current =iv_ruleFunctionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionType414); 

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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:195:1: ruleFunctionType returns [EObject current=null] : ( ( (lv_repeat_0_0= 'repeat' ) )? ( (lv_optional_1_0= 'optional' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token lv_repeat_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:198:28: ( ( ( (lv_repeat_0_0= 'repeat' ) )? ( (lv_optional_1_0= 'optional' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:1: ( ( (lv_repeat_0_0= 'repeat' ) )? ( (lv_optional_1_0= 'optional' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:1: ( ( (lv_repeat_0_0= 'repeat' ) )? ( (lv_optional_1_0= 'optional' ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:2: ( (lv_repeat_0_0= 'repeat' ) )? ( (lv_optional_1_0= 'optional' ) )? ( (otherlv_2= RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:199:2: ( (lv_repeat_0_0= 'repeat' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:200:1: (lv_repeat_0_0= 'repeat' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:200:1: (lv_repeat_0_0= 'repeat' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:201:3: lv_repeat_0_0= 'repeat'
                    {
                    lv_repeat_0_0=(Token)match(input,11,FOLLOW_11_in_ruleFunctionType457); 

                            newLeafNode(lv_repeat_0_0, grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "repeat", true, "repeat");
                    	    

                    }


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:214:3: ( (lv_optional_1_0= 'optional' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:215:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:215:1: (lv_optional_1_0= 'optional' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:216:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,12,FOLLOW_12_in_ruleFunctionType489); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:229:3: ( (otherlv_2= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:230:1: (otherlv_2= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:230:1: (otherlv_2= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:231:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionType523); 

            		newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getTypeTypeCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleDatatype"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:250:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:251:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:252:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype559);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype569); 

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:259:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_defaultValue_5_0=null;
        Token otherlv_7=null;
        EObject lv_restrictions_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:262:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )? ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:263:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )? )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:263:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )? )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:263:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDatatype606); 

                	newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:267:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:268:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:268:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:269:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype623); 

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

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:285:2: (otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:285:4: otherlv_2= '{' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( (lv_restrictions_6_0= ruleRestriction ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDatatype641); 

                        	newLeafNode(otherlv_2, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:289:1: ( (lv_type_3_0= RULE_STRING ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:290:1: (lv_type_3_0= RULE_STRING )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:290:1: (lv_type_3_0= RULE_STRING )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:291:3: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatatype658); 

                    			newLeafNode(lv_type_3_0, grammarAccess.getDatatypeAccess().getTypeSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDatatypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:307:2: (otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:307:4: otherlv_4= 'defaultvalue=' ( (lv_defaultValue_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDatatype676); 

                                	newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getDefaultvalueKeyword_2_2_0());
                                
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:311:1: ( (lv_defaultValue_5_0= RULE_STRING ) )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:312:1: (lv_defaultValue_5_0= RULE_STRING )
                            {
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:312:1: (lv_defaultValue_5_0= RULE_STRING )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:313:3: lv_defaultValue_5_0= RULE_STRING
                            {
                            lv_defaultValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatatype693); 

                            			newLeafNode(lv_defaultValue_5_0, grammarAccess.getDatatypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDatatypeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"defaultValue",
                                    		lv_defaultValue_5_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:329:4: ( (lv_restrictions_6_0= ruleRestriction ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17||LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:330:1: (lv_restrictions_6_0= ruleRestriction )
                    	    {
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:330:1: (lv_restrictions_6_0= ruleRestriction )
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:331:3: lv_restrictions_6_0= ruleRestriction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDatatypeAccess().getRestrictionsRestrictionParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRestriction_in_ruleDatatype721);
                    	    lv_restrictions_6_0=ruleRestriction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"restrictions",
                    	            		lv_restrictions_6_0, 
                    	            		"Restriction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDatatype734); 

                        	newLeafNode(otherlv_7, grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

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


    // $ANTLR start "entryRuleRestriction"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:359:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:360:2: (iv_ruleRestriction= ruleRestriction EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:361:2: iv_ruleRestriction= ruleRestriction EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction772);
            iv_ruleRestriction=ruleRestriction();

            state._fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction782); 

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
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:368:1: ruleRestriction returns [EObject current=null] : ( ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) ) | ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token lv_stringrestriction_0_0=null;
        Token otherlv_1=null;
        Token lv_maxlength_2_0=null;
        Token otherlv_3=null;
        Token lv_minlength_4_0=null;
        Token lv_valuerestriction_5_0=null;
        Token otherlv_6=null;
        Token lv_maxvalue_7_0=null;
        Token otherlv_8=null;
        Token lv_minvalue_9_0=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:371:28: ( ( ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) ) | ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:1: ( ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) ) | ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:1: ( ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) ) | ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:2: ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:2: ( ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:3: ( (lv_stringrestriction_0_0= 'stringrestriction' ) ) (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )? otherlv_3= 'minlength' ( (lv_minlength_4_0= RULE_INT ) )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:372:3: ( (lv_stringrestriction_0_0= 'stringrestriction' ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:373:1: (lv_stringrestriction_0_0= 'stringrestriction' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:373:1: (lv_stringrestriction_0_0= 'stringrestriction' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:374:3: lv_stringrestriction_0_0= 'stringrestriction'
                    {
                    lv_stringrestriction_0_0=(Token)match(input,17,FOLLOW_17_in_ruleRestriction826); 

                            newLeafNode(lv_stringrestriction_0_0, grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestrictionRule());
                    	        }
                           		setWithLastConsumed(current, "stringrestriction", true, "stringrestriction");
                    	    

                    }


                    }

                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:387:2: (otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:387:4: otherlv_1= 'maxlength' ( (lv_maxlength_2_0= RULE_INT ) )
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRestriction852); 

                                	newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getMaxlengthKeyword_0_1_0());
                                
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:391:1: ( (lv_maxlength_2_0= RULE_INT ) )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:392:1: (lv_maxlength_2_0= RULE_INT )
                            {
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:392:1: (lv_maxlength_2_0= RULE_INT )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:393:3: lv_maxlength_2_0= RULE_INT
                            {
                            lv_maxlength_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRestriction869); 

                            			newLeafNode(lv_maxlength_2_0, grammarAccess.getRestrictionAccess().getMaxlengthINTTerminalRuleCall_0_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRestrictionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"maxlength",
                                    		lv_maxlength_2_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRestriction888); 

                        	newLeafNode(otherlv_3, grammarAccess.getRestrictionAccess().getMinlengthKeyword_0_2());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:413:1: ( (lv_minlength_4_0= RULE_INT ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:414:1: (lv_minlength_4_0= RULE_INT )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:414:1: (lv_minlength_4_0= RULE_INT )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:415:3: lv_minlength_4_0= RULE_INT
                    {
                    lv_minlength_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRestriction905); 

                    			newLeafNode(lv_minlength_4_0, grammarAccess.getRestrictionAccess().getMinlengthINTTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestrictionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minlength",
                            		lv_minlength_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:432:6: ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:432:6: ( ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:432:7: ( (lv_valuerestriction_5_0= 'valuerestricion' ) ) (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )? otherlv_8= 'minvalue' ( (lv_minvalue_9_0= RULE_INT ) )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:432:7: ( (lv_valuerestriction_5_0= 'valuerestricion' ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:433:1: (lv_valuerestriction_5_0= 'valuerestricion' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:433:1: (lv_valuerestriction_5_0= 'valuerestricion' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:434:3: lv_valuerestriction_5_0= 'valuerestricion'
                    {
                    lv_valuerestriction_5_0=(Token)match(input,20,FOLLOW_20_in_ruleRestriction936); 

                            newLeafNode(lv_valuerestriction_5_0, grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestrictionRule());
                    	        }
                           		setWithLastConsumed(current, "valuerestriction", true, "valuerestricion");
                    	    

                    }


                    }

                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:447:2: (otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:447:4: otherlv_6= 'maxvalue' ( (lv_maxvalue_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleRestriction962); 

                                	newLeafNode(otherlv_6, grammarAccess.getRestrictionAccess().getMaxvalueKeyword_1_1_0());
                                
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:451:1: ( (lv_maxvalue_7_0= RULE_INT ) )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:452:1: (lv_maxvalue_7_0= RULE_INT )
                            {
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:452:1: (lv_maxvalue_7_0= RULE_INT )
                            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:453:3: lv_maxvalue_7_0= RULE_INT
                            {
                            lv_maxvalue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRestriction979); 

                            			newLeafNode(lv_maxvalue_7_0, grammarAccess.getRestrictionAccess().getMaxvalueINTTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRestrictionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"maxvalue",
                                    		lv_maxvalue_7_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRestriction998); 

                        	newLeafNode(otherlv_8, grammarAccess.getRestrictionAccess().getMinvalueKeyword_1_2());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:473:1: ( (lv_minvalue_9_0= RULE_INT ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:474:1: (lv_minvalue_9_0= RULE_INT )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:474:1: (lv_minvalue_9_0= RULE_INT )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:475:3: lv_minvalue_9_0= RULE_INT
                    {
                    lv_minvalue_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRestriction1015); 

                    			newLeafNode(lv_minvalue_9_0, grammarAccess.getRestrictionAccess().getMinvalueINTTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestrictionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minvalue",
                            		lv_minvalue_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleMember"
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:499:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:500:2: (iv_ruleMember= ruleMember EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:501:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1057);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1067); 

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:508:1: ruleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:511:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:512:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:512:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:512:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:512:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:513:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:513:1: (lv_name_0_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:514:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember1109); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleMember1126); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:534:1: ( (otherlv_2= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:535:1: (otherlv_2= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:535:1: (otherlv_2= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:536:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember1146); 

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:555:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:556:2: (iv_ruleObject= ruleObject EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:557:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject1182);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject1192); 

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:564:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )* ( (lv_issecure_9_0= 'issecure' ) )? otherlv_10= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_issecure_9_0=null;
        Token otherlv_10=null;
        EObject lv_members_5_0 = null;

        EObject lv_restrictions_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:567:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )* ( (lv_issecure_9_0= 'issecure' ) )? otherlv_10= '}' ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:568:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )* ( (lv_issecure_9_0= 'issecure' ) )? otherlv_10= '}' )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:568:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )* ( (lv_issecure_9_0= 'issecure' ) )? otherlv_10= '}' )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:568:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )* ( (lv_issecure_9_0= 'issecure' ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleObject1229); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:572:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:573:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:573:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:574:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject1246); 

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

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:590:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:590:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleObject1264); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getExtendsKeyword_2_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:594:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:595:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:595:1: (otherlv_3= RULE_ID )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:596:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject1284); 

                    		newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleObject1298); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:611:1: ( ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:611:2: ( (lv_members_5_0= ruleMember ) ) (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )?
            	    {
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:611:2: ( (lv_members_5_0= ruleMember ) )
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:612:1: (lv_members_5_0= ruleMember )
            	    {
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:612:1: (lv_members_5_0= ruleMember )
            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:613:3: lv_members_5_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleObject1320);
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

            	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:629:2: (otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:629:4: otherlv_6= '{' ( (lv_restrictions_7_0= ruleRestriction ) ) otherlv_8= '}'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleObject1333); 

            	                	newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4_1_0());
            	                
            	            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:633:1: ( (lv_restrictions_7_0= ruleRestriction ) )
            	            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:634:1: (lv_restrictions_7_0= ruleRestriction )
            	            {
            	            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:634:1: (lv_restrictions_7_0= ruleRestriction )
            	            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:635:3: lv_restrictions_7_0= ruleRestriction
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getObjectAccess().getRestrictionsRestrictionParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleRestriction_in_ruleObject1354);
            	            lv_restrictions_7_0=ruleRestriction();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"restrictions",
            	                    		lv_restrictions_7_0, 
            	                    		"Restriction");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleObject1366); 

            	                	newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4_1_2());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:655:5: ( (lv_issecure_9_0= 'issecure' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:656:1: (lv_issecure_9_0= 'issecure' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:656:1: (lv_issecure_9_0= 'issecure' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:657:3: lv_issecure_9_0= 'issecure'
                    {
                    lv_issecure_9_0=(Token)match(input,26,FOLLOW_26_in_ruleObject1388); 

                            newLeafNode(lv_issecure_9_0, grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectRule());
                    	        }
                           		setWithLastConsumed(current, "issecure", true, "issecure");
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleObject1414); 

                	newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:682:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:683:2: (iv_ruleFunction= ruleFunction EOF )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:684:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1450);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1460); 

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
    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:691:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )? (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )? otherlv_12= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_inputs_9_0 = null;

        EObject lv_outpust_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:694:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )? (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )? otherlv_12= '}' ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:695:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )? (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )? otherlv_12= '}' )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:695:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )? (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )? otherlv_12= '}' )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:695:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( (lv_identifier_6_0= RULE_INT ) ) ( (lv_issecure_7_0= 'issecure' ) )? (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )? (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFunction1497); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:699:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:700:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:700:1: (lv_name_1_0= RULE_ID )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:701:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1514); 

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

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:717:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:717:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleFunction1532); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getExtendsKeyword_2_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:721:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:722:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:722:1: (otherlv_3= RULE_ID )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:723:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1552); 

                    		newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getSuperTypeObjectCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFunction1566); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleFunction1578); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getIdKeyword_4());
                
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:742:1: ( (lv_identifier_6_0= RULE_INT ) )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:743:1: (lv_identifier_6_0= RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:743:1: (lv_identifier_6_0= RULE_INT )
            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:744:3: lv_identifier_6_0= RULE_INT
            {
            lv_identifier_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFunction1595); 

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

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:760:2: ( (lv_issecure_7_0= 'issecure' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:761:1: (lv_issecure_7_0= 'issecure' )
                    {
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:761:1: (lv_issecure_7_0= 'issecure' )
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:762:3: lv_issecure_7_0= 'issecure'
                    {
                    lv_issecure_7_0=(Token)match(input,26,FOLLOW_26_in_ruleFunction1618); 

                            newLeafNode(lv_issecure_7_0, grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                           		setWithLastConsumed(current, "issecure", true, "issecure");
                    	    

                    }


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:775:3: (otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:775:5: otherlv_8= 'gets' ( (lv_inputs_9_0= ruleFunctionType ) )*
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFunction1645); 

                        	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getGetsKeyword_7_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:779:1: ( (lv_inputs_9_0= ruleFunctionType ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=12)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:780:1: (lv_inputs_9_0= ruleFunctionType )
                    	    {
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:780:1: (lv_inputs_9_0= ruleFunctionType )
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:781:3: lv_inputs_9_0= ruleFunctionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionAccess().getInputsFunctionTypeParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionType_in_ruleFunction1666);
                    	    lv_inputs_9_0=ruleFunctionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_9_0, 
                    	            		"FunctionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:797:5: (otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:797:7: otherlv_10= 'returns' ( (lv_outpust_11_0= ruleFunctionType ) )*
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleFunction1682); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getReturnsKeyword_8_0());
                        
                    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:801:1: ( (lv_outpust_11_0= ruleFunctionType ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||(LA20_0>=11 && LA20_0<=12)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:802:1: (lv_outpust_11_0= ruleFunctionType )
                    	    {
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:802:1: (lv_outpust_11_0= ruleFunctionType )
                    	    // ../at.tugraz.xtext.metamodel/src-gen/at/tugraz/xtext/metamodel/parser/antlr/internal/InternalMetamodel.g:803:3: lv_outpust_11_0= ruleFunctionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionAccess().getOutpustFunctionTypeParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionType_in_ruleFunction1703);
                    	    lv_outpust_11_0=ruleFunctionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outpust",
                    	            		lv_outpust_11_0, 
                    	            		"FunctionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleFunction1718); 

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
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000009002002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleType342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_entryRuleFunctionType404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFunctionType457 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleFunctionType489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionType523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDatatype606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype623 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDatatype641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatatype658 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_15_in_ruleDatatype676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatatype693 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleDatatype721 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_16_in_ruleDatatype734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRestriction826 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleRestriction852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRestriction869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRestriction888 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRestriction905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRestriction936 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRestriction962 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRestriction979 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRestriction998 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRestriction1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember1109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMember1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleObject1229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject1246 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleObject1264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject1284 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleObject1298 = new BitSet(new long[]{0x0000000004010010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleObject1320 = new BitSet(new long[]{0x0000000004014010L});
    public static final BitSet FOLLOW_14_in_ruleObject1333 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleObject1354 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObject1366 = new BitSet(new long[]{0x0000000004010010L});
    public static final BitSet FOLLOW_26_in_ruleObject1388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObject1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunction1497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1514 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleFunction1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1552 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunction1566 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFunction1578 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFunction1595 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_26_in_ruleFunction1618 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_29_in_ruleFunction1645 = new BitSet(new long[]{0x0000000040011810L});
    public static final BitSet FOLLOW_ruleFunctionType_in_ruleFunction1666 = new BitSet(new long[]{0x0000000040011810L});
    public static final BitSet FOLLOW_30_in_ruleFunction1682 = new BitSet(new long[]{0x0000000000011810L});
    public static final BitSet FOLLOW_ruleFunctionType_in_ruleFunction1703 = new BitSet(new long[]{0x0000000000011810L});
    public static final BitSet FOLLOW_16_in_ruleFunction1718 = new BitSet(new long[]{0x0000000000000002L});

}