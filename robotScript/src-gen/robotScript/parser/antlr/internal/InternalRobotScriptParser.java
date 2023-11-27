package robotScript.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import robotScript.services.RobotScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EntryPoint'", "'{'", "'functions'", "','", "'}'", "'FunctionDef'", "'returnType'", "'body'", "'inputs'", "'VarDecl'", "'type'", "'VoidType'", "'NumberType'", "'BooleanType'", "'Loop'", "'cond'", "'If'", "'IfElse'", "'bodyElse'", "'AssignAtDecl'", "'expression'", "'vardecl'", "'ReAssign'", "'var'", "'SetSpeed'", "'unit'", "'speedstate'", "'Rotation'", "'Front'", "'Back'", "'Right'", "'Left'", "'FunCall'", "'fun'", "'Neg'", "'op'", "'Not'", "'Greater'", "'rightOp'", "'leftOp'", "'And'", "'Add'", "'Less'", "'Or'", "'Sub'", "'GEq'", "'Equ'", "'Mul'", "'LEq'", "'NEq'", "'Div'", "'TimeSensor'", "'DistSensor'", "'BoolLiteral'", "'NumberLiteral'", "'SpeedState'", "'Variable'", "'M'", "'DM'", "'CM'", "'MM'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRobotScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobotScript.g"; }



     	private RobotScriptGrammarAccess grammarAccess;

        public InternalRobotScriptParser(TokenStream input, RobotScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntryPoint";
       	}

       	@Override
       	protected RobotScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntryPoint"
    // InternalRobotScript.g:65:1: entryRuleEntryPoint returns [EObject current=null] : iv_ruleEntryPoint= ruleEntryPoint EOF ;
    public final EObject entryRuleEntryPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPoint = null;


        try {
            // InternalRobotScript.g:65:51: (iv_ruleEntryPoint= ruleEntryPoint EOF )
            // InternalRobotScript.g:66:2: iv_ruleEntryPoint= ruleEntryPoint EOF
            {
             newCompositeNode(grammarAccess.getEntryPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntryPoint=ruleEntryPoint();

            state._fsp--;

             current =iv_ruleEntryPoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntryPoint"


    // $ANTLR start "ruleEntryPoint"
    // InternalRobotScript.g:72:1: ruleEntryPoint returns [EObject current=null] : ( () otherlv_1= 'EntryPoint' otherlv_2= '{' (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleEntryPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_functions_5_0 = null;

        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:78:2: ( ( () otherlv_1= 'EntryPoint' otherlv_2= '{' (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRobotScript.g:79:2: ( () otherlv_1= 'EntryPoint' otherlv_2= '{' (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRobotScript.g:79:2: ( () otherlv_1= 'EntryPoint' otherlv_2= '{' (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRobotScript.g:80:3: () otherlv_1= 'EntryPoint' otherlv_2= '{' (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRobotScript.g:80:3: ()
            // InternalRobotScript.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntryPointAccess().getEntryPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntryPointAccess().getEntryPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:95:3: (otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotScript.g:96:4: otherlv_3= 'functions' otherlv_4= '{' ( (lv_functions_5_0= ruleFunctionDef ) ) (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntryPointAccess().getFunctionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntryPointAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRobotScript.g:104:4: ( (lv_functions_5_0= ruleFunctionDef ) )
                    // InternalRobotScript.g:105:5: (lv_functions_5_0= ruleFunctionDef )
                    {
                    // InternalRobotScript.g:105:5: (lv_functions_5_0= ruleFunctionDef )
                    // InternalRobotScript.g:106:6: lv_functions_5_0= ruleFunctionDef
                    {

                    						newCompositeNode(grammarAccess.getEntryPointAccess().getFunctionsFunctionDefParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_functions_5_0=ruleFunctionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryPointRule());
                    						}
                    						add(
                    							current,
                    							"functions",
                    							lv_functions_5_0,
                    							"robotScript.RobotScript.FunctionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:123:4: (otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobotScript.g:124:5: otherlv_6= ',' ( (lv_functions_7_0= ruleFunctionDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntryPointAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRobotScript.g:128:5: ( (lv_functions_7_0= ruleFunctionDef ) )
                    	    // InternalRobotScript.g:129:6: (lv_functions_7_0= ruleFunctionDef )
                    	    {
                    	    // InternalRobotScript.g:129:6: (lv_functions_7_0= ruleFunctionDef )
                    	    // InternalRobotScript.g:130:7: lv_functions_7_0= ruleFunctionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntryPointAccess().getFunctionsFunctionDefParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_functions_7_0=ruleFunctionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntryPointRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"functions",
                    	    								lv_functions_7_0,
                    	    								"robotScript.RobotScript.FunctionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntryPointAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntryPointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntryPoint"


    // $ANTLR start "entryRuleAnyType"
    // InternalRobotScript.g:161:1: entryRuleAnyType returns [EObject current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final EObject entryRuleAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyType = null;


        try {
            // InternalRobotScript.g:161:48: (iv_ruleAnyType= ruleAnyType EOF )
            // InternalRobotScript.g:162:2: iv_ruleAnyType= ruleAnyType EOF
            {
             newCompositeNode(grammarAccess.getAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyType=ruleAnyType();

            state._fsp--;

             current =iv_ruleAnyType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnyType"


    // $ANTLR start "ruleAnyType"
    // InternalRobotScript.g:168:1: ruleAnyType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_NumberType_1= ruleNumberType | this_BooleanType_2= ruleBooleanType ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_NumberType_1 = null;

        EObject this_BooleanType_2 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:174:2: ( (this_VoidType_0= ruleVoidType | this_NumberType_1= ruleNumberType | this_BooleanType_2= ruleBooleanType ) )
            // InternalRobotScript.g:175:2: (this_VoidType_0= ruleVoidType | this_NumberType_1= ruleNumberType | this_BooleanType_2= ruleBooleanType )
            {
            // InternalRobotScript.g:175:2: (this_VoidType_0= ruleVoidType | this_NumberType_1= ruleNumberType | this_BooleanType_2= ruleBooleanType )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobotScript.g:176:3: this_VoidType_0= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getAnyTypeAccess().getVoidTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;


                    			current = this_VoidType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:185:3: this_NumberType_1= ruleNumberType
                    {

                    			newCompositeNode(grammarAccess.getAnyTypeAccess().getNumberTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberType_1=ruleNumberType();

                    state._fsp--;


                    			current = this_NumberType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:194:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getAnyTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
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
    // $ANTLR end "ruleAnyType"


    // $ANTLR start "entryRuleCommand"
    // InternalRobotScript.g:206:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRobotScript.g:206:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRobotScript.g:207:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalRobotScript.g:213:1: ruleCommand returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_Loop_1= ruleLoop | this_If_Impl_2= ruleIf_Impl | this_IfElse_3= ruleIfElse | this_AssignAtDecl_4= ruleAssignAtDecl | this_ReAssign_5= ruleReAssign | this_SetSpeed_6= ruleSetSpeed | this_Rotation_7= ruleRotation | this_Front_8= ruleFront | this_Back_9= ruleBack | this_Right_10= ruleRight | this_Left_11= ruleLeft | this_FunCall_12= ruleFunCall ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_Loop_1 = null;

        EObject this_If_Impl_2 = null;

        EObject this_IfElse_3 = null;

        EObject this_AssignAtDecl_4 = null;

        EObject this_ReAssign_5 = null;

        EObject this_SetSpeed_6 = null;

        EObject this_Rotation_7 = null;

        EObject this_Front_8 = null;

        EObject this_Back_9 = null;

        EObject this_Right_10 = null;

        EObject this_Left_11 = null;

        EObject this_FunCall_12 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:219:2: ( (this_VarDecl_0= ruleVarDecl | this_Loop_1= ruleLoop | this_If_Impl_2= ruleIf_Impl | this_IfElse_3= ruleIfElse | this_AssignAtDecl_4= ruleAssignAtDecl | this_ReAssign_5= ruleReAssign | this_SetSpeed_6= ruleSetSpeed | this_Rotation_7= ruleRotation | this_Front_8= ruleFront | this_Back_9= ruleBack | this_Right_10= ruleRight | this_Left_11= ruleLeft | this_FunCall_12= ruleFunCall ) )
            // InternalRobotScript.g:220:2: (this_VarDecl_0= ruleVarDecl | this_Loop_1= ruleLoop | this_If_Impl_2= ruleIf_Impl | this_IfElse_3= ruleIfElse | this_AssignAtDecl_4= ruleAssignAtDecl | this_ReAssign_5= ruleReAssign | this_SetSpeed_6= ruleSetSpeed | this_Rotation_7= ruleRotation | this_Front_8= ruleFront | this_Back_9= ruleBack | this_Right_10= ruleRight | this_Left_11= ruleLeft | this_FunCall_12= ruleFunCall )
            {
            // InternalRobotScript.g:220:2: (this_VarDecl_0= ruleVarDecl | this_Loop_1= ruleLoop | this_If_Impl_2= ruleIf_Impl | this_IfElse_3= ruleIfElse | this_AssignAtDecl_4= ruleAssignAtDecl | this_ReAssign_5= ruleReAssign | this_SetSpeed_6= ruleSetSpeed | this_Rotation_7= ruleRotation | this_Front_8= ruleFront | this_Back_9= ruleBack | this_Right_10= ruleRight | this_Left_11= ruleLeft | this_FunCall_12= ruleFunCall )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            case 33:
                {
                alt4=6;
                }
                break;
            case 35:
                {
                alt4=7;
                }
                break;
            case 38:
                {
                alt4=8;
                }
                break;
            case 39:
                {
                alt4=9;
                }
                break;
            case 40:
                {
                alt4=10;
                }
                break;
            case 41:
                {
                alt4=11;
                }
                break;
            case 42:
                {
                alt4=12;
                }
                break;
            case 43:
                {
                alt4=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRobotScript.g:221:3: this_VarDecl_0= ruleVarDecl
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVarDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;


                    			current = this_VarDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:230:3: this_Loop_1= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_1=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:239:3: this_If_Impl_2= ruleIf_Impl
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIf_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_Impl_2=ruleIf_Impl();

                    state._fsp--;


                    			current = this_If_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:248:3: this_IfElse_3= ruleIfElse
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIfElseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElse_3=ruleIfElse();

                    state._fsp--;


                    			current = this_IfElse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:257:3: this_AssignAtDecl_4= ruleAssignAtDecl
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAssignAtDeclParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignAtDecl_4=ruleAssignAtDecl();

                    state._fsp--;


                    			current = this_AssignAtDecl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:266:3: this_ReAssign_5= ruleReAssign
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getReAssignParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReAssign_5=ruleReAssign();

                    state._fsp--;


                    			current = this_ReAssign_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:275:3: this_SetSpeed_6= ruleSetSpeed
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSetSpeedParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetSpeed_6=ruleSetSpeed();

                    state._fsp--;


                    			current = this_SetSpeed_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:284:3: this_Rotation_7= ruleRotation
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotation_7=ruleRotation();

                    state._fsp--;


                    			current = this_Rotation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotScript.g:293:3: this_Front_8= ruleFront
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFrontParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Front_8=ruleFront();

                    state._fsp--;


                    			current = this_Front_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotScript.g:302:3: this_Back_9= ruleBack
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBackParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Back_9=ruleBack();

                    state._fsp--;


                    			current = this_Back_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRobotScript.g:311:3: this_Right_10= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRightParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_10=ruleRight();

                    state._fsp--;


                    			current = this_Right_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRobotScript.g:320:3: this_Left_11= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLeftParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_11=ruleLeft();

                    state._fsp--;


                    			current = this_Left_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRobotScript.g:329:3: this_FunCall_12= ruleFunCall
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFunCallParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunCall_12=ruleFunCall();

                    state._fsp--;


                    			current = this_FunCall_12;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDataType"
    // InternalRobotScript.g:341:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalRobotScript.g:341:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalRobotScript.g:342:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalRobotScript.g:348:1: ruleDataType returns [EObject current=null] : (this_NumberType_0= ruleNumberType | this_BooleanType_1= ruleBooleanType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_NumberType_0 = null;

        EObject this_BooleanType_1 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:354:2: ( (this_NumberType_0= ruleNumberType | this_BooleanType_1= ruleBooleanType ) )
            // InternalRobotScript.g:355:2: (this_NumberType_0= ruleNumberType | this_BooleanType_1= ruleBooleanType )
            {
            // InternalRobotScript.g:355:2: (this_NumberType_0= ruleNumberType | this_BooleanType_1= ruleBooleanType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobotScript.g:356:3: this_NumberType_0= ruleNumberType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getNumberTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberType_0=ruleNumberType();

                    state._fsp--;


                    			current = this_NumberType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:365:3: this_BooleanType_1= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_1;
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleExpression"
    // InternalRobotScript.g:377:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobotScript.g:377:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobotScript.g:378:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRobotScript.g:384:1: ruleExpression returns [EObject current=null] : (this_Neg_0= ruleNeg | this_Not_1= ruleNot | this_Greater_2= ruleGreater | this_And_3= ruleAnd | this_Add_4= ruleAdd | this_Less_5= ruleLess | this_Or_6= ruleOr | this_Sub_7= ruleSub | this_GEq_8= ruleGEq | this_Equ_9= ruleEqu | this_Mul_10= ruleMul | this_LEq_11= ruleLEq | this_NEq_12= ruleNEq | this_Div_13= ruleDiv | this_TimeSensor_14= ruleTimeSensor | this_DistSensor_15= ruleDistSensor | this_BoolLiteral_16= ruleBoolLiteral | this_NumberLiteral_17= ruleNumberLiteral | this_SpeedState_18= ruleSpeedState | this_Variable_19= ruleVariable | this_FunCall_20= ruleFunCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Neg_0 = null;

        EObject this_Not_1 = null;

        EObject this_Greater_2 = null;

        EObject this_And_3 = null;

        EObject this_Add_4 = null;

        EObject this_Less_5 = null;

        EObject this_Or_6 = null;

        EObject this_Sub_7 = null;

        EObject this_GEq_8 = null;

        EObject this_Equ_9 = null;

        EObject this_Mul_10 = null;

        EObject this_LEq_11 = null;

        EObject this_NEq_12 = null;

        EObject this_Div_13 = null;

        EObject this_TimeSensor_14 = null;

        EObject this_DistSensor_15 = null;

        EObject this_BoolLiteral_16 = null;

        EObject this_NumberLiteral_17 = null;

        EObject this_SpeedState_18 = null;

        EObject this_Variable_19 = null;

        EObject this_FunCall_20 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:390:2: ( (this_Neg_0= ruleNeg | this_Not_1= ruleNot | this_Greater_2= ruleGreater | this_And_3= ruleAnd | this_Add_4= ruleAdd | this_Less_5= ruleLess | this_Or_6= ruleOr | this_Sub_7= ruleSub | this_GEq_8= ruleGEq | this_Equ_9= ruleEqu | this_Mul_10= ruleMul | this_LEq_11= ruleLEq | this_NEq_12= ruleNEq | this_Div_13= ruleDiv | this_TimeSensor_14= ruleTimeSensor | this_DistSensor_15= ruleDistSensor | this_BoolLiteral_16= ruleBoolLiteral | this_NumberLiteral_17= ruleNumberLiteral | this_SpeedState_18= ruleSpeedState | this_Variable_19= ruleVariable | this_FunCall_20= ruleFunCall ) )
            // InternalRobotScript.g:391:2: (this_Neg_0= ruleNeg | this_Not_1= ruleNot | this_Greater_2= ruleGreater | this_And_3= ruleAnd | this_Add_4= ruleAdd | this_Less_5= ruleLess | this_Or_6= ruleOr | this_Sub_7= ruleSub | this_GEq_8= ruleGEq | this_Equ_9= ruleEqu | this_Mul_10= ruleMul | this_LEq_11= ruleLEq | this_NEq_12= ruleNEq | this_Div_13= ruleDiv | this_TimeSensor_14= ruleTimeSensor | this_DistSensor_15= ruleDistSensor | this_BoolLiteral_16= ruleBoolLiteral | this_NumberLiteral_17= ruleNumberLiteral | this_SpeedState_18= ruleSpeedState | this_Variable_19= ruleVariable | this_FunCall_20= ruleFunCall )
            {
            // InternalRobotScript.g:391:2: (this_Neg_0= ruleNeg | this_Not_1= ruleNot | this_Greater_2= ruleGreater | this_And_3= ruleAnd | this_Add_4= ruleAdd | this_Less_5= ruleLess | this_Or_6= ruleOr | this_Sub_7= ruleSub | this_GEq_8= ruleGEq | this_Equ_9= ruleEqu | this_Mul_10= ruleMul | this_LEq_11= ruleLEq | this_NEq_12= ruleNEq | this_Div_13= ruleDiv | this_TimeSensor_14= ruleTimeSensor | this_DistSensor_15= ruleDistSensor | this_BoolLiteral_16= ruleBoolLiteral | this_NumberLiteral_17= ruleNumberLiteral | this_SpeedState_18= ruleSpeedState | this_Variable_19= ruleVariable | this_FunCall_20= ruleFunCall )
            int alt6=21;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            case 51:
                {
                alt6=4;
                }
                break;
            case 52:
                {
                alt6=5;
                }
                break;
            case 53:
                {
                alt6=6;
                }
                break;
            case 54:
                {
                alt6=7;
                }
                break;
            case 55:
                {
                alt6=8;
                }
                break;
            case 56:
                {
                alt6=9;
                }
                break;
            case 57:
                {
                alt6=10;
                }
                break;
            case 58:
                {
                alt6=11;
                }
                break;
            case 59:
                {
                alt6=12;
                }
                break;
            case 60:
                {
                alt6=13;
                }
                break;
            case 61:
                {
                alt6=14;
                }
                break;
            case 62:
                {
                alt6=15;
                }
                break;
            case 63:
                {
                alt6=16;
                }
                break;
            case 64:
                {
                alt6=17;
                }
                break;
            case 65:
                {
                alt6=18;
                }
                break;
            case 66:
                {
                alt6=19;
                }
                break;
            case 67:
                {
                alt6=20;
                }
                break;
            case 43:
                {
                alt6=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRobotScript.g:392:3: this_Neg_0= ruleNeg
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNegParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Neg_0=ruleNeg();

                    state._fsp--;


                    			current = this_Neg_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:401:3: this_Not_1= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_1=ruleNot();

                    state._fsp--;


                    			current = this_Not_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:410:3: this_Greater_2= ruleGreater
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGreaterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greater_2=ruleGreater();

                    state._fsp--;


                    			current = this_Greater_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:419:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_3=ruleAnd();

                    state._fsp--;


                    			current = this_And_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:428:3: this_Add_4= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAddParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_4=ruleAdd();

                    state._fsp--;


                    			current = this_Add_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:437:3: this_Less_5= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLessParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_5=ruleLess();

                    state._fsp--;


                    			current = this_Less_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:446:3: this_Or_6= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_6=ruleOr();

                    state._fsp--;


                    			current = this_Or_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:455:3: this_Sub_7= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSubParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_7=ruleSub();

                    state._fsp--;


                    			current = this_Sub_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotScript.g:464:3: this_GEq_8= ruleGEq
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGEqParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GEq_8=ruleGEq();

                    state._fsp--;


                    			current = this_GEq_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotScript.g:473:3: this_Equ_9= ruleEqu
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEquParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equ_9=ruleEqu();

                    state._fsp--;


                    			current = this_Equ_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRobotScript.g:482:3: this_Mul_10= ruleMul
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMulParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mul_10=ruleMul();

                    state._fsp--;


                    			current = this_Mul_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRobotScript.g:491:3: this_LEq_11= ruleLEq
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLEqParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LEq_11=ruleLEq();

                    state._fsp--;


                    			current = this_LEq_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRobotScript.g:500:3: this_NEq_12= ruleNEq
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNEqParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_NEq_12=ruleNEq();

                    state._fsp--;


                    			current = this_NEq_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalRobotScript.g:509:3: this_Div_13= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDivParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_13=ruleDiv();

                    state._fsp--;


                    			current = this_Div_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalRobotScript.g:518:3: this_TimeSensor_14= ruleTimeSensor
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTimeSensorParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeSensor_14=ruleTimeSensor();

                    state._fsp--;


                    			current = this_TimeSensor_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalRobotScript.g:527:3: this_DistSensor_15= ruleDistSensor
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDistSensorParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistSensor_15=ruleDistSensor();

                    state._fsp--;


                    			current = this_DistSensor_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalRobotScript.g:536:3: this_BoolLiteral_16= ruleBoolLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBoolLiteralParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_16=ruleBoolLiteral();

                    state._fsp--;


                    			current = this_BoolLiteral_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalRobotScript.g:545:3: this_NumberLiteral_17= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNumberLiteralParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_17=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalRobotScript.g:554:3: this_SpeedState_18= ruleSpeedState
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSpeedStateParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpeedState_18=ruleSpeedState();

                    state._fsp--;


                    			current = this_SpeedState_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalRobotScript.g:563:3: this_Variable_19= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_19=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalRobotScript.g:572:3: this_FunCall_20= ruleFunCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunCallParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunCall_20=ruleFunCall();

                    state._fsp--;


                    			current = this_FunCall_20;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFunctionDef"
    // InternalRobotScript.g:584:1: entryRuleFunctionDef returns [EObject current=null] : iv_ruleFunctionDef= ruleFunctionDef EOF ;
    public final EObject entryRuleFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDef = null;


        try {
            // InternalRobotScript.g:584:52: (iv_ruleFunctionDef= ruleFunctionDef EOF )
            // InternalRobotScript.g:585:2: iv_ruleFunctionDef= ruleFunctionDef EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDef=ruleFunctionDef();

            state._fsp--;

             current =iv_ruleFunctionDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // InternalRobotScript.g:591:1: ruleFunctionDef returns [EObject current=null] : (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )? (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleFunctionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_returnType_4_0 = null;

        EObject lv_body_7_0 = null;

        EObject lv_body_9_0 = null;

        EObject lv_inputs_13_0 = null;

        EObject lv_inputs_15_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:597:2: ( (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )? (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRobotScript.g:598:2: (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )? (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRobotScript.g:598:2: (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )? (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRobotScript.g:599:3: otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )? (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDefAccess().getFunctionDefKeyword_0());
            		
            // InternalRobotScript.g:603:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:604:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:604:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:605:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionDefAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"robotScript.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDefAccess().getReturnTypeKeyword_3());
            		
            // InternalRobotScript.g:630:3: ( (lv_returnType_4_0= ruleAnyType ) )
            // InternalRobotScript.g:631:4: (lv_returnType_4_0= ruleAnyType )
            {
            // InternalRobotScript.g:631:4: (lv_returnType_4_0= ruleAnyType )
            // InternalRobotScript.g:632:5: lv_returnType_4_0= ruleAnyType
            {

            					newCompositeNode(grammarAccess.getFunctionDefAccess().getReturnTypeAnyTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_returnType_4_0=ruleAnyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"robotScript.RobotScript.AnyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:649:3: (otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobotScript.g:650:4: otherlv_5= 'body' otherlv_6= '{' ( (lv_body_7_0= ruleCommand ) ) (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionDefAccess().getBodyKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRobotScript.g:658:4: ( (lv_body_7_0= ruleCommand ) )
                    // InternalRobotScript.g:659:5: (lv_body_7_0= ruleCommand )
                    {
                    // InternalRobotScript.g:659:5: (lv_body_7_0= ruleCommand )
                    // InternalRobotScript.g:660:6: lv_body_7_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getBodyCommandParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_7_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_7_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:677:4: (otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRobotScript.g:678:5: otherlv_8= ',' ( (lv_body_9_0= ruleCommand ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFunctionDefAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRobotScript.g:682:5: ( (lv_body_9_0= ruleCommand ) )
                    	    // InternalRobotScript.g:683:6: (lv_body_9_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:683:6: (lv_body_9_0= ruleCommand )
                    	    // InternalRobotScript.g:684:7: lv_body_9_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefAccess().getBodyCommandParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_9_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_9_0,
                    	    								"robotScript.RobotScript.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRobotScript.g:707:3: (otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotScript.g:708:4: otherlv_11= 'inputs' otherlv_12= '{' ( (lv_inputs_13_0= ruleVarDecl ) ) (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getFunctionDefAccess().getInputsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRobotScript.g:716:4: ( (lv_inputs_13_0= ruleVarDecl ) )
                    // InternalRobotScript.g:717:5: (lv_inputs_13_0= ruleVarDecl )
                    {
                    // InternalRobotScript.g:717:5: (lv_inputs_13_0= ruleVarDecl )
                    // InternalRobotScript.g:718:6: lv_inputs_13_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getInputsVarDeclParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_inputs_13_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_13_0,
                    							"robotScript.RobotScript.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:735:4: (otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRobotScript.g:736:5: otherlv_14= ',' ( (lv_inputs_15_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getFunctionDefAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRobotScript.g:740:5: ( (lv_inputs_15_0= ruleVarDecl ) )
                    	    // InternalRobotScript.g:741:6: (lv_inputs_15_0= ruleVarDecl )
                    	    {
                    	    // InternalRobotScript.g:741:6: (lv_inputs_15_0= ruleVarDecl )
                    	    // InternalRobotScript.g:742:7: lv_inputs_15_0= ruleVarDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefAccess().getInputsVarDeclParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_inputs_15_0=ruleVarDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_15_0,
                    	    								"robotScript.RobotScript.VarDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleEString"
    // InternalRobotScript.g:773:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotScript.g:773:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotScript.g:774:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRobotScript.g:780:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:786:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotScript.g:787:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotScript.g:787:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobotScript.g:788:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:796:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVarDecl"
    // InternalRobotScript.g:807:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalRobotScript.g:807:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalRobotScript.g:808:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalRobotScript.g:814:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'VarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:820:2: ( (otherlv_0= 'VarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' ) )
            // InternalRobotScript.g:821:2: (otherlv_0= 'VarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' )
            {
            // InternalRobotScript.g:821:2: (otherlv_0= 'VarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' )
            // InternalRobotScript.g:822:3: otherlv_0= 'VarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarDeclKeyword_0());
            		
            // InternalRobotScript.g:826:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:827:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:827:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:828:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"robotScript.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getTypeKeyword_3());
            		
            // InternalRobotScript.g:853:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalRobotScript.g:854:4: (lv_type_4_0= ruleDataType )
            {
            // InternalRobotScript.g:854:4: (lv_type_4_0= ruleDataType )
            // InternalRobotScript.g:855:5: lv_type_4_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getTypeDataTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"robotScript.RobotScript.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleVoidType"
    // InternalRobotScript.g:880:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalRobotScript.g:880:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalRobotScript.g:881:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalRobotScript.g:887:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'VoidType' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:893:2: ( ( () otherlv_1= 'VoidType' ) )
            // InternalRobotScript.g:894:2: ( () otherlv_1= 'VoidType' )
            {
            // InternalRobotScript.g:894:2: ( () otherlv_1= 'VoidType' )
            // InternalRobotScript.g:895:3: () otherlv_1= 'VoidType'
            {
            // InternalRobotScript.g:895:3: ()
            // InternalRobotScript.g:896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidTypeAccess().getVoidTypeKeyword_1());
            		

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
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleNumberType"
    // InternalRobotScript.g:910:1: entryRuleNumberType returns [EObject current=null] : iv_ruleNumberType= ruleNumberType EOF ;
    public final EObject entryRuleNumberType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberType = null;


        try {
            // InternalRobotScript.g:910:51: (iv_ruleNumberType= ruleNumberType EOF )
            // InternalRobotScript.g:911:2: iv_ruleNumberType= ruleNumberType EOF
            {
             newCompositeNode(grammarAccess.getNumberTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberType=ruleNumberType();

            state._fsp--;

             current =iv_ruleNumberType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberType"


    // $ANTLR start "ruleNumberType"
    // InternalRobotScript.g:917:1: ruleNumberType returns [EObject current=null] : ( () otherlv_1= 'NumberType' ) ;
    public final EObject ruleNumberType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:923:2: ( ( () otherlv_1= 'NumberType' ) )
            // InternalRobotScript.g:924:2: ( () otherlv_1= 'NumberType' )
            {
            // InternalRobotScript.g:924:2: ( () otherlv_1= 'NumberType' )
            // InternalRobotScript.g:925:3: () otherlv_1= 'NumberType'
            {
            // InternalRobotScript.g:925:3: ()
            // InternalRobotScript.g:926:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberTypeAccess().getNumberTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberTypeAccess().getNumberTypeKeyword_1());
            		

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
    // $ANTLR end "ruleNumberType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalRobotScript.g:940:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalRobotScript.g:940:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalRobotScript.g:941:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalRobotScript.g:947:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'BooleanType' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:953:2: ( ( () otherlv_1= 'BooleanType' ) )
            // InternalRobotScript.g:954:2: ( () otherlv_1= 'BooleanType' )
            {
            // InternalRobotScript.g:954:2: ( () otherlv_1= 'BooleanType' )
            // InternalRobotScript.g:955:3: () otherlv_1= 'BooleanType'
            {
            // InternalRobotScript.g:955:3: ()
            // InternalRobotScript.g:956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleLoop"
    // InternalRobotScript.g:970:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalRobotScript.g:970:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalRobotScript.g:971:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalRobotScript.g:977:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_cond_9_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:983:2: ( (otherlv_0= 'Loop' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalRobotScript.g:984:2: (otherlv_0= 'Loop' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalRobotScript.g:984:2: (otherlv_0= 'Loop' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalRobotScript.g:985:3: otherlv_0= 'Loop' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:993:3: (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobotScript.g:994:4: otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getBodyKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalRobotScript.g:1002:4: ( (lv_body_4_0= ruleCommand ) )
                    // InternalRobotScript.g:1003:5: (lv_body_4_0= ruleCommand )
                    {
                    // InternalRobotScript.g:1003:5: (lv_body_4_0= ruleCommand )
                    // InternalRobotScript.g:1004:6: lv_body_4_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getBodyCommandParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_4_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:1021:4: (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRobotScript.g:1022:5: otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRobotScript.g:1026:5: ( (lv_body_6_0= ruleCommand ) )
                    	    // InternalRobotScript.g:1027:6: (lv_body_6_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:1027:6: (lv_body_6_0= ruleCommand )
                    	    // InternalRobotScript.g:1028:7: lv_body_6_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getBodyCommandParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_6_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"robotScript.RobotScript.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getCondKeyword_3());
            		
            // InternalRobotScript.g:1055:3: ( (lv_cond_9_0= ruleExpression ) )
            // InternalRobotScript.g:1056:4: (lv_cond_9_0= ruleExpression )
            {
            // InternalRobotScript.g:1056:4: (lv_cond_9_0= ruleExpression )
            // InternalRobotScript.g:1057:5: lv_cond_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_cond_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_9_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleIf_Impl"
    // InternalRobotScript.g:1082:1: entryRuleIf_Impl returns [EObject current=null] : iv_ruleIf_Impl= ruleIf_Impl EOF ;
    public final EObject entryRuleIf_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_Impl = null;


        try {
            // InternalRobotScript.g:1082:48: (iv_ruleIf_Impl= ruleIf_Impl EOF )
            // InternalRobotScript.g:1083:2: iv_ruleIf_Impl= ruleIf_Impl EOF
            {
             newCompositeNode(grammarAccess.getIf_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf_Impl=ruleIf_Impl();

            state._fsp--;

             current =iv_ruleIf_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIf_Impl"


    // $ANTLR start "ruleIf_Impl"
    // InternalRobotScript.g:1089:1: ruleIf_Impl returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
    public final EObject ruleIf_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_cond_9_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1095:2: ( (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalRobotScript.g:1096:2: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalRobotScript.g:1096:2: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalRobotScript.g:1097:3: otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIf_ImplAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIf_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1105:3: (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobotScript.g:1106:4: otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIf_ImplAccess().getBodyKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getIf_ImplAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalRobotScript.g:1114:4: ( (lv_body_4_0= ruleCommand ) )
                    // InternalRobotScript.g:1115:5: (lv_body_4_0= ruleCommand )
                    {
                    // InternalRobotScript.g:1115:5: (lv_body_4_0= ruleCommand )
                    // InternalRobotScript.g:1116:6: lv_body_4_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIf_ImplAccess().getBodyCommandParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_4_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIf_ImplRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:1133:4: (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRobotScript.g:1134:5: otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getIf_ImplAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRobotScript.g:1138:5: ( (lv_body_6_0= ruleCommand ) )
                    	    // InternalRobotScript.g:1139:6: (lv_body_6_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:1139:6: (lv_body_6_0= ruleCommand )
                    	    // InternalRobotScript.g:1140:7: lv_body_6_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIf_ImplAccess().getBodyCommandParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_6_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIf_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"robotScript.RobotScript.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getIf_ImplAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getIf_ImplAccess().getCondKeyword_3());
            		
            // InternalRobotScript.g:1167:3: ( (lv_cond_9_0= ruleExpression ) )
            // InternalRobotScript.g:1168:4: (lv_cond_9_0= ruleExpression )
            {
            // InternalRobotScript.g:1168:4: (lv_cond_9_0= ruleExpression )
            // InternalRobotScript.g:1169:5: lv_cond_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIf_ImplAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_cond_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_ImplRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_9_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIf_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIf_Impl"


    // $ANTLR start "entryRuleIfElse"
    // InternalRobotScript.g:1194:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalRobotScript.g:1194:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalRobotScript.g:1195:2: iv_ruleIfElse= ruleIfElse EOF
            {
             newCompositeNode(grammarAccess.getIfElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElse=ruleIfElse();

            state._fsp--;

             current =iv_ruleIfElse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalRobotScript.g:1201:1: ruleIfElse returns [EObject current=null] : (otherlv_0= 'IfElse' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_cond_9_0 = null;

        EObject lv_bodyElse_12_0 = null;

        EObject lv_bodyElse_14_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1207:2: ( (otherlv_0= 'IfElse' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRobotScript.g:1208:2: (otherlv_0= 'IfElse' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRobotScript.g:1208:2: (otherlv_0= 'IfElse' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRobotScript.g:1209:3: otherlv_0= 'IfElse' otherlv_1= '{' (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )? otherlv_8= 'cond' ( (lv_cond_9_0= ruleExpression ) ) (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfElseKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1217:3: (otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobotScript.g:1218:4: otherlv_2= 'body' otherlv_3= '{' ( (lv_body_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getBodyKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalRobotScript.g:1226:4: ( (lv_body_4_0= ruleCommand ) )
                    // InternalRobotScript.g:1227:5: (lv_body_4_0= ruleCommand )
                    {
                    // InternalRobotScript.g:1227:5: (lv_body_4_0= ruleCommand )
                    // InternalRobotScript.g:1228:6: lv_body_4_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfElseAccess().getBodyCommandParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_4_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfElseRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:1245:4: (otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRobotScript.g:1246:5: otherlv_5= ',' ( (lv_body_6_0= ruleCommand ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getIfElseAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRobotScript.g:1250:5: ( (lv_body_6_0= ruleCommand ) )
                    	    // InternalRobotScript.g:1251:6: (lv_body_6_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:1251:6: (lv_body_6_0= ruleCommand )
                    	    // InternalRobotScript.g:1252:7: lv_body_6_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseAccess().getBodyCommandParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_6_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"robotScript.RobotScript.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getIfElseAccess().getCondKeyword_3());
            		
            // InternalRobotScript.g:1279:3: ( (lv_cond_9_0= ruleExpression ) )
            // InternalRobotScript.g:1280:4: (lv_cond_9_0= ruleExpression )
            {
            // InternalRobotScript.g:1280:4: (lv_cond_9_0= ruleExpression )
            // InternalRobotScript.g:1281:5: lv_cond_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_cond_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_9_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1298:3: (otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotScript.g:1299:4: otherlv_10= 'bodyElse' otherlv_11= '{' ( (lv_bodyElse_12_0= ruleCommand ) ) (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfElseAccess().getBodyElseKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRobotScript.g:1307:4: ( (lv_bodyElse_12_0= ruleCommand ) )
                    // InternalRobotScript.g:1308:5: (lv_bodyElse_12_0= ruleCommand )
                    {
                    // InternalRobotScript.g:1308:5: (lv_bodyElse_12_0= ruleCommand )
                    // InternalRobotScript.g:1309:6: lv_bodyElse_12_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfElseAccess().getBodyElseCommandParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_bodyElse_12_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfElseRule());
                    						}
                    						add(
                    							current,
                    							"bodyElse",
                    							lv_bodyElse_12_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:1326:4: (otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRobotScript.g:1327:5: otherlv_13= ',' ( (lv_bodyElse_14_0= ruleCommand ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getIfElseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRobotScript.g:1331:5: ( (lv_bodyElse_14_0= ruleCommand ) )
                    	    // InternalRobotScript.g:1332:6: (lv_bodyElse_14_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:1332:6: (lv_bodyElse_14_0= ruleCommand )
                    	    // InternalRobotScript.g:1333:7: lv_bodyElse_14_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseAccess().getBodyElseCommandParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_bodyElse_14_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bodyElse",
                    	    								lv_bodyElse_14_0,
                    	    								"robotScript.RobotScript.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleAssignAtDecl"
    // InternalRobotScript.g:1364:1: entryRuleAssignAtDecl returns [EObject current=null] : iv_ruleAssignAtDecl= ruleAssignAtDecl EOF ;
    public final EObject entryRuleAssignAtDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignAtDecl = null;


        try {
            // InternalRobotScript.g:1364:53: (iv_ruleAssignAtDecl= ruleAssignAtDecl EOF )
            // InternalRobotScript.g:1365:2: iv_ruleAssignAtDecl= ruleAssignAtDecl EOF
            {
             newCompositeNode(grammarAccess.getAssignAtDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignAtDecl=ruleAssignAtDecl();

            state._fsp--;

             current =iv_ruleAssignAtDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignAtDecl"


    // $ANTLR start "ruleAssignAtDecl"
    // InternalRobotScript.g:1371:1: ruleAssignAtDecl returns [EObject current=null] : (otherlv_0= 'AssignAtDecl' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'vardecl' ( (lv_vardecl_5_0= ruleVarDecl ) ) otherlv_6= '}' ) ;
    public final EObject ruleAssignAtDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_3_0 = null;

        EObject lv_vardecl_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1377:2: ( (otherlv_0= 'AssignAtDecl' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'vardecl' ( (lv_vardecl_5_0= ruleVarDecl ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1378:2: (otherlv_0= 'AssignAtDecl' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'vardecl' ( (lv_vardecl_5_0= ruleVarDecl ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1378:2: (otherlv_0= 'AssignAtDecl' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'vardecl' ( (lv_vardecl_5_0= ruleVarDecl ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1379:3: otherlv_0= 'AssignAtDecl' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'vardecl' ( (lv_vardecl_5_0= ruleVarDecl ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignAtDeclAccess().getAssignAtDeclKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignAtDeclAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignAtDeclAccess().getExpressionKeyword_2());
            		
            // InternalRobotScript.g:1391:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRobotScript.g:1392:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRobotScript.g:1392:4: (lv_expression_3_0= ruleExpression )
            // InternalRobotScript.g:1393:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignAtDeclAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignAtDeclRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAssignAtDeclAccess().getVardeclKeyword_4());
            		
            // InternalRobotScript.g:1414:3: ( (lv_vardecl_5_0= ruleVarDecl ) )
            // InternalRobotScript.g:1415:4: (lv_vardecl_5_0= ruleVarDecl )
            {
            // InternalRobotScript.g:1415:4: (lv_vardecl_5_0= ruleVarDecl )
            // InternalRobotScript.g:1416:5: lv_vardecl_5_0= ruleVarDecl
            {

            					newCompositeNode(grammarAccess.getAssignAtDeclAccess().getVardeclVarDeclParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_vardecl_5_0=ruleVarDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignAtDeclRule());
            					}
            					set(
            						current,
            						"vardecl",
            						lv_vardecl_5_0,
            						"robotScript.RobotScript.VarDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignAtDeclAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssignAtDecl"


    // $ANTLR start "entryRuleReAssign"
    // InternalRobotScript.g:1441:1: entryRuleReAssign returns [EObject current=null] : iv_ruleReAssign= ruleReAssign EOF ;
    public final EObject entryRuleReAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReAssign = null;


        try {
            // InternalRobotScript.g:1441:49: (iv_ruleReAssign= ruleReAssign EOF )
            // InternalRobotScript.g:1442:2: iv_ruleReAssign= ruleReAssign EOF
            {
             newCompositeNode(grammarAccess.getReAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReAssign=ruleReAssign();

            state._fsp--;

             current =iv_ruleReAssign; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReAssign"


    // $ANTLR start "ruleReAssign"
    // InternalRobotScript.g:1448:1: ruleReAssign returns [EObject current=null] : (otherlv_0= 'ReAssign' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleReAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1454:2: ( (otherlv_0= 'ReAssign' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1455:2: (otherlv_0= 'ReAssign' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1455:2: (otherlv_0= 'ReAssign' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1456:3: otherlv_0= 'ReAssign' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReAssignAccess().getReAssignKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getReAssignAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getReAssignAccess().getVarKeyword_2());
            		
            // InternalRobotScript.g:1468:3: ( ( ruleEString ) )
            // InternalRobotScript.g:1469:4: ( ruleEString )
            {
            // InternalRobotScript.g:1469:4: ( ruleEString )
            // InternalRobotScript.g:1470:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReAssignRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReAssignAccess().getVarVarDeclCrossReference_3_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getReAssignAccess().getExpressionKeyword_4());
            		
            // InternalRobotScript.g:1488:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalRobotScript.g:1489:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1489:4: (lv_expression_5_0= ruleExpression )
            // InternalRobotScript.g:1490:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReAssignAccess().getExpressionExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReAssignRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReAssignAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleReAssign"


    // $ANTLR start "entryRuleSetSpeed"
    // InternalRobotScript.g:1515:1: entryRuleSetSpeed returns [EObject current=null] : iv_ruleSetSpeed= ruleSetSpeed EOF ;
    public final EObject entryRuleSetSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetSpeed = null;


        try {
            // InternalRobotScript.g:1515:49: (iv_ruleSetSpeed= ruleSetSpeed EOF )
            // InternalRobotScript.g:1516:2: iv_ruleSetSpeed= ruleSetSpeed EOF
            {
             newCompositeNode(grammarAccess.getSetSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetSpeed=ruleSetSpeed();

            state._fsp--;

             current =iv_ruleSetSpeed; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetSpeed"


    // $ANTLR start "ruleSetSpeed"
    // InternalRobotScript.g:1522:1: ruleSetSpeed returns [EObject current=null] : (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'speedstate' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleSetSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1528:2: ( (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'speedstate' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // InternalRobotScript.g:1529:2: (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'speedstate' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // InternalRobotScript.g:1529:2: (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'speedstate' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= '}' )
            // InternalRobotScript.g:1530:3: otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'speedstate' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSetSpeedAccess().getSetSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSetSpeedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1538:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobotScript.g:1539:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetSpeedAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1543:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1544:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1544:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1545:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getSetSpeedAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetSpeedRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScript.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSetSpeedAccess().getSpeedstateKeyword_3());
            		
            // InternalRobotScript.g:1567:3: ( ( ruleEString ) )
            // InternalRobotScript.g:1568:4: ( ruleEString )
            {
            // InternalRobotScript.g:1568:4: ( ruleEString )
            // InternalRobotScript.g:1569:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetSpeedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSetSpeedAccess().getSpeedstateSpeedStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getSetSpeedAccess().getExpressionKeyword_5());
            		
            // InternalRobotScript.g:1587:3: ( (lv_expression_7_0= ruleExpression ) )
            // InternalRobotScript.g:1588:4: (lv_expression_7_0= ruleExpression )
            {
            // InternalRobotScript.g:1588:4: (lv_expression_7_0= ruleExpression )
            // InternalRobotScript.g:1589:5: lv_expression_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetSpeedAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetSpeedRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_7_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSetSpeedAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSetSpeed"


    // $ANTLR start "entryRuleRotation"
    // InternalRobotScript.g:1614:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalRobotScript.g:1614:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalRobotScript.g:1615:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalRobotScript.g:1621:1: ruleRotation returns [EObject current=null] : (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1627:2: ( (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1628:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1628:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1629:3: otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expression' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationAccess().getRotationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationAccess().getExpressionKeyword_2());
            		
            // InternalRobotScript.g:1641:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRobotScript.g:1642:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRobotScript.g:1642:4: (lv_expression_3_0= ruleExpression )
            // InternalRobotScript.g:1643:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleFront"
    // InternalRobotScript.g:1668:1: entryRuleFront returns [EObject current=null] : iv_ruleFront= ruleFront EOF ;
    public final EObject entryRuleFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFront = null;


        try {
            // InternalRobotScript.g:1668:46: (iv_ruleFront= ruleFront EOF )
            // InternalRobotScript.g:1669:2: iv_ruleFront= ruleFront EOF
            {
             newCompositeNode(grammarAccess.getFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFront=ruleFront();

            state._fsp--;

             current =iv_ruleFront; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFront"


    // $ANTLR start "ruleFront"
    // InternalRobotScript.g:1675:1: ruleFront returns [EObject current=null] : (otherlv_0= 'Front' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleFront() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1681:2: ( (otherlv_0= 'Front' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1682:2: (otherlv_0= 'Front' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1682:2: (otherlv_0= 'Front' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1683:3: otherlv_0= 'Front' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontAccess().getFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFrontAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1691:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobotScript.g:1692:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getFrontAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1696:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1697:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1697:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1698:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getFrontAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFrontRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScript.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getFrontAccess().getExpressionKeyword_3());
            		
            // InternalRobotScript.g:1720:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalRobotScript.g:1721:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1721:4: (lv_expression_5_0= ruleExpression )
            // InternalRobotScript.g:1722:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFrontAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFrontAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFront"


    // $ANTLR start "entryRuleBack"
    // InternalRobotScript.g:1747:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // InternalRobotScript.g:1747:45: (iv_ruleBack= ruleBack EOF )
            // InternalRobotScript.g:1748:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // InternalRobotScript.g:1754:1: ruleBack returns [EObject current=null] : (otherlv_0= 'Back' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1760:2: ( (otherlv_0= 'Back' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1761:2: (otherlv_0= 'Back' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1761:2: (otherlv_0= 'Back' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1762:3: otherlv_0= 'Back' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBackAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1770:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRobotScript.g:1771:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getBackAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1775:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1776:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1776:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1777:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getBackAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBackRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScript.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getBackAccess().getExpressionKeyword_3());
            		
            // InternalRobotScript.g:1799:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalRobotScript.g:1800:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1800:4: (lv_expression_5_0= ruleExpression )
            // InternalRobotScript.g:1801:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBackAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBackAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleRight"
    // InternalRobotScript.g:1826:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalRobotScript.g:1826:46: (iv_ruleRight= ruleRight EOF )
            // InternalRobotScript.g:1827:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalRobotScript.g:1833:1: ruleRight returns [EObject current=null] : (otherlv_0= 'Right' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1839:2: ( (otherlv_0= 'Right' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1840:2: (otherlv_0= 'Right' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1840:2: (otherlv_0= 'Right' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1841:3: otherlv_0= 'Right' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1849:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobotScript.g:1850:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getRightAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1854:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1855:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1855:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1856:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getRightAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRightRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScript.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getRightAccess().getExpressionKeyword_3());
            		
            // InternalRobotScript.g:1878:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalRobotScript.g:1879:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1879:4: (lv_expression_5_0= ruleExpression )
            // InternalRobotScript.g:1880:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRightAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRightAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleLeft"
    // InternalRobotScript.g:1905:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalRobotScript.g:1905:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalRobotScript.g:1906:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalRobotScript.g:1912:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'Left' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1918:2: ( (otherlv_0= 'Left' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1919:2: (otherlv_0= 'Left' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1919:2: (otherlv_0= 'Left' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1920:3: otherlv_0= 'Left' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expression' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1928:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRobotScript.g:1929:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1933:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1934:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1934:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1935:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getLeftAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeftRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScript.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLeftAccess().getExpressionKeyword_3());
            		
            // InternalRobotScript.g:1957:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalRobotScript.g:1958:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1958:4: (lv_expression_5_0= ruleExpression )
            // InternalRobotScript.g:1959:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLeftAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleFunCall"
    // InternalRobotScript.g:1984:1: entryRuleFunCall returns [EObject current=null] : iv_ruleFunCall= ruleFunCall EOF ;
    public final EObject entryRuleFunCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunCall = null;


        try {
            // InternalRobotScript.g:1984:48: (iv_ruleFunCall= ruleFunCall EOF )
            // InternalRobotScript.g:1985:2: iv_ruleFunCall= ruleFunCall EOF
            {
             newCompositeNode(grammarAccess.getFunCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunCall=ruleFunCall();

            state._fsp--;

             current =iv_ruleFunCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunCall"


    // $ANTLR start "ruleFunCall"
    // InternalRobotScript.g:1991:1: ruleFunCall returns [EObject current=null] : (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleFunCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_8_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1997:2: ( (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobotScript.g:1998:2: (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobotScript.g:1998:2: (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobotScript.g:1999:3: otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunCallAccess().getFunCallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFunCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFunCallAccess().getFunKeyword_2());
            		
            // InternalRobotScript.g:2011:3: ( ( ruleEString ) )
            // InternalRobotScript.g:2012:4: ( ruleEString )
            {
            // InternalRobotScript.g:2012:4: ( ruleEString )
            // InternalRobotScript.g:2013:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFunCallAccess().getFunFunctionDefCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:2027:3: (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRobotScript.g:2028:4: otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunCallAccess().getInputsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunCallAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobotScript.g:2036:4: ( (lv_inputs_6_0= ruleExpression ) )
                    // InternalRobotScript.g:2037:5: (lv_inputs_6_0= ruleExpression )
                    {
                    // InternalRobotScript.g:2037:5: (lv_inputs_6_0= ruleExpression )
                    // InternalRobotScript.g:2038:6: lv_inputs_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunCallAccess().getInputsExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_inputs_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunCallRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_6_0,
                    							"robotScript.RobotScript.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:2055:4: (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRobotScript.g:2056:5: otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFunCallAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobotScript.g:2060:5: ( (lv_inputs_8_0= ruleExpression ) )
                    	    // InternalRobotScript.g:2061:6: (lv_inputs_8_0= ruleExpression )
                    	    {
                    	    // InternalRobotScript.g:2061:6: (lv_inputs_8_0= ruleExpression )
                    	    // InternalRobotScript.g:2062:7: lv_inputs_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunCallAccess().getInputsExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_inputs_8_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_8_0,
                    	    								"robotScript.RobotScript.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunCallAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFunCallAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFunCall"


    // $ANTLR start "entryRuleNeg"
    // InternalRobotScript.g:2093:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // InternalRobotScript.g:2093:44: (iv_ruleNeg= ruleNeg EOF )
            // InternalRobotScript.g:2094:2: iv_ruleNeg= ruleNeg EOF
            {
             newCompositeNode(grammarAccess.getNegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeg=ruleNeg();

            state._fsp--;

             current =iv_ruleNeg; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // InternalRobotScript.g:2100:1: ruleNeg returns [EObject current=null] : (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2106:2: ( (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:2107:2: (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:2107:2: (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobotScript.g:2108:3: otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegAccess().getNegKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getNegAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNegAccess().getOpKeyword_2());
            		
            // InternalRobotScript.g:2120:3: ( (lv_op_3_0= ruleExpression ) )
            // InternalRobotScript.g:2121:4: (lv_op_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2121:4: (lv_op_3_0= ruleExpression )
            // InternalRobotScript.g:2122:5: lv_op_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegAccess().getOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_op_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNegAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleNot"
    // InternalRobotScript.g:2147:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobotScript.g:2147:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobotScript.g:2148:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalRobotScript.g:2154:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2160:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:2161:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:2161:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobotScript.g:2162:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'op' ( (lv_op_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getOpKeyword_2());
            		
            // InternalRobotScript.g:2174:3: ( (lv_op_3_0= ruleExpression ) )
            // InternalRobotScript.g:2175:4: (lv_op_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2175:4: (lv_op_3_0= ruleExpression )
            // InternalRobotScript.g:2176:5: lv_op_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_op_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleGreater"
    // InternalRobotScript.g:2201:1: entryRuleGreater returns [EObject current=null] : iv_ruleGreater= ruleGreater EOF ;
    public final EObject entryRuleGreater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreater = null;


        try {
            // InternalRobotScript.g:2201:48: (iv_ruleGreater= ruleGreater EOF )
            // InternalRobotScript.g:2202:2: iv_ruleGreater= ruleGreater EOF
            {
             newCompositeNode(grammarAccess.getGreaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreater=ruleGreater();

            state._fsp--;

             current =iv_ruleGreater; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // InternalRobotScript.g:2208:1: ruleGreater returns [EObject current=null] : (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleGreater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2214:2: ( (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2215:2: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2215:2: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2216:3: otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterAccess().getGreaterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2228:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2229:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2229:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2230:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getGreaterAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2251:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2252:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2252:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2253:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGreaterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleAnd"
    // InternalRobotScript.g:2278:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobotScript.g:2278:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobotScript.g:2279:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalRobotScript.g:2285:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2291:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2292:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2292:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2293:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2305:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2306:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2306:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2307:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2328:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2329:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2329:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2330:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAdd"
    // InternalRobotScript.g:2355:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalRobotScript.g:2355:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalRobotScript.g:2356:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalRobotScript.g:2362:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2368:2: ( (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2369:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2369:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2370:3: otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2382:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2383:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2383:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2384:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAddAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2405:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2406:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2406:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2407:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAddAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleLess"
    // InternalRobotScript.g:2432:1: entryRuleLess returns [EObject current=null] : iv_ruleLess= ruleLess EOF ;
    public final EObject entryRuleLess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLess = null;


        try {
            // InternalRobotScript.g:2432:45: (iv_ruleLess= ruleLess EOF )
            // InternalRobotScript.g:2433:2: iv_ruleLess= ruleLess EOF
            {
             newCompositeNode(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLess=ruleLess();

            state._fsp--;

             current =iv_ruleLess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalRobotScript.g:2439:1: ruleLess returns [EObject current=null] : (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2445:2: ( (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2446:2: (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2446:2: (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2447:3: otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLessAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getLessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getLessAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2459:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2460:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2460:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2461:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLessAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2482:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2483:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2483:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2484:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLessAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleOr"
    // InternalRobotScript.g:2509:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRobotScript.g:2509:43: (iv_ruleOr= ruleOr EOF )
            // InternalRobotScript.g:2510:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalRobotScript.g:2516:1: ruleOr returns [EObject current=null] : (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2522:2: ( (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2523:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2523:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2524:3: otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOrAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2536:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2537:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2537:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2538:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getOrAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2559:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2560:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2560:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2561:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleSub"
    // InternalRobotScript.g:2586:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalRobotScript.g:2586:44: (iv_ruleSub= ruleSub EOF )
            // InternalRobotScript.g:2587:2: iv_ruleSub= ruleSub EOF
            {
             newCompositeNode(grammarAccess.getSubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSub=ruleSub();

            state._fsp--;

             current =iv_ruleSub; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSub"


    // $ANTLR start "ruleSub"
    // InternalRobotScript.g:2593:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2599:2: ( (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2600:2: (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2600:2: (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2601:3: otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSubAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2613:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2614:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2614:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2615:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getSubAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2636:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2637:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2637:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2638:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSub"


    // $ANTLR start "entryRuleGEq"
    // InternalRobotScript.g:2663:1: entryRuleGEq returns [EObject current=null] : iv_ruleGEq= ruleGEq EOF ;
    public final EObject entryRuleGEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEq = null;


        try {
            // InternalRobotScript.g:2663:44: (iv_ruleGEq= ruleGEq EOF )
            // InternalRobotScript.g:2664:2: iv_ruleGEq= ruleGEq EOF
            {
             newCompositeNode(grammarAccess.getGEqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGEq=ruleGEq();

            state._fsp--;

             current =iv_ruleGEq; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGEq"


    // $ANTLR start "ruleGEq"
    // InternalRobotScript.g:2670:1: ruleGEq returns [EObject current=null] : (otherlv_0= 'GEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleGEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2676:2: ( (otherlv_0= 'GEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2677:2: (otherlv_0= 'GEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2677:2: (otherlv_0= 'GEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2678:3: otherlv_0= 'GEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGEqAccess().getGEqKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getGEqAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGEqAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2690:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2691:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2691:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2692:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGEqAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGEqRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getGEqAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2713:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2714:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2714:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2715:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGEqAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGEqRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGEqAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGEq"


    // $ANTLR start "entryRuleEqu"
    // InternalRobotScript.g:2740:1: entryRuleEqu returns [EObject current=null] : iv_ruleEqu= ruleEqu EOF ;
    public final EObject entryRuleEqu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqu = null;


        try {
            // InternalRobotScript.g:2740:44: (iv_ruleEqu= ruleEqu EOF )
            // InternalRobotScript.g:2741:2: iv_ruleEqu= ruleEqu EOF
            {
             newCompositeNode(grammarAccess.getEquRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqu=ruleEqu();

            state._fsp--;

             current =iv_ruleEqu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqu"


    // $ANTLR start "ruleEqu"
    // InternalRobotScript.g:2747:1: ruleEqu returns [EObject current=null] : (otherlv_0= 'Equ' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleEqu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2753:2: ( (otherlv_0= 'Equ' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2754:2: (otherlv_0= 'Equ' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2754:2: (otherlv_0= 'Equ' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2755:3: otherlv_0= 'Equ' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEquAccess().getEquKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEquAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEquAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2767:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2768:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2768:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2769:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEquAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getEquAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2790:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2791:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2791:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2792:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEquAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEquAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEqu"


    // $ANTLR start "entryRuleMul"
    // InternalRobotScript.g:2817:1: entryRuleMul returns [EObject current=null] : iv_ruleMul= ruleMul EOF ;
    public final EObject entryRuleMul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMul = null;


        try {
            // InternalRobotScript.g:2817:44: (iv_ruleMul= ruleMul EOF )
            // InternalRobotScript.g:2818:2: iv_ruleMul= ruleMul EOF
            {
             newCompositeNode(grammarAccess.getMulRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMul=ruleMul();

            state._fsp--;

             current =iv_ruleMul; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMul"


    // $ANTLR start "ruleMul"
    // InternalRobotScript.g:2824:1: ruleMul returns [EObject current=null] : (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleMul() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2830:2: ( (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2831:2: (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2831:2: (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2832:3: otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMulAccess().getMulKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMulAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMulAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2844:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2845:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2845:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2846:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMulAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getMulAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2867:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2868:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2868:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2869:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMulAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMulAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMul"


    // $ANTLR start "entryRuleLEq"
    // InternalRobotScript.g:2894:1: entryRuleLEq returns [EObject current=null] : iv_ruleLEq= ruleLEq EOF ;
    public final EObject entryRuleLEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEq = null;


        try {
            // InternalRobotScript.g:2894:44: (iv_ruleLEq= ruleLEq EOF )
            // InternalRobotScript.g:2895:2: iv_ruleLEq= ruleLEq EOF
            {
             newCompositeNode(grammarAccess.getLEqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEq=ruleLEq();

            state._fsp--;

             current =iv_ruleLEq; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLEq"


    // $ANTLR start "ruleLEq"
    // InternalRobotScript.g:2901:1: ruleLEq returns [EObject current=null] : (otherlv_0= 'LEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2907:2: ( (otherlv_0= 'LEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2908:2: (otherlv_0= 'LEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2908:2: (otherlv_0= 'LEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2909:3: otherlv_0= 'LEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLEqAccess().getLEqKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getLEqAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getLEqAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2921:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2922:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2922:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:2923:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLEqAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLEqRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLEqAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:2944:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:2945:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:2945:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:2946:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLEqAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLEqRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLEqAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLEq"


    // $ANTLR start "entryRuleNEq"
    // InternalRobotScript.g:2971:1: entryRuleNEq returns [EObject current=null] : iv_ruleNEq= ruleNEq EOF ;
    public final EObject entryRuleNEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNEq = null;


        try {
            // InternalRobotScript.g:2971:44: (iv_ruleNEq= ruleNEq EOF )
            // InternalRobotScript.g:2972:2: iv_ruleNEq= ruleNEq EOF
            {
             newCompositeNode(grammarAccess.getNEqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNEq=ruleNEq();

            state._fsp--;

             current =iv_ruleNEq; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNEq"


    // $ANTLR start "ruleNEq"
    // InternalRobotScript.g:2978:1: ruleNEq returns [EObject current=null] : (otherlv_0= 'NEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleNEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2984:2: ( (otherlv_0= 'NEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:2985:2: (otherlv_0= 'NEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:2985:2: (otherlv_0= 'NEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:2986:3: otherlv_0= 'NEq' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNEqAccess().getNEqKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getNEqAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNEqAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:2998:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:2999:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2999:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:3000:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNEqAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNEqRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getNEqAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:3021:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:3022:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:3022:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:3023:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNEqAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNEqRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNEqAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleNEq"


    // $ANTLR start "entryRuleDiv"
    // InternalRobotScript.g:3048:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalRobotScript.g:3048:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalRobotScript.g:3049:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalRobotScript.g:3055:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rightOp_3_0 = null;

        EObject lv_leftOp_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:3061:2: ( (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:3062:2: (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:3062:2: (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:3063:3: otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'rightOp' ( (lv_rightOp_3_0= ruleExpression ) ) otherlv_4= 'leftOp' ( (lv_leftOp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDivAccess().getRightOpKeyword_2());
            		
            // InternalRobotScript.g:3075:3: ( (lv_rightOp_3_0= ruleExpression ) )
            // InternalRobotScript.g:3076:4: (lv_rightOp_3_0= ruleExpression )
            {
            // InternalRobotScript.g:3076:4: (lv_rightOp_3_0= ruleExpression )
            // InternalRobotScript.g:3077:5: lv_rightOp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDivAccess().getRightOpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_rightOp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivRule());
            					}
            					set(
            						current,
            						"rightOp",
            						lv_rightOp_3_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getDivAccess().getLeftOpKeyword_4());
            		
            // InternalRobotScript.g:3098:3: ( (lv_leftOp_5_0= ruleExpression ) )
            // InternalRobotScript.g:3099:4: (lv_leftOp_5_0= ruleExpression )
            {
            // InternalRobotScript.g:3099:4: (lv_leftOp_5_0= ruleExpression )
            // InternalRobotScript.g:3100:5: lv_leftOp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDivAccess().getLeftOpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_leftOp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivRule());
            					}
            					set(
            						current,
            						"leftOp",
            						lv_leftOp_5_0,
            						"robotScript.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDivAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleTimeSensor"
    // InternalRobotScript.g:3125:1: entryRuleTimeSensor returns [EObject current=null] : iv_ruleTimeSensor= ruleTimeSensor EOF ;
    public final EObject entryRuleTimeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSensor = null;


        try {
            // InternalRobotScript.g:3125:51: (iv_ruleTimeSensor= ruleTimeSensor EOF )
            // InternalRobotScript.g:3126:2: iv_ruleTimeSensor= ruleTimeSensor EOF
            {
             newCompositeNode(grammarAccess.getTimeSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSensor=ruleTimeSensor();

            state._fsp--;

             current =iv_ruleTimeSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeSensor"


    // $ANTLR start "ruleTimeSensor"
    // InternalRobotScript.g:3132:1: ruleTimeSensor returns [EObject current=null] : ( () otherlv_1= 'TimeSensor' ) ;
    public final EObject ruleTimeSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3138:2: ( ( () otherlv_1= 'TimeSensor' ) )
            // InternalRobotScript.g:3139:2: ( () otherlv_1= 'TimeSensor' )
            {
            // InternalRobotScript.g:3139:2: ( () otherlv_1= 'TimeSensor' )
            // InternalRobotScript.g:3140:3: () otherlv_1= 'TimeSensor'
            {
            // InternalRobotScript.g:3140:3: ()
            // InternalRobotScript.g:3141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeSensorAccess().getTimeSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeSensorAccess().getTimeSensorKeyword_1());
            		

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
    // $ANTLR end "ruleTimeSensor"


    // $ANTLR start "entryRuleDistSensor"
    // InternalRobotScript.g:3155:1: entryRuleDistSensor returns [EObject current=null] : iv_ruleDistSensor= ruleDistSensor EOF ;
    public final EObject entryRuleDistSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistSensor = null;


        try {
            // InternalRobotScript.g:3155:51: (iv_ruleDistSensor= ruleDistSensor EOF )
            // InternalRobotScript.g:3156:2: iv_ruleDistSensor= ruleDistSensor EOF
            {
             newCompositeNode(grammarAccess.getDistSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistSensor=ruleDistSensor();

            state._fsp--;

             current =iv_ruleDistSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDistSensor"


    // $ANTLR start "ruleDistSensor"
    // InternalRobotScript.g:3162:1: ruleDistSensor returns [EObject current=null] : ( () otherlv_1= 'DistSensor' ) ;
    public final EObject ruleDistSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3168:2: ( ( () otherlv_1= 'DistSensor' ) )
            // InternalRobotScript.g:3169:2: ( () otherlv_1= 'DistSensor' )
            {
            // InternalRobotScript.g:3169:2: ( () otherlv_1= 'DistSensor' )
            // InternalRobotScript.g:3170:3: () otherlv_1= 'DistSensor'
            {
            // InternalRobotScript.g:3170:3: ()
            // InternalRobotScript.g:3171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistSensorAccess().getDistSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDistSensorAccess().getDistSensorKeyword_1());
            		

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
    // $ANTLR end "ruleDistSensor"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalRobotScript.g:3185:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalRobotScript.g:3185:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalRobotScript.g:3186:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalRobotScript.g:3192:1: ruleBoolLiteral returns [EObject current=null] : ( () otherlv_1= 'BoolLiteral' ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3198:2: ( ( () otherlv_1= 'BoolLiteral' ) )
            // InternalRobotScript.g:3199:2: ( () otherlv_1= 'BoolLiteral' )
            {
            // InternalRobotScript.g:3199:2: ( () otherlv_1= 'BoolLiteral' )
            // InternalRobotScript.g:3200:3: () otherlv_1= 'BoolLiteral'
            {
            // InternalRobotScript.g:3200:3: ()
            // InternalRobotScript.g:3201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_1());
            		

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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalRobotScript.g:3215:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalRobotScript.g:3215:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalRobotScript.g:3216:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalRobotScript.g:3222:1: ruleNumberLiteral returns [EObject current=null] : ( () otherlv_1= 'NumberLiteral' ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3228:2: ( ( () otherlv_1= 'NumberLiteral' ) )
            // InternalRobotScript.g:3229:2: ( () otherlv_1= 'NumberLiteral' )
            {
            // InternalRobotScript.g:3229:2: ( () otherlv_1= 'NumberLiteral' )
            // InternalRobotScript.g:3230:3: () otherlv_1= 'NumberLiteral'
            {
            // InternalRobotScript.g:3230:3: ()
            // InternalRobotScript.g:3231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberLiteralAccess().getNumberLiteralKeyword_1());
            		

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleSpeedState"
    // InternalRobotScript.g:3245:1: entryRuleSpeedState returns [EObject current=null] : iv_ruleSpeedState= ruleSpeedState EOF ;
    public final EObject entryRuleSpeedState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedState = null;


        try {
            // InternalRobotScript.g:3245:51: (iv_ruleSpeedState= ruleSpeedState EOF )
            // InternalRobotScript.g:3246:2: iv_ruleSpeedState= ruleSpeedState EOF
            {
             newCompositeNode(grammarAccess.getSpeedStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeedState=ruleSpeedState();

            state._fsp--;

             current =iv_ruleSpeedState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpeedState"


    // $ANTLR start "ruleSpeedState"
    // InternalRobotScript.g:3252:1: ruleSpeedState returns [EObject current=null] : ( () otherlv_1= 'SpeedState' ) ;
    public final EObject ruleSpeedState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3258:2: ( ( () otherlv_1= 'SpeedState' ) )
            // InternalRobotScript.g:3259:2: ( () otherlv_1= 'SpeedState' )
            {
            // InternalRobotScript.g:3259:2: ( () otherlv_1= 'SpeedState' )
            // InternalRobotScript.g:3260:3: () otherlv_1= 'SpeedState'
            {
            // InternalRobotScript.g:3260:3: ()
            // InternalRobotScript.g:3261:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedStateAccess().getSpeedStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedStateAccess().getSpeedStateKeyword_1());
            		

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
    // $ANTLR end "ruleSpeedState"


    // $ANTLR start "entryRuleVariable"
    // InternalRobotScript.g:3275:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRobotScript.g:3275:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRobotScript.g:3276:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalRobotScript.g:3282:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3288:2: ( (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:3289:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:3289:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRobotScript.g:3290:3: otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVarKeyword_2());
            		
            // InternalRobotScript.g:3302:3: ( ( ruleEString ) )
            // InternalRobotScript.g:3303:4: ( ruleEString )
            {
            // InternalRobotScript.g:3303:4: ( ruleEString )
            // InternalRobotScript.g:3304:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getVarVarDeclCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleUnit"
    // InternalRobotScript.g:3326:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'DM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'MM' ) ) ;
    public final Enumerator ruleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotScript.g:3332:2: ( ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'DM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'MM' ) ) )
            // InternalRobotScript.g:3333:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'DM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'MM' ) )
            {
            // InternalRobotScript.g:3333:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'DM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'MM' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt27=1;
                }
                break;
            case 69:
                {
                alt27=2;
                }
                break;
            case 70:
                {
                alt27=3;
                }
                break;
            case 71:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRobotScript.g:3334:3: (enumLiteral_0= 'M' )
                    {
                    // InternalRobotScript.g:3334:3: (enumLiteral_0= 'M' )
                    // InternalRobotScript.g:3335:4: enumLiteral_0= 'M'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:3342:3: (enumLiteral_1= 'DM' )
                    {
                    // InternalRobotScript.g:3342:3: (enumLiteral_1= 'DM' )
                    // InternalRobotScript.g:3343:4: enumLiteral_1= 'DM'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:3350:3: (enumLiteral_2= 'CM' )
                    {
                    // InternalRobotScript.g:3350:3: (enumLiteral_2= 'CM' )
                    // InternalRobotScript.g:3351:4: enumLiteral_2= 'CM'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:3358:3: (enumLiteral_3= 'MM' )
                    {
                    // InternalRobotScript.g:3358:3: (enumLiteral_3= 'MM' )
                    // InternalRobotScript.g:3359:4: enumLiteral_3= 'MM'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000FCA5A100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFF9AFCA5A100000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});

}