import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (N-- > 0) {
            String s = st.nextToken();
            if (map.containsKey(s)) {
                Integer cnt = map.get(s) + 1;
                map.put(s, cnt);
            } else map.put(s, 1);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        while (M-- > 0) {
            String s = st.nextToken();
            if (map.containsKey(s)) bw.write(map.get(s) + " ");
            else bw.write("0 ");
        }
        bw.flush();
        bw.close();
    }
}