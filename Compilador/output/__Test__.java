import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TLexer lex = new TLexer(new ANTLRFileStream("E:\\Albert\\Mis Documentos\\!Personal\\Eventos\\Camaguey 2009\\Robot\\src\\Compilador\\output\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TParser g = new TParser(tokens, 49100, null);
        try {
            g.r();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}