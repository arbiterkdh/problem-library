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
        char[][] ca = new char[][] {
            {'c', '='}, {'c', '-'}, 
            {'d', 'z', '='}, {'d', '-'}, 
            {'l', 'j'}, {'n', 'j'}, 
            {'s', '='}, {'z', '='}};
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '=') continue;
            
            for (int j = 0; j < ca.length; j++) {
                if (s.length() - i < ca[j].length) continue;
                
                int cnt = 0;
                int temp = i;
                
                for (int k = 0; k < ca[j].length; k++) {
                    if (s.charAt(temp) != ca[j][k]) break;
                    cnt++;
                    temp++;
                }
                if (cnt == ca[j].length) {
                    i += ca[j].length - 1;
                    break;
                }
            }
            result++;
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        
    }
}