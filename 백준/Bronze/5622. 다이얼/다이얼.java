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
        int[] alphabet = new int[26];
        int n = 3;
        int cnt = 0;
        int sum = 0;
        
        for (int i = 0; i < 26; i++) {
            cnt++;
            alphabet[i] = n;
            
            if (n == 8 && cnt < 4) continue; 
            if (cnt >= 3 && n < 10) {
                n++;
                cnt = 0;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            sum += alphabet[s.charAt(i) - 'A'];
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}