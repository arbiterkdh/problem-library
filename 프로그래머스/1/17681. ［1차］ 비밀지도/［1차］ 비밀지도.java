class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            String binary1 = binaryMethod(n , arr1[i]);
            String binary2 = binaryMethod(n , arr2[i]);
            answer[i] = "";            
            for(int j = 0; j<n; j++){
                if(binary1.charAt(j)=='1'||binary2.charAt(j)=='1'){
                    answer[i]+="#";
                }else{ answer[i]+=" ";}
            }
        }
        return answer;
    }
    
    public static String binaryMethod(int n, int x){
        StringBuilder binary = new StringBuilder();
        int remainder = 0;
        
        while(binary.length()!=n){
            remainder = x%2;
            x = x/2;
            
            binary.append(remainder);
        }
        binary.reverse();
        
        return binary.toString();
    }
}