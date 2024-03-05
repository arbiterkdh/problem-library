class Solution {
    public int solution(int[] array) {
        int[] answerArr = new int[array.length];
        int maxAnswer = 0;
        int maxAnswerArr = 0;
        int answerArrCompare = 1;
        for(int i=0;i<array.length;i++){
            answerArr[i]=1;
            for(int j=i+1;j<array.length;j++){
                if( array[j]==array[i]){
                    answerArr[i]++;
                    array[j]+=1000;
                }
            }
        }
        maxAnswer = array[0];
        maxAnswerArr = answerArr[0];
        for(int i=1;i<array.length;i++){
            if(maxAnswer/1000<array[i]/1000){
                maxAnswer = array[i];
            }
            if(maxAnswerArr<answerArr[i]){
                maxAnswerArr = answerArr[i];
            }
        }
        for(int i=0;i<answerArr.length;i++){
            if(answerArrCompare==1 && answerArr[i]!=1){
                answerArrCompare = 2;
            }
            for(int j=i+1;j<answerArr.length;j++){
                if(answerArr[i]!=1 && answerArr[j]!=1 &&
                   answerArr[i]==answerArr[j] && answerArr[i]==maxAnswerArr) return -1;   
            }
        }
        if(array.length!=1 && answerArrCompare == 1) return -1;
        maxAnswer = (maxAnswer<=1000) ? maxAnswer : maxAnswer%1000 ;
        return maxAnswer;
    }
}