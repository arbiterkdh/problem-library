class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        String[] a = str1.split("") , b = str2.split("");
        for(int i = 0; i<str1.length();i++){
            sb.append(a[i]).append(b[i]);
        }
        return sb.toString();
    }
}