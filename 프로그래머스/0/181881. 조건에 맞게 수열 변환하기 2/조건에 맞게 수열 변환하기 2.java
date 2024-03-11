import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        
        run: while(true){
            
            int[] arr2 = Arrays.copyOf(arr,arr.length);
            int compare = 0;
            for(int i = 0; i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]/=2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]=arr[i]*2+1;
                }
            }
            for(int i = 0; i<arr.length;i++){
                if(arr[i] == arr2[i]){
                    compare++; 
                    if(compare == arr.length) break run;
                }
            }
            cnt++;
            
        }
        
        return cnt;
    }
}