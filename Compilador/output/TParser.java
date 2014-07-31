// $ANTLR 3.1.2 C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\T.g 2009-03-08 23:36:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class TParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'call'", "';'"
    };
    public static final int WS=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__7=7;
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
        public TParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public TParser(TokenStream input, int port, RecognizerSharedState state) {
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
    public TParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return TParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\T.g"; }



    // $ANTLR start "r"
    // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\T.g:2:1: r : 'call' ID ';' ;
    public final void r() throws RecognitionException {
        Token ID1=null;

        try { dbg.enterRule(getGrammarFileName(), "r");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(2, 1);

        try {
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\T.g:3:3: ( 'call' ID ';' )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\T.g:3:5: 'call' ID ';'
            {
            dbg.location(3,5);
            match(input,6,FOLLOW_6_in_r11); 
            dbg.location(3,12);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_r13); 
            dbg.location(3,15);
            match(input,7,FOLLOW_7_in_r15); 
            dbg.location(3,19);
            System.out.println("invoke "+(ID1!=null?ID1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(3, 61);

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


 

    public static final BitSet FOLLOW_6_in_r11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_r13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_r15 = new BitSet(new long[]{0x0000000000000002L});

}