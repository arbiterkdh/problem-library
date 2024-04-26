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
        int num1 = Integer.parseInt(st.nextToken());
        int denom1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        br.close();
        
        int num2 = Integer.parseInt(st.nextToken());
        int denom2 = Integer.parseInt(st.nextToken());
        
        int num3 = num1 * denom2 + num2 * denom1;
        int denom3 = denom1 * denom2;
        int GCM = getGCM(num3, denom3);
        
        bw.write(num3 / GCM + " " + denom3 / GCM);
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