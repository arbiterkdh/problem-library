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
        char[] ca = new char[s.length() / 2];
        
        for (int i = 0; i < ca.length; i++) {
            ca[i] = s.charAt(i);
        }
        
        int n = s.length() - 1;
        int flag = 1;
        
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != s.charAt(n)) {
                flag = 0;
                break;
            }
            n--;
        }
        bw.write(flag + "");
        bw.flush();
        bw.close();
    }
}