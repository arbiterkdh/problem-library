class Solution {
    public int solution(String str1, String str2) {
         boolean result = str1.contains(str2);
            int answer = result? 1 : 2;

        return answer;
    }
}