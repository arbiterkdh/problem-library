class Solution {
    public int solution(String s) {
        int answer = 0;
        char prev = s.charAt(0);
        int x = 0;
        int notX = 0;
        for (int i = 0; i < s.length(); i++) {
            
            if (x == notX) {
                answer++;
                prev = s.charAt(i);
            }
            
            if (s.charAt(i) == prev) {
                x++;
            } else {
                notX++;
            }
            
        }
        
        
        
        return answer;
    }
}