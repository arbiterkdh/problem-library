class Solution {
    public int solution(int n) {
        String binary1 = Integer.toBinaryString(n).replace("0","");
        int compare = n+1;
        
        while(compare<1_000_000){
            String binary2 = Integer.toBinaryString(compare).replace("0","");
            if(binary1.length()==binary2.length()) return compare;
            compare++;
        }
        return 0;
    }
}