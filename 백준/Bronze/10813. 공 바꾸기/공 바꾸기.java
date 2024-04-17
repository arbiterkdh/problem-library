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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        int temp;
        
        for (int i = 0; i < N; i++) {
            bucket[i] = i + 1;
        }
        
        for (int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
        }
        
        for (int i = 0; i < N; i++) {
            bw.write(bucket[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}