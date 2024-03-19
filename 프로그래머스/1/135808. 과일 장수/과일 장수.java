import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        if(score.length<m) return 0;
        Arrays.sort(score);

        int answer = 0;
        int cnt = 0;
        for(int i = score.length-1; i>=score.length%m; i--){
            cnt++;
            if(cnt==m){
                answer+=score[i]*m;
                cnt=0;
            }
            
        }
        
        return answer;
    }
}