import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] sNum = new int[numlist.length];
        int[] lNum = new int[numlist.length];
        for(int i  = 0; i<numlist.length; i++){
            if(numlist[i]>n){
                lNum[i] = numlist[i];
                sNum[i] = -10001;
            }else{
                sNum[i] = numlist[i];
                lNum[i] = 20001;
            }
        }
        Arrays.sort(sNum);
        Arrays.sort(lNum);
        
        int end = sNum.length-1;
        int[] sNumR = new int[sNum.length];
        for(int i =0;i<sNum.length;i++){
            sNumR[end] = sNum[i];
            end--;
        }
        // n보다 작거나 같은 수의 배열, n보다 큰 수의 배열을 만들고, 작은 수는 역순으로 정렬.
        
        int s = 0;
        int l = 0;
        for(int i = 0; i<answer.length; i++){
            if(Math.abs(sNumR[s]-n)<Math.abs(lNum[l]-n)){
                answer[i] = sNumR[s];
                s++;
            }else {
                answer[i] = lNum[l];
                l++;
            }
        }
        return answer;
    }
}