class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i = 0;
        int j = num_list.length;
        for(int num:num_list){
            answer[i] = num_list[j-1];
            i++;
            j--;
        }
        return answer;
    }
}