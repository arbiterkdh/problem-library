import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String[] strArr = Long.toString(n).split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strArr.length;i++){
            sb.append(strArr[i]);
        }
        strArr = sb.reverse().toString().split("");
        int[] answer = new int[strArr.length];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}