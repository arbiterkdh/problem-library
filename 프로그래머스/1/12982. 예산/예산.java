import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int e: d){
            if(budget-e>=0){
                budget-=e;
                answer++;
            }else{break;}
        }
        return answer;
    }
}