class Solution {
    public int solution(int n) {
        int cnt = 1;
        int answer = 0;
        
        while (cnt<n/2+1){
            int temp = 0;
            for(int i = cnt; i<=n/2+1;i++){
                temp += i;
                if(temp==n){
                    answer++;
                    break;
                }else if(temp>n){
                    break;
                }
            }
            cnt++;
        }
        return answer+1;
    }
}