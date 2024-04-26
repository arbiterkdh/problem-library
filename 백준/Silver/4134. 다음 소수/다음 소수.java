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
        
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            if (n < 2) n = 2;
            
            boolean prime = false;
            while (!prime) {
                prime = true;
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    bw.write(n + "\n");
                    break;
                } else n++;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}