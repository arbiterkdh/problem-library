class Solution {
    public long solution(int price, int money, int count) {
        long answer =  (long) count * (price + (long) price * count) / 2 - money;
        return answer < 0 ? 0 : answer;
    }
}