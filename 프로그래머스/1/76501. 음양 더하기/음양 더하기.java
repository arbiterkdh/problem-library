class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        answer = signs[0] ? absolutes[0] : -absolutes[0] ;
        for(int i = 1; i<absolutes.length;i++){
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}