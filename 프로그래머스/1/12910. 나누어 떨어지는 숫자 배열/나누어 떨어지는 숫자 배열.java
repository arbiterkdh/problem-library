class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int idx = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                temp[idx] = arr[i];
                idx++;
            }
        }
        if( temp[0] == 0) return new int[]{-1};
        int[] answer = new int[idx];
        for(int i = 0; i<answer.length; i++){
            answer[i] = temp[i];
        }
        
        for(int i = 0 ; i<answer.length; i++){
            for(int j = i+1; j<answer.length; j++){
                //idx 를 temp로써 활용.
                if(answer[i]>answer[j]){
                    idx = answer[i];
                    answer[i] = answer[j];
                    answer[j] = idx;
                    }
            }
        }
        return answer;
    }
}