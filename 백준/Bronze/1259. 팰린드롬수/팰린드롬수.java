import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while (!(s = br.readLine()).equals("0")) {
            int l = s.length() / 2;
            int i = 0;
            int cnt = 0;
            for (; l > 0; l--) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    cnt++;
                    break;
                }
                i++;
            }
            if (cnt == 0) bw.write("yes\n");
            else bw.write("no\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}