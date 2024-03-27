import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(int num) {
        Map<Integer, String> check = new HashMap<>();
        check.put(0, "Even");
        check.put(1, "Odd");
        
        return check.get(Math.abs(num%2));
    }
}