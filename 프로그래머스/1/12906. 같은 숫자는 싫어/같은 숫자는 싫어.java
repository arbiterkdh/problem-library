import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int len = arr.length;
        
        List<Integer> list = new ArrayList<>();
        int compare = -1;
        for(int i = 0; i<len; i++){
            if(compare!=arr[i]){
            list.add(arr[i]);
            }
            compare=arr[i];
        }
        
        int[] answer = new int[list.size()];
        int len2 = answer.length;
        for(int i = 0; i<len2; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}