import java.util.Arrays;

class Solution {
    public String solution(String s, String alphabets, int index) {
        char[] ca = s.toCharArray();
        boolean[] skip = new boolean[27];
        
        for (int i = 0; i < alphabets.length(); i++) {
            skip[alphabets.charAt(i) - 'a'] = true;
        }
        
        for (int i = 0; i < ca.length; i++) {
            int cnt = 0;
            while (cnt < index) {
                ca[i] = (char)(ca[i] + 1);
                if (ca[i] > 'z') {
                    ca[i] = (char)(ca[i] - 26);
                }
                if (!skip[ca[i] - 'a']) {
                    cnt++;   
                }
            }
        }
        
        return Arrays.toString(ca).replaceAll("[,\\[\\] ]", "");
    }
}