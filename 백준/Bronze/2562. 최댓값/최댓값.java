import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = -1;
        int maxIdx = 0;
        int cnt = 0;
        String s = br.readLine();
    
        for (int i = 0; i < 9; i++) {
            cnt++;
            if (max < Integer.parseInt(s)) {
                max = Integer.parseInt(s);
                maxIdx = cnt;
            }
            s = br.readLine();
        }
    
        bw.write(max + "\n" + maxIdx);
        bw.flush();
        bw.close();
    }
}