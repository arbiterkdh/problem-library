import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int get = 0;
        int idx = 0;
        
        List<Integer> list = new ArrayList<>();
        while(idx<nums.length && get!=nums.length/2){
            if(!list.contains(nums[idx])){
                list.add(nums[idx]);
                get++;
            }
            idx++;
        }
        return get;
    }
}