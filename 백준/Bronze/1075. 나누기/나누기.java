import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()),
            F = Integer.parseInt(br.readLine());
        br.close();
        N = N / 100 * 100;
        
        for (int i = 0; i < 99; i++) {
            if (i == 0 && N % F == 0) {
                bw.write("00");
                break;
            } else if (i < 10 && N % F == 0) {
                bw.write("0" + i);
                break;
            } else if (N % F == 0) {
                bw.write(i + "");
                break;
            }
            N++;
        }
        bw.flush();
        bw.close();
    }
}