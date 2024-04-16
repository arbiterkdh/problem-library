import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        
        if (time > 60) {
            int temp = time / 60;
            time %= 60;
            hour += temp;
        }
        
        if (time + minute >= 60) {
            hour++;
            minute += time - 60;
        } else {
            minute += time;
        }
        
        if (hour > 23) hour -= 24;
        System.out.println(hour + " " + minute);
    }
}