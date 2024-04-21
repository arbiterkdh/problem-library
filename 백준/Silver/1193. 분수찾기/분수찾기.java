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
        int cnt = 1;
        int n = 1;
        
        while (n < X) {
            cnt++;
            n += cnt;
        }
        for (int i = 1; i < cnt; i++) {
            X -= i;
        }
        
        int numer, denom;
        if (cnt % 2 == 0) {
            bw.write(X + "/" +(cnt - X + 1));
        } else {
            bw.write((cnt - X + 1) + "/" + X);
        }
        bw.flush();
        bw.close();
    }
}