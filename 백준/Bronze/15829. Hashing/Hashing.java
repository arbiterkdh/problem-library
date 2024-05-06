import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        long n = 0;
        long pow = 1;
        for (int i = 0; i < L; i++) {
            n += (s.charAt(i) - 'a' + 1) * pow;
            pow = (pow * 31) % 1234567891;
        }
        bw.write(n % 1234567891 + "");
        bw.flush();
        bw.close();
    }
}