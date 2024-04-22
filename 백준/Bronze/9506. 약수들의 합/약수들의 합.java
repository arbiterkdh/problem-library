import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        
        while (!(s = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(s);
            int sum = 0;
            Queue<Integer> q = new LinkedList<>();
            
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    q.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                bw.write(s + " = ");
                
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int temp = q.poll();
                    if (!q.isEmpty()) {
                        bw.write(temp + " + ");
                    } else {
                        bw.write(temp + "");
                    }
                }
                bw.write("\n");
            } else {
                bw.write(n + " is NOT perfect." + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}