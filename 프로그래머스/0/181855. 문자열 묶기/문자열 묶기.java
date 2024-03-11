class Solution {
    public int solution(String[] strArr) {
        int len = 0;
        int answer = 0;
        for(int i = 0; i<strArr.length; i++){ // 가장 긴 문자열 구하기.
            len = len<strArr[i].length() ? strArr[i].length() : len ;
        }
        
        int[] arr = new int[len];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<strArr.length; j++){
                arr[i] = strArr[j].length()==i+1 ? arr[i]+1 : arr[i] ;
            }
            if(answer<arr[i]) answer = arr[i];
        }
        
        return answer;
    }
}