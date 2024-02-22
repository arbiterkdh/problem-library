class Solution {
    public String solution(String my_string) {
        String answer = "";  
        String[] str = my_string.split(""); //문자열 쪼개기
        String[] answer_arr = new String[str.length]; //쪼갠거 담을 문자열배열 길이 할당
        int i = str.length; //거꾸로 담아야 하니, i의 초기값을 문자열배열 길이로 대입
        int j = 0; //정방향으로 갈 변수도 선언
        for(String backward:str){
            answer_arr[j] = str[i-1];
            answer+= answer_arr[j];
            j++;
            i--;
        }
        
        return answer;
    }
}