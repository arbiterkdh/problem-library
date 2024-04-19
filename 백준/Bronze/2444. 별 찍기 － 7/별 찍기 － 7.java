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
        
        for (int i = 1; i <= 2 * N; i += 2) {
            for (int j = 0; j < (2 * N - i) / 2; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 2 * N - 2; i >= 0; i -= 2) {
            for (int j = 0; j < (2 * N - i) / 2; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}