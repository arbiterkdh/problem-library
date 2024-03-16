class Solution {
    boolean solution(String s) {
        int cntLeft = 0;
        int cntRight = 0;
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                cntLeft++;
            }else{cntRight++;}
            if(cntLeft<cntRight) return false;
        }
        return cntLeft==cntRight;
    }
}