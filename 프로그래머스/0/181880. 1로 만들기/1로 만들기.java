class Solution {
    public static int num = 0;
    
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i<num_list.length;i++){
            answer = divide(num_list[i]);
        }
        return answer;
    }
    
    public static int divide(int n){
        if(n%2==0){
            n/=2;
            num++;
        }else if(n%2==1 && n!=1){
            n= (n-1)/2;
            num++;
        }
        
        return n==1 ? num : divide(n);
    }
}