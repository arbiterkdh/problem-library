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
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        
        if (A + B + C != 180) bw.write("Error");
        else if (A == B && B == C) bw.write("Equilateral");
        else if (A == B || A == C || B == C) bw.write("Isosceles");
        else bw.write("Scalene");
        bw.flush();
        bw.close();
    }
}