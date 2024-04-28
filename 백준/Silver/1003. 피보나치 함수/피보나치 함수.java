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
        
        for (; T > 0; T--) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                bw.write("1 0\n");
                continue;
            } else if (N == 1) {
                bw.write("0 1\n");
                continue;
            }
            int n0 = 0;
            int n1 = 1;
            int sum = 0;
            for (int i = 2; i <= N; i++) {
                sum = n0 + n1;
                n0 = n1;
                n1 = sum;
            }
            
            bw.write(n0 + " " + sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}