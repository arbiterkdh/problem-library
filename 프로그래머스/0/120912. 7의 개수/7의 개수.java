class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%10==7){
                array[i]/=10;
                i-=1;
                answer++;
            }else if(array[i]>69){
                array[i]/=10;
                i-=1;
            }
        }
        return answer;
    }
}