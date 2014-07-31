package templates;

import java.lang.reflect.Method;
import java.util.ArrayList;
import soporte.Require;

public class MethodInfo {

    private Method mth;

    public MethodInfo(Method mth) {
        this.mth = mth;
    }

    public ArrayList<String> getRequires() {
        ArrayList<String> res = new ArrayList<String>();
        Require req = mth.getAnnotation(Require.class);
        if (req != null) {
            String[] values = req.value().split(";");
            for (String value : values) {
                res.add(value);
            }
        } else {
            res.add("true");
        }
        return res;
    }

    public String getName() {
        return mth.getName();
    }

    public ArrayList<String> getParametersNames() {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < mth.getParameterTypes().length; i++) {
            res.add("p" + i);
        }
        return res;
    }
}
