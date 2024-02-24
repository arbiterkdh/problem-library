class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ca = my_string.toCharArray();
        int caInt = 0;
        for(int i=0; i<ca.length;i++){
            caInt = (int)ca[i];
            if(caInt<=90){
                caInt+=32;
                ca[i] = (char)caInt;
            }else if(caInt>=97){
                caInt-=32;
                ca[i] = (char)caInt;
            }
        }
        
        return String.valueOf(ca);
    }
}