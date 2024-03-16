import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int[] size : sizes){
            Arrays.sort(size);
            if(size[0]>width){
                width = size[0];
            }
            if(size[1]>height){
                height = size[1];
            }
        }
        
        
        return width*height;
    }
}