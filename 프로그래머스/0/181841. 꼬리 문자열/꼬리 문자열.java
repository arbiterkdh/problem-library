class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for(String e : str_list){
            if(!e.contains(ex)){sb.append(e);}
        }
        return sb.toString();
    }
}