public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        while(n!=0){
            ans = n%2==1 ? ans+1 : ans ;
            n/=2;
        }


        return ans;
    }
}