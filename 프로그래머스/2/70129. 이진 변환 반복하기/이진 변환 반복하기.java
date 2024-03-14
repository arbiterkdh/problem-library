class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int zeroCount = 0;
        
        while(!s.equals("1")){
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i)!='0'){
                    
                    continue;
                    
                }
                zeroCount++;
            }
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            
            transformCount++;
        }
        
        return new int[]{ transformCount , zeroCount };
    }
}