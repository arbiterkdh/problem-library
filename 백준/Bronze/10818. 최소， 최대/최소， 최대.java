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
        int max = -1_000_000;
        int min = 1_000_000;
        
        for (int i = 0; i < N; i++) {
            int compare = Integer.parseInt(st.nextToken());
            if (compare > max) max = compare;
            if (compare < min) min = compare;
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}