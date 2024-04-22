import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        int swap;
        
        while (!(s = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A > B) {
                swap = A;
                A = B;
                B = swap;
            }
            if (B > C) {
                swap = B;
                B = C;
                C = swap;
            }
            if (A + B <= C) bw.write("Invalid" + "\n");
            else if (A == B && B == C) bw.write("Equilateral" + "\n");
            else if (A == B || B == C || A == C) bw.write("Isosceles" + "\n");
            else bw.write("Scalene" + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}