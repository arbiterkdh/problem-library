import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (; T > 0; T--) {
            int k = Integer.parseInt(br.readLine()),
                    n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 1; i <= n; i++)
                arr[i - 1] = i * (i + 1) / 2;

            for (int i = 1; i < k; i++) {
                for (int j = 1; j < n; j++) {
                    arr[j] += arr[j - 1];
                }
            }
            bw.write(arr[n - 1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}