import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(String e : strArr){
            if(!e.contains("ad")) list.add(e);
        }
        return list.toArray(new String[0]);
    }
}