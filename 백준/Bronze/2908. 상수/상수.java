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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int A2 = 0;
        int B2 = 0;
        int max = 0;
        
        for (int i = 0; i < 3; i++) {
            A2 = A2 * 10 + A % 10;
            B2 = B2 * 10 + B % 10;
            A /= 10;
            B /= 10;
        }
        if (A2 > B2) max = A2;
        else max = B2;
        
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}