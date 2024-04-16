import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int temp = B;
        while (temp > 0) {
            System.out.println(A * (temp % 10));
            temp /= 10;
        }
        System.out.println(A * B);
    }
}