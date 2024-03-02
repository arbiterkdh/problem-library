class Solution {
    public String solution(String[] id_pw, String[][] db) {
            for(String[] e:db){
                if(e[0].equals(id_pw[0])&&e[1].equals(id_pw[1])){
                    return "login";
                }else if(e[0].equals(id_pw[0])){
                    return "wrong pw";
                }
            }        
        return "fail";
    }
}