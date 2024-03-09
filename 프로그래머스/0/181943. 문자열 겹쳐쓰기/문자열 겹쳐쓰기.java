class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String sub = my_string.substring(s,s+overwrite_string.length());
        String end = my_string.substring(s+overwrite_string.length());
        my_string = my_string.replace(sub+end,"");
        return my_string+overwrite_string+end;
    }
}