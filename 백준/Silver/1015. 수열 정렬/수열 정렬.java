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
        br.close();
        
        int[] A = new int[N], 
              B = new int[N];
        int i = 0;
        
        for (; i < N; i++) 
            A[i] = Integer.parseInt(st.nextToken());
        
        int idxNum = 0;
        for (i = 1; i <= 1000; i++) 
            for (int j = 0; j < N; j++) 
                if (A[j] == i) {
                    B[j] = idxNum;
                    idxNum++;
                }
        
        for (i = 0; i < N; i++) 
            bw.write(B[i] + " ");
        bw.flush();
        bw.close();
    }
}