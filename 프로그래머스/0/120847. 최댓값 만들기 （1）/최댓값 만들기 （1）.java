class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int subMax = 0;
        for(int i=0; i<numbers.length;i++){
            if(max<numbers[i]){
                subMax = max;
                max = numbers[i];
            }else if(subMax<numbers[i]){
                subMax = numbers[i];
            }
        }
        int answer = max*subMax;
        return answer;
    }
}