class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long idx = 0;
        for(int i = 0 ; i<n ; i++){
            idx+= x;
            answer[i]= idx;
        }
        
        
        return answer;
    }
}