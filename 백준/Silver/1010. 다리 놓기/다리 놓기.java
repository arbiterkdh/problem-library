import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken());
            int n = 1;
            for (int i = 0; i < N; i++) 
                n = n * (M - i) / (i + 1);
            
            bw.write(n + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}