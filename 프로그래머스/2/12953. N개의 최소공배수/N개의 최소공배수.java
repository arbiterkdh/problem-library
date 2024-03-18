class Solution {
    public int solution(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            arr[i+1] = arr[i]*arr[i+1]/GCD(arr[i],arr[i+1]);
        }
        return arr[arr.length-1];
    }
    
    
    public int GCD(int a, int b){
        return a%b == 0 ? b : GCD(b,a%b);
    }
}