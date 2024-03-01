class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase().replaceAll("[a-z]",",");
        String[] strArr = my_string.split(",+");
        for(String e:strArr){
            if(!e.isEmpty()){
            answer += Integer.parseInt(e);
            }
        }
        return answer;
    }
}