class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i<queries.length; i++){
            int s = queries[i][0] , e = queries[i][1] , k = queries[i][2];
            int min = 1_000_000;
            answer[i] = -1;
            
            for(int j = 0; j<arr.length; j++){
                if(j>=s && j<=e && arr[j]>k){
                    min = arr[j] < min ? arr[j] : min;
                    answer[i] = min==arr[j] ? arr[j] : answer[i];
                }
            }
        }
        return answer;
    }
}