import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strArr = Integer.toString(n).split("");
        for(String e: strArr){answer+= Integer.parseInt(e);}

        return answer;
    }
}