class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n%2==0){answer = new int[n/2];}else{answer = new int[n/2+1];};
        for(int i = 0;i<answer.length;i++){
            for(int j =-1; j<i*2;j+=2){
                answer[i]=j+2;}
        }
        
        return answer;
    }
}