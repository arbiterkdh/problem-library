class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        int j =1;
        for(int i =0; i<arr.length;i++,j++){
            if(j>=30&&j<40){
                j=40;
            }
            if(j>=129&&j<140){
                j=140;
            }
            if(j%3==0||j%10==3) j++;
            if(j%10==3||j%3==0) j++;
            arr[i]=j;    
        }
        return arr[arr.length-1];
    }
}