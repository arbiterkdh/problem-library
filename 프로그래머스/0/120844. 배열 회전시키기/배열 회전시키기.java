class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        int fakenumber = 0;
        if(direction.equals("left")){
            fakenumber = numbers[0];
            for(int i=1;i<numbers.length;i++){
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = fakenumber;
            
        }else{
            fakenumber = numbers[numbers.length-1];
            for(int i=1;i<numbers.length;i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = fakenumber;
            
        }
        return answer;
    }
}