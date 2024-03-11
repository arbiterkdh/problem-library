import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> list = new ArrayList<>();
    
    public Object[] solution(int n) {
        
        list.add(colatz(n));
        return list.toArray();
    }
    
    public static int colatz (int n){
        list.add(n);
        if(n%2==1){
            n = 3*n+1;
        }else{
            n /= 2;
        }
        return n==1 ? n : colatz(n);
    }
}
