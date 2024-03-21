class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i = 2; i<=number; i++){
            int indexNumber = i;
            int base = 2;
            int count = 1;
            int measure = 1;
            
            while(indexNumber>=1){
                
                if(indexNumber%base==0){
                    indexNumber/=base;
                    measure++;
                }else{
                    count*=measure;
                    
                    if(indexNumber==1) break;
                    
                    measure = 1;
                    base++;
                    
                }
                
            }
            
            
            if(count>limit) count = power;
            answer+=count;
        }
        return answer;
    }
}