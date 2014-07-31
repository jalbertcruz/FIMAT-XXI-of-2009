package templates;

import java.lang.reflect.Method;
import java.util.ArrayList;
import soporte.Command;

public class Configuration {

    Class<?> cls;

    public Configuration(Class<?> pCls) {
        cls = pCls;
    }

    // Se asume que la clase cls solo tiene un constructor
    public String[] getParamsNameProposals() {
        String[] res = new String[cls.getConstructors()[0].getParameterTypes().length];
        for (int i = 0; i < res.length; i++) {
            res[i] = "p" + i;
        }
        return res;
    }

    
    public ArrayList<MethodInfo> getActionMethods() {

        Method[] methodsInic = cls.getMethods();
        ArrayList<MethodInfo> methods = new ArrayList<MethodInfo>();

        for (Method method : methodsInic) {
            Command act = method.getAnnotation(Command.class);
            if (act != null) {
                methods.add( new MethodInfo(method) );
            }
        }
        
        return methods;
        
    }

    public String getFullClassName() {
        return cls.getName();
    }

    public String getClassName() {
        String[] parts = cls.getName().split("\\.");
        return parts[parts.length - 1];
    }
}
