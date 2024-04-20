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
        int result = 0;

        run:
        for (int i = 0; i < N; i++) {
            int[] alphabet = new int[26];
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (alphabet[s.charAt(j) - 'a'] == 0) {
                    alphabet[s.charAt(j) - 'a']++;
                } else if (s.charAt(j) != s.charAt(j - 1)) {
                    continue run;
                }
            }
            result++;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}