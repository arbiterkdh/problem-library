class Solution {
    public int solution(int num) {
        int cnt = 0;
        return collatz((long)num, cnt);
    }
    
    public int collatz(long num, int cnt) {
        if (num == 1) return cnt;
        if (cnt == 500) return -1; 
        num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        cnt++;
        return num == 1 ? cnt : collatz(num, cnt);
    }
}