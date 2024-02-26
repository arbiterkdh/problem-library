import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArr = new char[my_string.length()];
        for(int i = 0;i<my_string.length();i++){
            chArr[i] = my_string.charAt(i);
            if(chArr[i]>='A'&&chArr[i]<='Z'){
                chArr[i]+=(char)32;
            }
        }
        Arrays.sort(chArr);
        for(int i=0; i<chArr.length;i++){
            answer+=Character.toString(chArr[i]);
        }
        return answer;
    }
}