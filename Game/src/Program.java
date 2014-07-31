

import java.io.*;

import org.antlr.stringtemplate.*;

import org.apache.bsf.BSFManager;
import templates.*;

public class Program {

    public static void main(String[] args) throws Exception {

        Configurations confs = new Configurations(new Configuration(game.Robot.class), new Configuration(game.Puerta.class));
        
        StringTemplateGroup group =
                new StringTemplateGroup(
                new InputStreamReader(
                gui.MainGUI.class.getResourceAsStream("/templates/rubyApp.stg")));


        StringTemplate st = group.getInstanceOf("rubyApp");
        st.setAttribute("confs", confs);
        // Para verificar la generacion
         //System.out.print(st);
        
//        Writer output = null;
//        output = new BufferedWriter(new FileWriter("../JRChecker/lib/main.rb"));
//        output.write("include Java \n \n" + "require './../../Game/dist/Game' \n");
//        output.write(st.toString());
//        output.close();
        
        BSFManager.registerScriptingEngine("ruby",
                "org.jruby.javasupport.bsf.JRubyEngine",
                new String[]{"rb"});
        
        new BSFManager().exec("ruby", "", 0, 0, "include Java \n " + st);

    }
}
