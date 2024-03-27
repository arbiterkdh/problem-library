import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] s = Long.toString(n).split("");
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (String c : s) {
            sb.append(c);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}