import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split("");
        Arrays.sort(sArr , (x,y) -> y.charAt(0) - x.charAt(0));
        for(String e : sArr){
            sb.append(e);
        }
        return sb.toString();
    }
}