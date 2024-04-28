import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        boolean[] composite = new boolean[1_000_001];
        
        for (; T > 0; T--) {
            int N = Integer.parseInt(br.readLine());
            if (N == 4) {
                bw.write("1\n");
                continue;
            }
            int cnt = 0;
            
            for (int i = 2; i * i <= N; i ++) 
                for (int j = i * i; j <= N; j += i) 
                    composite[j] = true;
            
            for (int i = 3; i <= N / 2; i += 2) 
                if (!composite[i] && !composite[N - i]) cnt++;
            
            
            bw.write(cnt + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}