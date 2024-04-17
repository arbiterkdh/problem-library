import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] numbers = new boolean[42];
        int cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            numbers[Integer.parseInt(br.readLine()) % 42] = true;
        }
        for (int i = 0; i < 42; i++) {
            if (numbers[i]) cnt++;
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}