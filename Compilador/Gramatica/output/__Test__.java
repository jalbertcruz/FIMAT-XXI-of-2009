import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RobotLexer lex = new RobotLexer(new ANTLRFileStream("E:\\Albert\\Mis Documentos\\Asesoria\\!Principios de Algoritmizacion\\Software\\Robot\\src\\Compilador\\Gramatica\\output\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RobotParser g = new RobotParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}