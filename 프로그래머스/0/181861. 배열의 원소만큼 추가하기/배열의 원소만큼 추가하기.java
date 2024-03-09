import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int e: arr){
            for(int i = 0;i<e;i++){
                al.add(e);
            }
        }
        
        int size = al.size();
        int[] answer = new int[size];
        
        for(int i = 0; i<answer.length;i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}