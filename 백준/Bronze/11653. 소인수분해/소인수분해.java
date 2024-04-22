import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int cnt = 0;
        
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
                cnt++;
            }
        }
        if (N != 1 && cnt == 0) bw.write(N + "");
        bw.flush();
        bw.close();
    }
}