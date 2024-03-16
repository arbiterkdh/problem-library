class Solution {
    public String solution(String s, int n) {
        char[] cesar = s.toCharArray();
        for(int i = 0; i<cesar.length; i++){
            if(cesar[i]+n>122 || (cesar[i]+n>90 && cesar[i]<=90) ){
                cesar[i] = (char)(cesar[i]+n-26);
            }else if(cesar[i]!=' '){
                cesar[i] = (char)(cesar[i]+n);
            }
        }
        String answer = String.valueOf(cesar);
        return answer;
    }
}