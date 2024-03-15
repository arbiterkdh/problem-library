class Solution {
    public int solution(int n) {
        int answer = 0;
        int share = n;
        int remainder = 0;
        while(share>2){
            remainder = share%3;
            share = share/3;
            answer += remainder;
            answer *=3;
        }
        
        return answer+share;
    }
}