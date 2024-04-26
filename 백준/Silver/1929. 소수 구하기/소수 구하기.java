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
        br.close();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean prime;
        
        for (; M <= N; M++) {
            if (M < 2) M = 2;
            prime = true;
            
            for (int i = 2; i <= Math.sqrt(M); i++) {
                if (M % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) bw.write(M + "\n");
        }
        bw.flush();
        bw.close();
    }
}