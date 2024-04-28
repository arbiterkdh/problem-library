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
                r1 = Integer.parseInt(st.nextToken()),
                x2 = Integer.parseInt(st.nextToken()),
                y2 = Integer.parseInt(st.nextToken()),
                r2 = Integer.parseInt(st.nextToken());
            int x3 = Math.abs(x1 - x2),
                y3 = Math.abs(y1 - y2);
            double z3 = Math.sqrt(x3 * x3 + y3 * y3);
            
            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) bw.write("-1\n");
                else bw.write("0\n");
            } else if (r1 < r2 + z3 && r2 < r1 + z3) {
                if (z3 == r1 + r2) bw.write("1\n");
                else if (z3 < r1 + r2) bw.write("2\n");
                else bw.write("0\n");
            } else if (r1 == r2 + z3 || r2 == r1 + z3)
                bw.write("1\n");
            else bw.write("0\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}