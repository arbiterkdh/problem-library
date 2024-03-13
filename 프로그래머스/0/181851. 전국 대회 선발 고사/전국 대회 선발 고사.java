class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        int[] arrA = rankSelect(attendance,rank,0,100);
        int[] arrB = rankSelect(attendance,rank,arrA[1],100);
        int[] arrC = rankSelect(attendance,rank,arrB[1],100);
        
        return arrA[0]*10000+arrB[0]*100+arrC[0];
    }
       
    public int[] rankSelect(boolean[] attendance, int[] rank,int compare1, int compare2){
        int[] data = new int[2];
        for(int i = 0; i<rank.length;i++){
            if(attendance[i]){
                if(rank[i]>compare1 && rank[i]<=compare2){
                    compare2 = rank[i];
                    data[0] = i;
                }
            }
        }
        data[1] = compare2;
        return data;
    }
}