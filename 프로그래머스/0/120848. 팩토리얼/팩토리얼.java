class Solution {
    public int solution(int n) {
        int answer = 0;
        int j=1;
        for(int i=1;i<=n ;i++){
            j*=i;
            answer++;
            if(j>n){
                answer-=1;
                break;
            }else if(j==n){
                break;
            }

        }
        return answer;
    }
}