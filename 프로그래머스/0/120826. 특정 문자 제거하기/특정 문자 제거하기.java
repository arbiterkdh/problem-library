class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0;i<str.length;i++){
            if(str[i].equals(letter)){
                str[i]="";
            }
            answer+=str[i];
        }
        
        
        return answer;
    }
}