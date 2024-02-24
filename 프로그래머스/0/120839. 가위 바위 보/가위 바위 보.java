class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        String[] sa = rsp.split("");
        for(int i=0;i<sa.length;i++){
            if(sa[i].equals("0")){
                sb.append("5");
            }else if(sa[i].equals("2")){
                sb.append("0");
            }else{
                sb.append("2");
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}