class Solution {
    public int solution(String num_str) {
        String[] strArr = num_str.split("");
        int answer = 0;
        for(int i = 0 ; i<strArr.length; i++){
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}