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
        StringTokenizer 
            st = new StringTokenizer(br.readLine()),
            st2 = new StringTokenizer(br.readLine());
        br.close();
        int[] A = new int[N], B = new int[N];
        int S = 0, i = 0;
        
        for (; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st2.nextToken());
        }
        int swap;
        for (i = 0; i < N - 1; i++) 
            for (int j = i + 1; j < N; j++) {
                if (A[i] > A[j]) {
                    swap = A[i];
                    A[i] = A[j];
                    A[j] = swap;
                }
                if (B[i] < B[j]) {
                    swap = B[i];
                    B[i] = B[j];
                    B[j] = swap;
                }
            }
        for (; i >= 0; i--) {
            S += A[i] * B[i];
        }
        bw.write(S + "");
        bw.flush();
        bw.close();
    }
}