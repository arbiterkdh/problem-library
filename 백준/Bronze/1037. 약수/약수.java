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
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) 
            arr[i] = Integer.parseInt(st.nextToken());
        
        quickSort(arr, 0, N - 1);
        bw.write(arr[0] * arr[N - 1] + "");
        bw.flush();
        bw.close();
    }
    
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        
        int left = low, 
            right = high,
            pivot = low + (high - low) / 2,
            pValue = arr[pivot];
        
        while (left < right) {
            while (arr[left] < pValue) left++;
            while (arr[right] > pValue) right--;
            
            if (left <= right) {
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left++;
                right--;
            }
        }
        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }
}