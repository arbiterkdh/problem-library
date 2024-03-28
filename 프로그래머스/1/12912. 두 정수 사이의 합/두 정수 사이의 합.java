

class Solution {
    public long solution(long a, long b) {
        
        
        return a < b ? (b * (b + 1) - (a - 1) * a) / 2 : a > b ? (a * (a + 1) - (b - 1) * b) / 2 : a;
    }
}