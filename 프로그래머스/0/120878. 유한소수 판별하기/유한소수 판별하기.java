class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int GCD = 1;
        int num1 = a;
        int num2 = b;
        int fake = 0;
        if(a%b==0){
            return 1;
        }
        while(num2!=1){
            if(num1%num2==0){
                GCD = num2;
                break;
            }else{
                num1%=num2;
                fake = num2;
                num2 = num1;
                num1 = fake;
            }
        }
        b /= GCD;
        while(b%2==0||b%5==0){
            if(b%2==0){
                b/=2;
            }
            if(b%5==0){
                b/=5;
            }
        }
        
        return answer = (b==1) ? 1 : 2;
    }
}