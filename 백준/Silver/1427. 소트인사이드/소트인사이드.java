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
        br.close();
        int l = s.length();
        char[] ca = new char[l];
        
        for (int i = 0; i < l; i++) {
            ca[i] = s.charAt(i);
        }
        
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (ca[i] < ca[j]) {
                    char swap = ca[i];
                    ca[i] = ca[j];
                    ca[j] = swap;
                }
            }
        }
        bw.write(ca);
        bw.flush();
        bw.close();
    }
}