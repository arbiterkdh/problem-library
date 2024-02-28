class Solution {
    public String[] solution(String my_str, int n) {
        int length;
        if(my_str.length()%n==0){
            length = my_str.length()/n;
            }else{
            length = my_str.length()/n +1;
        }
        String[] answer = new String[length];
        for(int i = 0;i<answer.length;i++){
            if((my_str.length()-i*n)-n<0){
                answer[i] = my_str.substring(i*n);
            }else{answer[i] = my_str.substring(i*n,(i+1)*n);}
        }
        return answer;
    }
}