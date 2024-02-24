class Solution {
    public String solution(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
        String[] sa = cipher.split("");
        for(int i=code;i<=sa.length ;i+=code){
            sb.append(sa[i-1]);
        }
        return sb.toString();
    }
}