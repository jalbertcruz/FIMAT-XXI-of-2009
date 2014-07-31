// $ANTLR 3.1.2 C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g 2009-03-08 23:33:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class lexicoParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'#'"
    };
    public static final int WS=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__6=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "r"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public lexicoParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public lexicoParser(TokenStream input, int port, RecognizerSharedState state) {
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
    public lexicoParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return lexicoParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g"; }


    String s;



    // $ANTLR start "r"
    // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:10:1: r : ID '#' ;
    public final void r() throws RecognitionException {
        Token ID1=null;

        try { dbg.enterRule(getGrammarFileName(), "r");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 1);

        try {
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:10:3: ( ID '#' )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:10:5: ID '#'
            {
            dbg.location(10,5);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_r29); 
            dbg.location(10,8);
            match(input,6,FOLLOW_6_in_r31); 
            dbg.location(10,12);
            s = (ID1!=null?ID1.getText():null); System.out.println("found "+s);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(10, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "r");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_r29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r31 = new BitSet(new long[]{0x0000000000000002L});

}