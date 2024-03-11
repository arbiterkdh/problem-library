class Solution {
    public String solution(String my_string, int m, int c) {
        String[] strArr = new String[my_string.length()/m];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strArr.length;i++){
            strArr[i] = my_string.substring(i*m,(i+1)*m);
            sb.append(strArr[i].charAt(c-1));
        }
        return sb.toString();
    }
}