package at.tugraz.xtext.metamodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.tugraz.xtext.metamodel.services.MetamodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetamodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'{'", "'}'", "'defaultvalue='", "'minlength'", "'maxlength'", "'minvalue'", "'maxvalue'", "':'", "'object'", "'extends'", "'function'", "'id'", "'gets'", "'returns'", "'repeat'", "'optional'", "'stringrestriction'", "'valuerestricion'", "'issecure'"
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
    public String getGrammarFileName() { return "../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g"; }


     
     	private MetamodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MetamodelGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomainmodel"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:60:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:61:1: ( ruleDomainmodel EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:62:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:69:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:73:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:75:1: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:76:1: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:76:2: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:89:1: ( ruleAbstractElement EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleType"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:117:1: ( ruleType EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:132:1: ( rule__Type__Alternatives )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType215);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFunctionType"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:144:1: entryRuleFunctionType : ruleFunctionType EOF ;
    public final void entryRuleFunctionType() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:145:1: ( ruleFunctionType EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:146:1: ruleFunctionType EOF
            {
             before(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_ruleFunctionType_in_entryRuleFunctionType242);
            ruleFunctionType();

            state._fsp--;

             after(grammarAccess.getFunctionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionType249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:153:1: ruleFunctionType : ( ( rule__FunctionType__Group__0 ) ) ;
    public final void ruleFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:157:2: ( ( ( rule__FunctionType__Group__0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:158:1: ( ( rule__FunctionType__Group__0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:158:1: ( ( rule__FunctionType__Group__0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:159:1: ( rule__FunctionType__Group__0 )
            {
             before(grammarAccess.getFunctionTypeAccess().getGroup()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:160:1: ( rule__FunctionType__Group__0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:160:2: rule__FunctionType__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionType__Group__0_in_ruleFunctionType275);
            rule__FunctionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleDatatype"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:172:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:173:1: ( ruleDatatype EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:174:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype302);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:181:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:185:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:186:1: ( ( rule__Datatype__Group__0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:186:1: ( ( rule__Datatype__Group__0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:187:1: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:188:1: ( rule__Datatype__Group__0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:188:2: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0_in_ruleDatatype335);
            rule__Datatype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleRestriction"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:200:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:201:1: ( ruleRestriction EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:202:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction362);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:209:1: ruleRestriction : ( ( rule__Restriction__Alternatives ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:213:2: ( ( ( rule__Restriction__Alternatives ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:214:1: ( ( rule__Restriction__Alternatives ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:214:1: ( ( rule__Restriction__Alternatives ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:215:1: ( rule__Restriction__Alternatives )
            {
             before(grammarAccess.getRestrictionAccess().getAlternatives()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:216:1: ( rule__Restriction__Alternatives )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:216:2: rule__Restriction__Alternatives
            {
            pushFollow(FOLLOW_rule__Restriction__Alternatives_in_ruleRestriction395);
            rule__Restriction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleMember"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:228:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:229:1: ( ruleMember EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:230:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember422);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:237:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:241:2: ( ( ( rule__Member__Group__0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:242:1: ( ( rule__Member__Group__0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:242:1: ( ( rule__Member__Group__0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:243:1: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:244:1: ( rule__Member__Group__0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:244:2: rule__Member__Group__0
            {
            pushFollow(FOLLOW_rule__Member__Group__0_in_ruleMember455);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleObject"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:256:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:257:1: ( ruleObject EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:258:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject482);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:265:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:269:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:270:1: ( ( rule__Object__Group__0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:270:1: ( ( rule__Object__Group__0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:271:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:272:1: ( rule__Object__Group__0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:272:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject515);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleFunction"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:284:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:285:1: ( ruleFunction EOF )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:286:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction542);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:293:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:297:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:298:1: ( ( rule__Function__Group__0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:298:1: ( ( rule__Function__Group__0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:299:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:300:1: ( rule__Function__Group__0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:300:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction575);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:312:1: rule__AbstractElement__Alternatives : ( ( ruleType ) | ( ruleFunction ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:316:1: ( ( ruleType ) | ( ruleFunction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:317:1: ( ruleType )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:317:1: ( ruleType )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:318:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives611);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:323:6: ( ruleFunction )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:323:6: ( ruleFunction )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:324:1: ruleFunction
                    {
                     before(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__AbstractElement__Alternatives628);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:334:1: rule__Type__Alternatives : ( ( ruleDatatype ) | ( ruleObject ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:338:1: ( ( ruleDatatype ) | ( ruleObject ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:339:1: ( ruleDatatype )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:339:1: ( ruleDatatype )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:340:1: ruleDatatype
                    {
                     before(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Type__Alternatives660);
                    ruleDatatype();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:345:6: ( ruleObject )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:345:6: ( ruleObject )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:346:1: ruleObject
                    {
                     before(grammarAccess.getTypeAccess().getObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObject_in_rule__Type__Alternatives677);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getObjectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Restriction__Alternatives"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:356:1: rule__Restriction__Alternatives : ( ( ( rule__Restriction__Group_0__0 ) ) | ( ( rule__Restriction__Group_1__0 ) ) );
    public final void rule__Restriction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:360:1: ( ( ( rule__Restriction__Group_0__0 ) ) | ( ( rule__Restriction__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:361:1: ( ( rule__Restriction__Group_0__0 ) )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:361:1: ( ( rule__Restriction__Group_0__0 ) )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:362:1: ( rule__Restriction__Group_0__0 )
                    {
                     before(grammarAccess.getRestrictionAccess().getGroup_0()); 
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:363:1: ( rule__Restriction__Group_0__0 )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:363:2: rule__Restriction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_0__0_in_rule__Restriction__Alternatives709);
                    rule__Restriction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestrictionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:367:6: ( ( rule__Restriction__Group_1__0 ) )
                    {
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:367:6: ( ( rule__Restriction__Group_1__0 ) )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:368:1: ( rule__Restriction__Group_1__0 )
                    {
                     before(grammarAccess.getRestrictionAccess().getGroup_1()); 
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:369:1: ( rule__Restriction__Group_1__0 )
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:369:2: rule__Restriction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_1__0_in_rule__Restriction__Alternatives727);
                    rule__Restriction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestrictionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Alternatives"


    // $ANTLR start "rule__FunctionType__Group__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:380:1: rule__FunctionType__Group__0 : rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1 ;
    public final void rule__FunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:384:1: ( rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:385:2: rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionType__Group__0__Impl_in_rule__FunctionType__Group__0758);
            rule__FunctionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionType__Group__1_in_rule__FunctionType__Group__0761);
            rule__FunctionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__0"


    // $ANTLR start "rule__FunctionType__Group__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:392:1: rule__FunctionType__Group__0__Impl : ( ( rule__FunctionType__RepeatAssignment_0 )? ) ;
    public final void rule__FunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:396:1: ( ( ( rule__FunctionType__RepeatAssignment_0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:397:1: ( ( rule__FunctionType__RepeatAssignment_0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:397:1: ( ( rule__FunctionType__RepeatAssignment_0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:398:1: ( rule__FunctionType__RepeatAssignment_0 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getRepeatAssignment_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:399:1: ( rule__FunctionType__RepeatAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:399:2: rule__FunctionType__RepeatAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FunctionType__RepeatAssignment_0_in_rule__FunctionType__Group__0__Impl788);
                    rule__FunctionType__RepeatAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionTypeAccess().getRepeatAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__0__Impl"


    // $ANTLR start "rule__FunctionType__Group__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:409:1: rule__FunctionType__Group__1 : rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2 ;
    public final void rule__FunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:413:1: ( rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:414:2: rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionType__Group__1__Impl_in_rule__FunctionType__Group__1819);
            rule__FunctionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionType__Group__2_in_rule__FunctionType__Group__1822);
            rule__FunctionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__1"


    // $ANTLR start "rule__FunctionType__Group__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:421:1: rule__FunctionType__Group__1__Impl : ( ( rule__FunctionType__OptionalAssignment_1 )? ) ;
    public final void rule__FunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:425:1: ( ( ( rule__FunctionType__OptionalAssignment_1 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:426:1: ( ( rule__FunctionType__OptionalAssignment_1 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:426:1: ( ( rule__FunctionType__OptionalAssignment_1 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:427:1: ( rule__FunctionType__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getOptionalAssignment_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:428:1: ( rule__FunctionType__OptionalAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:428:2: rule__FunctionType__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FunctionType__OptionalAssignment_1_in_rule__FunctionType__Group__1__Impl849);
                    rule__FunctionType__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionTypeAccess().getOptionalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__1__Impl"


    // $ANTLR start "rule__FunctionType__Group__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:438:1: rule__FunctionType__Group__2 : rule__FunctionType__Group__2__Impl ;
    public final void rule__FunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:442:1: ( rule__FunctionType__Group__2__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:443:2: rule__FunctionType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionType__Group__2__Impl_in_rule__FunctionType__Group__2880);
            rule__FunctionType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__2"


    // $ANTLR start "rule__FunctionType__Group__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:449:1: rule__FunctionType__Group__2__Impl : ( ( rule__FunctionType__TypeAssignment_2 ) ) ;
    public final void rule__FunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:453:1: ( ( ( rule__FunctionType__TypeAssignment_2 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:454:1: ( ( rule__FunctionType__TypeAssignment_2 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:454:1: ( ( rule__FunctionType__TypeAssignment_2 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:455:1: ( rule__FunctionType__TypeAssignment_2 )
            {
             before(grammarAccess.getFunctionTypeAccess().getTypeAssignment_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:456:1: ( rule__FunctionType__TypeAssignment_2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:456:2: rule__FunctionType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionType__TypeAssignment_2_in_rule__FunctionType__Group__2__Impl907);
            rule__FunctionType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:472:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:476:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:477:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__0943);
            rule__Datatype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__0946);
            rule__Datatype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0"


    // $ANTLR start "rule__Datatype__Group__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:484:1: rule__Datatype__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:488:1: ( ( 'datatype' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:489:1: ( 'datatype' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:489:1: ( 'datatype' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:490:1: 'datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Datatype__Group__0__Impl974); 
             after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:503:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:507:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:508:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__11005);
            rule__Datatype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__11008);
            rule__Datatype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1"


    // $ANTLR start "rule__Datatype__Group__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:515:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:519:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:520:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:520:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:521:1: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:522:1: ( rule__Datatype__NameAssignment_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:522:2: rule__Datatype__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Datatype__NameAssignment_1_in_rule__Datatype__Group__1__Impl1035);
            rule__Datatype__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:532:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:536:1: ( rule__Datatype__Group__2__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:537:2: rule__Datatype__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__21065);
            rule__Datatype__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2"


    // $ANTLR start "rule__Datatype__Group__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:543:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__Group_2__0 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:547:1: ( ( ( rule__Datatype__Group_2__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:548:1: ( ( rule__Datatype__Group_2__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:548:1: ( ( rule__Datatype__Group_2__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:549:1: ( rule__Datatype__Group_2__0 )?
            {
             before(grammarAccess.getDatatypeAccess().getGroup_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:550:1: ( rule__Datatype__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:550:2: rule__Datatype__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Datatype__Group_2__0_in_rule__Datatype__Group__2__Impl1092);
                    rule__Datatype__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatatypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group_2__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:566:1: rule__Datatype__Group_2__0 : rule__Datatype__Group_2__0__Impl rule__Datatype__Group_2__1 ;
    public final void rule__Datatype__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:570:1: ( rule__Datatype__Group_2__0__Impl rule__Datatype__Group_2__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:571:2: rule__Datatype__Group_2__0__Impl rule__Datatype__Group_2__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2__0__Impl_in_rule__Datatype__Group_2__01129);
            rule__Datatype__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_2__1_in_rule__Datatype__Group_2__01132);
            rule__Datatype__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__0"


    // $ANTLR start "rule__Datatype__Group_2__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:578:1: rule__Datatype__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Datatype__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:582:1: ( ( '{' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:583:1: ( '{' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:583:1: ( '{' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:584:1: '{'
            {
             before(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Datatype__Group_2__0__Impl1160); 
             after(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__0__Impl"


    // $ANTLR start "rule__Datatype__Group_2__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:597:1: rule__Datatype__Group_2__1 : rule__Datatype__Group_2__1__Impl rule__Datatype__Group_2__2 ;
    public final void rule__Datatype__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:601:1: ( rule__Datatype__Group_2__1__Impl rule__Datatype__Group_2__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:602:2: rule__Datatype__Group_2__1__Impl rule__Datatype__Group_2__2
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2__1__Impl_in_rule__Datatype__Group_2__11191);
            rule__Datatype__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_2__2_in_rule__Datatype__Group_2__11194);
            rule__Datatype__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__1"


    // $ANTLR start "rule__Datatype__Group_2__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:609:1: rule__Datatype__Group_2__1__Impl : ( ( rule__Datatype__TypeAssignment_2_1 ) ) ;
    public final void rule__Datatype__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:613:1: ( ( ( rule__Datatype__TypeAssignment_2_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:614:1: ( ( rule__Datatype__TypeAssignment_2_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:614:1: ( ( rule__Datatype__TypeAssignment_2_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:615:1: ( rule__Datatype__TypeAssignment_2_1 )
            {
             before(grammarAccess.getDatatypeAccess().getTypeAssignment_2_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:616:1: ( rule__Datatype__TypeAssignment_2_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:616:2: rule__Datatype__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Datatype__TypeAssignment_2_1_in_rule__Datatype__Group_2__1__Impl1221);
            rule__Datatype__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__1__Impl"


    // $ANTLR start "rule__Datatype__Group_2__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:626:1: rule__Datatype__Group_2__2 : rule__Datatype__Group_2__2__Impl rule__Datatype__Group_2__3 ;
    public final void rule__Datatype__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:630:1: ( rule__Datatype__Group_2__2__Impl rule__Datatype__Group_2__3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:631:2: rule__Datatype__Group_2__2__Impl rule__Datatype__Group_2__3
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2__2__Impl_in_rule__Datatype__Group_2__21251);
            rule__Datatype__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_2__3_in_rule__Datatype__Group_2__21254);
            rule__Datatype__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__2"


    // $ANTLR start "rule__Datatype__Group_2__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:638:1: rule__Datatype__Group_2__2__Impl : ( ( rule__Datatype__Group_2_2__0 )? ) ;
    public final void rule__Datatype__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:642:1: ( ( ( rule__Datatype__Group_2_2__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:643:1: ( ( rule__Datatype__Group_2_2__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:643:1: ( ( rule__Datatype__Group_2_2__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:644:1: ( rule__Datatype__Group_2_2__0 )?
            {
             before(grammarAccess.getDatatypeAccess().getGroup_2_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:645:1: ( rule__Datatype__Group_2_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:645:2: rule__Datatype__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Datatype__Group_2_2__0_in_rule__Datatype__Group_2__2__Impl1281);
                    rule__Datatype__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatatypeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__2__Impl"


    // $ANTLR start "rule__Datatype__Group_2__3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:655:1: rule__Datatype__Group_2__3 : rule__Datatype__Group_2__3__Impl rule__Datatype__Group_2__4 ;
    public final void rule__Datatype__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:659:1: ( rule__Datatype__Group_2__3__Impl rule__Datatype__Group_2__4 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:660:2: rule__Datatype__Group_2__3__Impl rule__Datatype__Group_2__4
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2__3__Impl_in_rule__Datatype__Group_2__31312);
            rule__Datatype__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_2__4_in_rule__Datatype__Group_2__31315);
            rule__Datatype__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__3"


    // $ANTLR start "rule__Datatype__Group_2__3__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:667:1: rule__Datatype__Group_2__3__Impl : ( ( rule__Datatype__RestrictionsAssignment_2_3 )* ) ;
    public final void rule__Datatype__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:671:1: ( ( ( rule__Datatype__RestrictionsAssignment_2_3 )* ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:672:1: ( ( rule__Datatype__RestrictionsAssignment_2_3 )* )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:672:1: ( ( rule__Datatype__RestrictionsAssignment_2_3 )* )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:673:1: ( rule__Datatype__RestrictionsAssignment_2_3 )*
            {
             before(grammarAccess.getDatatypeAccess().getRestrictionsAssignment_2_3()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:674:1: ( rule__Datatype__RestrictionsAssignment_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=28 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:674:2: rule__Datatype__RestrictionsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Datatype__RestrictionsAssignment_2_3_in_rule__Datatype__Group_2__3__Impl1342);
            	    rule__Datatype__RestrictionsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDatatypeAccess().getRestrictionsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__3__Impl"


    // $ANTLR start "rule__Datatype__Group_2__4"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:684:1: rule__Datatype__Group_2__4 : rule__Datatype__Group_2__4__Impl ;
    public final void rule__Datatype__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:688:1: ( rule__Datatype__Group_2__4__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:689:2: rule__Datatype__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2__4__Impl_in_rule__Datatype__Group_2__41373);
            rule__Datatype__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__4"


    // $ANTLR start "rule__Datatype__Group_2__4__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:695:1: rule__Datatype__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Datatype__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:699:1: ( ( '}' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:700:1: ( '}' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:700:1: ( '}' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:701:1: '}'
            {
             before(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,13,FOLLOW_13_in_rule__Datatype__Group_2__4__Impl1401); 
             after(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2__4__Impl"


    // $ANTLR start "rule__Datatype__Group_2_2__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:724:1: rule__Datatype__Group_2_2__0 : rule__Datatype__Group_2_2__0__Impl rule__Datatype__Group_2_2__1 ;
    public final void rule__Datatype__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:728:1: ( rule__Datatype__Group_2_2__0__Impl rule__Datatype__Group_2_2__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:729:2: rule__Datatype__Group_2_2__0__Impl rule__Datatype__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2_2__0__Impl_in_rule__Datatype__Group_2_2__01442);
            rule__Datatype__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group_2_2__1_in_rule__Datatype__Group_2_2__01445);
            rule__Datatype__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2_2__0"


    // $ANTLR start "rule__Datatype__Group_2_2__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:736:1: rule__Datatype__Group_2_2__0__Impl : ( 'defaultvalue=' ) ;
    public final void rule__Datatype__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:740:1: ( ( 'defaultvalue=' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:741:1: ( 'defaultvalue=' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:741:1: ( 'defaultvalue=' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:742:1: 'defaultvalue='
            {
             before(grammarAccess.getDatatypeAccess().getDefaultvalueKeyword_2_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Datatype__Group_2_2__0__Impl1473); 
             after(grammarAccess.getDatatypeAccess().getDefaultvalueKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2_2__0__Impl"


    // $ANTLR start "rule__Datatype__Group_2_2__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:755:1: rule__Datatype__Group_2_2__1 : rule__Datatype__Group_2_2__1__Impl ;
    public final void rule__Datatype__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:759:1: ( rule__Datatype__Group_2_2__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:760:2: rule__Datatype__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group_2_2__1__Impl_in_rule__Datatype__Group_2_2__11504);
            rule__Datatype__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2_2__1"


    // $ANTLR start "rule__Datatype__Group_2_2__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:766:1: rule__Datatype__Group_2_2__1__Impl : ( ( rule__Datatype__DefaultValueAssignment_2_2_1 ) ) ;
    public final void rule__Datatype__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:770:1: ( ( ( rule__Datatype__DefaultValueAssignment_2_2_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:771:1: ( ( rule__Datatype__DefaultValueAssignment_2_2_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:771:1: ( ( rule__Datatype__DefaultValueAssignment_2_2_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:772:1: ( rule__Datatype__DefaultValueAssignment_2_2_1 )
            {
             before(grammarAccess.getDatatypeAccess().getDefaultValueAssignment_2_2_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:773:1: ( rule__Datatype__DefaultValueAssignment_2_2_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:773:2: rule__Datatype__DefaultValueAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Datatype__DefaultValueAssignment_2_2_1_in_rule__Datatype__Group_2_2__1__Impl1531);
            rule__Datatype__DefaultValueAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getDefaultValueAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_2_2__1__Impl"


    // $ANTLR start "rule__Restriction__Group_0__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:787:1: rule__Restriction__Group_0__0 : rule__Restriction__Group_0__0__Impl rule__Restriction__Group_0__1 ;
    public final void rule__Restriction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:791:1: ( rule__Restriction__Group_0__0__Impl rule__Restriction__Group_0__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:792:2: rule__Restriction__Group_0__0__Impl rule__Restriction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0__0__Impl_in_rule__Restriction__Group_0__01565);
            rule__Restriction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_0__1_in_rule__Restriction__Group_0__01568);
            rule__Restriction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__0"


    // $ANTLR start "rule__Restriction__Group_0__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:799:1: rule__Restriction__Group_0__0__Impl : ( ( rule__Restriction__StringrestrictionAssignment_0_0 ) ) ;
    public final void rule__Restriction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:803:1: ( ( ( rule__Restriction__StringrestrictionAssignment_0_0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:804:1: ( ( rule__Restriction__StringrestrictionAssignment_0_0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:804:1: ( ( rule__Restriction__StringrestrictionAssignment_0_0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:805:1: ( rule__Restriction__StringrestrictionAssignment_0_0 )
            {
             before(grammarAccess.getRestrictionAccess().getStringrestrictionAssignment_0_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:806:1: ( rule__Restriction__StringrestrictionAssignment_0_0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:806:2: rule__Restriction__StringrestrictionAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Restriction__StringrestrictionAssignment_0_0_in_rule__Restriction__Group_0__0__Impl1595);
            rule__Restriction__StringrestrictionAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getStringrestrictionAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__0__Impl"


    // $ANTLR start "rule__Restriction__Group_0__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:816:1: rule__Restriction__Group_0__1 : rule__Restriction__Group_0__1__Impl rule__Restriction__Group_0__2 ;
    public final void rule__Restriction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:820:1: ( rule__Restriction__Group_0__1__Impl rule__Restriction__Group_0__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:821:2: rule__Restriction__Group_0__1__Impl rule__Restriction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0__1__Impl_in_rule__Restriction__Group_0__11625);
            rule__Restriction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_0__2_in_rule__Restriction__Group_0__11628);
            rule__Restriction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__1"


    // $ANTLR start "rule__Restriction__Group_0__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:828:1: rule__Restriction__Group_0__1__Impl : ( ( rule__Restriction__Group_0_1__0 )? ) ;
    public final void rule__Restriction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:832:1: ( ( ( rule__Restriction__Group_0_1__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:833:1: ( ( rule__Restriction__Group_0_1__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:833:1: ( ( rule__Restriction__Group_0_1__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:834:1: ( rule__Restriction__Group_0_1__0 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroup_0_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:835:1: ( rule__Restriction__Group_0_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:835:2: rule__Restriction__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_0_1__0_in_rule__Restriction__Group_0__1__Impl1655);
                    rule__Restriction__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestrictionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__1__Impl"


    // $ANTLR start "rule__Restriction__Group_0__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:845:1: rule__Restriction__Group_0__2 : rule__Restriction__Group_0__2__Impl rule__Restriction__Group_0__3 ;
    public final void rule__Restriction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:849:1: ( rule__Restriction__Group_0__2__Impl rule__Restriction__Group_0__3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:850:2: rule__Restriction__Group_0__2__Impl rule__Restriction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0__2__Impl_in_rule__Restriction__Group_0__21686);
            rule__Restriction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_0__3_in_rule__Restriction__Group_0__21689);
            rule__Restriction__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__2"


    // $ANTLR start "rule__Restriction__Group_0__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:857:1: rule__Restriction__Group_0__2__Impl : ( 'minlength' ) ;
    public final void rule__Restriction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:861:1: ( ( 'minlength' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:862:1: ( 'minlength' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:862:1: ( 'minlength' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:863:1: 'minlength'
            {
             before(grammarAccess.getRestrictionAccess().getMinlengthKeyword_0_2()); 
            match(input,15,FOLLOW_15_in_rule__Restriction__Group_0__2__Impl1717); 
             after(grammarAccess.getRestrictionAccess().getMinlengthKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__2__Impl"


    // $ANTLR start "rule__Restriction__Group_0__3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:876:1: rule__Restriction__Group_0__3 : rule__Restriction__Group_0__3__Impl ;
    public final void rule__Restriction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:880:1: ( rule__Restriction__Group_0__3__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:881:2: rule__Restriction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0__3__Impl_in_rule__Restriction__Group_0__31748);
            rule__Restriction__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__3"


    // $ANTLR start "rule__Restriction__Group_0__3__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:887:1: rule__Restriction__Group_0__3__Impl : ( ( rule__Restriction__MinlengthAssignment_0_3 ) ) ;
    public final void rule__Restriction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:891:1: ( ( ( rule__Restriction__MinlengthAssignment_0_3 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:892:1: ( ( rule__Restriction__MinlengthAssignment_0_3 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:892:1: ( ( rule__Restriction__MinlengthAssignment_0_3 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:893:1: ( rule__Restriction__MinlengthAssignment_0_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMinlengthAssignment_0_3()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:894:1: ( rule__Restriction__MinlengthAssignment_0_3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:894:2: rule__Restriction__MinlengthAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Restriction__MinlengthAssignment_0_3_in_rule__Restriction__Group_0__3__Impl1775);
            rule__Restriction__MinlengthAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getMinlengthAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0__3__Impl"


    // $ANTLR start "rule__Restriction__Group_0_1__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:912:1: rule__Restriction__Group_0_1__0 : rule__Restriction__Group_0_1__0__Impl rule__Restriction__Group_0_1__1 ;
    public final void rule__Restriction__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:916:1: ( rule__Restriction__Group_0_1__0__Impl rule__Restriction__Group_0_1__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:917:2: rule__Restriction__Group_0_1__0__Impl rule__Restriction__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0_1__0__Impl_in_rule__Restriction__Group_0_1__01813);
            rule__Restriction__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_0_1__1_in_rule__Restriction__Group_0_1__01816);
            rule__Restriction__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0_1__0"


    // $ANTLR start "rule__Restriction__Group_0_1__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:924:1: rule__Restriction__Group_0_1__0__Impl : ( 'maxlength' ) ;
    public final void rule__Restriction__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:928:1: ( ( 'maxlength' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:929:1: ( 'maxlength' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:929:1: ( 'maxlength' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:930:1: 'maxlength'
            {
             before(grammarAccess.getRestrictionAccess().getMaxlengthKeyword_0_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Restriction__Group_0_1__0__Impl1844); 
             after(grammarAccess.getRestrictionAccess().getMaxlengthKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0_1__0__Impl"


    // $ANTLR start "rule__Restriction__Group_0_1__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:943:1: rule__Restriction__Group_0_1__1 : rule__Restriction__Group_0_1__1__Impl ;
    public final void rule__Restriction__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:947:1: ( rule__Restriction__Group_0_1__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:948:2: rule__Restriction__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_0_1__1__Impl_in_rule__Restriction__Group_0_1__11875);
            rule__Restriction__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0_1__1"


    // $ANTLR start "rule__Restriction__Group_0_1__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:954:1: rule__Restriction__Group_0_1__1__Impl : ( ( rule__Restriction__MaxlengthAssignment_0_1_1 ) ) ;
    public final void rule__Restriction__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:958:1: ( ( ( rule__Restriction__MaxlengthAssignment_0_1_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:959:1: ( ( rule__Restriction__MaxlengthAssignment_0_1_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:959:1: ( ( rule__Restriction__MaxlengthAssignment_0_1_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:960:1: ( rule__Restriction__MaxlengthAssignment_0_1_1 )
            {
             before(grammarAccess.getRestrictionAccess().getMaxlengthAssignment_0_1_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:961:1: ( rule__Restriction__MaxlengthAssignment_0_1_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:961:2: rule__Restriction__MaxlengthAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Restriction__MaxlengthAssignment_0_1_1_in_rule__Restriction__Group_0_1__1__Impl1902);
            rule__Restriction__MaxlengthAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getMaxlengthAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_0_1__1__Impl"


    // $ANTLR start "rule__Restriction__Group_1__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:975:1: rule__Restriction__Group_1__0 : rule__Restriction__Group_1__0__Impl rule__Restriction__Group_1__1 ;
    public final void rule__Restriction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:979:1: ( rule__Restriction__Group_1__0__Impl rule__Restriction__Group_1__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:980:2: rule__Restriction__Group_1__0__Impl rule__Restriction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1__0__Impl_in_rule__Restriction__Group_1__01936);
            rule__Restriction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_1__1_in_rule__Restriction__Group_1__01939);
            rule__Restriction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__0"


    // $ANTLR start "rule__Restriction__Group_1__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:987:1: rule__Restriction__Group_1__0__Impl : ( ( rule__Restriction__ValuerestrictionAssignment_1_0 ) ) ;
    public final void rule__Restriction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:991:1: ( ( ( rule__Restriction__ValuerestrictionAssignment_1_0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:992:1: ( ( rule__Restriction__ValuerestrictionAssignment_1_0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:992:1: ( ( rule__Restriction__ValuerestrictionAssignment_1_0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:993:1: ( rule__Restriction__ValuerestrictionAssignment_1_0 )
            {
             before(grammarAccess.getRestrictionAccess().getValuerestrictionAssignment_1_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:994:1: ( rule__Restriction__ValuerestrictionAssignment_1_0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:994:2: rule__Restriction__ValuerestrictionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Restriction__ValuerestrictionAssignment_1_0_in_rule__Restriction__Group_1__0__Impl1966);
            rule__Restriction__ValuerestrictionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getValuerestrictionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__0__Impl"


    // $ANTLR start "rule__Restriction__Group_1__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1004:1: rule__Restriction__Group_1__1 : rule__Restriction__Group_1__1__Impl rule__Restriction__Group_1__2 ;
    public final void rule__Restriction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1008:1: ( rule__Restriction__Group_1__1__Impl rule__Restriction__Group_1__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1009:2: rule__Restriction__Group_1__1__Impl rule__Restriction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1__1__Impl_in_rule__Restriction__Group_1__11996);
            rule__Restriction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_1__2_in_rule__Restriction__Group_1__11999);
            rule__Restriction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__1"


    // $ANTLR start "rule__Restriction__Group_1__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1016:1: rule__Restriction__Group_1__1__Impl : ( ( rule__Restriction__Group_1_1__0 )? ) ;
    public final void rule__Restriction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1020:1: ( ( ( rule__Restriction__Group_1_1__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1021:1: ( ( rule__Restriction__Group_1_1__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1021:1: ( ( rule__Restriction__Group_1_1__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1022:1: ( rule__Restriction__Group_1_1__0 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroup_1_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1023:1: ( rule__Restriction__Group_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1023:2: rule__Restriction__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_1_1__0_in_rule__Restriction__Group_1__1__Impl2026);
                    rule__Restriction__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestrictionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__1__Impl"


    // $ANTLR start "rule__Restriction__Group_1__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1033:1: rule__Restriction__Group_1__2 : rule__Restriction__Group_1__2__Impl rule__Restriction__Group_1__3 ;
    public final void rule__Restriction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1037:1: ( rule__Restriction__Group_1__2__Impl rule__Restriction__Group_1__3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1038:2: rule__Restriction__Group_1__2__Impl rule__Restriction__Group_1__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1__2__Impl_in_rule__Restriction__Group_1__22057);
            rule__Restriction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_1__3_in_rule__Restriction__Group_1__22060);
            rule__Restriction__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__2"


    // $ANTLR start "rule__Restriction__Group_1__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1045:1: rule__Restriction__Group_1__2__Impl : ( 'minvalue' ) ;
    public final void rule__Restriction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1049:1: ( ( 'minvalue' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1050:1: ( 'minvalue' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1050:1: ( 'minvalue' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1051:1: 'minvalue'
            {
             before(grammarAccess.getRestrictionAccess().getMinvalueKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Restriction__Group_1__2__Impl2088); 
             after(grammarAccess.getRestrictionAccess().getMinvalueKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__2__Impl"


    // $ANTLR start "rule__Restriction__Group_1__3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1064:1: rule__Restriction__Group_1__3 : rule__Restriction__Group_1__3__Impl ;
    public final void rule__Restriction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1068:1: ( rule__Restriction__Group_1__3__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1069:2: rule__Restriction__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1__3__Impl_in_rule__Restriction__Group_1__32119);
            rule__Restriction__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__3"


    // $ANTLR start "rule__Restriction__Group_1__3__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1075:1: rule__Restriction__Group_1__3__Impl : ( ( rule__Restriction__MinvalueAssignment_1_3 ) ) ;
    public final void rule__Restriction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1079:1: ( ( ( rule__Restriction__MinvalueAssignment_1_3 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1080:1: ( ( rule__Restriction__MinvalueAssignment_1_3 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1080:1: ( ( rule__Restriction__MinvalueAssignment_1_3 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1081:1: ( rule__Restriction__MinvalueAssignment_1_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMinvalueAssignment_1_3()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1082:1: ( rule__Restriction__MinvalueAssignment_1_3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1082:2: rule__Restriction__MinvalueAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Restriction__MinvalueAssignment_1_3_in_rule__Restriction__Group_1__3__Impl2146);
            rule__Restriction__MinvalueAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getMinvalueAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1__3__Impl"


    // $ANTLR start "rule__Restriction__Group_1_1__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1100:1: rule__Restriction__Group_1_1__0 : rule__Restriction__Group_1_1__0__Impl rule__Restriction__Group_1_1__1 ;
    public final void rule__Restriction__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1104:1: ( rule__Restriction__Group_1_1__0__Impl rule__Restriction__Group_1_1__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1105:2: rule__Restriction__Group_1_1__0__Impl rule__Restriction__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1_1__0__Impl_in_rule__Restriction__Group_1_1__02184);
            rule__Restriction__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_1_1__1_in_rule__Restriction__Group_1_1__02187);
            rule__Restriction__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1_1__0"


    // $ANTLR start "rule__Restriction__Group_1_1__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1112:1: rule__Restriction__Group_1_1__0__Impl : ( 'maxvalue' ) ;
    public final void rule__Restriction__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1116:1: ( ( 'maxvalue' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1117:1: ( 'maxvalue' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1117:1: ( 'maxvalue' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1118:1: 'maxvalue'
            {
             before(grammarAccess.getRestrictionAccess().getMaxvalueKeyword_1_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Restriction__Group_1_1__0__Impl2215); 
             after(grammarAccess.getRestrictionAccess().getMaxvalueKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1_1__0__Impl"


    // $ANTLR start "rule__Restriction__Group_1_1__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1131:1: rule__Restriction__Group_1_1__1 : rule__Restriction__Group_1_1__1__Impl ;
    public final void rule__Restriction__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1135:1: ( rule__Restriction__Group_1_1__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1136:2: rule__Restriction__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_1_1__1__Impl_in_rule__Restriction__Group_1_1__12246);
            rule__Restriction__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1_1__1"


    // $ANTLR start "rule__Restriction__Group_1_1__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1142:1: rule__Restriction__Group_1_1__1__Impl : ( ( rule__Restriction__MaxvalueAssignment_1_1_1 ) ) ;
    public final void rule__Restriction__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1146:1: ( ( ( rule__Restriction__MaxvalueAssignment_1_1_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1147:1: ( ( rule__Restriction__MaxvalueAssignment_1_1_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1147:1: ( ( rule__Restriction__MaxvalueAssignment_1_1_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1148:1: ( rule__Restriction__MaxvalueAssignment_1_1_1 )
            {
             before(grammarAccess.getRestrictionAccess().getMaxvalueAssignment_1_1_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1149:1: ( rule__Restriction__MaxvalueAssignment_1_1_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1149:2: rule__Restriction__MaxvalueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Restriction__MaxvalueAssignment_1_1_1_in_rule__Restriction__Group_1_1__1__Impl2273);
            rule__Restriction__MaxvalueAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getMaxvalueAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_1_1__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1163:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1167:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1168:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__02307);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__1_in_rule__Member__Group__02310);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1175:1: rule__Member__Group__0__Impl : ( ( rule__Member__NameAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1179:1: ( ( ( rule__Member__NameAssignment_0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1180:1: ( ( rule__Member__NameAssignment_0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1180:1: ( ( rule__Member__NameAssignment_0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1181:1: ( rule__Member__NameAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1182:1: ( rule__Member__NameAssignment_0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1182:2: rule__Member__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl2337);
            rule__Member__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1192:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1196:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1197:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__12367);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__2_in_rule__Member__Group__12370);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1204:1: rule__Member__Group__1__Impl : ( ':' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1208:1: ( ( ':' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1209:1: ( ':' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1209:1: ( ':' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1210:1: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Member__Group__1__Impl2398); 
             after(grammarAccess.getMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1223:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1227:1: ( rule__Member__Group__2__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1228:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__22429);
            rule__Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1234:1: rule__Member__Group__2__Impl : ( ( rule__Member__TypeAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1238:1: ( ( ( rule__Member__TypeAssignment_2 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1239:1: ( ( rule__Member__TypeAssignment_2 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1239:1: ( ( rule__Member__TypeAssignment_2 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1240:1: ( rule__Member__TypeAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1241:1: ( rule__Member__TypeAssignment_2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1241:2: rule__Member__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl2456);
            rule__Member__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1257:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1261:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1262:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__02492);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__02495);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1269:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1273:1: ( ( 'object' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1274:1: ( 'object' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1274:1: ( 'object' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1275:1: 'object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Object__Group__0__Impl2523); 
             after(grammarAccess.getObjectAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1288:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1292:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1293:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__12554);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__12557);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1300:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1304:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1305:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1305:1: ( ( rule__Object__NameAssignment_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1306:1: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1307:1: ( rule__Object__NameAssignment_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1307:2: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl2584);
            rule__Object__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1317:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1321:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1322:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__22614);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__3_in_rule__Object__Group__22617);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1329:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1333:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1334:1: ( ( rule__Object__Group_2__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1334:1: ( ( rule__Object__Group_2__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1335:1: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1336:1: ( rule__Object__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1336:2: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Object__Group_2__0_in_rule__Object__Group__2__Impl2644);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1346:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1350:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1351:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__32675);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__4_in_rule__Object__Group__32678);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1358:1: rule__Object__Group__3__Impl : ( '{' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1362:1: ( ( '{' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1363:1: ( '{' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1363:1: ( '{' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1364:1: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Object__Group__3__Impl2706); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1377:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1381:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1382:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_rule__Object__Group__4__Impl_in_rule__Object__Group__42737);
            rule__Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__5_in_rule__Object__Group__42740);
            rule__Object__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1389:1: rule__Object__Group__4__Impl : ( ( rule__Object__Group_4__0 )* ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1393:1: ( ( ( rule__Object__Group_4__0 )* ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1394:1: ( ( rule__Object__Group_4__0 )* )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1394:1: ( ( rule__Object__Group_4__0 )* )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1395:1: ( rule__Object__Group_4__0 )*
            {
             before(grammarAccess.getObjectAccess().getGroup_4()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1396:1: ( rule__Object__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1396:2: rule__Object__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Object__Group_4__0_in_rule__Object__Group__4__Impl2767);
            	    rule__Object__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1406:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1410:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1411:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_rule__Object__Group__5__Impl_in_rule__Object__Group__52798);
            rule__Object__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group__6_in_rule__Object__Group__52801);
            rule__Object__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1418:1: rule__Object__Group__5__Impl : ( ( rule__Object__IssecureAssignment_5 )? ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1422:1: ( ( ( rule__Object__IssecureAssignment_5 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1423:1: ( ( rule__Object__IssecureAssignment_5 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1423:1: ( ( rule__Object__IssecureAssignment_5 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1424:1: ( rule__Object__IssecureAssignment_5 )?
            {
             before(grammarAccess.getObjectAccess().getIssecureAssignment_5()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1425:1: ( rule__Object__IssecureAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1425:2: rule__Object__IssecureAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Object__IssecureAssignment_5_in_rule__Object__Group__5__Impl2828);
                    rule__Object__IssecureAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getIssecureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1435:1: rule__Object__Group__6 : rule__Object__Group__6__Impl ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1439:1: ( rule__Object__Group__6__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1440:2: rule__Object__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__6__Impl_in_rule__Object__Group__62859);
            rule__Object__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1446:1: rule__Object__Group__6__Impl : ( '}' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1450:1: ( ( '}' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1451:1: ( '}' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1451:1: ( '}' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1452:1: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Object__Group__6__Impl2887); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1479:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1483:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1484:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_rule__Object__Group_2__0__Impl_in_rule__Object__Group_2__02932);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_2__1_in_rule__Object__Group_2__02935);
            rule__Object__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1491:1: rule__Object__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1495:1: ( ( 'extends' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1496:1: ( 'extends' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1496:1: ( 'extends' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1497:1: 'extends'
            {
             before(grammarAccess.getObjectAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Object__Group_2__0__Impl2963); 
             after(grammarAccess.getObjectAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1510:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1514:1: ( rule__Object__Group_2__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1515:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_2__1__Impl_in_rule__Object__Group_2__12994);
            rule__Object__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1521:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1525:1: ( ( ( rule__Object__SuperTypeAssignment_2_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1526:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1526:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1527:1: ( rule__Object__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1528:1: ( rule__Object__SuperTypeAssignment_2_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1528:2: rule__Object__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Object__SuperTypeAssignment_2_1_in_rule__Object__Group_2__1__Impl3021);
            rule__Object__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Object__Group_4__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1542:1: rule__Object__Group_4__0 : rule__Object__Group_4__0__Impl rule__Object__Group_4__1 ;
    public final void rule__Object__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1546:1: ( rule__Object__Group_4__0__Impl rule__Object__Group_4__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1547:2: rule__Object__Group_4__0__Impl rule__Object__Group_4__1
            {
            pushFollow(FOLLOW_rule__Object__Group_4__0__Impl_in_rule__Object__Group_4__03055);
            rule__Object__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_4__1_in_rule__Object__Group_4__03058);
            rule__Object__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__0"


    // $ANTLR start "rule__Object__Group_4__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1554:1: rule__Object__Group_4__0__Impl : ( ( rule__Object__MembersAssignment_4_0 ) ) ;
    public final void rule__Object__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1558:1: ( ( ( rule__Object__MembersAssignment_4_0 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1559:1: ( ( rule__Object__MembersAssignment_4_0 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1559:1: ( ( rule__Object__MembersAssignment_4_0 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1560:1: ( rule__Object__MembersAssignment_4_0 )
            {
             before(grammarAccess.getObjectAccess().getMembersAssignment_4_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1561:1: ( rule__Object__MembersAssignment_4_0 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1561:2: rule__Object__MembersAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Object__MembersAssignment_4_0_in_rule__Object__Group_4__0__Impl3085);
            rule__Object__MembersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getMembersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__0__Impl"


    // $ANTLR start "rule__Object__Group_4__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1571:1: rule__Object__Group_4__1 : rule__Object__Group_4__1__Impl ;
    public final void rule__Object__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1575:1: ( rule__Object__Group_4__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1576:2: rule__Object__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_4__1__Impl_in_rule__Object__Group_4__13115);
            rule__Object__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__1"


    // $ANTLR start "rule__Object__Group_4__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1582:1: rule__Object__Group_4__1__Impl : ( ( rule__Object__Group_4_1__0 )? ) ;
    public final void rule__Object__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1586:1: ( ( ( rule__Object__Group_4_1__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1587:1: ( ( rule__Object__Group_4_1__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1587:1: ( ( rule__Object__Group_4_1__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1588:1: ( rule__Object__Group_4_1__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_4_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1589:1: ( rule__Object__Group_4_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1589:2: rule__Object__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Object__Group_4_1__0_in_rule__Object__Group_4__1__Impl3142);
                    rule__Object__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__1__Impl"


    // $ANTLR start "rule__Object__Group_4_1__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1603:1: rule__Object__Group_4_1__0 : rule__Object__Group_4_1__0__Impl rule__Object__Group_4_1__1 ;
    public final void rule__Object__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1607:1: ( rule__Object__Group_4_1__0__Impl rule__Object__Group_4_1__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1608:2: rule__Object__Group_4_1__0__Impl rule__Object__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Object__Group_4_1__0__Impl_in_rule__Object__Group_4_1__03177);
            rule__Object__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_4_1__1_in_rule__Object__Group_4_1__03180);
            rule__Object__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__0"


    // $ANTLR start "rule__Object__Group_4_1__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1615:1: rule__Object__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__Object__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1619:1: ( ( '{' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1620:1: ( '{' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1620:1: ( '{' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1621:1: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Object__Group_4_1__0__Impl3208); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__0__Impl"


    // $ANTLR start "rule__Object__Group_4_1__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1634:1: rule__Object__Group_4_1__1 : rule__Object__Group_4_1__1__Impl rule__Object__Group_4_1__2 ;
    public final void rule__Object__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1638:1: ( rule__Object__Group_4_1__1__Impl rule__Object__Group_4_1__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1639:2: rule__Object__Group_4_1__1__Impl rule__Object__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__Object__Group_4_1__1__Impl_in_rule__Object__Group_4_1__13239);
            rule__Object__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Object__Group_4_1__2_in_rule__Object__Group_4_1__13242);
            rule__Object__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__1"


    // $ANTLR start "rule__Object__Group_4_1__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1646:1: rule__Object__Group_4_1__1__Impl : ( ( rule__Object__RestrictionsAssignment_4_1_1 ) ) ;
    public final void rule__Object__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1650:1: ( ( ( rule__Object__RestrictionsAssignment_4_1_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1651:1: ( ( rule__Object__RestrictionsAssignment_4_1_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1651:1: ( ( rule__Object__RestrictionsAssignment_4_1_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1652:1: ( rule__Object__RestrictionsAssignment_4_1_1 )
            {
             before(grammarAccess.getObjectAccess().getRestrictionsAssignment_4_1_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1653:1: ( rule__Object__RestrictionsAssignment_4_1_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1653:2: rule__Object__RestrictionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Object__RestrictionsAssignment_4_1_1_in_rule__Object__Group_4_1__1__Impl3269);
            rule__Object__RestrictionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getRestrictionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__1__Impl"


    // $ANTLR start "rule__Object__Group_4_1__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1663:1: rule__Object__Group_4_1__2 : rule__Object__Group_4_1__2__Impl ;
    public final void rule__Object__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1667:1: ( rule__Object__Group_4_1__2__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1668:2: rule__Object__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group_4_1__2__Impl_in_rule__Object__Group_4_1__23299);
            rule__Object__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__2"


    // $ANTLR start "rule__Object__Group_4_1__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1674:1: rule__Object__Group_4_1__2__Impl : ( '}' ) ;
    public final void rule__Object__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1678:1: ( ( '}' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1679:1: ( '}' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1679:1: ( '}' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1680:1: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4_1_2()); 
            match(input,13,FOLLOW_13_in_rule__Object__Group_4_1__2__Impl3327); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4_1__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1699:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1703:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1704:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03364);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03367);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1711:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1715:1: ( ( 'function' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1716:1: ( 'function' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1716:1: ( 'function' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1717:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Function__Group__0__Impl3395); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1730:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1734:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1735:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13426);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13429);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1742:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1746:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1747:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1747:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1748:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1749:1: ( rule__Function__NameAssignment_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1749:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl3456);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1759:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1763:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1764:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23486);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__23489);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1771:1: rule__Function__Group__2__Impl : ( ( rule__Function__Group_2__0 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1775:1: ( ( ( rule__Function__Group_2__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1776:1: ( ( rule__Function__Group_2__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1776:1: ( ( rule__Function__Group_2__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1777:1: ( rule__Function__Group_2__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_2()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1778:1: ( rule__Function__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1778:2: rule__Function__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl3516);
                    rule__Function__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1788:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1792:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1793:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__33547);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__33550);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1800:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1804:1: ( ( '{' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1805:1: ( '{' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1805:1: ( '{' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1806:1: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Function__Group__3__Impl3578); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1819:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1823:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1824:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__43609);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__43612);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1831:1: rule__Function__Group__4__Impl : ( 'id' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1835:1: ( ( 'id' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1836:1: ( 'id' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1836:1: ( 'id' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1837:1: 'id'
            {
             before(grammarAccess.getFunctionAccess().getIdKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Function__Group__4__Impl3640); 
             after(grammarAccess.getFunctionAccess().getIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1850:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1854:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1855:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__53671);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__53674);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1862:1: rule__Function__Group__5__Impl : ( ( rule__Function__IdentifierAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1866:1: ( ( ( rule__Function__IdentifierAssignment_5 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1867:1: ( ( rule__Function__IdentifierAssignment_5 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1867:1: ( ( rule__Function__IdentifierAssignment_5 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1868:1: ( rule__Function__IdentifierAssignment_5 )
            {
             before(grammarAccess.getFunctionAccess().getIdentifierAssignment_5()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1869:1: ( rule__Function__IdentifierAssignment_5 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1869:2: rule__Function__IdentifierAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__IdentifierAssignment_5_in_rule__Function__Group__5__Impl3701);
            rule__Function__IdentifierAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getIdentifierAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1879:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1883:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1884:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63731);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63734);
            rule__Function__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1891:1: rule__Function__Group__6__Impl : ( ( rule__Function__IssecureAssignment_6 )? ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1895:1: ( ( ( rule__Function__IssecureAssignment_6 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1896:1: ( ( rule__Function__IssecureAssignment_6 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1896:1: ( ( rule__Function__IssecureAssignment_6 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1897:1: ( rule__Function__IssecureAssignment_6 )?
            {
             before(grammarAccess.getFunctionAccess().getIssecureAssignment_6()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1898:1: ( rule__Function__IssecureAssignment_6 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1898:2: rule__Function__IssecureAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Function__IssecureAssignment_6_in_rule__Function__Group__6__Impl3761);
                    rule__Function__IssecureAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getIssecureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1908:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1912:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1913:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73792);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73795);
            rule__Function__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1920:1: rule__Function__Group__7__Impl : ( ( rule__Function__Group_7__0 )? ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1924:1: ( ( ( rule__Function__Group_7__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1925:1: ( ( rule__Function__Group_7__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1925:1: ( ( rule__Function__Group_7__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1926:1: ( rule__Function__Group_7__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_7()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1927:1: ( rule__Function__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1927:2: rule__Function__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3822);
                    rule__Function__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group__8"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1937:1: rule__Function__Group__8 : rule__Function__Group__8__Impl rule__Function__Group__9 ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1941:1: ( rule__Function__Group__8__Impl rule__Function__Group__9 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1942:2: rule__Function__Group__8__Impl rule__Function__Group__9
            {
            pushFollow(FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83853);
            rule__Function__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__9_in_rule__Function__Group__83856);
            rule__Function__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8"


    // $ANTLR start "rule__Function__Group__8__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1949:1: rule__Function__Group__8__Impl : ( ( rule__Function__Group_8__0 )? ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1953:1: ( ( ( rule__Function__Group_8__0 )? ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1954:1: ( ( rule__Function__Group_8__0 )? )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1954:1: ( ( rule__Function__Group_8__0 )? )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1955:1: ( rule__Function__Group_8__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_8()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1956:1: ( rule__Function__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1956:2: rule__Function__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_8__0_in_rule__Function__Group__8__Impl3883);
                    rule__Function__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8__Impl"


    // $ANTLR start "rule__Function__Group__9"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1966:1: rule__Function__Group__9 : rule__Function__Group__9__Impl ;
    public final void rule__Function__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1970:1: ( rule__Function__Group__9__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1971:2: rule__Function__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__9__Impl_in_rule__Function__Group__93914);
            rule__Function__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__9"


    // $ANTLR start "rule__Function__Group__9__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1977:1: rule__Function__Group__9__Impl : ( '}' ) ;
    public final void rule__Function__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1981:1: ( ( '}' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1982:1: ( '}' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1982:1: ( '}' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:1983:1: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_13_in_rule__Function__Group__9__Impl3942); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__9__Impl"


    // $ANTLR start "rule__Function__Group_2__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2016:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2020:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2021:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__03993);
            rule__Function__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__03996);
            rule__Function__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__0"


    // $ANTLR start "rule__Function__Group_2__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2028:1: rule__Function__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2032:1: ( ( 'extends' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2033:1: ( 'extends' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2033:1: ( 'extends' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2034:1: 'extends'
            {
             before(grammarAccess.getFunctionAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Function__Group_2__0__Impl4024); 
             after(grammarAccess.getFunctionAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__0__Impl"


    // $ANTLR start "rule__Function__Group_2__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2047:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2051:1: ( rule__Function__Group_2__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2052:2: rule__Function__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__14055);
            rule__Function__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__1"


    // $ANTLR start "rule__Function__Group_2__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2058:1: rule__Function__Group_2__1__Impl : ( ( rule__Function__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2062:1: ( ( ( rule__Function__SuperTypeAssignment_2_1 ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2063:1: ( ( rule__Function__SuperTypeAssignment_2_1 ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2063:1: ( ( rule__Function__SuperTypeAssignment_2_1 ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2064:1: ( rule__Function__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getFunctionAccess().getSuperTypeAssignment_2_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2065:1: ( rule__Function__SuperTypeAssignment_2_1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2065:2: rule__Function__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Function__SuperTypeAssignment_2_1_in_rule__Function__Group_2__1__Impl4082);
            rule__Function__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group_7__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2079:1: rule__Function__Group_7__0 : rule__Function__Group_7__0__Impl rule__Function__Group_7__1 ;
    public final void rule__Function__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2083:1: ( rule__Function__Group_7__0__Impl rule__Function__Group_7__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2084:2: rule__Function__Group_7__0__Impl rule__Function__Group_7__1
            {
            pushFollow(FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__04116);
            rule__Function__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__04119);
            rule__Function__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_7__0"


    // $ANTLR start "rule__Function__Group_7__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2091:1: rule__Function__Group_7__0__Impl : ( 'gets' ) ;
    public final void rule__Function__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2095:1: ( ( 'gets' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2096:1: ( 'gets' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2096:1: ( 'gets' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2097:1: 'gets'
            {
             before(grammarAccess.getFunctionAccess().getGetsKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Function__Group_7__0__Impl4147); 
             after(grammarAccess.getFunctionAccess().getGetsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_7__0__Impl"


    // $ANTLR start "rule__Function__Group_7__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2110:1: rule__Function__Group_7__1 : rule__Function__Group_7__1__Impl ;
    public final void rule__Function__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2114:1: ( rule__Function__Group_7__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2115:2: rule__Function__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__14178);
            rule__Function__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_7__1"


    // $ANTLR start "rule__Function__Group_7__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2121:1: rule__Function__Group_7__1__Impl : ( ( rule__Function__InputsAssignment_7_1 )* ) ;
    public final void rule__Function__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2125:1: ( ( ( rule__Function__InputsAssignment_7_1 )* ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2126:1: ( ( rule__Function__InputsAssignment_7_1 )* )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2126:1: ( ( rule__Function__InputsAssignment_7_1 )* )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2127:1: ( rule__Function__InputsAssignment_7_1 )*
            {
             before(grammarAccess.getFunctionAccess().getInputsAssignment_7_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2128:1: ( rule__Function__InputsAssignment_7_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=26 && LA20_0<=27)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2128:2: rule__Function__InputsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Function__InputsAssignment_7_1_in_rule__Function__Group_7__1__Impl4205);
            	    rule__Function__InputsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getInputsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_7__1__Impl"


    // $ANTLR start "rule__Function__Group_8__0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2142:1: rule__Function__Group_8__0 : rule__Function__Group_8__0__Impl rule__Function__Group_8__1 ;
    public final void rule__Function__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2146:1: ( rule__Function__Group_8__0__Impl rule__Function__Group_8__1 )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2147:2: rule__Function__Group_8__0__Impl rule__Function__Group_8__1
            {
            pushFollow(FOLLOW_rule__Function__Group_8__0__Impl_in_rule__Function__Group_8__04240);
            rule__Function__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_8__1_in_rule__Function__Group_8__04243);
            rule__Function__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_8__0"


    // $ANTLR start "rule__Function__Group_8__0__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2154:1: rule__Function__Group_8__0__Impl : ( 'returns' ) ;
    public final void rule__Function__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2158:1: ( ( 'returns' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2159:1: ( 'returns' )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2159:1: ( 'returns' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2160:1: 'returns'
            {
             before(grammarAccess.getFunctionAccess().getReturnsKeyword_8_0()); 
            match(input,25,FOLLOW_25_in_rule__Function__Group_8__0__Impl4271); 
             after(grammarAccess.getFunctionAccess().getReturnsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_8__0__Impl"


    // $ANTLR start "rule__Function__Group_8__1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2173:1: rule__Function__Group_8__1 : rule__Function__Group_8__1__Impl ;
    public final void rule__Function__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2177:1: ( rule__Function__Group_8__1__Impl )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2178:2: rule__Function__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_8__1__Impl_in_rule__Function__Group_8__14302);
            rule__Function__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_8__1"


    // $ANTLR start "rule__Function__Group_8__1__Impl"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2184:1: rule__Function__Group_8__1__Impl : ( ( rule__Function__OutpustAssignment_8_1 )* ) ;
    public final void rule__Function__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2188:1: ( ( ( rule__Function__OutpustAssignment_8_1 )* ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2189:1: ( ( rule__Function__OutpustAssignment_8_1 )* )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2189:1: ( ( rule__Function__OutpustAssignment_8_1 )* )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2190:1: ( rule__Function__OutpustAssignment_8_1 )*
            {
             before(grammarAccess.getFunctionAccess().getOutpustAssignment_8_1()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2191:1: ( rule__Function__OutpustAssignment_8_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=26 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2191:2: rule__Function__OutpustAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_rule__Function__OutpustAssignment_8_1_in_rule__Function__Group_8__1__Impl4329);
            	    rule__Function__OutpustAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getOutpustAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_8__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2206:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2210:1: ( ( ruleAbstractElement ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2211:1: ( ruleAbstractElement )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2211:1: ( ruleAbstractElement )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2212:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment4369);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__FunctionType__RepeatAssignment_0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2221:1: rule__FunctionType__RepeatAssignment_0 : ( ( 'repeat' ) ) ;
    public final void rule__FunctionType__RepeatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2225:1: ( ( ( 'repeat' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2226:1: ( ( 'repeat' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2226:1: ( ( 'repeat' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2227:1: ( 'repeat' )
            {
             before(grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2228:1: ( 'repeat' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2229:1: 'repeat'
            {
             before(grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__FunctionType__RepeatAssignment_04405); 
             after(grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0()); 

            }

             after(grammarAccess.getFunctionTypeAccess().getRepeatRepeatKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__RepeatAssignment_0"


    // $ANTLR start "rule__FunctionType__OptionalAssignment_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2244:1: rule__FunctionType__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__FunctionType__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2248:1: ( ( ( 'optional' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2249:1: ( ( 'optional' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2249:1: ( ( 'optional' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2250:1: ( 'optional' )
            {
             before(grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2251:1: ( 'optional' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2252:1: 'optional'
            {
             before(grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FunctionType__OptionalAssignment_14449); 
             after(grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getFunctionTypeAccess().getOptionalOptionalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__OptionalAssignment_1"


    // $ANTLR start "rule__FunctionType__TypeAssignment_2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2267:1: rule__FunctionType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2271:1: ( ( ( RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2272:1: ( ( RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2272:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2273:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionTypeAccess().getTypeTypeCrossReference_2_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2274:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2275:1: RULE_ID
            {
             before(grammarAccess.getFunctionTypeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionType__TypeAssignment_24492); 
             after(grammarAccess.getFunctionTypeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFunctionTypeAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__TypeAssignment_2"


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2286:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2290:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2291:1: ( RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2291:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2292:1: RULE_ID
            {
             before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_14527); 
             after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__NameAssignment_1"


    // $ANTLR start "rule__Datatype__TypeAssignment_2_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2301:1: rule__Datatype__TypeAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Datatype__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2305:1: ( ( RULE_STRING ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2306:1: ( RULE_STRING )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2306:1: ( RULE_STRING )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2307:1: RULE_STRING
            {
             before(grammarAccess.getDatatypeAccess().getTypeSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Datatype__TypeAssignment_2_14558); 
             after(grammarAccess.getDatatypeAccess().getTypeSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__TypeAssignment_2_1"


    // $ANTLR start "rule__Datatype__DefaultValueAssignment_2_2_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2316:1: rule__Datatype__DefaultValueAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__Datatype__DefaultValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2320:1: ( ( RULE_STRING ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2321:1: ( RULE_STRING )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2321:1: ( RULE_STRING )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2322:1: RULE_STRING
            {
             before(grammarAccess.getDatatypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Datatype__DefaultValueAssignment_2_2_14589); 
             after(grammarAccess.getDatatypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__DefaultValueAssignment_2_2_1"


    // $ANTLR start "rule__Datatype__RestrictionsAssignment_2_3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2331:1: rule__Datatype__RestrictionsAssignment_2_3 : ( ruleRestriction ) ;
    public final void rule__Datatype__RestrictionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2335:1: ( ( ruleRestriction ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2336:1: ( ruleRestriction )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2336:1: ( ruleRestriction )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2337:1: ruleRestriction
            {
             before(grammarAccess.getDatatypeAccess().getRestrictionsRestrictionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Datatype__RestrictionsAssignment_2_34620);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getRestrictionsRestrictionParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__RestrictionsAssignment_2_3"


    // $ANTLR start "rule__Restriction__StringrestrictionAssignment_0_0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2346:1: rule__Restriction__StringrestrictionAssignment_0_0 : ( ( 'stringrestriction' ) ) ;
    public final void rule__Restriction__StringrestrictionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2350:1: ( ( ( 'stringrestriction' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2351:1: ( ( 'stringrestriction' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2351:1: ( ( 'stringrestriction' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2352:1: ( 'stringrestriction' )
            {
             before(grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2353:1: ( 'stringrestriction' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2354:1: 'stringrestriction'
            {
             before(grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Restriction__StringrestrictionAssignment_0_04656); 
             after(grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0()); 

            }

             after(grammarAccess.getRestrictionAccess().getStringrestrictionStringrestrictionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__StringrestrictionAssignment_0_0"


    // $ANTLR start "rule__Restriction__MaxlengthAssignment_0_1_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2369:1: rule__Restriction__MaxlengthAssignment_0_1_1 : ( RULE_INT ) ;
    public final void rule__Restriction__MaxlengthAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2373:1: ( ( RULE_INT ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2374:1: ( RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2374:1: ( RULE_INT )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2375:1: RULE_INT
            {
             before(grammarAccess.getRestrictionAccess().getMaxlengthINTTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Restriction__MaxlengthAssignment_0_1_14695); 
             after(grammarAccess.getRestrictionAccess().getMaxlengthINTTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__MaxlengthAssignment_0_1_1"


    // $ANTLR start "rule__Restriction__MinlengthAssignment_0_3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2384:1: rule__Restriction__MinlengthAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__Restriction__MinlengthAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2388:1: ( ( RULE_INT ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2389:1: ( RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2389:1: ( RULE_INT )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2390:1: RULE_INT
            {
             before(grammarAccess.getRestrictionAccess().getMinlengthINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Restriction__MinlengthAssignment_0_34726); 
             after(grammarAccess.getRestrictionAccess().getMinlengthINTTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__MinlengthAssignment_0_3"


    // $ANTLR start "rule__Restriction__ValuerestrictionAssignment_1_0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2399:1: rule__Restriction__ValuerestrictionAssignment_1_0 : ( ( 'valuerestricion' ) ) ;
    public final void rule__Restriction__ValuerestrictionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2403:1: ( ( ( 'valuerestricion' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2404:1: ( ( 'valuerestricion' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2404:1: ( ( 'valuerestricion' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2405:1: ( 'valuerestricion' )
            {
             before(grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2406:1: ( 'valuerestricion' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2407:1: 'valuerestricion'
            {
             before(grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Restriction__ValuerestrictionAssignment_1_04762); 
             after(grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0()); 

            }

             after(grammarAccess.getRestrictionAccess().getValuerestrictionValuerestricionKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__ValuerestrictionAssignment_1_0"


    // $ANTLR start "rule__Restriction__MaxvalueAssignment_1_1_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2422:1: rule__Restriction__MaxvalueAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__Restriction__MaxvalueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2426:1: ( ( RULE_INT ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2427:1: ( RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2427:1: ( RULE_INT )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2428:1: RULE_INT
            {
             before(grammarAccess.getRestrictionAccess().getMaxvalueINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Restriction__MaxvalueAssignment_1_1_14801); 
             after(grammarAccess.getRestrictionAccess().getMaxvalueINTTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__MaxvalueAssignment_1_1_1"


    // $ANTLR start "rule__Restriction__MinvalueAssignment_1_3"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2437:1: rule__Restriction__MinvalueAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Restriction__MinvalueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2441:1: ( ( RULE_INT ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2442:1: ( RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2442:1: ( RULE_INT )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2443:1: RULE_INT
            {
             before(grammarAccess.getRestrictionAccess().getMinvalueINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Restriction__MinvalueAssignment_1_34832); 
             after(grammarAccess.getRestrictionAccess().getMinvalueINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__MinvalueAssignment_1_3"


    // $ANTLR start "rule__Member__NameAssignment_0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2452:1: rule__Member__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2456:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2457:1: ( RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2457:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2458:1: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__NameAssignment_04863); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_0"


    // $ANTLR start "rule__Member__TypeAssignment_2"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2467:1: rule__Member__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Member__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2471:1: ( ( ( RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2472:1: ( ( RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2472:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2473:1: ( RULE_ID )
            {
             before(grammarAccess.getMemberAccess().getTypeTypeCrossReference_2_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2474:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2475:1: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__TypeAssignment_24898); 
             after(grammarAccess.getMemberAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__TypeAssignment_2"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2486:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2490:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2491:1: ( RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2491:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2492:1: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Object__NameAssignment_14933); 
             after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Object__SuperTypeAssignment_2_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2501:1: rule__Object__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Object__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2505:1: ( ( ( RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2506:1: ( ( RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2506:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2507:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2508:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2509:1: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Object__SuperTypeAssignment_2_14968); 
             after(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Object__MembersAssignment_4_0"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2520:1: rule__Object__MembersAssignment_4_0 : ( ruleMember ) ;
    public final void rule__Object__MembersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2524:1: ( ( ruleMember ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2525:1: ( ruleMember )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2525:1: ( ruleMember )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2526:1: ruleMember
            {
             before(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Object__MembersAssignment_4_05003);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__MembersAssignment_4_0"


    // $ANTLR start "rule__Object__RestrictionsAssignment_4_1_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2535:1: rule__Object__RestrictionsAssignment_4_1_1 : ( ruleRestriction ) ;
    public final void rule__Object__RestrictionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2539:1: ( ( ruleRestriction ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2540:1: ( ruleRestriction )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2540:1: ( ruleRestriction )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2541:1: ruleRestriction
            {
             before(grammarAccess.getObjectAccess().getRestrictionsRestrictionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Object__RestrictionsAssignment_4_1_15034);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getRestrictionsRestrictionParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__RestrictionsAssignment_4_1_1"


    // $ANTLR start "rule__Object__IssecureAssignment_5"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2550:1: rule__Object__IssecureAssignment_5 : ( ( 'issecure' ) ) ;
    public final void rule__Object__IssecureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2554:1: ( ( ( 'issecure' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2555:1: ( ( 'issecure' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2555:1: ( ( 'issecure' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2556:1: ( 'issecure' )
            {
             before(grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2557:1: ( 'issecure' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2558:1: 'issecure'
            {
             before(grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__Object__IssecureAssignment_55070); 
             after(grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0()); 

            }

             after(grammarAccess.getObjectAccess().getIssecureIssecureKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__IssecureAssignment_5"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2573:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2577:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2578:1: ( RULE_ID )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2578:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2579:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15109); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__SuperTypeAssignment_2_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2588:1: rule__Function__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Function__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2592:1: ( ( ( RULE_ID ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2593:1: ( ( RULE_ID ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2593:1: ( ( RULE_ID ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2594:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getSuperTypeObjectCrossReference_2_1_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2595:1: ( RULE_ID )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2596:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__SuperTypeAssignment_2_15144); 
             after(grammarAccess.getFunctionAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getSuperTypeObjectCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Function__IdentifierAssignment_5"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2607:1: rule__Function__IdentifierAssignment_5 : ( RULE_INT ) ;
    public final void rule__Function__IdentifierAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2611:1: ( ( RULE_INT ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2612:1: ( RULE_INT )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2612:1: ( RULE_INT )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2613:1: RULE_INT
            {
             before(grammarAccess.getFunctionAccess().getIdentifierINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Function__IdentifierAssignment_55179); 
             after(grammarAccess.getFunctionAccess().getIdentifierINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__IdentifierAssignment_5"


    // $ANTLR start "rule__Function__IssecureAssignment_6"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2622:1: rule__Function__IssecureAssignment_6 : ( ( 'issecure' ) ) ;
    public final void rule__Function__IssecureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2626:1: ( ( ( 'issecure' ) ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2627:1: ( ( 'issecure' ) )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2627:1: ( ( 'issecure' ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2628:1: ( 'issecure' )
            {
             before(grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0()); 
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2629:1: ( 'issecure' )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2630:1: 'issecure'
            {
             before(grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0()); 
            match(input,30,FOLLOW_30_in_rule__Function__IssecureAssignment_65215); 
             after(grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0()); 

            }

             after(grammarAccess.getFunctionAccess().getIssecureIssecureKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__IssecureAssignment_6"


    // $ANTLR start "rule__Function__InputsAssignment_7_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2645:1: rule__Function__InputsAssignment_7_1 : ( ruleFunctionType ) ;
    public final void rule__Function__InputsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2649:1: ( ( ruleFunctionType ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2650:1: ( ruleFunctionType )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2650:1: ( ruleFunctionType )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2651:1: ruleFunctionType
            {
             before(grammarAccess.getFunctionAccess().getInputsFunctionTypeParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleFunctionType_in_rule__Function__InputsAssignment_7_15254);
            ruleFunctionType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getInputsFunctionTypeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__InputsAssignment_7_1"


    // $ANTLR start "rule__Function__OutpustAssignment_8_1"
    // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2660:1: rule__Function__OutpustAssignment_8_1 : ( ruleFunctionType ) ;
    public final void rule__Function__OutpustAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2664:1: ( ( ruleFunctionType ) )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2665:1: ( ruleFunctionType )
            {
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2665:1: ( ruleFunctionType )
            // ../at.tugraz.xtext.metamodel.ui/src-gen/at/tugraz/xtext/metamodel/ui/contentassist/antlr/internal/InternalMetamodel.g:2666:1: ruleFunctionType
            {
             before(grammarAccess.getFunctionAccess().getOutpustFunctionTypeParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleFunctionType_in_rule__Function__OutpustAssignment_8_15285);
            ruleFunctionType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutpustFunctionTypeParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__OutpustAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94 = new BitSet(new long[]{0x0000000000500802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_entryRuleFunctionType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__0_in_ruleFunctionType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0_in_ruleDatatype335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Alternatives_in_ruleRestriction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0_in_ruleMember455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__AbstractElement__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Type__Alternatives660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Type__Alternatives677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__0_in_rule__Restriction__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__0_in_rule__Restriction__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__0__Impl_in_rule__FunctionType__Group__0758 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__1_in_rule__FunctionType__Group__0761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__RepeatAssignment_0_in_rule__FunctionType__Group__0__Impl788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__1__Impl_in_rule__FunctionType__Group__1819 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__2_in_rule__FunctionType__Group__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__OptionalAssignment_1_in_rule__FunctionType__Group__1__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__Group__2__Impl_in_rule__FunctionType__Group__2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionType__TypeAssignment_2_in_rule__FunctionType__Group__2__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__0943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__0946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Datatype__Group__0__Impl974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__11005 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__NameAssignment_1_in_rule__Datatype__Group__1__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__21065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__0_in_rule__Datatype__Group__2__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__0__Impl_in_rule__Datatype__Group_2__01129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__1_in_rule__Datatype__Group_2__01132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Datatype__Group_2__0__Impl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__1__Impl_in_rule__Datatype__Group_2__11191 = new BitSet(new long[]{0x0000000030006000L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__2_in_rule__Datatype__Group_2__11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__TypeAssignment_2_1_in_rule__Datatype__Group_2__1__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__2__Impl_in_rule__Datatype__Group_2__21251 = new BitSet(new long[]{0x0000000030006000L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__3_in_rule__Datatype__Group_2__21254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2_2__0_in_rule__Datatype__Group_2__2__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__3__Impl_in_rule__Datatype__Group_2__31312 = new BitSet(new long[]{0x0000000030006000L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__4_in_rule__Datatype__Group_2__31315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__RestrictionsAssignment_2_3_in_rule__Datatype__Group_2__3__Impl1342 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2__4__Impl_in_rule__Datatype__Group_2__41373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Datatype__Group_2__4__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2_2__0__Impl_in_rule__Datatype__Group_2_2__01442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2_2__1_in_rule__Datatype__Group_2_2__01445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Datatype__Group_2_2__0__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group_2_2__1__Impl_in_rule__Datatype__Group_2_2__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__DefaultValueAssignment_2_2_1_in_rule__Datatype__Group_2_2__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__0__Impl_in_rule__Restriction__Group_0__01565 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__1_in_rule__Restriction__Group_0__01568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__StringrestrictionAssignment_0_0_in_rule__Restriction__Group_0__0__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__1__Impl_in_rule__Restriction__Group_0__11625 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__2_in_rule__Restriction__Group_0__11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0_1__0_in_rule__Restriction__Group_0__1__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__2__Impl_in_rule__Restriction__Group_0__21686 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__3_in_rule__Restriction__Group_0__21689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Restriction__Group_0__2__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0__3__Impl_in_rule__Restriction__Group_0__31748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__MinlengthAssignment_0_3_in_rule__Restriction__Group_0__3__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0_1__0__Impl_in_rule__Restriction__Group_0_1__01813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0_1__1_in_rule__Restriction__Group_0_1__01816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Restriction__Group_0_1__0__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_0_1__1__Impl_in_rule__Restriction__Group_0_1__11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__MaxlengthAssignment_0_1_1_in_rule__Restriction__Group_0_1__1__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__0__Impl_in_rule__Restriction__Group_1__01936 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__1_in_rule__Restriction__Group_1__01939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ValuerestrictionAssignment_1_0_in_rule__Restriction__Group_1__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__1__Impl_in_rule__Restriction__Group_1__11996 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__2_in_rule__Restriction__Group_1__11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1_1__0_in_rule__Restriction__Group_1__1__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__2__Impl_in_rule__Restriction__Group_1__22057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__3_in_rule__Restriction__Group_1__22060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Restriction__Group_1__2__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1__3__Impl_in_rule__Restriction__Group_1__32119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__MinvalueAssignment_1_3_in_rule__Restriction__Group_1__3__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1_1__0__Impl_in_rule__Restriction__Group_1_1__02184 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1_1__1_in_rule__Restriction__Group_1_1__02187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Restriction__Group_1_1__0__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_1_1__1__Impl_in_rule__Restriction__Group_1_1__12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__MaxvalueAssignment_1_1_1_in_rule__Restriction__Group_1_1__1__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__02307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Member__Group__1_in_rule__Member__Group__02310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__12367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Member__Group__2_in_rule__Member__Group__12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Member__Group__1__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__22429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__02492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__02495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Object__Group__0__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__12554 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__22614 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Object__Group__3_in_rule__Object__Group__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__0_in_rule__Object__Group__2__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__32675 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_rule__Object__Group__4_in_rule__Object__Group__32678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Object__Group__3__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__4__Impl_in_rule__Object__Group__42737 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_rule__Object__Group__5_in_rule__Object__Group__42740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4__0_in_rule__Object__Group__4__Impl2767 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Object__Group__5__Impl_in_rule__Object__Group__52798 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_rule__Object__Group__6_in_rule__Object__Group__52801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__IssecureAssignment_5_in_rule__Object__Group__5__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__6__Impl_in_rule__Object__Group__62859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Object__Group__6__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__0__Impl_in_rule__Object__Group_2__02932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Object__Group_2__1_in_rule__Object__Group_2__02935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Object__Group_2__0__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_2__1__Impl_in_rule__Object__Group_2__12994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__SuperTypeAssignment_2_1_in_rule__Object__Group_2__1__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4__0__Impl_in_rule__Object__Group_4__03055 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Object__Group_4__1_in_rule__Object__Group_4__03058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__MembersAssignment_4_0_in_rule__Object__Group_4__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4__1__Impl_in_rule__Object__Group_4__13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__0_in_rule__Object__Group_4__1__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__0__Impl_in_rule__Object__Group_4_1__03177 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__1_in_rule__Object__Group_4_1__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Object__Group_4_1__0__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__1__Impl_in_rule__Object__Group_4_1__13239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__2_in_rule__Object__Group_4_1__13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__RestrictionsAssignment_4_1_1_in_rule__Object__Group_4_1__1__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group_4_1__2__Impl_in_rule__Object__Group_4_1__23299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Object__Group_4_1__2__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Function__Group__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13426 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23486 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__23489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__33547 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__33550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Function__Group__3__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__43609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__43612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Function__Group__4__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__53671 = new BitSet(new long[]{0x0000000043002000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__53674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__IdentifierAssignment_5_in_rule__Function__Group__5__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__63731 = new BitSet(new long[]{0x0000000043002000L});
    public static final BitSet FOLLOW_rule__Function__Group__7_in_rule__Function__Group__63734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__IssecureAssignment_6_in_rule__Function__Group__6__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__7__Impl_in_rule__Function__Group__73792 = new BitSet(new long[]{0x0000000043002000L});
    public static final BitSet FOLLOW_rule__Function__Group__8_in_rule__Function__Group__73795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0_in_rule__Function__Group__7__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__8__Impl_in_rule__Function__Group__83853 = new BitSet(new long[]{0x0000000043002000L});
    public static final BitSet FOLLOW_rule__Function__Group__9_in_rule__Function__Group__83856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_8__0_in_rule__Function__Group__8__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__9__Impl_in_rule__Function__Group__93914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Function__Group__9__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__03993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Function__Group_2__0__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__SuperTypeAssignment_2_1_in_rule__Function__Group_2__1__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__0__Impl_in_rule__Function__Group_7__04116 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1_in_rule__Function__Group_7__04119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Function__Group_7__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_7__1__Impl_in_rule__Function__Group_7__14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__InputsAssignment_7_1_in_rule__Function__Group_7__1__Impl4205 = new BitSet(new long[]{0x000000000C000012L});
    public static final BitSet FOLLOW_rule__Function__Group_8__0__Impl_in_rule__Function__Group_8__04240 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_rule__Function__Group_8__1_in_rule__Function__Group_8__04243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Function__Group_8__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_8__1__Impl_in_rule__Function__Group_8__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OutpustAssignment_8_1_in_rule__Function__Group_8__1__Impl4329 = new BitSet(new long[]{0x000000000C000012L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionType__RepeatAssignment_04405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionType__OptionalAssignment_14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionType__TypeAssignment_24492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_14527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Datatype__TypeAssignment_2_14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Datatype__DefaultValueAssignment_2_2_14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Datatype__RestrictionsAssignment_2_34620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Restriction__StringrestrictionAssignment_0_04656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Restriction__MaxlengthAssignment_0_1_14695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Restriction__MinlengthAssignment_0_34726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Restriction__ValuerestrictionAssignment_1_04762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Restriction__MaxvalueAssignment_1_1_14801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Restriction__MinvalueAssignment_1_34832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__NameAssignment_04863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__TypeAssignment_24898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Object__NameAssignment_14933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Object__SuperTypeAssignment_2_14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Object__MembersAssignment_4_05003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Object__RestrictionsAssignment_4_1_15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Object__IssecureAssignment_55070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__SuperTypeAssignment_2_15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Function__IdentifierAssignment_55179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Function__IssecureAssignment_65215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_rule__Function__InputsAssignment_7_15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_rule__Function__OutpustAssignment_8_15285 = new BitSet(new long[]{0x0000000000000002L});

}