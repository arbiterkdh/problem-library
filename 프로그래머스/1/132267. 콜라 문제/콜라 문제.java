class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=0){
            if(n-a>=0){
                n=n-a+b;
                answer+=b;
            }else{n-=a;}
            
        }
        return answer;
    }
}