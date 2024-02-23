class Solution {
    public int solution(int[] array) {
        int j = 0;
        int n = 0;
        while(n!=array.length){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                j=array[i+1];
                array[i+1]=array[i];
                array[i]=j;
            }
        }
            n++;
        }
        int answer =array[array.length/2];
        return answer;
    }
}