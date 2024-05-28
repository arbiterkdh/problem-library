import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        br.close();
        Map map = new HashMap();
        int len = 1,
            sLen = S.length();
        while (len <= sLen) {
            for (int i = 0; i <= sLen - len; i++) {
                String s = S.substring(i, i + len);
                map.put(s, null);
            }
            len++;
        }
        bw.write(map.size() + "");
        bw.flush();
        bw.close();
    }
}