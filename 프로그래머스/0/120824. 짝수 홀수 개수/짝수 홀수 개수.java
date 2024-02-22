class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        int answer1 = 0;
        int answer2 = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                answer2++;
            }else{answer1++;};
        }
        answer[0]=answer2;
        answer[1]=answer1;
        return answer;
    }
}