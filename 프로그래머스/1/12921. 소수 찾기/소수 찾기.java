class Solution {
    public int solution(int n) {
        int answer = 0;
        
        run:for(int i = 2; i<=n; i++){
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    continue run;
                }
            }
            answer++;
        }
        
        return answer;
    }
}