class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];
        int j = 0;
        for(String i:strlist){
            answer[j] = i.length();
            j++;
        }
        return answer;
    }
}