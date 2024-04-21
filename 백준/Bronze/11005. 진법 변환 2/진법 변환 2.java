import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        while (N > 0) {
            stack.push(N % B);
            N /= B;
        }
        while (!stack.empty()) {
            int temp = stack.pop();
            if (temp >= 10) sb.append((char)('A' - 10 + temp));
            else sb.append((char)('0' + temp));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}