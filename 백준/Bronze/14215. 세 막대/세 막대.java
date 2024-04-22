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
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int swap;
        
        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        } 
        if (b > c) {
            swap = b;
            b = c;
            c = swap;
        }
        
        if (a + b <= c) c = a + b - 1;
        bw.write((a + b + c) + "");
        bw.flush();
        bw.close();
    }
}