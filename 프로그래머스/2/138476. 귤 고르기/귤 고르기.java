import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        int[] bucket = new int[tangerine.length];
        int j = 0, cnt = 1;
        
        for (int i = 0; i < tangerine.length - 1; i++) {
            if (tangerine[i] == tangerine[i + 1]) {
                cnt++;
                bucket[j] = cnt;
            } else {
                bucket[j] = cnt;
                j++;
                cnt = 1;
            }
        }
        
        Arrays.sort(bucket);
        
        cnt = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            k -= bucket[i];
            cnt++;
            if (k <= 0) break;
        }
        
        return cnt;
    }
}