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
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),
            M = Integer.parseInt(st.nextToken());
        Map map = new HashMap();
        
        while (N-- > 0) map.put(br.readLine(), null);
        
        List<String> list = new ArrayList<>();
        
        while (M-- > 0) {
            String s = br.readLine();
            if (map.containsKey(s)) list.add(s);
        }
        br.close();
        bw.write(list.size() + "\n");
        list.sort(Comparator.naturalOrder());
        for (String s : list) bw.write(s + "\n");
        bw.flush();
        bw.close();
    }
}