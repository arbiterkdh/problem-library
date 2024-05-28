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
        int N = Integer.parseInt(br.readLine());
        br.close();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 2; i <= N; i++) queue.add(i);
        
        while (queue.size() > 1) {
            Integer n = queue.poll();
            queue.add(n);
            queue.poll();
        }
        
        if (N == 1) bw.write("1");
        else bw.write(queue.poll() + "");
        bw.flush();
        bw.close();
    }
}