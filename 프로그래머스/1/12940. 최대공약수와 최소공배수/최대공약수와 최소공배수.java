class Solution {
    public int[] solution(int n, int m) {
        int GCD = 0;
        int LCM = 0;
        int temp1 = n;
        int temp2 = m;
        while(true){
            if(temp1%temp2==0){
                GCD = temp2;
                break;
            }
            GCD = temp2;
            temp2 = temp1%temp2;
            temp1 = GCD;
        }
        LCM = n*m/GCD;
        
        
        return new int[]{GCD,LCM};
    }
}