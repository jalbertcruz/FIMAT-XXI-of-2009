package dataInterchange;

import java.lang.reflect.*;
import java.util.*;
import java.util.ArrayList;

public class FieldManipulator {

    Hashtable<String, Field> fields;
    Object obj;

    @SuppressWarnings("unchecked")
    public FieldManipulator(Object obj) {
        this.obj = obj;
        Class cls = obj.getClass();
        fields = new Hashtable<String, Field>();
        while (!cls.equals(Object.class)) {
            for (Field f : cls.getDeclaredFields()) {
                f.setAccessible(true);
                fields.put(f.getName(), f);
            }

            cls = cls.getSuperclass();
        }
    }

    public void write(String f, Object value) throws IllegalArgumentException,
            IllegalAccessException {
        fields.get(f).set(obj, value);
    }

    public Object read(String f) throws IllegalArgumentException,
            IllegalAccessException {
        return fields.get(f).get(obj);
    }

    public ArrayList<String> getFieldsNames() {
        ArrayList<String> res = new ArrayList<String>();
        for (String k : fields.keySet()) {
            if (! k.startsWith("_"))
            res.add(k);
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        Enumeration<String> en = fields.keys();
        while (en.hasMoreElements()) {
            res += " " + (String) en.nextElement();
        }
        return res;
    }
}
