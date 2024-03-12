import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length >= arr[0].length ? arr.length : arr[0].length ;
        
        int[][] answer = Arrays.copyOf(arr,n);
        for(int i = 0; i<answer.length ;i++){
            if(i<arr.length){
                answer[i] = Arrays.copyOf(arr[i],n);
                }else{
                answer[i] = new int[n];
                Arrays.fill(answer[i], 0);
            }
        }
        return answer;
    }
}