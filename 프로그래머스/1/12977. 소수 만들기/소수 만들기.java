import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int range = nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        
        boolean[] primeNumbers = new boolean[range+1];
        
        for(int i=7; i<=range; i++){
            int j=2;
            while(j<=i/2){
                if(i%j==0) break;
                j++;
            }
            if(j>i/2){
                primeNumbers[i] = true;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(primeNumbers[nums[i]+nums[j]+nums[k]]) cnt++;
                }
            }
        }
        

        return cnt;
    }
}