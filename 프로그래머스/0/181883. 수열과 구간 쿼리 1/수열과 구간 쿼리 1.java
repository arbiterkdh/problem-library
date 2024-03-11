class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] e : queries){
            for(int i = e[0];i<=e[1];i++){
                arr[i]++;
            }
        }
        return arr;
    }
}