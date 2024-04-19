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
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' ) alphabet[s.charAt(i) - 'a']++;
            else alphabet[s.charAt(i) - 'A']++;
        }
        
        int max = 0;
        int subMax = 0;
        int maxIdx = 0;
        
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= max) {
                subMax = max;
                max = alphabet[i];
                maxIdx = i;
            }
        }
        
        if (max == subMax) bw.write("?");
        else bw.write(maxIdx + 'A');
        
        bw.flush();
        bw.close();
    }
}