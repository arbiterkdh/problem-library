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
        int cnt = -1;
        
        run : for (int five = N / 5; five >= 0; five--) {
            for (int three = 0; three * 3 + five * 5 <= N; three++) {
                if (five * 5 + three * 3 == N) {
                    cnt = five + three;
                    break run;
                }
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}