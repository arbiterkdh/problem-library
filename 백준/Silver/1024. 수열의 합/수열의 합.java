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
            L = Integer.parseInt(st.nextToken()),
            sum = 0;
            
        
        while (N != sum) {
            int[] list = new int[L];
            list[0] = ((int) Math.ceil((double) N / L)) - L / 2;
            if (L > 100 || list[0] < 0) {
                bw.write("-1");
                break;
            }
            sum = list[0];
            for (int i = 1; i < L; i++) {
                list[i] = list[i - 1] + 1;
                sum += list[i];
            }
            if (sum == N) 
                for (int i = 0; i < L; i++) 
                    bw.write(list[i] + " ");
            
            L++;
        }
        bw.flush();
        bw.close();
    }
}