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
        
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int n = B;
        char c = N.charAt(N.length() - 1);
        int result = c >= 'A' ? c - 'A' + 10 : c - '0';

        for (int i = N.length() - 2; i >= 0; i--) {
            c = N.charAt(i);
            if (c >= 'A') {
                result += (c - 'A' + 10) * B;
            } else {
                result += (c - '0') * B;
            }
            B *= n;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}