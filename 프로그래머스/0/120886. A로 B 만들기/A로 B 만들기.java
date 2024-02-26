class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int length = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        for(int i = 0; i<before.length();i++){
            for(int j = 0;j<before.length();j++){
                if(beforeArr[i].equals(afterArr[j])){
                    length++;
                    afterArr[j] = "";
                    break;
                }
            }
        }
        if(length==before.length()){
            answer=1;
        }
        return answer;
    }
}