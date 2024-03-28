class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int n = (int)Math.sqrt(i);
            answer += n * n == i ? -i : i;
        }
        return answer;
    }
}