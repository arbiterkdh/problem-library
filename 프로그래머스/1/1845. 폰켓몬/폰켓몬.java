import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int get = 0;
        int idx = 0;
        
        Set<Integer> set = new HashSet<>();
        while(idx<nums.length && get!=nums.length/2){
            if(!set.contains(nums[idx])){
                set.add(nums[idx]);
                get++;
            }
            idx++;
        }
        return get;
    }
}