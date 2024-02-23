class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String j = "";
        char y = my_string.charAt(0);
        for(int i = 0; i<my_string.length(); i++){
            y = my_string.charAt(i);
            j = String.valueOf(y).repeat(n);
            answer += j;
        }
        
        return answer;
    }
}