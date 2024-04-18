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
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == -1)
                alphabet[s.charAt(i) - 'a'] = i;
        }
        for (int i : alphabet) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        
    }
}