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
        int a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken());
        br.close();
        int GCN = getGCN(a, b);
        int LCM = a * b / GCN;
        bw.write(GCN + "\n" + LCM);
        bw.flush();
        bw.close();
        
    }
    
    static int getGCN(int a, int b) {
        if (a % b == 0) return b;
        return getGCN(b, a % b);
    }
}