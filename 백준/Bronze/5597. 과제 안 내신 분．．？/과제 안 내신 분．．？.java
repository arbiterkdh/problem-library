import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] numbers = new boolean[30];
        
        for (int i = 0; i < 28; i++) {
            numbers[Integer.parseInt(br.readLine()) - 1] = true;
        }
        
        for (int i = 0; i < 30; i++) {
            if (!numbers[i]) bw.write((i + 1) + " ");
        }
        bw.flush();
        bw.close();
        
    }
}