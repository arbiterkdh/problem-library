class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int idx = 0;
        
        for(int i = 1; i<arr.length ; i++){
            min = Math.min(arr[i],min);
        }
        for(int i =0; i<arr.length ; i++){
            if(arr[i]==min){
                continue;
            }
            answer[idx]=arr[i];
            idx++;
        }
        return answer;
    }
}