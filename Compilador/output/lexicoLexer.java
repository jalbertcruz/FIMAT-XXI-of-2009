// $ANTLR 3.1.2 C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g 2009-03-08 23:33:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class lexicoLexer extends Lexer {
    public static final int WS=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__6=6;

    // delegates
    // delegators

    public lexicoLexer() {;} 
    public lexicoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public lexicoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:7:6: ( '#' )
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:7:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:11:3: ( ( 'a' .. 'z' )+ )
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:11:5: ( 'a' .. 'z' )+
            {
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:11:5: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:11:5: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:12:3: ( ( ' ' | '\\n' | '\\r' )+ )
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:12:5: ( ' ' | '\\n' | '\\r' )+
            {
            // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:12:5: ( ' ' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:1:8: ( T__6 | ID | WS )
        int alt3=3;
        switch ( input.LA(1) ) {
        case '#':
            {
            alt3=1;
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=2;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
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
                // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:1:15: ID
                {
                mID(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\jalbert\\Desktop\\Lexico\\lexico.g:1:18: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}