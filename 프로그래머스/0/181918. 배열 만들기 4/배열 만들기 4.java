import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(list.get(list.size()-1)<arr[i]){
                list.add(arr[i]);
                i++;
            }else{
                list.remove(list.size()-1);
            }

        }
        int[] answer = new int[list.size()];
        for(int j = 0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}