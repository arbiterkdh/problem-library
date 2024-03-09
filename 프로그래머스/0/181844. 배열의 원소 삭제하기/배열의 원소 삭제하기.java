import java.util.ArrayList;

class Solution {
    public Object[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int e:arr){list.add(e);}
        for(int e:delete_list){list.remove((Integer)e);}
        return list.toArray();
    }
}