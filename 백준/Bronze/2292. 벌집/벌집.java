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
        int n = 1;
        int i = 6;
        int cnt = 1;
        while (n < N) {
            n += i;
            i += 6;
            cnt++;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}