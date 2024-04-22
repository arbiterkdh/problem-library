import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();
        int sum = 0;
        int min = 0;
        
        for (int i = M; i <= N; i++) {
            if (i == 1) continue;
            boolean flag = false;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n" + min);
        }
        bw.flush();
        bw.close();     
    }
}