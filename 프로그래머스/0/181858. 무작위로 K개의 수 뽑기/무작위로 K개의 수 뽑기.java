import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i<arr.length; i++){
            if(!list.contains(arr[i]) && idx<k){
                list.add(arr[i]);
                idx++;
            }
        }
        int[] answer = new int[k];
        Arrays.fill(answer , -1);
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}