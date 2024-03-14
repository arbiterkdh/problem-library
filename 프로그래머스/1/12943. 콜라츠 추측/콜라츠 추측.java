class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        while(temp!=1){
            temp = temp%2==0 ? (long)temp/2 : (long)temp*3+1 ;
            answer++;
        }
        return answer>500 ? -1 : answer;
    }
}