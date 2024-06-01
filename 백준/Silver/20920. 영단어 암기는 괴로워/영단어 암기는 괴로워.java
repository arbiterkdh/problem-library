import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        while (N-- > 0) {
            String s = br.readLine();
            if (s.length() >= M) {
                int cnt = map.getOrDefault(s, 0) + 1;
                map.put(s, cnt);
            }
        }
        br.close();
        List<String> list = new ArrayList<>();
        map.keySet().stream()
                .sorted()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .sorted((s1, s2) -> map.get(s2) - map.get(s1)).forEach(list::add);
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}