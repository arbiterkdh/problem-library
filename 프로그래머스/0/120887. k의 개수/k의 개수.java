class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int length = j-i;
        String str;
        
        for(int index=0; index<=length;index++,i++){
            str = String.valueOf(i);
            for(int index2=0;index2<str.length();index2++){
                if(str.charAt(index2)-'0'==k){
                    answer++;
                }
            }
        }
        return answer;
    }
}