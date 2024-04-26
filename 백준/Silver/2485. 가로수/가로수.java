import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        int min = 1_000_000_000;
        
        for (int i = 0; i < N - 1; i++) {
            if (arr[i + 1] - arr[i] < min) 
                min = arr[i + 1] - arr[i]; 
        }
        
        int cnt;
        boolean flag = true;
        while (flag) {
            cnt = 0;
            for (int i = 0; i < N - 1; i++) {
                if ((arr[i + 1] - arr[i]) % min != 0) {
                    min = (arr[i + 1] - arr[i]) % min;
                    break;
                }
                cnt++;
            }
            if (cnt == N - 1) flag = false;
        } 
        bw.write(((arr[N -1] - arr[0]) / min + 1 - N) + "");
        bw.flush();
        bw.close();
    }
}