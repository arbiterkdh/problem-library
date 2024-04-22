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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int x1 = 0;
        int y1 = 0;
        int cntX = 1;
        int cntY = 1;
        
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            
            if (x != temp1) x1 = temp1;
            else cntX++;
            
            if (y != temp2) y1 = temp2;
            else cntY++;
        }
        br.close();
        
        if (cntX != 1) x = x1;
        if (cntY != 1) y = y1;
        bw.write (x + " " + y);
        bw.flush();
        bw.close();
    }
}