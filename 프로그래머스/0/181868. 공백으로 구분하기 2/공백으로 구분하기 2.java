class Solution {
    public String[] solution(String my_string) {
        String[] A = my_string.split("\\s+");
        String[] answer = A[0].equals("") ? new String[A.length-1] : new String[A.length];
        if(A[0].equals("")){
            System.arraycopy(A,1,answer,0,A.length-1);
        }else{
            System.arraycopy(A,0,answer,0,A.length);
        }
        return answer ;
    }
}