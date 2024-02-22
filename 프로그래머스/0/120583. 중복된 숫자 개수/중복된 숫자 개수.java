class Solution {
    public int solution(int[] array, int n) {
        
        int i = 0;
        int answer = 0;

        
        for(int num:array){
            if(array[i]==n){
                answer+=1;
            }
            i+=1;
        }
        
        return answer;
    }
}