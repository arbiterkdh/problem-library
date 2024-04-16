import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        if (A == B && B == C) System.out.println(10000 + A * 1000);
        else if (A == B || A == C) System.out.println(1000 + A * 100);
        else if (B == C) System.out.println(1000 + B * 100);
        else {
            int max;
            if (A > B && A > C) max = A;
            else if (B > A && B > C) max = B;
            else max = C;
            System.out.println(max * 100);
        }
    }
}