import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) max = arr[i];
        }
        br.close();
        radixSort(arr, N, max);

        for (int i = 0; i < N; i++)
            bw.write(arr[i] + "\n");
        bw.flush();
        bw.close();
    }

    static void radixSort(int[] arr, int size, int max) {
        for (int scope = 1; scope <= max; scope *= 10)
            countSort(arr, size, scope);
    }

    static void countSort(int[] arr, int size, int scope) {
        int[] bucket = new int[10],
                sorted = new int[size];
        int i;

        for (i = 0; i < size; i++)
            bucket[arr[i] / scope % 10]++;

        for (i = 1; i < 10; i++)
            bucket[i] += bucket[i - 1];

        for (i = size - 1; i >= 0; i--) {
            sorted[bucket[arr[i] / scope % 10] - 1] = arr[i];
            bucket[arr[i] / scope % 10]--;
        }

        for (i = 0; i < size; i++)
            arr[i] = sorted[i];
    }
}
