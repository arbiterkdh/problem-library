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
        int cnt = 1;
        int n = 666;
        
        while (cnt != N) {
            n++;
            if (Integer.toString(n).contains("666")) {
                cnt++;
            }
        }
        bw.write(n + "");
        bw.flush();
        bw.close();
    }
}