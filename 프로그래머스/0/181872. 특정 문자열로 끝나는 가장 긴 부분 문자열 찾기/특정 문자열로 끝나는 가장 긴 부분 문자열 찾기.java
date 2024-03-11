class Solution {
    public String solution(String myString, String pat) {
        myString+=" ";
        String[] strArr = myString.split(pat);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strArr.length-1;i++){
            sb.append(strArr[i]+pat);
        }
        return sb.toString();
    }
}