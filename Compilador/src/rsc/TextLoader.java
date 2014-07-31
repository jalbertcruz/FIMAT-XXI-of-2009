package rsc;

import java.io.*;

public class TextLoader {

    public static String getAllText(InputStream ir) throws IOException {
        String res = "";
        InputStreamReader isr = new InputStreamReader(ir);
        BufferedReader br = new BufferedReader(isr);
        try {
            String line = null;
            while ( (line = br.readLine()) != null ) {
                res += line + "\n";
            }
        } finally {
            br.close();
        }
        return res;
    }
}
