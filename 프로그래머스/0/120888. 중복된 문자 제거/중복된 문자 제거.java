class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(int i=0;i<strArr.length;i++){
            for(int j=i+1;j<strArr.length;j++){
                if(strArr[j].equals(strArr[i])){
                    strArr[j]="";
                }
            }
            answer += strArr[i];
        }
        return answer;
    }
}