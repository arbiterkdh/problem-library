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
        int dot = 4;
        br.close();
        for (int i = 0; i < N; i++) {
            dot = (int) Math.pow((Math.sqrt(dot) + Math.sqrt(dot) - 1), 2);
        }
        bw.write(dot + "");
        bw.flush();
        bw.close();
    }
}