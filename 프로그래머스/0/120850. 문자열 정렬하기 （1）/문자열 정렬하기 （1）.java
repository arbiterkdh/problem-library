import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numberStr = my_string.replaceAll("[^0-9]","");
        String[] numberArr = numberStr.split("");
        Arrays.sort(numberArr);
        int[] answer = new int[numberArr.length];
        for(int i=0;i<numberArr.length;i++){
             answer[i] = Integer.parseInt(numberArr[i]);
        }

        
        return answer;
    }
}