class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] ca = s.toCharArray();
        for(int i = 0; i<ca.length;i++){
            if(ca[i]!=' '){
                ca[i]=(char)(ca[i]-32);
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        return sb.append(ca).toString();
    }
}