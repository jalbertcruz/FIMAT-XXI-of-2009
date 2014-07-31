
package templates;

import java.util.ArrayList;

public class Configurations {
    
    ArrayList<Configuration> confs;
    
    public ArrayList<Configuration> getConfiguraciones(){
        return confs;
    }
    
    public Configurations(Configuration... cs){
        confs = new ArrayList<Configuration>();
        for(Configuration c : cs)
            confs.add(c);
    }
    
    public void adicionarConfiguracion(Configuration c){
        confs.add(c);
    }
}
