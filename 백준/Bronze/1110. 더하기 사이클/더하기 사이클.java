import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int original = N;
        int right = 0;
        int cnt = 0;
        while (true) {
            cnt++;
            right = N % 10;
            N = N / 10 + right;
            N = right * 10 + N % 10;
            if (N == original) break;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}