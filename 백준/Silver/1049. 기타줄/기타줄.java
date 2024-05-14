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
            setPrice = 1000, 
            eachPrice = 1000,
            money = 0;
        
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int pS = Integer.parseInt(st.nextToken()),
                pE = Integer.parseInt(st.nextToken());
            if (setPrice > pS) setPrice = pS;
            if (eachPrice > pE) eachPrice = pE;
        }
        br.close();
        
        if (eachPrice * 6 > setPrice) {
            if (N % 6 * eachPrice > setPrice) {
                money = N / 6 * setPrice + setPrice;
            } else {
                money = N / 6 * setPrice + N % 6 * eachPrice;
            }
        } else money = N * eachPrice;
        
        bw.write(money + "");
        bw.flush();
        bw.close();
    }
}