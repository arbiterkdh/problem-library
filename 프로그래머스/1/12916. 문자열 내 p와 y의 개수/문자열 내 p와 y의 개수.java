class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(o -> o == 'P').count() == s.chars().filter(o -> o == 'Y').count();
    }
}