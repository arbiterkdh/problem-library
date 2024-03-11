class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        while(myString.contains(pat)){
            idx = myString.indexOf(pat);
            myString = myString.substring(idx+1);
            answer++;
        }
        return answer;
    }
}