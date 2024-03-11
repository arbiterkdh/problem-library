class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] e : queries){
            for(int i = e[0];i<=e[1];i++){
                arr[i] = arr[i]>=e[0] || arr[i]<=e[1] ? arr[i]+1 : arr[i];
            }
        }
        return arr;
    }
}