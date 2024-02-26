class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = n; i>3; i--){
            for(int j = 2; j<n; j++){
                if(i%j==0 && i!=j){
                    
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}