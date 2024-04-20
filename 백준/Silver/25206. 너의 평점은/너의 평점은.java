import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        double scoreSum = 0;
        double sum = 0;
        Map<String, Double> map = new HashMap<>(Map.of(
                "A+", 4.5, "A0", 4.0, 
                "B+", 3.5, "B0", 3.0,
                "C+", 2.5, "C0", 2.0,
                "D+", 1.5, "D0", 1.0,
                "F", 0.0));
        
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (!grade.equals("P")) {
                sum += map.get(grade) * score;
                scoreSum += score;
            }
            
        }
        bw.write(sum / scoreSum + "");
        bw.flush();
        bw.close();
    }
}