class Solution {
    public String[] solution(String myStr) {
        String[] empty = {"EMPTY"};
        myStr = myStr.replace("a","c").replace("b","c").replaceAll("(c)+"," ").trim();
        String[] answer = myStr.split(" ");
        return answer[0].equals("") ? empty : answer;
    }
}