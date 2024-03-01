class Solution {
    public long solution(long balls, long share) {
        long answer = 1;
        if(balls==share){
            return answer;
        }
        for(long i = 1; i<=share ;i++){
            answer *= (balls-share+i);
            answer /= i ;
        }
        return answer;
    }
}