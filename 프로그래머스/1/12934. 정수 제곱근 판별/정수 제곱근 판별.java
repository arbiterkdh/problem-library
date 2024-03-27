class Solution {
    public long solution(long n) {
        long l = (long)Math.sqrt(n);
        return n == (long)Math.pow(l, 2) ? (long)Math.pow(l + 1, 2) : -1;
    }
}