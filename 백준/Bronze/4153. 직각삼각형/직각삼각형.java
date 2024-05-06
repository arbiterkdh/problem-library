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
        StringTokenizer st;
        String s;
        
        while (!(s = br.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken()),
                c = Integer.parseInt(st.nextToken());
            int pa = a * a, pb = b * b, pc = c * c;
            if (pa + pb == pc || pa + pc == pb || pb + pc == pa)
                bw.write("right\n");
            else bw.write("wrong\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}