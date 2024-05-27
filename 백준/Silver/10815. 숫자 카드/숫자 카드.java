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
        Map map = new HashMap();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int i = 0;
        for (; i < N; i++) map.put(st.nextToken(), null);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        
        for (i = 0; i < M; i++) {
            String s = st.nextToken();
            if (map.containsKey(s)) bw.write("1 ");
            else bw.write("0 ");
        }
        bw.flush();
        bw.close();
    }
}