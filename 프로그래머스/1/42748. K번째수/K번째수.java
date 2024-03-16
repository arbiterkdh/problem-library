import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for(int[] command : commands){
            int[] ret = new int[command[1] - command[0] + 1];
            
            for(int i = 0; i < ret.length; i++){
                ret[i] = array[command[0] + i - 1];
                
            }
            Arrays.sort(ret);
            answer[idx] = ret[command[2]-1];
            idx++;
        }
        return answer;
    }
}