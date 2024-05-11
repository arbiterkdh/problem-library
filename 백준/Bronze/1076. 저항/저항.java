import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>(Map.of(
            "black", 0, "brown", 1, "red", 2, "orange", 3,"yellow", 4,
            "green", 5, "blue", 6, "violet", 7,"grey", 8, "white", 9));
        
        long n = map.get(br.readLine()) * 10;
        n += map.get(br.readLine());
        map.replaceAll((k, v) -> (Integer) (int) Math.pow(10, v));
        n *= map.get(br.readLine());
        
        br.close();
        bw.write(n + "");
        bw.flush();
        bw.close();
    }
}