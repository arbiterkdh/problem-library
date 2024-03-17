class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(answer[i]==0)answer[i]=-1;
            for(int j = i+1; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(i)){
                    answer[j] = j-i;
                    break;
                }
            }
        }
        
        return answer;
    }
}