import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[0];
        for(int i = 0; i<arr.length;i++){
            if(Math.pow(2,i)>=arr.length) {
                answer = new int[(int)Math.pow(2,i)];
                break;
            }
        }
        for(int i = 0; i<arr.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}