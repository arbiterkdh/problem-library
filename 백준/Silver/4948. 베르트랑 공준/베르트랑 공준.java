import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        
        boolean prime;
        while((n = Integer.parseInt(br.readLine())) != 0) {
            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                prime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) cnt++;
            }
            bw.write(cnt + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}