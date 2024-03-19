class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        
        while(idx!=goal.length){
            if(idx1<cards1.length && cards1[idx1].equals(goal[idx])){
                idx++;
                idx1++;
                continue;
            }
            if(idx2<cards2.length && cards2[idx2].equals(goal[idx])){
                idx++;
                idx2++;
                continue;
            }
            break;
        }
        
        return idx==goal.length ? "Yes" : "No";
    }
}