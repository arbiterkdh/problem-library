class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String e:dic){
            int num = 0;
            for(String f:spell){
                if(e.contains(f)){
                    num+=1;
                }else{
                    num+=2;
                }
            }
            if(num==e.length()){
                answer=1;
                break;
            }
        }
        return answer;
    }
}