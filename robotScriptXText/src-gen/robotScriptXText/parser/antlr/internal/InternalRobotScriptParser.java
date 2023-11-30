package robotScriptXText.parser.antlr.internal;

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
import robotScriptXText.services.RobotScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EntryPoint'", "'{'", "'functions'", "','", "'}'", "'FunctionDef'", "'returnType'", "'block'", "'inputs'", "'Block'", "'stmts'", "'SimpleVarDecl'", "'type'", "'VoidType'", "'DataType'", "'AssignVar'", "'var'", "'expr'", "'SetSpeed'", "'unit'", "'speed'", "'Rotation'", "'Linear'", "'FunCall'", "'fun'", "'VarDeclInit'", "'LoopStmt'", "'stmt'", "'IfStmt'", "'ifstmt'", "'elsestmt'", "'ReturnStmt'", "'And'", "'exprs'", "'Add'", "'Or'", "'Sensor'", "'Literal'", "'Speed'", "'Variable'", "'Not'", "'Compare'", "'Mul'", "'AriUnOp'", "'m'", "'dm'", "'cm'", "'mm'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
                    							"robotScriptXText.RobotScript.FunctionDef");
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
                    	    								"robotScriptXText.RobotScript.FunctionDef");
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
    // InternalRobotScript.g:168:1: ruleAnyType returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_DataType_1= ruleDataType ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:174:2: ( (this_VoidType_0= ruleVoidType | this_DataType_1= ruleDataType ) )
            // InternalRobotScript.g:175:2: (this_VoidType_0= ruleVoidType | this_DataType_1= ruleDataType )
            {
            // InternalRobotScript.g:175:2: (this_VoidType_0= ruleVoidType | this_DataType_1= ruleDataType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
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
                    // InternalRobotScript.g:185:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getAnyTypeAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_1;
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


    // $ANTLR start "entryRuleStatement"
    // InternalRobotScript.g:197:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobotScript.g:197:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobotScript.g:198:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRobotScript.g:204:1: ruleStatement returns [EObject current=null] : (this_AssignVar_0= ruleAssignVar | this_SetSpeed_1= ruleSetSpeed | this_Rotation_2= ruleRotation | this_Linear_3= ruleLinear | this_FunCall_4= ruleFunCall | this_Block_5= ruleBlock | this_SimpleVarDecl_6= ruleSimpleVarDecl | this_VarDeclInit_7= ruleVarDeclInit | this_LoopStmt_8= ruleLoopStmt | this_IfStmt_9= ruleIfStmt | this_ReturnStmt_10= ruleReturnStmt ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssignVar_0 = null;

        EObject this_SetSpeed_1 = null;

        EObject this_Rotation_2 = null;

        EObject this_Linear_3 = null;

        EObject this_FunCall_4 = null;

        EObject this_Block_5 = null;

        EObject this_SimpleVarDecl_6 = null;

        EObject this_VarDeclInit_7 = null;

        EObject this_LoopStmt_8 = null;

        EObject this_IfStmt_9 = null;

        EObject this_ReturnStmt_10 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:210:2: ( (this_AssignVar_0= ruleAssignVar | this_SetSpeed_1= ruleSetSpeed | this_Rotation_2= ruleRotation | this_Linear_3= ruleLinear | this_FunCall_4= ruleFunCall | this_Block_5= ruleBlock | this_SimpleVarDecl_6= ruleSimpleVarDecl | this_VarDeclInit_7= ruleVarDeclInit | this_LoopStmt_8= ruleLoopStmt | this_IfStmt_9= ruleIfStmt | this_ReturnStmt_10= ruleReturnStmt ) )
            // InternalRobotScript.g:211:2: (this_AssignVar_0= ruleAssignVar | this_SetSpeed_1= ruleSetSpeed | this_Rotation_2= ruleRotation | this_Linear_3= ruleLinear | this_FunCall_4= ruleFunCall | this_Block_5= ruleBlock | this_SimpleVarDecl_6= ruleSimpleVarDecl | this_VarDeclInit_7= ruleVarDeclInit | this_LoopStmt_8= ruleLoopStmt | this_IfStmt_9= ruleIfStmt | this_ReturnStmt_10= ruleReturnStmt )
            {
            // InternalRobotScript.g:211:2: (this_AssignVar_0= ruleAssignVar | this_SetSpeed_1= ruleSetSpeed | this_Rotation_2= ruleRotation | this_Linear_3= ruleLinear | this_FunCall_4= ruleFunCall | this_Block_5= ruleBlock | this_SimpleVarDecl_6= ruleSimpleVarDecl | this_VarDeclInit_7= ruleVarDeclInit | this_LoopStmt_8= ruleLoopStmt | this_IfStmt_9= ruleIfStmt | this_ReturnStmt_10= ruleReturnStmt )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            case 34:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 22:
                {
                alt4=7;
                }
                break;
            case 36:
                {
                alt4=8;
                }
                break;
            case 37:
                {
                alt4=9;
                }
                break;
            case 39:
                {
                alt4=10;
                }
                break;
            case 42:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRobotScript.g:212:3: this_AssignVar_0= ruleAssignVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignVarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignVar_0=ruleAssignVar();

                    state._fsp--;


                    			current = this_AssignVar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:221:3: this_SetSpeed_1= ruleSetSpeed
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSetSpeedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetSpeed_1=ruleSetSpeed();

                    state._fsp--;


                    			current = this_SetSpeed_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:230:3: this_Rotation_2= ruleRotation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRotationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotation_2=ruleRotation();

                    state._fsp--;


                    			current = this_Rotation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:239:3: this_Linear_3= ruleLinear
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLinearParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linear_3=ruleLinear();

                    state._fsp--;


                    			current = this_Linear_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:248:3: this_FunCall_4= ruleFunCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunCall_4=ruleFunCall();

                    state._fsp--;


                    			current = this_FunCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:257:3: this_Block_5= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_5=ruleBlock();

                    state._fsp--;


                    			current = this_Block_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:266:3: this_SimpleVarDecl_6= ruleSimpleVarDecl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSimpleVarDeclParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleVarDecl_6=ruleSimpleVarDecl();

                    state._fsp--;


                    			current = this_SimpleVarDecl_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:275:3: this_VarDeclInit_7= ruleVarDeclInit
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarDeclInitParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDeclInit_7=ruleVarDeclInit();

                    state._fsp--;


                    			current = this_VarDeclInit_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotScript.g:284:3: this_LoopStmt_8= ruleLoopStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStmtParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStmt_8=ruleLoopStmt();

                    state._fsp--;


                    			current = this_LoopStmt_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotScript.g:293:3: this_IfStmt_9= ruleIfStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStmt_9=ruleIfStmt();

                    state._fsp--;


                    			current = this_IfStmt_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRobotScript.g:302:3: this_ReturnStmt_10= ruleReturnStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReturnStmt_10=ruleReturnStmt();

                    state._fsp--;


                    			current = this_ReturnStmt_10;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalRobotScript.g:314:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobotScript.g:314:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobotScript.g:315:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRobotScript.g:321:1: ruleExpression returns [EObject current=null] : (this_And_0= ruleAnd | this_Add_1= ruleAdd | this_Or_2= ruleOr | this_Sensor_3= ruleSensor | this_Literal_4= ruleLiteral | this_Speed_5= ruleSpeed | this_Variable_6= ruleVariable | this_FunCall_7= ruleFunCall | this_Not_8= ruleNot | this_Compare_9= ruleCompare | this_Mul_10= ruleMul | this_AriUnOp_11= ruleAriUnOp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Add_1 = null;

        EObject this_Or_2 = null;

        EObject this_Sensor_3 = null;

        EObject this_Literal_4 = null;

        EObject this_Speed_5 = null;

        EObject this_Variable_6 = null;

        EObject this_FunCall_7 = null;

        EObject this_Not_8 = null;

        EObject this_Compare_9 = null;

        EObject this_Mul_10 = null;

        EObject this_AriUnOp_11 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:327:2: ( (this_And_0= ruleAnd | this_Add_1= ruleAdd | this_Or_2= ruleOr | this_Sensor_3= ruleSensor | this_Literal_4= ruleLiteral | this_Speed_5= ruleSpeed | this_Variable_6= ruleVariable | this_FunCall_7= ruleFunCall | this_Not_8= ruleNot | this_Compare_9= ruleCompare | this_Mul_10= ruleMul | this_AriUnOp_11= ruleAriUnOp ) )
            // InternalRobotScript.g:328:2: (this_And_0= ruleAnd | this_Add_1= ruleAdd | this_Or_2= ruleOr | this_Sensor_3= ruleSensor | this_Literal_4= ruleLiteral | this_Speed_5= ruleSpeed | this_Variable_6= ruleVariable | this_FunCall_7= ruleFunCall | this_Not_8= ruleNot | this_Compare_9= ruleCompare | this_Mul_10= ruleMul | this_AriUnOp_11= ruleAriUnOp )
            {
            // InternalRobotScript.g:328:2: (this_And_0= ruleAnd | this_Add_1= ruleAdd | this_Or_2= ruleOr | this_Sensor_3= ruleSensor | this_Literal_4= ruleLiteral | this_Speed_5= ruleSpeed | this_Variable_6= ruleVariable | this_FunCall_7= ruleFunCall | this_Not_8= ruleNot | this_Compare_9= ruleCompare | this_Mul_10= ruleMul | this_AriUnOp_11= ruleAriUnOp )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 45:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                alt5=3;
                }
                break;
            case 47:
                {
                alt5=4;
                }
                break;
            case 48:
                {
                alt5=5;
                }
                break;
            case 49:
                {
                alt5=6;
                }
                break;
            case 50:
                {
                alt5=7;
                }
                break;
            case 34:
                {
                alt5=8;
                }
                break;
            case 51:
                {
                alt5=9;
                }
                break;
            case 52:
                {
                alt5=10;
                }
                break;
            case 53:
                {
                alt5=11;
                }
                break;
            case 54:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRobotScript.g:329:3: this_And_0= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;


                    			current = this_And_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:338:3: this_Add_1= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAddParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_1=ruleAdd();

                    state._fsp--;


                    			current = this_Add_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:347:3: this_Or_2= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_2=ruleOr();

                    state._fsp--;


                    			current = this_Or_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:356:3: this_Sensor_3= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSensorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_3=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:365:3: this_Literal_4= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:374:3: this_Speed_5= ruleSpeed
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSpeedParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speed_5=ruleSpeed();

                    state._fsp--;


                    			current = this_Speed_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:383:3: this_Variable_6= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_6=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:392:3: this_FunCall_7= ruleFunCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunCallParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunCall_7=ruleFunCall();

                    state._fsp--;


                    			current = this_FunCall_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotScript.g:401:3: this_Not_8= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNotParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_8=ruleNot();

                    state._fsp--;


                    			current = this_Not_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotScript.g:410:3: this_Compare_9= ruleCompare
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCompareParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compare_9=ruleCompare();

                    state._fsp--;


                    			current = this_Compare_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRobotScript.g:419:3: this_Mul_10= ruleMul
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
                    // InternalRobotScript.g:428:3: this_AriUnOp_11= ruleAriUnOp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAriUnOpParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriUnOp_11=ruleAriUnOp();

                    state._fsp--;


                    			current = this_AriUnOp_11;
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


    // $ANTLR start "entryRulePrimaryBoolExpr"
    // InternalRobotScript.g:440:1: entryRulePrimaryBoolExpr returns [EObject current=null] : iv_rulePrimaryBoolExpr= rulePrimaryBoolExpr EOF ;
    public final EObject entryRulePrimaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryBoolExpr = null;


        try {
            // InternalRobotScript.g:440:56: (iv_rulePrimaryBoolExpr= rulePrimaryBoolExpr EOF )
            // InternalRobotScript.g:441:2: iv_rulePrimaryBoolExpr= rulePrimaryBoolExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryBoolExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryBoolExpr=rulePrimaryBoolExpr();

            state._fsp--;

             current =iv_rulePrimaryBoolExpr; 
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
    // $ANTLR end "entryRulePrimaryBoolExpr"


    // $ANTLR start "rulePrimaryBoolExpr"
    // InternalRobotScript.g:447:1: rulePrimaryBoolExpr returns [EObject current=null] : (this_Not_0= ruleNot | this_Compare_1= ruleCompare ) ;
    public final EObject rulePrimaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Compare_1 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:453:2: ( (this_Not_0= ruleNot | this_Compare_1= ruleCompare ) )
            // InternalRobotScript.g:454:2: (this_Not_0= ruleNot | this_Compare_1= ruleCompare )
            {
            // InternalRobotScript.g:454:2: (this_Not_0= ruleNot | this_Compare_1= ruleCompare )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            else if ( (LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotScript.g:455:3: this_Not_0= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getPrimaryBoolExprAccess().getNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;


                    			current = this_Not_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:464:3: this_Compare_1= ruleCompare
                    {

                    			newCompositeNode(grammarAccess.getPrimaryBoolExprAccess().getCompareParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compare_1=ruleCompare();

                    state._fsp--;


                    			current = this_Compare_1;
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
    // $ANTLR end "rulePrimaryBoolExpr"


    // $ANTLR start "entryRulePrimaryAriExpr"
    // InternalRobotScript.g:476:1: entryRulePrimaryAriExpr returns [EObject current=null] : iv_rulePrimaryAriExpr= rulePrimaryAriExpr EOF ;
    public final EObject entryRulePrimaryAriExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryAriExpr = null;


        try {
            // InternalRobotScript.g:476:55: (iv_rulePrimaryAriExpr= rulePrimaryAriExpr EOF )
            // InternalRobotScript.g:477:2: iv_rulePrimaryAriExpr= rulePrimaryAriExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryAriExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryAriExpr=rulePrimaryAriExpr();

            state._fsp--;

             current =iv_rulePrimaryAriExpr; 
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
    // $ANTLR end "entryRulePrimaryAriExpr"


    // $ANTLR start "rulePrimaryAriExpr"
    // InternalRobotScript.g:483:1: rulePrimaryAriExpr returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Literal_1= ruleLiteral | this_Speed_2= ruleSpeed | this_Variable_3= ruleVariable | this_FunCall_4= ruleFunCall | this_AriUnOp_5= ruleAriUnOp ) ;
    public final EObject rulePrimaryAriExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Literal_1 = null;

        EObject this_Speed_2 = null;

        EObject this_Variable_3 = null;

        EObject this_FunCall_4 = null;

        EObject this_AriUnOp_5 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:489:2: ( (this_Sensor_0= ruleSensor | this_Literal_1= ruleLiteral | this_Speed_2= ruleSpeed | this_Variable_3= ruleVariable | this_FunCall_4= ruleFunCall | this_AriUnOp_5= ruleAriUnOp ) )
            // InternalRobotScript.g:490:2: (this_Sensor_0= ruleSensor | this_Literal_1= ruleLiteral | this_Speed_2= ruleSpeed | this_Variable_3= ruleVariable | this_FunCall_4= ruleFunCall | this_AriUnOp_5= ruleAriUnOp )
            {
            // InternalRobotScript.g:490:2: (this_Sensor_0= ruleSensor | this_Literal_1= ruleLiteral | this_Speed_2= ruleSpeed | this_Variable_3= ruleVariable | this_FunCall_4= ruleFunCall | this_AriUnOp_5= ruleAriUnOp )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            case 50:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            case 54:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRobotScript.g:491:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:500:3: this_Literal_1= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:509:3: this_Speed_2= ruleSpeed
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getSpeedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speed_2=ruleSpeed();

                    state._fsp--;


                    			current = this_Speed_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:518:3: this_Variable_3= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_3=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:527:3: this_FunCall_4= ruleFunCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getFunCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunCall_4=ruleFunCall();

                    state._fsp--;


                    			current = this_FunCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:536:3: this_AriUnOp_5= ruleAriUnOp
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAriExprAccess().getAriUnOpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriUnOp_5=ruleAriUnOp();

                    state._fsp--;


                    			current = this_AriUnOp_5;
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
    // $ANTLR end "rulePrimaryAriExpr"


    // $ANTLR start "entryRuleFunctionDef"
    // InternalRobotScript.g:548:1: entryRuleFunctionDef returns [EObject current=null] : iv_ruleFunctionDef= ruleFunctionDef EOF ;
    public final EObject entryRuleFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDef = null;


        try {
            // InternalRobotScript.g:548:52: (iv_ruleFunctionDef= ruleFunctionDef EOF )
            // InternalRobotScript.g:549:2: iv_ruleFunctionDef= ruleFunctionDef EOF
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
    // InternalRobotScript.g:555:1: ruleFunctionDef returns [EObject current=null] : (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) otherlv_5= 'block' ( (lv_block_6_0= ruleBlock ) ) (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleFunctionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_returnType_4_0 = null;

        EObject lv_block_6_0 = null;

        EObject lv_inputs_9_0 = null;

        EObject lv_inputs_11_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:561:2: ( (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) otherlv_5= 'block' ( (lv_block_6_0= ruleBlock ) ) (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalRobotScript.g:562:2: (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) otherlv_5= 'block' ( (lv_block_6_0= ruleBlock ) ) (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalRobotScript.g:562:2: (otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) otherlv_5= 'block' ( (lv_block_6_0= ruleBlock ) ) (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalRobotScript.g:563:3: otherlv_0= 'FunctionDef' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleAnyType ) ) otherlv_5= 'block' ( (lv_block_6_0= ruleBlock ) ) (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDefAccess().getFunctionDefKeyword_0());
            		
            // InternalRobotScript.g:567:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:568:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:568:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:569:5: lv_name_1_0= ruleEString
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
            						"robotScriptXText.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDefAccess().getReturnTypeKeyword_3());
            		
            // InternalRobotScript.g:594:3: ( (lv_returnType_4_0= ruleAnyType ) )
            // InternalRobotScript.g:595:4: (lv_returnType_4_0= ruleAnyType )
            {
            // InternalRobotScript.g:595:4: (lv_returnType_4_0= ruleAnyType )
            // InternalRobotScript.g:596:5: lv_returnType_4_0= ruleAnyType
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
            						"robotScriptXText.RobotScript.AnyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDefAccess().getBlockKeyword_5());
            		
            // InternalRobotScript.g:617:3: ( (lv_block_6_0= ruleBlock ) )
            // InternalRobotScript.g:618:4: (lv_block_6_0= ruleBlock )
            {
            // InternalRobotScript.g:618:4: (lv_block_6_0= ruleBlock )
            // InternalRobotScript.g:619:5: lv_block_6_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getFunctionDefAccess().getBlockBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_block_6_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_6_0,
            						"robotScriptXText.RobotScript.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:636:3: (otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobotScript.g:637:4: otherlv_7= 'inputs' otherlv_8= '{' ( (lv_inputs_9_0= ruleSimpleVarDecl ) ) (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionDefAccess().getInputsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRobotScript.g:645:4: ( (lv_inputs_9_0= ruleSimpleVarDecl ) )
                    // InternalRobotScript.g:646:5: (lv_inputs_9_0= ruleSimpleVarDecl )
                    {
                    // InternalRobotScript.g:646:5: (lv_inputs_9_0= ruleSimpleVarDecl )
                    // InternalRobotScript.g:647:6: lv_inputs_9_0= ruleSimpleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getInputsSimpleVarDeclParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_inputs_9_0=ruleSimpleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_9_0,
                    							"robotScriptXText.RobotScript.SimpleVarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:664:4: (otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRobotScript.g:665:5: otherlv_10= ',' ( (lv_inputs_11_0= ruleSimpleVarDecl ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFunctionDefAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRobotScript.g:669:5: ( (lv_inputs_11_0= ruleSimpleVarDecl ) )
                    	    // InternalRobotScript.g:670:6: (lv_inputs_11_0= ruleSimpleVarDecl )
                    	    {
                    	    // InternalRobotScript.g:670:6: (lv_inputs_11_0= ruleSimpleVarDecl )
                    	    // InternalRobotScript.g:671:7: lv_inputs_11_0= ruleSimpleVarDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefAccess().getInputsSimpleVarDeclParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_inputs_11_0=ruleSimpleVarDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_11_0,
                    	    								"robotScriptXText.RobotScript.SimpleVarDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRobotScript.g:702:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotScript.g:702:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotScript.g:703:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobotScript.g:709:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:715:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotScript.g:716:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotScript.g:716:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotScript.g:717:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:725:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleBlock"
    // InternalRobotScript.g:736:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRobotScript.g:736:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRobotScript.g:737:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRobotScript.g:743:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_stmts_5_0 = null;

        EObject lv_stmts_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:749:2: ( ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRobotScript.g:750:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRobotScript.g:750:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRobotScript.g:751:3: () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRobotScript.g:751:3: ()
            // InternalRobotScript.g:752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:766:3: (otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRobotScript.g:767:4: otherlv_3= 'stmts' otherlv_4= '{' ( (lv_stmts_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getStmtsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRobotScript.g:775:4: ( (lv_stmts_5_0= ruleStatement ) )
                    // InternalRobotScript.g:776:5: (lv_stmts_5_0= ruleStatement )
                    {
                    // InternalRobotScript.g:776:5: (lv_stmts_5_0= ruleStatement )
                    // InternalRobotScript.g:777:6: lv_stmts_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStmtsStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_stmts_5_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"stmts",
                    							lv_stmts_5_0,
                    							"robotScriptXText.RobotScript.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:794:4: (otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRobotScript.g:795:5: otherlv_6= ',' ( (lv_stmts_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRobotScript.g:799:5: ( (lv_stmts_7_0= ruleStatement ) )
                    	    // InternalRobotScript.g:800:6: (lv_stmts_7_0= ruleStatement )
                    	    {
                    	    // InternalRobotScript.g:800:6: (lv_stmts_7_0= ruleStatement )
                    	    // InternalRobotScript.g:801:7: lv_stmts_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getStmtsStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_stmts_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stmts",
                    	    								lv_stmts_7_0,
                    	    								"robotScriptXText.RobotScript.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleSimpleVarDecl"
    // InternalRobotScript.g:832:1: entryRuleSimpleVarDecl returns [EObject current=null] : iv_ruleSimpleVarDecl= ruleSimpleVarDecl EOF ;
    public final EObject entryRuleSimpleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleVarDecl = null;


        try {
            // InternalRobotScript.g:832:54: (iv_ruleSimpleVarDecl= ruleSimpleVarDecl EOF )
            // InternalRobotScript.g:833:2: iv_ruleSimpleVarDecl= ruleSimpleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getSimpleVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleVarDecl=ruleSimpleVarDecl();

            state._fsp--;

             current =iv_ruleSimpleVarDecl; 
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
    // $ANTLR end "entryRuleSimpleVarDecl"


    // $ANTLR start "ruleSimpleVarDecl"
    // InternalRobotScript.g:839:1: ruleSimpleVarDecl returns [EObject current=null] : (otherlv_0= 'SimpleVarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' ) ;
    public final EObject ruleSimpleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:845:2: ( (otherlv_0= 'SimpleVarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' ) )
            // InternalRobotScript.g:846:2: (otherlv_0= 'SimpleVarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' )
            {
            // InternalRobotScript.g:846:2: (otherlv_0= 'SimpleVarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}' )
            // InternalRobotScript.g:847:3: otherlv_0= 'SimpleVarDecl' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleVarDeclAccess().getSimpleVarDeclKeyword_0());
            		
            // InternalRobotScript.g:851:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:852:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:852:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:853:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleVarDeclAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleVarDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"robotScriptXText.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleVarDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleVarDeclAccess().getTypeKeyword_3());
            		
            // InternalRobotScript.g:878:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalRobotScript.g:879:4: (lv_type_4_0= ruleDataType )
            {
            // InternalRobotScript.g:879:4: (lv_type_4_0= ruleDataType )
            // InternalRobotScript.g:880:5: lv_type_4_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getSimpleVarDeclAccess().getTypeDataTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleVarDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"robotScriptXText.RobotScript.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleVarDeclAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSimpleVarDecl"


    // $ANTLR start "entryRuleVoidType"
    // InternalRobotScript.g:905:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalRobotScript.g:905:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalRobotScript.g:906:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalRobotScript.g:912:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'VoidType' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:918:2: ( ( () otherlv_1= 'VoidType' ) )
            // InternalRobotScript.g:919:2: ( () otherlv_1= 'VoidType' )
            {
            // InternalRobotScript.g:919:2: ( () otherlv_1= 'VoidType' )
            // InternalRobotScript.g:920:3: () otherlv_1= 'VoidType'
            {
            // InternalRobotScript.g:920:3: ()
            // InternalRobotScript.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDataType"
    // InternalRobotScript.g:935:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalRobotScript.g:935:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalRobotScript.g:936:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalRobotScript.g:942:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'DataType' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:948:2: ( ( () otherlv_1= 'DataType' ) )
            // InternalRobotScript.g:949:2: ( () otherlv_1= 'DataType' )
            {
            // InternalRobotScript.g:949:2: ( () otherlv_1= 'DataType' )
            // InternalRobotScript.g:950:3: () otherlv_1= 'DataType'
            {
            // InternalRobotScript.g:950:3: ()
            // InternalRobotScript.g:951:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getDataTypeKeyword_1());
            		

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


    // $ANTLR start "entryRuleAssignVar"
    // InternalRobotScript.g:965:1: entryRuleAssignVar returns [EObject current=null] : iv_ruleAssignVar= ruleAssignVar EOF ;
    public final EObject entryRuleAssignVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignVar = null;


        try {
            // InternalRobotScript.g:965:50: (iv_ruleAssignVar= ruleAssignVar EOF )
            // InternalRobotScript.g:966:2: iv_ruleAssignVar= ruleAssignVar EOF
            {
             newCompositeNode(grammarAccess.getAssignVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignVar=ruleAssignVar();

            state._fsp--;

             current =iv_ruleAssignVar; 
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
    // $ANTLR end "entryRuleAssignVar"


    // $ANTLR start "ruleAssignVar"
    // InternalRobotScript.g:972:1: ruleAssignVar returns [EObject current=null] : (otherlv_0= 'AssignVar' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAssignVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:978:2: ( (otherlv_0= 'AssignVar' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:979:2: (otherlv_0= 'AssignVar' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:979:2: (otherlv_0= 'AssignVar' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:980:3: otherlv_0= 'AssignVar' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignVarAccess().getAssignVarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignVarAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignVarAccess().getVarKeyword_2());
            		
            // InternalRobotScript.g:992:3: ( ( ruleEString ) )
            // InternalRobotScript.g:993:4: ( ruleEString )
            {
            // InternalRobotScript.g:993:4: ( ruleEString )
            // InternalRobotScript.g:994:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignVarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssignVarAccess().getVarVarDeclCrossReference_3_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getAssignVarAccess().getExprKeyword_4());
            		
            // InternalRobotScript.g:1012:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalRobotScript.g:1013:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1013:4: (lv_expr_5_0= ruleExpression )
            // InternalRobotScript.g:1014:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignVarAccess().getExprExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignVarRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignVarAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssignVar"


    // $ANTLR start "entryRuleSetSpeed"
    // InternalRobotScript.g:1039:1: entryRuleSetSpeed returns [EObject current=null] : iv_ruleSetSpeed= ruleSetSpeed EOF ;
    public final EObject entryRuleSetSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetSpeed = null;


        try {
            // InternalRobotScript.g:1039:49: (iv_ruleSetSpeed= ruleSetSpeed EOF )
            // InternalRobotScript.g:1040:2: iv_ruleSetSpeed= ruleSetSpeed EOF
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
    // InternalRobotScript.g:1046:1: ruleSetSpeed returns [EObject current=null] : (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'speed' ( (lv_speed_7_0= ruleSpeed ) ) otherlv_8= '}' ) ;
    public final EObject ruleSetSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_speed_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1052:2: ( (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'speed' ( (lv_speed_7_0= ruleSpeed ) ) otherlv_8= '}' ) )
            // InternalRobotScript.g:1053:2: (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'speed' ( (lv_speed_7_0= ruleSpeed ) ) otherlv_8= '}' )
            {
            // InternalRobotScript.g:1053:2: (otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'speed' ( (lv_speed_7_0= ruleSpeed ) ) otherlv_8= '}' )
            // InternalRobotScript.g:1054:3: otherlv_0= 'SetSpeed' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'speed' ( (lv_speed_7_0= ruleSpeed ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSetSpeedAccess().getSetSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSetSpeedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1062:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobotScript.g:1063:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetSpeedAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1067:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1068:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1068:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1069:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getSetSpeedAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetSpeedRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScriptXText.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSetSpeedAccess().getExprKeyword_3());
            		
            // InternalRobotScript.g:1091:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalRobotScript.g:1092:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1092:4: (lv_expr_5_0= ruleExpression )
            // InternalRobotScript.g:1093:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetSpeedAccess().getExprExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetSpeedRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getSetSpeedAccess().getSpeedKeyword_5());
            		
            // InternalRobotScript.g:1114:3: ( (lv_speed_7_0= ruleSpeed ) )
            // InternalRobotScript.g:1115:4: (lv_speed_7_0= ruleSpeed )
            {
            // InternalRobotScript.g:1115:4: (lv_speed_7_0= ruleSpeed )
            // InternalRobotScript.g:1116:5: lv_speed_7_0= ruleSpeed
            {

            					newCompositeNode(grammarAccess.getSetSpeedAccess().getSpeedSpeedParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_speed_7_0=ruleSpeed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetSpeedRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_7_0,
            						"robotScriptXText.RobotScript.Speed");
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
    // InternalRobotScript.g:1141:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalRobotScript.g:1141:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalRobotScript.g:1142:2: iv_ruleRotation= ruleRotation EOF
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
    // InternalRobotScript.g:1148:1: ruleRotation returns [EObject current=null] : (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1154:2: ( (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1155:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1155:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1156:3: otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationAccess().getRotationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationAccess().getExprKeyword_2());
            		
            // InternalRobotScript.g:1168:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalRobotScript.g:1169:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalRobotScript.g:1169:4: (lv_expr_3_0= ruleExpression )
            // InternalRobotScript.g:1170:5: lv_expr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"robotScriptXText.RobotScript.Expression");
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


    // $ANTLR start "entryRuleLinear"
    // InternalRobotScript.g:1195:1: entryRuleLinear returns [EObject current=null] : iv_ruleLinear= ruleLinear EOF ;
    public final EObject entryRuleLinear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinear = null;


        try {
            // InternalRobotScript.g:1195:47: (iv_ruleLinear= ruleLinear EOF )
            // InternalRobotScript.g:1196:2: iv_ruleLinear= ruleLinear EOF
            {
             newCompositeNode(grammarAccess.getLinearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinear=ruleLinear();

            state._fsp--;

             current =iv_ruleLinear; 
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
    // $ANTLR end "entryRuleLinear"


    // $ANTLR start "ruleLinear"
    // InternalRobotScript.g:1202:1: ruleLinear returns [EObject current=null] : (otherlv_0= 'Linear' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLinear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_3_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1208:2: ( (otherlv_0= 'Linear' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1209:2: (otherlv_0= 'Linear' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1209:2: (otherlv_0= 'Linear' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1210:3: otherlv_0= 'Linear' otherlv_1= '{' (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )? otherlv_4= 'expr' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinearAccess().getLinearKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLinearAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotScript.g:1218:3: (otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRobotScript.g:1219:4: otherlv_2= 'unit' ( (lv_unit_3_0= ruleUnit ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinearAccess().getUnitKeyword_2_0());
                    			
                    // InternalRobotScript.g:1223:4: ( (lv_unit_3_0= ruleUnit ) )
                    // InternalRobotScript.g:1224:5: (lv_unit_3_0= ruleUnit )
                    {
                    // InternalRobotScript.g:1224:5: (lv_unit_3_0= ruleUnit )
                    // InternalRobotScript.g:1225:6: lv_unit_3_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getLinearAccess().getUnitUnitEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinearRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_3_0,
                    							"robotScriptXText.RobotScript.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getLinearAccess().getExprKeyword_3());
            		
            // InternalRobotScript.g:1247:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalRobotScript.g:1248:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalRobotScript.g:1248:4: (lv_expr_5_0= ruleExpression )
            // InternalRobotScript.g:1249:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLinearAccess().getExprExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinearRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinearAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLinear"


    // $ANTLR start "entryRuleFunCall"
    // InternalRobotScript.g:1274:1: entryRuleFunCall returns [EObject current=null] : iv_ruleFunCall= ruleFunCall EOF ;
    public final EObject entryRuleFunCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunCall = null;


        try {
            // InternalRobotScript.g:1274:48: (iv_ruleFunCall= ruleFunCall EOF )
            // InternalRobotScript.g:1275:2: iv_ruleFunCall= ruleFunCall EOF
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
    // InternalRobotScript.g:1281:1: ruleFunCall returns [EObject current=null] : (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalRobotScript.g:1287:2: ( (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobotScript.g:1288:2: (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobotScript.g:1288:2: (otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobotScript.g:1289:3: otherlv_0= 'FunCall' otherlv_1= '{' otherlv_2= 'fun' ( ( ruleEString ) ) (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunCallAccess().getFunCallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getFunCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFunCallAccess().getFunKeyword_2());
            		
            // InternalRobotScript.g:1301:3: ( ( ruleEString ) )
            // InternalRobotScript.g:1302:4: ( ruleEString )
            {
            // InternalRobotScript.g:1302:4: ( ruleEString )
            // InternalRobotScript.g:1303:5: ruleEString
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

            // InternalRobotScript.g:1317:3: (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobotScript.g:1318:4: otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunCallAccess().getInputsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunCallAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobotScript.g:1326:4: ( (lv_inputs_6_0= ruleExpression ) )
                    // InternalRobotScript.g:1327:5: (lv_inputs_6_0= ruleExpression )
                    {
                    // InternalRobotScript.g:1327:5: (lv_inputs_6_0= ruleExpression )
                    // InternalRobotScript.g:1328:6: lv_inputs_6_0= ruleExpression
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
                    							"robotScriptXText.RobotScript.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:1345:4: (otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRobotScript.g:1346:5: otherlv_7= ',' ( (lv_inputs_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFunCallAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobotScript.g:1350:5: ( (lv_inputs_8_0= ruleExpression ) )
                    	    // InternalRobotScript.g:1351:6: (lv_inputs_8_0= ruleExpression )
                    	    {
                    	    // InternalRobotScript.g:1351:6: (lv_inputs_8_0= ruleExpression )
                    	    // InternalRobotScript.g:1352:7: lv_inputs_8_0= ruleExpression
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
                    	    								"robotScriptXText.RobotScript.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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


    // $ANTLR start "entryRuleVarDeclInit"
    // InternalRobotScript.g:1383:1: entryRuleVarDeclInit returns [EObject current=null] : iv_ruleVarDeclInit= ruleVarDeclInit EOF ;
    public final EObject entryRuleVarDeclInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclInit = null;


        try {
            // InternalRobotScript.g:1383:52: (iv_ruleVarDeclInit= ruleVarDeclInit EOF )
            // InternalRobotScript.g:1384:2: iv_ruleVarDeclInit= ruleVarDeclInit EOF
            {
             newCompositeNode(grammarAccess.getVarDeclInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclInit=ruleVarDeclInit();

            state._fsp--;

             current =iv_ruleVarDeclInit; 
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
    // $ANTLR end "entryRuleVarDeclInit"


    // $ANTLR start "ruleVarDeclInit"
    // InternalRobotScript.g:1390:1: ruleVarDeclInit returns [EObject current=null] : (otherlv_0= 'VarDeclInit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'expr' ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= '}' ) ;
    public final EObject ruleVarDeclInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1396:2: ( (otherlv_0= 'VarDeclInit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'expr' ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= '}' ) )
            // InternalRobotScript.g:1397:2: (otherlv_0= 'VarDeclInit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'expr' ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= '}' )
            {
            // InternalRobotScript.g:1397:2: (otherlv_0= 'VarDeclInit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'expr' ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= '}' )
            // InternalRobotScript.g:1398:3: otherlv_0= 'VarDeclInit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'expr' ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclInitAccess().getVarDeclInitKeyword_0());
            		
            // InternalRobotScript.g:1402:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:1403:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:1403:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:1404:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVarDeclInitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclInitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"robotScriptXText.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDeclInitAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclInitAccess().getTypeKeyword_3());
            		
            // InternalRobotScript.g:1429:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalRobotScript.g:1430:4: (lv_type_4_0= ruleDataType )
            {
            // InternalRobotScript.g:1430:4: (lv_type_4_0= ruleDataType )
            // InternalRobotScript.g:1431:5: lv_type_4_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVarDeclInitAccess().getTypeDataTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_4_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclInitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"robotScriptXText.RobotScript.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getVarDeclInitAccess().getExprKeyword_5());
            		
            // InternalRobotScript.g:1452:3: ( (lv_expr_6_0= ruleExpression ) )
            // InternalRobotScript.g:1453:4: (lv_expr_6_0= ruleExpression )
            {
            // InternalRobotScript.g:1453:4: (lv_expr_6_0= ruleExpression )
            // InternalRobotScript.g:1454:5: lv_expr_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVarDeclInitAccess().getExprExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclInitRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_6_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVarDeclInitAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVarDeclInit"


    // $ANTLR start "entryRuleLoopStmt"
    // InternalRobotScript.g:1479:1: entryRuleLoopStmt returns [EObject current=null] : iv_ruleLoopStmt= ruleLoopStmt EOF ;
    public final EObject entryRuleLoopStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStmt = null;


        try {
            // InternalRobotScript.g:1479:49: (iv_ruleLoopStmt= ruleLoopStmt EOF )
            // InternalRobotScript.g:1480:2: iv_ruleLoopStmt= ruleLoopStmt EOF
            {
             newCompositeNode(grammarAccess.getLoopStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStmt=ruleLoopStmt();

            state._fsp--;

             current =iv_ruleLoopStmt; 
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
    // $ANTLR end "entryRuleLoopStmt"


    // $ANTLR start "ruleLoopStmt"
    // InternalRobotScript.g:1486:1: ruleLoopStmt returns [EObject current=null] : (otherlv_0= 'LoopStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'stmt' ( (lv_stmt_5_0= ruleStatement ) ) otherlv_6= '}' ) ;
    public final EObject ruleLoopStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_3_0 = null;

        EObject lv_stmt_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1492:2: ( (otherlv_0= 'LoopStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'stmt' ( (lv_stmt_5_0= ruleStatement ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1493:2: (otherlv_0= 'LoopStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'stmt' ( (lv_stmt_5_0= ruleStatement ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1493:2: (otherlv_0= 'LoopStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'stmt' ( (lv_stmt_5_0= ruleStatement ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1494:3: otherlv_0= 'LoopStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'stmt' ( (lv_stmt_5_0= ruleStatement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStmtAccess().getLoopStmtKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStmtAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStmtAccess().getExprKeyword_2());
            		
            // InternalRobotScript.g:1506:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalRobotScript.g:1507:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalRobotScript.g:1507:4: (lv_expr_3_0= ruleExpression )
            // InternalRobotScript.g:1508:5: lv_expr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLoopStmtAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopStmtAccess().getStmtKeyword_4());
            		
            // InternalRobotScript.g:1529:3: ( (lv_stmt_5_0= ruleStatement ) )
            // InternalRobotScript.g:1530:4: (lv_stmt_5_0= ruleStatement )
            {
            // InternalRobotScript.g:1530:4: (lv_stmt_5_0= ruleStatement )
            // InternalRobotScript.g:1531:5: lv_stmt_5_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getLoopStmtAccess().getStmtStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_stmt_5_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStmtRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_5_0,
            						"robotScriptXText.RobotScript.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopStmtAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoopStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalRobotScript.g:1556:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalRobotScript.g:1556:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalRobotScript.g:1557:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalRobotScript.g:1563:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'IfStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'ifstmt' ( (lv_ifstmt_5_0= ruleStatement ) ) (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expr_3_0 = null;

        EObject lv_ifstmt_5_0 = null;

        EObject lv_elsestmt_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1569:2: ( (otherlv_0= 'IfStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'ifstmt' ( (lv_ifstmt_5_0= ruleStatement ) ) (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )? otherlv_8= '}' ) )
            // InternalRobotScript.g:1570:2: (otherlv_0= 'IfStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'ifstmt' ( (lv_ifstmt_5_0= ruleStatement ) ) (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )? otherlv_8= '}' )
            {
            // InternalRobotScript.g:1570:2: (otherlv_0= 'IfStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'ifstmt' ( (lv_ifstmt_5_0= ruleStatement ) ) (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )? otherlv_8= '}' )
            // InternalRobotScript.g:1571:3: otherlv_0= 'IfStmt' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= 'ifstmt' ( (lv_ifstmt_5_0= ruleStatement ) ) (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfStmtKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStmtAccess().getExprKeyword_2());
            		
            // InternalRobotScript.g:1583:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalRobotScript.g:1584:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalRobotScript.g:1584:4: (lv_expr_3_0= ruleExpression )
            // InternalRobotScript.g:1585:5: lv_expr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getIfstmtKeyword_4());
            		
            // InternalRobotScript.g:1606:3: ( (lv_ifstmt_5_0= ruleStatement ) )
            // InternalRobotScript.g:1607:4: (lv_ifstmt_5_0= ruleStatement )
            {
            // InternalRobotScript.g:1607:4: (lv_ifstmt_5_0= ruleStatement )
            // InternalRobotScript.g:1608:5: lv_ifstmt_5_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getIfstmtStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_ifstmt_5_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"ifstmt",
            						lv_ifstmt_5_0,
            						"robotScriptXText.RobotScript.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1625:3: (otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobotScript.g:1626:4: otherlv_6= 'elsestmt' ( (lv_elsestmt_7_0= ruleStatement ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfStmtAccess().getElsestmtKeyword_6_0());
                    			
                    // InternalRobotScript.g:1630:4: ( (lv_elsestmt_7_0= ruleStatement ) )
                    // InternalRobotScript.g:1631:5: (lv_elsestmt_7_0= ruleStatement )
                    {
                    // InternalRobotScript.g:1631:5: (lv_elsestmt_7_0= ruleStatement )
                    // InternalRobotScript.g:1632:6: lv_elsestmt_7_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfStmtAccess().getElsestmtStatementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elsestmt_7_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    						}
                    						set(
                    							current,
                    							"elsestmt",
                    							lv_elsestmt_7_0,
                    							"robotScriptXText.RobotScript.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStmtAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleReturnStmt"
    // InternalRobotScript.g:1658:1: entryRuleReturnStmt returns [EObject current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final EObject entryRuleReturnStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStmt = null;


        try {
            // InternalRobotScript.g:1658:51: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalRobotScript.g:1659:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
             newCompositeNode(grammarAccess.getReturnStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;

             current =iv_ruleReturnStmt; 
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
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // InternalRobotScript.g:1665:1: ruleReturnStmt returns [EObject current=null] : ( () otherlv_1= 'ReturnStmt' otherlv_2= '{' (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleReturnStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1671:2: ( ( () otherlv_1= 'ReturnStmt' otherlv_2= '{' (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalRobotScript.g:1672:2: ( () otherlv_1= 'ReturnStmt' otherlv_2= '{' (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalRobotScript.g:1672:2: ( () otherlv_1= 'ReturnStmt' otherlv_2= '{' (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalRobotScript.g:1673:3: () otherlv_1= 'ReturnStmt' otherlv_2= '{' (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalRobotScript.g:1673:3: ()
            // InternalRobotScript.g:1674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnStmtAccess().getReturnStmtAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnStmtAccess().getReturnStmtKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnStmtAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:1688:3: (otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotScript.g:1689:4: otherlv_3= 'expr' ( (lv_expr_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getReturnStmtAccess().getExprKeyword_3_0());
                    			
                    // InternalRobotScript.g:1693:4: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalRobotScript.g:1694:5: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalRobotScript.g:1694:5: (lv_expr_4_0= ruleExpression )
                    // InternalRobotScript.g:1695:6: lv_expr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getReturnStmtAccess().getExprExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"robotScriptXText.RobotScript.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReturnStmtAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleAnd"
    // InternalRobotScript.g:1721:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobotScript.g:1721:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobotScript.g:1722:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalRobotScript.g:1728:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryBoolExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1734:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryBoolExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:1735:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryBoolExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:1735:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryBoolExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:1736:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryBoolExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getExprsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:1752:3: ( (lv_exprs_4_0= rulePrimaryBoolExpr ) )
            // InternalRobotScript.g:1753:4: (lv_exprs_4_0= rulePrimaryBoolExpr )
            {
            // InternalRobotScript.g:1753:4: (lv_exprs_4_0= rulePrimaryBoolExpr )
            // InternalRobotScript.g:1754:5: lv_exprs_4_0= rulePrimaryBoolExpr
            {

            					newCompositeNode(grammarAccess.getAndAccess().getExprsPrimaryBoolExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprs_4_0=rulePrimaryBoolExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"robotScriptXText.RobotScript.PrimaryBoolExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1771:3: (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRobotScript.g:1772:4: otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryBoolExpr ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_31); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAndAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:1776:4: ( (lv_exprs_6_0= rulePrimaryBoolExpr ) )
            	    // InternalRobotScript.g:1777:5: (lv_exprs_6_0= rulePrimaryBoolExpr )
            	    {
            	    // InternalRobotScript.g:1777:5: (lv_exprs_6_0= rulePrimaryBoolExpr )
            	    // InternalRobotScript.g:1778:6: lv_exprs_6_0= rulePrimaryBoolExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getExprsPrimaryBoolExprParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_exprs_6_0=rulePrimaryBoolExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"robotScriptXText.RobotScript.PrimaryBoolExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRobotScript.g:1808:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalRobotScript.g:1808:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalRobotScript.g:1809:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalRobotScript.g:1815:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleMul ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1821:2: ( (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleMul ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:1822:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleMul ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:1822:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleMul ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:1823:3: otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleMul ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getExprsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:1839:3: ( (lv_exprs_4_0= ruleMul ) )
            // InternalRobotScript.g:1840:4: (lv_exprs_4_0= ruleMul )
            {
            // InternalRobotScript.g:1840:4: (lv_exprs_4_0= ruleMul )
            // InternalRobotScript.g:1841:5: lv_exprs_4_0= ruleMul
            {

            					newCompositeNode(grammarAccess.getAddAccess().getExprsMulParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprs_4_0=ruleMul();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"robotScriptXText.RobotScript.Mul");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1858:3: (otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRobotScript.g:1859:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleMul ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_32); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAddAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:1863:4: ( (lv_exprs_6_0= ruleMul ) )
            	    // InternalRobotScript.g:1864:5: (lv_exprs_6_0= ruleMul )
            	    {
            	    // InternalRobotScript.g:1864:5: (lv_exprs_6_0= ruleMul )
            	    // InternalRobotScript.g:1865:6: lv_exprs_6_0= ruleMul
            	    {

            	    						newCompositeNode(grammarAccess.getAddAccess().getExprsMulParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_exprs_6_0=ruleMul();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"robotScriptXText.RobotScript.Mul");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAddAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleOr"
    // InternalRobotScript.g:1895:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRobotScript.g:1895:43: (iv_ruleOr= ruleOr EOF )
            // InternalRobotScript.g:1896:2: iv_ruleOr= ruleOr EOF
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
    // InternalRobotScript.g:1902:1: ruleOr returns [EObject current=null] : (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAnd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1908:2: ( (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAnd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:1909:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAnd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:1909:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAnd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:1910:3: otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAnd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOrAccess().getExprsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:1926:3: ( (lv_exprs_4_0= ruleAnd ) )
            // InternalRobotScript.g:1927:4: (lv_exprs_4_0= ruleAnd )
            {
            // InternalRobotScript.g:1927:4: (lv_exprs_4_0= ruleAnd )
            // InternalRobotScript.g:1928:5: lv_exprs_4_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getExprsAndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprs_4_0=ruleAnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"robotScriptXText.RobotScript.And");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1945:3: (otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRobotScript.g:1946:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleAnd ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOrAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:1950:4: ( (lv_exprs_6_0= ruleAnd ) )
            	    // InternalRobotScript.g:1951:5: (lv_exprs_6_0= ruleAnd )
            	    {
            	    // InternalRobotScript.g:1951:5: (lv_exprs_6_0= ruleAnd )
            	    // InternalRobotScript.g:1952:6: lv_exprs_6_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getExprsAndParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_exprs_6_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"robotScriptXText.RobotScript.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOrAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleSensor"
    // InternalRobotScript.g:1982:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalRobotScript.g:1982:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalRobotScript.g:1983:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalRobotScript.g:1989:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:1995:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalRobotScript.g:1996:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalRobotScript.g:1996:2: ( () otherlv_1= 'Sensor' )
            // InternalRobotScript.g:1997:3: () otherlv_1= 'Sensor'
            {
            // InternalRobotScript.g:1997:3: ()
            // InternalRobotScript.g:1998:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleLiteral"
    // InternalRobotScript.g:2012:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRobotScript.g:2012:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRobotScript.g:2013:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalRobotScript.g:2019:1: ruleLiteral returns [EObject current=null] : ( () otherlv_1= 'Literal' ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2025:2: ( ( () otherlv_1= 'Literal' ) )
            // InternalRobotScript.g:2026:2: ( () otherlv_1= 'Literal' )
            {
            // InternalRobotScript.g:2026:2: ( () otherlv_1= 'Literal' )
            // InternalRobotScript.g:2027:3: () otherlv_1= 'Literal'
            {
            // InternalRobotScript.g:2027:3: ()
            // InternalRobotScript.g:2028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralAccess().getLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getLiteralKeyword_1());
            		

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleSpeed"
    // InternalRobotScript.g:2042:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRobotScript.g:2042:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRobotScript.g:2043:2: iv_ruleSpeed= ruleSpeed EOF
            {
             newCompositeNode(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeed=ruleSpeed();

            state._fsp--;

             current =iv_ruleSpeed; 
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
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalRobotScript.g:2049:1: ruleSpeed returns [EObject current=null] : ( () otherlv_1= 'Speed' ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2055:2: ( ( () otherlv_1= 'Speed' ) )
            // InternalRobotScript.g:2056:2: ( () otherlv_1= 'Speed' )
            {
            // InternalRobotScript.g:2056:2: ( () otherlv_1= 'Speed' )
            // InternalRobotScript.g:2057:3: () otherlv_1= 'Speed'
            {
            // InternalRobotScript.g:2057:3: ()
            // InternalRobotScript.g:2058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedAccess().getSpeedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedAccess().getSpeedKeyword_1());
            		

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "entryRuleVariable"
    // InternalRobotScript.g:2072:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRobotScript.g:2072:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRobotScript.g:2073:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalRobotScript.g:2079:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2085:2: ( (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:2086:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:2086:2: (otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRobotScript.g:2087:3: otherlv_0= 'Variable' otherlv_1= '{' otherlv_2= 'var' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVarKeyword_2());
            		
            // InternalRobotScript.g:2099:3: ( ( ruleEString ) )
            // InternalRobotScript.g:2100:4: ( ruleEString )
            {
            // InternalRobotScript.g:2100:4: ( ruleEString )
            // InternalRobotScript.g:2101:5: ruleEString
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


    // $ANTLR start "entryRuleNot"
    // InternalRobotScript.g:2123:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobotScript.g:2123:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobotScript.g:2124:2: iv_ruleNot= ruleNot EOF
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
    // InternalRobotScript.g:2130:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleCompare ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2136:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleCompare ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:2137:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleCompare ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:2137:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleCompare ) ) otherlv_4= '}' )
            // InternalRobotScript.g:2138:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleCompare ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getExprKeyword_2());
            		
            // InternalRobotScript.g:2150:3: ( (lv_expr_3_0= ruleCompare ) )
            // InternalRobotScript.g:2151:4: (lv_expr_3_0= ruleCompare )
            {
            // InternalRobotScript.g:2151:4: (lv_expr_3_0= ruleCompare )
            // InternalRobotScript.g:2152:5: lv_expr_3_0= ruleCompare
            {

            					newCompositeNode(grammarAccess.getNotAccess().getExprCompareParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_3_0=ruleCompare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"robotScriptXText.RobotScript.Compare");
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


    // $ANTLR start "entryRuleCompare"
    // InternalRobotScript.g:2177:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalRobotScript.g:2177:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalRobotScript.g:2178:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalRobotScript.g:2184:1: ruleCompare returns [EObject current=null] : (otherlv_0= 'Compare' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAdd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2190:2: ( (otherlv_0= 'Compare' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAdd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:2191:2: (otherlv_0= 'Compare' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAdd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:2191:2: (otherlv_0= 'Compare' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAdd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:2192:3: otherlv_0= 'Compare' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= ruleAdd ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getCompareKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCompareAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getExprsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getCompareAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:2208:3: ( (lv_exprs_4_0= ruleAdd ) )
            // InternalRobotScript.g:2209:4: (lv_exprs_4_0= ruleAdd )
            {
            // InternalRobotScript.g:2209:4: (lv_exprs_4_0= ruleAdd )
            // InternalRobotScript.g:2210:5: lv_exprs_4_0= ruleAdd
            {

            					newCompositeNode(grammarAccess.getCompareAccess().getExprsAddParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprs_4_0=ruleAdd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"robotScriptXText.RobotScript.Add");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:2227:3: (otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRobotScript.g:2228:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleAdd ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_35); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCompareAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:2232:4: ( (lv_exprs_6_0= ruleAdd ) )
            	    // InternalRobotScript.g:2233:5: (lv_exprs_6_0= ruleAdd )
            	    {
            	    // InternalRobotScript.g:2233:5: (lv_exprs_6_0= ruleAdd )
            	    // InternalRobotScript.g:2234:6: lv_exprs_6_0= ruleAdd
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getExprsAddParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_exprs_6_0=ruleAdd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"robotScriptXText.RobotScript.Add");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getCompareAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCompareAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleMul"
    // InternalRobotScript.g:2264:1: entryRuleMul returns [EObject current=null] : iv_ruleMul= ruleMul EOF ;
    public final EObject entryRuleMul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMul = null;


        try {
            // InternalRobotScript.g:2264:44: (iv_ruleMul= ruleMul EOF )
            // InternalRobotScript.g:2265:2: iv_ruleMul= ruleMul EOF
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
    // InternalRobotScript.g:2271:1: ruleMul returns [EObject current=null] : (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryAriExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleMul() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2277:2: ( (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryAriExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:2278:2: (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryAriExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:2278:2: (otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryAriExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:2279:3: otherlv_0= 'Mul' otherlv_1= '{' otherlv_2= 'exprs' otherlv_3= '{' ( (lv_exprs_4_0= rulePrimaryAriExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMulAccess().getMulKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMulAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMulAccess().getExprsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getMulAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:2295:3: ( (lv_exprs_4_0= rulePrimaryAriExpr ) )
            // InternalRobotScript.g:2296:4: (lv_exprs_4_0= rulePrimaryAriExpr )
            {
            // InternalRobotScript.g:2296:4: (lv_exprs_4_0= rulePrimaryAriExpr )
            // InternalRobotScript.g:2297:5: lv_exprs_4_0= rulePrimaryAriExpr
            {

            					newCompositeNode(grammarAccess.getMulAccess().getExprsPrimaryAriExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprs_4_0=rulePrimaryAriExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"robotScriptXText.RobotScript.PrimaryAriExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:2314:3: (otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRobotScript.g:2315:4: otherlv_5= ',' ( (lv_exprs_6_0= rulePrimaryAriExpr ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMulAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:2319:4: ( (lv_exprs_6_0= rulePrimaryAriExpr ) )
            	    // InternalRobotScript.g:2320:5: (lv_exprs_6_0= rulePrimaryAriExpr )
            	    {
            	    // InternalRobotScript.g:2320:5: (lv_exprs_6_0= rulePrimaryAriExpr )
            	    // InternalRobotScript.g:2321:6: lv_exprs_6_0= rulePrimaryAriExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMulAccess().getExprsPrimaryAriExprParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_exprs_6_0=rulePrimaryAriExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"robotScriptXText.RobotScript.PrimaryAriExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getMulAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMulAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleAriUnOp"
    // InternalRobotScript.g:2351:1: entryRuleAriUnOp returns [EObject current=null] : iv_ruleAriUnOp= ruleAriUnOp EOF ;
    public final EObject entryRuleAriUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAriUnOp = null;


        try {
            // InternalRobotScript.g:2351:48: (iv_ruleAriUnOp= ruleAriUnOp EOF )
            // InternalRobotScript.g:2352:2: iv_ruleAriUnOp= ruleAriUnOp EOF
            {
             newCompositeNode(grammarAccess.getAriUnOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAriUnOp=ruleAriUnOp();

            state._fsp--;

             current =iv_ruleAriUnOp; 
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
    // $ANTLR end "entryRuleAriUnOp"


    // $ANTLR start "ruleAriUnOp"
    // InternalRobotScript.g:2358:1: ruleAriUnOp returns [EObject current=null] : (otherlv_0= 'AriUnOp' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleAriUnOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2364:2: ( (otherlv_0= 'AriUnOp' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:2365:2: (otherlv_0= 'AriUnOp' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:2365:2: (otherlv_0= 'AriUnOp' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobotScript.g:2366:3: otherlv_0= 'AriUnOp' otherlv_1= '{' otherlv_2= 'expr' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAriUnOpAccess().getAriUnOpKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAriUnOpAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAriUnOpAccess().getExprKeyword_2());
            		
            // InternalRobotScript.g:2378:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalRobotScript.g:2379:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalRobotScript.g:2379:4: (lv_expr_3_0= ruleExpression )
            // InternalRobotScript.g:2380:5: lv_expr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAriUnOpAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAriUnOpRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"robotScriptXText.RobotScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAriUnOpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAriUnOp"


    // $ANTLR start "ruleUnit"
    // InternalRobotScript.g:2405:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'dm' ) | (enumLiteral_2= 'cm' ) | (enumLiteral_3= 'mm' ) ) ;
    public final Enumerator ruleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2411:2: ( ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'dm' ) | (enumLiteral_2= 'cm' ) | (enumLiteral_3= 'mm' ) ) )
            // InternalRobotScript.g:2412:2: ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'dm' ) | (enumLiteral_2= 'cm' ) | (enumLiteral_3= 'mm' ) )
            {
            // InternalRobotScript.g:2412:2: ( (enumLiteral_0= 'm' ) | (enumLiteral_1= 'dm' ) | (enumLiteral_2= 'cm' ) | (enumLiteral_3= 'mm' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 56:
                {
                alt24=2;
                }
                break;
            case 57:
                {
                alt24=3;
                }
                break;
            case 58:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRobotScript.g:2413:3: (enumLiteral_0= 'm' )
                    {
                    // InternalRobotScript.g:2413:3: (enumLiteral_0= 'm' )
                    // InternalRobotScript.g:2414:4: enumLiteral_0= 'm'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:2421:3: (enumLiteral_1= 'dm' )
                    {
                    // InternalRobotScript.g:2421:3: (enumLiteral_1= 'dm' )
                    // InternalRobotScript.g:2422:4: enumLiteral_1= 'dm'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getDmEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:2429:3: (enumLiteral_2= 'cm' )
                    {
                    // InternalRobotScript.g:2429:3: (enumLiteral_2= 'cm' )
                    // InternalRobotScript.g:2430:4: enumLiteral_2= 'cm'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:2437:3: (enumLiteral_3= 'mm' )
                    {
                    // InternalRobotScript.g:2437:3: (enumLiteral_3= 'mm' )
                    // InternalRobotScript.g:2438:4: enumLiteral_3= 'mm'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_3());
                    			

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000004B724500000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x007FE80400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});

}