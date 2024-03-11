class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int fake = 0;
        for(int[] e : queries){
            fake  = arr[e[0]];
            arr[e[0]] = arr[e[1]];
            arr[e[1]] = fake;
        }
        return arr;
    }
}