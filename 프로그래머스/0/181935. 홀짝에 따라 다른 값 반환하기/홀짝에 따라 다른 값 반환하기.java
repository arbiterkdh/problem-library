class Solution {
    public int solution(int n) {
        int num = n%2==1 ? n/2+1 : n/2;
        int[] arr = new int[num];
        int answer = 0;
        for(int i =0;i<num;i++){
            arr[i] = n%2==1 ? i*2+1 : (int)Math.pow(i*2+2,2);
            answer+= arr[i];
        }
        
        return answer;
    }
}