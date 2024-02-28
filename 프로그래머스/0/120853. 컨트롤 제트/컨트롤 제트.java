class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" ");
        for(int i = 0;i<strArr.length;i++){
            answer = (strArr[i].equals("Z")) ? answer-Integer.parseInt(strArr[i-1]) : answer+Integer.parseInt(strArr[i]) ;
        }
        return answer;
    }
}