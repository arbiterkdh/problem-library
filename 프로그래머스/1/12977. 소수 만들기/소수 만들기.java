class Solution {
    public int solution(int[] nums) {
        int cnt = 0;

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])) cnt++;
                }
            }
        }

        return cnt;
    }
    
    public static boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i<=Math.sqrt(num); i++){
            if(num%i==0) cnt++;
        }
        return cnt == 1;
    }
}