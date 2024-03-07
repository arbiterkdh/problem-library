class Solution {
    public int solution(int[][] board) {
        int[][] fakeBoard = new int[board.length+2][board[0].length+2];
        int size = board.length*board[0].length;
        int answer = 0;
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                if(board[i][j]==1){
                    fakeBoard[i][j] =1;
                    fakeBoard[i][j+1] =1;
                    fakeBoard[i][j+2] =1;
                    fakeBoard[i+1][j] =1;
                    fakeBoard[i+1][j+1] =1;
                    fakeBoard[i+1][j+2] =1;
                    fakeBoard[i+2][j] =1;
                    fakeBoard[i+2][j+1] =1;
                    fakeBoard[i+2][j+2] =1;
                }
            }
        }
        for(int i = 1; i<board.length+1;i++){
            for(int j = 1; j<board.length+1;j++){
                if(fakeBoard[i][j]==1){
                    answer++;
                }
            }
        }

        
        
        return size - answer;
    }
}