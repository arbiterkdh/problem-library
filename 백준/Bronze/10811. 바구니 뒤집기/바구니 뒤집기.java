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
        int idx;
        
        for (idx = 0; idx < N; idx++) {
            bucket[idx] = idx + 1;
        }
        
        for (idx = 0; idx < M; idx++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            for (i = i; i <= j; i++) {
                int temp = bucket[i - 1];
                bucket[i - 1] = bucket[j - 1];
                bucket[j - 1] = temp;
                j--;
            }
        }
        
        for (idx = 0; idx < N; idx++) {
            bw.write(bucket[idx] + " ");
        }
        bw.flush();
        bw.close();
    }
}