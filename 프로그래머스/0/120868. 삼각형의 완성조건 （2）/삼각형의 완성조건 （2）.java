class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sidesSum = sides[0]+sides[1];
        for(int i =1;i<sidesSum;i++){
            if(sides[0]>sides[1]&&answer==0){
                i=sides[0]-sides[1]+1;
            }else if(sides[0]<sides[1]&&answer==0){
                i=sides[1]-sides[0]+1;
            }
            answer++;
        }
        return answer;
    }
}