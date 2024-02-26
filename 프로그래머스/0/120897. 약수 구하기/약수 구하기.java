class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int answerLength=0;
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answerLength++;
            }
        }
        answer = new int[answerLength];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}