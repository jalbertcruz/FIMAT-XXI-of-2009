// $ANTLR 3.1 E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g 2008-09-17 21:01:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RobotParser extends Parser {
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


        public RobotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RobotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return RobotParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g"; }



    // $ANTLR start "program"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:5:1: program returns [String valor] : ( statement[vals] )* ;
    public final String program() throws RecognitionException {
        String valor = null;


          java.util.ArrayList<String> vals = new java.util.ArrayList<String>();
          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:9:2: ( ( statement[vals] )* )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: ( statement[vals] )*
            {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: ( statement[vals] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==9||LA1_0==11||LA1_0==14||LA1_0==20||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:10:3: statement[vals]
            	    {
            	    pushFollow(FOLLOW_statement_in_program24);
            	    statement(vals);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


              
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
        return valor;
    }
    // $ANTLR end "program"


    // $ANTLR start "controlStructure"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:21:1: controlStructure returns [String valor] : ( forControl | ifControl | repetirControl );
    public final String controlStructure() throws RecognitionException {
        String valor = null;

        String forControl1 = null;

        String ifControl2 = null;

        String repetirControl3 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:24:2: ( forControl | ifControl | repetirControl )
            int alt2=3;
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

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:24:4: forControl
                    {
                    pushFollow(FOLLOW_forControl_in_controlStructure46);
                    forControl1=forControl();

                    state._fsp--;


                         valor = forControl1;
                        

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:28:5: ifControl
                    {
                    pushFollow(FOLLOW_ifControl_in_controlStructure61);
                    ifControl2=ifControl();

                    state._fsp--;


                         valor = ifControl2;
                        

                    }
                    break;
                case 3 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:32:7: repetirControl
                    {
                    pushFollow(FOLLOW_repetirControl_in_controlStructure77);
                    repetirControl3=repetirControl();

                    state._fsp--;


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
        return valor;
    }
    // $ANTLR end "controlStructure"


    // $ANTLR start "repetirControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:38:1: repetirControl returns [String valor] : 'repetir' expr 'veces' block ;
    public final String repetirControl() throws RecognitionException {
        String valor = null;

        String expr4 = null;

        String block5 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:42:2: ( 'repetir' expr 'veces' block )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:42:4: 'repetir' expr 'veces' block
            {
            match(input,9,FOLLOW_9_in_repetirControl104); 
            pushFollow(FOLLOW_expr_in_repetirControl106);
            expr4=expr();

            state._fsp--;

            match(input,10,FOLLOW_10_in_repetirControl108); 
            pushFollow(FOLLOW_block_in_repetirControl110);
            block5=block();

            state._fsp--;


               valor = expr4 + ".times { \n" + block5 + "\n } \n";
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return valor;
    }
    // $ANTLR end "repetirControl"


    // $ANTLR start "ifControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:48:1: ifControl returns [String valor] : 'si' expr 'entonces' block elseControl ;
    public final String ifControl() throws RecognitionException {
        String valor = null;

        String expr6 = null;

        String block7 = null;

        String elseControl8 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:52:2: ( 'si' expr 'entonces' block elseControl )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:52:4: 'si' expr 'entonces' block elseControl
            {
            match(input,11,FOLLOW_11_in_ifControl133); 
            pushFollow(FOLLOW_expr_in_ifControl135);
            expr6=expr();

            state._fsp--;

            match(input,12,FOLLOW_12_in_ifControl137); 
            pushFollow(FOLLOW_block_in_ifControl139);
            block7=block();

            state._fsp--;

            pushFollow(FOLLOW_elseControl_in_ifControl141);
            elseControl8=elseControl();

            state._fsp--;


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
        return valor;
    }
    // $ANTLR end "ifControl"


    // $ANTLR start "elseControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:63:1: elseControl returns [String valor] : ( 'sino' block | );
    public final String elseControl() throws RecognitionException {
        String valor = null;

        String block9 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:67:2: ( 'sino' block | )
            int alt3=2;
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

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:67:4: 'sino' block
                    {
                    match(input,13,FOLLOW_13_in_elseControl166); 
                    pushFollow(FOLLOW_block_in_elseControl168);
                    block9=block();

                    state._fsp--;


                    	  valor = block9 ;
                    	

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:72:2: 
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
        return valor;
    }
    // $ANTLR end "elseControl"


    // $ANTLR start "forControl"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:74:1: forControl returns [String valor] : 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block ;
    public final String forControl() throws RecognitionException {
        String valor = null;

        Token ID10=null;
        String PInit = null;

        String PFinal = null;

        String paso11 = null;

        String block12 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:77:2: ( 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:78:1: 'desde' ID '<-' PInit= expr 'hasta' PFinal= expr paso 'hacer' block
            {
            match(input,14,FOLLOW_14_in_forControl193); 
            ID10=(Token)match(input,ID,FOLLOW_ID_in_forControl195); 
            match(input,15,FOLLOW_15_in_forControl198); 
            pushFollow(FOLLOW_expr_in_forControl202);
            PInit=expr();

            state._fsp--;

            match(input,16,FOLLOW_16_in_forControl204); 
            pushFollow(FOLLOW_expr_in_forControl208);
            PFinal=expr();

            state._fsp--;

            pushFollow(FOLLOW_paso_in_forControl210);
            paso11=paso();

            state._fsp--;

            match(input,17,FOLLOW_17_in_forControl212); 
            pushFollow(FOLLOW_block_in_forControl214);
            block12=block();

            state._fsp--;

             
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
        return valor;
    }
    // $ANTLR end "forControl"


    // $ANTLR start "paso"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:98:1: paso returns [String valor] : ( 'con' 'paso' expr | );
    public final String paso() throws RecognitionException {
        String valor = null;

        String expr13 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:102:5: ( 'con' 'paso' expr | )
            int alt4=2;
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

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:102:7: 'con' 'paso' expr
                    {
                    match(input,18,FOLLOW_18_in_paso241); 
                    match(input,19,FOLLOW_19_in_paso243); 
                    pushFollow(FOLLOW_expr_in_paso245);
                    expr13=expr();

                    state._fsp--;

                     valor = expr13; 

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:103:26: 
                    {
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
        return valor;
    }
    // $ANTLR end "paso"


    // $ANTLR start "block"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:106:1: block returns [String valor] : 'inicio' ( statement[vals] )* 'fin' ;
    public final String block() throws RecognitionException {
        String valor = null;


          valor = "";
          java.util.ArrayList<String> vals = new java.util.ArrayList<String>();

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:111:1: ( 'inicio' ( statement[vals] )* 'fin' )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:111:3: 'inicio' ( statement[vals] )* 'fin'
            {
            match(input,20,FOLLOW_20_in_block308); 
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:112:5: ( statement[vals] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||LA5_0==9||LA5_0==11||LA5_0==14||LA5_0==20||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:112:5: statement[vals]
            	    {
            	    pushFollow(FOLLOW_statement_in_block314);
            	    statement(vals);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_block320); 
              
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
        return valor;
    }
    // $ANTLR end "block"


    // $ANTLR start "expr"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:123:1: expr returns [String valor] : termino masExpresion[valsMasExpr] ;
    public final String expr() throws RecognitionException {
        String valor = null;

        String termino14 = null;



          java.util.Stack<String> valsMasExpr = new java.util.Stack<String>();
          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:128:1: ( termino masExpresion[valsMasExpr] )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:128:3: termino masExpresion[valsMasExpr]
            {
            pushFollow(FOLLOW_termino_in_expr347);
            termino14=termino();

            state._fsp--;

            pushFollow(FOLLOW_masExpresion_in_expr349);
            masExpresion(valsMasExpr);

            state._fsp--;


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
        return valor;
    }
    // $ANTLR end "expr"


    // $ANTLR start "statement"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:139:1: statement[java.util.ArrayList<String> vals] : ( ID '<-' expr ';' | 'retornar' expr ';' | block | controlStructure | methodCall ';' );
    public final void statement(java.util.ArrayList<String> vals) throws RecognitionException {
        Token ID15=null;
        String expr16 = null;

        String expr17 = null;

        String block18 = null;

        String controlStructure19 = null;

        String methodCall20 = null;


        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:140:9: ( ID '<-' expr ';' | 'retornar' expr ';' | block | controlStructure | methodCall ';' )
            int alt6=5;
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

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:140:11: ID '<-' expr ';'
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_statement380); 
                    match(input,15,FOLLOW_15_in_statement382); 
                    pushFollow(FOLLOW_expr_in_statement384);
                    expr16=expr();

                    state._fsp--;

                    match(input,22,FOLLOW_22_in_statement386); 
                     vals.add( (ID15!=null?ID15.getText():null) + " = " + expr16 ); 

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:141:11: 'retornar' expr ';'
                    {
                    match(input,23,FOLLOW_23_in_statement403); 
                    pushFollow(FOLLOW_expr_in_statement405);
                    expr17=expr();

                    state._fsp--;

                    match(input,22,FOLLOW_22_in_statement407); 
                     vals.add( " return " + expr17 );       

                    }
                    break;
                case 3 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:142:11: block
                    {
                    pushFollow(FOLLOW_block_in_statement421);
                    block18=block();

                    state._fsp--;

                     vals.add( block18 );	             

                    }
                    break;
                case 4 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:143:11: controlStructure
                    {
                    pushFollow(FOLLOW_controlStructure_in_statement449);
                    controlStructure19=controlStructure();

                    state._fsp--;

                     vals.add( controlStructure19 );        

                    }
                    break;
                case 5 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:144:4: methodCall ';'
                    {
                    pushFollow(FOLLOW_methodCall_in_statement459);
                    methodCall20=methodCall();

                    state._fsp--;

                    match(input,22,FOLLOW_22_in_statement463); 
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
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "methodCall"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:147:1: methodCall returns [String valor] : ID paramsMethodCall methodCallExtra[methCallValues] ;
    public final String methodCall() throws RecognitionException {
        String valor = null;

        Token ID21=null;
        java.util.Stack<String> paramsMethodCall22 = null;



         valor = "";
         java.util.Stack<String> methCallValues = new java.util.Stack<String>();

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:152:2: ( ID paramsMethodCall methodCallExtra[methCallValues] )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:152:5: ID paramsMethodCall methodCallExtra[methCallValues]
            {
            ID21=(Token)match(input,ID,FOLLOW_ID_in_methodCall495); 
            pushFollow(FOLLOW_paramsMethodCall_in_methodCall497);
            paramsMethodCall22=paramsMethodCall();

            state._fsp--;

            pushFollow(FOLLOW_methodCallExtra_in_methodCall499);
            methodCallExtra(methCallValues);

            state._fsp--;


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
        return valor;
    }
    // $ANTLR end "methodCall"


    // $ANTLR start "methodCallExtra"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:201:1: methodCallExtra[ java.util.Stack<String> methodCallExtraValues ] : ( '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ] | );
    public final void methodCallExtra(java.util.Stack<String> methodCallExtraValues) throws RecognitionException {
        Token ID24=null;
        java.util.Stack<String> paramsMethodCall23 = null;


        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:202:2: ( '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ] | )
            int alt7=2;
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

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:202:4: '.' ID paramsMethodCall methodCallExtra[ methodCallExtraValues ]
                    {
                    match(input,24,FOLLOW_24_in_methodCallExtra519); 
                    ID24=(Token)match(input,ID,FOLLOW_ID_in_methodCallExtra521); 
                    pushFollow(FOLLOW_paramsMethodCall_in_methodCallExtra523);
                    paramsMethodCall23=paramsMethodCall();

                    state._fsp--;

                    pushFollow(FOLLOW_methodCallExtra_in_methodCallExtra525);
                    methodCallExtra(methodCallExtraValues);

                    state._fsp--;


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
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:223:2: 
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
        return ;
    }
    // $ANTLR end "methodCallExtra"


    // $ANTLR start "paramsMethodCall"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:225:1: paramsMethodCall returns [java.util.Stack<String> valores] : ( '(' expr paramsMethodCallExtra[paramsMethCallValues] ')' | );
    public final java.util.Stack<String> paramsMethodCall() throws RecognitionException {
        java.util.Stack<String> valores = null;

        String expr25 = null;



         valores = new java.util.Stack<String>();
         java.util.Stack<String> paramsMethCallValues = new java.util.Stack<String>();

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:231:2: ( '(' expr paramsMethodCallExtra[paramsMethCallValues] ')' | )
            int alt8=2;
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

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:231:4: '(' expr paramsMethodCallExtra[paramsMethCallValues] ')'
                    {
                    match(input,25,FOLLOW_25_in_paramsMethodCall557); 
                    pushFollow(FOLLOW_expr_in_paramsMethodCall559);
                    expr25=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_paramsMethodCallExtra_in_paramsMethodCall561);
                    paramsMethodCallExtra(paramsMethCallValues);

                    state._fsp--;

                    match(input,26,FOLLOW_26_in_paramsMethodCall564); 

                    	
                    	   valores.push( expr25 );
                    	   
                     	   while(! paramsMethCallValues.isEmpty())
                      	       valores.push( paramsMethCallValues.pop() );
                    	   
                    	

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:241:2: 
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
        return valores;
    }
    // $ANTLR end "paramsMethodCall"


    // $ANTLR start "paramsMethodCallExtra"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:243:1: paramsMethodCallExtra[java.util.Stack<String> paramsMethCall] : ( ', ' expr paramsMethodCallExtra[paramsMethCall] | );
    public final void paramsMethodCallExtra(java.util.Stack<String> paramsMethCall) throws RecognitionException {
        String expr26 = null;


        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:244:2: ( ', ' expr paramsMethodCallExtra[paramsMethCall] | )
            int alt9=2;
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

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:244:4: ', ' expr paramsMethodCallExtra[paramsMethCall]
                    {
                    match(input,27,FOLLOW_27_in_paramsMethodCallExtra583); 
                    pushFollow(FOLLOW_expr_in_paramsMethodCallExtra585);
                    expr26=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_paramsMethodCallExtra_in_paramsMethodCallExtra587);
                    paramsMethodCallExtra(paramsMethCall);

                    state._fsp--;


                    	     paramsMethCall.push (expr26);
                    	

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:249:2: 
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
        return ;
    }
    // $ANTLR end "paramsMethodCallExtra"


    // $ANTLR start "masExpresion"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:251:1: masExpresion[java.util.Stack<String> valsMasExpr] : ( opLevel2 termino masExpresion[valsMasExpr] | );
    public final void masExpresion(java.util.Stack<String> valsMasExpr) throws RecognitionException {
        String opLevel227 = null;

        String termino28 = null;


        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:252:2: ( opLevel2 termino masExpresion[valsMasExpr] | )
            int alt10=2;
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

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:252:4: opLevel2 termino masExpresion[valsMasExpr]
                    {
                    pushFollow(FOLLOW_opLevel2_in_masExpresion607);
                    opLevel227=opLevel2();

                    state._fsp--;

                    pushFollow(FOLLOW_termino_in_masExpresion609);
                    termino28=termino();

                    state._fsp--;

                    pushFollow(FOLLOW_masExpresion_in_masExpresion611);
                    masExpresion(valsMasExpr);

                    state._fsp--;

                     
                    	    valsMasExpr.push( opLevel227 + termino28 ); 
                    	

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:257:2: 
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
        return ;
    }
    // $ANTLR end "masExpresion"


    // $ANTLR start "opLevel2"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:259:1: opLevel2 returns [String valor] : ( '+' | '-' );
    public final String opLevel2() throws RecognitionException {
        String valor = null;


          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:262:3: ( '+' | '-' )
            int alt11=2;
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

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:262:5: '+'
                    {
                    match(input,28,FOLLOW_28_in_opLevel2638); 
                    valor = "+";

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:263:4: '-'
                    {
                    match(input,29,FOLLOW_29_in_opLevel2645); 
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
        return valor;
    }
    // $ANTLR end "opLevel2"


    // $ANTLR start "termino"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:266:1: termino returns [String valor] : factor masTermino[valsMasTerm] ;
    public final String termino() throws RecognitionException {
        String valor = null;

        String factor29 = null;



          valor = "";
          java.util.Stack<String> valsMasTerm = new java.util.Stack<String>();

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:270:3: ( factor masTermino[valsMasTerm] )
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:270:6: factor masTermino[valsMasTerm]
            {
            pushFollow(FOLLOW_factor_in_termino667);
            factor29=factor();

            state._fsp--;

            pushFollow(FOLLOW_masTermino_in_termino669);
            masTermino(valsMasTerm);

            state._fsp--;

             
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
        return valor;
    }
    // $ANTLR end "termino"


    // $ANTLR start "masTermino"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:280:1: masTermino[java.util.Stack<String> valsMasTerm] : ( opLevel1 factor masTermino[valsMasTerm] | );
    public final void masTermino(java.util.Stack<String> valsMasTerm) throws RecognitionException {
        String opLevel130 = null;

        String factor31 = null;


        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:281:2: ( opLevel1 factor masTermino[valsMasTerm] | )
            int alt12=2;
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

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:281:5: opLevel1 factor masTermino[valsMasTerm]
                    {
                    pushFollow(FOLLOW_opLevel1_in_masTermino689);
                    opLevel130=opLevel1();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_masTermino691);
                    factor31=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_masTermino_in_masTermino693);
                    masTermino(valsMasTerm);

                    state._fsp--;

                     valsMasTerm.push ( opLevel130 + factor31); 

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:284:2: 
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
        return ;
    }
    // $ANTLR end "masTermino"


    // $ANTLR start "opLevel1"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:287:1: opLevel1 returns [String valor] : ( '*' | 'div' | 'mod' | '>' | '<' );
    public final String opLevel1() throws RecognitionException {
        String valor = null;


          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:290:3: ( '*' | 'div' | 'mod' | '>' | '<' )
            int alt13=5;
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

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:290:5: '*'
                    {
                    match(input,30,FOLLOW_30_in_opLevel1724); 
                    valor = "*";

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:291:4: 'div'
                    {
                    match(input,31,FOLLOW_31_in_opLevel1733); 
                    valor = "/";

                    }
                    break;
                case 3 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:292:4: 'mod'
                    {
                    match(input,32,FOLLOW_32_in_opLevel1740); 
                    valor = "%";

                    }
                    break;
                case 4 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:293:4: '>'
                    {
                    match(input,33,FOLLOW_33_in_opLevel1747); 
                    valor = ">";

                    }
                    break;
                case 5 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:294:4: '<'
                    {
                    match(input,34,FOLLOW_34_in_opLevel1756); 
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
        return valor;
    }
    // $ANTLR end "opLevel1"


    // $ANTLR start "factor"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:297:1: factor returns [String valor] : ( '(' expr ')' | ID | INT | StrLiteral | exprUnaria );
    public final String factor() throws RecognitionException {
        String valor = null;

        Token ID33=null;
        Token INT34=null;
        Token StrLiteral35=null;
        String expr32 = null;

        String exprUnaria36 = null;



          valor = "" ;

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:300:3: ( '(' expr ')' | ID | INT | StrLiteral | exprUnaria )
            int alt14=5;
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

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:300:5: '(' expr ')'
                    {
                    match(input,25,FOLLOW_25_in_factor779); 
                    pushFollow(FOLLOW_expr_in_factor781);
                    expr32=expr();

                    state._fsp--;

                    match(input,26,FOLLOW_26_in_factor783); 
                     valor = "(" + expr32 + ")"; 

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:301:4: ID
                    {
                    ID33=(Token)match(input,ID,FOLLOW_ID_in_factor791); 
                     valor = (ID33!=null?ID33.getText():null);                

                    }
                    break;
                case 3 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:302:4: INT
                    {
                    INT34=(Token)match(input,INT,FOLLOW_INT_in_factor808); 
                     valor = (INT34!=null?INT34.getText():null);               

                    }
                    break;
                case 4 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:303:4: StrLiteral
                    {
                    StrLiteral35=(Token)match(input,StrLiteral,FOLLOW_StrLiteral_in_factor825); 
                     valor = (StrLiteral35!=null?StrLiteral35.getText():null);        

                    }
                    break;
                case 5 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:304:4: exprUnaria
                    {
                    pushFollow(FOLLOW_exprUnaria_in_factor835);
                    exprUnaria36=exprUnaria();

                    state._fsp--;

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
        return valor;
    }
    // $ANTLR end "factor"


    // $ANTLR start "exprUnaria"
    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:308:1: exprUnaria returns [String valor] : ( 'no' expr | 'opuesto' expr | '-' expr );
    public final String exprUnaria() throws RecognitionException {
        String valor = null;

        String expr37 = null;

        String expr38 = null;

        String expr39 = null;



          valor = "";

        try {
            // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:311:3: ( 'no' expr | 'opuesto' expr | '-' expr )
            int alt15=3;
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

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:311:5: 'no' expr
                    {
                    match(input,35,FOLLOW_35_in_exprUnaria862); 
                    pushFollow(FOLLOW_expr_in_exprUnaria869);
                    expr37=expr();

                    state._fsp--;

                    valor = "! " + expr37;

                    }
                    break;
                case 2 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:312:10: 'opuesto' expr
                    {
                    match(input,36,FOLLOW_36_in_exprUnaria885); 
                    pushFollow(FOLLOW_expr_in_exprUnaria887);
                    expr38=expr();

                    state._fsp--;

                    valor = "- " + expr38;

                    }
                    break;
                case 3 :
                    // E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algortimizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\Robot.g:313:10: '-' expr
                    {
                    match(input,29,FOLLOW_29_in_exprUnaria903); 
                    pushFollow(FOLLOW_expr_in_exprUnaria911);
                    expr39=expr();

                    state._fsp--;

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