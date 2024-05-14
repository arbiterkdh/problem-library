import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        br.close();
        
        int cnt = 0;
        int n = 64;
        
        while (X > 0) {
            if (X >= n) {
                X -= n;
                cnt++;
            }
            n /= 2;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
} 