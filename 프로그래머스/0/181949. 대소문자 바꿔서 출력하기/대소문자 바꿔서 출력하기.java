import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ca = a.toCharArray();
        for(int i = 0; i<ca.length;i++){
            ca[i] = ca[i] >= 97 ? (char)(ca[i]-32) : (char)(ca[i]+32);
        }
        
        System.out.print(ca);
    }
}