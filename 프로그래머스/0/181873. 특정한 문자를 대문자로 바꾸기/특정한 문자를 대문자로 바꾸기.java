class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.split("");
        for(String e : strArr){
            e = e.equals(alp) ? e.toUpperCase() : e ;
            sb.append(e);
        }
        return sb.toString();
    }
}