class Solution {
    public void solve(char[][] board) {
        if (board.length <= 2 || board[0].length <= 2) {
            return;
        }

        for (int i = 0; i < board.length; ++i) {
            this.changeChar(board, i, 0);
            this.changeChar(board, i, board[0].length - 1);
        }

        for (int i = 0; i < board[0].length; ++i) {
            this.changeChar(board, 0, i);
            this.changeChar(board, board.length - 1, i);
        }

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void changeChar(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return;
        }
        if (board[i][j] == 'X' || board[i][j] == '*') {
            return;
        }

        board[i][j] = '*';
        this.changeChar(board, i + 1, j);
        this.changeChar(board, i - 1, j);
        this.changeChar(board, i, j + 1);
        this.changeChar(board, i, j - 1);
    }
}
