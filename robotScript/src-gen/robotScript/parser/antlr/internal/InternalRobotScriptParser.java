package robotScript.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'command'", "','", "'}'", "'Rotation'", "'defvar'", "'Linear'", "'Clock'", "'UltraSound'", "'Speed'", "'Loop'", "'loopCondition'", "'body'", "'Switch'", "'switchCondition'", "'DefVar'", "'expressions'", "'units'", "'BoolVariables'", "'reference'", "'And'", "'left'", "'right'", "'Or'", "'Not'", "'operand'", "'BoolLiteral'", "'Add'", "'AriLiteral'", "'AriVariables'", "'Sub'", "'Neg'", "'Meter'", "'prefix'", "'Second'", "'Degree'", "'Mili'", "'Centi'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
        	return "Model";
       	}

       	@Override
       	protected RobotScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRobotScript.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRobotScript.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRobotScript.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRobotScript.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_command_5_0 = null;

        EObject lv_command_7_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:77:2: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRobotScript.g:78:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRobotScript.g:78:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRobotScript.g:79:3: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRobotScript.g:79:3: ()
            // InternalRobotScript.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:94:3: (otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotScript.g:95:4: otherlv_3= 'command' otherlv_4= '{' ( (lv_command_5_0= ruleCommand ) ) (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommandKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRobotScript.g:103:4: ( (lv_command_5_0= ruleCommand ) )
                    // InternalRobotScript.g:104:5: (lv_command_5_0= ruleCommand )
                    {
                    // InternalRobotScript.g:104:5: (lv_command_5_0= ruleCommand )
                    // InternalRobotScript.g:105:6: lv_command_5_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_command_5_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"command",
                    							lv_command_5_0,
                    							"robotScript.RobotScript.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotScript.g:122:4: (otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobotScript.g:123:5: otherlv_6= ',' ( (lv_command_7_0= ruleCommand ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRobotScript.g:127:5: ( (lv_command_7_0= ruleCommand ) )
                    	    // InternalRobotScript.g:128:6: (lv_command_7_0= ruleCommand )
                    	    {
                    	    // InternalRobotScript.g:128:6: (lv_command_7_0= ruleCommand )
                    	    // InternalRobotScript.g:129:7: lv_command_7_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_command_7_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"command",
                    	    								lv_command_7_0,
                    	    								"robotScript.RobotScript.Command");
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

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalRobotScript.g:160:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRobotScript.g:160:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRobotScript.g:161:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalRobotScript.g:167:1: ruleCommand returns [EObject current=null] : (this_Rotation_0= ruleRotation | this_Linear_1= ruleLinear | this_Clock_2= ruleClock | this_UltraSound_3= ruleUltraSound | this_Speed_4= ruleSpeed | this_Loop_5= ruleLoop | this_Switch_6= ruleSwitch | this_DefVar_7= ruleDefVar ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Rotation_0 = null;

        EObject this_Linear_1 = null;

        EObject this_Clock_2 = null;

        EObject this_UltraSound_3 = null;

        EObject this_Speed_4 = null;

        EObject this_Loop_5 = null;

        EObject this_Switch_6 = null;

        EObject this_DefVar_7 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:173:2: ( (this_Rotation_0= ruleRotation | this_Linear_1= ruleLinear | this_Clock_2= ruleClock | this_UltraSound_3= ruleUltraSound | this_Speed_4= ruleSpeed | this_Loop_5= ruleLoop | this_Switch_6= ruleSwitch | this_DefVar_7= ruleDefVar ) )
            // InternalRobotScript.g:174:2: (this_Rotation_0= ruleRotation | this_Linear_1= ruleLinear | this_Clock_2= ruleClock | this_UltraSound_3= ruleUltraSound | this_Speed_4= ruleSpeed | this_Loop_5= ruleLoop | this_Switch_6= ruleSwitch | this_DefVar_7= ruleDefVar )
            {
            // InternalRobotScript.g:174:2: (this_Rotation_0= ruleRotation | this_Linear_1= ruleLinear | this_Clock_2= ruleClock | this_UltraSound_3= ruleUltraSound | this_Speed_4= ruleSpeed | this_Loop_5= ruleLoop | this_Switch_6= ruleSwitch | this_DefVar_7= ruleDefVar )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobotScript.g:175:3: this_Rotation_0= ruleRotation
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotation_0=ruleRotation();

                    state._fsp--;


                    			current = this_Rotation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:184:3: this_Linear_1= ruleLinear
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLinearParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linear_1=ruleLinear();

                    state._fsp--;


                    			current = this_Linear_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:193:3: this_Clock_2= ruleClock
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClockParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clock_2=ruleClock();

                    state._fsp--;


                    			current = this_Clock_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:202:3: this_UltraSound_3= ruleUltraSound
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUltraSoundParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UltraSound_3=ruleUltraSound();

                    state._fsp--;


                    			current = this_UltraSound_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:211:3: this_Speed_4= ruleSpeed
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSpeedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speed_4=ruleSpeed();

                    state._fsp--;


                    			current = this_Speed_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:220:3: this_Loop_5= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLoopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_5=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:229:3: this_Switch_6= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSwitchParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_6=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:238:3: this_DefVar_7= ruleDefVar
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDefVarParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefVar_7=ruleDefVar();

                    state._fsp--;


                    			current = this_DefVar_7;
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


    // $ANTLR start "entryRuleBoolean"
    // InternalRobotScript.g:250:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalRobotScript.g:250:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRobotScript.g:251:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRobotScript.g:257:1: ruleBoolean returns [EObject current=null] : (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVariables_0 = null;

        EObject this_And_1 = null;

        EObject this_Or_2 = null;

        EObject this_Not_3 = null;

        EObject this_BoolLiteral_4 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:263:2: ( (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral ) )
            // InternalRobotScript.g:264:2: (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral )
            {
            // InternalRobotScript.g:264:2: (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 36:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRobotScript.g:265:3: this_BoolVariables_0= ruleBoolVariables
                    {

                    			newCompositeNode(grammarAccess.getBooleanAccess().getBoolVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVariables_0=ruleBoolVariables();

                    state._fsp--;


                    			current = this_BoolVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:274:3: this_And_1= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getBooleanAccess().getAndParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_1=ruleAnd();

                    state._fsp--;


                    			current = this_And_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:283:3: this_Or_2= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getBooleanAccess().getOrParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_2=ruleOr();

                    state._fsp--;


                    			current = this_Or_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:292:3: this_Not_3= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getBooleanAccess().getNotParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_3=ruleNot();

                    state._fsp--;


                    			current = this_Not_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:301:3: this_BoolLiteral_4= ruleBoolLiteral
                    {

                    			newCompositeNode(grammarAccess.getBooleanAccess().getBoolLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_4=ruleBoolLiteral();

                    state._fsp--;


                    			current = this_BoolLiteral_4;
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleExpressions"
    // InternalRobotScript.g:313:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


        try {
            // InternalRobotScript.g:313:52: (iv_ruleExpressions= ruleExpressions EOF )
            // InternalRobotScript.g:314:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
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
    // $ANTLR end "entryRuleExpressions"


    // $ANTLR start "ruleExpressions"
    // InternalRobotScript.g:320:1: ruleExpressions returns [EObject current=null] : (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral | this_Add_5= ruleAdd | this_AriLiteral_6= ruleAriLiteral | this_AriVariables_7= ruleAriVariables | this_Sub_8= ruleSub | this_Neg_9= ruleNeg ) ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_BoolVariables_0 = null;

        EObject this_And_1 = null;

        EObject this_Or_2 = null;

        EObject this_Not_3 = null;

        EObject this_BoolLiteral_4 = null;

        EObject this_Add_5 = null;

        EObject this_AriLiteral_6 = null;

        EObject this_AriVariables_7 = null;

        EObject this_Sub_8 = null;

        EObject this_Neg_9 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:326:2: ( (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral | this_Add_5= ruleAdd | this_AriLiteral_6= ruleAriLiteral | this_AriVariables_7= ruleAriVariables | this_Sub_8= ruleSub | this_Neg_9= ruleNeg ) )
            // InternalRobotScript.g:327:2: (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral | this_Add_5= ruleAdd | this_AriLiteral_6= ruleAriLiteral | this_AriVariables_7= ruleAriVariables | this_Sub_8= ruleSub | this_Neg_9= ruleNeg )
            {
            // InternalRobotScript.g:327:2: (this_BoolVariables_0= ruleBoolVariables | this_And_1= ruleAnd | this_Or_2= ruleOr | this_Not_3= ruleNot | this_BoolLiteral_4= ruleBoolLiteral | this_Add_5= ruleAdd | this_AriLiteral_6= ruleAriLiteral | this_AriVariables_7= ruleAriVariables | this_Sub_8= ruleSub | this_Neg_9= ruleNeg )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            case 40:
                {
                alt5=7;
                }
                break;
            case 41:
                {
                alt5=8;
                }
                break;
            case 42:
                {
                alt5=9;
                }
                break;
            case 43:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRobotScript.g:328:3: this_BoolVariables_0= ruleBoolVariables
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getBoolVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVariables_0=ruleBoolVariables();

                    state._fsp--;


                    			current = this_BoolVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:337:3: this_And_1= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getAndParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_1=ruleAnd();

                    state._fsp--;


                    			current = this_And_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:346:3: this_Or_2= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getOrParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_2=ruleOr();

                    state._fsp--;


                    			current = this_Or_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:355:3: this_Not_3= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getNotParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_3=ruleNot();

                    state._fsp--;


                    			current = this_Not_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:364:3: this_BoolLiteral_4= ruleBoolLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getBoolLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_4=ruleBoolLiteral();

                    state._fsp--;


                    			current = this_BoolLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotScript.g:373:3: this_Add_5= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getAddParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_5=ruleAdd();

                    state._fsp--;


                    			current = this_Add_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotScript.g:382:3: this_AriLiteral_6= ruleAriLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getAriLiteralParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriLiteral_6=ruleAriLiteral();

                    state._fsp--;


                    			current = this_AriLiteral_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotScript.g:391:3: this_AriVariables_7= ruleAriVariables
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getAriVariablesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriVariables_7=ruleAriVariables();

                    state._fsp--;


                    			current = this_AriVariables_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotScript.g:400:3: this_Sub_8= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getSubParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_8=ruleSub();

                    state._fsp--;


                    			current = this_Sub_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotScript.g:409:3: this_Neg_9= ruleNeg
                    {

                    			newCompositeNode(grammarAccess.getExpressionsAccess().getNegParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Neg_9=ruleNeg();

                    state._fsp--;


                    			current = this_Neg_9;
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
    // $ANTLR end "ruleExpressions"


    // $ANTLR start "entryRuleUnits"
    // InternalRobotScript.g:421:1: entryRuleUnits returns [EObject current=null] : iv_ruleUnits= ruleUnits EOF ;
    public final EObject entryRuleUnits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnits = null;


        try {
            // InternalRobotScript.g:421:46: (iv_ruleUnits= ruleUnits EOF )
            // InternalRobotScript.g:422:2: iv_ruleUnits= ruleUnits EOF
            {
             newCompositeNode(grammarAccess.getUnitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnits=ruleUnits();

            state._fsp--;

             current =iv_ruleUnits; 
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
    // $ANTLR end "entryRuleUnits"


    // $ANTLR start "ruleUnits"
    // InternalRobotScript.g:428:1: ruleUnits returns [EObject current=null] : (this_Meter_0= ruleMeter | this_Second_1= ruleSecond | this_Degree_2= ruleDegree ) ;
    public final EObject ruleUnits() throws RecognitionException {
        EObject current = null;

        EObject this_Meter_0 = null;

        EObject this_Second_1 = null;

        EObject this_Degree_2 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:434:2: ( (this_Meter_0= ruleMeter | this_Second_1= ruleSecond | this_Degree_2= ruleDegree ) )
            // InternalRobotScript.g:435:2: (this_Meter_0= ruleMeter | this_Second_1= ruleSecond | this_Degree_2= ruleDegree )
            {
            // InternalRobotScript.g:435:2: (this_Meter_0= ruleMeter | this_Second_1= ruleSecond | this_Degree_2= ruleDegree )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 47:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRobotScript.g:436:3: this_Meter_0= ruleMeter
                    {

                    			newCompositeNode(grammarAccess.getUnitsAccess().getMeterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Meter_0=ruleMeter();

                    state._fsp--;


                    			current = this_Meter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:445:3: this_Second_1= ruleSecond
                    {

                    			newCompositeNode(grammarAccess.getUnitsAccess().getSecondParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Second_1=ruleSecond();

                    state._fsp--;


                    			current = this_Second_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:454:3: this_Degree_2= ruleDegree
                    {

                    			newCompositeNode(grammarAccess.getUnitsAccess().getDegreeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Degree_2=ruleDegree();

                    state._fsp--;


                    			current = this_Degree_2;
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
    // $ANTLR end "ruleUnits"


    // $ANTLR start "entryRuleArithmetic"
    // InternalRobotScript.g:466:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalRobotScript.g:466:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalRobotScript.g:467:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
             newCompositeNode(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;

             current =iv_ruleArithmetic; 
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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalRobotScript.g:473:1: ruleArithmetic returns [EObject current=null] : (this_Add_0= ruleAdd | this_AriLiteral_1= ruleAriLiteral | this_AriVariables_2= ruleAriVariables | this_Sub_3= ruleSub | this_Neg_4= ruleNeg ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_AriLiteral_1 = null;

        EObject this_AriVariables_2 = null;

        EObject this_Sub_3 = null;

        EObject this_Neg_4 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:479:2: ( (this_Add_0= ruleAdd | this_AriLiteral_1= ruleAriLiteral | this_AriVariables_2= ruleAriVariables | this_Sub_3= ruleSub | this_Neg_4= ruleNeg ) )
            // InternalRobotScript.g:480:2: (this_Add_0= ruleAdd | this_AriLiteral_1= ruleAriLiteral | this_AriVariables_2= ruleAriVariables | this_Sub_3= ruleSub | this_Neg_4= ruleNeg )
            {
            // InternalRobotScript.g:480:2: (this_Add_0= ruleAdd | this_AriLiteral_1= ruleAriLiteral | this_AriVariables_2= ruleAriVariables | this_Sub_3= ruleSub | this_Neg_4= ruleNeg )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case 43:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRobotScript.g:481:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getArithmeticAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:490:3: this_AriLiteral_1= ruleAriLiteral
                    {

                    			newCompositeNode(grammarAccess.getArithmeticAccess().getAriLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriLiteral_1=ruleAriLiteral();

                    state._fsp--;


                    			current = this_AriLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotScript.g:499:3: this_AriVariables_2= ruleAriVariables
                    {

                    			newCompositeNode(grammarAccess.getArithmeticAccess().getAriVariablesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AriVariables_2=ruleAriVariables();

                    state._fsp--;


                    			current = this_AriVariables_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotScript.g:508:3: this_Sub_3= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getArithmeticAccess().getSubParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_3=ruleSub();

                    state._fsp--;


                    			current = this_Sub_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotScript.g:517:3: this_Neg_4= ruleNeg
                    {

                    			newCompositeNode(grammarAccess.getArithmeticAccess().getNegParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Neg_4=ruleNeg();

                    state._fsp--;


                    			current = this_Neg_4;
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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRulePrefix"
    // InternalRobotScript.g:529:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalRobotScript.g:529:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalRobotScript.g:530:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalRobotScript.g:536:1: rulePrefix returns [EObject current=null] : (this_Mili_0= ruleMili | this_Centi_1= ruleCenti ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        EObject this_Mili_0 = null;

        EObject this_Centi_1 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:542:2: ( (this_Mili_0= ruleMili | this_Centi_1= ruleCenti ) )
            // InternalRobotScript.g:543:2: (this_Mili_0= ruleMili | this_Centi_1= ruleCenti )
            {
            // InternalRobotScript.g:543:2: (this_Mili_0= ruleMili | this_Centi_1= ruleCenti )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            else if ( (LA8_0==49) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobotScript.g:544:3: this_Mili_0= ruleMili
                    {

                    			newCompositeNode(grammarAccess.getPrefixAccess().getMiliParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mili_0=ruleMili();

                    state._fsp--;


                    			current = this_Mili_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:553:3: this_Centi_1= ruleCenti
                    {

                    			newCompositeNode(grammarAccess.getPrefixAccess().getCentiParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Centi_1=ruleCenti();

                    state._fsp--;


                    			current = this_Centi_1;
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleRotation"
    // InternalRobotScript.g:565:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalRobotScript.g:565:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalRobotScript.g:566:2: iv_ruleRotation= ruleRotation EOF
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
    // InternalRobotScript.g:572:1: ruleRotation returns [EObject current=null] : (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defvar_4_0 = null;

        EObject lv_defvar_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:578:2: ( (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:579:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:579:2: (otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:580:3: otherlv_0= 'Rotation' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationAccess().getRotationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationAccess().getDefvarKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:596:3: ( (lv_defvar_4_0= ruleCommand ) )
            // InternalRobotScript.g:597:4: (lv_defvar_4_0= ruleCommand )
            {
            // InternalRobotScript.g:597:4: (lv_defvar_4_0= ruleCommand )
            // InternalRobotScript.g:598:5: lv_defvar_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getDefvarCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_defvar_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					add(
            						current,
            						"defvar",
            						lv_defvar_4_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:615:3: (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRobotScript.g:616:4: otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRotationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:620:4: ( (lv_defvar_6_0= ruleCommand ) )
            	    // InternalRobotScript.g:621:5: (lv_defvar_6_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:621:5: (lv_defvar_6_0= ruleCommand )
            	    // InternalRobotScript.g:622:6: lv_defvar_6_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getRotationAccess().getDefvarCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_defvar_6_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRotationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvar",
            	    							lv_defvar_6_0,
            	    							"robotScript.RobotScript.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRobotScript.g:652:1: entryRuleLinear returns [EObject current=null] : iv_ruleLinear= ruleLinear EOF ;
    public final EObject entryRuleLinear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinear = null;


        try {
            // InternalRobotScript.g:652:47: (iv_ruleLinear= ruleLinear EOF )
            // InternalRobotScript.g:653:2: iv_ruleLinear= ruleLinear EOF
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
    // InternalRobotScript.g:659:1: ruleLinear returns [EObject current=null] : (otherlv_0= 'Linear' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleLinear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defvar_4_0 = null;

        EObject lv_defvar_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:665:2: ( (otherlv_0= 'Linear' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:666:2: (otherlv_0= 'Linear' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:666:2: (otherlv_0= 'Linear' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:667:3: otherlv_0= 'Linear' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinearAccess().getLinearKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLinearAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLinearAccess().getDefvarKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLinearAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:683:3: ( (lv_defvar_4_0= ruleCommand ) )
            // InternalRobotScript.g:684:4: (lv_defvar_4_0= ruleCommand )
            {
            // InternalRobotScript.g:684:4: (lv_defvar_4_0= ruleCommand )
            // InternalRobotScript.g:685:5: lv_defvar_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getLinearAccess().getDefvarCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_defvar_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinearRule());
            					}
            					add(
            						current,
            						"defvar",
            						lv_defvar_4_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:702:3: (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRobotScript.g:703:4: otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLinearAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:707:4: ( (lv_defvar_6_0= ruleCommand ) )
            	    // InternalRobotScript.g:708:5: (lv_defvar_6_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:708:5: (lv_defvar_6_0= ruleCommand )
            	    // InternalRobotScript.g:709:6: lv_defvar_6_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getLinearAccess().getDefvarCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_defvar_6_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinearRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvar",
            	    							lv_defvar_6_0,
            	    							"robotScript.RobotScript.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLinearAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLinearAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleClock"
    // InternalRobotScript.g:739:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalRobotScript.g:739:46: (iv_ruleClock= ruleClock EOF )
            // InternalRobotScript.g:740:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
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
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalRobotScript.g:746:1: ruleClock returns [EObject current=null] : (otherlv_0= 'Clock' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defvar_4_0 = null;

        EObject lv_defvar_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:752:2: ( (otherlv_0= 'Clock' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:753:2: (otherlv_0= 'Clock' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:753:2: (otherlv_0= 'Clock' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:754:3: otherlv_0= 'Clock' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getClockAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getClockAccess().getDefvarKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:770:3: ( (lv_defvar_4_0= ruleCommand ) )
            // InternalRobotScript.g:771:4: (lv_defvar_4_0= ruleCommand )
            {
            // InternalRobotScript.g:771:4: (lv_defvar_4_0= ruleCommand )
            // InternalRobotScript.g:772:5: lv_defvar_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getClockAccess().getDefvarCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_defvar_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockRule());
            					}
            					add(
            						current,
            						"defvar",
            						lv_defvar_4_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:789:3: (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRobotScript.g:790:4: otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getClockAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:794:4: ( (lv_defvar_6_0= ruleCommand ) )
            	    // InternalRobotScript.g:795:5: (lv_defvar_6_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:795:5: (lv_defvar_6_0= ruleCommand )
            	    // InternalRobotScript.g:796:6: lv_defvar_6_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getClockAccess().getDefvarCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_defvar_6_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvar",
            	    							lv_defvar_6_0,
            	    							"robotScript.RobotScript.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getClockAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClockAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleUltraSound"
    // InternalRobotScript.g:826:1: entryRuleUltraSound returns [EObject current=null] : iv_ruleUltraSound= ruleUltraSound EOF ;
    public final EObject entryRuleUltraSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltraSound = null;


        try {
            // InternalRobotScript.g:826:51: (iv_ruleUltraSound= ruleUltraSound EOF )
            // InternalRobotScript.g:827:2: iv_ruleUltraSound= ruleUltraSound EOF
            {
             newCompositeNode(grammarAccess.getUltraSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUltraSound=ruleUltraSound();

            state._fsp--;

             current =iv_ruleUltraSound; 
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
    // $ANTLR end "entryRuleUltraSound"


    // $ANTLR start "ruleUltraSound"
    // InternalRobotScript.g:833:1: ruleUltraSound returns [EObject current=null] : (otherlv_0= 'UltraSound' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleUltraSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defvar_4_0 = null;

        EObject lv_defvar_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:839:2: ( (otherlv_0= 'UltraSound' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:840:2: (otherlv_0= 'UltraSound' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:840:2: (otherlv_0= 'UltraSound' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:841:3: otherlv_0= 'UltraSound' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUltraSoundAccess().getUltraSoundKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUltraSoundAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getUltraSoundAccess().getDefvarKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getUltraSoundAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:857:3: ( (lv_defvar_4_0= ruleCommand ) )
            // InternalRobotScript.g:858:4: (lv_defvar_4_0= ruleCommand )
            {
            // InternalRobotScript.g:858:4: (lv_defvar_4_0= ruleCommand )
            // InternalRobotScript.g:859:5: lv_defvar_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getUltraSoundAccess().getDefvarCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_defvar_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUltraSoundRule());
            					}
            					add(
            						current,
            						"defvar",
            						lv_defvar_4_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:876:3: (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRobotScript.g:877:4: otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUltraSoundAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:881:4: ( (lv_defvar_6_0= ruleCommand ) )
            	    // InternalRobotScript.g:882:5: (lv_defvar_6_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:882:5: (lv_defvar_6_0= ruleCommand )
            	    // InternalRobotScript.g:883:6: lv_defvar_6_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getUltraSoundAccess().getDefvarCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_defvar_6_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUltraSoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvar",
            	    							lv_defvar_6_0,
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

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getUltraSoundAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUltraSoundAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleUltraSound"


    // $ANTLR start "entryRuleSpeed"
    // InternalRobotScript.g:913:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRobotScript.g:913:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRobotScript.g:914:2: iv_ruleSpeed= ruleSpeed EOF
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
    // InternalRobotScript.g:920:1: ruleSpeed returns [EObject current=null] : (otherlv_0= 'Speed' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defvar_4_0 = null;

        EObject lv_defvar_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:926:2: ( (otherlv_0= 'Speed' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRobotScript.g:927:2: (otherlv_0= 'Speed' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRobotScript.g:927:2: (otherlv_0= 'Speed' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRobotScript.g:928:3: otherlv_0= 'Speed' otherlv_1= '{' otherlv_2= 'defvar' otherlv_3= '{' ( (lv_defvar_4_0= ruleCommand ) ) (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeedAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSpeedAccess().getDefvarKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSpeedAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotScript.g:944:3: ( (lv_defvar_4_0= ruleCommand ) )
            // InternalRobotScript.g:945:4: (lv_defvar_4_0= ruleCommand )
            {
            // InternalRobotScript.g:945:4: (lv_defvar_4_0= ruleCommand )
            // InternalRobotScript.g:946:5: lv_defvar_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getSpeedAccess().getDefvarCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_defvar_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpeedRule());
            					}
            					add(
            						current,
            						"defvar",
            						lv_defvar_4_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:963:3: (otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRobotScript.g:964:4: otherlv_5= ',' ( (lv_defvar_6_0= ruleCommand ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSpeedAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRobotScript.g:968:4: ( (lv_defvar_6_0= ruleCommand ) )
            	    // InternalRobotScript.g:969:5: (lv_defvar_6_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:969:5: (lv_defvar_6_0= ruleCommand )
            	    // InternalRobotScript.g:970:6: lv_defvar_6_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getSpeedAccess().getDefvarCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_defvar_6_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpeedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvar",
            	    							lv_defvar_6_0,
            	    							"robotScript.RobotScript.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSpeedAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSpeedAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleLoop"
    // InternalRobotScript.g:1000:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalRobotScript.g:1000:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalRobotScript.g:1001:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalRobotScript.g:1007:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'loopCondition' ( (lv_loopCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_loopCondition_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1013:2: ( (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'loopCondition' ( (lv_loopCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalRobotScript.g:1014:2: (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'loopCondition' ( (lv_loopCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalRobotScript.g:1014:2: (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'loopCondition' ( (lv_loopCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalRobotScript.g:1015:3: otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'loopCondition' ( (lv_loopCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLoopConditionKeyword_2());
            		
            // InternalRobotScript.g:1027:3: ( (lv_loopCondition_3_0= ruleBoolean ) )
            // InternalRobotScript.g:1028:4: (lv_loopCondition_3_0= ruleBoolean )
            {
            // InternalRobotScript.g:1028:4: (lv_loopCondition_3_0= ruleBoolean )
            // InternalRobotScript.g:1029:5: lv_loopCondition_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopConditionBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_loopCondition_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"loopCondition",
            						lv_loopCondition_3_0,
            						"robotScript.RobotScript.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getBodyKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRobotScript.g:1054:3: ( (lv_body_6_0= ruleCommand ) )
            // InternalRobotScript.g:1055:4: (lv_body_6_0= ruleCommand )
            {
            // InternalRobotScript.g:1055:4: (lv_body_6_0= ruleCommand )
            // InternalRobotScript.g:1056:5: lv_body_6_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getBodyCommandParserRuleCall_6_0());
            				
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

            // InternalRobotScript.g:1073:3: (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRobotScript.g:1074:4: otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getLoopAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRobotScript.g:1078:4: ( (lv_body_8_0= ruleCommand ) )
            	    // InternalRobotScript.g:1079:5: (lv_body_8_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:1079:5: (lv_body_8_0= ruleCommand )
            	    // InternalRobotScript.g:1080:6: lv_body_8_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getBodyCommandParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_body_8_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_8_0,
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

            otherlv_9=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleSwitch"
    // InternalRobotScript.g:1110:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalRobotScript.g:1110:47: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalRobotScript.g:1111:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalRobotScript.g:1117:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'Switch' otherlv_1= '{' otherlv_2= 'switchCondition' ( (lv_switchCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_switchCondition_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1123:2: ( (otherlv_0= 'Switch' otherlv_1= '{' otherlv_2= 'switchCondition' ( (lv_switchCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalRobotScript.g:1124:2: (otherlv_0= 'Switch' otherlv_1= '{' otherlv_2= 'switchCondition' ( (lv_switchCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalRobotScript.g:1124:2: (otherlv_0= 'Switch' otherlv_1= '{' otherlv_2= 'switchCondition' ( (lv_switchCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalRobotScript.g:1125:3: otherlv_0= 'Switch' otherlv_1= '{' otherlv_2= 'switchCondition' ( (lv_switchCondition_3_0= ruleBoolean ) ) otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getSwitchConditionKeyword_2());
            		
            // InternalRobotScript.g:1137:3: ( (lv_switchCondition_3_0= ruleBoolean ) )
            // InternalRobotScript.g:1138:4: (lv_switchCondition_3_0= ruleBoolean )
            {
            // InternalRobotScript.g:1138:4: (lv_switchCondition_3_0= ruleBoolean )
            // InternalRobotScript.g:1139:5: lv_switchCondition_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getSwitchAccess().getSwitchConditionBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_switchCondition_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchRule());
            					}
            					set(
            						current,
            						"switchCondition",
            						lv_switchCondition_3_0,
            						"robotScript.RobotScript.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getBodyKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRobotScript.g:1164:3: ( (lv_body_6_0= ruleCommand ) )
            // InternalRobotScript.g:1165:4: (lv_body_6_0= ruleCommand )
            {
            // InternalRobotScript.g:1165:4: (lv_body_6_0= ruleCommand )
            // InternalRobotScript.g:1166:5: lv_body_6_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getSwitchAccess().getBodyCommandParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_body_6_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchRule());
            					}
            					add(
            						current,
            						"body",
            						lv_body_6_0,
            						"robotScript.RobotScript.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1183:3: (otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRobotScript.g:1184:4: otherlv_7= ',' ( (lv_body_8_0= ruleCommand ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSwitchAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRobotScript.g:1188:4: ( (lv_body_8_0= ruleCommand ) )
            	    // InternalRobotScript.g:1189:5: (lv_body_8_0= ruleCommand )
            	    {
            	    // InternalRobotScript.g:1189:5: (lv_body_8_0= ruleCommand )
            	    // InternalRobotScript.g:1190:6: lv_body_8_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getSwitchAccess().getBodyCommandParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_body_8_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_8_0,
            	    							"robotScript.RobotScript.Command");
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

            			newLeafNode(otherlv_9, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleDefVar"
    // InternalRobotScript.g:1220:1: entryRuleDefVar returns [EObject current=null] : iv_ruleDefVar= ruleDefVar EOF ;
    public final EObject entryRuleDefVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefVar = null;


        try {
            // InternalRobotScript.g:1220:47: (iv_ruleDefVar= ruleDefVar EOF )
            // InternalRobotScript.g:1221:2: iv_ruleDefVar= ruleDefVar EOF
            {
             newCompositeNode(grammarAccess.getDefVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefVar=ruleDefVar();

            state._fsp--;

             current =iv_ruleDefVar; 
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
    // $ANTLR end "entryRuleDefVar"


    // $ANTLR start "ruleDefVar"
    // InternalRobotScript.g:1227:1: ruleDefVar returns [EObject current=null] : (otherlv_0= 'DefVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'expressions' ( (lv_expressions_4_0= ruleExpressions ) ) (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDefVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_units_6_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1233:2: ( (otherlv_0= 'DefVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'expressions' ( (lv_expressions_4_0= ruleExpressions ) ) (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )? otherlv_7= '}' ) )
            // InternalRobotScript.g:1234:2: (otherlv_0= 'DefVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'expressions' ( (lv_expressions_4_0= ruleExpressions ) ) (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )? otherlv_7= '}' )
            {
            // InternalRobotScript.g:1234:2: (otherlv_0= 'DefVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'expressions' ( (lv_expressions_4_0= ruleExpressions ) ) (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )? otherlv_7= '}' )
            // InternalRobotScript.g:1235:3: otherlv_0= 'DefVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'expressions' ( (lv_expressions_4_0= ruleExpressions ) ) (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDefVarAccess().getDefVarKeyword_0());
            		
            // InternalRobotScript.g:1239:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotScript.g:1240:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotScript.g:1240:4: (lv_name_1_0= ruleEString )
            // InternalRobotScript.g:1241:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDefVarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefVarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"robotScript.RobotScript.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDefVarAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDefVarAccess().getExpressionsKeyword_3());
            		
            // InternalRobotScript.g:1266:3: ( (lv_expressions_4_0= ruleExpressions ) )
            // InternalRobotScript.g:1267:4: (lv_expressions_4_0= ruleExpressions )
            {
            // InternalRobotScript.g:1267:4: (lv_expressions_4_0= ruleExpressions )
            // InternalRobotScript.g:1268:5: lv_expressions_4_0= ruleExpressions
            {

            					newCompositeNode(grammarAccess.getDefVarAccess().getExpressionsExpressionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressions_4_0=ruleExpressions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefVarRule());
            					}
            					set(
            						current,
            						"expressions",
            						lv_expressions_4_0,
            						"robotScript.RobotScript.Expressions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotScript.g:1285:3: (otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobotScript.g:1286:4: otherlv_5= 'units' ( (lv_units_6_0= ruleUnits ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getDefVarAccess().getUnitsKeyword_5_0());
                    			
                    // InternalRobotScript.g:1290:4: ( (lv_units_6_0= ruleUnits ) )
                    // InternalRobotScript.g:1291:5: (lv_units_6_0= ruleUnits )
                    {
                    // InternalRobotScript.g:1291:5: (lv_units_6_0= ruleUnits )
                    // InternalRobotScript.g:1292:6: lv_units_6_0= ruleUnits
                    {

                    						newCompositeNode(grammarAccess.getDefVarAccess().getUnitsUnitsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_units_6_0=ruleUnits();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefVarRule());
                    						}
                    						set(
                    							current,
                    							"units",
                    							lv_units_6_0,
                    							"robotScript.RobotScript.Units");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDefVarAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDefVar"


    // $ANTLR start "entryRuleBoolVariables"
    // InternalRobotScript.g:1318:1: entryRuleBoolVariables returns [EObject current=null] : iv_ruleBoolVariables= ruleBoolVariables EOF ;
    public final EObject entryRuleBoolVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariables = null;


        try {
            // InternalRobotScript.g:1318:54: (iv_ruleBoolVariables= ruleBoolVariables EOF )
            // InternalRobotScript.g:1319:2: iv_ruleBoolVariables= ruleBoolVariables EOF
            {
             newCompositeNode(grammarAccess.getBoolVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolVariables=ruleBoolVariables();

            state._fsp--;

             current =iv_ruleBoolVariables; 
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
    // $ANTLR end "entryRuleBoolVariables"


    // $ANTLR start "ruleBoolVariables"
    // InternalRobotScript.g:1325:1: ruleBoolVariables returns [EObject current=null] : (otherlv_0= 'BoolVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRobotScript.g:1331:2: ( (otherlv_0= 'BoolVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1332:2: (otherlv_0= 'BoolVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1332:2: (otherlv_0= 'BoolVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1333:3: otherlv_0= 'BoolVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolVariablesAccess().getBoolVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolVariablesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolVariablesAccess().getReferenceKeyword_2());
            		
            // InternalRobotScript.g:1345:3: ( ( ruleEString ) )
            // InternalRobotScript.g:1346:4: ( ruleEString )
            {
            // InternalRobotScript.g:1346:4: ( ruleEString )
            // InternalRobotScript.g:1347:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolVariablesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBoolVariablesAccess().getReferenceDefVarCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoolVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBoolVariables"


    // $ANTLR start "entryRuleAnd"
    // InternalRobotScript.g:1369:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobotScript.g:1369:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobotScript.g:1370:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalRobotScript.g:1376:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1382:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1383:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1383:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1384:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftKeyword_2());
            		
            // InternalRobotScript.g:1396:3: ( (lv_left_3_0= ruleBoolean ) )
            // InternalRobotScript.g:1397:4: (lv_left_3_0= ruleBoolean )
            {
            // InternalRobotScript.g:1397:4: (lv_left_3_0= ruleBoolean )
            // InternalRobotScript.g:1398:5: lv_left_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_left_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_3_0,
            						"robotScript.RobotScript.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getRightKeyword_4());
            		
            // InternalRobotScript.g:1419:3: ( (lv_right_5_0= ruleBoolean ) )
            // InternalRobotScript.g:1420:4: (lv_right_5_0= ruleBoolean )
            {
            // InternalRobotScript.g:1420:4: (lv_right_5_0= ruleBoolean )
            // InternalRobotScript.g:1421:5: lv_right_5_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_right_5_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_5_0,
            						"robotScript.RobotScript.Boolean");
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


    // $ANTLR start "entryRuleOr"
    // InternalRobotScript.g:1446:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRobotScript.g:1446:43: (iv_ruleOr= ruleOr EOF )
            // InternalRobotScript.g:1447:2: iv_ruleOr= ruleOr EOF
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
    // InternalRobotScript.g:1453:1: ruleOr returns [EObject current=null] : (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1459:2: ( (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1460:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1460:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1461:3: otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'left' ( (lv_left_3_0= ruleBoolean ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleBoolean ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOrAccess().getLeftKeyword_2());
            		
            // InternalRobotScript.g:1473:3: ( (lv_left_3_0= ruleBoolean ) )
            // InternalRobotScript.g:1474:4: (lv_left_3_0= ruleBoolean )
            {
            // InternalRobotScript.g:1474:4: (lv_left_3_0= ruleBoolean )
            // InternalRobotScript.g:1475:5: lv_left_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getOrAccess().getLeftBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_left_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_3_0,
            						"robotScript.RobotScript.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getOrAccess().getRightKeyword_4());
            		
            // InternalRobotScript.g:1496:3: ( (lv_right_5_0= ruleBoolean ) )
            // InternalRobotScript.g:1497:4: (lv_right_5_0= ruleBoolean )
            {
            // InternalRobotScript.g:1497:4: (lv_right_5_0= ruleBoolean )
            // InternalRobotScript.g:1498:5: lv_right_5_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getOrAccess().getRightBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_right_5_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_5_0,
            						"robotScript.RobotScript.Boolean");
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


    // $ANTLR start "entryRuleNot"
    // InternalRobotScript.g:1523:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobotScript.g:1523:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobotScript.g:1524:2: iv_ruleNot= ruleNot EOF
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
    // InternalRobotScript.g:1530:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1536:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1537:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1537:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1538:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getOperandKeyword_2());
            		
            // InternalRobotScript.g:1550:3: ( (lv_operand_3_0= ruleBoolean ) )
            // InternalRobotScript.g:1551:4: (lv_operand_3_0= ruleBoolean )
            {
            // InternalRobotScript.g:1551:4: (lv_operand_3_0= ruleBoolean )
            // InternalRobotScript.g:1552:5: lv_operand_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getNotAccess().getOperandBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operand_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_3_0,
            						"robotScript.RobotScript.Boolean");
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


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalRobotScript.g:1577:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalRobotScript.g:1577:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalRobotScript.g:1578:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalRobotScript.g:1584:1: ruleBoolLiteral returns [EObject current=null] : ( () otherlv_1= 'BoolLiteral' ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:1590:2: ( ( () otherlv_1= 'BoolLiteral' ) )
            // InternalRobotScript.g:1591:2: ( () otherlv_1= 'BoolLiteral' )
            {
            // InternalRobotScript.g:1591:2: ( () otherlv_1= 'BoolLiteral' )
            // InternalRobotScript.g:1592:3: () otherlv_1= 'BoolLiteral'
            {
            // InternalRobotScript.g:1592:3: ()
            // InternalRobotScript.g:1593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalRobotScript.g:1607:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotScript.g:1607:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotScript.g:1608:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobotScript.g:1614:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:1620:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotScript.g:1621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotScript.g:1621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobotScript.g:1622:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotScript.g:1630:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAdd"
    // InternalRobotScript.g:1641:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalRobotScript.g:1641:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalRobotScript.g:1642:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalRobotScript.g:1648:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_right_3_0 = null;

        EObject lv_left_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1654:2: ( (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1655:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1655:2: (otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1656:3: otherlv_0= 'Add' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getRightKeyword_2());
            		
            // InternalRobotScript.g:1668:3: ( (lv_right_3_0= ruleArithmetic ) )
            // InternalRobotScript.g:1669:4: (lv_right_3_0= ruleArithmetic )
            {
            // InternalRobotScript.g:1669:4: (lv_right_3_0= ruleArithmetic )
            // InternalRobotScript.g:1670:5: lv_right_3_0= ruleArithmetic
            {

            					newCompositeNode(grammarAccess.getAddAccess().getRightArithmeticParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_right_3_0=ruleArithmetic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"robotScript.RobotScript.Arithmetic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getLeftKeyword_4());
            		
            // InternalRobotScript.g:1691:3: ( (lv_left_5_0= ruleArithmetic ) )
            // InternalRobotScript.g:1692:4: (lv_left_5_0= ruleArithmetic )
            {
            // InternalRobotScript.g:1692:4: (lv_left_5_0= ruleArithmetic )
            // InternalRobotScript.g:1693:5: lv_left_5_0= ruleArithmetic
            {

            					newCompositeNode(grammarAccess.getAddAccess().getLeftArithmeticParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_5_0=ruleArithmetic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_5_0,
            						"robotScript.RobotScript.Arithmetic");
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


    // $ANTLR start "entryRuleAriLiteral"
    // InternalRobotScript.g:1718:1: entryRuleAriLiteral returns [EObject current=null] : iv_ruleAriLiteral= ruleAriLiteral EOF ;
    public final EObject entryRuleAriLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAriLiteral = null;


        try {
            // InternalRobotScript.g:1718:51: (iv_ruleAriLiteral= ruleAriLiteral EOF )
            // InternalRobotScript.g:1719:2: iv_ruleAriLiteral= ruleAriLiteral EOF
            {
             newCompositeNode(grammarAccess.getAriLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAriLiteral=ruleAriLiteral();

            state._fsp--;

             current =iv_ruleAriLiteral; 
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
    // $ANTLR end "entryRuleAriLiteral"


    // $ANTLR start "ruleAriLiteral"
    // InternalRobotScript.g:1725:1: ruleAriLiteral returns [EObject current=null] : ( () otherlv_1= 'AriLiteral' otherlv_2= '{' (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAriLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_units_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1731:2: ( ( () otherlv_1= 'AriLiteral' otherlv_2= '{' (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )? otherlv_5= '}' ) )
            // InternalRobotScript.g:1732:2: ( () otherlv_1= 'AriLiteral' otherlv_2= '{' (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )? otherlv_5= '}' )
            {
            // InternalRobotScript.g:1732:2: ( () otherlv_1= 'AriLiteral' otherlv_2= '{' (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )? otherlv_5= '}' )
            // InternalRobotScript.g:1733:3: () otherlv_1= 'AriLiteral' otherlv_2= '{' (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )? otherlv_5= '}'
            {
            // InternalRobotScript.g:1733:3: ()
            // InternalRobotScript.g:1734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAriLiteralAccess().getAriLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAriLiteralAccess().getAriLiteralKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAriLiteralAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:1748:3: (otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotScript.g:1749:4: otherlv_3= 'units' ( (lv_units_4_0= ruleUnits ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAriLiteralAccess().getUnitsKeyword_3_0());
                    			
                    // InternalRobotScript.g:1753:4: ( (lv_units_4_0= ruleUnits ) )
                    // InternalRobotScript.g:1754:5: (lv_units_4_0= ruleUnits )
                    {
                    // InternalRobotScript.g:1754:5: (lv_units_4_0= ruleUnits )
                    // InternalRobotScript.g:1755:6: lv_units_4_0= ruleUnits
                    {

                    						newCompositeNode(grammarAccess.getAriLiteralAccess().getUnitsUnitsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_units_4_0=ruleUnits();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAriLiteralRule());
                    						}
                    						set(
                    							current,
                    							"units",
                    							lv_units_4_0,
                    							"robotScript.RobotScript.Units");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAriLiteralAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAriLiteral"


    // $ANTLR start "entryRuleAriVariables"
    // InternalRobotScript.g:1781:1: entryRuleAriVariables returns [EObject current=null] : iv_ruleAriVariables= ruleAriVariables EOF ;
    public final EObject entryRuleAriVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAriVariables = null;


        try {
            // InternalRobotScript.g:1781:53: (iv_ruleAriVariables= ruleAriVariables EOF )
            // InternalRobotScript.g:1782:2: iv_ruleAriVariables= ruleAriVariables EOF
            {
             newCompositeNode(grammarAccess.getAriVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAriVariables=ruleAriVariables();

            state._fsp--;

             current =iv_ruleAriVariables; 
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
    // $ANTLR end "entryRuleAriVariables"


    // $ANTLR start "ruleAriVariables"
    // InternalRobotScript.g:1788:1: ruleAriVariables returns [EObject current=null] : (otherlv_0= 'AriVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleAriVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRobotScript.g:1794:2: ( (otherlv_0= 'AriVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1795:2: (otherlv_0= 'AriVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1795:2: (otherlv_0= 'AriVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1796:3: otherlv_0= 'AriVariables' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAriVariablesAccess().getAriVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAriVariablesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAriVariablesAccess().getReferenceKeyword_2());
            		
            // InternalRobotScript.g:1808:3: ( ( ruleEString ) )
            // InternalRobotScript.g:1809:4: ( ruleEString )
            {
            // InternalRobotScript.g:1809:4: ( ruleEString )
            // InternalRobotScript.g:1810:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAriVariablesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAriVariablesAccess().getReferenceDefVarCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAriVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAriVariables"


    // $ANTLR start "entryRuleSub"
    // InternalRobotScript.g:1832:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalRobotScript.g:1832:44: (iv_ruleSub= ruleSub EOF )
            // InternalRobotScript.g:1833:2: iv_ruleSub= ruleSub EOF
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
    // InternalRobotScript.g:1839:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_right_3_0 = null;

        EObject lv_left_5_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1845:2: ( (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' ) )
            // InternalRobotScript.g:1846:2: (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' )
            {
            // InternalRobotScript.g:1846:2: (otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}' )
            // InternalRobotScript.g:1847:3: otherlv_0= 'Sub' otherlv_1= '{' otherlv_2= 'right' ( (lv_right_3_0= ruleArithmetic ) ) otherlv_4= 'left' ( (lv_left_5_0= ruleArithmetic ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSubAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSubAccess().getRightKeyword_2());
            		
            // InternalRobotScript.g:1859:3: ( (lv_right_3_0= ruleArithmetic ) )
            // InternalRobotScript.g:1860:4: (lv_right_3_0= ruleArithmetic )
            {
            // InternalRobotScript.g:1860:4: (lv_right_3_0= ruleArithmetic )
            // InternalRobotScript.g:1861:5: lv_right_3_0= ruleArithmetic
            {

            					newCompositeNode(grammarAccess.getSubAccess().getRightArithmeticParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_right_3_0=ruleArithmetic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"robotScript.RobotScript.Arithmetic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSubAccess().getLeftKeyword_4());
            		
            // InternalRobotScript.g:1882:3: ( (lv_left_5_0= ruleArithmetic ) )
            // InternalRobotScript.g:1883:4: (lv_left_5_0= ruleArithmetic )
            {
            // InternalRobotScript.g:1883:4: (lv_left_5_0= ruleArithmetic )
            // InternalRobotScript.g:1884:5: lv_left_5_0= ruleArithmetic
            {

            					newCompositeNode(grammarAccess.getSubAccess().getLeftArithmeticParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_5_0=ruleArithmetic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_5_0,
            						"robotScript.RobotScript.Arithmetic");
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


    // $ANTLR start "entryRuleNeg"
    // InternalRobotScript.g:1909:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // InternalRobotScript.g:1909:44: (iv_ruleNeg= ruleNeg EOF )
            // InternalRobotScript.g:1910:2: iv_ruleNeg= ruleNeg EOF
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
    // InternalRobotScript.g:1916:1: ruleNeg returns [EObject current=null] : (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleArithmetic ) ) otherlv_4= '}' ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1922:2: ( (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleArithmetic ) ) otherlv_4= '}' ) )
            // InternalRobotScript.g:1923:2: (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleArithmetic ) ) otherlv_4= '}' )
            {
            // InternalRobotScript.g:1923:2: (otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleArithmetic ) ) otherlv_4= '}' )
            // InternalRobotScript.g:1924:3: otherlv_0= 'Neg' otherlv_1= '{' otherlv_2= 'operand' ( (lv_operand_3_0= ruleArithmetic ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegAccess().getNegKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getNegAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNegAccess().getOperandKeyword_2());
            		
            // InternalRobotScript.g:1936:3: ( (lv_operand_3_0= ruleArithmetic ) )
            // InternalRobotScript.g:1937:4: (lv_operand_3_0= ruleArithmetic )
            {
            // InternalRobotScript.g:1937:4: (lv_operand_3_0= ruleArithmetic )
            // InternalRobotScript.g:1938:5: lv_operand_3_0= ruleArithmetic
            {

            					newCompositeNode(grammarAccess.getNegAccess().getOperandArithmeticParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operand_3_0=ruleArithmetic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_3_0,
            						"robotScript.RobotScript.Arithmetic");
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


    // $ANTLR start "entryRuleMeter"
    // InternalRobotScript.g:1963:1: entryRuleMeter returns [EObject current=null] : iv_ruleMeter= ruleMeter EOF ;
    public final EObject entryRuleMeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeter = null;


        try {
            // InternalRobotScript.g:1963:46: (iv_ruleMeter= ruleMeter EOF )
            // InternalRobotScript.g:1964:2: iv_ruleMeter= ruleMeter EOF
            {
             newCompositeNode(grammarAccess.getMeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeter=ruleMeter();

            state._fsp--;

             current =iv_ruleMeter; 
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
    // $ANTLR end "entryRuleMeter"


    // $ANTLR start "ruleMeter"
    // InternalRobotScript.g:1970:1: ruleMeter returns [EObject current=null] : ( () otherlv_1= 'Meter' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_prefix_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:1976:2: ( ( () otherlv_1= 'Meter' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) )
            // InternalRobotScript.g:1977:2: ( () otherlv_1= 'Meter' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            {
            // InternalRobotScript.g:1977:2: ( () otherlv_1= 'Meter' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            // InternalRobotScript.g:1978:3: () otherlv_1= 'Meter' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}'
            {
            // InternalRobotScript.g:1978:3: ()
            // InternalRobotScript.g:1979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeterAccess().getMeterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMeterAccess().getMeterKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMeterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:1993:3: (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotScript.g:1994:4: otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeterAccess().getPrefixKeyword_3_0());
                    			
                    // InternalRobotScript.g:1998:4: ( (lv_prefix_4_0= rulePrefix ) )
                    // InternalRobotScript.g:1999:5: (lv_prefix_4_0= rulePrefix )
                    {
                    // InternalRobotScript.g:1999:5: (lv_prefix_4_0= rulePrefix )
                    // InternalRobotScript.g:2000:6: lv_prefix_4_0= rulePrefix
                    {

                    						newCompositeNode(grammarAccess.getMeterAccess().getPrefixPrefixParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_prefix_4_0=rulePrefix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeterRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_4_0,
                    							"robotScript.RobotScript.Prefix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMeterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMeter"


    // $ANTLR start "entryRuleSecond"
    // InternalRobotScript.g:2026:1: entryRuleSecond returns [EObject current=null] : iv_ruleSecond= ruleSecond EOF ;
    public final EObject entryRuleSecond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecond = null;


        try {
            // InternalRobotScript.g:2026:47: (iv_ruleSecond= ruleSecond EOF )
            // InternalRobotScript.g:2027:2: iv_ruleSecond= ruleSecond EOF
            {
             newCompositeNode(grammarAccess.getSecondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecond=ruleSecond();

            state._fsp--;

             current =iv_ruleSecond; 
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
    // $ANTLR end "entryRuleSecond"


    // $ANTLR start "ruleSecond"
    // InternalRobotScript.g:2033:1: ruleSecond returns [EObject current=null] : ( () otherlv_1= 'Second' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSecond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_prefix_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2039:2: ( ( () otherlv_1= 'Second' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) )
            // InternalRobotScript.g:2040:2: ( () otherlv_1= 'Second' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            {
            // InternalRobotScript.g:2040:2: ( () otherlv_1= 'Second' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            // InternalRobotScript.g:2041:3: () otherlv_1= 'Second' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}'
            {
            // InternalRobotScript.g:2041:3: ()
            // InternalRobotScript.g:2042:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecondAccess().getSecondAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSecondAccess().getSecondKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSecondAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:2056:3: (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobotScript.g:2057:4: otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecondAccess().getPrefixKeyword_3_0());
                    			
                    // InternalRobotScript.g:2061:4: ( (lv_prefix_4_0= rulePrefix ) )
                    // InternalRobotScript.g:2062:5: (lv_prefix_4_0= rulePrefix )
                    {
                    // InternalRobotScript.g:2062:5: (lv_prefix_4_0= rulePrefix )
                    // InternalRobotScript.g:2063:6: lv_prefix_4_0= rulePrefix
                    {

                    						newCompositeNode(grammarAccess.getSecondAccess().getPrefixPrefixParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_prefix_4_0=rulePrefix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecondRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_4_0,
                    							"robotScript.RobotScript.Prefix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSecondAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSecond"


    // $ANTLR start "entryRuleDegree"
    // InternalRobotScript.g:2089:1: entryRuleDegree returns [EObject current=null] : iv_ruleDegree= ruleDegree EOF ;
    public final EObject entryRuleDegree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegree = null;


        try {
            // InternalRobotScript.g:2089:47: (iv_ruleDegree= ruleDegree EOF )
            // InternalRobotScript.g:2090:2: iv_ruleDegree= ruleDegree EOF
            {
             newCompositeNode(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegree=ruleDegree();

            state._fsp--;

             current =iv_ruleDegree; 
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
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalRobotScript.g:2096:1: ruleDegree returns [EObject current=null] : ( () otherlv_1= 'Degree' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDegree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_prefix_4_0 = null;



        	enterRule();

        try {
            // InternalRobotScript.g:2102:2: ( ( () otherlv_1= 'Degree' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' ) )
            // InternalRobotScript.g:2103:2: ( () otherlv_1= 'Degree' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            {
            // InternalRobotScript.g:2103:2: ( () otherlv_1= 'Degree' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}' )
            // InternalRobotScript.g:2104:3: () otherlv_1= 'Degree' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? otherlv_5= '}'
            {
            // InternalRobotScript.g:2104:3: ()
            // InternalRobotScript.g:2105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDegreeAccess().getDegreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDegreeAccess().getDegreeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDegreeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotScript.g:2119:3: (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobotScript.g:2120:4: otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getDegreeAccess().getPrefixKeyword_3_0());
                    			
                    // InternalRobotScript.g:2124:4: ( (lv_prefix_4_0= rulePrefix ) )
                    // InternalRobotScript.g:2125:5: (lv_prefix_4_0= rulePrefix )
                    {
                    // InternalRobotScript.g:2125:5: (lv_prefix_4_0= rulePrefix )
                    // InternalRobotScript.g:2126:6: lv_prefix_4_0= rulePrefix
                    {

                    						newCompositeNode(grammarAccess.getDegreeAccess().getPrefixPrefixParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_prefix_4_0=rulePrefix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDegreeRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_4_0,
                    							"robotScript.RobotScript.Prefix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDegreeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleMili"
    // InternalRobotScript.g:2152:1: entryRuleMili returns [EObject current=null] : iv_ruleMili= ruleMili EOF ;
    public final EObject entryRuleMili() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMili = null;


        try {
            // InternalRobotScript.g:2152:45: (iv_ruleMili= ruleMili EOF )
            // InternalRobotScript.g:2153:2: iv_ruleMili= ruleMili EOF
            {
             newCompositeNode(grammarAccess.getMiliRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMili=ruleMili();

            state._fsp--;

             current =iv_ruleMili; 
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
    // $ANTLR end "entryRuleMili"


    // $ANTLR start "ruleMili"
    // InternalRobotScript.g:2159:1: ruleMili returns [EObject current=null] : ( () otherlv_1= 'Mili' ) ;
    public final EObject ruleMili() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2165:2: ( ( () otherlv_1= 'Mili' ) )
            // InternalRobotScript.g:2166:2: ( () otherlv_1= 'Mili' )
            {
            // InternalRobotScript.g:2166:2: ( () otherlv_1= 'Mili' )
            // InternalRobotScript.g:2167:3: () otherlv_1= 'Mili'
            {
            // InternalRobotScript.g:2167:3: ()
            // InternalRobotScript.g:2168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMiliAccess().getMiliAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMiliAccess().getMiliKeyword_1());
            		

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
    // $ANTLR end "ruleMili"


    // $ANTLR start "entryRuleCenti"
    // InternalRobotScript.g:2182:1: entryRuleCenti returns [EObject current=null] : iv_ruleCenti= ruleCenti EOF ;
    public final EObject entryRuleCenti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCenti = null;


        try {
            // InternalRobotScript.g:2182:46: (iv_ruleCenti= ruleCenti EOF )
            // InternalRobotScript.g:2183:2: iv_ruleCenti= ruleCenti EOF
            {
             newCompositeNode(grammarAccess.getCentiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCenti=ruleCenti();

            state._fsp--;

             current =iv_ruleCenti; 
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
    // $ANTLR end "entryRuleCenti"


    // $ANTLR start "ruleCenti"
    // InternalRobotScript.g:2189:1: ruleCenti returns [EObject current=null] : ( () otherlv_1= 'Centi' ) ;
    public final EObject ruleCenti() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotScript.g:2195:2: ( ( () otherlv_1= 'Centi' ) )
            // InternalRobotScript.g:2196:2: ( () otherlv_1= 'Centi' )
            {
            // InternalRobotScript.g:2196:2: ( () otherlv_1= 'Centi' )
            // InternalRobotScript.g:2197:3: () otherlv_1= 'Centi'
            {
            // InternalRobotScript.g:2197:3: ()
            // InternalRobotScript.g:2198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCentiAccess().getCentiAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCentiAccess().getCentiKeyword_1());
            		

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
    // $ANTLR end "ruleCenti"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000A7D0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000005940000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000FD940000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003000000000000L});

}