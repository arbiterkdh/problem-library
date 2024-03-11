class Solution {
    public int[] solution(int[] arr) {
        int[] empty = {-1};
        int start = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==2){
                start = i;
                break;
            }
        }
        
        int end = start;
        for(int i = start+1; i<arr.length; i++){
            end = arr[i]==2 ? i : end ;
        }
        
        int[] answer = new int[end-start+1];
        for(int i = 0; i<answer.length;i++){
            answer[i] = arr[start+i];
        }
        return answer[0]!=2 ? empty : answer;
    }
}