class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] ca = s.toCharArray();
        if(ca[0]>=97){
            ca[0] = (char)(ca[0]-32);
        }
        for(int i = 1 ; i<ca.length ; i++){
            if(ca[i-1] == ' ' && ca[i] != ' ' && ca[i]>=97){
                ca[i] = (char)(ca[i]-32);
            }
        }
        return sb.append(ca).toString();
    }
}