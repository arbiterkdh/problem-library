class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        String start = "";
        String end = "";
        
        for(int i = 0; i<queries.length;i++){
            sb.append(my_string.substring(queries[i][0],queries[i][1]+1));
            start = my_string.substring(0,queries[i][0]);
            end = my_string.substring(queries[i][1]+1,my_string.length());
            my_string = start + sb.reverse() + end ;
            sb.setLength(0);
        }
        return my_string;
    }
}