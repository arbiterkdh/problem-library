import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()),
            cnt = 0;
        Map map = new HashMap();
        
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (map.containsKey(s)) map.remove(s);
            else map.put(s, null);
        }
        
        br.close();
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((s1, s2) -> s2.compareTo(s1));
        
        for (String s : list) bw.write(s + "\n");
        
        bw.flush();
        bw.close();
    }
}