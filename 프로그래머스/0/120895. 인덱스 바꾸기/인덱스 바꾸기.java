class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] myStringArr = my_string.split("");
        String swap = "";
        swap = myStringArr[num1];
        myStringArr[num1] = myStringArr[num2];
        myStringArr[num2] = swap;
        
        for(int i=0;i<myStringArr.length;i++){
            answer += myStringArr[i];
        }
        return answer;
    }
}