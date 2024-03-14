import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int e : B){
            list.add(e);
        }

        Collections.reverse(list);
        
        for(int i = 0; i<A.length ; i++){
            B[i] = list.get(i);
        }
        
        for(int i = 0 ; i<A.length ; i++){
            answer += A[i]*B[i];
        }
        
        return answer;
    }
}