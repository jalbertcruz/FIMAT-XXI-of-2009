/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.IOException;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Compiler {

    public static String pseudoCodeToRuby(String psc) throws RecognitionException, IOException {
        
        CharStream input = new ANTLRStringStream(psc);

        RobotLexer lex = new RobotLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lex);

        //System.out.println("tokens="+tokens);

        RobotParser parser = new RobotParser(tokens);
        String st = rsc.TextLoader.getAllText(Compiler.class.getResourceAsStream("/rsc/util.rb"));
        return st + "\n" + parser.program();
        
    }
}
