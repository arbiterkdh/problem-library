class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] paint = new boolean[n+1];
        for(int s : section){
            paint[s] = true;
        }
        int cnt = 0;
        for(int sector = 1; sector<=n; sector++){
            if(paint[sector]){
                cnt++;
                sector+=m-1;
            }
        }
        
        return cnt;
    }
}