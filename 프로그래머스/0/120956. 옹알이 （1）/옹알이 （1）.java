class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        //각 babbling[] 원소에  각 words[]를 contains 확인 후, equal 확인, 
        //true면 result ++, false 면 다음 words[] 확인, 반복해서 4개 다 확인 후 equal 있으면 result++
        //일단 길이 10 넘으면 제외.
        //
        int run = 0;
        while(run<4){
            for(int i = 0;i<babbling.length;i++){
                for(int j = 0; j<words.length;j++){
                    if(babbling[i].length()<=10 && babbling[i].contains(words[j])){
                        babbling[i] = babbling[i].replace(words[j],"+");
                    }
                }
            }
            run++;
        }
        for(int i =0;i<babbling.length;i++){
            if(babbling[i].equals("+")||babbling[i].equals("++")||babbling[i].equals("+++")||babbling[i].equals("++++")){answer++;}
        }
        
        return answer;
    }
}