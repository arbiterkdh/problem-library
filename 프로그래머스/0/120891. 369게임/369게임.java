class Solution {
    public int solution(int order) {
        int answer = 0;
        int number = order;
        for(int i =1;i<number*10;i*=10){
            answer = (order%10==3||order%10==6||order%10==9)? answer+1 : answer;
            order/=10;
        }
        return answer;
    }
}