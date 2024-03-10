class Solution {
    public String solution(String myString) {
        char[] ca = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<ca.length;i++){
            ca[i] = ca[i]<108 ? 'l' : ca[i] ;
            sb.append(ca[i]);
        }
        return sb.toString();
    }
}