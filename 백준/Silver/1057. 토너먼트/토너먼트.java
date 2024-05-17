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
        int N = Integer.parseInt(st.nextToken()),
            a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken()),
            cnt = 1;
        br.close();
        
        while (true) {
            if (a % 2 == 1) a++;
            if (b % 2 == 1) b++;
            a /= 2;
            b /= 2;
            if(a == b) break;
            cnt++;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}