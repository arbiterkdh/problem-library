class Solution {
    public long solution(long n) {
        long a = (long)Math.sqrt(n);
        return a*a==n ? (long)Math.pow(a+1,2) : -1L;
    }
}