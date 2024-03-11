class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] ca = my_string.toCharArray();
        for(int i = 0; i<ca.length;i++){
            if(Character.isUpperCase(ca[i])){
                answer[ca[i]-'A']+=1;
            }else{
                answer[ca[i]-'a'+26]+=1;
            }
        }
        return answer;
    }
}