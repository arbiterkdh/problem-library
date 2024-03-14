class Solution {
    public String solution(String s) {
        return s.length()%2==0 ? s.valueOf(s.charAt(s.length()/2-1))+s.valueOf(s.charAt(s.length()/2)) : s.valueOf(s.charAt(s.length()/2));
    }
}