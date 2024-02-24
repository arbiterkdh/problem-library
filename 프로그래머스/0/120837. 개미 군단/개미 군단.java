class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp%5==0){
            answer=hp/5;
        }else{
            answer = switch(hp%5){
                case 4 -> hp/5+2;
                case 3 -> hp/5+1;
                case 2 -> hp/5+2;
                case 1 -> hp/5+1;
                default -> hp/5;
            };          
        }
        return answer;
    }
}