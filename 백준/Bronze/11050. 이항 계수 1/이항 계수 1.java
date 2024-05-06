import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        sc.close();
        int nf = 1, rf = 1, n_rf = 1, i;
        for (i = N; i > 0; i--)
            nf *= i;
        for (i = K; i > 0; i--)
            rf *= i;
        for (i = N - K; i > 0; i--)
            n_rf *= i;
        System.out.println(nf / (n_rf * rf));
    }
}