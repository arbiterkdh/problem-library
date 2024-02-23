class Solution {
    public int solution(int n) {
        int answer = 0;
        String str= n+"";
        String[] strArr = str.split("");
        for(int i=0;i<strArr.length;i++){
            answer+= Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}