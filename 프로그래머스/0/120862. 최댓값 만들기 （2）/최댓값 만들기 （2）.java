class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -10_000;
        int subMax = -10_000;
        int answerplus = 0;
        int answerminus = 0;
        
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                subMax = max;
                max = numbers[i];
            }else if(numbers[i]>subMax){
                subMax = numbers[i];
            }
        }
        answerplus = max*subMax;
        
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<max){
                subMax = max;
                max = numbers[i];
            }else if(numbers[i]<subMax){
                subMax = numbers[i];
            }
        }
        answerminus = max*subMax;
        
        if(answerplus>answerminus){
            answer=answerplus;
        }else{
            answer=answerminus;
        }
        return answer;
    }
}