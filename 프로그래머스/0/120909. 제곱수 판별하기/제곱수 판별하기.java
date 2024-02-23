class Solution {
    public int solution(int n) {
        int answer = 0;
        int nSqrt = (int)Math.sqrt(n);
        if(nSqrt*nSqrt==n){
            answer=1;
        }else{answer=2;}
        return answer;
    }
}