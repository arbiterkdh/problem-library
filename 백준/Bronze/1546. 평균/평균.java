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
        double[] scores = new double[N];
        double max = 0;
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > max) max = scores[i];
        }
        
        for (int i = 0; i < N; i++) {
            scores[i] = scores[i] / max * 100;
            sum += scores[i];
        }
        bw.write(sum / N + "");
        bw.flush();
        bw.close();
    }
}