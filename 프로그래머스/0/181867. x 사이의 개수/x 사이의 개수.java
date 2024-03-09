class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int[] answer = myString.endsWith("x") ? new int[strArr.length+1] : new int[strArr.length];
        
        for(int i = 0;i<strArr.length;i++){
            answer[i] = strArr[i].length();
        }
        return answer;
    }
}