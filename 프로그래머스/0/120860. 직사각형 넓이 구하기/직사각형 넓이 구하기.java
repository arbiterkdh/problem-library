class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1=dots[0][0];
        int x2=dots[1][0];
        int y1=dots[0][1];
        int y2=dots[1][1];
        
        for(int i = 0; i<3 ; i++){
            if(dots[i+1][0]>dots[i][0]){
                x1=dots[i+1][0];
            }
            if(dots[i+1][0]<dots[i][0]){
                x2=dots[i+1][0];}
            
            if(dots[i+1][1]>dots[i][1]){
                y1=dots[i+1][1];
            }
            if(dots[i+1][1]<dots[i][1]){
                y2=dots[i+1][1];
            }
        }
        return (x1-x2)*(y1-y2);
    }
}