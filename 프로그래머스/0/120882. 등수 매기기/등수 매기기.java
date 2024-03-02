class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];
        int i = 0;
        for(int[] e:score){
            avg[i] = (e[0]+e[1])/2.0;
            i++;
        }
        for(i=0;i<answer.length;i++){
            answer[i]+=1;
            for(int j=i;j<answer.length;j++){
                if(avg[i]<avg[j]){
                    answer[i]++;
                }else if(avg[i]>avg[j]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}