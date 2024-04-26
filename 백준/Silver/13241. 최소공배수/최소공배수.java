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
        br.close();
        
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        bw.write(A * B / getGCM(A, B) + "");
        bw.flush();
        bw.close();
    }
    
    static long getGCM(long A, long B) {
        long GCM;
        if (A % B == 0) GCM = B;
        else GCM = getGCM(B, A % B);
        return GCM;
    }
}