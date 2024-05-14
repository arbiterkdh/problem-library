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
        int N = Integer.parseInt(st.nextToken()),
            M = Integer.parseInt(st.nextToken()),
            size  = Math.min(N, M),
            i = 0, j;
        int[][] square = new int[N][M];
        
        for (; i < N; i++) {
            String s = br.readLine();
            for (j = 0; j < M; j++) 
                square[i][j] = s.charAt(j) - '0';
        }
        
        
        run : 
        while (size > 1) {
            int l = size - 1;
            for (i = 0; i < N - l; i++) 
                for (j = 0; j < M - l; j++) 
                    if (square[i][j] == square[i][j + l] && 
                        square[i][j] == square[i + l][j] &&
                        square[i][j] == square[i + l][j + l]) {
                        break run;
                    }
            size--;
        }
        
        bw.write(size * size + "");
        bw.flush();
        bw.close();
    }
} 