class Solution {
    public String solution(int a, int b) {
        int[] months = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int sum = 0;
        for(int i =0; i<a-1; i++){
            sum+=months[i];
        }
        sum+=b;
        return days[sum%7];
    }
}