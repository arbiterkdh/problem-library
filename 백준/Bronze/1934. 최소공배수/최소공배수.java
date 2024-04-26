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
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int LCM = A * B / getGCM(A, B);
            bw.write(LCM + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    
    static int getGCM(int A, int B) {
        int GCM;
        if (A % B == 0) GCM = B;
        else GCM = getGCM(B, A % B);
        return GCM;
    }
}