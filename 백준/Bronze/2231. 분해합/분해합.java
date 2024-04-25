import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int l = s.length();
        int N = Integer.parseInt(s);
        br.close();
        int result = 0;
        
        for (int i = (N >= 100) ? N - l * 9 : 0; i < N; i++) {
            int sum = i;
            char[] ca = String.valueOf(i).toCharArray();
            for (int j = 0; j < ca.length; j++) {
                sum += ca[j] - '0';
            }
            if (sum == N) {
                result = i;
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}