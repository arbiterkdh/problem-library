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
        int N = Integer.parseInt(br.readLine());
        int minX = 10000, minY = 10000, maxX = -10000, maxY = -10000;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tempX = Integer.parseInt(st.nextToken());
            int tempY = Integer.parseInt(st.nextToken());
            
            minX = Math.min(tempX, minX);
            maxX = Math.max(tempX, maxX);
            minY = Math.min(tempY, minY);
            maxY = Math.max(tempY, maxY);
        }
        br.close();
        
        if (minX != maxX && minY != maxY) 
            bw.write((maxX - minX) * (maxY - minY) + "");
        else bw.write("0");
        
        bw.flush();
        bw.close();
    }
}