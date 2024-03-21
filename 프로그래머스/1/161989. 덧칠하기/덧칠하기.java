class Solution {
    public int solution(int n, int m, int[] section) {
        int roller = section[0]+m-1;
        int cnt = 1;
        
        for(int i = 1; i<section.length; i++){
            if(section[i]>roller){
                roller = section[i]+m-1;
                cnt++;
            }
        }
        return cnt;
    }
}