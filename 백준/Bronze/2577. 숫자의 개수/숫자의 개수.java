import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        A *= Integer.parseInt(br.readLine())
            * Integer.parseInt(br.readLine());
        br.close();
        int[] arr = new int[10];
        while (A > 0) {
            arr[A % 10]++;
            A /= 10;
        }
        for (int i = 0; i < 10; i++)
            bw.write(arr[i] + "\n");
        bw.flush();
        bw.close();
    }
}