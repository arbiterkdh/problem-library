class Solution {
    public int solution(int n) {
        int answer = 1;
        int j =0;
        for(int i=1;i<n;i++){
            j=n/i;
            if(n==i*j){
                answer++;
            }
        }
        
        
        return answer;
    }
}