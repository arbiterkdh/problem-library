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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < 6; i++) {
            bw.write(
                (chess[i] - Integer.parseInt(st.nextToken())) + " ");
        }
        bw.flush();
        bw.close();
    }
}