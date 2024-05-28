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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()),
            B = Integer.parseInt(st.nextToken()),
            i = 0;
        Map map1 = new HashMap(), 
            map2 = new HashMap();
        List list = new ArrayList();
        
        st = new StringTokenizer(br.readLine());
        for (; i < A; i++) map1.put(st.nextToken(), null);
        
        st = new StringTokenizer(br.readLine());
        br.close();
        for (i = 0; i < B; i++) {
            String s = st.nextToken();
            map2.put(s, null);
            if (map1.containsKey(s)) list.add(null);
        }
        
        map1.forEach((k, v) -> {
            if (map2.containsKey(k)) list.add(null);
        });
        bw.write((map1.size() + map2.size() - list.size()) + "");
        bw.flush();
        bw.close();
    }
}