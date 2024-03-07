class Solution {
    public String solution(String polynomial) {
        polynomial = polynomial.replace(" + ", " ");
        String[] xArr = polynomial.split(" ");
        int x = 0;
        int num = 0;
        for(String e:xArr){
            if(e.contains("x") && !e.equals("x")){
                e = e.replace("x","");
                x += Integer.parseInt(e);
            }else if(e.equals("x")){
                x ++;
            }else{num+=Integer.parseInt(e);}
        }
        if(x == 0){
            return Integer.toString(num);  
        }else if(num == 0 && x!=1){
            return Integer.toString(x)+"x";
        }else if(x == 1){
            if(num == 0){
                return "x";
            }
            return "x + " + Integer.toString(num);
        }
        return Integer.toString(x)+"x + "+Integer.toString(num);
    }
}