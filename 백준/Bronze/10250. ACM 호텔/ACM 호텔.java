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
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()),
                W = Integer.parseInt(st.nextToken()),
                N = Integer.parseInt(st.nextToken());
            if (N % H == 0) bw.write((H * 100 + (N - 1) / H + 1) + "\n");
            else bw.write((N % H * 100 + (N - 1) / H + 1) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}