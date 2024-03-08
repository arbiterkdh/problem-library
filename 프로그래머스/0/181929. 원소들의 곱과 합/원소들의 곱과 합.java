class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int pow = 0;
        for(int i = 0; i<num_list.length; i++){
            mul *= num_list[i];
            pow += num_list[i];
        }
        pow *= pow;
        return mul<pow ? 1 : 0;
    }
}