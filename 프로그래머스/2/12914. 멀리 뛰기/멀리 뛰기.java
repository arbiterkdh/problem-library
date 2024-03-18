class Solution {
    public long solution(int n) {
        long prev = 0;
        long next = 2;
        long now = 1;
        int cnt = 1;
        while(cnt!=n){
            prev = now%1234567;
            now = next%1234567;
            next = now + prev;
            cnt++;
        }
        return now;
    }
}