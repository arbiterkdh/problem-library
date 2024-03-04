class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        
        int answer = 0;
        String right = "";
        String[] strArr = A.split("");
        
        strArr = A.split("");
        
        while(!right.equals(A)){
            right = "";
            Right:for(int i = 0;i<strArr.length;i++){
                if(i==0){
                    right+=strArr[strArr.length-1];
                }else if(i==strArr.length-1){
                    break Right;
                }
                right+=strArr[i];
            }
            answer++;
            if(right.equals(B)) break;
            strArr = right.split("");
        }
        if(answer==A.length()) return -1;
        return answer;
    }
}