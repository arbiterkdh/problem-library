class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double x=0;
        for(int i=0;i<numbers.length;i++){
            x+=numbers[i];
        }
        answer=x/numbers.length;
        return answer;
    }
}