class Solution {
    public int solution(String[][] board, int h, int w) {
        String[][] board2 = new String[board.length+2][board[0].length+2];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board2[i + 1][j + 1] = board[i][j];
            }
        }
        
        int cnt = 0;
        
        if (board[h][w].equals(board2[h][w + 1])) {
            cnt++;
        }
        if (board[h][w].equals(board2[h + 2][w + 1])) {
            cnt++;
        }
        if (board[h][w].equals(board2[h + 1][w])) {
            cnt++;
        }
        if (board[h][w].equals(board2[h + 1][w + 2])) {
            cnt++;
        }
            
        return cnt;
    }
}