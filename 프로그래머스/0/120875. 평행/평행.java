class Solution {
    public int solution(int[][] dots) {
        int idx = 0;
        int[] x = new int[6];
        int[] y = new int[6];
        double[] x_y = new double[6];
        //(x2-x1)/(y2-y1) 은 한 선분의 기울기. 분자,분모는 바뀌어도 됨.
        //(dots[][0]-dots[][0])/(dots[][1]-dots[][1])
        
        for(int i =0; i<dots.length;i++){
            for(int j = i+1; j<dots.length;j++){
                x[idx] = dots[i][0]+100-dots[j][0];
                idx++;
            }
        }
        idx = 0;
        for(int i =0; i<dots.length;i++){
            for(int j = i+1; j<dots.length;j++){
                y[idx] = dots[i][1]+100-dots[j][1];
                idx++;
            }
        }
        for(int i =0; i<x_y.length;i++){
            x_y[i] = 1.0*x[i]/y[i];
        }
        for(int i =0; i<x_y.length;i++){
            for(int j = i+1; j<x_y.length;j++){
                if (x_y[i]==x_y[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }
}