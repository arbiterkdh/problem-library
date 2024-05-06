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
        for (int i = 0; i < L; i++)
            n += (long) ((s.charAt(i) - 'a' + 1) * Math.pow(31, i));
        n %= 1234567891;
        bw.write(n + "");
        bw.flush();
        bw.close();
    }
}