import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr= s.toCharArray();
        Arrays.sort(charArr);
        String str = new String(charArr);
        for(int i = 0;i<charArr.length-1;i++){
            if(charArr[i]==charArr[i+1]){
                str = str.replace(String.valueOf(charArr[i]),"");
            }
        }
        return str;
    }
}