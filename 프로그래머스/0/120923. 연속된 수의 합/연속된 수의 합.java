class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int index = num/2;
        int middle = total/num;
        for(int i =0; i<answer.length; i++){
            answer[i] = (num%2==0) ? middle-index+i+1 : middle-index+i;
        }
        return answer;
    }
}