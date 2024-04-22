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
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(st.nextToken());
            boolean flag = false;
            if (X == 1) continue;
            
            for (int j = 2; j <= Math.sqrt(X); j++) {
                if (X % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) result++;
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}