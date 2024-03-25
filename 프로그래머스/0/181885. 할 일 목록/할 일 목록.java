class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int left = 0;
        for (boolean done : finished) {
            if (!done) left++;
        }
        String[] goal = new String[left];
        
        int len = todo_list.length;
        int idx = 0;
        
        for (int i = 0; i < len; i++) {
            if (!finished[i]) {
                goal[idx] = todo_list[i];
                idx++;
            }
        }
        
        return goal;
    }
}