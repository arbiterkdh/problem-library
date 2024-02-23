class Solution {
    public int[] solution(int money) {
        int i = 5500;
        int x = money/i;
        int y = money-x*i;
        int[] answer = {x,y};
        return answer;
    }
}