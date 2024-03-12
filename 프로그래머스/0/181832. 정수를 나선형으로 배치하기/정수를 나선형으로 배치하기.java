class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int num = 0;
        int a = 0;
        int b = 0;
        while(num<n*n){
            
            for(int i =a; i<n;i++){
                if(arr[a][b]==0){
                    arr[a][b] = num+1;
                    if(num<n*n)num++;
                }
                if(b<n-1&&arr[a][b+1]==0)b++;
            }
            for(int i =a; i<n; i++){
                if(arr[a][b]==0){
                    arr[a][b] = num+1;
                    if(num<n*n)num++;
                }
                if(a<n-1&&arr[a+1][b]==0)a++;
            }
            for(int i =b; i>0; i--){
                if(b>0&&arr[a][b-1]==0)b--;
                if(arr[a][b]==0){
                    arr[a][b] = num+1;
                    if(num<n*n)num++;
                }
            }
            for(int i =a; i>0; i--){
                if(a>0&&arr[a-1][b]==0)a--;
                if(arr[a][b]==0){
                    arr[a][b] = num+1;
                    if(num<n*n)num++;
                }
            }
            
        }
        return arr;
    }
}