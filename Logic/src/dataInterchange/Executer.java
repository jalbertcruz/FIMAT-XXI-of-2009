
package dataInterchange;

import java.util.*;
import java.lang.reflect.*;

public class Executer {

	Hashtable<String, Method> metodos;
	Object obj;

	@SuppressWarnings("unchecked")
	public Executer(Object obj) {
		this.obj = obj;
		Class cls = obj.getClass();
		metodos = new Hashtable<String, Method>();
		while (!cls.equals(Object.class)) {
			for (Method m : cls.getDeclaredMethods())
				metodos.put(m.getName(), m);
			cls = cls.getSuperclass();
		}
	}
	@SuppressWarnings("unchecked")
	public Executer(Class cls) {
		obj = null;
		metodos = new Hashtable<String, Method>();
		while (!cls.equals(Object.class)) {
			for (Method m : cls.getDeclaredMethods()){
				String str = m.getName();
				metodos.put(str, m);
			}
			cls = cls.getSuperclass();
		}
	}

	public Object Execute(String mth, Object... parametros) throws Exception {
		return metodos.get(mth).invoke(obj, parametros);
	}

	public Object Execute(String mth) throws Exception {
		return Execute(mth, (Object[]) null);
	}

}
