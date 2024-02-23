class Solution {
    public int solution(String my_string) {
        int answer = 0;
            for(int i=0;i<my_string.length();i++){
                char ch = my_string.charAt(i);
                if(ch==49||ch==50||ch==51||ch==52||ch==53||ch==54||ch==55||ch==56||ch==57){
                    answer+=ch-48;
                }
                
            }
        return answer;
    }
}