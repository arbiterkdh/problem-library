class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i =1;i<=k;i++){
            if(i>=2){answer+=2;}
            if(answer==numbers.length+1){
                answer=1;
            }else if(answer==numbers.length+2){
                answer=2;
            }
        }
        return answer;
    }
}