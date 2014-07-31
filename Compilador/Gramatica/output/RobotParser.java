// $ANTLR 3.1.1 E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g 2008-10-27 10:54:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class RobotParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "StrLiteral", "EscapeSequence", "WS", "'repetir'", "'veces'", "'si'", "'entonces'", "'sino'", "'desde'", "'<-'", "'hasta'", "'hacer'", "'con'", "'paso'", "'inicio'", "'fin'", "';'", "'retornar'", "'.'", "'('", "')'", "', '", "'+'", "'-'", "'*'", "'div'", "'mod'", "'>'", "'<'", "'no'", "'opuesto'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int INT=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=8;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int StrLiteral=6;
    public static final int EscapeSequence=7;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "paso", "paramsMethodCall", "factor", "masTermino", 
        "program", "termino", "repetirControl", "paramsMethodCallExtra", 
        "block", "statement", "ifControl", "opLevel1", "expr", "masExpresion", 
        "forControl", "methodCall", "opLevel2", "elseControl", "methodCallExtra", 
        "controlStructure", "exprUnaria"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RobotParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RobotParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public RobotParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return RobotParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g"; }



    // $ANTLR start "program"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:5:1: program returns [String valor] : ( statement[vals] )* ;
    public final String program() throws RecognitionException {
        String valor = null;


          java.util.ArrayList<String> vals = new java.util.ArrayList<String>();
          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:9:2: ( ( statement[vals] )* )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: ( statement[vals] )*
            {
            dbg.location(10,3);
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: ( statement[vals] )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==9||LA1_0==11||LA1_0==14||LA1_0==20||LA1_0==23) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: statement[vals]
            	    {
            	    dbg.location(10,3);
            	    pushFollow(FOLLOW_statement_in_program24);
            	    statement(vals);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(10,20);

              
                String res = "";
                for(String str : vals)
                  res += str + "\n";
                   
                valor = res;
                
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(19, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "program"


    // $ANTLR start "controlStructure"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:21:1: controlStructure returns [String valor] : ( forControl | ifControl | repetirControl );
    public final String controlStructure() throws RecognitionException {
        String valor = null;

        String forControl1 = null;

        String ifControl2 = null;

        String repetirControl3 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "controlStructure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:24:2: ( forControl | ifControl | repetirControl )
            int alt2=3;
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 9:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:24:4: forControl
                    {
                    dbg.location(24,4);
                    pushFollow(FOLLOW_forControl_in_controlStructure46);
                    forControl1=forControl();

                    state._fsp--;

                    dbg.location(25,5);

                         valor = forControl1;
                        

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:28:5: ifControl
                    {
                    dbg.location(28,5);
                    pushFollow(FOLLOW_ifControl_in_controlStructure61);
                    ifControl2=ifControl();

                    state._fsp--;

                    dbg.location(29,5);

                         valor = ifControl2;
                        

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:32:7: repetirControl
                    {
                    dbg.location(32,7);
                    pushFollow(FOLLOW_repetirControl_in_controlStructure77);
                    repetirControl3=repetirControl();

                    state._fsp--;

                    dbg.location(33,5);

                          valor = repetirControl3;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(36, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "controlStructure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "controlStructure"


    // $ANTLR start "repetirControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:38:1: repetirControl returns [String valor] : 'repetir' expr 'veces' block ;
    public final String repetirControl() throws RecognitionException {
        String valor = null;

        String expr4 = null;

        String block5 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "repetirControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:42:2: ( 'repetir' expr 'veces' block )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:42:4: 'repetir' expr 'veces' block
            {
            dbg.location(42,4);
            match(input,9,FOLLOW_9_in_repetirControl104); 
            dbg.location(42,14);
            pushFollow(FOLLOW_expr_in_repetirControl106);
            expr4=expr();

            state._fsp--;

            dbg.location(42,19);
            match(input,10,FOLLOW_10_in_repetirControl108); 
            dbg.location(42,27);
            pushFollow(FOLLOW_block_in_repetirControl110);
            block5=block();

            state._fsp--;

            dbg.location(43,2);

               valor = expr4 + ".times { \n" + block5 + "\n } \n";
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(46, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "repetirControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "repetirControl"


    // $ANTLR start "ifControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:48:1: ifControl returns [String valor] : 'si' expr 'entonces' block elseControl ;
    public final String ifControl() throws RecognitionException {
        String valor = null;

        String expr6 = null;

        String block7 = null;

        String elseControl8 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "ifControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:52:2: ( 'si' expr 'entonces' block elseControl )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:52:4: 'si' expr 'entonces' block elseControl
            {
            dbg.location(52,4);
            match(input,11,FOLLOW_11_in_ifControl133); 
            dbg.location(52,9);
            pushFollow(FOLLOW_expr_in_ifControl135);
            expr6=expr();

            state._fsp--;

            dbg.location(52,14);
            match(input,12,FOLLOW_12_in_ifControl137); 
            dbg.location(52,25);
            pushFollow(FOLLOW_block_in_ifControl139);
            block7=block();

            state._fsp--;

            dbg.location(52,31);
            pushFollow(FOLLOW_elseControl_in_ifControl141);
            elseControl8=elseControl();

            state._fsp--;

            dbg.location(53,3);

            	   String res = "if "+ expr6 + "\n";
            	   res += block7 + "\n" ;
            	   if (elseControl8.equals(""))
            	     valor = res + " end \n" ;
            	   else
            	     valor =  res + "else \n" + elseControl8 +" \n end \n" ;
            	 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(61, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "ifControl"


    // $ANTLR start "elseControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:63:1: elseControl returns [String valor] : ( 'sino' block | );
    public final String elseControl() throws RecognitionException {
        String valor = null;

        String block9 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "elseControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:67:2: ( 'sino' block | )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==ID||LA3_0==9||LA3_0==11||LA3_0==14||(LA3_0>=20 && LA3_0<=21)||LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:67:4: 'sino' block
                    {
                    dbg.location(67,4);
                    match(input,13,FOLLOW_13_in_elseControl166); 
                    dbg.location(67,11);
                    pushFollow(FOLLOW_block_in_elseControl168);
                    block9=block();

                    state._fsp--;

                    dbg.location(68,2);

                    	  valor = block9 ;
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:72:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(72, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "elseControl"


    // $ANTLR start "forControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:74:1: forControl returns [String valor] : 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block ;
    public final String forControl() throws RecognitionException {
        String valor = null;

        Token ID10=null;
        String PInit = null;

        String PFinal = null;

        String paso11 = null;

        String block12 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "forControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:77:2: ( 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:78:1: 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block
            {
            dbg.location(78,1);
            match(input,14,FOLLOW_14_in_forControl193); 
            dbg.location(78,9);
            ID10=(Token)match(input,ID,FOLLOW_ID_in_forControl195); 
            dbg.location(78,13);
            match(input,15,FOLLOW_15_in_forControl198); 
            dbg.location(78,23);
            pushFollow(FOLLOW_expr_in_forControl202);
            PInit=expr();

            state._fsp--;

            dbg.location(78,29);
            match(input,16,FOLLOW_16_in_forControl204); 
            dbg.location(78,43);
            pushFollow(FOLLOW_expr_in_forControl208);
            PFinal=expr();

            state._fsp--;

            dbg.location(78,49);
            pushFollow(FOLLOW_paso_in_forControl210);
            paso11=paso();

            state._fsp--;

            dbg.location(78,54);
            match(input,17,FOLLOW_17_in_forControl212); 
            dbg.location(78,62);
            pushFollow(FOLLOW_block_in_forControl214);
            block12=block();

            state._fsp--;

            dbg.location(79,2);
             
               valor = (ID10!=null?ID10.getText():null) + " = " + PInit + "\n" +
               "__sig = true \n" + 
               "if " + paso11 + " > 0 \n" + 
               "  __sig = " + (ID10!=null?ID10.getText():null) + " <= " + PFinal + "\n" +
               "else \n" +
               "  __sig = " + (ID10!=null?ID10.getText():null) + " >= " + PFinal + "\n" +
               "end \n" +
               "while __sig \n" +
               block12 + "\n" +
               (ID10!=null?ID10.getText():null) + " += " + paso11 + " \n" +
               "if " + paso11 + " > 0 \n" + 
               "  __sig = " + (ID10!=null?ID10.getText():null) + " <= " + PFinal + "\n" +
               "else \n" +
               "  __sig = " + (ID10!=null?ID10.getText():null) + " >= " + PFinal + "\n" +
               "end \n end \n";
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "forControl"


    // $ANTLR start "paso"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:98:1: paso returns [String valor] : ( 'con' 'paso' expr | );
    public final String paso() throws RecognitionException {
        String valor = null;

        String expr13 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "paso");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:102:5: ( 'con' 'paso' expr | )
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:102:7: 'con' 'paso' expr
                    {
                    dbg.location(102,7);
                    match(input,18,FOLLOW_18_in_paso241); 
                    dbg.location(102,13);
                    match(input,19,FOLLOW_19_in_paso243); 
                    dbg.location(102,20);
                    pushFollow(FOLLOW_expr_in_paso245);
                    expr13=expr();

                    state._fsp--;

                    dbg.location(102,25);
                     valor = expr13; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:103:26: 
                    {
                    dbg.location(103,26);
                     valor = "1";         

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(104, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paso");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "paso"


    // $ANTLR start "block"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:106:1: block returns [String valor] : 'inicio' ( statement[vals] )* 'fin' ;
    public final String block() throws RecognitionException {
        String valor = null;


          valor = "";
          java.util.ArrayList<String> vals = new java.util.ArrayList<String>();

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:111:1: ( 'inicio' ( statement[vals] )* 'fin' )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:111:3: 'inicio' ( statement[vals] )* 'fin'
            {
            dbg.location(111,3);
            match(input,20,FOLLOW_20_in_block308); 
            dbg.location(112,5);
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:112:5: ( statement[vals] )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||LA5_0==9||LA5_0==11||LA5_0==14||LA5_0==20||LA5_0==23) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:112:5: statement[vals]
            	    {
            	    dbg.location(112,5);
            	    pushFollow(FOLLOW_statement_in_block314);
            	    statement(vals);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(113,3);
            match(input,21,FOLLOW_21_in_block320); 
            dbg.location(114,3);
              
               String res = "";
               for(String str : vals)
                  res += "\n " + str;
               valor = res;  
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(120, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "block"


    // $ANTLR start "expr"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:123:1: expr returns [String valor] : termino masExpresion[valsMasExpr] ;
    public final String expr() throws RecognitionException {
        String valor = null;

        String termino14 = null;



          java.util.Stack<String> valsMasExpr = new java.util.Stack<String>();
          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:128:1: ( termino masExpresion[valsMasExpr] )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:128:3: termino masExpresion[valsMasExpr]
            {
            dbg.location(128,3);
            pushFollow(FOLLOW_termino_in_expr347);
            termino14=termino();

            state._fsp--;

            dbg.location(128,11);
            pushFollow(FOLLOW_masExpresion_in_expr349);
            masExpresion(valsMasExpr);

            state._fsp--;

            dbg.location(129,4);

            	    String res = "";
            	    while(! valsMasExpr.isEmpty())
              	       res += valsMasExpr.pop();
              	       
            	    valor = termino14 + res;	
            	  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(136, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr"


    // $ANTLR start "statement"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:139:1: statement[java.util.ArrayList<String> vals] : ( ID '<-' expr ';' | 'retornar' expr ';' | block | controlStructure | methodCall ';' );
    public final void statement(java.util.ArrayList<String> vals) throws RecognitionException {
        Token ID15=null;
        String expr16 = null;

        String expr17 = null;

        String block18 = null;

        String controlStructure19 = null;

        String methodCall20 = null;


        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:140:9: ( ID '<-' expr ';' | 'retornar' expr ';' | block | controlStructure | methodCall ';' )
            int alt6=5;
            try { dbg.enterDecision(6);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    alt6=1;
                }
                else if ( (LA6_1==22||(LA6_1>=24 && LA6_1<=25)) ) {
                    alt6=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 9:
            case 11:
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:140:11: ID '<-' expr ';'
                    {
                    dbg.location(140,11);
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_statement380); 
                    dbg.location(140,14);
                    match(input,15,FOLLOW_15_in_statement382); 
                    dbg.location(140,19);
                    pushFollow(FOLLOW_expr_in_statement384);
                    expr16=expr();

                    state._fsp--;

                    dbg.location(140,24);
                    match(input,22,FOLLOW_22_in_statement386); 
                    dbg.location(140,31);
                     vals.add( (ID15!=null?ID15.getText():null) + " = " + expr16 ); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:141:11: 'retornar' expr ';'
                    {
                    dbg.location(141,11);
                    match(input,23,FOLLOW_23_in_statement403); 
                    dbg.location(141,22);
                    pushFollow(FOLLOW_expr_in_statement405);
                    expr17=expr();

                    state._fsp--;

                    dbg.location(141,27);
                    match(input,22,FOLLOW_22_in_statement407); 
                    dbg.location(141,31);
                     vals.add( " return " + expr17 );       

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:142:11: block
                    {
                    dbg.location(142,11);
                    pushFollow(FOLLOW_block_in_statement421);
                    block18=block();

                    state._fsp--;

                    dbg.location(142,31);
                     vals.add( block18 );	             

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:143:11: controlStructure
                    {
                    dbg.location(143,11);
                    pushFollow(FOLLOW_controlStructure_in_statement449);
                    controlStructure19=controlStructure();

                    state._fsp--;

                    dbg.location(143,31);
                     vals.add( controlStructure19 );        

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:144:4: methodCall ';'
                    {
                    dbg.location(144,4);
                    pushFollow(FOLLOW_methodCall_in_statement459);
                    methodCall20=methodCall();

                    state._fsp--;

                    dbg.location(144,17);
                    match(input,22,FOLLOW_22_in_statement463); 
                    dbg.location(144,24);
                     vals.add( methodCall20 );              

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(145, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "methodCall"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:147:1: methodCall returns [String valor] : ID paramsMethodCall methodCallExtra[methCallValues] ;
    public final String methodCall() throws RecognitionException {
        String valor = null;

        Token ID21=null;
        java.util.Stack<String> paramsMethodCall22 = null;



         valor = "";
         java.util.Stack<String> methCallValues = new java.util.Stack<String>();

        try { dbg.enterRule(getGrammarFileName(), "methodCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:152:2: ( ID paramsMethodCall methodCallExtra[methCallValues] )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:152:5: ID paramsMethodCall methodCallExtra[methCallValues]
            {
            dbg.location(152,5);
            ID21=(Token)match(input,ID,FOLLOW_ID_in_methodCall495); 
            dbg.location(152,8);
            pushFollow(FOLLOW_paramsMethodCall_in_methodCall497);
            paramsMethodCall22=paramsMethodCall();

            state._fsp--;

            dbg.location(152,25);
            pushFollow(FOLLOW_methodCallExtra_in_methodCall499);
            methodCallExtra(methCallValues);

            state._fsp--;

            dbg.location(153,2);

            	    String res = "" ;
            	    
            	    // para la entrada de datos por GUI
            	    if ( (ID21!=null?ID21.getText():null).equals( "leer" ) ){
            	      res += "_IOWindow = InputOutput.new 'Entrada de datos' \n" ;
            	      for(int i = 0; i < paramsMethodCall22.size(); i += 2) 
            	      	res += "_IOWindow.adicionarMensaje " + paramsMethodCall22.get(i) + "\n";  
            	      	
            	      res += "_IOWindow.visible = true \n" ;
            	      int j = 0;
            	      for ( int i = 1; i < paramsMethodCall22.size(); i += 2 ){
            	      	res += paramsMethodCall22.get(i) + " = ___convertirTipo( _IOWindow.valores["+ j + "] ) \n" ;
            	      	j++;
            	      }
                  	      res +=  "_IOWindow.dispose \n" ;
                  	      
            	    }
            	    // para la salida de datos por GUI
            	    else if( (ID21!=null?ID21.getText():null).equals("mostrar")){
            	      res += "_IOWindow = InputOutput.new 'Salida de datos' \n" ;
            	      for(int i = 0; i < paramsMethodCall22.size(); i += 2) 
            	        res += "_IOWindow.adicionarFila( " + paramsMethodCall22.get(i) + ", " + paramsMethodCall22.get(i + 1) + " ) \n";
            	        
                          res += "_IOWindow.visible = true \n" ;
            	      res +=  "_IOWindow.dispose \n" ;           
            	    }
            	    else{
            	           res = (ID21!=null?ID21.getText():null) ;
            	  	   if ( paramsMethodCall22.size() > 0 )
            	  	      res += "( " + paramsMethodCall22.get(0);
            	  	      
            	  	   for(int i = 1; i < paramsMethodCall22.size(); i++)
            	  	      res += ", " + paramsMethodCall22.get(i);

            	  	      
            	  	   if ( paramsMethodCall22.size() > 0 )
              	  	      res += ")";
            	  	   
            		   while(! methCallValues.isEmpty())
            	  	      res += methCallValues.pop() ;
            	  	      
            	 	}
            	 	
            	   valor = res;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(199, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "methodCall"


    // $ANTLR start "methodCallExtra"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:201:1: methodCallExtra[ java.util.Stack<String> methodCallExtraValues ] : ( '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ] | );
    public final void methodCallExtra(java.util.Stack<String> methodCallExtraValues) throws RecognitionException {
        Token ID24=null;
        java.util.Stack<String> paramsMethodCall23 = null;


        try { dbg.enterRule(getGrammarFileName(), "methodCallExtra");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:202:2: ( '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ] | )
            int alt7=2;
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:202:4: '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ]
                    {
                    dbg.location(202,4);
                    match(input,24,FOLLOW_24_in_methodCallExtra519); 
                    dbg.location(202,8);
                    ID24=(Token)match(input,ID,FOLLOW_ID_in_methodCallExtra521); 
                    dbg.location(202,11);
                    pushFollow(FOLLOW_paramsMethodCall_in_methodCallExtra523);
                    paramsMethodCall23=paramsMethodCall();

                    state._fsp--;

                    dbg.location(202,28);
                    pushFollow(FOLLOW_methodCallExtra_in_methodCallExtra525);
                    methodCallExtra(methodCallExtraValues);

                    state._fsp--;

                    dbg.location(203,2);

                                String res = ""; 

                      	    if ( paramsMethodCall23.size() > 0 )
                      	       res = "." + (ID24!=null?ID24.getText():null) + "(" + paramsMethodCall23.get(0);
                      	      
                      	    for(int i = 1; i < paramsMethodCall23.size(); i++)
                      	       res += ", " + paramsMethodCall23.get(i);

                                if ( paramsMethodCall23.size() > 0 )
                                   res += ")";
                                else
                                   res = "." + (ID24!=null?ID24.getText():null);
                                   
                    	    methodCallExtraValues.push ( res ) ;
                    	    
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:223:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(223, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodCallExtra");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "methodCallExtra"


    // $ANTLR start "paramsMethodCall"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:225:1: paramsMethodCall returns [java.util.Stack<String> valores] : ( '(' expr paramsMethodCallExtra[paramsMethCallValues] ')' | );
    public final java.util.Stack<String> paramsMethodCall() throws RecognitionException {
        java.util.Stack<String> valores = null;

        String expr25 = null;



         valores = new java.util.Stack<String>();
         java.util.Stack<String> paramsMethCallValues = new java.util.Stack<String>();

        try { dbg.enterRule(getGrammarFileName(), "paramsMethodCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:231:2: ( '(' expr paramsMethodCallExtra[paramsMethCallValues] ')' | )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==22||LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:231:4: '(' expr paramsMethodCallExtra[paramsMethCallValues] ')'
                    {
                    dbg.location(231,4);
                    match(input,25,FOLLOW_25_in_paramsMethodCall557); 
                    dbg.location(231,8);
                    pushFollow(FOLLOW_expr_in_paramsMethodCall559);
                    expr25=expr();

                    state._fsp--;

                    dbg.location(231,13);
                    pushFollow(FOLLOW_paramsMethodCallExtra_in_paramsMethodCall561);
                    paramsMethodCallExtra(paramsMethCallValues);

                    state._fsp--;

                    dbg.location(231,57);
                    match(input,26,FOLLOW_26_in_paramsMethodCall564); 
                    dbg.location(232,2);

                    	
                    	   valores.push( expr25 );
                    	   
                     	   while(! paramsMethCallValues.isEmpty())
                      	       valores.push( paramsMethCallValues.pop() );
                    	   
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:241:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(241, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paramsMethodCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valores;
    }
    // $ANTLR end "paramsMethodCall"


    // $ANTLR start "paramsMethodCallExtra"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:243:1: paramsMethodCallExtra[java.util.Stack<String> paramsMethCall] : ( ', ' expr paramsMethodCallExtra[paramsMethCall] | );
    public final void paramsMethodCallExtra(java.util.Stack<String> paramsMethCall) throws RecognitionException {
        String expr26 = null;


        try { dbg.enterRule(getGrammarFileName(), "paramsMethodCallExtra");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:244:2: ( ', ' expr paramsMethodCallExtra[paramsMethCall] | )
            int alt9=2;
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:244:4: ', ' expr paramsMethodCallExtra[paramsMethCall]
                    {
                    dbg.location(244,4);
                    match(input,27,FOLLOW_27_in_paramsMethodCallExtra583); 
                    dbg.location(244,9);
                    pushFollow(FOLLOW_expr_in_paramsMethodCallExtra585);
                    expr26=expr();

                    state._fsp--;

                    dbg.location(244,14);
                    pushFollow(FOLLOW_paramsMethodCallExtra_in_paramsMethodCallExtra587);
                    paramsMethodCallExtra(paramsMethCall);

                    state._fsp--;

                    dbg.location(245,2);

                    	     paramsMethCall.push (expr26);
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:249:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(249, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paramsMethodCallExtra");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "paramsMethodCallExtra"


    // $ANTLR start "masExpresion"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:251:1: masExpresion[java.util.Stack<String> valsMasExpr] : ( opLevel2 termino masExpresion[valsMasExpr] | );
    public final void masExpresion(java.util.Stack<String> valsMasExpr) throws RecognitionException {
        String opLevel227 = null;

        String termino28 = null;


        try { dbg.enterRule(getGrammarFileName(), "masExpresion");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(251, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:252:2: ( opLevel2 termino masExpresion[valsMasExpr] | )
            int alt10=2;
            try { dbg.enterDecision(10);

            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=1;
                }
                break;
            case 10:
            case 12:
            case 16:
            case 17:
            case 18:
            case 22:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:252:4: opLevel2 termino masExpresion[valsMasExpr]
                    {
                    dbg.location(252,4);
                    pushFollow(FOLLOW_opLevel2_in_masExpresion607);
                    opLevel227=opLevel2();

                    state._fsp--;

                    dbg.location(252,13);
                    pushFollow(FOLLOW_termino_in_masExpresion609);
                    termino28=termino();

                    state._fsp--;

                    dbg.location(252,21);
                    pushFollow(FOLLOW_masExpresion_in_masExpresion611);
                    masExpresion(valsMasExpr);

                    state._fsp--;

                    dbg.location(253,2);
                     
                    	    valsMasExpr.push( opLevel227 + termino28 ); 
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:257:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(257, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "masExpresion");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "masExpresion"


    // $ANTLR start "opLevel2"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:259:1: opLevel2 returns [String valor] : ( '+' | '-' );
    public final String opLevel2() throws RecognitionException {
        String valor = null;


          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "opLevel2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:262:3: ( '+' | '-' )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:262:5: '+'
                    {
                    dbg.location(262,5);
                    match(input,28,FOLLOW_28_in_opLevel2638); 
                    dbg.location(262,9);
                    valor = "+";

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:263:4: '-'
                    {
                    dbg.location(263,4);
                    match(input,29,FOLLOW_29_in_opLevel2645); 
                    dbg.location(263,8);
                    valor = "-";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(264, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opLevel2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "opLevel2"


    // $ANTLR start "termino"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:266:1: termino returns [String valor] : factor masTermino[valsMasTerm] ;
    public final String termino() throws RecognitionException {
        String valor = null;

        String factor29 = null;



          valor = "";
          java.util.Stack<String> valsMasTerm = new java.util.Stack<String>();

        try { dbg.enterRule(getGrammarFileName(), "termino");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:270:3: ( factor masTermino[valsMasTerm] )
            dbg.enterAlt(1);

            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:270:6: factor masTermino[valsMasTerm]
            {
            dbg.location(270,6);
            pushFollow(FOLLOW_factor_in_termino667);
            factor29=factor();

            state._fsp--;

            dbg.location(270,13);
            pushFollow(FOLLOW_masTermino_in_termino669);
            masTermino(valsMasTerm);

            state._fsp--;

            dbg.location(271,3);
             
            		   String res = "";
            		   while(! valsMasTerm.isEmpty())
            		    res += valsMasTerm.pop();

              		   valor = factor29 + res;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(278, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "termino");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "termino"


    // $ANTLR start "masTermino"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:280:1: masTermino[java.util.Stack<String> valsMasTerm] : ( opLevel1 factor masTermino[valsMasTerm] | );
    public final void masTermino(java.util.Stack<String> valsMasTerm) throws RecognitionException {
        String opLevel130 = null;

        String factor31 = null;


        try { dbg.enterRule(getGrammarFileName(), "masTermino");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:281:2: ( opLevel1 factor masTermino[valsMasTerm] | )
            int alt12=2;
            try { dbg.enterDecision(12);

            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=1;
                }
                break;
            case 10:
            case 12:
            case 16:
            case 17:
            case 18:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:281:5: opLevel1 factor masTermino[valsMasTerm]
                    {
                    dbg.location(281,5);
                    pushFollow(FOLLOW_opLevel1_in_masTermino689);
                    opLevel130=opLevel1();

                    state._fsp--;

                    dbg.location(281,14);
                    pushFollow(FOLLOW_factor_in_masTermino691);
                    factor31=factor();

                    state._fsp--;

                    dbg.location(281,21);
                    pushFollow(FOLLOW_masTermino_in_masTermino693);
                    masTermino(valsMasTerm);

                    state._fsp--;

                    dbg.location(282,3);
                     valsMasTerm.push ( opLevel130 + factor31); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:284:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(284, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "masTermino");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "masTermino"


    // $ANTLR start "opLevel1"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:287:1: opLevel1 returns [String valor] : ( '*' | 'div' | 'mod' | '>' | '<' );
    public final String opLevel1() throws RecognitionException {
        String valor = null;


          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "opLevel1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:290:3: ( '*' | 'div' | 'mod' | '>' | '<' )
            int alt13=5;
            try { dbg.enterDecision(13);

            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:290:5: '*'
                    {
                    dbg.location(290,5);
                    match(input,30,FOLLOW_30_in_opLevel1724); 
                    dbg.location(290,11);
                    valor = "*";

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:291:4: 'div'
                    {
                    dbg.location(291,4);
                    match(input,31,FOLLOW_31_in_opLevel1733); 
                    dbg.location(291,10);
                    valor = "/";

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:292:4: 'mod'
                    {
                    dbg.location(292,4);
                    match(input,32,FOLLOW_32_in_opLevel1740); 
                    dbg.location(292,10);
                    valor = "%";

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:293:4: '>'
                    {
                    dbg.location(293,4);
                    match(input,33,FOLLOW_33_in_opLevel1747); 
                    dbg.location(293,10);
                    valor = ">";

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:294:4: '<'
                    {
                    dbg.location(294,4);
                    match(input,34,FOLLOW_34_in_opLevel1756); 
                    dbg.location(294,10);
                    valor = "<";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(295, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opLevel1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "opLevel1"


    // $ANTLR start "factor"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:297:1: factor returns [String valor] : ( '(' expr ')' | ID | INT | StrLiteral | exprUnaria );
    public final String factor() throws RecognitionException {
        String valor = null;

        Token ID33=null;
        Token INT34=null;
        Token StrLiteral35=null;
        String expr32 = null;

        String exprUnaria36 = null;



          valor = "" ;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(297, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:300:3: ( '(' expr ')' | ID | INT | StrLiteral | exprUnaria )
            int alt14=5;
            try { dbg.enterDecision(14);

            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case INT:
                {
                alt14=3;
                }
                break;
            case StrLiteral:
                {
                alt14=4;
                }
                break;
            case 29:
            case 35:
            case 36:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:300:5: '(' expr ')'
                    {
                    dbg.location(300,5);
                    match(input,25,FOLLOW_25_in_factor779); 
                    dbg.location(300,9);
                    pushFollow(FOLLOW_expr_in_factor781);
                    expr32=expr();

                    state._fsp--;

                    dbg.location(300,14);
                    match(input,26,FOLLOW_26_in_factor783); 
                    dbg.location(300,19);
                     valor = "(" + expr32 + ")"; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:301:4: ID
                    {
                    dbg.location(301,4);
                    ID33=(Token)match(input,ID,FOLLOW_ID_in_factor791); 
                    dbg.location(301,16);
                     valor = (ID33!=null?ID33.getText():null);                

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:302:4: INT
                    {
                    dbg.location(302,4);
                    INT34=(Token)match(input,INT,FOLLOW_INT_in_factor808); 
                    dbg.location(302,18);
                     valor = (INT34!=null?INT34.getText():null);               

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:303:4: StrLiteral
                    {
                    dbg.location(303,4);
                    StrLiteral35=(Token)match(input,StrLiteral,FOLLOW_StrLiteral_in_factor825); 
                    dbg.location(303,18);
                     valor = (StrLiteral35!=null?StrLiteral35.getText():null);        

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:304:4: exprUnaria
                    {
                    dbg.location(304,4);
                    pushFollow(FOLLOW_exprUnaria_in_factor835);
                    exprUnaria36=exprUnaria();

                    state._fsp--;

                    dbg.location(304,18);
                     valor = exprUnaria36;       

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "factor"


    // $ANTLR start "exprUnaria"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:308:1: exprUnaria returns [String valor] : ( 'no' expr | 'opuesto' expr | '-' expr );
    public final String exprUnaria() throws RecognitionException {
        String valor = null;

        String expr37 = null;

        String expr38 = null;

        String expr39 = null;



          valor = "";

        try { dbg.enterRule(getGrammarFileName(), "exprUnaria");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:311:3: ( 'no' expr | 'opuesto' expr | '-' expr )
            int alt15=3;
            try { dbg.enterDecision(15);

            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 29:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:311:5: 'no' expr
                    {
                    dbg.location(311,5);
                    match(input,35,FOLLOW_35_in_exprUnaria862); 
                    dbg.location(311,15);
                    pushFollow(FOLLOW_expr_in_exprUnaria869);
                    expr37=expr();

                    state._fsp--;

                    dbg.location(311,23);
                    valor = "! " + expr37;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:312:10: 'opuesto' expr
                    {
                    dbg.location(312,10);
                    match(input,36,FOLLOW_36_in_exprUnaria885); 
                    dbg.location(312,20);
                    pushFollow(FOLLOW_expr_in_exprUnaria887);
                    expr38=expr();

                    state._fsp--;

                    dbg.location(312,28);
                    valor = "- " + expr38;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:313:10: '-' expr
                    {
                    dbg.location(313,10);
                    match(input,29,FOLLOW_29_in_exprUnaria903); 
                    dbg.location(313,20);
                    pushFollow(FOLLOW_expr_in_exprUnaria911);
                    expr39=expr();

                    state._fsp--;

                    dbg.location(313,28);
                    valor = "- " + expr39;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(314, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprUnaria");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "exprUnaria"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program24 = new BitSet(new long[]{0x0000000000904A12L});
    public static final BitSet FOLLOW_forControl_in_controlStructure46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifControl_in_controlStructure61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repetirControl_in_controlStructure77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_repetirControl104 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_repetirControl106 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_repetirControl108 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_repetirControl110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ifControl133 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_ifControl135 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ifControl137 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_ifControl139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_elseControl_in_ifControl141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_elseControl166 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_elseControl168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_forControl193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_forControl195 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_forControl198 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_forControl202 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forControl204 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_forControl208 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_paso_in_forControl210 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_forControl212 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_forControl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_paso241 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_paso243 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_paso245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_block308 = new BitSet(new long[]{0x0000000000B04A10L});
    public static final BitSet FOLLOW_statement_in_block314 = new BitSet(new long[]{0x0000000000B04A10L});
    public static final BitSet FOLLOW_21_in_block320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termino_in_expr347 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_masExpresion_in_expr349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement382 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_statement384 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement403 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_statement405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_controlStructure_in_statement449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_statement459 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodCall495 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_paramsMethodCall_in_methodCall497 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_methodCallExtra_in_methodCall499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_methodCallExtra519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_methodCallExtra521 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_paramsMethodCall_in_methodCallExtra523 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_methodCallExtra_in_methodCallExtra525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_paramsMethodCall557 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_paramsMethodCall559 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_paramsMethodCallExtra_in_paramsMethodCall561 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_paramsMethodCall564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_paramsMethodCallExtra583 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_paramsMethodCallExtra585 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_paramsMethodCallExtra_in_paramsMethodCallExtra587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opLevel2_in_masExpresion607 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_termino_in_masExpresion609 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_masExpresion_in_masExpresion611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_opLevel2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_opLevel2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termino667 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_masTermino_in_termino669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opLevel1_in_masTermino689 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_factor_in_masTermino691 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_masTermino_in_masTermino693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_opLevel1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opLevel1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_opLevel1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_opLevel1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_opLevel1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_factor779 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_factor781 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_factor783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StrLiteral_in_factor825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprUnaria_in_factor835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_exprUnaria862 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_exprUnaria869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_exprUnaria885 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_exprUnaria887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_exprUnaria903 = new BitSet(new long[]{0x0000001822000070L});
    public static final BitSet FOLLOW_expr_in_exprUnaria911 = new BitSet(new long[]{0x0000000000000002L});

}