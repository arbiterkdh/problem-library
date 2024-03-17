class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0}; 
        int cnt = 0;          
        int repeat = 1;       
        String dB = "";
        char end = ' ';
        char start = ' ';
        
        game:while(cnt < words.length){
            
            for(int i = 1; i<=n; i++){
                
                if(dB.contains(" "+words[cnt+i-1]+" ") || end!=start ){
                    answer[0] = i;
                    answer[1] = repeat;
                    break game;
                }
                if(cnt+i>=words.length) break;
                
                dB += " "+words[cnt+i-1]+" ";
                end = words[cnt+i-1].charAt(words[cnt+i-1].length()-1);
                start = words[cnt+i].charAt(0);
            }
            
            cnt+=n;
            repeat++;
        }
        
        return answer;
    }
}