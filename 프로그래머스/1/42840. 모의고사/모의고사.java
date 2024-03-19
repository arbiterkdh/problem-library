import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] men1 = new int[]{1,2,3,4,5};
        int[] men2 = new int[]{2,1,2,3,2,4,2,5};
        int[] men3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[][] mens = new int[3][];
        
        mens[0] = men1;
        mens[1] = men2;
        mens[2] = men3; 
        
        int idx = 0;
        int maxScore = 0;
        
        int[] scores = new int[3];
        
        while(idx<3){
            int score = 0;
            int pick = 0;
            
            for(int i = 0; i<answers.length; i++){
                
                if(pick==mens[idx].length) pick = 0;
                
                if(answers[i]==mens[idx][pick]){
                    score++;
                }
                pick++;
            }
            if(maxScore<score){
                maxScore = score;
            }
            scores[idx] = score;
            idx++;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<3; i++){
            if(maxScore==scores[i]){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}