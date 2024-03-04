class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        for(int i = 0; i<quiz.length;i++){
            String[] calArr = quiz[i].split(" ");
            num1 = Integer.parseInt(calArr[0]);
            num2 = Integer.parseInt(calArr[2]);
            sum = (calArr[1].equals("+")) ? num1+num2 : num1-num2 ;  
            answer[i] = (sum==Integer.parseInt(calArr[4])) ? "O" : "X";
        }
        return answer;
    }
}