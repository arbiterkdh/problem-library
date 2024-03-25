class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        int len = babbling.length;
        
        for (int i = 0; i < len; i++) {
            String s = babbling[i];
            
            if (s.contains("aya")) {
                s = s.replace("aya"," ");
            } 
            if (s.contains("ye")) {
                s = s.replace("ye"," ");
            } 
            if (s.contains("woo")) {
                s = s.replace("woo"," ");
            } 
            if (s.contains("ma")) {
                s = s.replace("ma"," ");
            } 
            s = s.replace(" ","");
            if (s.isEmpty()) cnt++; 
        }
        return cnt;
    }
}