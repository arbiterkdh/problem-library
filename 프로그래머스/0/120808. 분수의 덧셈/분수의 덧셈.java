class Solution {
    public int[] solution(int n1, int d1, int n2, int d2) {
        int numer = n1*d2+n2*d1;
        int denom = d1*d2;
        int fake=0;
        int GCD =1;
        while(GCD==1){
            if(numer%denom==0){
                GCD = denom;
                break;
            }else{
                numer%=denom;
                fake = numer;
                numer = denom;
                denom = fake;
            }
        }
        int[] answer = {(n1*d2+n2*d1)/GCD , (d1*d2)/GCD};
        return answer;
    }
}