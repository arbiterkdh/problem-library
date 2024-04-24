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
        int a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken()),
            c = Integer.parseInt(st.nextToken()),
            d = Integer.parseInt(st.nextToken()),
            e = Integer.parseInt(st.nextToken()),
            f = Integer.parseInt(st.nextToken());
        int x, y;
        
        run : for (x = -999; x < 1000; x++) {
            for (y = -999; y < 1000; y++) {
                if ((a * x + b * y == c) && (d * x + e * y == f)) {
                    bw.write(x + " " + y);
                    break run;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}