import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        char result = 
            (score >= 90) ? 'A' : 
            (score >= 80) ? 'B' : 
            (score >= 70) ? 'C' : 
            (score >= 60) ? 'D' : 'F';
        System.out.println(result);
    }
}

//시험 점수를 입력받아 
//90 ~ 100점은 A, 
//80 ~ 89점은 B, 
//70 ~ 79점은 C, 
//60 ~ 69점은 D, 
//나머지 점수는 F를 출력하는 프로그램을 작성하시오.