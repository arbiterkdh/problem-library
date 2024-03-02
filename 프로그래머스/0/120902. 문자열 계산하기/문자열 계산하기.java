class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        for(int i = 0;i<strArr.length-2;i+=2){
            if(strArr[i+1].equals("+")){
                answer += Integer.parseInt(strArr[i+2]);
            }else{answer -= Integer.parseInt(strArr[i+2]);}
        }
        return answer;
    }
}