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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),
            M = Integer.parseInt(st.nextToken());
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            map1.put(i, s);
            map2.put(s, i);
        }
        while (M-- > 0) {
            String s = br.readLine();
            if (map2.containsKey(s)) bw.write(map2.get(s) + "\n");
            else bw.write(map1.get(Integer.parseInt(s)) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}