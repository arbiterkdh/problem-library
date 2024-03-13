class Solution {
    public long solution(long n) {
        long answer = 0;
        int cnt = 0;
        long temp = n;
        long temp2 = 1;
        while(temp!=0){
            temp/=10;
            temp2*=10;
            cnt++;
        }
        temp2/=10;
        long[] arr = new long[cnt];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (long)n%10;
            n/=10;
        }
        for(int i = 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            answer+= temp2*arr[i];
            temp2/=10;
        }
        return answer;
    }
}