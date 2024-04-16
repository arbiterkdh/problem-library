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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        
        while (sum != 0) {
            bw.write(sum + "\n");
            st = new StringTokenizer(br.readLine(), " ");
            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        
        bw.flush();
        bw.close();
    }
}