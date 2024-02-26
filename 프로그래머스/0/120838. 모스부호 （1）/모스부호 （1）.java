class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] answerArr = letter.split(" ");
        String[] morse = 
        {".-","-...","-.-.","-..",".","..-.","--.","....",
         "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
         ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<answerArr.length;i++){
            for(int j=0; j<morse.length;j++){
                if(answerArr[i].equals(morse[j])){
                    answerArr[i]=Character.toString((char)(j+97));
                    answer+=answerArr[i];
                }
            }
        }
        
        
        return answer;
    }
}