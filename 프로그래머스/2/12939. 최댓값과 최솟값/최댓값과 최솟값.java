class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int max = Integer.parseInt(sArr[0]) , min = Integer.parseInt(sArr[0]);
        
        for(int i = 1; i<sArr.length ; i++){
            max = Math.max(Integer.parseInt(sArr[i]) , max);
            min = Math.min(Integer.parseInt(sArr[i]) , min);
        }
        return min + " " + max;
    }
}