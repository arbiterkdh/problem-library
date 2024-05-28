import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    public static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        
        for (int i = 0; i < N; i++) 
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        
        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0)
                sb.append("1").append("\n");
            else sb.append("0").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int binarySearch(int k) {
        int lo = 0;
        int hi = arr.length - 1;
        
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (k > arr[mid]) lo = mid + 1;
            else if (k < arr[mid]) hi = mid - 1;
            else return mid;
        }
        return -1;
    }
}