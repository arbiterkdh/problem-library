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
        int n = Integer.parseInt(st.nextToken());
        int m, cnt = 1;
        
        if (n == 1) {
            while ((m = Integer.parseInt(st.nextToken())) == ++n) 
                if (++cnt == 8) break;
            
            if (cnt == 8) bw.write("ascending");
            else bw.write("mixed");
        } else if (n == 8) {
            while ((m = Integer.parseInt(st.nextToken())) == --n) 
                if (++cnt == 8) break;
            
            if (cnt == 8) bw.write("descending");
            else bw.write("mixed");
        } else bw.write("mixed");
        bw.flush();
        bw.close();
    }
}