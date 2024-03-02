class Solution {
    public int solution(String[] spell, String[] dic) {
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
                return 1;
            }
        }
        return 2;
    }
}