class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] strArr = control.split("");
        for(int i = 0 ; i < strArr.length ; i++){
            // answer= strArr[i].equals("w") ? answer+1 : 
            // strArr[i].equals("a") ? answer-10 : 
            // strArr[i].equals("s") ? answer-1 : answer+10 ;
            if(strArr[i].equals("w")){
                answer+=1;
            }else if(strArr[i].equals("a")){
                answer-=10;
            }else if(strArr[i].equals("s")){
                answer-=1;
            }else{
                answer+=10;
            }
            
        }
        return answer;
    }
}