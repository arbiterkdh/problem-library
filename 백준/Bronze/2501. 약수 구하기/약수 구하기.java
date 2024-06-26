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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        br.close();
        int cnt = 0;
        int result = 0;
        
        for (int i = 1; i <=  N / 2; i++) {
            if (N % i == 0) {
                cnt++;
                if (cnt == K) {
                    result = i;
                    break;
                }
            }
        }
        if (cnt + 1 == K) result = N;
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}