import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int downNumber=0;
        int upNumber=array[0];
        for(int i = 0; i<array.length;i++){
            if(array.length==1)break;
            if(array[i]<n){
                upNumber = n-array[i];
                answer = array[i];
            }else if(array[i]>=n){
                downNumber = array[i]-n;
                if(upNumber==downNumber){
                    answer=array[i-1];
                }
                answer = (upNumber>downNumber) ? array[i] : array[i-1] ;
                break;
            }
        }
        return answer ;
    }
}