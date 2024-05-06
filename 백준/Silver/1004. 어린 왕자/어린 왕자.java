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
        
        for (; T > 0; T--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()),
                y1 = Integer.parseInt(st.nextToken()),
                x2 = Integer.parseInt(st.nextToken()),
                y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
        
            for (; n > 0; n--) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken()),
                    cy = Integer.parseInt(st.nextToken()),
                    cr = Integer.parseInt(st.nextToken());
            
                double r1 = Math.sqrt(Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2)),
                       r2 = Math.sqrt(Math.pow(cx - x2, 2) + Math.pow(cy - y2, 2));
            
                if ((cr > r1 && cr < r2) || (cr > r2 && cr < r1)) cnt++;
            }
            bw.write(cnt + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}