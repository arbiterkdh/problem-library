class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean result = str1.contains(str2);
        
        
        if(result) {
            answer = 1;
        }else {
            answer =2;
        }

        return answer;
    }
}