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
            M = Integer.parseInt(st.nextToken()),
            cnt = 0;
        Map map = new HashMap();
       
        while (N-- > 0) map.put(br.readLine(), null);
        while (M-- > 0) 
            if (map.containsKey(br.readLine())) cnt++;
        br.close();
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}