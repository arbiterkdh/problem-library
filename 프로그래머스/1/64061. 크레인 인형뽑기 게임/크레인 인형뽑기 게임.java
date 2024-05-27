import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int[] depth = new int[board.length];
        int cnt = 0;
        
        for (int move : moves) {
            int idx = move - 1;
            while (board[depth[idx]][idx] == 0) {
                if (depth[idx] == board.length - 1) break;
                depth[idx]++;
            }
            if (board[depth[idx]][idx] == 0) continue;
            
            if (stack.empty() || stack.peek() != board[depth[idx]][idx]) {
                stack.push(board[depth[idx]][idx]);
                board[depth[idx]][idx] = 0;
            } else {
                stack.pop();
                board[depth[idx]][idx] = 0;
                cnt += 2;
            }
            
            if (depth[idx] < board.length - 1) depth[idx]++;
        }
        
        return cnt;
    }
}