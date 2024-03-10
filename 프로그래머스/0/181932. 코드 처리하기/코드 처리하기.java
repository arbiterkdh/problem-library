class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        String[] cArr = code.split("");
        int i = 0;
        while(i<cArr.length){
            mode0:for(i = i; i<cArr.length;i++){
                if(cArr[i].equals("1")){
                    i+=1; 
                    break;
                }else if(i%2==0){
                    sb.append(cArr[i]);
                }
            }
            mode1:for(i = i; i<cArr.length;i++){
                if(cArr[i].equals("1")){
                    i+=1; 
                    break;
                }else if(i%2==1){
                    sb.append(cArr[i]);
                }
            }
        }
        
        return sb.toString().equals("") ? "EMPTY" : sb.toString();
    }
}